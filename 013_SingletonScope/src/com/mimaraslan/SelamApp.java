package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.
ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {	    
	   ApplicationContext context 
	   = new ClassPathXmlApplicationContext("beans.xml");
	   Selam nesne1 = (Selam) context.getBean("selam");

	   nesne1.setMesaj("G�zel g�ren, g�zel d���n�r." +
	   		"G�zel d���nen, hayat�ndan lezzet al�r.");
	   nesne1.goster();

	   Selam nesne2 = (Selam) context.getBean("selam");
	   nesne2.getMesaj(); 
	   nesne2.goster();
	}	
}
