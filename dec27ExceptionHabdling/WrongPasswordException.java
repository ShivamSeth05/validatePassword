/*
 * A class called Validator is given to you. Define the following for the class.
Method :
Name of the method : validatePassword
Modifiers: public
return Type : boolean
Arguments : String
Throw an userdefined exception "WrongPasswordException" in case the parameter fails for a
valid password.
A valid password must have
a. Atleast 1 capital letter
b. Atleast 2 small letters
c. Atleast 1 symbol
d. Atleast 1 number
e. Atleast size of 8
f. should not contain spaces
g. Number of small letter must be greater than number of capital letters
Create the class to represent a userdefined unchecked exception called
"WrongPasswordException". Generate all constructors from its superclass.
You may create a PasswordValidation class with main() to test the working of the above.
 */
package dec27ExceptionHabdling;

import java.util.Scanner;

public class WrongPasswordException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string =scanner.nextLine();
		Validator ob = new Validator();
		try {
			System.out.println(ob.validatePassword(string));
		} catch (Validator e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
