package org.mybatis.generator.extend;

import org.mybatis.generator.api.ShellRunner;

public class MyTestRun {

    public static void main(String[] args) {
        String config = MyTestRun.class.getClassLoader().getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);
    }

}
