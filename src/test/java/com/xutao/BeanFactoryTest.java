package com.xutao;

import com.xutao.factory.AutowireCapableBeanFactory;
import com.xutao.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by xtao on 2016/2/28.
 */
public class BeanFactoryTest {

    @Test
    public void testBeanFactory(){
        //init
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition();
        //inject bean
        beanDefinition.setBeanClassName("com.xutao.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
        //get bean
        HelloWorldService service = (HelloWorldService) beanFactory.getBean("helloWorldService");
        service.hello();
    }

}
