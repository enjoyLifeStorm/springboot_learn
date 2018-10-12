package com.didispace.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lifestorm on 2018/9/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTest2 {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test1() throws Exception {
        System.out.println(blogProperties.getName());
        System.out.println(blogProperties.getTest2());
    }
}
