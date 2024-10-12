package com.emard;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");
        var tomcat = new Tomcat();
        tomcat.setPort(8080);

        var context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "h1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "h1");

        tomcat.start();
        tomcat.getServer().await();

    }
}
