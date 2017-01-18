/**
 *   File Name: BasicProject.java<br>
 *
 *   Krutikov, Dmitriy<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 14, 2017
 *   
 */

package com.sqa.dk.helpers;

import java.util.*;

/**
 * BasicProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Krutikov, Dmitriy
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicProject {

	static Scanner scanner = new Scanner(System.in);

	public static void doSomething() {
		AppBasics.requestMoodFromUser();
	}

	public static void main(String[] args) {
		String appName = "Basic Project";
		String name = AppBasics.greetUserAndGetName(appName);
		doSomething();
		AppBasics.farewellMessage(name, appName);
	}

}
