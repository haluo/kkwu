package com.szc;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhufeng on 15-2-27.
 */
public class BaseTest {
    protected Logger log = Logger.getLogger(this.getClass());
    protected static ApplicationContext appContext;

    @BeforeClass
    public static void setUp() throws Exception {
        try {
            long start = System.currentTimeMillis();
            System.out.println("正在加载配置文件...");

            appContext =  new ClassPathXmlApplicationContext(new String[]{"app-include.xml"});
//                LocalCategoryManager localCategoryManager = (LocalCategoryManager)appContext.getBean("localCategoryManager");
//            localCategoryManager.initLocalCategory();
            System.out.println("配置文件加载完毕,耗时：" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(BaseTest.class.getResource("/"));
    }
    protected boolean setProtected() {
        return false;
    }

    @Before
    public void autoSetBean() {
        appContext.getAutowireCapableBeanFactory().autowireBeanProperties(this, DefaultListableBeanFactory.AUTOWIRE_BY_NAME, false);
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }
}
