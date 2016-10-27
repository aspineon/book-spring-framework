package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.
			AnnotationConfigApplicationContext;

import com.mimaraslan.config.MerkezAppConfig;

public class MerkezApp {

	public static void main(String[] args) {

		ApplicationContext context 
= new AnnotationConfigApplicationContext(MerkezAppConfig.class);

		A aNesnesi = (A) context.getBean("beana");
		aNesnesi.yaz("G�zel g�ren, g�zel d���n�r.");

		B bNesnesi = (B) context.getBean("beanb");
		bNesnesi.yaz("G�zel d���nen, hayat�ndan lezzet al�r.");

	}
}

