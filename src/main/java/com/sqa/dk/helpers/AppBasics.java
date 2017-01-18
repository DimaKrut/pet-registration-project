/**
 *   File Name: AppBasics.java<br>
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
 * AppBasics //ADDD (description of class)
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
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param userName
	 * @param appName
	 */
	public static void farewellMessage(String userName, String appName) {
		System.out.println(" Thank you for using " + appName + " \n Have a great day, " + userName);

	}

	/**
	 * @param name
	 * @return
	 */
	public static String greetUserAndGetName(String name) {
		System.out.println("Hello, Welcome to the " + name + " App.\n");
		System.out.print(" May I get your name?");
		return scanner.nextLine();
	}

	/**
	 * @param string
	 * @return
	 */
	public static String requestInfoFromUser(String myQuestion) {
		System.out.print(myQuestion + " ");
		return scanner.nextLine();
	}

	/**
	 * @return
	 */
	public static String requestMoodFromUser() {
		System.out.print("What is your current mood? ");
		return scanner.nextLine();
	}

}