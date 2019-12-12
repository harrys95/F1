package cs5800f;

public class Assembler extends Employee{
	 public Assembler() {
	        this.authorityLevel = Employee.ASSEMBLER;// authority and assembler
	    }

	   @Override
	   protected void write(String message) {		
	      System.out.println( message + "Assembler- all parts have been together");// message from assembler
	   }
}
