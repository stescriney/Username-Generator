public class usernameGenerator{
	
	
	
	
	private String givenName;
	private String userName;
	
	
	
	
	public usernameGenerator(){
		
	}
	
	
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	
	
	public String getUserName(){
		return userName;
	}
	
	
	
	public void generateUserName(){
		
		StringBuffer buff = new StringBuffer();
		
		int len = givenName.length();
		
		for(int i =0;i < len;i++){
			
			char n = givenName.charAt(i);
			
			
			switch (n){
				
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
				
					buff.append("");
					break;
				
				case ' ':
					buff.append(i+1);
					break;
					
				
				default:
					buff.append(n);
					break;
				
				
				}//close switch
			
			
			
			
			
			
		}//close for loop
		
			buff.append(len);
		
		userName = buff.toString();
		
		
	}
	
	
}