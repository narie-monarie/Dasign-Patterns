# OOP CONCEPTS
- Objects
- Class
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

## Class
- A blueprint in which bjects are created from
- example

```java
public class Website {
   //fields (or instance variable)
   String webName;
   int webAge;

   // constructor
   Website(String name, int age){
      this.webName = name;
      this.webAge = age;
   }
   public static void main(String args[]){
      //Creating objects
      Website obj1 = new Website("beginnersbook", 11);
      Website obj2 = new Website("google", 28);

     //Accessing object data through reference
     System.out.println(obj1.webName+" "+obj1.webAge);
     System.out.println(obj2.webName+" "+obj2.webAge);
   }
}
```


## Objects
- objects are entities that have state and behaviour
    - States are data items can be represented by values
    - behaviour are like actions

- example
```java
class House {
   String address;
   String color;
   double area;

   void openDoor() {
      //Write code here
   }
   void closeDoor() {
      //Write code here
   }
 ...
 ...
}
```

## Abstraction
- Abstraction is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user
- example
```java
//abstract class
abstract class Animal{
   //abstract method
   public abstract void animalSound();
}
public class Dog extends Animal{

   public void animalSound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new Dog();
	obj.animalSound();
   }
}
```

## Encapsulation
- means binding object state(fields) and behaviour(methods) together

```java
class EmployeeCount{
   private int numOfEmployees = 0;
   public void setNoOfEmployees (int count){
       numOfEmployees = count;
   }
   public double getNoOfEmployees () {
       return numOfEmployees;
   }
}
public class EncapsulationExample{
   public static void main(String args[]){
      EmployeeCount obj = new EmployeeCount ();
      obj.setNoOfEmployees(5613);
      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
    }
}
```

## Inheritance
- This is where one class(base class) acquires the properties and functionalities of another class(super class)
- example
```java
class Teacher {
   String designation = "Teacher";
   String college = "Beginnersbook";
   void does(){
	System.out.println("Teaching");
   }
}
public class MathTeacher extends Teacher{
   String mainSubject = "Maths";
   public static void main(String args[]){
      MathTeacher obj = new MathTeacher();
      System.out.println(obj.college);
      System.out.println(obj.designation);
      System.out.println(obj.mainSubject);
      obj.does();
   }
}
```


### Types of Inheritance:

**Single Inheritance**: refers to a child and parent class relationship where a class extends the another class.

**Multilevel inheritance**: refers to a child and parent class relationship where a class extends the child class. For example class A extends class B and class B extends class C.

**Hierarchical inheritance**: refers to a child and parent class relationship where more than one classes extends the same class. For example, class B extends class A and class C extends class A.

**Multiple Inheritance**: refers to the concept of one class extending more than one classes, which means a child class has two parent classes. *Java doesn’t support multiple inheritance*

## Polymorphism
- is a object oriented programming feature that allows us to perform a single action in different ways
- example

```java
public abstract class Animal{
   ...
   public abstract void animalSound();
}

//and

public class Dog extends Animal{
...
    @Override
    public void animalSound(){
        System.out.println("Woof");
    }
}
```


# Other OOP concepts
- **Constructor** - Constructor is a block of code that initializes the newly created object
    - example
    ```java
    public class MyClass{
    //This is the constructor
        MyClass(){
        }
    ..
    }
    ...
    MyClass obj = new MyClass()
    ...
    ```
#### Types of constructors 
    
- Parametarized - constructor is passed and they have arguements
```java
public class Employee {
   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   Employee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	Employee obj1 = new Employee(10245,"Chaitanya");  
	Employee obj2 = new Employee(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}
```
- no args - constructor is set by the user but no arguements are passed

```java
class Demo{
    public Demo(){
        System.out.println("This is a no argument constructor");
    }
    public static void main(String args[]) {
    	new Demo();
    }
}
```
- Default - if not set, the java compiler will set for you


-  if you make a member static, you can access it without object