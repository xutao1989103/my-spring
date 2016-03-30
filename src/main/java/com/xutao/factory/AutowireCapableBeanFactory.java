package com.xutao.factory;

import com.xutao.BeanDefinition;
import com.xutao.PropertyValue;

import java.lang.reflect.Field;

/**
 * Created by xtao on 2016/2/28.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
      try{
          Object bean = createBeanInstance(beanDefinition);
          applyPropertyValues(bean, beanDefinition);
          return bean;
      }catch (Exception e){
          e.printStackTrace();
      }
        return null;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception{
        for(PropertyValue pv: beanDefinition.getPropertValues().getPropertyValues()){
            Field declaredFiled = bean.getClass().getDeclaredField(pv.getName());
            declaredFiled.setAccessible(true);
            declaredFiled.set(bean,pv.getValue());
        }
    }
}
