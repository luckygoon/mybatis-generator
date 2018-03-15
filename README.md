> 如果你使用本项目记得修改resources下的generatorConfig.xml文件的数据库驱动等配置 
>
> 本项目根据[mybatis-generator扩展教程系列](http://blog.csdn.net/shadowsick/article/details/53425831)学习
>
> [github地址](https://github.com/Vi-jay/mybatis-generator)

# mybatis generator模板详解

## 增加xml模板

- 打开`IntrospectedTable.java`找到enum InternalAttribute这个枚举定义增加一行我们的sql id ATTR_SELECT_ALL

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-c81c7a2dbf44ff3e..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

  - 在当前类下定义get set方法用于存取枚举类

    ![mark](http://upload-images.jianshu.io/upload_images/6383185-28f974fce5ff2f37..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

    ​


- 找到`IntrospectedTable.java`类的calculateXmlAttributes()方法,可以看到很多的setxxx方法带了具体的字符串参数,这个就是对应sql文件里面的sql id我们把对应的改改（给枚举值赋值）![mark](http://upload-images.jianshu.io/upload_images/6383185-45585b4df95ac7cb..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 新建一个xml sql生成的实现类SelectAllElementGenerator.java(在 org.mybatis.generator.codegen.mybatis3.xmlmapper.elements下创建)

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-bb59211c58d742dc..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 在`XMLMapperGenerator.java`中编写一个调用我们上面写的实现类方法,最后在getSqlMapElement()方法中调用

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-57a81db0b2721485..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**最终结果:**

![mark](http://upload-images.jianshu.io/upload_images/6383185-47a927259486ff33..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 增加Dao里的Mapper接口文件方法模板

- 在`JavaMapperGenerator.java`中增加addSelectAllMethod方法

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-bb43c093b6b78103..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 创建`SelectAllColumnMethodGenerator.java`在 org.mybatis.generator.codegen.mybatis3.javamapper.elements包下

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-cd2bae66375a8b31..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 在回到`JavaMapperGenerator.java`中getCompilationUnits方法下添加addSelectAllMethod(interfaze);

  ![mark](http://upload-images.jianshu.io/upload_images/6383185-a3611d4184122cde..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**结果:**

![mark](http://upload-images.jianshu.io/upload_images/6383185-54861baabe9de9dc..png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

大功告成!!!
