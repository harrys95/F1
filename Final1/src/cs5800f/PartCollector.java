package cs5800f;

public class PartCollector extends Employee{
	public PartCollector() {
        this.authorityLevel = Employee.PART_COLLECTOR;// authority partcollector
    }

	   @Override
	   protected void write(String message) {		
	      System.out.println( message + "all parts have been gathered");// message
	   }

}
