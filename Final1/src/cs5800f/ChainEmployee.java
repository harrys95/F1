package cs5800f;

/**
 *ChainEmployee class.
 */
public class ChainEmployee {
	public static void main(String[] args) {
	    /**
	     * ChainEmployee gets welder assembler parttcollector and painter and sends the authorization
	     * request to the chain.
	     */
	 

		Employee partcollector = new PartCollector();
		Employee assembler = new Assembler();
		Employee welder = new Welder();
		Employee painter = new Painter();
		partcollector.setNextEmployee(assembler);// use assemler after collecting parts
		assembler.setNextEmployee(welder);// use welder after assembling
		welder.setNextEmployee(painter);// use Painter after welding 
		
		int authorityLevel = 4;
		String message = "";// message to print with authority levels
		partcollector.doWork(authorityLevel, message);
		// print the level of authority with a message
		}
}
	   