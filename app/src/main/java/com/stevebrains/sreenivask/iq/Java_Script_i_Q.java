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

public class Java_Script_i_Q extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.java_script_i_q);




        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("JavaScript Interview Q 2020");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Quations_java(
                        1,
                        "What is JavaScript",
                        "JavaScript is a client-side as well as server side scripting language that can be inserted into HTML pages and is understood by web browsers. JavaScript is also an Object based Programming language ",
                        "1"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are JavaScript Data Types ?",
                        "Following are the JavaScript Data types:\n" +
                                "\n" +
                                "1.Number\n" +
                                "2.String\n" +
                                "3.Boolean\n" +
                                "4.Object\n" +
                                "5.Undefined",
                        "2"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Enumerate the differences between Java and JavaScript ?",
                        "Java is a complete programming language. In contrast, JavaScript is a coded program that can be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for the different intent. Java is an object - oriented programming (OOPS) or structured programming language like C++ or C whereas JavaScript is a client-side scripting language. ",
                        "3"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the use of isNaN function ?",
                        "isNan function returns true if the argument is not a number otherwise it is false. ",
                        "4"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Between JavaScript and an ASP script, which is faster ?",
                        "JavaScript is faster. JavaScript is a client-side language and thus it does not need the assistance of the web server to execute. On the other hand, ASP is a server-side language and hence is always slower than JavaScript. Javascript now is also a server side language (nodejs). ",
                        "5"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is negative infinity ?",
                        "Negative Infinity is a number in JavaScript which can be derived by dividing negative number by zero. "+"And if you change to a new line when not within a string statement, then javaScript ignores break in line. ",
                        "6"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Is it possible to break JavaScript Code into several lines ?",
                        "Breaking within a string statement can be done by the use of a backslash, '\\', at the end of the first line ",
                        "7"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Which company developed JavaScript ?",
                        "Netscape is the software company who developed JavaScript.",
                        "8"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are undeclared and undefined variables ?",
                        "Undeclared variables are those that do not exist in a program and are not declared. If the program tries to read the value of an undeclared variable, then a runtime error is encountered.\n" +
                                "\n" +
                                "Undefined variables are those that are declared in the program but have not been given any value. If the program tries to read the value of an undefined variable, an undefined value is returned. ",
                        "9"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is a prompt box ?",
                        "A prompt box is a box which allows the user to enter input by providing a text box. Label and box will be provided to enter the text or number. ",
                        "10"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is 'this' keyword in JavaScript ?",
                        "'This' keyword refers to the object from where it was called.",
                        "11"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain the working of timers in JavaScript? Also elucidate the drawbacks of using the timer, if any ?",
                        "Timers are used to execute a piece of code at a set time or also to repeat the code in a given interval of time. This is done by using the functions setTimeout, setInterval and clearInterval.\n" +

                                "The setTimeout(function, delay) function is used to start a timer that calls a particular function after the mentioned delay. The setInterval(function, delay) function is used to repeatedly execute the given function in the mentioned delay and only halts when cancelled. The clearInterval(id) function instructs the timer to stop.\n" +

                                "Timers are operated within a single thread, and thus events might queue up, waiting to be executed. ",
                        "12"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Which symbol is used for comments in Javascript?",
                        "// for Single line comments and\n" +
                                "\n" +
                                "/* Multi\n" +
                                "\n" +
                                "Line\n" +
                                "\n" +
                                "Comment\n" +
                                "\n" +
                                "*/ ",
                        "13"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the difference between ViewState and SessionState ?",
                        "'ViewState' is specific to a page in a session.\n" +
                                "\n" +
                                "'SessionState' is specific to user specific data that can be accessed across all pages in the web application. ",
                        "14"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is === operator ?",
                        "=== is called as strict equality operator which returns true when the two operands are having the same value without any type conversion. ",
                        "15"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain how can you submit a form using JavaScript ?",
                        "To submit a form using JavaScript use document.form[0].submit();\n"+"document.form[0].submit();",
                        "16"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Does JavaScript support automatic type conversion ?",
                        "Yes JavaScript does support automatic type conversion, it is the common way of type conversion used by JavaScript developers ",
                        "17"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How can the style/class of an element be changed ?",
                        "It can be done in the following way:\n" +
                                "document.getElementById(\"myText\").style.fontSize = \"20?;"+"\n" +
                                "document.getElementById(\"myText\").className = \"anyclass\";",
                        "18"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain how to read and write a file using JavaScript ?",
                        "There are two ways to read and write a file using JavaScript\n" +
                                "\n" +
                                "1.Using JavaScript extensions\n" +
                                "2.Using a web page and Active X objects",
                        "19"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are all the looping structures in JavaScript ?",
                        "Following are looping structures in Javascript:\n" +
                                "\n" +
                                "1.For\n" +
                                "2.While\n" +
                                "3.do-while loops",
                        "20"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is called Variable typing in Javascript ?",
                        "Variable typing is used to assign a number to a variable and the same variable can be assigned to a string.\n" +
                                "\n" +
                                "Example\n" +
                                "\n" +
                                "i = 10;\n" +
                                "i = \"string\";\n" +
                                "\n" +
                                "This is called variable typing. ",
                        "21"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How can you convert the string of any base to integer in JavaScript ?",
                        "The parseInt() function is used to convert numbers between different bases. parseInt() takes the string to be converted as its first parameter, and the second parameter is the base of the given string.\n" +
                                "\n" +
                                "In order to convert 4F (of base 16) to integer, the code used will be -\n" +
                                "\n" +
                                "parseInt (\"4F\", 16);\n",
                        "22"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain the difference between \"==\" and \"===\" ?",
                        "\"==\" checks only for equality in value whereas \"===\" is a stricter equality test and returns false if either the value or the type of the two variables are different. ",
                        "23"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What would be the result of 3+2+\"7\" ?",
                        "Since 3 and 2 are integers, they will be added numerically. And since 7 is a string, its concatenation will be done. So the result would be 57. ",
                        "24"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain how to detect the operating system on the client machine ?",
                        "In order to detect the operating system on the client machine, the navigator.platform string (property) should be used. ",
                        "25"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What do mean by NULL in Javascript ?",
                        "The NULL value is used to represent no value or no object. It implies no object or null string, no valid boolean value, no number and no array object. ",
                        "26"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the function of delete operator ?",
                        "The delete keyword is used to delete the property as well as its value.\n" +
                                "\n" +
                                "Example\n" +
                                "\n" +
                                "var student= {age:20, batch:\"ABC\"};\n" +
                                "delete student.age;",
                        "27"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is an undefined value in JavaScript ?",
                        "Undefined value means the\n" +
                                "\n" +
                                "1.Variable used in the code doesn't exist\n" +
                                "2.Variable is not assigned to any value\n" +
                                "3.Property doesn't exist",
                        "28"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are all the types of Pop up boxes available in JavaScript ?",
                        "1.Alert\n" +
                                "2.Confirm and\n" +
                                "3.Prompt",
                        "29"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the use of Void(0) ?",
                        "Void(0) is used to prevent the page from refreshing and parameter \"zero\" is passed while calling.\n" +

                                "Void(0) is used to call another method without refreshing the page. ",
                        "30"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How can a page be forced to load another page in JavaScript ?",
                        "The following code has to be inserted to achieve the desired effect:\n" +
                                "\n" +
                                "<script language=\"JavaScript\" type=\"text/javascript\" >\n" +
                                "\n" +
                                "<!-- location.href=\"http://newhost/newpath/newfile.html\"; //--></script>",
                        "31"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the data type of variables of in JavaScript ?",
                        "All variables in the JavaScript are object data types. ",
                        "32"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the difference between an alert box and a confirmation box ?",
                        "An alert box displays only one button which is the OK button.\n" +

                                "But a Confirmation box displays two buttons namely OK and cancel. ",
                        "33"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are escape characters ?",
                        "Escape characters (Backslash) is used when working with special characters like single quotes, double quotes, apostrophes and ampersands. Place backslash before the characters to make it display. ",
                        "34"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are JavaScript Cookies ?",
                        "Cookies are the small test files stored in a computer and it gets created when the user visits the websites to store information that they need. Example could be User Name details and shopping cart information from the previous visits. ",
                        "35"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain what is pop()method in JavaScript ?",
                        "The pop() method is similar as the shift() method but the difference is that the Shift method works at the start of the array. Also the pop() method take the last element off of the given array and returns it. The array on which is called is then altered. ",
                        "36"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Whether JavaScript has concept level scope ?",
                        "No. JavaScript does not have concept level scope. The variable declared inside the function has scope inside the function. ",
                        "37"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Mention what is the disadvantage of using innerHTML in JavaScript ?",
                        "If you use innerHTML in JavaScript the disadvantage is\n" +
                                "\n" +
                                "1.Content is replaced everywhere\n" +
                                "2.We cannot use like \"appending to innerHTML\"\n" +
                                "3.Even if you use +=like \"innerHTML = innerHTML + 'html'\" still the old content is replaced by html\n" +
                                "4.The entire innerHTML content is re-parsed and build into elements, therefore its much slower\n" +
                                "5.The innerHTML does not provide validation and therefore we can potentially insert valid and broken HTML in the document and break it",
                        "38"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is break and continue statements ?",
                        "Break statement exits from the current loop.\n" +
                                "\n" +
                                "Continue statement continues with next statement of the loop. ",
                        "39"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are the two basic groups of dataypes in JavaScript ?",
                        "They are as –\n" +
                                "\n" +
                                "1.Primitive\n" +
                                "2.Reference types.\n" +
                                "\n" +
                                "Primitive types are number and Boolean data types. Reference types are more complex types like strings and dates. ",
                        "40"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How generic objects can be created ?",
                        "Generic objects can be created as: \n"+"var I = new object();",
                        "41"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the use of type of operator ?",
                        "'Typeof' is an operator which is used to return a string description of the type of a variable.",
                        "42"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Which keyword is used to print the text in the screen ?",
                        "document.write(\"Welcome\") is used to print the text – Welcome in the screen. ",
                        "43"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the use of blur function ?",
                        "Blur function is used to remove the focus from the specified object. ",
                        "44"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is variable typing?",
                        "Variable typing is used to assign a number to a variable and then assign string to the same variable. Example is as follows:\n" +
                                "\n" +
                                "i= 8;\n" +
                                "i=\"john\";",
                        "45"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How to find operating system in the client machine using JavaScript?",
                        "The 'Navigator.appversion' is used to find the name of the operating system in the client machine. ",
                        "46"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are the different types of errors in JavaScript ?",
                        "There are three types of errors:\n" +
                                "\n" +
                                "1.Load time errors: Errors which come up when loading a web page like improper syntax errors are known as Load time errors and it generates the errors dynamically.\n" +
                                "2.Run time errors: Errors that come due to misuse of the command inside the HTML language.\n" +
                                "3.Logical Errors: These are the errors that occur due to the bad logic performed on a function which is having different operation.",
                        "47"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the use of Push method in JavaScript ?",
                        "The push method is used to add or append one or more elements to the end of an Array. Using this method, we can append multiple elements by passing multiple arguments ",
                        "48"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is unshift method in JavaScript?",
                        "Unshift method is like push method which works at the beginning of the array. This method is used to prepend one or more elements to the beginning of the array. ",
                        "49"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the difference between JavaScript and Jscript?",
                        "Both are almost similar. JavaScript is developed by Netscape and Jscript was developed by Microsoft . ",
                        "50"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How are object properties assigned?",
                        "Properties are assigned to objects in the following way -\n" +
                                "\n" +
                                "obj[\"class\"] = 12;\n" +
                                "\n" +
                                "or\n" +
                                "\n" +
                                "obj.class = 12;",
                        "51"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the way to get the status of a CheckBox?",
                        "The status can be acquired as follows -\n" +

                                "alert(document.getElementById('checkbox1').checked);\n" +

                                "If the CheckBox will be checked, this alert will return TRUE.",
                        "52"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How can the OS of the client machine be detected?",
                        "The navigator.appVersion string can be used to detect the operating system on the client machine. ",
                        "53"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain window.onload and onDocumentReady?",
                        "The onload function is not run until all the information on the page is loaded. This leads to a substantial delay before any code is executed.\n" +
                                "\n" +
                                "onDocumentReady loads the code just after the DOM is loaded. This allows early manipulation of the code. ",
                        "54"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How will you explain closures in JavaScript? When are they used?",
                        "Closure is a locally declared variable related to a function which stays in memory when the function has returned. ",
                        "55"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How can a value be appended to an array ?",
                        "A value can be appended to an array in the given manner -\n" +
                                "\n" +
                                "arr[arr.length] = value; ",
                        "56"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain the for-in loop?",
                        "The for-in loop is used to loop through the properties of an object.\n" +
                                "\n" +
                                "The syntax for the for-in loop is -\n" +
                                "\n" +
                                "for (variable name in object){\n" +
                                "\tstatement or block to execute\n" +
                                "}\n" +
                                "\n" +
                                "In each repetition, one property from the object is associated to the variable name, and the loop is continued till all the properties of the object are depleted. ",
                        "57"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Define event bubbling?",
                        "JavaScript allows DOM elements to be nested inside each other. In such a case, if the handler of the child is clicked, the handler of parent will also work as if it were clicked too. ",
                        "58"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Is JavaScript case sensitive? Give an example?",
                        "Yes, JavaScript is case sensitive. For example, a function parseInt is not same as the function Parseint. ",
                        "59"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What boolean operators can be used in JavaScript?",
                        "The 'And' Operator (&&), 'Or' Operator (||) and the 'Not' Operator (!) can be used in JavaScript.\n" +
                                "\n" +
                                "*Operators are without the parenthesis. ",
                        "60"
                ));

        productList.add(
                new Quations_java(
                        1,
                        " How can a particular frame be targeted, from a hyperlink, in JavaScript?",
                        "This can be done by including the name of the required frame in the hyperlink using the 'target' attribute.\n" +
                                "\n" +
                                "<a href=\"/newpage.htm\" target=\"newframe\">>New Page</a>",
                        "61"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the role of break and continue statements?",
                        "Break statement is used to come out of the current loop while the continue statement continues the current loop with a new recurrence. ",
                        "62"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Write the point of difference between web-garden and a web-farm?",
                        "Both web-garden and web-farm are web hosting systems. The only difference is that web-garden is a setup that includes many processors in a single server while web-farm is a larger setup that uses more than one server. ",
                        "63"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How are object properties assigned?",
                        "Assigning properties to objects is done in the same way as a value is assigned to a variable. For example, a form object's action value is assigned as 'submit' in the following manner - Document.form.action=\"submit\"",
                        "64"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is the method for reading and writing a file in JavaScript?",
                        "This can be done by Using JavaScript extensions (runs from JavaScript Editor), example for opening of a file -\n" +
                                "\n" +
                                "fh = fopen(getScriptPath(), 0);",
                        "65"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How are event handlers utilized in JavaScript?",
                        "Events are the actions that result from activities, such as clicking a link or filling a form, by the user. An event handler is required to manage proper execution of all these events. Event handlers are an extra attribute of the object. This attribute includes event's name and the action taken if the event takes place. ",
                        "66"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Explain the role of deferred scripts in JavaScript?",
                        "By default, the parsing of the HTML code, during page loading, is paused until the script has not stopped executing. It means, if the server is slow or the script is particularly heavy, then the webpage is displayed with a delay. While using Deferred, scripts delays execution of the script till the time HTML parser is running. This reduces the loading time of web pages and they get displayed faster. ",
                        "67"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are the various functional components in JavaScript?",
                        "The different functional components in JavaScript are-\n" +

                                "First-class functions: Functions in JavaScript are utilized as first class objects. This usually means that these functions can be passed as arguments to other functions, returned as values from other functions, assigned to variables or can also be stored in data structures.\n" +

                                "Nested functions: The functions, which are defined inside other functions, are called Nested functions. They are called 'everytime' the main function is invoked. ",
                        "68"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What are Screen objects?",
                        "Screen objects are used to read the information from the client's screen. The properties of screen objects are -\n" +
                                "\n" +
                                "1.AvailHeight: Gives the height of client's screen\n" +
                                "2.AvailWidth: Gives the width of client's screen.\n" +
                                "3.ColorDepth: Gives the bit depth of images on the client's screen\n" +
                                "4.Height: Gives the total height of the client's screen, including the taskbar\n" +
                                "5.Width: Gives the total width of the client's screen, including the taskbar",
                        "69"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Why it is not advised to use innerHTML in JavaScript?",
                        "innerHTML content is refreshed every time and thus is slower. There is no scope for validation in innerHTML and, therefore, it is easier to insert rouge code in the document and, thus, make the web page unstable. ",
                        "70"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What does the following statement declares?",
                        "var myArray = [[[]]];\n" +
                                "\n" +
                                "It declares a three dimensional array. ",
                        "71"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How are JavaScript and ECMA Script related?",
                        "ECMA Script are like rules and guideline while Javascript is a scripting language used for web development. ",
                        "72"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is namespacing in JavaScript and how is it used?",
                        "Namespacing is used for grouping the desired functions, variables etc. under a unique name. It is a name that has been attached to the desired functions, objects and properties. This improves modularity in the coding and enables code reuse. ",
                        "73"
                ));

        productList.add(
                new Quations_java(
                        1,
                        " what are the advantages of Javascript ?",
                        "Advantages are listed below :\n" +

                                "Ø Quick Development\n" +

                                "Ø Easy to Learn\n" +

                                "Ø Platform Independence\n" +

                                "Ø Small Overhead",
                        "74"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Is JavaScript Case Sensitive? Give An Example?",
                        "Yes, JavaScript is case sensitive. For example, a function parseInt is not same as the function Parseint.",
                        "75"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "Is it possible to break JavaScript Code into several lines?",
                        "Breaking within a string statement can be done by the use of a backslash, ‘\\’, at the end of the first line\n",
                            
                        "76"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "How will you explain closures in JavaScript? When are they used?",
                        "Closure is a locally declared variable related to a function which stays in memory when the function has returned.",
                        "77"
                ));
        productList.add(
                new Quations_java(
                        1,
                        " How are object properties assigned?\n",
                        "Assigning properties to objects is done in the same way as a value is assigned to a variable. For example, a form object’s action value is assigned as ‘submit’ in the following manner — Document.form.action=”submit”",
                        "78"
                ));  productList.add(
                new Quations_java(
                        1,
                        "How do you change the style/class on any element?",
                        "document.getElementById(“myid”).style.fontSize = “14″;",
                        "80"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How to declare variable using JavaScript?",
                        "Variable in JavaScript can be declared using var keyword. The declaration for JavaScript variable is given below:var a=5;",
                        "81"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is typeof arguments?",
                        "Object. Arguments are like arrays but not arrays. They have length, can be accessed by index but you can’t push, pop and so on.",
                        "82"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Is JavaScript faster than ASP script?",
                        "Yes, because it doesn’t require web server’s support for execution.",
                        "83"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are events in JavaScript?",
                        "HTML events can be interacted with JavaScript to make interactive web design. Some of the commonly used HTML events in JavaScript are onClick, OnLoad, onchange etc.",
                        "84"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How to declare variable using JavaScript?",
                        "Variable in JavaScript can be declared using var keyword. The declaration for JavaScript variable is given below:var a=5;",
                        "85"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How to get value from a textbox?",
                        "alert(document.getElementById(‘textboxid’).value);",
                        "86"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How do you change the style/class on any element?",
                        "document.getElementById(“myid”).style.fontSize = “14″;",
                        "87"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How will you explain closures in JavaScript? When are they used?",
                        "Closure is a locally declared variable related to a function which stays in memory when the function has returned.",
                        "88"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How are object properties assigned?",
                        "Assigning properties to objects is done in the same way as a value is assigned to a variable. For example, a form object’s action value is assigned as ‘submit’ in the following manner — Document.form.action=”submit”",
                        "89"
                ));
        productList.add(
                new Quations_java(
                        1,
                        " How can the OS of the client machine be detected?",
                        "The navigator.appVersion string can be used to detect the operating system on the client machine.",
                        "90"
                ));

        productList.add(
                new Quations_java(
                        1,
                        "What is differential inheritance?",
                        "Differential Inheritance is a common prototype-oriented model that uses the concept that most objects are derived from other, more generic objects, and only differ in a few small aspects. Each object maintains a reference to its prototype and a table of properties that are different.",
                        "91"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is Javascript BOM?",
                        "BOM stands for “Browser Object Modal” that allows Javascript to ‘talk’ to the browser, no standards, modern browsers implement similar BOMS — window, screen, location, history, navigator, timing, cookies.",
                        "92"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Explain the difference between JavaScript and an ASP script.",
                        "JavaScript is a client-side language whereas ASP script is a server-side language which requires the assistance of web server to execute. Since JavaScript doesn’t require web server for execution, it is faster than ASP script.",
                        "93"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the difference between == and === ?",
                        "The == checks for value equality, but === checks for both type and value.",
                        "94"
                ));
        productList.add(
                new Quations_java(
                        1,
                        " What is constructor property?",
                        "Constructor property of an object maintains a reference to its creator function",
                        "95"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the use of isNaN function?",
                        "Answer: The isNan function can be used for returning true if the argument is not a number. When the argument is not true, it returns false.",
                        "96"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What do you mean by NULL in JavaScript?",
                        "NULL represents no value or no object. It simply means no object or null string, no array object, no number and no valid Boolean value.",
                        "97"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How we can submit a form using javascript?\n",
                        "For submitting a form from javascript we have to use — document.form[0].submit() method.",
                        "98"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How we can read and write file in javascript?",
                        "Below are the ways to read and write files in javascript –\n" +

                                "Ø Using Active X objects\n" +

                                "Ø Using Javascript Extension",
                        "99"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is “SetInterval” function in javascript?",
                        "“SetInterval” function is used to call the function (given as a parameter) repeatedly after some time delay. Below is the javascript code for the same –\n" +
                                "\n" +
                                "setInterval (function(){ alert(“Text to Show”); }, 5000);",
                        "100"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What’s a way to append a value to an array?\n",
                        "arr[arr.length] = value;",
                        "101"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What does javascript null mean?",
                        "The null value is a unique value representing no value or no object.\n" +
                                "\n" +
                                "It implies no object,or null string,no valid boolean value,no number and no array object.",
                        "101"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Does javascript have the concept level scope?",
                        "No. JavaScript does not have block level scope, all the variables declared inside a function possess the same level of scope unlike c,c++,java.",
                        "102"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the use of Math Object in JavaScript?",
                        "The math object provides you properties and methods for mathematical constants and functions.",
                        "103"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is differential inheritance?",
                        "Differential Inheritance is a common prototype-oriented model that uses the concept that most objects are derived from other, more generic objects, and only differ in a few small aspects. Each object maintains a reference to its prototype and a table of properties that are different.",
                        "104"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is Javascript BOM?",
                        "BOM stands for “Browser Object Modal” that allows Javascript to ‘talk’ to the browser, no standards, modern browsers implement similar BOMS — window, screen, location, history, navigator, timing, cookies.",
                        "105"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are the different objects used in JavaScripts?",
                        "JavaScript uses a hierarchical structure that applies to the objects in a document. There are some objects that show the relationship of one object to another using the language.",
                        "106"
                ));

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


