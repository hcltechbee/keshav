package com.json;

import java.io.StringWriter;

import org.json.simple.JSONObject;

public class jsonencode {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // TODO Auto-generated method stub

 


        JSONObject obj = new JSONObject();

 

          try {
        	  	obj.put("name", "foo");
        	  	obj.put("num", new Integer(100));
        	  	obj.put("balance", new Double(1000.21));
        	  	obj.put("is_vip", new Boolean(true));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          

 

          System.out.print(obj);    
              
          
    }

 

}
