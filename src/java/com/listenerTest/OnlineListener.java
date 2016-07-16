package com.listenerTest;

import java.util.Hashtable;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineListener implements HttpSessionListener {

    @Override
    //@SuppressWarnings("unchecked")
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext application = session.getServletContext();
        String sessionID = session.getId();
        String user = (String) session.getAttribute("user");

        if (session.isNew()) {
            user=(user==null)?"游客":user;
            Map<String, String> online = (Map<String, String>) application.getAttribute("online");
           if (online == null) {
                   online = new Hashtable<String,String>();
            }
            online.put(sessionID, user);

            //online是一个全局的集合,每一个session来自一个用户,所以用户信息用session获取，最终放在全局集合里面
            application.setAttribute("online", online);

        }

    }

    @Override
    //会话结束时，消除该用户的信息
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext application = session.getServletContext();
        String sessionID = session.getId();
        Map<String, String> online = (Map<String, String>) application.getAttribute("online");
        if (online != null) {
            online.remove(sessionID);
        }
        //这个应该是对全局集合online操作完毕后，更新的操作？？？？
        application.setAttribute("online", online);

    }

}
