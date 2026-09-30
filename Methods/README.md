Java Methods



This folder contains examples and practice programs related to Methods in Java.



What is a Method in Java?



A method is a block of code that performs a specific task. Methods help make programs more organized, reusable, and easier to understand.



Instead of writing the same code multiple times, we can define a method once and call it whenever we need it.



Basic Syntax

returnType methodName(parameters) {

&#x20;   // code to execute

}





Example:



public static void greet() {

&#x20;   System.out.println("Hello, World!");

}





Calling the method:



greet();



Types of Methods

1\. Method without Parameters

static void greet() {

&#x20;   System.out.println("Hello!");

}



2\. Method with Parameters

static void greet(String name) {

&#x20;   System.out.println("Hello " + name);

}





Calling:



greet("Samir");



3\. Method with Return Value

static int add(int a, int b) {

&#x20;   return a + b;

}





Calling:



int result = add(10, 20);

System.out.println(result);



Important Keywords



static - Allows a method to be called without creating an object.



void - Indicates that the method does not return a value.



return - Used to return a value from a method.



Parameters - Values passed into a method.



Arguments - Actual values supplied when calling a method.



Example Program

public class MethodsExample {



&#x20;   static int multiply(int a, int b) {

&#x20;       return a \* b;

&#x20;   }



&#x20;   public static void main(String\[] args) {

&#x20;       int result = multiply(5, 4);

&#x20;       System.out.println("Result: " + result);

&#x20;   }

}





Output:



Result: 20



Advantages of Methods



Code reusability



Reduces code duplication



Makes programs easier to understand



Makes debugging easier



Helps organize large programs



Makes code easier to maintain



Topics Covered



Method declaration



Method calling



Parameters and arguments



Return values



void methods



static methods



Methods with multiple parameters



Methods with and without return values



Purpose



This folder is created for learning and practicing Java methods through simple examples and programs.

