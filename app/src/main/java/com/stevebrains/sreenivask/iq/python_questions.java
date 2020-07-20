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

public class python_questions extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.python_questions);

        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("Python Interview Q 2020");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);


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
                        "What is Python? What are the benefits of using Python ?",
                        "Python is a programming language with objects, modules, threads, exceptions and automatic memory management. The benefits of pythons are that it is simple and easy, portable, extensible, build-in data structure and it is an open source.",
                        "1"
                ));

        productList.add(
                new Quations_java(
                        2,
                        "What is PEP 8 ?",
                        "PEP 8 is a coding convention, a set of recommendation, about how to write your Python code more readable.",
                        "2"));
        productList.add(
                new Quations_java(
                        30,
                        "What is pickling and unpickling ?",
                        "Pickle module accepts any Python object and converts it into a string representation and dumps it into a file by using dump function, this process is called pickling. While the process of retrieving original Python objects from the stored string representation is called unpickling.",
                        "3"));


        productList.add(
                new Quations_java(
                        30,
                        "How Python is interpreted ?",
                        "Python language is an interpreted language. Python program runs directly from the source code. It converts the source code that is written by the programmer into an intermediate language, which is again translated into machine language that has to be executed.",
                        "4"));


        productList.add(
                new Quations_java(
                        30,
                        "How memory is managed in Python ?",
                        "Python memory is managed by Python private heap space. All Python objects and data structures are located in a private heap. The programmer does not have an access to this private heap and interpreter takes care of this Python private heap.\n" +
                                "The allocation of Python heap space for Python objects is done by Python memory manager. The core API gives access to some tools for the programmer to code.\n" +
                                "Python also have an inbuilt garbage collector, which recycle all the unused memory and frees the memory and makes it available to the heap space.\n" +
                                "python\n",
                        "5"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the tools that help to find bugs or perform static analysis ?",
                        "PyChecker is a static analysis tool that detects the bugs in Python source code and warns about the style and complexity of the bug. Pylint is another tool that verifies whether the module meets the coding standard.\n",
                        "6"));

        productList.add(
                new Quations_java(
                        30,
                        "What are Python decorators ?",
                        "A Python decorator is a specific change that we make in Python syntax to alter functions easily.",
                        "7"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the difference between list and tuple ?",
                        "The difference between list and tuple is that list is mutable while tuple is not. Tuple can be hashed for e.g as a key for dictionaries.",
                        "8"));

        productList.add(
                new Quations_java(
                        30,
                        "How are arguments passed by value or by reference ?",
                        "Everything in Python is an object and all variables hold references to the objects. The references values are according to the functions; as a result you cannot change the value of the references. However, you can change the objects if it is mutable.",
                        "9"));

        productList.add(
                new Quations_java(
                        30,
                        "What is Dict and List comprehensions are ?",
                        "They are syntax constructions to ease the creation of a Dictionary or List based on existing iterable.\n",
                        "10"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the built-in type does python provides ?",
                        "There are mutable and Immutable types of Pythons built in types Mutable built-in types\n" +
                                "List\n" +
                                "Sets\n" +
                                "Dictionaries\n" +
                                "Immutable built-in types\n" +
                                "Strings\n" +
                                "Tuples\n" +
                                "Numbers",
                        "11"));

        productList.add(
                new Quations_java(
                        30,
                        "What is namespace in Python ?",
                        "n Python, every name introduced has a place where it lives and can be hooked for. This is known as namespace. It is like a box where a variable name is mapped to the object placed. Whenever the variable is searched out, this box will be searched, to get corresponding object.",
                        "12"));

        productList.add(
                new Quations_java(
                        30,
                        "What is lambda in Python ?",
                        "It is a single expression anonymous function often used as inline function.",
                        "13"));

        productList.add(
                new Quations_java(
                        30,
                        "Why lambda forms in python does not have statements ?",
                        "A lambda form in python does not have statements as it is used to make new function object and then return them at runtime.",
                        "14"));

        productList.add(
                new Quations_java(
                        30,
                        "What is pass in Python ?",
                        "Pass means, no-operation Python statement, or in other words it is a place holder in compound statement, where there should be a blank left and nothing has to be written there.",
                        "15"));

        productList.add(
                new Quations_java(
                        30,
                        "In Python what are iterators ?",
                        "In Python, iterators are used to iterate a group of elements, containers like list.",
                        "16"));

        productList.add(
                new Quations_java(
                        30,
                        "What is unittest in Python ?",
                        "A unit testing framework in Python is known as unittest. It supports sharing of setups, automation testing, shutdown code for tests, aggregation of tests into collections etc.\n",
                        "17"));

        productList.add(
                new Quations_java(
                        30,
                        "In Python what is slicing ?",
                        "A mechanism to select a range of items from sequence types like list, tuple, strings etc. is known as slicing.\n",
                        "18"));

        productList.add(
                new Quations_java(
                        30,
                        "What are generators in Python ?",
                        "The way of implementing iterators are known as generators. It is a normal function except that it yields expression in the function.",
                        "19"));

        productList.add(
                new Quations_java(
                        30,
                        "What is docstring in Python ?",
                        "A Python documentation string is known as docstring, it is a way of documenting Python functions, modules and classes.",
                        "20"));

        productList.add(
                new Quations_java(
                        30,
                        "How can you copy an object in Python ?",
                        "To copy an object in Python, you can try copy.copy () or copy.deepcopy() for the general case. You cannot copy all objects but most of them.",
                        "21"));

        productList.add(
                new Quations_java(
                        30,
                        "What is negative index in Python ?",
                        "Python sequences can be index in positive and negative numbers. For positive index, 0 is the first index, 1 is the second index and so forth. For negative index, (-1) is the last index and (-2) is the second last index and so forth.\n" ,
                        "22"));

        productList.add(
                new Quations_java(
                        30,
                        "How you can convert a number to a string ?",
                        "In order to convert a number into a string, use the inbuilt function str(). If you want a octal or hexadecimal representation, use the inbuilt function oct() or hex().",
                        "23"));

        productList.add(
                new Quations_java(
                        30,
                        "What is the difference between Xrange and range ?",
                        "Xrange returns the xrange object while range returns the list, and uses the same memory and no matter what the range size is.",
                        "24"));

        productList.add(
                new Quations_java(
                        30,
                        "What is module and package in Python ?",
                        "In Python, module is the way to structure program. Each Python program file is a module, which imports other modules like objects and attributes.\n" +
                                "The folder of Python program is a package of modules. A package can have modules or subfolders.",
                        "25"));

        productList.add(
                new Quations_java(
                        30,
                        "Mention what are the rules for local and global variables in Python ?",
                        "Local variables: If a variable is assigned a new value anywhere within the function’s body, it’s assumed to be local.\n" +
                                "Global variables: Those variables that are only referenced inside a function are implicitly global.",
                        "26"));

        productList.add(
                new Quations_java(
                        30,
                        "How can you share global variables across modules ?",
                        "To share global variables across modules within a single program, create a special module. Import the config module in all modules of your application. The module will be available as a global variable across modules.\n",
                        "27"));

        productList.add(
                new Quations_java(
                        30,
                        "Explain how can you make a Python Script executable on Unix ?",
                        "To make a Python Script executable on Unix, you need to do two things,\n" +
                                "Script file’s mode must be executable and\n" +
                                "the first line must begin with # ( #!/usr/local/bin/python) ",
                        "28"));



        productList.add(
                new Quations_java(
                        30,
                        "Explain how to delete a file in Python ?",
                        "By using a command os.remove (filename) or os.unlink(filename)",
                        "29"));


        productList.add(
                new Quations_java(
                        30,
                        " Explain how can you generate random numbers in Python ?",
                        "To generate random numbers in Python, you need to import command as\n" +
                                "import random\n" +
                                "random.random()\n" +
                                "This returns a random floating point number in the range [0,1)",
                        "30"));


        productList.add(
                new Quations_java(
                        30,
                        "Explain how can you access a module written in Python from C ?",
                        "You can access a module written in Python from C by following method,\n" +
                                "Module = =PyImport_ImportModule(“”);",
                        "31"));


        productList.add(
                new Quations_java(
                        30,
                        "Mention the use of // operator in Python ?",
                        "It is a Floor Divisionoperator , which is used for dividing two operands with the result as quotient showing only digits before the decimal point. For instance, 10//5 = 2 and 10.0//5.0 = 2.0.",
                        "32"));


        productList.add(
                new Quations_java(
                        30,
                        "Mention five benefits of using Python ?",
                        "Python comprises of a huge standard library for most Internet platforms like Email, HTML, etc.\n" +
                                "Python does not require explicit memory management as the interpreter itself allocates the memory to new variables and free them automatically\n" +
                                "Provide easy readability due to use of square brackets\n" +
                                "Easy-to-learn for beginners\n" +
                                "Having the built-in data types saves programming time and effort from declaring variables\n",
                        "33"));


        productList.add(
                new Quations_java(
                        30,
                        "Mention the use of the split function in Python ?",
                        "The use of the split function in Python is that it breaks a string into shorter strings using the defined separator. It gives a list of all words present in the string.",
                        "34"));


        productList.add(
                new Quations_java(
                        30,
                        "Is python the right choice for Web based Programming?",
                        "Python is another open source programming that has become popular for creating web-related applications and large programs. Scripts written in Python are often very clear to read; the language is also known for its flexibility. Whether you are looking for database tools, image manipulation scripts, or something else entirely, if it is written in Python, you will find it here.",
                        "35"));


        productList.add(
                new Quations_java(
                        30,
                        "What are uses of lambda ?",
                        "It used to create small anonymous functions at run time. Like e.g.\n" +
                                "def fun1(x):\n" +
                                "return x**2\n" +
                                "print fun1(2)\n" +
                                "it gives you answer 4\n" +
                                "the same thing can be done using\n" +
                                "sq=lambda x: x**2\n" +
                                "print sq(2)\n" +
                                "it gives the answer 4\n",
                        "36"));


        productList.add(
                new Quations_java(
                        30,
                        "When you need ordered container of things, which will be manipulated, use lists.",
                        "Dictionary is key, value pair container and hence is not ordered. Use it when you need fast access to elements, not in ordered fashion. Lists are indexed and index of the list cannot be “string” e.g. list [‘myelement’] is not a valid statement in python.\n" ,
                        "37"));


        productList.add(
                new Quations_java(
                        30,
                        "When do you use list vs. tuple vs. dictionary vs. set ?",
                        "List and Tuple are both ordered containers. If you want an ordered container of constant elements use tuple as tuples are immutable objects.",
                        "38"));


        productList.add(
                new Quations_java(
                        30,
                        "Do they know a tuple/list/dict when they see it ?",
                        "Dictionaries are consisting of pair of keys and values.like {’key’:’value’}.\n" +
                                "book={’cprog’:’1024′,’c++’:’4512′}\n" +
                                "Keys are unique but values can be same. The main difference between list and tuple is you can change the list but you cannot change the tuple. Tuple can be used as keys in mapping where list is not.\n" ,
                        "39"));


        productList.add(
                new Quations_java(
                        30,
                        "What is used to represent Strings in Python? Is double quotes used for String ",
                        "representation or single quotes used for String representation in Python?\n" +
                                "Using Single Quotes (‘)\n" +
                                "You can specify strings using single quotes such as ‘Quote me on this’ . All white space i.e. spaces and tabs are preserved as-is.\n" +
                                "Using Double Quotes (“)\n" +
                                "Strings in double quotes work exactly the same way as strings in single quotes. An example is “What’s your name?”\n" +
                                "Using Triple Quotes (”’ or “””)\n" +
                                "You can specify multi-line strings using triple quotes. You can use single quotes and double quotes freely within the triple quotes. An example is\n" +
                                "”’This is a multi-line string. This is the first line.\n" +
                                "This is the second line.\n" +
                                "“What’s your name?,” I asked.\n" +
                                "He said “Bond, James Bond.”",
                        "40"));


        productList.add(
                new Quations_java(
                        30,
                        "Who created the Python programming language ?",
                        "Python programming language was created by Guido van Rossum.",
                        "41"));


        productList.add(
                new Quations_java(
                        30,
                        "Why cannot lambda forms in Python contain statements ?",
                        "A lambda statement is used to create new function objects and then return them at runtime that is why lambda forms in Python did not contain statement.\n" ,
                        "42"));


        productList.add(
                new Quations_java(
                        30,
                        "How is memory managed in Python ?",
                        "Memory is managed through private heaps. Private heap is managed by python memory manager.",
                        "43"));


        productList.add(
                new Quations_java(
                        30,
                        "Which of the languages does Python resemble in its class syntax ?",
                        "C++ is the appropriate language that Python resemble in its class syntax.",
                        "44"));


        productList.add(
                new Quations_java(
                        30,
                        "Why was the language called as Python ?",
                        "At the same time he began implementing Python, Guido van Rossum was also reading the published scripts from “Monty Python’s Flying Circus” (a BBC comedy series from the seventies, in the unlikely case you didn’t know). It occurred to him that he needed a name that was short, unique, and slightly mysterious, so he decided to call the language Python.",
                        "45"));


        productList.add(
                new Quations_java(
                        30,
                        "Does Python support strongly for regular expressions? What are the other languages that support strongly for regular expressions ?",
                        "Yes, python strongly support regular expression. Other languages supporting regular expressions are: Delphi, Java, Java script, .NET, Perl, Php, Posix, python, Ruby, Tcl, Visual Basic, XML schema, VB script, Visual Basic 6.",
                        "46"));


        productList.add(
                new Quations_java(
                        30,
                        "Why is not all memory freed when Python exits ?",
                        "Objects referenced from the global namespaces of Python modules are not always de-allocated when Python exits. This may happen if there are circular references. There are also certain bits of memory that are allocated by the C library that are impossible to free (e.g. a tool like the one Purify will complain about these). Python is, however, aggressive about cleaning up memory on exit and does try to destroy every single object."+
                        "If you want to force Python to delete certain things on de-allocation, you can use the at exit module to register one or more exit functions to handle those deletions.",
                        "47"));


        productList.add(
                new Quations_java(
                        30,
                        "What are the disadvantages of the Python programming language ?",
                        "One of the disadvantages of the Python programming language is it is not suited for fast and memory intensive tasks.",
                        "48"));


        productList.add(
                new Quations_java(
                        30,
                        "What is the language from which Python has got its features or derived its features ?",
                        "Most of the object oriented programming languages to name a few are C++, CLISP and Java is the language from which Python has got its features or derived its features.",
                        "49"));


        productList.add(
                new Quations_java(
                        30,
                        "Does python support switch or case statement in Python? If not what is the reason for the same ?",
                        "No. You can use multiple if-else, as there is no need for this.",
                        "50"));


        productList.add(
                new Quations_java(
                        30,
                        "What Are The Built-In Types Available In Python ?",
                        "Here is the list of most commonly used built-in types that Python supports:\n" +
                                "\n" +
                                " * Immutable built-in datatypes of Python\n" +
                                "1.Numbers\n" +
                                "2.Strings\n" +
                                "3.Tuples\n" +
                                " * Mutable built-in datatypes of Python\n" +
                                "1.List\n" +
                                "2.Dictionaries\n" +
                                "3.Sets",
                        "51"));


        productList.add(
                new Quations_java(
                        30,
                        "How To Find Bugs Or Perform Static Analysis In A Python Application ?",
                        " * You can use PyChecker, which is a static analyzer. It identifies the bugs in Python project and also reveals the style and complexity related bugs.\n" +
                                " * Another tool is Pylint, which checks whether the Python module satisfies the coding standard.",
                        "52"));


        productList.add(
                new Quations_java(
                        30,
                        "When Is The Python Decorator Used ?",
                        "Python decorator is a relative change that you do in Python syntax to adjust the functions quickly.",
                        "53"));


        productList.add(
                new Quations_java(
                        30,
                        "What Is The Principal Difference Between A List And The Tuple ?",

                        "List Vs. Tuple.\n" +
                                "\n" +
                                "The principal difference between a list and the tuple is that the former is mutable while the tuple is not.\n" +
                                "\n" +
                                "A tuple is allowed to be hashed, for example, using it as a key for dictionaries.\n",
                        "54"));


        productList.add(
                new Quations_java(
                        30,
                        "How Does Python Handle Memory Management ?",
                        " * Python uses private heaps to maintain its memory. So the heap holds all the Python objects and the data structures. This area is only accessible to the Python interpreter; programmers can’t use it.\n" +
                                " * And it’s the Python memory manager that handles the Private heap. It does the required allocation of the memory for Python objects.\n" +
                                " * Python employs a built-in garbage collector, which salvages all the unused memory and offloads it to the heap space.",
                        "55"));


        productList.add(
                new Quations_java(
                        30,
                        "What Are The Principal Differences Between The Lambda And Def ?",
                        " * Lambda Vs. Def.\n" +
                                "\n" +
                                " * Def can hold multiple expressions while lambda is a uni-expression function.\n" +
                                " * Def generates a function and designates a name to call it later. Lambda forms a function object and returns it.\n" +
                                " * Def can have a return statement. Lambda can’t have return statements.\n" +
                                " * Lambda supports to get used inside a list and dictionary.",
                        "56"));


        productList.add(
                new Quations_java(
                        30,
                        "Write A Reg Expression That Confirms An Email Id Using The Python Reg Expression Module “Re”?\n" ,
                        "Python has a regular expression module “re.”\n" +
                                "\n" +
                                "Check out the “re” expression that can check the email id for .com and .co.in subdomain.\n" +
                                "\n" +
                                "import re\n" +
                                "print(re.search(r\"[0-9a-zA-Z.]+@[a-zA-Z]+\\.(com|co\\.in)$\",\"micheal.pages@mp.com\"))",
                        "57"));

        productList.add(
                new Quations_java(
                        30,
                        "What Do You Think Is The Output Of The Following Code Fragment? Is There Any Error In The Code ?",
                        "list = ['a', 'b', 'c', 'd', 'e']\n" +
                                "print (list[10:])"+"\n"+
                        "The result of the above lines of code is []. There won’t be any error like an IndexError.\n" +
                                "\n" +
                                "You should know that trying to fetch a member from the list using an index that exceeds the member count (for example, attempting to access list[10] as given in the question) would yield an IndexError. By the way, retrieving only a slice at the starting index that surpasses the no. of items in the list won’t result in an IndexError. It will just return an empty list.",
                        "58"));

        productList.add(
                new Quations_java(
                        30,
                        "Is There A Switch Or Case Statement In Python? If Not Then What Is The Reason For The Same ?",
                        "No, Python does not have a Switch statement, but you can write a Switch function and then use it.",
                        "59"));

        productList.add(
                new Quations_java(
                        30,
                        "What Are The Optional Statements Possible Inside A Try-Except Block In Python ?",
                        "There are two optional clauses you can use in the try-except block.\n" +
                                "\n" +
                                "The “else” clause\n" +
                                "It is useful if you want to run a piece of code when the try block doesn’t create an exception.\n" +
                                "The “finally” clause\n" +
                                "It is useful when you want to execute some steps which run, irrespective of whether there occurs an exception or not.",
                        "60"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is A String In Python ?",
                        "A string in Python is a sequence of alpha-numeric characters. They are immutable objects. It means that they don’t allow modification once they get assigned a value. Python provides several methods, such as join(), replace(), or split() to alter strings. But none of these change the original object.",
                        "61"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is Slicing In Python ?",
                        "Slicing is a string operation for extracting a part of the string, or some part of a list. In Python, a string (say text) begins at index 0, and the nth character stores at position text[n-1]. Python can also perform reverse indexing, i.e., in the backward direction, with the help of negative numbers. In Python, the slice() is also a constructor function which generates a slice object. The result is a set of indices mentioned by range(start, stop, step). The slice() method allows three parameters. 1. start – starting number for the slicing to begin. 2. stop – the number which indicates the end of slicing. 3. step – the value to increment after each index (default = 1).",
                        "62"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is %S In Python ?",
                        "Python has support for formatting any value into a string. It may contain quite complex expressions.\n" +
                                "\n" +
                                "One of the common usages is to push values into a string with the %s format specifier. The formatting operation in Python has the comparable syntax as the C function printf() has.",
                        "63"));

        productList.add(
                new Quations_java(
                        30,
                        "Is A String Immutable Or Mutable In Python ?",
                        "Python strings are indeed immutable.\n" +
                                "\n" +
                                "Let’s take an example. We have an “str” variable holding a string value. We can’t mutate the container, i.e., the string, but can modify what it contains that means the value of the variable.",
                        "64"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Index In Python ?",
                        "An index is an integer data type which denotes a position within an ordered list or a string.\n" +
                                "\n" +
                                "In Python, strings are also lists of characters. We can access them using the index which begins from zero and goes to the length minus one.\n" +
                                "\n" +
                                "For example, in the string “Program,” the indexing happens like this:\n" +
                                "\n" +
                                "Program 0 1 2 3 4 5",
                        "65"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is Docstring In Python ?",
                        "A docstring is a unique text that happens to be the first statement in the following Python constructs:\n" +
                                "\n" +
                                "Module, Function, Class, or Method definition.\n" +
                                "\n" +
                                "A docstring gets added to the __doc__ attribute of the string object.\n" +
                                "\n" +
                                "Now, read some of the Python interview questions on functions.",
                        "66"));

        productList.add(
                new Quations_java(
                        30,
                        "How Many Basic Types Of Functions Are Available In Python ?",
                        "Python gives us two basic types of functions.\n" +
                                "\n" +
                                "1. Built-in, and\n" +
                                "\n" +
                                "2. User-defined.\n" +
                                "\n" +
                                "The built-in functions happen to be part of the Python language. Some of these are print(), dir(), len(), and abs() etc.",
                        "67"));

        productList.add(
                new Quations_java(
                        30,
                        "How Do We Write A Function In Python ?",
                        "We can create a Python function in the following manner.\n" +
                                "\n" +
                                "Step-1: to begin the function, start writing with the keyword def and then mention the function name.\n" +
                                "\n" +
                                "Step-2: We can now pass the arguments and enclose them using the parentheses. A colon, in the end, marks the end of the function header.\n" +
                                "\n" +
                                "Step-3: After pressing an enter, we can add the desired Python statements for execution.",
                        "68"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is A Function Call Or A Callable Object In Python ?",
                        "A function in Python gets treated as a callable object. It can allow some arguments and also return a value or multiple values in the form of a tuple. Apart from the function, Python has other constructs, such as classes or the class instances which fits in the same category.\n",
                        "69"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Return Keyword Used For In Python ?",
                        "The purpose of a function is to receive the inputs and return some output.\n" +
                                "\n" +
                                "The return is a Python statement which we can use in a function for sending a value back to its caller.",
                        "70"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is “Call By Value” In Python ?",
                        "In call-by-value, the argument whether an expression or a value gets bound to the respective variable in the function.\n" +
                                "\n" +
                                "Python will treat that variable as local in the function-level scope. Any changes made to that variable will remain local and will not reflect outside the function.",
                        "71"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Return Value Of The Trunc() Function ?",
                        "The Python trunc() function performs a mathematical operation to remove the decimal values from a particular expression and provides an integer value as its output.",
                        "72"));

        productList.add(
                new Quations_java(
                        30,
                        "Is It Mandatory For A Python Function To Return A Value ?",
                        "It is not at all necessary for a function to return any value. However, if needed, we can use None as a return value.",
                        "73"));

        productList.add(
                new Quations_java(
                        30,
                        "How Is Python Thread Safe ?",
                        "Python ensures safe access to threads. It uses the GIL mutex to set synchronization. If a thread loses the GIL lock at any time, then you have to make the code thread-safe.\n" +
                                "\n" +
                                "For example, many of the Python operations execute as atomic such as calling the sort() method on a list.",
                        "74"));

        productList.add(
                new Quations_java(
                        30,
                        "How Does Python Manage The Memory ?",
                        "Python implements a heap manager internally which holds all of its objects and data structures.\n" +
                                "\n" +
                                "This heap manager does the allocation/de-allocation of heap space for objects.",
                        "75"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Set Object In Python ?",
                        "Sets are unordered collection objects in Python. They store unique and immutable objects. Python has its implementation derived from mathematics.",
                        "76"));

        productList.add(
                new Quations_java(
                        30,
                        "What Are Errors And Exceptions In Python Programs ?",
                        "Errors are coding issues in a program which may cause it to exit abnormally.\n" +
                                "\n" +
                                "On the contrary, exceptions happen due to the occurrence of an external event which interrupts the normal flow of the program.",
                        "77"));

        productList.add(
                new Quations_java(
                        30,
                        "What Does The “Self” Keyword Do ?",
                        "The self is a Python keyword which represents a variable that holds the instance of an object.\n" +
                                "\n" +
                                "In almost, all the object-oriented languages, it is passed to the methods as a hidden parameter.",
                        "78"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Purpose Of Docstrings In Python ?",
                        "In Python, the docstring is what we call as the docstrings. It sets a process of recording Python functions, modules, and classes.\n",
                        "79"));

        productList.add(
                new Quations_java(
                        30,
                        "Which Python Function Will You Use To Convert A Number To A String ?",
                        "For converting a number into a string, you can use the built-in function str().  If you want an octal or hexadecimal representation, use the inbuilt function oct() or hex().",
                        "80"));

        productList.add(
                new Quations_java(
                        30,
                        "List Down Some Of The PDB Commands For Debugging Python Programs ?",
                        "Here are a few PDB commands to start debugging Python code.\n" +
                                "\n" +
                                " * Add breakpoint (b)\n" +
                                " * Resume execution (c)\n" +
                                " * Step by step debugging (s)\n" +
                                " * Move to the next line (n)\n" +
                                " * List source code (l)\n" +
                                " * Print an expression (p)",
                        "81"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Command To Debug A Python Program ?",
                        "$ python -m pdb python-script.py",
                        "82"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is A Function Call Or A Callable Object In Python ?",
                        "A function in Python gets treated as a callable object. It can allow some arguments and also return a value or multiple values in the form of a tuple. Apart from the function, Python has other constructs, such as classes or the class instances which fits in the same category.",
                        "83"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is The Return Keyword Used For In Python ?",
                        "The purpose of a function is to receive the inputs and return some output.\n" +
                                "\n" +
                                "The return is a Python statement which we can use in a function for sending a value back to its caller.",
                        "84"));

        productList.add(
                new Quations_java(
                        30,
                        "What does an object() do ?",
                        "It returns a featureless object that is a base for all classes. Also, it does not take any parameters.",

                        "85"));

        productList.add(
                new Quations_java(
                        30,
                        "What Is “Call By Reference” In Python ?",
                        "We use both “call-by-reference” and “pass-by-reference” interchangeably. When we pass an argument by reference, then it is available as an implicit reference to the function, rather than a simple copy. In such a case, any modification to the argument will also be visible to the caller.\n" +
                                "\n" +
                                "This scheme also has the advantage of bringing more time and space efficiency because it leaves the need for creating local copies.\n" +
                                "\n" +
                                "On the contrary, the disadvantage could be that a variable can get changed accidentally during a function call. Hence, the programmers need to handle in the code to avoid such uncertainty.",
                        "86"));

        productList.add(
                new Quations_java(
                        30,
                        "What are Python packages ?",
                        "Python packages are namespaces containing multiple modules.",
                        "87"));

        productList.add(
                new Quations_java(
                        30,
                        "How can files be deleted in Python ?",
                        "To delete a file in Python, you need to import the OS Module. After that, you need to use the os.remove() function.\n" +
                                "\n" +
                                "Example:\n" +
                                "\n" +

                                "import os\n" +
                                "os.remove(\"xyz.txt\")",
                        "88"));

        productList.add(
                new Quations_java(
                        30,
                        "What are the built-in types of python ?",
                        " Built-in types in Python are as follows –\n" +
                                "\n" +
                                "1.Integers\n" +
                                "2.Floating-point\n" +
                                "3.Complex numbers\n" +
                                "4.Strings\n" +
                                "5.Boolean\n" +
                                "6.Built-in functions",
                        "89"));

        productList.add(
                new Quations_java(
                        30,
                        "How to remove values to a python array ?",
                        "Array elements can be removed using pop() or remove() method. The difference between these two functions is that the former returns the deleted value whereas the latter does not.",
                        "90"));

        productList.add(
                new Quations_java(
                        30,
                        "Does Python have OOps concepts ?",
                        "Python is an object-oriented programming language. This means that any program can be solved in python by creating an object model. However, Python can be treated as procedural as well as structural language.",
                        "91"));

        productList.add(
                new Quations_java(
                        30,
                        "What is split used for ?",
                        "The split() method is used to separate a given string in Python.\n" +
                                "\n" +
                                "Example:\n" +
                                "\n" +
                                "1\n" +
                                "2\n" +
                                "a=\"SteveBrains python\"\n" +
                                "print(a.split())\n" +
                                "Output:  [‘SteveBrains’, ‘python’]\n",
                        "92"));

        productList.add(
                new Quations_java(
                        30,
                        "How to import modules in python ?",
                        "Modules can be imported using the import keyword.  You can import modules in three ways-\n" +
                                "\n" +
                                "Example:\n" +
                                "\n" +
                                "import array           #importing using the original module name\n" +
                                "import array as arr    # importing using an alias name\n" +
                                "from array import *    #imports everything present in the array module",
                        "93"));

        productList.add(
                new Quations_java(
                        30,
                        "Class in Python is created using the class keyword .",
                        "Example:\n" +
                                "\n" +
                                "class Employee:\n" +
                                "def __init__(self, name):\n" +
                                "self.name = name\n" +
                                "E1=Employee(\"abc\")\n" +
                                "print(E1.name)\n" +
                                "Output: abc",
                        "94"));

        productList.add(
                new Quations_java(
                        30,
                        "Does python support multiple inheritance ?",
                        "Multiple inheritance means that a class can be derived from more than one parent classes. Python does support multiple inheritance, unlike Java.",
                        "95"));

        productList.add(
                new Quations_java(
                        30,
                        "Define encapsulation in Python ?",
                        "Encapsulation means binding the code and the data together. A Python class in an example of encapsulation.",
                        "96"));

        productList.add(
                new Quations_java(
                        30,
                        "How do you do data abstraction in Python ?",
                        "Data Abstraction is providing only the required details and hiding the implementation from the world. It can be achieved in Python by using interfaces and abstract classes.",
                        "97"));

        productList.add(
                new Quations_java(
                        30,
                        "Does python make use of access specifiers ?",
                        "Python does not deprive access to an instance variable or function. Python lays down the concept of prefixing the name of the variable, function or method with a single or double underscore to imitate the behavior of protected and private access specifiers.  ",
                        "98"));

        productList.add(
                new Quations_java(
                        30,
                        "How to create an empty class in Python ? ",
                        "An empty class is a class that does not have any code defined within its block. It can be created using the pass keyword. However, you can create objects of this class outside the class itself. IN PYTHON THE PASS command does nothing when its executed. it’s a null statement. \n" +
                                "For example-\n" +
                                "\n" +

                                "class a:\n" +
                                "  &nbsp; pass\n" +
                                "obj=a()\n" +
                                "obj.name=\"xyz\"\n" +
                                "print(\"Name = \",obj.name)\n" +
                                "Output: \n" +
                                "\n" +
                                "Name =  xyz",
                        "99"));

        productList.add(
                new Quations_java(
                        30,
                        "Is python numpy better than lists ?",
                        "We use python numpy array instead of a list because of the below three reasons:\n" +
                                "\n" +
                                "1.Less Memory\n" +
                                "2.Fast\n" +
                                "3.Convenient",
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



