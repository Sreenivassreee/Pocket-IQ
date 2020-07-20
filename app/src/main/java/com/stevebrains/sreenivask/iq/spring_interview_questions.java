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

public class spring_interview_questions extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.spring_interview_questions);

        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("Spring Interview Q 2020");
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
                        2,
                        "What is Spring ?",
                        "It is a lightweight, loosely coupled and integrated framework for developing enterprise applications in java.",
                        "1"));
        productList.add(
                new Quations_java(
                        3,
                        "What are the advantages of spring framework ?",

                                "1.Predefined Templates\n" +
                                "2.Loose Coupling\n" +
                                "3.Easy to test\n" +
                                "4.Lightweight\n" +
                                "5.Fast Development\n" +
                                "6.Powerful Abstraction\n" +
                                "7.Declarative support",
                        "2"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the modules of spring framework ?",

                                "1.Test\n" +
                                "2.Spring Core Container\n" +
                                "3.AOP, Aspects and Instrumentation\n" +
                                "4.Data Access/Integration\n" +
                                "5.Web",
                        "3"));

        productList.add(
                new Quations_java(
                        0,
                        "What is IOC and DI ?",
                        "IOC (Inversion of Control) and DI (Dependency Injection) is a design pattern to provide loose coupling. It removes the dependency from the program.",
                        "4"));

        productList.add(
                new Quations_java(
                        0,
                        "What is the role of IOC container in spring ?",
                        "IOC container is responsible to:\n" +
                                "\n" +
                                "* create the instance\n" +
                                "* configure the instance, and\n" +
                                "* assemble the dependencies\n",
                        "5"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the types of IOC container in spring ?",
                        "There are two types of IOC containers in spring framework.\n" +
                                "\n" +
                                "1.BeanFactory\n" +
                                "2.ApplicationContext",
                        "6"));

        productList.add(
                new Quations_java(
                        0,
                        "What is the difference between BeanFactory and ApplicationContext ?",
                        "BeanFactory is the basic container whereas ApplicationContext is the advanced container. ApplicationContext extends the BeanFactory interface. ApplicationContext provides more facilities than BeanFactory such as integration with spring AOP, message resource handling for i18n etc.",
                        "7"));


        productList.add(
                new Quations_java(
                        0,
                        "In which scenario, you will use singleton and prototype scope ?",
                        " Singleton scope should be used with EJB stateless session bean and prototype scope with EJB stateful session bean.",
                        "8"));

        productList.add(
                new Quations_java(
                        0,
                        "Singleton scope should be used with EJB stateless session bean and prototype scope with EJB stateful session bean.",
                        "Spring framework provides two type of transaction management supports:\n" +
                                "\n" +
                                "1.Programmatic Transaction Management: should be used for few transaction operations.\n" +
                                "2.Declarative Transaction Management: should be used for many transaction operations.\n",
                        "9"));


        productList.add(
                new Quations_java(
                        0,
                        "What is AOP ?",
                        "Aspect-oriented programming, or AOP, is a programming technique that allows programmers to modularize crosscutting concerns, or behavior that cuts across the typical divisions of responsibility, such as logging and transaction management. The core construct of AOP is the aspect, which encapsulates behaviors affecting multiple classes into reusable modules.",
                        "10"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the different types of IoC (dependency injection) ?",
                        "Types of IoC are −\n" +
                                "\n" +
                                "2.Constructor-based dependency injection − Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on other class.\n" +
                                "\n" +
                                "1.Setter-based dependency injection − Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory method to instantiate your bean.\n"
                                ,
                        "11"));


        productList.add(
                new Quations_java(
                        0,
                        "Which DI would you suggest Constructor-based or setter-based DI ?",
                        "Since you can mix both, Constructor- and Setter-based DI, it is a good rule of thumb to use constructor arguments for mandatory dependencies and setters for optional dependencies. Note that the use of a @Required annotation on a setter can be used to make setters required dependencies.",
                        "12"));
        productList.add(
                new Quations_java(
                        0,
                        "What is Spring IoC container ?",
                        "The Spring IoC creates the objects, wire them together, configure them, and manage their complete lifecycle from creation till destruction. The Spring container uses dependency injection (DI) to manage the components that make up an application.",
                        "13"));


        productList.add(
                new Quations_java(
                        0,
                        "Spring JDBC Interview Questions",
                        " ",
                        ""));
        productList.add(
                new Quations_java(
                        0,
                        "Which classes are present in spring JDBC API ?\n",
                        "Classes present in JDBC API are as follows:\n" +
                                "\n" +
                                "1.JdbcTemplate\n" +
                                "2.SimpleJdbcTemplate\n" +
                                "3.NamedParameterJdbcTemplate\n" +
                                "4.SimpleJdbcInsert\n" +
                                "5.SimpleJdbcCall",
                        "14"));
        productList.add(
                new Quations_java(
                        0,
                        "What are the ways by which Hibernate can be accessed using Spring ?",
                        "There are two ways by which we can access Hibernate using Spring:\n" +
                                "\n" +
                                "1.Inversion of Control with a Hibernate Template and Callback\n" +
                                "2.Extending HibernateDAOSupport and Applying an AOP Interceptor node",
                        "15"));
        productList.add(
                new Quations_java(
                        0,
                        "Name the types of transaction management that Spring supports.",
                        "Two types of transaction management are supported by Spring. They are:\n" +
                                "\n" +
                                "    Programmatic transaction management: In this, the transaction is managed with the help of programming. It provides you extreme flexibility, but it is very difficult to maintain.\n" +
                                "    Declarative transaction management: In this, the transaction management is separated from the business code. Only annotations or XML based configurations are used to manage the transactions.",
                        "16"));
        productList.add(
                new Quations_java(
                        0,
                        "What are the advantages of JdbcTemplate in spring ?",
                        "Less code: By using the JdbcTemplate class, you don't need to create connection,statement,start transaction,commit transaction and close connection to execute different queries. You can execute the query directly.",
                        "17"));

        productList.add(
                new Quations_java(
                        0,
                        "What are classes for spring JDBC API ?",
                        "\n" +
                                "1.JdbcTemplate\n" +
                                "2.SimpleJdbcTemplate\n" +
                                "3.NamedParameterJdbcTemplate\n" +
                                "4.SimpleJdbcInsert\n" +
                                "5.SimpleJdbcCall\n",
                        "18"));

        productList.add(
                new Quations_java(
                        0,
                        "How can you fetch records by spring JdbcTemplate ?",
                        "You can fetch records from the database by the query method of JdbcTemplate. There are two interfaces to do this:\n" +
                                "\n" +
                                "1.ResultSetExtractor\n" +
                                "2.RowMapper",
                        "19"));

        productList.add(
                new Quations_java(
                        0,
                        "What is the advantage of NamedParameterJdbcTemplate ?",
                        "NamedParameterJdbcTemplate class is used to pass value to the named parameter. A named parameter is better than ? (question mark of PreparedStatement).\n" +
                                "\n" +
                                "It is better to remember.",
                        "20"));

        productList.add(
                new Quations_java(
                        0,
                        "What is the advantage of SimpleJdbcTemplate ?",
                        "The SimpleJdbcTemplate supports the feature of var-args and autoboxing.",
                        "21"));

        productList.add(
                new Quations_java(
                        0,
                        "Spring AOP Interview Questions",
                        " ",
                        " "));

        productList.add(
                new Quations_java(
                        0,
                        "What is AOP ?",
                        "AOP is an acronym for Aspect Oriented Programming. It is a methodology that divides the program logic into pieces or parts or concerns.\n" +
                                "\n" +
                                "It increases the modularity and the key unit is Aspect.",
                        "22"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the advantages of spring AOP ?",
                        "AOP enables you to dynamically add or remove concern before or after the business logic. It is pluggable and easy to maintain.",
                        "23"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the AOP terminology ?",
                        "AOP terminologies or concepts are as follows:\n" +
                                "\n" +
                                "1.JoinPoint\n" +
                                "2.Advice\n" +
                                "3.Pointcut\n" +
                                "4.Aspect\n" +
                                "5.Introduction\n" +
                                "6.Target Object\n" +
                                "7.Interceptor\n" +
                                "8.AOP Proxy\n" +
                                "9.Weaving",
                        "24"));

        productList.add(
                new Quations_java(
                        0,
                        "What is JoinPoint ?",
                        "JoinPoint is any point in your program such as field access, method execution, exception handling etc.",
                        "25"));

        productList.add(
                new Quations_java(
                        0,
                        "Does spring framework support all JoinPoints ?",
                        "No, spring framework supports method execution joinpoint only.",
                        "26"));

        productList.add(
                new Quations_java(
                        0,
                        "What is Advice ?",
                        "Advice represents action taken by aspect.",
                        "27"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the types of advice in AOP ?",
                        "There are 5 types of advices in spring AOP.\n" +
                                "\n" +
                                "1.Before Advice\n" +
                                "2.After Advice\n" +
                                "3.After Returning Advice\n" +
                                "4.Throws Advice\n" +
                                "5.Around Advice",
                        "28"));

        productList.add(
                new Quations_java(
                        0,
                        "What is Pointcut ?",
                        "Pointcut is expression language of Spring AOP.",
                        "29"));

        productList.add(
                new Quations_java(
                        0,
                        "What is Aspect ?",
                        "Aspect is a class in spring AOP that contains advices and joinpoints.",
                        "30"));

        productList.add(
                new Quations_java(
                        0,
                        "What is Introduction ?",
                        "Introduction represents introduction of new fields and methods for a type.",
                        "31"));

        productList.add(
                new Quations_java(
                        0,
                        "What is target object ?",
                        "Target Object is a proxy object that is advised by one or more aspects.",
                        "32"));

        productList.add(
                new Quations_java(
                        0,
                        "What is interceptor ?",
                        "Interceptor is a class like aspect that contains one advice only.",
                        "33"));

        productList.add(
                new Quations_java(
                        0,
                        "What is weaving ?",
                        "Weaving is a process of linking aspect with other application.",
                        "34"));

        productList.add(
                new Quations_java(
                        0,
                        "Does spring perform weaving at compile time ?",
                        "No, spring framework performs weaving at runtime.",
                        "35"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the AOP implementation ?",
                        "There are 3 AOP implementation.\n" +
                                "\n" +
                                "1.Spring AOP\n" +
                                "2.Apache AspectJ\n" +
                                "3.JBoss AOP",
                        "37"));


        productList.add(
                new Quations_java(
                        0,
                        "Spring MVC Interview Questions",
                        " What is the front controller class of Spring MVC ?",
                        "38"));
        productList.add(
                new Quations_java(
                        0,
                        "What does @Controller annotation ?",
                        "The @Controller annotation marks the class as controller class. It is applied on the class.",
                        "39"));
        productList.add(
                new Quations_java(
                        0,
                        "What does @RequestMapping annotation ?",
                        "The @RequestMapping annotation maps the request with the method. It is applied on the method.",
                        "40"));
        productList.add(
                new Quations_java(
                        0,
                        "What does the ViewResolver class ?",
                        "The View Resolver class resolves the view component to be invoked for the request. It defines prefix and suffix properties to resolve the view component.",
                        "41"));
        productList.add(
                new Quations_java(
                        0,
                        "Which ViewResolver class is widely used ?",
                        "The org.springframework.web.servlet.view.InternalResourceViewResolver class is widely used.",
                        "42"));
        productList.add(
                new Quations_java(
                        0,
                        "Does spring MVC provide validation support ?",
                        "Yes.",
                        "43"));
        productList.add(
                new Quations_java(
                        0,
                        "Name some of the important Spring Modules?",
                        "Some of the important Spring Framework modules are:\n" +
                                "\n" +
                                "1.Spring Context – for dependency injection.\n" +
                                "2.Spring AOP – for aspect oriented programming.\n" +
                                "3.Spring DAO – for database operations using DAO pattern\n" +
                                "4.Spring JDBC – for JDBC and DataSource support.\n" +
                                "5.Spring ORM – for ORM tools support such as Hibernate\n" +
                                "6.Spring Web Module – for creating web applications.\n" +
                                "7.Spring MVC – Model-View-Controller implementation for creating web applications, web services etc.\n",
                        "44"));
        productList.add(
                new Quations_java(
                        0,
                        "What is a Spring Bean ?",
                        "Any normal java class that is initialized by Spring IoC container is called Spring Bean. We use Spring ApplicationContext to get the Spring Bean instance.\n" +
                                "\n" +
                                "Spring IoC container manages the life cycle of Spring Bean, bean scopes and injecting any required dependencies in the bean.",
                        "45"));
        productList.add(
                new Quations_java(
                        0,
                        "Can we send an Object as the response of Controller handler method ?",
                        "Yes we can, using @ResponseBody annotation. This is how we send JSON or XML based response in restful web services.",
                        "46"));
        productList.add(
                new Quations_java(
                        0,
                        "What is Spring JdbcTemplate class and how to use it ?",
                        "Spring Framework provides excellent integration with JDBC API and provides JdbcTemplate utility class that we can use to avoid bolier-plate code from our database operations logic such as Opening/Closing Connection, ResultSet, PreparedStatement etc.\n" +
                                "\n" +
                                "For JdbcTemplate example, please refer Spring JDBC Example.\n",
                        "47"));
        productList.add(
                new Quations_java(
                        0,
                        "What is Spring DAO ?",
                        "Spring DAO support is provided to work with data access technologies like JDBC, Hibernate in a consistent and easy way. For example we have JdbcDaoSupport, HibernateDaoSupport, JdoDaoSupport and JpaDaoSupport for respective technologies.\n" +
                                "\n" +
                                "Spring DAO also provides consistency in exception hierarchy and we don’t need to catch specific exceptions.",
                        "48"));
        productList.add(
                new Quations_java(
                        0,
                        "What is a Spring configuration file ?",
                        "A Spring configuration file is an XML file. This file mainly contains the classes information. It describes how those classes are configured as well as introduced to each other. The XML configuration files, however, are verbose and more clean. If it’s not planned and written correctly, it becomes very difficult to manage in big projects.",
                        "49"));

        productList.add(
                new Quations_java(
                        0,
                        "What are the different components of a Spring application ?",
                        "A Spring application, generally consists of following components:\n" +
                                "\n" +
                                "1.Interface: It defines the functions.\n" +
                                "2.Bean class: It contains properties, its setter and getter methods, functions etc.\n" +
                                "3.Spring Aspect Oriented Programming (AOP): Provides the functionality of cross-cutting concerns.\n" +
                                "4.Bean Configuration File: Contains the information of classes and how to configure them.\n" +
                                "5.User program: It uses the function.",
                        "50"));
        productList.add(
                new Quations_java(
                        0,
                        "In how many ways can Dependency Injection be done ?",
                        "In general, dependency injection can be done in three ways, namely :\n" +
                                "\n" +
                                "1.Constructor Injection\n" +
                                "2.Setter Injection\n" +
                                "3.Interface Injection\n" +
                                "\n" +
                                "In Spring Framework, only constructor and setter injections are used.",
                        "51"));
        productList.add(
                new Quations_java(
                        0,
                        "How many types of IOC containers are there in spring ?",
                        "1.BeanFactory: BeanFactory is like a factory class that contains a collection of beans. It instantiates the bean whenever asked for by clients.\n" +
                                "2.ApplicationContext: The ApplicationContext interface is built on top of the BeanFactory interface. It provides some extra functionality on top BeanFactory.",
                        "52"));
        productList.add(
                new Quations_java(
                        0,
                        "How many bean scopes are supported by Spring ?",
                        "The Spring Framework supports five scopes. They are:\n" +
                                "\n" +
                                "1.Singleton: This provides scope for the bean definition to single instance per Spring IoC container.\n" +
                                "2.Prototype: This provides scope for a single bean definition to have any number of object instances.\n" +
                                "3.Request: This provides scope for a bean definition to an HTTP-request. \n" +
                                "4.Session: This provides scope for a bean definition to an HTTP-session. \n" +
                                "5.Global-session: This provides scope for a bean definition to an Global HTTP-session. \n" +
                                "\n" +
                                "The last three are available only if the users use a web-aware ApplicationContext.",
                        "53"));

        productList.add(
                new Quations_java(
                        0,
                        "What do you mean by Aspect ?",
                        "Aspect is a modularization of concern which cuts across multiple objects. Transaction management is a good example of a crosscutting concern in J2EE applications. Aspects are implemented using regular classes or regular classes annotated with the @Aspect annotation in Spring Framework.\n",
                        "54"));


        productList.add(
                new Quations_java(
                        0,
                        "What do you mean by Proxy in Spring Framework ?",
                        "An object which is created after applying advice to a target object is known as a Proxy. In case of client objects the target object and the proxy object are the same.",
                        "55"));


        productList.add(
                new Quations_java(
                        0,
                        "What do you mean by Spring MVC framework ?",
                        "The Spring web MVC framework provides model-view-controller architecture and ready to use components that are used to develop flexible and loosely coupled web applications. The MVC pattern helps in separating the different aspects of the application like input logic, business logic and UI logic, while providing a loose coupling between all these elements.",
                        "56"));


        productList.add(
                new Quations_java(
                        0,
                        "Explain WebApplicationContext.",
                        "The WebApplicationContext is an extension of the plain ApplicationContext. It has some extra features that are necessary for web applications. It differs from a normal ApplicationContext in terms of its capability of resolving themes and in deciding which servlet it is associated with.",
                        "57"));


        productList.add(
                new Quations_java(
                        0,
                        "What are benefits of using spring ?",

                                "Following is the list of few of the great benefits of using Spring Framework:\n" +
                                "\n" +
                                "1.Lightweight − Spring is lightweight when it comes to size and transparency. The basic version of spring framework is around 2MB.\n" +
                                "\n" +
                                "2.Inversion of control (IOC) − Loose coupling is achieved in spring using the technique Inversion of Control. The objects give their dependencies instead of creating or looking for dependent objects.\n" +
                                "\n" +
                                "3.Aspect oriented (AOP) − Spring supports Aspect oriented programming and enables cohesive development by separating application business logic from system services.\n" +
                                "\n" +
                                "4.Container − Spring contains and manages the life cycle and configuration of application objects.\n" +
                                "\n" +
                                "5.MVC Framework − Spring's web framework is a well-designed web MVC framework, which provides a great alternative to web frameworks such as Struts or other over engineered or less popular web frameworks.\n" +
                                "\n" +
                                "6.Transaction Management − Spring provides a consistent transaction management interface that can scale down to a local transaction (using a single database, for example) and scale up to global transactions (using JTA, for example).\n" +
                                "\n" +
                                "7.Exception Handling − Spring provides a convenient API to translate technology-specific exceptions (thrown by JDBC, Hibernate, or JDO, for example) into consistent, unchecked exceptions.\n" +
                                "\n",
                        "58"));


        productList.add(
                new Quations_java(
                        0,
                        "What are the different modules in Spring framework ?",

                                "Following are the modules of the Spring framework:\n" +
                                "\n" +
                                "1.Core module\n" +
                                "2.Bean module\n" +
                                "3.Context module\n" +
                                "4.Expression Language module\n" +
                                "5.JDBC module\n" +
                                "6.ORM module\n" +
                                "7.OXM module\n" +
                                "8.Java Messaging Service(JMS) module\n" +
                                "9.Transaction module\n" +
                                "10.Web module\n" +
                                "11.Web-Servlet module\n" +
                                "12.Web-Struts module\n" +
                                "13.Web-Portlet module\n" +
                                "\n",
                        "59"));


        productList.add(
                new Quations_java(
                        0,
                        "What is Spring configuration file ?",
                        "Spring configuration file is an XML file. This file contains the classes information and describes how these classes are configured and introduced to each other.",
                        "60"));


        productList.add(
                new Quations_java(
                        0,
                        "What is Dependency Injection ?",


                                "Inversion of Control (IoC) is a general concept, and it can be expressed in many different ways and Dependency Injection is merely one concrete example of Inversion of Control.\n" +
                                "\n" +
                                "This concept says that you do not create your objects but describe how they should be created. You don't directly connect your components and services together in code but describe which services are needed by which components in a configuration file. A container (the IOC container) is then responsible for hooking it all up.\n",
                        "61"));






        productList.add(
                new Quations_java(
                        0,
                        "What are types of IoC containers? Explain them.",

                                "There are two types of IoC containers −\n" +
                                "\n" +
                                "    Bean Factory container − This is the simplest container providing basic support for DI .The BeanFactory is usually preferred where the resources are limited like mobile devices or applet based applications\n" +
                                "\n" +
                                "    Spring ApplicationContext Container − This container adds more enterprise-specific functionality such as the ability to resolve textual messages from a properties file and the ability to publish application events to interested event listeners.\n"
                         ,
                        "62"));



        productList.add(
                new Quations_java(
                        0,
                        "What is the difference between constructor injection and setter injection ?",
                        "No.\tConstructor Injection  -> \tSetter Injection\n" +
                                "1)\tNo Partial Injection -> \tPartial Injection\n" +
                                "2)\tDesn't override the setter property -> \tOverrides the constructor property if both are defined.\n" +
                                "3)\tCreates new instance if any modification occurs -> \tDoesn't create new instance if you change the property value\n" +
                                "4)\tBetter for too many properties -> \tBetter for few properties.",
                        "63"));

        productList.add(
                new Quations_java(
                        0,
                        "What is autowiring in spring? What are the autowiring modes ?",
                        "Autowiring enables the programmer to inject the bean automatically. We don't need to write explicit injection logic.\n\n"+
                                "<bean id='emp' class='com.javatpoint.Employee' autowire='byName'\n\n"+"The autowiring modes are given below:\n" +
                                "No.\t Mode ->\tDescription\n" +
                                "1)\t  no -> \tthis is the default mode, it means autowiring is not enabled.\n" +
                                "2)\t  byName -> \tinjects the bean based on the property name. It uses setter method.\n" +
                                "3)\t  byType -> \tinjects the bean based on the property type. It uses setter method.\n" +
                                "4)\t  constructor -> \tIt injects the bean using constructor ",
                        "64"));

        productList.add(
                new Quations_java(
                        30,
                        "What is default scope of bean in Spring framework ?",
                        "The default scope of bean is Singleton for Spring framework.",
                        "65"));

        productList.add(
                new Quations_java(
                        30,
                        "Are Singleton beans thread safe in Spring Framework ?",
                        "\n"+
                                "No, singleton beans are not thread-safe in Spring framework.\n",
                        "66"));
        productList.add(
                new Quations_java(
                        30,
                        "What is a DispatcherServlet ?",
                        "The Spring Web MVC framework is designed around a DispatcherServlet that handles all the HTTP requests and responses. ",
                        "67"));
        productList.add(
                new Quations_java(
                        30,
                        "What is WebApplicationContext ?",
                        "The WebApplicationContext is an extension of the plain ApplicationContext that has some extra features necessary for web applications. It differs from a normal ApplicationContext in that it is capable of resolving themes, and that it knows which servlet it is associated with.",
                        "68"));
        productList.add(
                new Quations_java(
                        30,
                        "Explain the @Controller annotation.",
                        "The @Controller annotation indicates that a particular class serves the role of a controller. Spring does not require you to extend any controller base class or reference the Servlet API.",
                        "69"));
        productList.add(
                new Quations_java(
                        30,
                        "Explain @RequestMapping annotation.",
                        "@RequestMapping annotation is used to map a URL to either an entire class or a particular handler method.",
                        "70"));

        productList.add(
                new Quations_java(
                        30,
                        "Good luck with your interview!",
                        "",
                        "**"));







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



