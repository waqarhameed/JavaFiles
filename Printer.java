package singletonpattern;

public class Printer {
private static Printer pt=new Printer();
 
 private Printer(){
	 System.out.println("Print Massage");
 }
 
 public static Printer print_massage(){
	 return pt;
 }

 public static void main(String []args){
	
	 Printer.print_massage();	
	Printer.print_massage();
		}
		
	}

