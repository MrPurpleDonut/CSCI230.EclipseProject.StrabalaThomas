package edu.csbsju.cs;

public class SimplePrint {

	
	public SimplePrint() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Aidan Thomas and James Strabala");
		
		for(int i=0; i<args.length;i++){ 
		    System.out.println("args[ " + i + " ] = " + args[i] ); 
		} 

	}

}
