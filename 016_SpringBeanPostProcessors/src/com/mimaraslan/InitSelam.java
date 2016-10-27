package com.mimaraslan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor {

public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Ba�latma �ncesi : " + beanName);
		return bean; 
	}

public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Ba�latma Sonras� : " + beanName);
		return bean; 
	}

}

