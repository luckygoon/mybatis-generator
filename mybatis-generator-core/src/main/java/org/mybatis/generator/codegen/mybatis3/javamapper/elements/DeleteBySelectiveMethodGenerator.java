package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DeleteBySelectiveMethodGenerator extends
        AbstractJavaMapperMethodGenerator {

    private boolean isSimple;

    public DeleteBySelectiveMethodGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getIntInstance());
        method.setName(introspectedTable.getDeleteBySelective());

        FullyQualifiedJavaType parameterType = introspectedTable.getRules()
                .calculateAllFieldsClass();
//       设置参数类型
        importedTypes.add(parameterType);
        method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$


        context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

        addMapperAnnotations(method);

        if (context.getPlugins().clientDeleteByPrimaryKeyMethodGenerated(
                method, interfaze, introspectedTable)) {
            addExtraImports(interfaze);
            interfaze.addImportedTypes(importedTypes);
            interfaze.addMethod(method);
        }
    }

    public void addMapperAnnotations(Method method) {
    }

    public void addExtraImports(Interface interfaze) {
    }
}
