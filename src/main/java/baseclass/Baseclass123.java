
package baseclass;
 
public class Baseclass123 {
 
boolean flag = true;         // As a global variable define use in full class
 
public boolean browserlaunch(String browsername) {
	
System.out.println("browsername is" + browsername );   // Check parameter pass is right by sysout check
 
//1. Switch Case 1 Chrome
switch (browsername.trim().toLowerCase().toUpperCase()) {
case "Chrome":
System.out.println("browsername is" + browsername);	
break;
 
 
//2. Switch case 2 Firefox
case "Firefox":
System.out.println("browsername is" + browsername);
break;
 
default:
System.out.println("browsername is not availavle" + browsername);
flag = false;
break;
}
return flag;
}
 
public static void main(String[] args) {           // Main function
 
Baseclass123 BL = new Baseclass123();     // Object created
 
//BL.browserlaunch(" Chrome");
//BL.browserlaunch(" Firefox");                                                       
	
boolean execute = BL.browserlaunch(" Chrome");
System.out.println(execute);		
 
if(execute) {
System.out.println("browser is successfully launched");
}
 
else {
System.out.println("throw exception");
}
}
}
 
 