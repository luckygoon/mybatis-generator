package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;
import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.ListUtilities;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

public class SelectByConditionElementGenerator extends
        AbstractXmlElementGenerator {

    public SelectByConditionElementGenerator() {
        super();
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("select"); //$NON-NLS-1$
//       添加select元素名称
        answer.addAttribute(new Attribute(
                "id", introspectedTable.getSelectByConditionStatementId())); //$NON-NLS-1$
        if (introspectedTable.getRules().generateResultMapWithBLOBs()) {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getResultMapWithBLOBsId()));
        } else {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getBaseResultMapId()));
        }

//        添加参数类型
        FullyQualifiedJavaType parameterType = introspectedTable.getRules()
                .calculateAllFieldsClass();
        answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
                parameterType.getFullyQualifiedName()));


//          添加xml sql语句
        StringBuilder sb = new StringBuilder();
        sb.append("select "); //$NON-NLS-1$

        if (stringHasValue(introspectedTable
                .getSelectByPrimaryKeyQueryId())) {
            sb.append('\'');
            sb.append(introspectedTable.getSelectByPrimaryKeyQueryId());
            sb.append("' as QUERYID,"); //$NON-NLS-1$
        }
        answer.addElement(new TextElement(sb.toString()));
        answer.addElement(getBaseColumnListElement());
        if (introspectedTable.hasBLOBColumns()) {
            answer.addElement(new TextElement(",")); //$NON-NLS-1$
            answer.addElement(getBlobColumnListElement());
        }

        sb.setLength(0);
        sb.append("from "); //$NON-NLS-1$
        sb.append(introspectedTable
                .getAliasedFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));

        boolean and = false;
        for (IntrospectedColumn introspectedColumn : ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable
                .getAllColumns())) {
            sb.setLength(0);
            if(introspectedTable.getPrimaryKeyColumns().contains(introspectedColumn))continue;
            if (and) {
                sb.append("  and "); //$NON-NLS-1$
            } else {
                sb.append("where "); //$NON-NLS-1$
                and = true;
            }

            sb.append(MyBatis3FormattingUtilities
                    .getAliasedEscapedColumnName(introspectedColumn));
            sb.append(" = "); //$NON-NLS-1$
            sb.append(MyBatis3FormattingUtilities
                    .getParameterClause(introspectedColumn));

            StringBuffer ss = new StringBuffer();
            ss.append(introspectedColumn.getJavaProperty());
            ss.append(" != null"); //$NON-NLS-1$
            XmlElement conditionNotNullElement = new XmlElement("if"); //$NON-NLS-1$
            conditionNotNullElement.addAttribute(new Attribute(
                    "test", ss.toString())); //$NON-NLS-1$
            conditionNotNullElement.addElement(new TextElement(sb.toString()));
            answer.addElement(conditionNotNullElement);
        }

        parentElement.addElement(answer);
    }
}