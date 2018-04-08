package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.ListUtilities;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

public class DeleteBySelective extends
        AbstractXmlElementGenerator {

    public DeleteBySelective() {
        super();
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("delete"); //$NON-NLS-1$
//          添加select元素id名称(我们之前定义的枚举类名称)
        answer.addAttribute(new Attribute(
                "id", introspectedTable.getDeleteBySelective())); //$NON-NLS-1$


//
////        参数名称自己酌情添加
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

        //        添加参数类型
        FullyQualifiedJavaType parameterType = introspectedTable.getRules()
                .calculateAllFieldsClass();
        answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
                parameterType.getFullyQualifiedName()));

        context.getCommentGenerator().addComment(answer);


        StringBuilder sb = new StringBuilder();
        sb.append("delete from "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));

        XmlElement where = new XmlElement("where");

        for (IntrospectedColumn introspectedColumn : ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable
                .getAllColumns())) {
            sb.setLength(0);
            if (introspectedTable.getPrimaryKeyColumns().contains(introspectedColumn)) continue;
            sb.append("  and "); //$NON-NLS-1$


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
            where.addElement(conditionNotNullElement);
        }
        answer.addElement(where);
        parentElement.addElement(answer);
    }
}