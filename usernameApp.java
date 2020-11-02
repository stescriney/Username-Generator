import java.util.Scanner;


public class usernameApp{
	
	public static void main(String args[]){
		
		
	Scanner sc = new Scanner(System.in);
	usernameGenerator myGen = new usernameGenerator();
	
	//input
	String name;
	System.out.println("enter name");
	name = sc.nextLine();
	myGen.setGivenName(name);
	
	
	
	//process
	myGen.generateUserName();
	
	
	
	
	//output
	String login = myGen.getUserName();
	
	
	System.out.println("your password is " + login);
	
	
	}//close main
	
}//close class