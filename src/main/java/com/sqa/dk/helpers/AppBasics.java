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

import com.sqa.dk.helpers.exceptions.*;

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

	public static int requestIntFromUser(String question) {
		return requestIntFromUser(question, 0, 0);
	}

	public static int requestIntFromUser(String question, int min, int max) {
		String input;
		int result = 0;
		boolean isNotValid = true;
		while (isNotValid) {
			try {
				System.out.print(question + " ");
				input = scanner.nextLine();
				result = Integer.parseInt(input);
				if (min != 0 && max != 0) {
					if (result <= max && result >= min) {
						isNotValid = false;
					} else {
						throw new NumberNotInRangeException();
					}
				}
				isNotValid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct number value.");
			} catch (NumberNotInRangeException e) {
				System.out.println("You have not entered a number within the range of " + min + " and " + max + ".");
			}
		}
		return result;
	}

	/**
	 * @return
	 */
	public static String requestMoodFromUser() {
		System.out.print("What is your current mood? ");
		return scanner.nextLine();
	}
}