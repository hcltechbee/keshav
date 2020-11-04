/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.service.impl;

import com.cdi.service.HelloWorld;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hppc--
 */
@RequestScoped
public class HelloWorldImpl implements HelloWorld {
    
    @Override
    public String sayHello() {
        return "HELLO EVERYONE";
    }
    
    
}
