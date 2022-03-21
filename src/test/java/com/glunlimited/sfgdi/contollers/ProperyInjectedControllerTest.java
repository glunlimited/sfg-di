package com.glunlimited.sfgdi.contollers;

import com.glunlimited.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProperyInjectedControllerTest {
    ProperyInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new ProperyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}