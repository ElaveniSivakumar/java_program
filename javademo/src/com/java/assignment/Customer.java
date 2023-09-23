package com.java.assignment;

public class Customer {
	// Variables
	// 3 types
	// >>> 1. object / instances / normal variable

private char genderForM;
private String firstName;
private String lastName;
private Integer customerId;
private Double productPrice;
private String customerAddress;
private String mobileNo;

     // >>>> 2. static / class variable

private static String shopLocation ="THANJAVUR";

private static String shopWebsite;

// >>>> 3. static final variable

private final static String storeName = "'Fancy Fur World'";

/* Method*/

//>>> 1. object / instances / normal variable

// >>> 1.without return types [ we using (void) here. ]

public void setcustomerId(Integer customerId) {
	this.customerId=customerId;
}

// >>> 2.with return types [ we using (data type) here. eg: integer,string etc., ]

public Integer getcustomerId() {
	return(customerId);
}
// >>> Getter/Setter method 


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


public char getGenderForM() {
	return genderForM;
}

public void setGenderForM(char genderForM) {
	this.genderForM = genderForM;
}

public Double getProductPrice() {
	return productPrice;
}

public void setProductPrice(Double productPrice) {
	this.productPrice = productPrice;
}

public String getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

// >>> 2. static method
public  static String getShopLocation() {
	return shopLocation;
}
public static void setShopLocation(String shopLocation) {
	Customer.shopLocation = shopLocation;
}

// >>> 4. static block

static {
shopWebsite="www.fancyfurworld.com";	
}

public  static String getShopWebsite() {
	return shopWebsite;
}

// >>> 3. final static method 

public static String getStoreName() {
	return storeName;
}

//---------------------------------------------------------------------------------

// default constructor created by jvm
public Customer() {
	
}

//user defined constructor
 
public Customer(char genderForM, String firstName, String lastName, Integer customerId, Double productPrice,
		String customerAddress, String mobileNo) {
	super();
	this.genderForM = genderForM;
	this.firstName = firstName;
	this.lastName = lastName;
	this.customerId = customerId;
	this.productPrice = productPrice;
	this.customerAddress = customerAddress;
	this.mobileNo = mobileNo;

}






// >>>> main method
 
/*
 public static void main(String[] args)
 {
 
 }
 */
 public static void main(String[] args) {
	 // >>> print the variables using method
	 
	 // >>> creating the object 
	 
	Customer customerObj = new Customer();
	
	/* Default constructor >> Customer() >> public Customer(){} */
	
	
	// >>> Setting the value for setter method
	
	customerObj.setcustomerId(1001);
	
	// >>> getting the value for getter method [ print the values ]
	
	System.out.println("enter the customer id: "+customerObj.getcustomerId());
	customerObj.setGenderForM('F');
	System.out.println("enter the customer gender: "+customerObj.getGenderForM());
	customerObj.setFirstName("Elaveni");
	customerObj.setLastName("Sivakumar");
	System.out.println("enter the customer name: "+customerObj.getFirstName()+" " + customerObj.getLastName());
	customerObj.setCustomerAddress("Thiruppalathurai \n \t \t \t    Papanasam");
	System.out.println("enter the customer address: "+ customerObj.getCustomerAddress());
	customerObj.setMobileNo("9585245791");
	System.out.println("enter the customer mobile number: "+customerObj.getMobileNo());
	customerObj.setProductPrice(9999.0);
	System.out.println("enter the customer product price: "+customerObj.getProductPrice());
	// >>> here we using only getter method to print the value because this variable is already defined as a final static variable(refer line 20)
	
	System.out.println("Shop Name: "+ Customer.getStoreName()); // [final static variable is call by its class name] eg. Customer.getStoreName()
	
	// >>> static method call
	
		System.out.println("shop location: "+ getShopLocation());
		
	// >>> static block(print)
	System.out.println("Shop website: "+ Customer.getShopWebsite());
	System.out.println("---------------------------------------------------------------------------------");
//----------------------------------------------------------------------------------------------------------------	
	// user define constructor call
	

	Customer customeruserdefinedObj = new Customer('F',"sita","raman",1234,99999.0,"thanjavur","7896512345");
	System.out.println("enter the customer id: "+customeruserdefinedObj.getcustomerId());
	System.out.println("enter the customer gender: "+customeruserdefinedObj.getGenderForM());
	System.out.println("enter the customer name: "+customeruserdefinedObj.getFirstName()+" " + customeruserdefinedObj.getLastName());
	System.out.println("enter the customer address: "+ customeruserdefinedObj.getCustomerAddress());
	System.out.println("enter the customer mobile number: "+customeruserdefinedObj.getMobileNo());
	System.out.println("enter the customer product price: "+customeruserdefinedObj.getProductPrice());
	// >>> here we using only getter method to print the value because this variable is already defined as a final static variable(refer line 20)
	
	System.out.println("Shop Name: "+ Customer.getStoreName()); // [final static variable is call by its class name] eg. Customer.getStoreName()
	
	// >>> static method call
	
		System.out.println("shop location: "+ getShopLocation());
		
	// >>> static block(print)
	System.out.println("Shop website: "+ Customer.getShopWebsite());
 }

}
 