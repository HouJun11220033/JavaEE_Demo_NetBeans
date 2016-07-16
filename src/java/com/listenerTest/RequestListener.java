/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listenerTest;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        HttpServletRequest hsr = (HttpServletRequest) sre.getServletRequest();
        System.out.println("Send to" + hsr.getRequestURI());

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //ServletContext application=sre.getServletContext();
        HttpServletRequest hsr = (HttpServletRequest) sre.getServletRequest();
        System.out.println("Send to" + hsr.getRequestURI());

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent sre) {
        HttpServletRequest hsr = (HttpServletRequest) sre.getServletRequest();
        String name = sre.getName();
        Object value = sre.getValue();
        System.out.println(hsr+"范围内增加了:" + name + "值为:" + value);

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent sre) {
        HttpServletRequest hsr = (HttpServletRequest) sre.getServletRequest();
        String name = sre.getName();
        Object value = sre.getValue();
        System.out.println(hsr+"范围内Delete了:" + name + "值为:" + value);

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent sre) {
        HttpServletRequest hsr = (HttpServletRequest) sre.getServletRequest();
        String name = sre.getName();
        Object value = sre.getValue();
        System.out.println(hsr+"范围内Update了:" + name + "值为:" + value);

    }

}
