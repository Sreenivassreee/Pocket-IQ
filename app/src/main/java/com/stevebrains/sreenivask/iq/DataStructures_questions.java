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

public class DataStructures_questions extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.data_structures_questions);


        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar = findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("Data Structures IQ 2020");
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
                        "What Is Data Structure ? ",
                        "A data structure is a way of organizing data that considers not only the items stored, but also their relationship to each other. Advance knowledge about the relationship between data items allows designing of efficient algorithms for the manipulation of data.",
                        "1"
                ));

        productList.add(
                new Quations_java(
                        2,
                        "What Are The Goals Of Data Structure ?",
                        "It must rich enough in structure to reflect the actual relationship of data in real world. The structure should be simple enough for efficient processing of data.",
                        "2"));

        productList.add(
                new Quations_java(
                        2,
                        "What Does Abstract Data Type Mean ?",
                        "Data type is a collection of values and a set of operations on these values. Abstract data type refer to the mathematical concept that define the data type.\n" +
                                "\n" +
                                "It is a useful tool for specifying the logical properties of a data type.\n" +
                                "\n" +
                                "ADT consists of two parts\n" +
                                "\n" +
                                "1) Values definition\n" +
                                "2) Operation definition\n" +
                                "\n" +
                                "Example:-The value definition for the ADT RATIONAL states that RATIONAL value consists of two integers, second doesn’t equal to zero.\n" +
                                "\n" +
                                "The operator definition for ADT RATIONAL includes the operation of creation (make rational) addition, multiplication and test for equality.",
                        "3"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Difference Between A Stack And An Array ?",
                        "STACK:\n" +
                                "\n" +
                                "i) Stack is a ordered collection of items.\n" +
                                "ii) Stack is a dynamic object whose size is constantly changing as items are pushed and popped.\n" +
                                "iii) Stack may contain different data types.\n" +
                                "iv) Stack is declared as a structure containing an array to hold the element of the stack, and an integer to indicate the current stack top within the array.\n" +
                                "\n" +
                                "ARRAY:\n" +
                                "\n" +
                                "i) Array is an ordered collection of items.\n" +
                                "ii) Array is a static object i.e. no of item is fixed and is assigned by the declaration of the array.\n" +
                                "iii) It contains same data types.\n" +
                                "iv) Array can be home of a stack i.e. array can be declared large enough for maximum size of the stack.",
                        "4"));
        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Recursive Definition ?",
                        "The definition which defines an object in terms of simpler cases of itself is called recursive definition.",
                        "5"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is Sequential Search ?",
                        "In sequential search each item in the array is compared with the item being searched until a match occurs. It is applicable to a table organized either as an array or as a linked list.",
                        "6"));
        productList.add(
                new Quations_java(
                        2,
                        "What Actions Are Performed When A Function Is Called ?",
                        "When a function is called\n" +
                                "\n" +
                                "i) arguments are passed.\n" +
                                "ii) local variables are allocated and initialized.\n" +
                                "ii) transferring control to the function.",
                        "7"));
        productList.add(
                new Quations_java(
                        2,
                        "What Actions Are Performed When A Function Returns ?",
                        "i) Return address is retrieved.\n" +
                                "ii) Function’s data area is freed.\n" +
                                "iii) Branch is taken to the return address.",
                        "8"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is A Linked List ?",
                        "A linked list is a linear collection of data elements, called nodes, where the linear order is given by pointers. Each node has two parts first part contain the information of the element second part contains the address of the next node in the list.",
                        "9"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Advantages Of Linked List Over Array (static Data Structure) ?",
                        "The disadvantages of array are:\n" +
                                "\n" +
                                "i) unlike linked list it is expensive to insert and delete elements in the array.\n" +
                                "ii) One can’t double or triple the size of array as it occupies block of memory space.\n" +
                                "\n" +
                                "In linked list\n" +
                                "\n" +
                                "i) each element in list contains a field, called a link or pointer which contains the address of the next element.\n" +
                                "ii) Successive element’s need not occupy adjacent space in memory.",
                        "10"));
        productList.add(
                new Quations_java(
                        2,
                        "We Apply Binary Search Algorithm To A Sorted Linked List, Why ?",
                        "No we cannot apply binary search algorithm to a sorted linked list, since there is no way of indexing the middle element in the list. This is the drawback in using linked list as a data structure.",
                        "11"));
        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Free Pool ?",
                        "Pool is a list consisting of unused memory cells which has its own pointer.",
                        "12"));
        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Garbage Collection ?",
                        "It is a technique in which the operating system periodically collects all the deleted space onto the free storage list.\n" +
                                "\n" +
                                "It takes place when there is minimum amount of space left in storage list or when CPU is ideal.\n" +
                                "\n" +
                                "The alternate method to this is to immediately reinsert the space into free storage list which is time consuming.",
                        "13"));
        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Overflow And Underflow ?",
                        "When new data is to be inserted into the data structure but there is no available space i.e. free storage list is empty this situation is called overflow.\n" +
                                "\n" +
                                "When we want to delete data from a data structure that is empty this situation is called underflow.",
                        "14"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Disadvantages Array Implementations Of Linked List ?",
                        "i) The no of nodes needed can’t be predicted when the program is written.\n" +
                                "ii) The no of nodes declared must remain allocated throughout its execution.   ",
                        "15"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is A Queue ?",
                        "A queue is an ordered collection of items from which items may be deleted at one end (front end) and items inserted at the other end (rear end).\n" +
                                "\n" +
                                "It obeys FIFO rule there is no limit to the number of elements a queue contains.",
                        "16"));
        productList.add(
                new Quations_java(
                        2,
                        " What Is A Priority Queue ?",
                        "The priority queue is a data structure in which the intrinsic ordering of the elements (numeric or alphabetic)\n" +
                                "\n" +
                                "Determines the result of its basic operation. It is of two types:\n" +
                                "\n" +
                                "i) Ascending priority queue- Here smallest item can be removed (insertion is arbitrary).\n" +
                                "ii) Descending priority queue- Here largest item can be removed (insertion is arbitrary).",
                        "17"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Disadvantages Of Sequential Storage ?",
                        "i) Fixed amount of storage remains allocated to the data structure even if it contains less element.\n" +
                                "ii) No more than fixed amount of storage is allocated causing overflow.",
                        "18"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Disadvantages Of Representing A Stack Or Queue By A Linked List ?",
                        "i) A node in a linked list (info and next field) occupies more storage than a corresponding element in an array.\n" +
                                "ii) Additional time spent in managing the available list.",
                        "19"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is Dangling Pointer And How To Avoid It ?",
                        "After a call to free(p) makes a subsequent reference to *p illegal, i.e. though the storage to p is freed but the value of p(address) remain unchanged .so the object at that address may be used as the value of *p (i.e. there is no way to detect the illegality).Here p is called dangling pointer.\n" +
                                "\n" +
                                "To avoid this it is better to set p to NULL after executing free(p).The null pointer value doesn’t reference a storage location it is a pointer that doesn’t point to anything.",
                        "20"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Disadvantages Of Linear List ?",
                        "i) We cannot reach any of the nodes that precede node (p).\n" +
                                "ii) If a list is traversed, the external pointer to the list must be persevered in order to reference the list again.\n" +
                                "\n",
                        "21"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Circular List ?",
                        "In linear list the next field of the last node contain a null pointer, when a next field in the last node contain a pointer back to the first node it is called circular list.\n" +
                                "\n" +
                                "Advantages – From any point in the list it is possible to reach at any other point.",
                        "22"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Disadvantages Of Circular List ?",
                        "i) We can’t traverse the list backward.\n" +
                                "ii) If a pointer to a node is given we cannot delete the node.",
                        "23"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Double Linked List ?",
                        "It is a collection of data elements called nodes,\n" +
                                "\n" +
                                "where each node is divided into three parts:\n" +
                                "\n" +
                                "    An info field that contains the information stored in the node.\n" +
                                "    Left field that contain pointer to node on left side.\n" +
                                "    Right field that contain pointer to node on right side.\n",
                        "24"));
        productList.add(
                new Quations_java(
                        2,
                        "Is It Necessary To Sort A File Before Searching A Particular Item ?",
                        "If less work is involved in searching a element than to sort and then extract, then we don’t go for sort.\n" +
                                "\n" +
                                "If frequent use of the file is required for the purpose of retrieving specific element, it is more efficient to sort the file.\n" +
                                "\n" +
                                "Thus it depends on situation.",
                        "25"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Issues That Hamper The Efficiency In Sorting A File ?",
                        "The issues are:\n" +
                                "\n" +
                                "    Length of time required by the programmer in coding a particular sorting program.\n" +
                                "    Amount of machine time necessary for running the particular program.\n" +
                                "    The amount of space necessary for the particular program .\n",
                        "26"));
        productList.add(
                new Quations_java(
                        2,
                        "Calculate The Efficiency Of Sequential Search  ?",
                        "The number of comparisons depends on where the record with the argument key appears in the table.\n" +
                                "\n" +
                                "If it appears at first position then one comparison\n" +
                                "If it appears at last position then n comparisons\n" +
                                "Average=(n+1)/2 comparisons\n" +
                                "Unsuccessful search n comparisons\n" +
                                "Number of comparisons in any case is O (n).",
                        "27"));
        productList.add(
                new Quations_java(
                        2,
                        "Is Any Implicit Arguments Are Passed To A Function When It Is Called ?",
                        "Yes there is a set of implicit arguments that contain information necessary for the function to execute and return correctly. One of them is return address which is stored within the function’s data area, at the time of returning to calling program the address is retrieved and the function branches to that location.",
                        "28"));
        productList.add(
                new Quations_java(
                        2,
                        "Parenthesis Is Never Required In Postfix Or Prefix Expressions, Why? ",

                        "Parenthesis is not required because the order of the operators in the postfix /prefix expressions determines the actual order of operations in evaluating the expression.",
                        "29"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out The Areas In Which Data Structures Are Applied Extensively ?",
                        "\n" +
                                "1. Compiler Design,\n" +
                                "2. Operating System,\n" +
                                "3. Database Management System,\n" +
                                "4. Statistical analysis package,\n" +
                                "5. Numerical Analysis,\n" +
                                "6. Graphics,\n" +
                                "7. Artificial Intelligence,\n" +
                                "8. Simulation.\n",
                        "30"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Major Data Structures Used In The Following Areas : Network Data Model & Hierarchical Data Model ? ",
                        "RDBMS – Array (i.e. Array of structures)\n" +
                                "Network data model – Graph\n" +
                                "Hierarchical data model – Trees",
                        "31"));
        productList.add(
                new Quations_java(
                        2,
                        "If You Are Using C Language To Implement The Heterogeneous Linked List, What Pointer Type Will You Use ?",
                        "The heterogeneous linked list contains different data types in its nodes and we need a link, pointer to connect them. It is not possible to use ordinary pointers for this. So we go for void pointer. Void pointer is capable of storing pointer to any type as it is a generic pointer type.\n" +
                                "\n",
                        "32"));
        productList.add(
                new Quations_java(
                        2,
                        "Minimum Number Of Queues Needed To Implement The Priority Queue ?",
                        "Two. One queue is used for actual storing of data and another for storing priorities.",
                        "33"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Data Structures Used To Perform Recursion ?",
                        "Stack. Because of its LIFO (Last In First Out) property it remembers its ‘caller’ so knows whom to return when the function has to return. Recursion makes use of system stack for storing the return addresses of the function calls.\n" +
                                "\n" +
                                "Every recursive function has its equivalent iterative (non-recursive) function. Even when such equivalent iterative procedures are written, explicit stack is to be used.",
                        "34"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Notations Used In Evaluation Of Arithmetic Expressions Using Prefix And Postfix Forms ?",
                        "Polish and Reverse Polish notations.",
                        "35"));
        productList.add(
                new Quations_java(
                        2,
                        "Convert The Expression ((a + B) * C - (d - E) ^ (f + G)) To Equivalent Prefix And Postfix Notations ?",
                        "Prefix Notation:\n" +
                                "\n" +
                                "^ – * +ABC – DE + FG\n" +
                                "\n" +
                                "postfix Notation:\n" +
                                "\n" +
                                "AB + C * DE – – FG + ^",
                        "36"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out Few Of The Application Of Tree Data-structure ?",
                        "The manipulation of Arithmetic expression, Symbol Table construction & Syntax analysis.",
                        "37"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out Few Of The Applications That Make Use Of Multilinked Structures ?",
                        "Sparse matrix, Index generation.",
                        "38"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Type Of The Algorithm Used In Solving The 8 Queens Problem ?",
                        "Backtracking.",
                        "39"));
        productList.add(
                new Quations_java(
                        2,
                        "In An Avl Tree, At What Condition The Balancing Is To Be Done ? ",
                        "If the ‘pivotal value’ (or the ‘Height factor’) is greater than 1 or less than –1.",
                        "40"));
        productList.add(
                new Quations_java(
                        2,
                        "There Are 8, 15, 13, 14 Nodes Were There In 4 Different Trees. Which Of Them Could Have Formed A Full Binary Tree ? ",
                        "In general: There are 2n-1 nodes in a full binary tree. By the method of elimination:\n" +
                                "\n" +
                                "Full binary trees contain odd number of nodes. So there cannot be full binary trees with 8 or 14 nodes, so rejected. With 13 nodes you can form a complete binary tree but not a full binary tree. So the correct answer is 15.",
                        "41"));
        productList.add(
                new Quations_java(
                        2,
                        "In Rdbms, What Is The Efficient Data Structure Used In The Internal Storage Representation ?",
                        "B+ tree. Because in B+ tree, all the data is stored only in leaf nodes, that makes searching easier. This corresponds to the records that shall be stored in leaf nodes.",
                        "42"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is A Spanning Tree ?",
                        "A spanning tree is a tree associated with a network. All the nodes of the graph appear on the tree once. A minimum spanning tree is a spanning tree organized so that the total edge weight between nodes is minimized.",
                        "43"));
        productList.add(
                new Quations_java(
                        2,
                        "Does The Minimal Spanning Tree Of A Graph Give The Shortest Distance Between Any 2 Specified Nodes ? ",
                        "No! Minimal spanning tree assures that the total weight of the tree is kept at its minimum. But it doesn’t mean that the distance between any two nodes involved in the minimal-spanning tree is minimum.",
                        "44"));
        productList.add(
                new Quations_java(
                        2,
                        "Difference Between Calloc And Malloc ?",
                        "malloc: allocate n bytes.\n" +
                                "calloc: allocate m times n bytes initialized to 0.",
                        "45"));
        productList.add(
                new Quations_java(
                        2,
                        "What Are The Major Data Structures Used In The Following Areas : Rdbms, Network Data Model & Hierarchical Data Model ?",
                        "\n" +
                                "1. RDBMS Array (i.e. Array of structures)\n" +
                                "2. Network data model Graph\n" +
                                "3. Hierarchical data model Trees.\n",
                        "46"));

        productList.add(
                new Quations_java(
                        2,
                        "Which File Contains The Definition Of Member Functions ?",
                        "Definitions of member functions for the Linked List class are contained in the LinkedList.cpp file.",
                        "47"));

        productList.add(
                new Quations_java(
                        2,
                        "How Is Any Data Structure Application Is Classified Among Files ?",
                        "A linked list application can be organized into a header file, source file and main application file. The first file is the header file that contains the definition of the NODE structure and the LinkedList class definition. The second file is a source code file containing the implementation of member functions of the LinkedList class. The last file is the application file that contains code that creates and uses the LinkedList class.",
                        "48"));
        productList.add(
                new Quations_java(
                        2,
                        " What Member Function Places A New Node At The End Of The Linked List ?",
                        "The appendNode() member function places a new node at the end of the linked list. The appendNode() requires an integer representing the current data of the node.\n" +
                                "\n",
                        "49"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is Linked List ?",
                        "Linked List is one of the fundamental data structures. It consists of a sequence of ? nodes, each containing arbitrary data fields and one or two (”links”) pointing to the next and/or previous nodes. A linked list is a self-referential datatype because it contains a pointer or link to another data of the same type. Linked lists permit insertion and removal of nodes at any point in the list in constant time, but do not allow random access.\n",
                        "50"));
        productList.add(
                new Quations_java(
                        2,
                        "What Does Each Entry In The Link List Called ?",
                        "Each entry in a linked list is called a node. Think of a node as an entry that has three sub entries. One sub entry contains the data, which may be one attribute or many attributes. Another points to the previous node, and the last points to the next node. When you enter a new item on a linked list, you allocate the new node and then set the pointers to previous and next nodes.",
                        "51"));
        productList.add(
                new Quations_java(
                        2,
                        "How Is The Front Of The Queue Calculated ?",
                        "The front of the queue is calculated by front = (front+1) % size.\n",
                        "52"));
        productList.add(
                new Quations_java(
                        2,
                        "Why Is The Isempty() Member Method Called ?",
                        "The isEmpty() member method is called within the dequeue process to determine if there is an item in the queue to be removed i.e. isEmpty() is called to decide whether the queue has at least one element. This method is called by the dequeue() method before returning the front element.",
                        "53"));
        productList.add(
                new Quations_java(
                        2,
                        " Which Process Places Data At The Back Of The Queue ?",
                        "Enqueue is the process that places data at the back of the queue.",
                        "54"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Relationship Between A Queue And Its Underlying Array ?",
                        "Data stored in a queue is actually stored in an array. Two indexes, front and end will be used to identify the start and end of the queue.\n" +
                                "\n" +
                                "When an element is removed front will be incremented by 1. In case it reaches past the last index available it will be reset to 0. Then it will be checked with end. If it is greater than end queue is empty.\n" +
                                "\n" +
                                "When an element is added end will be incremented by 1. In case it reaches past the last index available it will be reset to 0. After incrementing it will be checked with front. If they are equal queue is full.",
                        "55"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is A Queue ?",
                        "A Queue is a sequential organization of data. A queue is a first in first out type of data structure. An element is inserted at the last position and an element is always taken out from the first position.",
                        "56"));
        productList.add(
                new Quations_java(
                        2,
                        "What Does Isempty() Member Method Determines ?",
                        "isEmpty() checks if the stack has at least one element. This method is called by Pop() before retrieving and returning the top element.",
                        "57"));
        productList.add(
                new Quations_java(
                        2,
                        "What Method Removes The Value From The Top Of A Stack ?",
                        "The pop() member method removes the value from the top of a stack, which is then returned by the pop() member method to the statement that calls the pop() member method.",
                        "58"));
        productList.add(
                new Quations_java(
                        2,
                        " What Method Is Used To Place A Value Onto The Top Of A Stack ?",
                        "push() method, Push is the direction that data is being added to the stack. push() member method places a value onto the top of a stack.",
                        "59"));
        productList.add(
                new Quations_java(
                        2,
                        "Run Time Memory Allocation Is Known As ?",
                        "Allocating memory at runtime is called a dynamically allocating memory. In this, you dynamically allocate memory by using the new operator when declaring the array.\n" +
                                "\n" +
                                "for example : int grades[] = new int[10];",
                        "60"));
        productList.add(
                new Quations_java(
                        2,
                        "How Do You Assign An Address To An Element Of A Pointer Array ?",
                        "We can assign a memory address to an element of a pointer array by using the address operator, which is the ampersand (&), in an assignment statement such as ptemployee[0] = &projects[2];",
                        "61"));
        productList.add(
                new Quations_java(
                        2,
                        "Why Do We Use A Multidimensional Array ?",
                        "A multidimensional array can be useful to organize subgroups of data within an array. In addition to organizing data stored in elements of an array, a multidimensional array can store memory addresses of data in a pointer array and an array of pointers.\n" +
                                "\n" +
                                "Multidimensional arrays are used to store information in a matrix form.\n" +
                                "\n" +
                                "e.g; a railway timetable, schedule cannot be stored as a single dimensional array. One can use a 3-D array for storing height, width and length of each room on each floor of a building.",
                        "62"));
        productList.add(
                new Quations_java(
                        2,
                        " What Is Significance Of \" * \" ?",
                        "The symbol “*” tells the computer that you are declaring a pointer. Actually it depends on context.\n" +
                                "\n" +
                                "In a statement like int *ptr; the ‘*’ tells that you are declaring a pointer.\n" +
                                "In a statement like int i = *ptr; it tells that you want to assign value pointed to by ptr to variable i.\n" +
                                "The symbol “*” is also called as Indirection Operator/ Dereferencing Operator.",
                        "63"));
        productList.add(
                new Quations_java(
                        2,
                        "Is Pointer A Variable ?",
                        "Yes, a pointer is a variable and can be used as an element of a structure and as an attribute of a class in some programming languages such as C++, but not Java. However, the contents of a pointer is a memory address of another location of memory, which is usually the memory address of another variable, element of a structure, or attribute of a class.",
                        "64"));
        productList.add(
                new Quations_java(
                        2,
                        "How Many Parts Are There In A Declaration Statement ?",
                        "There are two main parts, variable identifier and data type and the third type is optional which is type qualifier like signed/unsigned.",
                        "65"));
        productList.add(
                new Quations_java(
                        2,
                        "How Memory Is Reserved Using A Declaration Statement ?",
                        "Memory is reserved using data type in the variable declaration. A programming language implementation has predefined sizes for its data types.\n" +
                                "\n" +
                                "For example: \n" +
                                "\n" +
                                "in C# the declaration int i; will reserve 32 bits for variable i.\n" +
                                "A pointer declaration reserves memory for the address or the pointer variable, but not for the data that it will point to. The memory for the data pointed by a pointer has to be allocated at runtime.\n" +
                                "The memory reserved by the compiler for simple variables and for storing pointer address is allocated on the stack, while the memory allocated for pointer referenced data at runtime is allocated on the heap.",
                        "66"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is Impact Of Signed Numbers On The Memory ?",
                        "Sign of the number is the first bit of the storage allocated for that number. So you get one bit less for storing the number. For example if you are storing an 8-bit number, without sign, the range is 0-255. If you decide to store sign you get 7 bits for the number plus one bit for the sign. So the range is -128 to +127.",
                        "67"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is Precision ?",
                        "Precision refers the accuracy of the decimal portion of a value. Precision is the number of digits allowed after the decimal point.",
                        "68"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Difference Between Null And Void Pointer ?",
                        "NULL can be value for pointer type variables.\n" +
                                "VOID is a type identifier which has not size.\n" +
                                "NULL and void are not same. Example: void* ptr = NULL;",
                        "69"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is The Difference Between Array And Stack ?",
                        "STACK follows LIFO. Thus the item that is first entered would be the last removed.\n" +
                                "\n" +
                                "In array the items can be entered or removed in any order. Basically each member access is done using index. No strict order is to be followed here to remove a particular element.\n" +
                                "\n" +
                                "Array may be multidiamensional or onediamensional but stack should be onediamensional. but both are linear data structure.",
                        "70"));
        productList.add(
                new Quations_java(
                        2,
                        "Tell How To Check Whether A Linked List Is Circular ?",
                        "Create two pointers, each set to the start of the list. Update each as follows:\n" +
                                "\n" +
                                "while (pointer1) \n" +
                                "{\n" +
                                "pointer1 = pointer1->next;\n" +
                                "pointer2 = pointer2->next;\n" +
                                "if(pointer2)pointer2=pointer2->next;\n" +
                                "if (pointer1 == pointer2) \n" +
                                "{\n" +
                                "print (”circularn”);\n" +
                                "}\n" +
                                "}",
                        "71"));
        productList.add(
                new Quations_java(
                        2,
                        "Whether Linked List Is Linear Or Non-linear Data Structure ?",
                        "\n" +
                                "1. According to Access strategies Linked list is a linear one.\n" +
                                "2. According to Storage Linked List is a Non-linear one.\n",
                        "72"));
        productList.add(
                new Quations_java(
                        2,
                        " If You Are Using C Language To Implement The Heterogeneous Linked List, What Pointer Type Will You Use ?",
                        "The heterogeneous linked list contains different data types in its nodes and we need a link, pointer to connect them. It is not possible to use ordinary pointers for this. So we go for void pointer. Void pointer is capable of storing pointer to any type as it is a generic pointer type.",
                        "73"));
        productList.add(
                new Quations_java(
                        2,
                        "What Is A Node Class ?",
                        "A node class is a class that, relies on the base class for services and implementation, provides a wider interface to users than its base class, relies primarily on virtual functions in its public interface depends on all its direct and indirect base class can be understood only in the context of the base class can be used as base for further derivation can be used to create objects. A node class is a class that has added new services or functionality beyond the services inherited from its base class.",
                        "74"));
        productList.add(
                new Quations_java(
                        2,
                        "When Can You Tell That A Memory Leak Will Occur ?",
                        "A memory leak occurs when a program loses the ability to free a block of dynamically allocated memory.",
                        "75"));
        productList.add(
                new Quations_java(
                        2,
                        "How Many Different Trees Are Possible With 10 Nodes ?",
                        "1014 - For example, consider a tree with 3 nodes(n=3), it will have the maximum combination of 5 different (ie, 23 - 3 =? 5) trees.",
                        "76"));
        productList.add(
                new Quations_java(
                        2,
                        "How Can I Search For Data In A Linked List ?",
                        "Unfortunately, the only way to search a linked list is with a linear search, because the only way a linked list's members can be accessed is sequentially. Sometimes it is quicker to take the data from a linked list and store it in a different data structure so that searches can be more efficient.",
                        "77"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Data Structures ?",
                        "Data Structures is defined as the way of organizing all data items that consider not only the elements stored but also stores the relationship between the elements.",
                        "78"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Primary Data Structures ?",
                        "Primary data structures are the basic data structures that directly operate upon the machine instructions. All the basic constants (integers, floating-point numbers, character constants, string constants) and pointers are considered as primary data structures.",
                        "79"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Static Data Structures ?",
                        "A data structure formed when the number of data items are known in advance is referred as static data structure or fixed size data structure.",
                        "80"));
        productList.add(
                new Quations_java(
                        2,
                        "List Some Of The Static Data Structures In C ?",
                        "Some of the static data structures in C are arrays, pointers, structures etc.",
                        "81"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Dynamic Data Structures ?",
                        "A data structure formed when the number of data items are not known in advance is known as dynamic data structure or variable size data structure.\n",
                        "82"));

        productList.add(
                new Quations_java(
                        2,
                        "List Some Of The Dynamic Data Structures In C ?",
                        "Some of the dynamic data structures in C are linked lists, stacks, queues, trees etc.",
                        "83"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Linear Data Structures ?",
                        "Linear data structures are data structures having a linear relationship between its adjacent elements.\n" +
                                "\n" +
                                "Eg; Linked lists.",
                        "84"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Non-linear Data Structures ?",
                        "Non-linear data structures are data structures that don’t have a linear relationship between its adjacent elements but have a hierarchical relationship between the elements.\n" +
                                "\n" +
                                "Eg; Trees and Graphs.",
                        "85"));
        productList.add(
                new Quations_java(
                        2,
                        " Define Linked Lists ?",
                        "Linked list consists of a series of structures, which are not necessarily adjacent in memory. Each structure contains the element and a pointer to a structure containing its successor. We call this the Next Pointer. The last cell’s Next pointer points to NULL.\n",
                        "86"));
        productList.add(
                new Quations_java(
                        2,
                        "State The Different Types Of Linked Lists ?",
                        "The different types of linked list include singly linked list, doubly linked list and circular linked list.",
                        "87"));
        productList.add(
                new Quations_java(
                        2,
                        "List The Basic Operations Carried Out In A Linked List ?",
                        "The basic operations carried out in a linked list include:\n" +
                                "\n" +
                                "1. Creation of a list.\n" +
                                "2. Insertion of a node.\n" +
                                "3. Deletion of a node.\n" +
                                "4. Modification of a node.\n" +
                                "5. Traversal of the list.",
                        "88"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out The Advantages Of Using A Linked List ?",
                        "\n" +
                                "1. It is not necessary to specify the number of elements in a linked list during its declaration.\n" +
                                "2. Linked list can grow and shrink in size depending upon the insertion and deletion that occurs in the list.\n" +
                                "3. Insertions and deletions at any place in a list can be handled easily and efficiently.\n" +
                                "4. A linked list does not waste any memory space.\n",
                        "89"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out The Disadvantages Of Using A Linked List ?",
                        "\n" +
                                "1. Searching a particular element in a list is difficult and time consuming.\n" +
                                "2. A linked list will use more storage space than an array to store the same number of elements.\n",
                        "90"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out The Applications Of A Linked List ?",
                        "Some of the important applications of linked lists are manipulation of polynomials, sparse matrices, stacks and queues.",
                        "91"));
        productList.add(
                new Quations_java(
                        2,
                        "Define A Stack ?",
                        "Stack is an ordered collection of elements in which insertions and deletions are restricted to one end. The end from which elements are added and/or removed is referred to as top of the stack. Stacks are also referred as piles, push-down lists and last-in-first-out (LIFO) lists.",
                        "92"));
        productList.add(
                new Quations_java(
                        2,
                        "List Out The Basic Operations That Can Be Performed On A Stack ?",
                        "The basic operations that can be performed on a stack are\n" +
                                "\n" +
                                "1. Push operation.\n" +
                                "2. Pop operation.\n" +
                                "3. Peek operation.\n" +
                                "4. Empty check.\n" +
                                "5. Fully occupied check.\n",
                        "93"));


        productList.add(
                new Quations_java(
                        2,
                        "State The Different Ways Of Representing Expressions ?",
                        "The different ways of representing expressions are\n" +
                                "\n" +
                                "1. Infix Notation.\n" +
                                "2. Prefix Notation.\n" +
                                "3. Postfix Notation.\n",
                        "94"));
        productList.add(
                new Quations_java(
                        2,
                        "State The Advantages Of Using Infix Notations ?",
                        "\n" +
                                "1. It is the mathematical way of representing the expression.\n" +
                                "2. It is easier to see visually which operation is done from first to last.\n",
                        "95"));
        productList.add(
                new Quations_java(
                        2,
                        "State The Advantages Of Using Postfix Notations ?",
                        "\n" +
                                "1. Need not worry about the rules of precedence.\n" +
                                "2. Need not worry about the rules for right to left associativity.\n" +
                                "3. Need not need parenthesis to override the above rules.\n",
                        "96"));
        productList.add(
                new Quations_java(
                        2,
                        "State The Difference Between Stacks And Linked Lists ?",
                        "The difference between stacks and linked lists is that insertions and deletions may occur anywhere in a linked list, but only at the top of the stack.",
                        "97"));

        productList.add(
                new Quations_java(
                        2,
                        "Define A Queue ?",
                        "Queue is an ordered collection of elements in which insertions are restricted to one end called the rear end and deletions are restricted to other end called the front end. Queues are also referred as First-In-First-Out (FIFO) Lists.",
                        "98"));

        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Back Edge ?",
                        "If w is the ancestor of v, then vw is called a back edge.",
                        "99"));

        productList.add(
                new Quations_java(
                        2,
                        "What Do You Mean By Tree Edge  ?",
                        "If w is undiscovered at the time vw is explored, then vw is called a tree edge and v becomes the parent of w.",
                        "100"));

        productList.add(
                new Quations_java(
                        2,
                        "List The Two Important Key Points Of Depth First Search ?",
                        "i) If path exists from one node to another node, walk across the edge – exploring the edge.\n" +
                                "ii) If path does not exist from one specific node to any other node, return to the previous node where we have been before – backtracking.",
                        "101"));
        productList.add(
                new Quations_java(
                        2,
                        "Define Graph Traversals ?",
                        "Traversing a graph is an efficient way to visit each vertex and edge exactly once.",
                        "102"));

        productList.add(
                new Quations_java(
                        2,
                        "Name Two Algorithms Two Find Minimum Spanning Tree ?",
                        "\n" +
                                "1. Kruskal’s algorithm.\n" +
                                "2. Prim’s algorithm.\n",
                        "103"));

        productList.add(
                new Quations_java(
                        2,
                        "What Are The Two Traversal Strategies Used In Traversing A Graph ?",
                        "\n" +
                                "1. Breadth first search\n" +
                                "2. Depth first search\n",
                        "104"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is An Acyclic Graph ?",
                        "A simple diagram which does not have any cycles is called an acyclic graph.",
                        "105"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is A Cycle Or A Circuit ?",
                        "A path which originates and ends in the same node is called a cycle or circuit.\n",
                        "106"));

        productList.add(
                new Quations_java(
                        2,
                        "Define Path In A Graph ?",
                        "The path in a graph is the route taken to reach terminal node from a starting node.",
                        "107"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is A Weighted Graph ?",
                        "A graph in which weights are assigned to every edge is called a weighted graph.",
                        "108"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is A Loop ?",
                        "An edge of a graph which connects to itself is called a loop or sling.",
                        "109"));

        productList.add(
                new Quations_java(
                        2,
                        "What Is A Undirected Graph ?",
                        "A graph in which every edge is undirected is called a directed graph.",
                        "110"));


        productList.add(
                new Quations_java(
                        2,
                        "Our Team is working on preparing more Question and answers So stay Up to date. ",
                        "",
                        "-->"));











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
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(this,QuationsListPage.class);
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


