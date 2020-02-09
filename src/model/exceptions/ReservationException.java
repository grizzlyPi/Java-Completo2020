package model.exceptions;

public class ReservationException extends Exception{
	private static final long serialVersionUID = 1L;

	/*****************************************************************************
	 * Java - Exceptions. An exception (or exceptional event) is a problem that 
	 * arises during the execution of a program. 
	 * When an Exception occurs the normal flow of the program is disrupted and 
	 * the program/Application terminates abnormally, 
	 * which is not recommended, therefore, these exceptions are to be handled.
	 *****************************************************************************/
	
	public ReservationException(String msg) {
		super(msg);
	}
}