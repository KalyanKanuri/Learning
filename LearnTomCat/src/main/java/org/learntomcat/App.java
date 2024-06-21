package org.learntomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tc = new Tomcat();
        tc.setPort(8080);

        StandardContext ctx = (StandardContext) tc.addContext("", null);
        tc.addServlet("", "tc", new TCServlet());
        ctx.addServletMappingDecoded("/test", "tc");

        tc.start();
        tc.getServer().await();
    }
}
