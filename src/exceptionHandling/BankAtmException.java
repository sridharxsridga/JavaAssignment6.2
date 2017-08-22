/*
 * User defined exception that will be created whenever withdrawal is done.
 */

package exceptionHandling;

public class BankAtmException extends Exception { //extending Exception class to create user defined exception

	BankAtmException(String message){
		super(message); //Constructs a new exception with the specified detail message.
	}
}
