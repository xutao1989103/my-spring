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
        //set property
        PropertValues propertValues = new PropertValues();
        propertValues.addPropertyValue(new PropertyValue("text","Hello world!!"));
        beanDefinition.setPropertValues(propertValues);
        //generate bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
        //get bean
        HelloWorldService service = (HelloWorldService) beanFactory.getBean("helloWorldService");
        service.hello();
    }

}
