package com.google.appengine.benchmark.webapp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author ludo
 */
public class ServletListener1 implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    
  }
}
