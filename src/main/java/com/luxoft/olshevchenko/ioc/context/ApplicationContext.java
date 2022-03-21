package com.luxoft.olshevchenko.ioc.context;


import com.luxoft.olshevchenko.ioc.io.BeanDefinitionReader;

public interface ApplicationContext {

    <T> T getBean(Class<T> clazz);

    <T> T getBean(String name, Class<T> clazz);

    <T> T getBean(String name);

    void setBeanDefinitionReader(BeanDefinitionReader beanDefinitionReader);
}
