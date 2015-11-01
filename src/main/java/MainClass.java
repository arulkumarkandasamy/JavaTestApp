
public class MainClass {
	
	public static void main(String args[]){
		
		ConcatString concatString = new ConcatString();
		String helloString = concatString.concat("Hello", "CICD");
		System.out.println(helloString);
	}

}
