package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import org.mybatis.generator.api.dom.java.*;

import java.util.Set;
import java.util.TreeSet;

public class SelectAllColumnMethodGenerator extends
        AbstractJavaMapperMethodGenerator {

    private boolean isSimple;

    public SelectAllColumnMethodGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
//       导入 List library
        importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);

//       设置返回值类型
        FullyQualifiedJavaType returnType = FullyQualifiedJavaType
                .getNewListInstance();
        FullyQualifiedJavaType listType;
        listType = new FullyQualifiedJavaType(
                introspectedTable.getBaseRecordType());
        importedTypes.add(listType);
        returnType.addTypeArgument(listType);

//
//        FullyQualifiedJavaType parameterType = introspectedTable.getRules()
//                .calculateAllFieldsClass();
////       设置参数类型
//        importedTypes.add(parameterType);
//        method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$

//      设置方法名称
        method.setReturnType(returnType);
        method.setName(introspectedTable.getSelectAll());

        addMapperAnnotations(interfaze, method);
//      给接口添加方法
        if (context.getPlugins().clientSelectByPrimaryKeyMethodGenerated(
                method, interfaze, introspectedTable)) {
            addExtraImports(interfaze);
            interfaze.addImportedTypes(importedTypes);
            interfaze.addMethod(method);
        }
    }

    public void addMapperAnnotations(Interface interfaze, Method method) {
    }

    public void addExtraImports(Interface interfaze) {
    }
}
