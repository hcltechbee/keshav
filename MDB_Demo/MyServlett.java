package com.work.hard;

import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/MyServlett"})
public class MyServlett extends HttpServlet {

    @Resource(mappedName = "jmsdemo/keshavdest")
    private Queue demoKeshavdest;

    @Resource(mappedName = "jmsdemo/keshav")
    private ConnectionFactory queue;
    
  public void doGet(HttpServletRequest req,HttpServletResponse res)
  {
      try{
          String msge=req.getParameter("t1");
          PrintWriter out=res.getWriter();
          sendJMSMessageToKeshavdest(msge);
          out.println("NAME IS STORED");
      }catch (Exception e)
      {
          System.out.println(e); 
      }
  }

    private void sendJMSMessageToKeshavdest(String messageData) {
        
        try {
            Connection con=queue.createConnection();
            Session s= con.createSession();
            MessageProducer mp=s.createProducer(demoKeshavdest);
            TextMessage tm= s.createTextMessage();
            tm.setText(messageData);
            mp.send(tm);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

}
