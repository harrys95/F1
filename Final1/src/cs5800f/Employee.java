package cs5800f;
/**
 * Base Employee class.
 */
public abstract class Employee {
     /**
     * Builds chains of Employee types.
     */
	   public static int PART_COLLECTOR=1;  
	    public static int ASSEMBLER=2;  
	    public static int WELDER=3;
		public static int PAINTER=4;  
	    
	    protected int authorityLevel;  
	    protected Employee nextEmployee;  
	  //next employee in chain or responsibility
	    public void setNextEmployee(Employee employee) {  
	        this.nextEmployee = employee;  
	    }  
	        public void doWork(int authorityLevel, String message){  
	        if(this.authorityLevel<=authorityLevel){  
	            write(message);  
	        }  
	        if (nextEmployee!=null) {  
	            nextEmployee.doWork(authorityLevel, message);  
	        }  
	    }  
	    protected abstract void write(String message);  
	}  


