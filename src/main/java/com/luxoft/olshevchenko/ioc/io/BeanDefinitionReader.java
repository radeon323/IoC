package com.luxoft.olshevchenko.ioc.io;


import com.luxoft.olshevchenko.ioc.entity.BeanDefinition;

import java.util.List;

public interface BeanDefinitionReader {

    List<BeanDefinition> getBeanDefinitions();

}
