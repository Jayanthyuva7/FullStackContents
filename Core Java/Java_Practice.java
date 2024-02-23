Widening Casting

public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}

////////////////////
Narrowing Casting

Example 
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////

For Loop

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

/////////////////
While Loop

Int i = 1; // 101111 101110 10111110 01 1010101
while (i <= 5) {
    System.out.println(i);
    i++;
}
//////////////////
Do-While Loop

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
////////////////////
Conditional Statements
if-else

int number = 7;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

////////////////
switch-case
The switch-case statement simplifies multiple conditional statements. It checks a variable against various possible values. Here's an example that determines the day of the week based on an integer input:
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    // ... More cases ...
    default:s
        System.out.println("Invalid day");
}
////////////////////////////////////////////////////////////////////////////////////////////////////////

Single Inheritance



class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class B extends A
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     B obj = new B();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}

///////////////////////

Multilevel Inheritance

class X
{
   public void methodX()
   {
     System.out.println("class X method");
   }
}
class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
class Z extends Y
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}

////////////////////

Hierarchical Inheritance

class A
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
class Javajava
{
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A

     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
Polymorphism

Method Overloading: changing no. of arguments:

class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[ ] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}} 

///////////////
2) Method Overloading: changing data type of arguments:

class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b)
{
return a+b;
}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}}  
//////////////////

Method Overriding:

class Vehicle{  
void run( ){
System.out.println("Vehicle is running");
}  
}  
class Bike2 extends Vehicle{  
void run( ){
System.out.println("Bike is running safely");
}  
public static void main(String args[ ]){  
Bike2 obj = new Bike2( );  
obj.run( );  
}  

///////////////////////////////////////////////////////////////////////////////////////////////////////

Java final variable

class Bike9{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}//end of class  
Test it Now
Output:Compile Time Error
/////////////////

2) Java final method
If you make any method as final, you cannot override it.

Example of final method
class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  
Test it Now
Output:Compile Time Error

/////////////////////
3) Java final class
If you make any class as final, you cannot extend it.

Example of final class
final class Bike{}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
}  
Test it Now
Output:Compile Time Error

////////////////////////////////////////////////////////////////////////////////////////////////////

Java static variable

Example of static variable
class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to show the values of objects  
public class TestStaticVariable1{  
 public static void main(String args[]){  
 Student s1 = new Student(111,"Karan");  
 Student s2 = new Student(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //Student.college="BBDIT";  
 s1.display();  
 s2.display();  
 }  
}  
Test it Now
Output:

111 Karan ITS
222 Aryan ITS
/////////////////////////////
Java static method

class Student{  
     int rollno;  
     String name;  
     static String college = "ITS";  
     //static method to change the value of static variable  
     static void change(){  
     college = "BBDIT";  
     }  
     //constructor to initialize the variable  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
public class TestStaticMethod{  
    public static void main(String args[]){  
    Student.change();//calling change method  
    //creating objects  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    Student s3 = new Student(333,"Sonoo");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  
Test it Now
Output:111 Karan BBDIT
       222 Aryan BBDIT
       333 Sonoo BBDIT
 ///////////////////////

3) Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.
Example of static block
class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  
Test it Now
Output:static block is invoked
       Hello main
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

1) super is used to refer immediate parent class instance variable.
We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}  
Test it Now
Output:
/////////////////////////

2) super can be used to invoke parent class method
The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  
Test it Now
Output:

eating...
barking...
///////////////////
3) super is used to invoke parent class constructor.

class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
super();  
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
Dog d=new Dog();  
}}  
Test it Now
Output:

animal is created
dog is created
//////////////////////////////////////////////////////////////////////////////////////////////////////

1.this: to refer current class instance variable

class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f); 
s1.display();  
s2.display();  
}}  
Output:
111 ankit 5000
112 sumit 6000

//////////////////////////
2.this: to invoke current class method
 
class A{  
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  
}  
}  
class TestThis4{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}}  

Output:
hello n
hello m

////////////////
3.this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
Calling default constructor from parameterized constructor:
class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
}}  
Output:
hello a
10
Calling parameterized constructor from default constructor:
class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
System.out.println(x);  
}  
}  
class TestThis6{  
public static void main(String args[]){  
A a=new A();  
}}  

Output:
5
hello a
//////////////////////////////
4.this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. lets see the example:
class B{  
  A4 obj;  
  B(A4 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
class A4{  
  int data=10;  
  A4(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   A4 a=new A4();  
  }  
}  

Output:10
/////////////////////////////////
5.this keyword can be used to return current class instance
We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive). lets see the example:
Syntax of this that can be returned as a statement
return_type method_name(){  
return this;  
}  
Example of this keyword that you return as a statement from the method
class A{  
A getA(){  
return this;  
}  
void msg(){
System.out.println("Hello java");
}  
}  
class Test1{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  
Output:
Hello java

//////////////////////////////////////////////////////////////////////////////////////////////////////////

 Encapsulation in Java

public class Student{  
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name  
}  
}  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
} 

//////////////////////////////////////////////////////////////////////////////////////////////////////////
Abstract Method


abstract class Bike{  
  abstract void run();  
}  
public class Honda4 extends Bike{  
void run()
{
  System.out.println("running safely..");
}  
public static void main(String args[]){  
Bike obj = new Honda4();  
obj.run();  
}  
}

///////////////////

Interface

interface printable{  
void print();  
}  
class A6 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
}  
}  

Output:
Hello

/////////////////////////////////////////////////////////////////////////////////////////////////////

Single Dimensional Array

Syntax to Declare an Array in java:

dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];  

Instantiation of an Array in java:

arrayRefVar=new datatype[size];  

class Testarray{  

public static void main(String args[ ]){  
int a[ ]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}
  }  
Output:
10
20
70
40
50
////////////////////
We can declare, instantiate and initialize the java array together by:

int a[]={33,3,4,5};//declaration, instantiation and initialization  

lets see the simple example to print this array.

class Testarray1{  
public static void main(String args[]){  
  
int a[]={33,3,4,5};//declaration, instantiation and initialization  
  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
  
}
}  
Output:
33
3
4
5

////////////////////
Multidimensional Array in Java

int[][] arr=new int[3][3];//3 row and 3 column  
Example to initialize Multidimensional Array in Java
arr[0][0]=1;  
arr[0][1]=2;  
arr[0][2]=3;  
arr[1][0]=4;  
arr[1][1]=5;  
arr[1][2]=6;  
arr[2][0]=7;  
arr[2][1]=8;  
arr[2][2]=9;  

Example of Multidimensional Java Array
lets see the simple example to declare, instantiate, initialize and print the 2Dimensional array.
//Java Program to illustrate the use of multidimensional array  
class Testarray3{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
//printing 2D array  
for(int i=0;i<3;i++){  
        for(int j=0;j<3;j++){  
System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  
Output:
1 2 3
2 4 5
4 4 5
Three Dimentional Array
class GFG { 
    public static void main(String[] args) 
    { 
  
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } }; 
  
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                for (int z = 0; z < 2; z++) 
                    System.out.println("arr[" + i 
                                       + "]["
                                       + j + "]["
                                       + z + "] = "
                                       + arr[i][j][z]); 
    } 
}
Output:
arr[0][0][0] = 1
arr[0][0][1] = 2
arr[0][1][0] = 3
arr[0][1][1] = 4
arr[1][0][0] = 5
arr[1][0][1] = 6
arr[1][1][0] = 7
arr[1][1][1] = 8
/////////////////////////////
Simple example of 3d Array
package Evening;
import Morg.First;
public class Third extends First{
  public static void main(String[] args) {
    String[ ] department = {"Electronics", "CS", "IT"};
     int dept, st, sc, total = 0;
     double perc = 0;

    // Take the scores of students in a 3D array.
        int[ ][ ][ ] scores = {
                            {{75, 87, 69}, {90, 87, 85},{56, 67, 76}}, 
                            {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}}, 
                            {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}
                           };
    // Display the scores of students from 3D array.
       for(dept = 0; dept < 3; dept++)
       {  
      for(int i = 0; i < 3; i++)
      {
       System.out.println("Department " +department[i]+ ": "); 
       for(st = 0; st < 3; st++)
       {
         System.out.println("Student" +(st + 1)+ " scores: ");   
         for(sc = 0; sc < 3; sc++)
         {
         System.out.print(scores[dept][st][sc]+ " ");
         total += scores[dept][st][sc];
         perc = (double)total/3;
         }
         System.out.println("\nTotal scores: " +total); // Displaying total marks of student.
         System.out.println("Percentage: " +perc); // Displaying percentage. 
         System.out.println();
         System.out.println("---------------------");
         System.out.println();
         total = 0; // reset total to zero.
       }
       System.out.println();
       }
      break;
      }
  }
  }
//////////////////

 Array Methods 
 
 0. Declare an array
int a[];
a=new int[40];
String[] aArray = new String[5];
String[] bArray = {"a","b","c", "d", "e"};
String[] cArray = new String[]{"a","b","c","d","e"};
//////////
1. Print an array in Java
int[] intArray = { 1, 2, 3, 4, 5 };
String intArrayString = Arrays.toString(intArray);
 
// print directly will print reference value
System.out.println(intArray);
// [I@7150bd4d
 
System.out.println(intArrayString);
// [1, 2, 3, 4, 5]
/////////////////
2. Create an ArrayList from an array

String[] stringArray = { "a", "b", "c", "d", "e" };

ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));

System.out.println(arrayList);
// [a, b, c, d, e]

3. Check if an array contains a certain value

String[] stringArray = { "abc", "bcd", "cba", "dcb", "efg" };

boolean b = Arrays.asList(stringArray).contains("abc");
System.out.println(b);
// true


4. Concatenate two arrays

int[] intArray = { 1, 2, 3, 4, 5 };
int[] intArray2 = { 6, 7, 8, 9, 10 };
// Apache Commons Lang library
int a[] = ArrayUtils.addAll(intArray, intArray2);

String s = Arrays.toString(a);

System.out.println(s);

//1,2,3,4,5,6,7,8,9,10


6. Joins the elements of the provided array into a single String
// containing the provided list of elements
// Apache common lang
String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
System.out.println(j);
// a, b, c


7. Covnert an ArrayList to an array
String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
String[] stringArr = new String[arrayList.size()];
arrayList.toArray(stringArr);
for (String s : stringArr)
  System.out.println(s);


8. Convert an array to a set
String[] s1 = { "a", "b", "c", "d", "e",”a” };

Set<String> set123 = new HashSet<String>(Arrays.asList(s1));
System.out.println(set123);
//[d, e, b, c, a]

9. Reverse an array
int[] intArray = { 1, 2, 3, 4, 5 };
ArrayUtils.reverse(intArray);
System.out.println(Arrays.toString(intArray));
//[5, 4, 3, 2, 1]

10. Remove element of an array
int[] intArray = { 1, 2, 3, 4, 5 };
int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
System.out.println(Arrays.toString(removed));

////////////////////////
COPYING AN ARRAY:
1. USING ARRAYCOPY() METHOD:
Example:
  public class ArrayCopying {
    public static void main(String[] args) {
        int Source[] = {5,6,7,8,9,10};

        int Destination[] = new int[5];

        System.arraycopy(Source, 1, Destination, 0, 5);
        System.out.print(Arrays.toString(Destination));

}
}
  
OUTPUT:
[6, 7, 8, 9, 10]


2. USING COPYOF() AND COPYOFRANGE() METHOD:

EXAMPLE:
  public class ArrayCopying {
    public static void main(String[] args) {
        int Source[] = {5,6,7,8,9,10};
 
        int Destination[] = java.util.Arrays.copyOf(Source, 8);//0 is padded for index beyond source
 
        System.out.println(Arrays.toString(Destination));
 
        int Destination2[] = java.util.Arrays.copyOfRange(Source, 0, 5);
 
        System.out.println(Arrays.toString(Destination2));
 
    }
}
OUTPUT:
[5, 6, 7, 8, 9, 10, 0, 0] [5, 6, 7, 8, 9]
////////////////////////////////////////s                                  
Write a Java program to sort a numeric array and a string array.
 
import java.util.Arrays; 
public class Exercise1 {
public static void main(String[] args){   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            
    String[] my_array2 = {
            "Java",
      
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);

    }
}
  
/////////////////////////////////////////////////////////////////////////////////////////////////////

String Methods

Java String toUpperCase() and toLowerCase() method
The java string toUpperCase() method converts this string into uppercase letter and string toLowerCase() method into lowercase letter.
String s="Sachin";  
System.out.println(s.toUpperCase());//SACHIN  
System.out.println(s.toLowerCase());//sachin  
System.out.println(s);//Sachin(no change in original)  
Output:
SACHIN
sachin
Sachin
Java String trim() method
The string trim() method eliminates white spaces before and after string.
String s="  Sachin is a cricket player  ";  
System.out.println(s);//  Sachin    
System.out.println(s.trim());//Sachin  

Output:
Sachin  
Sachin
Java String startsWith() and endsWith() method
String s="Sachin";  
 System.out.println(s.startsWith("Sa"));//true  
 System.out.println(s.endsWith("N"));//false
Output:
true
true
Java String charAt() method
The string charAt() method returns a character at specified index.
String s="Sachin Ten";  
System.out.println(s.charAt(0));//S  
System.out.println(s.charAt(3));//h  
Output:
S
h
Java String length() method
The string length() method returns length of the string.
String s="Sachin";  
System.out.println(s.length());//6  
Output:

6
Java String intern() method
A pool of strings, initially empty, is maintained privately by the class String.
When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
String s=new String("Sachin");  

String s2=s.intern();  

System.out.println(s2);//Sachin  
Output:
Sachin
Java String valueOf() method
The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
int a=10;  
String s=String.valueOf(a);  
System.out.println(s+10);  
Output:
1010
Java String replace() method
The string replace() method replaces all occurrence of first sequence of character with second sequence of character.
String s1="Java is a programming language. Java is a platform. Java is an Object oriented and simple language";    
String replaceString=s1.replace("Java","Python");//replaces all occurrences of "Java" to "Python"    
System.out.println(replaceString);    
Output:
Kava is a programming language. Kava is a platform. Kava is an Island.

String Concatenation by + (string concatenation) operator
Java string concatenation operator (+) is used to add strings. For Example:
class TestStringConcatenation1{  
 public static void main(String args[]){  
   String s="Sachin"+" Tendulkar";  
   System.out.println(s);//Sachin Tendulkar  
 }  
}  

Output:
Sachin Tendulkar

String Concatenation by concat() method
The String concat() method concatenates the specified string to the end of current string. Syntax:
public String concat(String another)  
Lets see the example of String concat() method.
class TestStringConcatenation3{  
 public static void main(String args[]){  
   String s1="Sachin ";  
   String s2="Tendulkar";  
   String s3=s1.concat(s2);  
   System.out.println(s3);//Sachin Tendulkar  
  }  
}  
Output:
Sachin Tendulkar


String compare by equals() method
The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods:
public boolean equals(Object another) compares this string to the specified object.
public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.
class Teststringcomparison1{  
 public static void main(String args[]){  
            String s1="Sachin";  
       String s2=new String("Sachin");  
       String s3="Saurav";  
       
       System.out.println(s1.equals(s2));//”true” because values are same
       System.out.println(s1.equals(s3)); //object reference is not same even values are not same for “false” 
}  
}  
Output:
true
true
false

String compare by == operator
The = = operator compares references not values.
class Teststringcomparison3{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 }  
}  

Output:
true
false
String compare by compareTo() method
The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
Suppose s1 and s2 are two string variables. If:
s1 == s2 :0
s1 > s2   :positive value (1)
s1 < s2   :negative value (-1)

class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  
 
Output:
0
1
-1




Java String replaceAll() example: replace character
Lets see an example to replace all the occurrences of a single character.
public class ReplaceAllExample1{  
public static void main(String args[]){  
String s1="java by Edubridge is a very good E-Learning Platform";  
String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
System.out.println(replaceString);  
}}  

O/P:
jevetpoint is e very good website

Java String split() method example
The given example returns total number of words in a string excluding space only. It also includes special characters.
public class SplitExample{  
public static void main(String args[]){  
String s1="java string split method by javatpoint";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}  
O/P:
java
string
split
method
by
javatpoint
________________________________________


Java String split() method

public class SplitExample2{  
public static void main(String args[]){  
String s1="welcome to split world";  
System.out.println("returning words:");  
for(String w:s1.split("\\s",0)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}  
  
}}  
O/P:
returning words:
welcome 
to 
split 
world
returning words:
welcome to split world
returning words:
welcome 
to split world
//////////////////////////////////////////////////////////////////////////////////////////////////////

Java Exception Handling Example

public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e)
{
System.out.println(e);
}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  
Output:
Exception in thread main java.lang.ArithmeticException:/ by zero
rest of the code...
///////////////////
Common Scenarios of Java Exceptions

int a=50/0;//ArithmeticException  
///////////////////
String s=null;  
System.out.println(s.length());//NullPointerException  
///////////////////////
String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
/////////////////////

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  
///////////////////////
FileNotFound Exception

//Java program to demonstrate FileNotFoundException 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
 class File_notFound_Demo { 
  
    public static void main(String args[])  { 
        try { 
            // Following file does not exist 
            File file = new File("E://file.txt"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"); 
        } 
    } 
} 
Output:
File does not exist
//////////////////////
StringIndexOutOfBound Exception

// Java program to demonstrate StringIndexOutOfBoundsException 
class StringIndexOutOfBound_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "This is like chipping "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
} 
Output:
StringIndexOutOfBoundsException

/////////////////////////
Java try-catch block
Problem without exception handling
lets try to understand the problem if we don't use a try-catch block.
Example 1
public class TryCatchExample1 {  
  
    public static void main(String[] args) {  
 int data=50/0; //may throw exception   
          
        System.out.println("rest of the code");  
          
    }  
      
}  
Output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
////////////////////////////
Solution by exception handling
Example 2
public class TryCatchExample2 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
Output:
java.lang.ArithmeticException: / by zero
rest of the code

////////////////////////

public class TryCatchExample5 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
             // handling the exception  
        catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Can't divided by zero");  
        }  
    }  
      
}  
Output:
Cant divided by zero
//////////////////////////////
public class TryCatchExample6 {  
  
    public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j; //may throw exception   
        }  
            // handling the exception  
        catch(Exception e)  
        {  
             // resolving the exception in catch block  
            System.out.println(i/(j+2));  
        }  
    }  
}  

Output:
25
/////////////////////////////////////
Java catch multiple exceptions
Example 1
Lets see a simple example of java multi-catch block.
public class MultipleCatchBlock1 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }     
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
Output:
Arithmetic Exception occurs
rest of the code
///////////////////////////
Example 3
In this example, try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is invoked.
public class MultipleCatchBlock3 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];  
                System.out.println(a[10]);  
  
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  

Output:
Arithmetic Exception occurs
rest of the code

////////////////

Example 3

public class MultipleCatchBlock4 {  
  
    public static void main(String[] args) {  
          
           try{    
                String s=null;  
                System.out.println(s.length());  
               }    
               catch(ArithmeticException e)  
                  {  
                 System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
Output:
Parent Exception occurs
rest of the code
/////////////////////////
Lets see an example, to handle the exception without maintaining the order of exceptions
 (i.e. from most specific to most general).
class MultipleCatchBlock5{    
  public static void main(String args[]){    
   try{    
    int a[]=new int[5];    
    a[5]=30/0;    
   }    
   catch(Exception e){System.out.println("common task completed");}    
   catch(ArithmeticException e){System.out.println("task1 is completed");}    
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
   System.out.println("rest of the code...");    
 }    
}    
Output:
Compile-time error

///////////////////////////////////
Java Nested try block
The try block within a try block is known as nested try block in java.
Why use nested try block
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.
Syntax:
....  
try  
{  
    statement 1;  
    statement 2;  
    try  
    {  
        statement 1;  
        statement 2;  
    }  

    catch(Exception e)  
    {  
    }  
}  
catch(Exception e)  
{  
}  
/////////////////////////////
Java nested try example
Lets see a simple example of java nested try block.
class Excep6{  
 public static void main(String args[]){  
  try{  
    try{  
     System.out.println("going to divide");  
     int b =39/0;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    System.out.println("other statement");  
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  
 }  
}  


////////////////////////////
Java finally block
 

Case 1
lets see the java finally example where exception doesnt occur.
class TestFinallyBlock{  
  public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  
Output:5
finally block is always executed
rest of the code...
//////////////////////////////

lets see the java finally example where exception occurs and handled.
public class TestFinallyBlock2{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(Exception e){System.out.println(“done”);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  
Test it Now
Output:
Exception in thread main java.lang.ArithmeticException:/ by zero
finally block is always executed
rest of the code...

/////////////////////////

Throw Keyword
 
The Java throw keyword is used to explicitly throw an exception.

We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception. We will see custom exceptions later.



public class TestThrow1{  
   static void validate(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }  
} 



Output:
Welcome to the Registration process!!Exception in thread "main" 
java.lang.ArithmeticException: Student is not eligible for registration
at beginnersbook.com.ThrowExample.checkEligibilty(ThrowExample.java:9)
at beginnersbook.com.ThrowExample.main(ThrowExample.java:18)

//////////////////////

Throws Keyword

Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.



import java.io.IOException;  
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  



Output:
exception handled
normal flow...

///////////////////////////

Throw
public class JavaTester{
   public void checkAge(int age){
      if(age<18)
         throw new ArithmeticException("Not Eligible for voting");
      else
         System.out.println("Eligible for voting");
   }
   public static void main(String args[]){
      JavaTester obj = new JavaTester();
      obj.checkAge(13);
      System.out.println("End Of Program");
   }
}
Output
Exception in thread "main" java.lang.ArithmeticException:
Not Eligible for voting
at JavaTester.checkAge(JavaTester.java:4)
at JavaTester.main(JavaTester.java:10)

////////////////////////
Throws

Example
JavaTester.java
public class JavaTester{
   public int division(int a, int b) throws ArithmeticException{
      int t = a/b;
      return t;
   }
   public static void main(String args[]){
      JavaTester obj = new JavaTester();
      try{
         System.out.println(obj.division(15,0));
      }
      catch(ArithmeticException e){
         System.out.println("You shouldn't divide number by zero");
      }
   }
}
Output
You shouldnt divide number by zero

///////////////////////////////////////////////////////////////////////////////////////////////////////

Multithreading - Default Methods

import java.util.Scanner;

public class First {
  public static void main(String args[]) {

    // object creation for thread classes
    Numeric num = new Numeric();
    Alpha alp = new Alpha();

    // start the thread
    num.start();
    alp.start();

    // get the name of the thread
    System.out.println("Number Thread : "+num.getName());
    System.out.println("Alphabets Thread : "+alp.getName());

    // get the priority
    System.out.println("Number Thread : "+num.getPriority());
    System.out.println("Alphabets Thread : "+alp.getPriority());

    // check the state of the thread
    System.out.println("Number Thread : "+num.getState());
    System.out.println("Alphabets Thread : "+alp.getState());

    // checking the current thread
    System.out.println(Thread.currentThread().getName());

    // set the name to thread
    num.setName("Number Thread");
    alp.setName("Alphabets Thread");

    // check the state of the thread
    System.out.println("Number Thread : "+num.getState());
    System.out.println("Alphabets Thread : "+alp.getState());

    // checking whether its alive or not

    if (num.isAlive()) {
      System.out.println("Number thread is Alive");
    } else {
      System.out.println("Num Thread is dead");
    }

    if (alp.isAlive()) {
      System.out.println("Alphabets thread is Alive");
    } else {
      System.out.println("Alphabets Thread is dead");
    }

  }

}

class Numeric extends Thread {
  int a = 0;

  public void run() {

    try {
      for (int i = 0; i <= 10; i++) {
        a++;
        System.out.println("Numeric Thread : " + a);
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

class Alpha extends Thread {
  char a = 'A';

  public void run() {
    try {
      for (int i = 0; i <= 25; i++) {

        System.out.println("Alpha Thread : " + a);
        a++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

///////////////////////////

Multithreading - Sleep Method

import java.io.*;
import java.util.Scanner;

public class First {
  public static void main(String args[]) {
    // object creation for thread classes
    Minute num = new Minute();
    Seconds alp = new Seconds();

    // start the thread
    num.start();
    alp.start();
  
  }

}

class Minute extends Thread {
  int a = 0;

  public void run() {

    try {
      for (int i = 0; i <= 59; i++) {
        try {
        System.out.println("Minutes : " + a);
        a++;
        Thread.sleep(60000);
        }
        catch(Exception e) {
          System.out.println(e);
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

class Seconds extends Thread {
  int a=0;

  public void run() {
    try {
      for (int i = 0; i <= 59; i++) {

        try {
        System.out.println("Seconds :" + a);
        a++;
        Thread.sleep(1000);
        }
        catch(Exception e) {
          System.out.println("Issues in Minutes Thread class");
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

/////////////////////////////

Multithreading - Join 

import java.io.*;
import java.util.Scanner;

public class First {
  public static void main(String args[]) {
    // object creation for thread classes
    Numeric num = new Numeric();
    Alpha alp = new Alpha();

    // start the thread
    num.start();
    
      try {
        num.join();
      } catch (InterruptedException e) {
        
        e.printStackTrace();
      }
    
    
    alp.start();
  
  }

}

class Numeric extends Thread {
  int a = 0;

  public void run() {

    try {
      for (int i = 0; i <= 10; i++) {
        
        System.out.println("Numeric Thread : " + a);
        a++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}

class Alpha extends Thread {
  char a = 'A';

  public void run() {
    try {
      for (int i = 0; i <= 25; i++) {

        System.out.println("Alpha Thread : " + a);
        a++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////
Collections

ArrayList

import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Ravi
Vijay
Ravi
Ajay
/////////////////////////////////

Ways to iterate the elements of the collection in Java
There are various ways to traverse the collection elements:
1.  By Iterator interface.
2.  By for-each loop.
3.  By ListIterator interface.
4.  By for loop.
5.  By forEach() method.
6.  By forEachRemaining() method.


Iterating Collection through remaining ways

import java.util.*;  
class ArrayList4{  
 public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
           list.add("Ravi");//Adding object in arraylist  
           list.add("Vijay");  
           list.add("Ravi");  
           list.add("Ajay");  
            
           System.out.println("Traversing list through List Iterator:");  
           
//Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  

              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  


        System.out.println("Traversing list through for loop:");  
           for(int i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
//basic iterator way

Iterator<String> i= list.iterator ();   while(i.hasNext())  {     System.out.println(i.next());   }


        System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  
                

            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr=list.iterator();  
              itr.forEachRemaining(a - > //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });  
 }  
}  
Output:
Traversing list through List Iterator:
Ajay
Ravi
Vijay
Ravi
Traversing list through for loop:
Ravi
Vijay
Ravi
Ajay
Traversing list through forEach() method:
Ravi
Vijay
Ravi
Ajay
Traversing list through forEachRemaining() method:
Ravi
Vijay
Ravi
Ajay
//////////////////////////////////////////////

Speed Test Between ArrayList Vs LinkedList
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;  
public class Encapsulation{  
     
          public static void main(String[] args){  
              long startTime = System.currentTimeMillis();  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
                for (int i=0; i<100000; i++){  
           list.add("Ravi");
           list.add("jayanth");
           list.remove(0);
           
        }  
        System.out.println("Time taken by ArrayList: " +
        (System.currentTimeMillis() - startTime) + "ms");  
        //------------------------------------------------------------
          startTime = System.currentTimeMillis();  
        LinkedList<String> ll=new LinkedList<String>();  
           for (int i=0; i<100000; i++){  
             ll.add("Ravi");
             ll.add("jayanth");
             ll.remove(0);
        }  
        System.out.println("Time taken by LinkedList: " + 
        (System.currentTimeMillis() - startTime) + "ms");  
            }   

  }  
  
//////////////////////
LinkedList

Consider the following example.
import java.util.*;  
public class TestJavaCollection2{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Ravi
Vijay
Ravi
Ajay

/////////////////
Java LinkedList example to add elements

import java.util.*;  
public class LinkedList2{  
 public static void main(String args[]){  
 LinkedList<String> ll=new LinkedList<String>();  
           System.out.println("Initial list of elements: "+ll);  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           System.out.println("After invoking add(E e) method: "+ll);  
           //Adding an element at the specific position  
           ll.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+ll);  
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Sonoo");  
           ll2.add("Hanumat");  
           //Adding second list elements to the first list  
           ll.addAll(ll2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
           LinkedList<String> ll3=new LinkedList<String>();  
           ll3.add("John");  
           ll3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           ll.addAll(1, ll3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
           //Adding an element at the first position  
           ll.addFirst("Lokesh");  
           System.out.println("After invoking addFirst(E e) method: "+ll);  
           //Adding an element at the last position  
           ll.addLast("Harsh");  
           System.out.println("After invoking addLast(E e) method: "+ll);  
             
 }  
}  
//////////////////////////////

Java LinkedList example to remove elements
Here, we see different ways to remove an element.
import java.util.*;  
public class LinkedList3 {  
  
        public static void main(String [] args)  
        {  
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           ll.add("Anuj");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Virat");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Amit");  
           System.out.println("Initial list of elements: "+ll);  
         //Removing specific element from arraylist  
              ll.remove("Vijay");  
              System.out.println("After invoking remove(object) method: "+ll);   
         //Removing element on the basis of specific position  
              ll.remove(0);  
              System.out.println("After invoking remove(index) method: "+ll);   
              LinkedList<String> ll2=new LinkedList<String>();  
              ll2.add("Ravi");  
              ll2.add("Hanumat");  
         // Adding new elements to arraylist  
              ll.addAll(ll2);  
              System.out.println("Updated list : "+ll);   
         //Removing all the new elements from arraylist  
              ll.removeAll(ll2);  
              System.out.println("After invoking removeAll() method: "+ll);   
         //Removing first element from the list  
              ll.removeFirst();  
              System.out.println("After invoking removeFirst() method: "+ll);  
          //Removing first element from the list  
              ll.removeLast();  
              System.out.println("After invoking removeLast() method: "+ll);  
          //Removing first occurrence of element from the list  
              ll.removeFirstOccurrence("Gaurav");  
              System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
          //Removing last occurrence of element from the list  
              ll.removeLastOccurrence("Harsh");  
              System.out.println("After invoking removeLastOccurrence() method: "+ll);  
  
              //Removing all the elements available in the list       
              ll.clear();  
              System.out.println("After invoking clear() method: "+ll);   
       }  
    }                   
/////////////////////////////

Java LinkedList Example to reverse a list of elements

1.  import java.util.*;  
2.  public class LinkedList4{  
3.   public static void main(String args[]){  
4.    
5.    LinkedList<String> ll=new LinkedList<String>();  
6.             ll.add("Ravi");  
7.             ll.add("Vijay");  
8.             ll.add("Ajay");  
9.             //Traversing the list of elements in reverse order  
10.            Iterator i=ll.descendingIterator();  
11.            while(i.hasNext())  
12.            {  
13.                System.out.println(i.next());  
14.            }  
15.              
16.  }  
17. }  
Output: Ajay
Vijay
Ravi

//////////////////
Vector

Consider the following example.
import java.util.*;  
public class TestJavaCollection3{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Ayush
Amit
Ashish
Garima
Stack

////////////////

Java ArrayList example to add elements
Here, we see different ways to add an element.
import java.util.*;  
 class ArrayList7{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
           System.out.println("Initial list of elements: "+al);  
           //Adding elements to the end of the list  
           al.add("Ravi");  
           al.add("Vijay");  
           al.add("Ajay");  
           System.out.println("After invoking add(E e) method: "+al);  
           //Adding an element at the specific position  
           al.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+al);  
           ArrayList<String> al2=new ArrayList<String>();  
           al2.add("Sonoo");  
           al2.add("Hanumat");  
           //Adding second list elements to the first list  
           al.addAll(al2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
           ArrayList<String> al3=new ArrayList<String>();  
           al3.add("John");  
           al3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           al.addAll(1, al3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
             
 }  
}  

//////////////////////////////
Java ArrayList example to remove elements
Here, we see different ways to remove an element.
import java.util.*;  
 class ArrayList8 {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");   
          al.add("Anuj");  
          al.add("Gaurav");  
          System.out.println("An initial list of elements: "+al);   
          //Removing specific element from arraylist  
          al.remove("Vijay");  
          System.out.println("After invoking remove(object) method: "+al);   
          //Removing element on the basis of specific position  
          al.remove(0);  
          System.out.println("After invoking remove(index) method: "+al);   
            
          //Creating another arraylist  
          ArrayList<String> al2=new ArrayList<String>();    
          al2.add("Ravi");    
          al2.add("Hanumat");    
          //Adding new elements to arraylist  
          al.addAll(al2);  
          System.out.println("Updated list : "+al);   
          //Removing all the new elements from arraylist  
          al.removeAll(al2);  
          System.out.println("After invoking removeAll() method: "+al);   
          //Removing elements on the basis of specified condition  
          al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
          System.out.println("After invoking removeIf() method: "+al);  
          //Removing all the elements available in the list  
          al.clear();  
          System.out.println("After invoking clear() method: "+al);   
       }  
    }                   
Output:
An initial list of elements: [Ravi, Vijay, Ajay, Anuj, Gaurav]
After invoking remove(object) method: [Ravi, Ajay, Anuj, Gaurav]
After invoking remove(index) method: [Ajay, Anuj, Gaurav]
Updated list : [Ajay, Anuj, Gaurav, Ravi, Hanumat]
After invoking removeAll() method: [Ajay, Anuj, Gaurav]
After invoking removeIf() method: [Anuj, Gaurav]
After invoking clear() method: []
/////////////////////

Java ArrayList example of retainAll() method
import java.util.*;  
class ArrayList9{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ravi");  
  al2.add("Hanumat");  
  al.retainAll(al2);  
  System.out.println("iterating the elements after retaining the elements of al2");  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
Output:
       iterating the elements after retaining the elements of al2
       Ravi

       ////////////////////////////
Java ArrayList example of isEmpty() method
import java.util.*;  
 class ArrayList10{  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
          System.out.println("After Insertion");  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());   
       }  
    }      
Output:
Is ArrayList Empty: true
After Insertion
Is ArrayList Empty: false

///////////////////////////////

Set Interface
Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
Set can be instantiated as:
Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  
HashSet
HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
Consider the following example.
import java.util.*;  
public class TestJavaCollection7{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Vijay
Ravi
Ajay
/////////////////////////

LinkedHashSet
LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.
Consider the following example.
import java.util.*;  
public class TestJavaCollection8{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Ravi
Vijay
Ajay
/////////////////////////

SortedSet Interface
SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
The SortedSet can be instantiated as:
1.  SortedSet<data-type> set = new TreeSet();  
TreeSet
Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
Consider the following example:
import java.util.*;  
public class TestJavaCollection9{  
public static void main(String args[]){  
//Creating and adding elements  
TreeSet<String> set=new TreeSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
Output:
Ajay
Ravi
Vijay
////////////////////////
Map

Java HashMap Example
Lets see a simple example of HashMap to store key and value pair.
1.  import java.util.*;  
2.  public class HashMapExample1{  
3.   public static void main(String args[]){  
4.     HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
5.     map.put(1,"1@.");  //Put elements in Map  
6.     map.put(2,"Apple");    
7.     map.put(3,"Banana");   
8.     map.put(4,"Grapes");   
9.         
10.    System.out.println("Iterating Hashmap...");  
11.    for(Map.Entry m : map.entrySet()){    
12.     System.out.println(m.getKey()+" "+m.getValue());    
13.    }  
14. }  
15. }  
Iterating Hashmap...
1 Mango
2 Apple
3 Banana
4 Grapes

/////////////////////////
import java.util.*;  
public class HashMapExample2{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes"); //trying duplicate key  
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
1.  }  
Test it Now
Iterating Hashmap...
1 Grapes
2 Apple
3 Banana
Java HashMap example to add() elements
Here, we see different ways to insert elements.
1.  import java.util.*;  
2.  class HashMap1{  
3.   public static void main(String args[]){  
4.     HashMap<Integer,String> hm=new HashMap<Integer,String>();    
5.      System.out.println("Initial list of elements: "+hm);  
6.        hm.put(100,"Amit");    
7.        hm.put(101,"Vijay");    
8.        hm.put(102,"Rahul");   
9.         
10.       System.out.println("After invoking put() method ");  
11.       for(Map.Entry m:hm.entrySet()){    
12.        System.out.println(m.getKey()+" "+m.getValue());    
13.       }  
14.         
15.       hm.putIfAbsent(103, "Gaurav");  
16.       System.out.println("After invoking putIfAbsent() method ");  
17.       for(Map.Entry m:hm.entrySet()){    
18.            System.out.println(m.getKey()+" "+m.getValue());    
19.           }  
20.       HashMap<Integer,String> map=new HashMap<Integer,String>();  
21.       map.put(104,"Ravi");  
22.       map.putAll(hm);  
23.       System.out.println("After invoking putAll() method ");  
24.       for(Map.Entry m:map.entrySet()){    
25.            System.out.println(m.getKey()+" "+m.getValue());    
26.           }  
27.  }  
28. }  
Initial list of elements: {}
After invoking put() method 
100 Amit
101 Vijay
102 Rahul
After invoking putIfAbsent() method 
100 Amit
101 Vijay
102 Rahul
103 Gaurav
After invoking putAll() method 
100 Amit
101 Vijay
102 Rahul
103 Gaurav
104 Ravi
///////////////////////////
Java HashMap example to remove() elements
Here, we see different ways to remove elements.
1.  import java.util.*;  
2.  public class HashMap2 {  
3.     public static void main(String args[]) {  
4.      HashMap<Integer,String> map=new HashMap<Integer,String>();          
5.        map.put(100,"Amit");    
6.        map.put(101,"Vijay");    
7.        map.put(102,"Rahul");  
8.        map.put(103, "Gaurav");  
9.      System.out.println("Initial list of elements: "+map);  
10.     //key-based removal  
11.     map.remove(100);  
12.     System.out.println("Updated list of elements: "+map);  
13.     //value-based removal  
14.     map.remove(101);  
15.     System.out.println("Updated list of elements: "+map);  
16.     //key-value pair based removal  
17.     map.remove(102, "Rahul");  
18.     System.out.println("Updated list of elements: "+map);  
19.    }      
20. }  
Output:
Initial list of elements: {100=Amit, 101=Vijay, 102=Rahul, 103=Gaurav}
Updated list of elements: {101=Vijay, 102=Rahul, 103=Gaurav}
Updated list of elements: {102=Rahul, 103=Gaurav}
Updated list of elements: {103=Gaurav}

/////////////////////////

Java HashMap example to replace() elements
Here, we see different ways to replace elements.
1.  import java.util.*;  
2.  class HashMap3{  
3.   public static void main(String args[]){  
4.     HashMap<Integer,String> hm=new HashMap<Integer,String>();    
5.        hm.put(100,"Amit");    
6.        hm.put(101,"Vijay");    
7.        hm.put(102,"Rahul");   
8.        System.out.println("Initial list of elements:");  
9.       for(Map.Entry m:hm.entrySet())  
10.      {  
11.         System.out.println(m.getKey()+" "+m.getValue());   
12.      }  
13.      System.out.println("Updated list of elements:");  
14.      hm.replace(102, "Gaurav");  
15.      for(Map.Entry m:hm.entrySet())  
16.      {  
17.         System.out.println(m.getKey()+" "+m.getValue());   
18.      }  
19.      System.out.println("Updated list of elements:");  
20.      hm.replace(101, "Vijay", "Ravi");  
21.      for(Map.Entry m:hm.entrySet())  
22.      {  
23.         System.out.println(m.getKey()+" "+m.getValue());   
24.      }   
25.      System.out.println("Updated list of elements:");  
26.      hm.replaceAll((k,v) -> "Ajay");  
27.      for(Map.Entry m:hm.entrySet())  
28.      {  
29.         System.out.println(m.getKey()+" "+m.getValue());   
30.      }  
31.  }  
32. }  
Initial list of elements:
100 Amit
101 Vijay
102 Rahul
Updated list of elements:
100 Amit
101 Vijay
102 Gaurav
Updated list of elements:
100 Amit
101 Ravi
102 Gaurav
Updated list of elements:
100 Ajay
101 Ajay
102 Ajay

/////////////////////////////////////////////////////////////////////////////////////////////////

JDBC

import java.sql.*;
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  //Register
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/MyWish","root","root");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(“went wrong”);}  
}  
}  


///////////////////////

JAVA MySQL Create Read Update Delete CRUD Project

First create a new database ‘crud’ in Mysql. Then create a table ‘user’
CREATE TABLE `user` (
  `sl_no` INT(5) NULL DEFAULT NULL,
  `name` VARCHAR(100) NULL DEFAULT NULL,
  `email` VARCHAR(100) NULL DEFAULT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

Project Structure in Eclipse IDE
 
Connection Class to get connection with MySql
DB_Connection.java
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
public class DB_Connection {
public static void main(String[] args) {
  DB_Connection obj_DB_Connection=new DB_Connection();
  System.out.println(obj_DB_Connection.get_connection());
}
public Connection get_connection(){
 Connection connection=null;
try {
  Class.forName("com.mysql.jdbc.Driver");              
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root", "root");
} catch (Exception e) {
  System.out.println(e);
}
  return connection;
}
}

CRUD_Test.java
package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CRUD_Test {

public static void main(String[] args) {
  CRUD_Test objTest=new CRUD_Test();
        //insert data
  objTest.create_data("1", "jinu", "jinu@gmail.com");
  objTest.create_data("2", "jawad", "jawad@gmail.com");
        //read data
  objTest.read_data("2");
        //update data
  objTest.update_data("2", "22", "jawad2", "jawad2@gmail");
        //delete data
  objTest.delete_data("1");
}

public void create_data(String sl_no,String name,String email){
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try {
    String query="insert into user(sl_no,name,email) values (?,?,?)";
    ps=connection.prepareStatement(query);
    ps.setString(1, sl_no);
    ps.setString(2, name);
    ps.setString(3, email);
    System.out.println(ps);
    ps.executeUpdate();
  } catch (Exception e) {
    System.out.println(e);
  }
}

public void read_data(String sl_no){
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  ResultSet rs=null;
  try {
    String query="select * from user";
    ps=connection.prepareStatement(query);
    //ps.setString(1, sl_no);
    System.out.println(ps);
    rs=ps.executeQuery();
    while(rs.next()){
    System.out.println("Sl no -"+rs.getString("sl_no"));
    System.out.println("name -"+rs.getString("name"));
    System.out.println("email -"+rs.getString("email"));
    System.out.println("---------------");
    }
  } catch (Exception e) {
    System.out.println(e);
  }
}

public void update_data(String sl_no,String new_sl_no,String name,String email){
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try {
    String query="update user set sl_no=?,name=?,email=? where sl_no=?";
    ps=connection.prepareStatement(query);
    ps.setString(1, new_sl_no);
    ps.setString(2, name);
    ps.setString(3, email);
    ps.setString(4, sl_no);
    System.out.println(ps);
    ps.executeUpdate();
  } catch (Exception e) {
    System.out.println(e);
  }
}

public void delete_data(String sl_no){
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try {
    String query="delete from user where sl_no=?";
    ps=connection.prepareStatement(query);
    ps.setString(1, sl_no);
    System.out.println(ps);
    ps.executeUpdate();
  } catch (Exception e) {
    System.out.println(e);
  }

}
}

//////////////////////////////////////////////////////////////////////////////////////////////////







