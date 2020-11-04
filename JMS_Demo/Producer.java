/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.classes;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author hppc--
 */
@RequestScoped
public class Producer {
    @Inject 
     private JMSContext context;
    
     @Resource(mappedName="jms/MyQueue")
     private Queue myQueue;
     
     public void sendMessage(String payload)
     {
        context.createProducer().send(myQueue, payload);
     }
     
}
