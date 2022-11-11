package ch11.exception;

public class Test {
	
	public void apple() throws Exception{
		
		RuntimeException ex= new RuntimeException("Test apple()");
		throw ex;
		
	}
	
	public void banana() throws Exception{
		System.out.println("Test banana()");
		apple();
		
	}
}
