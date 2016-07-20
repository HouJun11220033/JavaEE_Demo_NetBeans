

package com.spring.hellospring;


public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Message is:"+message);
        
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init()
    {
        System.out.println("Init. . . .");
    }
    public void destory()
    {
        System.out.println("Destory . . . . .");
    }

}
