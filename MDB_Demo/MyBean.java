
package com.keshav.mdb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jmsdemo/keshavdest"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MyBean implements MessageListener {
    
    public MyBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage msg=(TextMessage) message;
            System.out.println("Mr. "+msg.getText());
        } catch (JMSException ex) {
            Logger.getLogger(MyBean.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}

