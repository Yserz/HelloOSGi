/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhb.osgeehelloserviceimpl;

import de.fhb.osgeehelloservice.Hello;
import javax.ejb.Stateless;

/**
 *
 * @author MacYser
 */
@Stateless
public class HelloImpl implements Hello {

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
