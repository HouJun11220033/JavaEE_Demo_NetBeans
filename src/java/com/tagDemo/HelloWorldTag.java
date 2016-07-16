/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tagDemo;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HelloWorldTag extends SimpleTagSupport{
    @Override
    public void doTag() throws IOException
    {
        getJspContext().getOut().write("HelloWorld!!!"+new Date());
    }

}
