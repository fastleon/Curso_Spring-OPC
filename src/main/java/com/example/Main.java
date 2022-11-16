package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Comando traido de la documentacion de Spring.io framework - Instanciar 1.2.2. Instantiating a Container

        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");
        //Creamos un objeto de tipo CalculatorService llamando la "bean" configurada en resources/beans.xml

        System.out.println(calculadora.holamundo());
        //llamamos el metodo de la clase del bean.
    }
}
