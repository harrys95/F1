package cs5800f;

public class Painter extends Employee{
    public Painter() {
        this.authorityLevel = Employee.PAINTER;// get authority level painter
    }

	   @Override
	   protected void write(String message) {		
	      System.out.println( message + "car completed");// message is car completed
	   }

}
