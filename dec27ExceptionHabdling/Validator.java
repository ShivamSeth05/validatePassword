package dec27ExceptionHabdling;



@SuppressWarnings("serial")
public class Validator extends Exception {
	public Validator(String msg) {
		super("Wrong Password");

	}
	public Validator() {
	}

	public boolean validatePassword(String pswd) throws Validator {
		int cps=0,sml=0,symbl=0,num=0,spc=0;
		for (int i = 0; i < pswd.length(); i++) {
			if(pswd.charAt(i)>'A'&&pswd.charAt(i)<'Z') cps++;
			else if(pswd.charAt(i)>'a'&&pswd.charAt(i)<'z') sml++;
			else if(pswd.charAt(i)>'0'&&pswd.charAt(i)<'9') num++;
			else if(pswd.charAt(i)==' ') spc++;
			else symbl++;
		}
		System.out.println(cps +" "+sml +" "+symbl +" "+num +" "+spc);
		if(!(cps>=1 && sml>=2 && symbl>=1 && num>=1 && pswd.length()>=8 && spc==0 && cps<sml)) 
			throw new Validator("Wrong Password");

		return true;

	}

}
