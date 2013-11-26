package com.google.appengine.benchmark.webapp;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author ludo
 */
public class ServletListener2 implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    
  }

  @Override
  public void attributeAdded(ServletContextAttributeEvent event) {
     }

  @Override
  public void attributeRemoved(ServletContextAttributeEvent event) {
   }

  @Override
  public void attributeReplaced(ServletContextAttributeEvent arg0) {
   }

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void attributeAdded(HttpSessionBindingEvent event) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void attributeRemoved(HttpSessionBindingEvent event) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void attributeReplaced(HttpSessionBindingEvent event) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
