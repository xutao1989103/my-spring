package com.xutao.factory;

import com.xutao.BeanDefinition;

/**
 * Created by xtao on 2016/2/28.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try{
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
