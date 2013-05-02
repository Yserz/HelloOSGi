/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhb.osgeehellowebclient;

import de.fhb.osgeehelloservice.Hello;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.glassfish.osgicdi.OSGiService;

/**
 *
 * @author MacYser
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {

	@Inject
	@OSGiService(dynamic = true)
	Hello hello;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(hello.sayHello("Duke"));
	}
}
