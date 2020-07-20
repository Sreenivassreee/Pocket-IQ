package com.stevebrains.sreenivask.iq;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class java_questions extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.java_questions);

        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
        toolbar.setSubtitle("JAVA Interview Q 2020");


        //getting the recyclerview from xml
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //initializing the productlist
            productList = new ArrayList<>();


            //adding some items to our list
            productList.add(
                    new Quations_java(
                            1,
                            "Define Class in Java.",
                            "In Java, a class is a template used to create objects and define the data type. It acts as a building block for Java language-oriented systems.",
                            "1"
                          ));

            productList.add(
                    new Quations_java(
                            2,
                            "What Is the Difference Between Static and Dynamic Loading?",
                            "Static class loading involves the creation of objects and instances using new keywords, and dynamic class loading is done when the name of the class is not known at compile time.",
                            "2"));
            productList.add(
                    new Quations_java(
                            30,
                            "What Is Multi-Threading?",
                            "Multi-threading is a programming concept used to run multiple tasks in a concurrent manner within a single program." ,
                            "3"));

        productList.add(
                new Quations_java(
                        30,
                        "When and by Whom was Java Developed?",
                        "Java was developed by James Gosling in Sun Microsystem in 1995." ,
                        "4"));

        productList.add(
                new Quations_java(
                        30,
                        "What Do JDK, JRE, and JVM Stand for?",
                        "•    JVM stands for Java Virtual Machine\n" +
                                "\n" +
                                "•    JRE stands for Java Runtime Environment\n" +
                                "\n" +
                                "•    JDK stands for Java Development Kit" ,
                        "5"));

        productList.add(
                new Quations_java(
                        30,
                        "Does Java Use Pointers?",
                        "No. Java doesn’t use pointers. It has a tough security. Instead of pointers, references are used in Java as they are safer and more secure when compared to a pointer." ,
                        "6"));

        productList.add(
                new Quations_java(
                        30,
                        "How Do You Connect to a Database in Java?",
                        "The steps to connect to a database in Java are:\n" +
                                "\n" +
                                "•    Registering the driver class\n" +
                                "\n" +
                                "•    Creating connection\n" +
                                "\n" +
                                "•    Creating statement\n" +
                                "\n" +
                                "•    Executing queries\n" +
                                "\n" +
                                "•    Closing connection" ,
                        "7"));


        productList.add(
                new Quations_java(
                        30,
                        "What Are the Functions of JVM and JRE?",
                        "JVM provides a runtime environment for Java Byte Codes to be executed. JRE includes sets of files required by JVM during runtime." ,
                        "8"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is the Difference Between Overloading and Overriding?",
                        "When there are two methods of the same name but different properties, it is overloading. Overriding occurs when there are two methods of the same name and properties, one is in the child class and the other is in the parent class. Check out this post for a more in-depth analysis." ,
                        "9"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is the Default Size of the Load Factor in Hashing a Based Collection?",
                        "The default size is 0.75, and the default capacity is computed as:\n" +
                                "\n" +
                                "  Initial capacity * Load factor " ,
                        "10"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is a Package?",
                        "A package is a collection of related classes and interfaces." ,
                        "11"));

        productList.add(
                new Quations_java(
                        30,
                        "What's the Base Class of all Exception Classes?",
                        "  <<  Java.lang.Throwable >>   is the superclass of all exception classes, and all exception classes are derived from this base class." ,
                        "12"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is the Difference Between equals() and = =  ?",
                        "Equals() method is used for checking the equality of two objects defined by business logic.\n" +
                                "\n" +
                                " == or the equality operator is used to compare primitives and objects.\n" ,
                        "13"));

        productList.add(
                new Quations_java(
                        30,
                        "State Two Differences Between an Inner Class and a Subclass",
                        "While Inner classes are in the same file, subclasses can be in another file. With that in mind, while subclasses have the methods of their parent class, inner classes get the methods they want." ,
                        "14"));

        productList.add(
                new Quations_java(
                        30,
                        "How Are Destructors Defined in Java?",
                        "Since Java has its own garbage collection, no destructors are required to be defined.  Destruction of objects is automatically carried by the garbage collection mechanism." ,
                        "15"));

        productList.add(
                new Quations_java(
                        30,
                        "Define JSON.",
                        "JSON is an acronym for JavaScript Object Notation. It uses JavaScript syntax, and the format is text only." ,
                        "16"));

        productList.add(
                new Quations_java(
                        30,
                        "Name the Most Important Feature of Java",
                        "Java is a platform independent language." ,
                        "17"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is an Anonymous Class?",
                        "The class defined without a name in a single line of code using new keyword is known as an anonymous class." ,
                        "18"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is a JVM?",
                        "JVM is the Java Virtual Machine, which is a runtime environment for compiled Java class files." ,
                        "19"));

        productList.add(
                new Quations_java(
                        30,
                        "Can a Dead Thread Be Started Again?",
                        " No, a thread that is in the dead state can't be started again." ,
                        "20"));

        productList.add(
                new Quations_java(
                        30,
                        "Are Arrays of Primitive Data Types?",
                        "No. In Java, Arrays are objects." ,
                        "21"));

        productList.add(
                new Quations_java(
                        30,
                        "What Are Constructors in Java?",
                        "In Java, the constructor is a block of code used to initialize an object." ,
                        "22"));

        productList.add(
                new Quations_java(
                        30,
                        "Explain public static void main(String args[]) in Java.",
                        "main() in Java is the entry point for any Java program. It is always written as public static void main(String[] args).\n" +
                                "\n" +
                                "public: Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.\n" +
                                "\nstatic: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error as main() is called by the JVM before any objects are made and only static methods can be directly invoked via the class. \n" +
                                "\nvoid: It is the return type of the method. Void defines the method which will not return any value.\n" +
                                "\nmain: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.\n" +
                                "\nString args[]: It is the parameter passed to the main method." ,
                        "23"));

        productList.add(
                new Quations_java(
                        30,
                        "Why Java is platform independent?",
                        "Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying operating system." ,
                        "24"));

        productList.add(
                new Quations_java(
                        30,
                        "Why Java is not 100% Object-oriented?",
                        "Java is not 100% Object-oriented because it makes use of eight primitive data types such as boolean, byte, char, int, float, double, long, short which are not objects." ,
                        "25"));

        productList.add(
                new Quations_java(
                        30,
                        "What are wrapper classes in Java?",
                        "Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument." ,
                        "26"));

        productList.add(
                new Quations_java(
                        30,
                        "What are constructors in Java?",
                        "In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created. \n There are two types of constructors:\n" +
                                "\n" +
                                "\nDefault Constructor: In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default values. Also, it is majorly used for object creation. \n" +
                                "\nParameterized Constructor: The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors." ,
                        "27"));

        productList.add(
                new Quations_java(
                        30,
                        "What is singleton class in Java and how can we make a class singleton?",
                        "Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private." ,
                        "28"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the difference between equals() and == in Java?",
                        "Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.\n" +
                                "\n" +
                                "“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects." ,
                        "29"));

        productList.add(
                new Quations_java(
                        30,
                        "What is a package in Java? List down various advantages of packages.",
                        "Packages in Java, are the collection of related classes and interfaces which are bundled together. By using packages, developers can easily modularize the code and optimize its reuse. Also, the code within the packages can be imported by other classes and reused. Below I have listed down a few of its advantages:\n" +
                                "\n" +
                                "Packages help in avoiding name clashes\n" +
                                "They provide easier access control on the code\n" +
                                "Packages can also contain hidden classes which are not visible to the outer classes and only used within the package\n" +
                                "Creates a proper hierarchical structure which makes it easier to locate the related classes" ,
                        "30"));
        productList.add(
                new Quations_java(
                        30,
                        "Why pointers are not used in Java?",
                        "Java doesn’t use pointers because they are unsafe and increases the complexity of the program. Since, Java is known for its simplicity of code, adding the concept of pointers will be contradicting. Moreover, since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user,  pointers are discouraged in Java." ,
                        "31"));

        productList.add(
                new Quations_java(
                        30,
                        "What is JIT compiler in Java?  ",
                        "JIT stands for Just-In-Time compiler in Java. It is a program that helps in converting the Java bytecode into instructions that are sent directly to the processor. By default, the JIT compiler is enabled in Java and is activated whenever a Java method is invoked. The JIT compiler then compiles the bytecode of the invoked method into native machine code, compiling it “just in time” to execute. Once the method has been compiled, the JVM summons the compiled code of that method directly rather than interpreting it. This is why it is often responsible for the performance optimization of Java applications at the run time." ,
                        "32"));

        productList.add(
                new Quations_java(
                        30,
                        "Define a Java Class.",
                        "A class in Java is a blueprint which includes all your data.  A class contains fields (variables) and methods to describe the behavior of an object. Let’s have a look at the syntax of a class.\n" +
                                "\n" +

                                "class Abc {\n" +
                                "member variables // class body\n" +
                                "methods}\n" ,
                        "33"));

        productList.add(
                new Quations_java(
                        30,
                        "What is an object in Java and how is it created?",
                        "An object is a real-world entity that has a state and behavior. An object has three characteristics:\n" +
                                "\n" +
                                "State\n" +
                                "Behavior\n" +
                                "Identity\n" +
                                "An object is created using the ‘new’ keyword. For example:\n" +
                                "\n" +
                                "ClassName obj = new ClassName();" ,
                        "34"));

        productList.add(
                new Quations_java(
                        30,
                        "What is Object Oriented Programming?  ",
                        "Object-oriented programming or popularly known as OOPs is a programming model or approach where the programs are organized around objects rather than logic and functions. In other words, OOP mainly focuses on the objects that are required to be manipulated instead of logic. This approach is ideal for the programs large and complex codes and needs to be actively updated or maintained." ,
                        "35"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the main concepts of OOPs in Java?",
                        "Object-Oriented Programming or OOPs is a programming style that is associated with concepts like:\n" +
                                "\n" +
                                "Inheritance: Inheritance is a process where one class acquires the properties of another.\n" +
                                "\nEncapsulation: Encapsulation in Java is a mechanism of wrapping up the data and code together as a single unit.\n" +
                                "\nAbstraction: Abstraction is the methodology of hiding the implementation details from the user and only providing the functionality to the users. \n" +
                                "\nPolymorphism: Polymorphism is the ability of a variable, function or object to take multiple forms." ,
                        "36"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the difference between a local variable and an instance variable?",
                        "In Java, a local variable is typically used inside a method, constructor, or a block and has only local scope. Thus, this variable can be used only within the scope of a block. The best benefit of having a local variable is that other methods in the class won’t be even aware of that variable.\n" +
                                "\n" +
                                "Example\n" +
                                "\n" +

                                "if(x > 100)\n" +
                                "{\n" +
                                "String test = \"SteveBrains\";\n" +
                                "}\n" +
                                " \n" +
                                "\n" +
                                "Whereas, an instance variable in Java, is a variable which is bounded to its object itself. These variables are declared within a class, but outside a method. Every object of that class will create it’s own copy of the variable while using it. Thus, any changes made to the variable won’t reflect in any other instances of that class and will be bound to that particular instance only.\n" +
                                "\n" +

                                "class Test{\n" +
                                "public String EmpName;\n" +
                                "public int empAge;\n" +
                                "}" ,
                        "37"));

        productList.add(
                new Quations_java(
                        30,
                        "What is final keyword in Java?\n" +
                                "\n",
                        "final is a special keyword in Java that is used as a non-access modifier. A final variable can be used in different contexts such as:\n" +
                                "\n" +
                                "final variable\n" +
                                "\nWhen the final keyword is used with a variable then its value can’t be changed once assigned. In case the no value has been assigned to the final variable then using only the class constructor a value can be assigned to it.\n" +
                                "\n" +
                                "final method\n" +
                                "\n" +
                                "When a method is declared final then it can’t be overridden by the inheriting class.\n" +
                                "\n" +
                                "final class\n" +
                                "\n" +
                                "When a class is declared as final in Java, it can’t be extended by any subclass class but it can extend other class." ,
                        "38"));

        productList.add(
                new Quations_java(
                        30,
                        "What is an infinite loop in Java? Explain with an example.",
                        "An infinite loop is an instruction sequence in Java that loops endlessly when a functional exit isn’t met. This type of loop can be the result of a programming error or may also be a deliberate action based on the application behavior. An infinite loop will terminate automatically once the application exits.\n" +
                                "\n" +
                                "For example:\n" +
                                "\n" +
                                "\n" +
                                "public class InfiniteForLoopDemo\n" +
                                "{\n" +
                                "public static void main(String[] arg) {\n" +
                                "for(;;)\n" +
                                "System.out.println(\"Welcome to Edureka!\");\n" +
                                "// To terminate this program press ctrl + c in the console.\n" +
                                "}\n" +
                                "}" ,
                        "39"));

        productList.add(
                new Quations_java(
                        30,
                        "What is constructor chaining in Java?",
                        "In Java, constructor chaining is the process of calling one constructor from another with respect to the current object. Constructor chaining is possible only through legacy where a subclass constructor is responsible for invoking the superclass’ constructor first. There could be any number of classes in the constructor chain. Constructor chaining can be achieved in two ways:\n" +
                                "\n" +
                                "Within the same class using this()\n" +
                                "From base class using super()" ,
                        "40"));

        productList.add(
                new Quations_java(
                        30,
                        "What is a classloader in Java?",
                        "The Java ClassLoader is a subset of JVM (Java Virtual Machine) that is responsible for loading the class files. Whenever a Java program is executed it is first loaded by the classloader. Java provides three built-in classloaders:\n" +
                                "\n" +
                                "Bootstrap ClassLoader\n" +
                                "Extension ClassLoader\n" +
                                "System/Application ClassLoader" ,
                        "41"));

        productList.add(
                new Quations_java(
                        30,
                        "Why Java Strings are immutable in nature?",
                        "In Java, string objects are immutable in nature which simply means once the String object is created its state cannot be modified. Whenever you try to update the value of that object instead of updating the values of that particular object, Java creates a new string object. Java String objects are immutable as String objects are generally cached in the String pool. Since String literals are usually shared between multiple clients, action from one client might affect the rest. It enhances security, caching, synchronization, and performance of the application. " ,
                        "42"));

        productList.add(
                new Quations_java(
                        30,
                        "What is a Map in Java?",
                        "In Java, Map is an interface of Util package which maps unique keys to values. The Map interface is not a subset of the main Collection interface and thus it behaves little different from the other collection types. Below are a few of the characteristics of Map interface: \n" +
                                "\n" +
                                "Map doesn’t contain duplicate keys.\n" +
                                "Each key can map at max one value." ,
                        "43"));

        productList.add(
                new Quations_java(
                        30,
                        "What is collection class in Java? List down its methods and interfaces.",
                        "In Java, the collection is a framework that acts as an architecture for storing and manipulating a group of objects. Using Collections you can perform various tasks like searching, sorting, insertion, manipulation, deletion, etc. Java collection framework includes the following:\n" +
                                "\n" +
                                "Interfaces\n" +
                                "Classes\n" +
                                "Methods" ,
                        "44"));

        productList.add(
                new Quations_java(
                        30,
                        "OOPS Java Interview Questions",
                        "  " ,
                        "-->"));

        productList.add(
                new Quations_java(
                        30,
                        "What is Polymorphism?",
                        "Polymorphism is briefly described as “one interface, many implementations”. Polymorphism is a characteristic of being able to assign a different meaning or usage to something in different contexts – specifically, to allow an entity such as a variable, a function, or an object to have more than one form. \n There are two types of polymorphism:\n" +
                                "\n" +
                                "\nCompile time polymorphism\n" +
                                "\nRun time polymorphism\n" +
                                "\nCompile time polymorphism is method overloading whereas Runtime time polymorphism is done using inheritance and interface." ,
                        "45"));

        productList.add(
                new Quations_java(
                        30,
                        "What is runtime polymorphism or dynamic method dispatch?",
                        "In Java, runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time. In this process, an overridden method is called through the reference variable of a superclass. Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "class Car {\n" +
                                "void run()\n" +
                                "{\n" +
                                "System.out.println(&ldquo;car is running&rdquo;); \n" +
                                "}\n" +
                                "}\n" +
                                "class Audi extends Car {\n" +
                                "void run()\n" +
                                "{\n" +
                                "System.out.prinltn(&ldquo;Audi is running safely with 100km&rdquo;);\n" +
                                "}\n" +
                                "public static void main(String args[])\n" +
                                "{\n" +
                                "Car b= new Audi();    //upcasting\n" +
                                "b.run();\n" +
                                "}\n" +
                                "}\n" ,
                        "46"));

        productList.add(
                new Quations_java(
                        30,
                        "What is abstraction in Java?",
                        "Abstraction refers to the quality of dealing with ideas rather than events. It basically deals with hiding the details and showing the essential things to the user. Thus you can say that abstraction in Java is the process of hiding the implementation details from the user and revealing only the functionality to them. Abstraction can be achieved in two ways:\n" +
                                "\n" +
                                "\nAbstract Classes (0-100% of abstraction can be achieved)\n" +
                                "\nInterfaces (100% of abstraction can be achieved)" ,
                        "47"));

        productList.add(
                new Quations_java(
                        30,
                        "What is inheritance in Java?",
                        "Inheritance in Java is the concept where the properties of one class can be inherited by the other. It helps to reuse the code and establish a relationship between different classes. Inheritance is performed between two types of classes:\n" +
                                "\n" +
                                "\nParent class (Super or Base class)\n" +
                                "\nChild class (Subclass or Derived class)\n" +
                                "A class which inherits the properties is known as Child Class whereas a class whose properties are inherited is known as Parent class." ,
                        "48"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the different types of inheritance in Java?",
                        "Java supports four types of inheritance which are:\n" +
                                "\n" +
                                "\nSingle Inheritance: In single inheritance, one class inherits the properties of another i.e there will be only one parent as well as one child class.\n" +
                                "\nMultilevel Inheritance: When a class is derived from a class which is also derived from another class, i.e. a class having more than one parent class but at different levels, such type of inheritance is called Multilevel Inheritance.\n" +
                                "\nHierarchical Inheritance: When a class has more than one child classes (subclasses) or in other words, more than one child classes have the same parent class, then such kind of inheritance is known as hierarchical.\n" +
                                "\nHybrid Inheritance: Hybrid inheritance is a combination of two or more types of inheritance." ,
                        "49"));

        productList.add(
                new Quations_java(
                        30,
                        "What is method overloading ?",
                        "Method Overloading :\n" +
                                "\n" +
                                "* In Method Overloading, Methods of the same class shares the same name but each method must have a different number of parameters or parameters having different types and order.\n" +
                                "* Method Overloading is to “add” or “extend” more to the method’s behavior.\n" +
                                "* It is a compile-time polymorphism.\n" +
                                "* The methods must have a different signature.\n" +
                                "* It may or may not need inheritance in Method Overloading.\n" +
                                "* Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "\n" +

                                "class Adder {\n" +
                                "Static int add(int a, int b)\n" +
                                "{\n" +
                                "return a+b;\n" +
                                "}\n" +
                                "Static double add( double a, double b)\n" +
                                "{\n" +
                                "return a+b;\n" +
                                "}\n" +
                                "public static void main(String args[])\n" +
                                "{\n" +
                                "System.out.println(Adder.add(11,11));\n" +
                                "System.out.println(Adder.add(12.3,12.6));\n" +
                                "}}\n",

                        "50"));
        productList.add(
                new Quations_java(
                        30,
                        " What is method overriding?",
                        "Method Overriding:  \n" +
                                "\n" +
                                "In Method Overriding, the subclass has the same method with the same name and exactly the same number and type of parameters and same return type as a superclass.\n" +
                                "Method Overriding is to “Change” existing behavior of the method.\n" +
                                "It is a run time polymorphism.\n" +
                                "The methods must have the same signature.\n" +
                                "It always requires inheritance in Method Overriding.\n" +
                                "Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "\n" +
                                "class Car {\n" +
                                "void run(){\n" +
                                "System.out.println(&ldquo;car is running&rdquo;); \n" +
                                "}\n" +
                                "Class Audi extends Car{\n" +
                                "void run()\n" +
                                "{\n" +
                                "System.out.prinltn(\"Audi is running safely with 100km\");\n" +
                                "}\n" +
                                "public static void main( String args[])\n" +
                                "{\n" +
                                "Car b=new Audi();\n" +
                                "b.run();\n" +
                                "}\n" +
                                "}\n" ,
                        "51"));
        productList.add(
                new Quations_java(
                        30,
                        "What is multiple inheritance? Is it supported by Java?",
                        "If a child class inherits the property from multiple classes is known as multiple inheritance. Java does not allow to extend multiple classes.\n" +
                                "\n" +
                                "The problem with multiple inheritance is that if multiple parent classes have the same method name, then at runtime it becomes difficult for the compiler to decide which method to execute from the child class.\n" +
                                "\n" +
                                "Therefore, Java doesn’t support multiple inheritance. The problem is commonly referred to as Diamond Problem." ,
                        "52"));
        productList.add(
                new Quations_java(
                        30,
                        "What is encapsulation in Java?",
                        "Encapsulation is a mechanism where you bind your data(variables) and code(methods) together as a single unit. Here, the data is hidden from the outer world and can be accessed only via current class methods. This helps in protecting the data from any unnecessary modification. We can achieve encapsulation in Java by:\n" +
                                "\n" +
                                "Declaring the variables of a class as private.\n" +
                                "Providing public setter and getter methods to modify and view the values of the variables. " ,
                        "53"));
        productList.add(
                new Quations_java(
                        30,
                        "What is an association?",
                        "Association is a relationship where all object have their own lifecycle and there is no owner. Let’s take the example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. These relationships can be one to one, one to many, many to one and many to many." ,
                        "54"));
        productList.add(
                new Quations_java(
                        30,
                        "What do you mean by aggregation?",
                        "An aggregation is a specialized form of Association where all object has their own lifecycle but there is ownership and child object can not belong to another parent object. Let’s take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department teacher object will not destroy. " ,
                        "55"));
        productList.add(
                new Quations_java(
                        30,
                        "What is composition in Java?",
                        "Composition is again a specialized form of Aggregation and we can call this as a “death” relationship. It is a strong type of Aggregation. Child object does not have their lifecycle and if parent object deletes all child object will also be deleted. Let’s take again an example of a relationship between House and rooms. House can contain multiple rooms there is no independent life of room and any room can not belongs to two different houses if we delete the house room will automatically delete.\n" +
                                "\n" ,
                        "56"));

        productList.add(
                new Quations_java(
                        30,
                        "What is a marker interface ?",
                        "A Marker interface can be defined as the interface having no data member and member functions. In simpler terms, an empty interface is called the Marker interface. The most common examples of Marker interface in Java are Serializable, Cloneable etc. The marker interface can be declared as follows.\n" +
                                "\n" +
                                "\n" +

                                "public interface Serializable{\n" +
                                "}\n" ,
                        "57"));
        productList.add(
                new Quations_java(
                        30,
                        "What is object cloning in Java?",
                        "Object cloning in Java is the process of creating an exact copy of an object. It basically means the ability to create an object with a similar state as the original object. To achieve this, Java provides a method clone() to make use of this functionality. This method creates a new instance of the class of the current object and then initializes all its fields with the exact same contents of corresponding fields. To object clone(), the marker interface java.lang.Cloneable must be implemented to avoid any runtime exceptions. One thing you must note is Object clone() is a protected method, thus you need to override it." ,
                        "58"));
        productList.add(
                new Quations_java(
                        30,
                        "What is a copy constructor in Java?",
                        "Copy constructor is a member function that is used to initialize an object using another object of the same class. Though there is no need for copy constructor in Java since all objects are passed by reference. Moreover, Java does not even support automatic pass-by-value." ,
                        "59"));
        productList.add(
                new Quations_java(
                        30,
                        "What is a constructor overloading in Java?",
                        "In Java, constructor overloading is a technique of adding any number of constructors to a class each having a different parameter list. The compiler uses the number of parameters and their types in the list to differentiate the overloaded constructors.\n" +
                                "\n" +
                                "\n" +
                                "class Demo\n" +
                                "{\n" +
                                "int i;\n" +
                                "public Demo(int a)\n" +
                                "{\n" +
                                "i=k;\n" +
                                "}\n" +
                                "public Demo(int a, int b)\n" +
                                "{\n" +
                                "//body\n" +
                                "}\n" +
                                "}\n" +

                                "\n" ,
                        "60"));


        productList.add(
                new Quations_java(
                        30,
                        "Servlets Interview Questions  ",
                        "  " ,
                        "-->"));


        productList.add(
                new Quations_java(
                        30,
                        "What is a servlet ?",
                        "Java Servlet is server-side technologies to extend the capability of web servers by providing support for dynamic response and data persistence.\n" +
                                "The javax.servlet and javax.servlet.http packages provide interfaces and classes for writing our own servlets.\n" +
                                "All servlets must implement the javax.servlet.Servlet interface, which defines servlet lifecycle methods. When implementing a generic service, we can extend the GenericServlet class provided with the Java Servlet API. The HttpServlet class provides methods, such as doGet() and doPost(), for handling HTTP-specific services.\n" +
                                "Most of the times, web applications are accessed using HTTP protocol and thats why we mostly extend HttpServlet class." ,
                        "61"));

        productList.add(
                new Quations_java(
                        30,
                        "What is Request Dispatcher?",
                        "RequestDispatcher interface is used to forward the request to another resource that can be HTML, JSP or another servlet in same application. We can also use this to include the content of another resource to the response.\n" +
                                "\n" +
                                "There are two methods defined in this interface:\n" +
                                "\n" +
                                "1.void forward()\n" +
                                "\n" +
                                "2.void include()  " ,
                        "62"));


        productList.add(
                new Quations_java(
                        30,
                        "What is the life-cycle of a servlet?",
                        "There are 5 stages in the lifecycle of a servlet:LifeCycleServlet - Java Interview Questions - Edureka\n" +
                                "\n" +
                                "1.Servlet is loaded\n" +
                                "2.Servlet is instantiated\n" +
                                "3.Servlet is initialized\n" +
                                "4.Service the request\n" +
                                "5.Servlet is destroyed" ,
                        "63"));


        productList.add(
                new Quations_java(
                        30,
                        "How does cookies work in Servlets?",
                        "Cookies are text data sent by server to the client and it gets saved at the client local machine.\n" +
                                "\nServlet API provides cookies support through javax.servlet.http.Cookie class that implements Serializable and Cloneable interfaces.\n" +
                                "\nHttpServletRequest getCookies() method is provided to get the array of Cookies from request, since there is no point of adding Cookie to request, there are no methods to set or add cookie to request.\n" +
                                "\nSimilarly HttpServletResponse addCookie(Cookie c) method is provided to attach cookie in response header, there are no getter methods for cookie." ,
                        "64"));


        productList.add(
                new Quations_java(
                        30,
                        "What are the different methods of session management in servlets?",
                        "Session is a conversational state between client and server and it can consists of multiple request and response between client and server. Since HTTP and Web Server both are stateless, the only way to maintain a session is when some unique information about the session (session id) is passed between server and client in every request and response.\n" +
                                "\n" +
                                "Some of the common ways of session management in servlets are:\n" +
                                "\n" +
                                "User Authentication\n" +
                                "HTML Hidden Field\n" +
                                "Cookies\n" +
                                "URL Rewriting\n" +
                                "Session Management API\n" +
                                "SessionManagement - Java Interview Questions - Edureka\n",
                        "65"));


        productList.add(
                new Quations_java(
                        30,
                        "JDBC Interview Questions ",
                        "  " ,
                        "-->"));


        productList.add(
                new Quations_java(
                        30,
                        "What is JDBC Driver ?",
                        "JDBC Driver is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:\n" +
                                "\n" +
                                "1.JDBC-ODBC bridge driver\n" +
                                "2.Native-API driver (partially java driver)\n" +
                                "3.Network Protocol driver (fully java driver)\n" +
                                "4.Thin driver (fully java driver)" ,
                        "66"));


        productList.add(
                new Quations_java(
                        30,
                        "What are the steps to connect to a database in java ?",
                        "1.Registering the driver class\n" +
                                "2.Creating connection\n" +
                                "3.Creating statement\n" +
                                "4.Executing queries\n" +
                                "5.Closing connection" ,
                        "67"));


        productList.add(
                new Quations_java(
                        30,
                        "What are the JDBC API components?",
                        "The java.sql package contains interfaces and classes for JDBC API.\n" +
                                "\n" +
                                "Interfaces:\n" +
                                "\n" +
                                "Connection\n" +
                                "Statement\n" +
                                "PreparedStatement\n" +
                                "ResultSet\n" +
                                "ResultSetMetaData\n" +
                                "DatabaseMetaData\n" +
                                "CallableStatement etc.\n" +
                                "Classes:\n" +
                                "\n" +
                                "DriverManager\n" +
                                "Blob\n" +
                                "Clob\n" +
                                "Types\n" +
                                "SQLException etc." ,
                        "68"));


        productList.add(
                new Quations_java(
                        30,
                        "What is the role of JDBC DriverManager class ?",
                        "The DriverManager class manages the registered drivers. It can be used to register and unregister drivers. It provides factory method that returns the instance of Connection." ,
                        "69"));

        productList.add(
                new Quations_java(
                        30,
                        "What is JDBC Connection interface ?",
                        "The Connection interface maintains a session with the database. It can be used for transaction management. It provides factory methods that returns the instance of Statement, PreparedStatement, CallableStatement and DatabaseMetaData." ,
                        "70"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the purpose of JDBC ResultSet interface ?",
                        "The ResultSet object represents a row of a table. It can be used to change the cursor pointer and get the information from the database." ,
                        "71"));

        productList.add(
                new Quations_java(
                        30,
                        "What is JDBC ResultSetMetaData interface ?",
                        "The ResultSetMetaData interface returns the information of table such as total number of columns, column name, column type etc." ,
                        "72"));

        productList.add(
                new Quations_java(
                        30,
                        "What is JDBC DatabaseMetaData interface ?",
                        "The DatabaseMetaData interface returns the information of the database such as username, driver name, driver version, number of tables, number of views etc." ,
                        "73"));

        productList.add(
                new Quations_java(
                        30,
                        "What do you mean by batch processing in JDBC ?",
                        "Batch processing helps you to group related SQL statements into a batch and execute them instead of executing a single query. By using batch processing technique in JDBC, you can execute multiple queries which makes the performance faster." ,
                        "74"));

        productList.add(
                new Quations_java(
                        30,
                        "Spring Interview Questions ",
                        "  " ,
                        "-->"));

        productList.add(
                new Quations_java(
                        30,
                        "What is Spring ?",
                        "Wikipedia defines the Spring framework as “an application framework and inversion of control container for the Java platform. The framework’s core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform.” Spring is essentially a lightweight, integrated framework that can be used for developing enterprise applications in java." ,
                        "75"));

        productList.add(
                new Quations_java(
                        30,
                        "Name the different modules of the Spring framework.",
                        "Some of the important Spring Framework modules are:\n" +
                                "\n" +
                                "Spring Context – for dependency injection.\n" +
                                "\nSpring AOP – for aspect oriented programming.\n" +
                                "\nSpring DAO – for database operations using DAO pattern\n" +
                                "\nSpring JDBC – for JDBC and DataSource support.\n" +
                                "\nSpring ORM – for ORM tools support such as Hibernate\n" +
                                "\nSpring Web Module – for creating web applications.\n" +
                                "\nSpring MVC – Model-View-Controller implementation for creating web applications, web services etc." ,
                        "76"));

        productList.add(
                new Quations_java(
                        30,
                        "List some of the important annotations in annotation-based Spring configuration.",
                        "The important annotations are:\n" +
                                "\n" +
                                "@Required\n" +
                                "@Autowired\n" +
                                "@Qualifier\n" +
                                "@Resource\n" +
                                "@PostConstruct\n" +
                                "@PreDestroy" ,
                        "77"));

        productList.add(
                new Quations_java(
                        30,
                        "Explain Bean in Spring and List the different Scopes of Spring bean.",
                        "Beans are objects that form the backbone of a Spring application. They are managed by the Spring IoC container. In other words, a bean is an object that is instantiated, assembled, and managed by a Spring IoC container.\n" +
                                "\n" +
                                "There are five Scopes defined in Spring beans.\n"+
                                "\n1.Singleton: Only one instance of the bean will be created for each container. This is the default scope for the spring beans. While using this scope, make sure spring bean doesn’t have shared instance variables otherwise it might lead to data inconsistency issues because it’s not thread-safe.\n" +
                                "\n2.Prototype: A new instance will be created every time the bean is requested.\n" +
                                "\n3.Request: This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.\n" +
                                "\n4.Session: A new bean will be created for each HTTP session by the container.\n" +
                                "\n5.Global-session: This is used to create global session beans for Portlet applications.\n",
                        "78"));

        productList.add(
                new Quations_java(
                        30,
                        "What are some of the important Spring annotations which you have used?",
                        "Some of the Spring annotations that I have used in my project are:\n" +
                                "\n" +
                                "@Controller – for controller classes in Spring MVC project.\n" +
                                "\n" +
                                "@RequestMapping – for configuring URI mapping in controller handler methods. This is a very important annotation, so you should go through Spring MVC RequestMapping Annotation Examples\n" +
                                "\n" +
                                "@ResponseBody – for sending Object as response, usually for sending XML or JSON data as response.\n" +
                                "\n" +
                                "@PathVariable – for mapping dynamic values from the URI to handler method arguments.\n" +
                                "\n" +
                                "@Autowired – for autowiring dependencies in spring beans.\n" +
                                "\n" +
                                "@Qualifier – with @Autowired annotation to avoid confusion when multiple instances of bean type is present.\n" +
                                "\n" +
                                "@Service – for service classes.\n" +
                                "\n" +
                                "@Scope – for configuring the scope of the spring bean.\n" +
                                "\n" +
                                "@Configuration, @ComponentScan and @Bean – for java based configurations.\n" +
                                "\n" +
                                "AspectJ annotations for configuring aspects and advices , @Aspect, @Before, @After, @Around, @Pointcut, etc.",
                        "79"));

        productList.add(
                new Quations_java(
                        30,
                        "How to integrate Spring and Hibernate Frameworks?",
                        "We can use Spring ORM module to integrate Spring and Hibernate frameworks if you are using Hibernate 3+ where SessionFactory provides current session, then you should avoid using HibernateTemplate or HibernateDaoSupport classes and better to use DAO pattern with dependency injection for the integration.\n" +
                                "\n" +
                                "Also, Spring ORM provides support for using Spring declarative transaction management, so you should utilize that rather than going for hibernate boiler-plate code for transaction management. " ,
                        "80"));

        productList.add(
                new Quations_java(
                        30,
                        "Name the types of transaction management that Spring supports.",
                        "Two types of transaction management are supported by Spring. They are:\n" +
                                "\n" +
                                "Programmatic transaction management: In this, the transaction is managed with the help of programming. It provides you extreme flexibility, but it is very difficult to maintain.\n" +
                                "Declarative transaction management: In this, transaction management is separated from the business code. Only annotations or XML based configurations are used to manage the transactions." ,
                        "81"));

        productList.add(
                new Quations_java(
                        30,
                        "Exception and Thread Java Interview Questions",
                        "  " ,
                        "-->"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the difference between Error and Exception ?",
                        "An error is an irrecoverable condition occurring at runtime. Such as OutOfMemory error. These JVM errors you cannot repair them at runtime. Though error can be caught in the catch block but the execution of application will come to a halt and is not recoverable.\n" +
                                "\n" +
                                "While exceptions are conditions that occur because of bad input or human error etc. e.g. FileNotFoundException will be thrown if the specified file does not exist. Or a NullPointerException will take place if you try using a null reference. In most of the cases it is possible to recover from an exception (probably by giving the user feedback for entering proper values etc." ,
                        "82"));

        productList.add(
                new Quations_java(
                        30,
                        "How can you handle Java exceptions ?",
                        "There are five keywords used to handle exceptions in Java: \n" +
                                "\n" +
                                "1.try\n" +
                                "2.catch\n" +
                                "3.finally\n" +
                                "4.throw\n" +
                                "5.throws" ,
                        "83"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the differences between Checked Exception and Unchecked Exception ?\n" +
                                "\n" +
                                "Checked Exception",
                        "Checked Exception\n" +
                                "\n" +
                                "The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions. \n" +
                                "\nChecked exceptions are checked at compile-time.\n" +
                                "\nExample: IOException, SQLException etc.\n" +
                                "\nUnchecked Exception\n" +
                                "\n" +
                                "\nThe classes that extend RuntimeException are known as unchecked exceptions. \n" +
                                "\nUnchecked exceptions are not checked at compile-time.\n" +
                                "\nExample: ArithmeticException, NullPointerException etc." ,
                        "84"));

        productList.add(
                new Quations_java(
                        30,
                        "What purpose do the keywords final, finally, and finalize fulfill ? ",
                        "Final:\n" +
                                "\n" +
                                "Final is used to apply restrictions on class, method, and variable. A final class can’t be inherited, final method can’t be overridden and final variable value can’t be changed. Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "\n" +

                                "class FinalVarExample {\n" +
                                "public static void main( String args[])\n" +
                                "{\n" +
                                "final int a=10;   // Final variable\n" +
                                "a=50;             //Error as value can't be changed\n" +
                                "}\n" +
                                "Finally\n" +
                                "\n" +
                                "Finally is used to place important code, it will be executed whether the exception is handled or not. Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "\n" +

                                "class FinallyExample {\n" +
                                "public static void main(String args[]){\n" +
                                "try {\n" +
                                "int x=100;\n" +
                                "}\n" +
                                "catch(Exception e) {\n" +
                                "System.out.println(e);\n" +
                                "}\n" +
                                "finally {\n" +
                                "System.out.println(\"finally block is executing\");}\n" +
                                "}}\n" +
                                "}\n" +
                                "Finalize\n" +
                                "\n" +
                                "Finalize is used to perform clean up processing just before the object is garbage collected. Let’s take a look at the example below to understand it better.\n" +
                                "\n" +
                                "1\n" +

                                "class FinalizeExample {\n" +
                                "public void finalize() {\n" +
                                "System.out.println(\"Finalize is called\");\n" +
                                "}\n" +
                                "public static void main(String args[])\n" +
                                "{\n" +
                                "FinalizeExample f1=new FinalizeExample();\n" +
                                "FinalizeExample f2=new FinalizeExample();\n" +
                                "f1= NULL;\n" +
                                "f2=NULL;\n" +
                                "System.gc();\n" +
                                "}\n" +
                                "}\n" ,
                        "85"));

        productList.add(
                new Quations_java(
                        30,
                        "What is exception hierarchy in java ?",
                        "The hierarchy is as follows:\n" +
                                "\n" +
                                "Throwable is a parent class of all Exception classes. \n There are two types of Exceptions: \nChecked exceptions and UncheckedExceptions or RunTimeExceptions. \nBoth type of exceptions extends Exception class whereas errors are further classified into Virtual Machine error and Assertion error." ,
                        "86"));

        productList.add(
                new Quations_java(
                        30,
                        "How to create a custom Exception?",
                        "To create you own exception extend the Exception class or any of its subclasses.\n" +
                                "\n" +
                                " * class New1Exception extends Exception { }               // this will create Checked Exception\n" +
                                "\n * class NewException extends IOException { }             // this will create Checked exception\n" +
                                "\n * class NewException extends NullPonterExcpetion { }  // this will create UnChecked exception\n" ,
                        "87"));
        productList.add(
                new Quations_java(
                        30,
                        "What are the important methods of Java Exception Class ?",
                        "Exception and all of it’s subclasses doesn’t provide any specific methods and all of the methods are defined in the base class Throwable.\n" +
                                "\n" +
                                "1.String getMessage() – This method returns the message String of Throwable and the message can be provided while creating the exception through it’s constructor.\n" +
                                "\n2.String getLocalizedMessage() – This method is provided so that subclasses can override it to provide locale specific message to the calling program. Throwable class implementation of this method simply use getMessage() method to return the exception message.\n" +
                                "\n3.Synchronized Throwable getCause() – This method returns the cause of the exception or null id the cause is unknown.\n" +
                                "\n4.String toString() – This method returns the information about Throwable in String format, the returned String contains the name of Throwable class and localized message.\n" +
                                "\n5.void printStackTrace() – This method prints the stack trace information to the standard error stream, this method is overloaded and we can pass PrintStream or PrintWriter as an argument to write the stack trace information to the file or stream." ,
                        "88"));
        productList.add(
                new Quations_java(
                        30,
                        "What is a finally block? Is there a case when finally will not execute?",
                        "Finally block is a block which always executes a set of statements. It is always associated with a try block regardless of any exception that occurs or not. \n" +
                                "Yes, finally will not be executed if the program exits either by calling System.exit() or by causing a fatal error that causes the process to abort." ,
                        "89"));
        productList.add(
                new Quations_java(
                        30,
                        "What is synchronization  ?",
                        "Synchronization refers to multi-threading. A synchronized block of code can be executed by only one thread at a time. As Java supports execution of multiple threads, two or more threads may access the same fields or objects. Synchronization is a process which keeps all concurrent threads in execution to be in sync. Synchronization avoids memory consistency errors caused due to inconsistent view of shared memory. When a method is declared as synchronized the thread holds the monitor for that method’s object. If another thread is executing the synchronized method the thread is blocked until that thread releases the monitor." ,
                        "90"));
        productList.add(
                new Quations_java(
                        30,
                        "Can we write multiple catch blocks under single try block ? ",
                        "Yes we can have multiple catch blocks under single try block but the approach should be from specific to general. Let’s understand this with a programmatic example.\n" +
                                "\n" +
                                "\n" +

                                "public class Example {\n" +
                                "public static void main(String args[]) {\n" +
                                "try {\n" +
                                "int a[]= new int[10];\n" +
                                "a[10]= 10/0;\n" +
                                "}\n" +
                                "catch(ArithmeticException e)\n" +
                                "{\n" +
                                "System.out.println(\"Arithmetic exception in first catch block\");\n" +
                                "}\n" +
                                "catch(ArrayIndexOutOfBoundsException e)\n" +
                                "{\n" +
                                "System.out.println(\"Array index out of bounds in second catch block\");\n" +
                                "}\n" +
                                "catch(Exception e)\n" +
                                "{\n" +
                                "System.out.println(\"Any exception in third catch block\");\n" +
                                "}\n" +
                                "}" ,
                        "91"));
         productList.add(
                new Quations_java(
                        30,
                        "What are the important methods of Java Exception Class ?",
                        "Methods are defined in the base class Throwable. Some of the important methods of Java exception class are stated below. \n" +
                                "\n" +
                                "String getMessage() – This method returns the message String about the exception. The message can be provided through its constructor.\n" +
                                "\npublic StackTraceElement[] getStackTrace() – This method returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack whereas the last element in the array represents the method at the bottom of the call stack.\n" +
                                "\nSynchronized Throwable getCause() – This method returns the cause of the exception or null id as represented by a Throwable object.\n" +
                                "\n" +
                                "String toString() – This method returns the information in String format. The returned String contains the name of Throwable class and localized message.\n" +
                                "\nvoid printStackTrace() – This method prints the stack trace information to the standard error stream. " ,
                        "92"));
         productList.add(
                new Quations_java(
                        30,
                        "What is OutOfMemoryError in Java ?",
                        "OutOfMemoryError is the subclass of java.lang.Error which generally occurs when our JVM runs out of memory." ,
                        "93"));
         productList.add(
                new Quations_java(
                        30,
                        "What is a Thread ?",
                        "A thread is the smallest piece of programmed instructions which can be executed independently by a scheduler. In Java, all the programs will have at least one thread which is known as the main thread. This main thread is created by the JVM when the program starts its execution. The main thread is used to invoke the main() of the program.\n" +
                                "\n" ,
                        "94"));
         productList.add(
                new Quations_java(
                        30,
                        "What are the two ways to create a thread ?",
                        "In Java, threads can be created in the following two ways:- \n" +
                                "\n" +
                                "By implementing the Runnable interface.\n" +
                                "By extending the Thread" ,
                        "95"));
         productList.add(
                new Quations_java(
                        30,
                        "Compare Java & Python",
                        "Criteria  ::- \tJava :: \tPython  \n" +
                                "Ease of use ::- \tGood :: \tVery Good\n" +
                                "Speed of coding ::- \tAverage :: \tExcellent\n" +
                                "Data types ::- \tStatic typed :: \tDynamically typed\n" +
                                "Data Science & machine learning applications ::-' \tAverage :: \tVery Good" ,
                        "96"));
         productList.add(
                new Quations_java(
                        30,
                        "What are the advantages of JSON over XML ?",
                        "The advantages of JSON over XML are\n" +
                                "\n" +
                                " JSON is Lighter and faster than XML\n" +
                                " \nBetter understandable.\n" +
                                " \nEasy to parse and conversion to objects for information consumption.\n" +
                                " \nSupport multiple data types – JSON support string, number, array, Boolean but XML data are all strings.\n" ,
                        "97"));
         productList.add(
                new Quations_java(
                        30,
                        "Define content negotiation ?",
                        "If we have visited website to searching the information, we will get the information in different languages and in different formats when a client makes an HTTP request to a server, the client can also specify the media types here. The client can specify what it can accept back from the host and on the basis of availability the host will return to the client. This is known as content negotiation because client and server negotiated on the language and format of the content to be shared." ,
                        "98"));
         productList.add(
                new Quations_java(
                        30,
                        "Define Abstract class ?",
                        "A class which contains the abstract keyword in its declaration is known as abstract class. It can have abstract and non-abstract methods (method with body).\n" +
                                "\n" +
                                " This class can have public, private, protected or constants and default variables.\n" +
                                "\n It needs to be extended and its method implemented. It cannot be instantiated.\n" +
                                "\n If a class has at least one abstract method, then the class must be declared abstract." ,
                        "99"));
         productList.add(
                new Quations_java(
                        30,
                        "Define JAXP & JAXB?",
                        "\nJAXP: – Stands for Java API for XML Processing. This provides a common interface for creating and using DOM, SAX, and XSLT APIs in Java regardless of which vendor’s implementation is actually being used.\n" +
                                "\nJAXB: – It Stands for Java API for XML Binding. This standard defines a system for a script out Java objects as XML and for creating Java objects from XML structures." ,
                        "100"));

        productList.add(
                new Quations_java(
                        30,
                        "Good luck with your interview!",
                        "",
                        "-->"));





































        //creating recyclerview adapter
            Quations_adaptor adapter = new Quations_adaptor(this, productList);

            //setting adapter to recyclerview
            recyclerView.setAdapter(adapter);
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent=new Intent(this,QuationsListPage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Toast.makeText(this, "You are at Home ", Toast.LENGTH_SHORT).show();
                break;

            case android.R.id.home:
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);

    }

}


