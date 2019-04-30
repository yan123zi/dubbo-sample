package com.pxxy;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    /**
     * 代码生成实例代码
     */
    @org.junit.jupiter.api.Test
    public void testGenerator(){
        //全局配置
        GlobalConfig config=new GlobalConfig();
        config.setActiveRecord(true)
                .setAuthor("yzj")
                .setOutputDir("E:\\Study\\dubboSample\\dubbo-sample\\dubbo-databases\\src\\main\\java")//生成路径;
                .setFileOverride(true)//文件覆盖
                .setIdType(IdType.AUTO)//主键策略
                .setServiceName("%sService")//设置生成的service接口的名字的首字母是否为I
                .setBaseResultMap(true)//生成基本的resultMap
                .setBaseColumnList(true)//生成基本的sql片段
        ;
        //数据源配置
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql:///shop?useSSL=true")
                .setUsername("root")
                .setPassword("root")
        ;
        //策略配置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setCapitalMode(true)//全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//数据表映射到实体的命名策略
        //.setTablePrefix("tbl_")//设置表名的前缀
        ;
        //包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.pxxy")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("beans")
                .setXml("MyMapper");
        //整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setPackageInfo(packageConfig)
                .setStrategy(strategyConfig);
        //执行
        autoGenerator.execute();
    }
}
