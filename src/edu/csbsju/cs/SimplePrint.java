package edu.csbsju.cs;

public class SimplePrint {

	
	private String pname;
	
	private int pAge;
	
	
	/**
	 * @param pname
	 * @param pAge
	 */
	public SimplePrint(String pname, int pAge) {
		this.pname = pname;
		this.pAge = pAge;
	}

	public SimplePrint() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Aidan Thomas and James Strabala are very cool guys");
		
		for(int i=0; i<args.length;i++){ 
		    System.out.println("args[ " + i + " ] = " + args[i] ); 
		} 

	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

}
