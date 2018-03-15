package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.ListUtilities;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

public class SelectAllElementGenerator extends
        AbstractXmlElementGenerator {

    public SelectAllElementGenerator() {
        super();
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("select"); //$NON-NLS-1$
//          添加select元素id名称(我们之前定义的枚举类名称)
        answer.addAttribute(new Attribute(
                "id", introspectedTable.getSelectAll())); //$NON-NLS-1$
        if (introspectedTable.getRules().generateResultMapWithBLOBs()) {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getResultMapWithBLOBsId()));
        } else {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getBaseResultMapId()));
        }

//        参数名称自己酌情添加
//        String parameterType;
//        if (introspectedTable.getRules().generatePrimaryKeyClass()) {
//            parameterType = introspectedTable.getPrimaryKeyType();
//        } else {
//            // PK fields are in the base class. If more than on PK
//            // field, then they are coming in a map.
//            if (introspectedTable.getPrimaryKeyColumns().size() > 1) {
//                parameterType = "map"; //$NON-NLS-1$
//            } else {
//                parameterType = introspectedTable.getPrimaryKeyColumns().get(0)
//                        .getFullyQualifiedJavaType().toString();
//            }
//        }
//
//        answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
//               parameterType));

        context.getCommentGenerator().addComment(answer);

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


        parentElement.addElement(answer);
    }
}