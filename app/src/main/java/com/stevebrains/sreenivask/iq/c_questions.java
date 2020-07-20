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


public class c_questions extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.c_questions);

        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("C Interview Q 2020");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
//        toolbar.setLogo(R.drawable.tool_icon);


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
                        "Who invented C Language ?",
                        "Dennis Ritchie in 1972 developed a new language by inheriting the features of both BCPL and B and adding additional features. He named the language as just C.",
                        "1"
                ));

        productList.add(
                new Quations_java(
                        2,
                        "Who invented B Language ?",
                        "Static class loading involves the creation of objects and instances using new keywords, and dynamic class loading is done when the name of the class is not known at compile time.",
                        "2"));

        productList.add(
                new Quations_java(
                        2,
                        "Who invented BCPL Language ?",
                        "Basic Combined Programming Language(BCPL) was developed by Martin Richards, Cambridge university.",
                        "3"));

        productList.add(
                new Quations_java(
                        2,
                        "Why C Language ?",
                        "C is one of the high level languages. It is a general purpose language, which means it can be used to write programs of any sort.",
                        "4"));


        productList.add(
                new Quations_java(
                        2,
                        "What are the features of C Langauges ?",
                        "=> In C one can write programs like that of high level languages as in COBOL, BASIC, FORTRAN etc. as well as it permits very close interaction with the inner workings of the computer.\n" +
                                "=> It is a general purpose programming language. It is usually called system programming language but equally suited to writing a variety of applications.\n" +
                                "=> It supports various data types\n" +
                                "=> It follows the programming style based on fundamental control flow constructions for structured programming\n" +
                                "=> Functions may be predefined or user defined and they may return values of basic types, structures, unions or pointers.\n",
                        "5"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the advantages of c language ?",
                        "=> Easy to write\n" +
                                "=> Rich set of operators and functions that are built–in\n" +
                                "=> Support for bit–wise operation\n" +
                                "=> Flexible use of pointers\n" +
                                "=> Direct control over the hardware\n" +
                                "=> Ability to access BIOS/DOS routines\n" +
                                "=> Interacting using Interrupts\n" +
                                "=> Ability to write TSR programs\n" +
                                "=> Ability to create .COM files\n" +
                                "=> Ability to create library files (.LIB)\n" +
                                "=> Ability to write interface programs\n" +
                                "=> Incorporating assembly language in C program\n",
                        "6"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the disadvantages of c language ?",
                        "=> C is considered difficult to learn\n" +
                                "=> Because of its conciseness, the code can be difficult to follow\n" +
                                "=> It is not suited to applications that require a lot of report formatting and data file manipulation\n",
                        "7"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the salient features of c languages ?",
                        "=> The following are the salient features of C language are :\n" +
                                "=> C is called a middle level language\n" +
                                "=> C supports structured design approach\n" +
                                "=> C is extensible\n" +
                                "=> C is rich in data types and operators\n" +
                                "=> C is portable",
                        "8"));

        productList.add(
                new Quations_java(
                        2,
                        "What is a header file ?",
                        "Header files provide the definitions and declarations for the library functions. Thus, each header file contains the library functions along with the necessary definitions and declarations. For example, stdio.h, math.h, stdlib.h, string.h etc.\n",
                        "9"));

        productList.add(
                new Quations_java(
                        2,
                        "What is character set ? ",
                        "Character set is the set of characters allowed and supported in the programming language.\n" +
                                "Generally a program is a collection of instructions, which contain groups of characters. Only a limited set of characters is allowed to write instructions in the program.\n",
                        "10"));

        productList.add(
                new Quations_java(
                        2,
                        "What is C token ?",
                        "The smallest individual units of a C program are known as tokens.",
                        "11"));

        productList.add(
                new Quations_java(
                        2,
                        "List the different types of C tokens ?",
                        "=> Constants\n" +
                                "=> Identifiers\n" +
                                "=> Keywords\n" +
                                "=> Operators\n" +
                                "=> Special symbols\n" +
                                "=> Strings",
                        "12"));

        productList.add(
                new Quations_java(
                        2,
                        "What is a string ?",
                        "A string is a sequence of characters ending with NUL. It can be treated as a one–dimensional array of characters terminated by a NUL character.\n",
                        "13"));

        productList.add(
                new Quations_java(
                        2,
                        "What are qualifiers ?",
                        "Qualifiers or modifiers are identifiers that may precede the scalar data types (except float) to specify the number of bits used for representing the respective type of data in memory. The qualifiers in C are short, long, signed, and unsigned.\n",
                        "14"));

        productList.add(
                new Quations_java(
                        2,
                        "What is a function ?",
                        "A function is a set of statements to perform a specific task.",
                        "15"));

        productList.add(
                new Quations_java(
                        2,
                        "What is a constant ?",
                        "A constant is a value that does not change during the program execution. A constant used in C does not occupy memory.",
                        "16"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the different types of constants ?",
                        "=> There are five types of constants. They are :\n" +
                                "=> Integer constants\n" +
                                "=> Floating point constants\n" +
                                "=> Character constants\n" +
                                "=> String literals\n" +
                                "=> Enumeration constants\n" +
                                "\n",
                        "17"));

        productList.add(
                new Quations_java(
                        2,
                        "What is variable ?",
                        "An identifier is used to identify and store some value. If the value of the identifier is changed during the execution of the program, then the identifier is known as variable.",
                        "18"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the rules for the identifier ?",
                        "=> The first character must be an alphabet or underscore (_)\n" +
                                "=> Digits may be included in the variable\n" +
                                "=> The maximum number of characters in a word are 32 (It may vary depending upon the platform)\n" +
                                "=> No other special characters are allowed.",
                        "19"));

        productList.add(
                new Quations_java(
                        2,
                        "What are global variables ?",
                        "Global Variables are those, which are required to be acccessed by all the functions defined after their declaration. So, the variables declared before the main {) can be acccessed by all the functions, which follow their declaration.",
                        "20"));

        productList.add(
                new Quations_java(
                        2,
                        "What is a keyword in c ?",
                        "Keywords are those words of C which have predefined meaning assigned by the C language.\n" +
                                "They form a part of the database required by the C compiler.\n",
                        "21"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the different types of c instructions ?",
                        "=> There are basically three types of instructions in C are :\n" +
                                "=> Type Declaration Instruction\n" +
                                "=> Arithmetic Instruction\n" +
                                "=> Control Instruction",
                        "22"));

        productList.add(
                new Quations_java(
                        2,
                        "What is an expression ?",
                        "Expression is defined as a combination of operands and operators to obtain some computation. Operands represent variables or values and The operator tells is what operation to be performed.",
                        "23"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the types of data files ?",
                        "=> There are two types of data files :\n" +
                                "=> stream oriented or standard data files\n" +
                                "=> system oriented or low level data files\n",
                        "24"));

        productList.add(
                new Quations_java(
                        2,
                        "Why C is called a middle level language ?",
                        "C combines the features of both Assembly Level Languages (Low Level Languages) and Higher Level Languages. For this reason, C is referred to as a Middle Level Language. The feature of ALLs is that of enabling us to develop system level programs and the features of HLLs are those of higher degree of readability and machine independence.\n",
                        "25"));

        productList.add(
                new Quations_java(
                        2,
                        "How can variables be characterized ?",
                        "The variables can be categorized by storage class as well as by data type. The storage class specifies the portion of the program within which the variables are recognized.\n",
                        "26"));

        productList.add(
                new Quations_java(
                        2,
                        "Give the rules for variable declaration ?",
                        "=> The rules for variable declaration in C are given below :\n" +
                                "=> A variable name consists of alphabets, digits and the underscore (_) character\n" +
                                "=> The length of variable should be kept upto 8 characters though your system may allow upto 40 characters\n" +
                                "=> They must begin with an alphabet\n" +
                                "=> Some systems also recognize an underscore as the first character\n" +
                                "=> White space and commas are not allowed\n" +
                                "=> Any reserved word (keyword) cannot be used as a variable name.\n",
                        "27"));

        productList.add(
                new Quations_java(
                        2,
                        "What is the purpose of type declarations ?",
                        "The type declaration allow to create a synonym for other data types. Its syntax is typedef type identifier; The declaration typedef unsigned long int INTEGER",
                        "28"));

        productList.add(
                new Quations_java(
                        2,
                        "What is recursion ?",
                        "C language a function may call another function. When a function calls itself, it is referred to as recursive call and the process is known as recursion. C provides very good facilities for recursion.\n",
                        "29"));

        productList.add(
                new Quations_java(
                        2,
                        "What is data types ?",
                        "Data types refer to the classes of data that can be manipulated by C programs. The three fundamental data types supported by C are character, integer and real type.",
                        "30"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the types of macro formats ?",
                        "=> There are two types of macro formats. There are\n" +
                                "=> Simple\n" +
                                "=> Parameterized\n",
                        "31"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the different types of errors ?",
                        "=> Compile–Time Errors\n" +
                                "=> Linker Errors\n" +
                                "=> Runtime Errors\n" +
                                "=> Logical Errors",
                        "32"));

        productList.add(
                new Quations_java(
                        2,
                        "What is meant by errors and debugging ?",
                        "Errors may be made during program creation even by experienced programmers. Such type of errors are detected by the compiler.\n" +
                                "Debugging means removing the errors..",
                        "33"));

        productList.add(
                new Quations_java(
                        2,
                        "What is the purpose of main() function ?",
                        "=> The function main() invokes other functions within it.It is the first function to be called when the program starts execution.\n" +
                                "=> It is the starting function.\n" +
                                "=> It returns an int value to the environment that called the program.\n" +
                                "=> Recursive call is allowed for main( ) also.\n" +
                                "=> It is a user-defined function.\n",
                        "34"));

        productList.add(
                new Quations_java(
                        2,
                        "What is meant by type casting ?",
                        "It is the explicit type conversion required for a number before carrying out processing or assigning to another variable.\n",
                        "35"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the primitive data types in c ?",
                        "There are five different kinds of data types in C.\n" +
                                "=> Char\n" +
                                "=> Int\n" +
                                "=> Float\n" +
                                "=> Double\n" +
                                "=> Void",
                        "36"));

        productList.add(
                new Quations_java(
                        2,
                        "What is the use of typedef ?",
                        "The typedef help in easier modification when the programs are ported to another machine. A descriptive new name given to the existing data type may be easier to understand the code.",
                        "37"));

        productList.add(
                new Quations_java(
                        2,
                        "What is meant by type specifiers ?",
                        "Type specifiers decide the amount of memory space occupied by a variable. In the ease of integral types; it also explicitly states the range of values that the object can hold..",
                        "38"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the types of type specifiers?",
                        "=> The available data type specifiers are :\n" +
                                "=> Short\n" +
                                "=> Long\n" +
                                "=> Signed\n" +
                                "=> Unsigned ",
                        "39"));

        productList.add(
                new Quations_java(
                        2,
                        "What is masking in c ?",
                        "Masking is a process in which a given bit pattern is partly extracted into another bit pattern by means of a logical bitwise operation.\n",
                        "40"));

        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between single charater constant and string constant ?",
                        "=> A single character constant consists of only one character and it is enclosed within a pair of single quotes.\n" +
                                "=> A string constant consists of one or more characters and it is enclosed within a pair of double quotes.",
                        "41"));

        productList.add(
                new Quations_java(
                        2,
                        "What is signed and unsigned?",
                        "A numeric value, may have a positive or a negative sign. In the memory, for a variable, one bit is used exclusively to maintain the sign of the data. If we don't have sign, the sign bit also may be used for data. If the value is negative, the sign bit is 1, and if it is positive, it will be 0.",
                        "42"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the different categories of functions in C ?",
                        "=> In C, the functions can be divided into the following categories :\n" +
                                "=> Functions with no arguments and no return values\n" +
                                "=> Functions having arguments but no return values\n" +
                                "=> Functions having arguments and return values also",
                        "43"));
        productList.add(
                new Quations_java(
                        2,
                        "What is this pointer ?",
                        "It is a pointer that points to the current object. This can be used to access the members of the current object with the help of the arrow operator",
                        "44"));
        productList.add(
                new Quations_java(
                        2,
                        "What is zero based addressing ?",
                        "The array subscripts always start at zero. The compiler makes use of subscript values to identify the elements in the array. Since subscripts start at 0, it is said that array uses zerobased addressing.\n",
                        "45"));
        productList.add(
                new Quations_java(
                        2,
                        "What is a loop ?",
                        "A loop is a process to do a job repeatedly with possibly different data each time. The statements executed each time constitute the loop body, and each pass is called iteration. A condition must be present to terminate the loop.",
                        "46"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of data types and explain ?",
                        "There are five basic Data types in C. These are :\n" +
                                "=> void : means nothing i.e. no data involvement in an action\n" +
                                "=> char : to work with all types of characters used in computer operations\n" +
                                "=> int : to work with an integer type of data in any computational work\n" +
                                "=> float : to work with the real type of data or scientific numbers in the exponential form\n" +
                                "=> double : to work with double precision of numbers when the approximation is very crucial.",
                        "47"));
        productList.add(
                new Quations_java(
                        2,
                        "What is friend function ?",
                        "The function declaration should be preceded by the keyword friend.The function definitions does not use either the keyword or the scope operator ::.\n" +
                                "The functions that are declared with the keyword friend as friend function.Thus, a friend function is an ordinary function or a member of another class.\n",
                        "48"));
        productList.add(
                new Quations_java(
                        2,
                        "What is break statement?",
                        "When a break is encountered inside a loop, the loop is terminated and the control passes to the statement following the body of the loop.\n",
                        "49"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the use of getchar() function?",
                        "It returns a character just entered from the standard input unit, that is, keyboard. The entered character can be either assigned to a character variable or echoed to the computer screen.",
                        "50"));
        productList.add(
                new Quations_java(
                        2,
                        "What is a pointer ?",
                        "A pointer is a variable that represents the location (rather than the value) of a data item, such as a variable or an array element. It is a variable that holds a memory address. This address is the location of another variable or an array element in memory.",
                        "51"));
        productList.add(
                new Quations_java(
                        2,
                        "How to declare pointer variables ?",
                        "If a variable is going to be a pointer, it must be declared as such. A pointer declaration consists of a base type, an *, and the variable name. The general form for declaring a pointer variable is data _type * var_ name;\n    ",
                        "52"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between fread buffer() and fwrite buffer() ?",
                        "Fread(), buffer is a pointer to an area of memory that will receive the data from the file. For fwrite(), buffer is a pointer to the information that will be written to the file. The value of count determines how many items are read or written, with each item being num_byte bytes in length.\n" +
                                "The size_t in both the formats is defined as some kind of unsigned integer. Finally, fp is a file pointer to a previously opened file.",
                        "53"));
        productList.add(
                new Quations_java(
                        2,
                        "What is macro ?",
                        "The second preprocessor function is macro definition. A macro is formal syntax that can be used to generate statements for use in a program. For the C language, the macro generates C statements.\n",
                        "54"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of I/O functions ?",
                        "=> I/O functions are grouped into two categories :\n" +
                                "=> Unformatted I/O functions\n" +
                                "=> Formatted I/O functions",
                        "55"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the difference b/w formatted&unformatted I/O functions ?",
                        "The formatted I/O functions allow programmers to specify the type of data and the way in which it should be read in or written out. On the other hand, unformatted I/O functions do not specify the type of data and the way is should be read or written.\n",
                        "56"));
        productList.add(
                new Quations_java(
                        2,
                        "How to declare pointer variables ?",
                        "If a variable is going to be a pointer, it must be declared as such. A pointer declaration consists of a base type, an *, and the variable name. The general form for declaring a pointer variable is data _type * var_ name;\n",
                        "57"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between c &c++ ?",
                        "c++ is an object oriented programing but c is a procedure oriented programing.c is super set of c++. c can't suport inheritance,function overloading, method overloading etc. but c++ can do this.In c-programe the main function could not return a value but in the c++ the main function shuld return a value.",
                        "58"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the use of putchar function ?",
                        "The putchar function displays one character on the display monitor. The character to be displayed is of type char. The syntax for putchar function is as given below :putchar (ch_var); Where ch_var is a previously declared character variable.\n",
                        "59"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the use of getchar functions ?",
                        "The getchar function accepts a single character from the keyboard. The function does not require any arguments, though a pair of empty parentheses must follow the word getchar as a syntax. It returns a single character from a standard input device (typically a keyboard ) and it can be assigned to predeclared character variable.",
                        "60"));
        productList.add(
                new Quations_java(
                        2,
                        "What is character constants ?",
                        "A character constant is a single character, enclosed within the pair of single quotation mark (apostrophes).",
                        "61"));
        productList.add(
                new Quations_java(
                        2,
                        "What is string constants ?",
                        "A string constant or literal contains a sequence of zero or more characters or escape seauences enclosed in double Quotation marks.\n",
                        "62"));
        productList.add(
                new Quations_java(
                        2,
                        "What is integer constants ?",
                        "An integer constant is an integer-valued number. It can represent decimal, octal, or hexadecimal values.",
                        "63"));
        productList.add(
                new Quations_java(
                        2,
                        "What is floating point constants ?",
                        "Floating-point constants are numbers with decimal parts. A floating-point constants consists of :\n" +
                                "=> An integral part\n" +
                                "=> A decimal point\n" +
                                "=> A fractional part\n" +
                                "=> An exponent part\n" +
                                "=> An optional suffix\n",
                        "64"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between fread and fwrite function ?",
                        "The fread() function returns the number of items read. This value may be less than count if the end of the file is reached or an error occurs. The fwrite() function returns the number of items written. This value will equal count unless an error occurs.",
                        "65"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the uses of a pointer ?",
                        "=> Pointer is used in the following cases\n" +
                                "=> It is used to access array elements\n" +
                                "=> It is used for dynamic memory allocation\n" +
                                "=> It is used in Call by reference\n" +
                                "=> It is used in data structures like trees, graph, linked list etc.\n",
                        "66"));
        productList.add(
                new Quations_java(
                        2,
                        "What are linker error ?",
                        "The Linker Errors occur during the linking process when the external symbols referred to by the program are not resolved.\n",
                        "67"));
        productList.add(
                new Quations_java(
                        2,
                        "When do we get logical errors ?",
                        "=> The Logical Errors occur if the solution procedure for the given problem itself is wrong.\n" +
                                "=> In this case, the outputs produced by the programs would be incorrect.\n" +
                                "=> Correcting the solution procedure itself by better understanding of the problem eliminates these errors.\n" +
                                "=> The Logical Errors (if any) are to be figured out by ourselves by verifying the outputs that are produced by the program.\n",
                        "68"));
        productList.add(
                new Quations_java(
                        2,
                        "Do character constants represent numerical values ?",
                        "Yes, each character constant associates an integer value with it.\n",
                        "69"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the purpose of scanf() and printf() functions  ?",
                        "=> The function scanf() is used for formatted input from the standard input and provides many of the conversion facilities.\n" +
                                "=> It is used for formatted output to standard output device, that is, screen. The format specification string and the data to be output, are the arguments (parameters) to the printf() function.",
                        "70"));
        productList.add(
                new Quations_java(
                        2,
                        " What is type qualifiers ?",
                        "Type qualifier adds properties to an identifier. Type qualifiers describe the manner in which the object will be modified. The application of qualifiers to an object does not affect the range or the arithmetic properties of the object.",
                        "71"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of type qualifiers in c ?",
                        "The two type qualifiers provided by C are :\n" +
                                "=> const\n" +
                                "=> volatile\n",
                        "72"));
        productList.add(
                new Quations_java(
                        2,
                        "What is meant by inheritance ?",
                        "Inheritance is the process by which objects of one class acquire properties of objects of another class..",
                        "73"));
        productList.add(
                new Quations_java(
                        2,
                        "Do string constants represent numerical values ?",
                        "No, the string constants donot have a corresponding numerical value.\n",
                        "74"));
        productList.add(
                new Quations_java(
                        2,
                        "What is meant by operator precedence ?",
                        "Operator precedence describes the order in which C evaluates different operators in a complex expression.",
                        "75"));
        productList.add(
                new Quations_java(
                        2,
                        "What is an Operator ?",
                        "An operator is a symbol, which instructs the computer to perform the specified manipulation over some data. The rich set of operators available in C enable us to write efficient and concise programs and this fact serves to set C apart from any other programming languages",
                        "76"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of operators in c ?",
                        "=> Assignment operator\n" +
                                "=> Arithmetic operators\n" +
                                "=> Relational operators\n" +
                                "=> Logical operators\n" +
                                "=> Increment/Decrement operators\n" +
                                "=> Shorthand arithmetic assignment operators\n" +
                                "=> Conditional operator\n" +
                                "=> Bitwise operators\n" +
                                "=> Sizeof() operator\n" +
                                "=> Comma operator",
                        "77"));
        productList.add(
                new Quations_java(
                        2,
                        "What is a ternary operator in C ?",
                        "Perhaps the most unusual operator in C language is one called the conditional expression operator. Unlike all other operators in C which are either unary or binary operators the conditional expression operator is a ternary operator; that is, it takes three operands. The two symbols that are used to denote this operator are the question mark (?) and the colon (:). The first operand is placed before the ?, the second between the ? and the and the third after the :.\n",
                        "78"));
        productList.add(
                new Quations_java(
                        2,
                        "What is assignment operator ?",
                        "An operator is a symbol that operates on a certain data type.In C, the ’=’ symbol is known as the assignment operator. It sots the value of the variable on the left hand side of it to that of the right hand side of it.\n",
                        "79"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of assignment statements ?",
                        "=> C supports a variety of assignment statements. These are given below :\n" +
                                "=> Simple assignment statement\n" +
                                "=> Multiple assignment statement\n" +
                                "=> Arithmetic assignment statement\n",
                        "80"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the sizeof () operator ?",
                        "Even though it looks like a keyword, sizeof( ) is an operator which is used to know the memory size of the data types and variables. This operator returns the number of bytes allocated for the variable (or) data type. The format of the sizeof() operator is as follows.\n" +
                                "sizeof (v);\n" +
                                "where v is a variable name / data type / value.\n",
                        "81"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the use of bitwise operator ?",
                        "The bitwise operator performs the operation on bits (i.e. bit by bit). Using the bitwise operators we can set / reset / check any bit in the value of the variable.\n",
                        "82"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the Difference between = and = = Operators ?",
                        "The two operators = and == are used for assignment and checking respectively. If not properly used, it causes many problems. The following program illustrates what will happen if we use = instead of = =.\n",
                        "83"));
        productList.add(
                new Quations_java(
                        2,
                        "What is unary operator ?",
                        "The operators that act upon a single operand to produce a new value are known as unary operators.",
                        "84"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of unary operators ?",
                        "C support unary operators are :\n" +
                                "=> minus operator -\n" +
                                "=> increment operator + +\n" +
                                "=> decrement operator –\n" +
                                "=> size operator\n" +
                                "=> (type) operator",
                        "85"));
        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between break and continue ?",
                        "The break statement is used to exit from all the loop constructs (while, do while and for) and switch.case statements, whereas the continue statement is used to skip all subsequent instructions and can control back to the loop control. The continue statement can be used for any loop construct.",
                        "86"));
        productList.add(
                new Quations_java(
                        2,
                        "What is storage class ?",
                        "The storage class in C provides the complete information about the location and visibility of variables. Scope of a variable means the portion of the program within which it can be referenced and lifetime means the time of its existence in the memory.",
                        "87"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the different storage classes in C ?",
                        "There are four types of storage classes:\n" +
                                "=> Automatic : Variable used as a local variable. This is the default one. Initial value of variable is garbage value without initialization.\n" +
                                "=> Extern : Variable used as a local variable. Retains its value during next function call.\n" +
                                "=> Regiter : Variable used as a local variable. May be stored in register if possible. Default initial value is garbage value.\n" +
                                "=> Static : Variable used as a global variable.\n",
                        "88"));
        productList.add(
                new Quations_java(
                        2,
                        "What are the types of bitwise operator ?",
                        "There are three types of bitwise operator.\n" +
                                "=> Bitwise AND(&)\n" +
                                "=> Bitwise OR(|)\n" +
                                "=> Bitwise Exclusive OR(^)",
                        "89"));
        productList.add(
                new Quations_java(
                        2,
                        "What is difference between function overloading and operator overloading ?",
                        "A function is overloaded when same name is given to different function.While overloading a function, the return type of the functions need to be the same.\n",
                        "90"));
        productList.add(
                new Quations_java(
                        2,
                        "What is getche() function ?",
                        "It returns a character just entered from the standard input unit. The entered character is echoed (displayed) to the computer screen. It reads a single character the moment it is typed without waiting for the Enter key to be hit.",
                        "91"));
        productList.add(
                new Quations_java(
                        2,
                        "What is getch() function ?",
                        "It returns a character just entered from the standard input unit. The entered character is not echoed on the screen. It reads a single character the moment it is typed without waiting for the Enter key to be hit.",
                        "92"));
        productList.add(
                new Quations_java(
                        2,
                        "What is putchar() function ?",
                        "It prints the character constant or the character variable to the standard output device. The function putchar( ) has the following form : putchar (var name)",
                        "93"));


        productList.add(
                new Quations_java(
                        2,
                        "What is an arrays ?",
                        "Arrays can be defined as a collection of variables of the same type that are referred through a common name.",
                        "94"));


        productList.add(
                new Quations_java(
                        2,
                        "What are the advantages of the functions ?",
                        "=> It reduces the complexity in a program by reducing the code\n" +
                                "=> Function are easily understanding and reliability and execution is faster\n" +
                                "=> It also reduces the time to run a program.In other way, Its directly proportional to complexity\n" +
                                "=> It’s easy to find-out the errors due to the blocks made as function definition outside the main function.",
                        "95"));

        productList.add(
                new Quations_java(
                        2,
                        "What are the characteristics of arrays in C ?",
                        "=> An array holds elements that have the same data type\n" +
                                "=> Array elements are stored in subsequent memory locations\n" +
                                "=> Two–dimensional array elements are stored row by row in subsequent memory locations\n" +
                                "=> Array name represents the address of the starting element\n" +
                                "=> Array size should be mentioned in the declaration. Array size must be a constant expression and not a variable.\n",
                        "96"));

        productList.add(
                new Quations_java(
                        2,
                        "What is the difference between arrays and pointers ?",
                        "Array is collection of similar datatype. it is a static memory allocation means we can not increment and decrement the arry size once we allocated. and we can not increment the base address, reassign address.\n" +
                                "Pointer is a dynamic memory allocation. we can allocate the size as we want, assigning into another variable and base address incrementation is allowed.",
                        "97"));

        productList.add(
                new Quations_java(
                        2,
                        "What is else if ladder ?",
                        "The else if ladder helps select one out of many alternative blocks of statements for execution depending on the mutually exclusive conditions.\n",
                        "98"));

        productList.add(
                new Quations_java(
                        2,
                        "What is class ?",
                        "A class represents description of objects that share same attributes and actions. It defines the characteristics of the objects such as attributes and actions or behaviors. It is the blue print that describes objects.",
                        "99"));
        productList.add(
                new Quations_java(
                        2,
                        "What is volatile keyword ?",
                        "The volatile keyword is intended to prevent the compiler from applying any optimizations on objects that can change in ways that cannot be determined by the compiler.\n" +
                                "Objects declared as volatile are omitted from optimization because their values can be changed by code outside the scope of current code at any time",
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


