package com.xutao.factory;

import com.xutao.BeanDefinition;

/**
 * Created by xtao on 2016/2/28.
 */
public interface BeanFactory {
    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
