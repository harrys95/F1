package cs5800f;

public class Welder extends Employee{
	 public Welder() {
	        this.authorityLevel = Employee.WELDER;// authority welder 
	    }

	   @Override
	   protected void write(String message) {		
	      System.out.println( message + "all parts have been welded together");// status=message 
	   }

}
