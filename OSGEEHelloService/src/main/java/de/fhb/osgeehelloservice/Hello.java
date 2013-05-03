/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhb.osgeehelloservice;

import javax.ejb.Local;

/**
 *
 * @author MacYser
 */
@Local
public interface Hello {

	String sayHello(String name);
}
