/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhb.osgeehelloserviceimpl;

import de.fhb.osgeehelloservice.Hello;

/**
 *
 * @author MacYser
 */
public class HelloImpl implements Hello {

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
