package com.java.demo.section2;

public class Assignment1 {
	private Integer rollno;
    private String name;
    private String fathername;
    private double percentage;
    private char grade;
    private boolean isGraduated;
    private static long mobileno; //static variable
    private final static String collegename  = "SASTRA"; //final static variable
    
    public void setRollno(Integer  number ) { 
    	this.rollno = number;
    }
    public Integer getRollno() {
       return this.rollno;
    }
   public static void mobileno(){ //static method
    	System.out.println(98765433);
    }
    public final static  void collegeweb() {
         System.out.println("website:www.sastra.com");
    }
    //default
    public Assignment1() {
    	
    }
   // User defined
    public Assignment1(String name,Integer rollno,String fathername,double percentage, char grade,boolean isGraduated,long mobileno) {	
    	this. name = name; 
    	this.rollno =rollno;
    	this.fathername = fathername;
    	this.percentage = percentage;
    	this.grade =  grade;
    	this.isGraduated = isGraduated;
    	this.mobileno = mobileno;
    }

    public static void main(String[] args) {
    	   Assignment1 indhraObj=new Assignment1(); //object r instance variable
    	   
    	  
    	   
    	   indhraObj.setRollno(1012);
    	   
    	   System.out.println("Roll no:"+indhraObj.getRollno());
    	    
    	//studentObj.rollno=1012;
    	   indhraObj.name="Indhra";
    	   indhraObj.fathername="Ramadass";
    	   indhraObj.percentage=89.02;
    	   indhraObj.grade='A';
    	   indhraObj.isGraduated=true;
    	//   indhraObj.mobileno=9751533125l;
    	
    Assignment1 abinayaObj = new Assignment1("Abhinaya",8902,"Baskaran",98.20,'B',false,6384162478l);
    
    	//method variable
 String studentDetails=indhraObj.name+" "+indhraObj.rollno+" "+indhraObj.fathername+" "+indhraObj.percentage+" "+indhraObj.grade+" "+indhraObj.isGraduated+" "+/*indhraObj.mobileno*/" "+indhraObj.collegename;
     
     System.out.println(studentDetails);
     System.out.println("*************************************************************");
     System.out.println(abinayaObj.name+" "+abinayaObj.rollno+" "+abinayaObj.fathername+" "+abinayaObj.percentage+" "+abinayaObj.grade+" "+abinayaObj.isGraduated+" "+/*abinayaObj.mobileno*/" "+abinayaObj.collegename);
       //  Student.mobileno();
           Assignment1.collegeweb();
      
	}
}
