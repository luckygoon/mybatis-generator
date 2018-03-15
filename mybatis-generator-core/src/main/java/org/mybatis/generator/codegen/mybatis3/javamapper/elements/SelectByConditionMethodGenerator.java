/**
 *    Copyright 2006-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class SelectByConditionMethodGenerator extends
        AbstractJavaMapperMethodGenerator {

    private boolean isSimple;

    public SelectByConditionMethodGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
//       Import List library
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


        FullyQualifiedJavaType parameterType = introspectedTable.getRules()
                .calculateAllFieldsClass();
//       设置参数类型
        importedTypes.add(parameterType);
        method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$


        method.setReturnType(returnType);
        method.setName(introspectedTable.getSelectByConditionStatementId());

        addMapperAnnotations(interfaze, method);

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
