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

public class android_app_questions extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.android_app_questions);

        List<Quations_java> productList;

        RecyclerView recyclerView;

        toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SteveBrains");
        toolbar.setSubtitle("Android app development Interview Q 2020");
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
                        "What is Android ?",
                        "Android is an open-source, Linux-based operating system used in mobiles, tablets, televisions, etc.",
                        "1"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Who is the founder of Android ?",
                        "Andy Rubin.",
                        "2"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Explain the Android application Architecture.",
                        "Following is a list of components of Android application architecture:\n" +
                                "\n" +
                                "1.Services: Used to perform background functionalities.\n" +
                                "2.Intent: Used to perform the interconnection between activities and the data passing mechanism.\n" +
                                "3.Resource Externalization: strings and graphics.\n" +
                                "4.Notification: light, sound, icon, notification, dialog box and toast.\n" +
                                "5.Content Providers: It will share the data between applications.\n",
                        "3"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are the code names of android ?",
                        "\n" +
                                "1.Aestro\n" +
                                "2.Blender\n" +
                                "3.Cupcake\n" +
                                "4.Donut\n" +
                                "5.Eclair\n" +
                                "6.Froyo\n" +
                                "7.Gingerbread\n" +
                                "8.Honeycomb\n" +
                                "9.Ice Cream Sandwich\n" +
                                "10.Jelly Bean\n" +
                                "11.KitKat\n" +
                                "12.Lollipop\n" +
                                "13.Marshmallow\n"+
                                "14.Nougat\n" +
                                "15.Oreo",
                        "4"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are the advantages of Android ?",
                        "Open-source: It means no license, distribution and development fee.\n" +
                                "\n" +
                                "Platform-independent: It supports Windows, Mac, and Linux platforms.\n" +
                                "\n" +
                                "Supports various technologies: It supports camera, Bluetooth, wifi, speech, EDGE etc. technologies.\n" +
                                "\n" +
                                "Highly optimized Virtual Machine: Android uses a highly optimized virtual machine for mobile devices, called DVM (Dalvik Virtual Machine).",
                        "5"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Does android support other languages than java ?",
                        "Yes, an android app can be developed in C/C++ also using android NDK (Native Development Kit). It makes the performance faster. It should be used with Android SDK.",
                        "6"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are the core building blocks of android ?",
                        "There are 7 life-cycle methods of activity. They are as follows:\n" +
                                "\n" +
                                "1.onCreate()\n" +
                                "2.onStart()\n" +
                                "3.onResume()\n" +
                                "4.onPause()\n" +
                                "5.onStop()\n" +
                                "6.onRestart()\n" +
                                "7.onDestroy()\n",
                        "7"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is intent ?",
                        "It is a kind of message or information that is passed to the components. It is used to launch an activity, display a web page, send SMS, send email, etc. There are two types of intents in android:\n" +
                                "\n" +
                                "1.Implicit Intent\n" +
                                "2.Explicit Intent\n",
                        "8"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How are view elements identified in the android program ?",
                        "View elements can be identified using the keyword findViewById.",
                        "9"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Define Android toast.",
                        "An android toast provides feedback to the users about the operation being performed by them. It displays the message regarding the status of operation initiated by the user.",
                        "10"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Give a list of impotent folders in android",
                        "The following folders are declared as impotent in android:\n" +
                                "\n" +
                                "1.AndroidManifest.xml\n" +
                                "2.build.xml\n" +
                                "3.bin/\n" +
                                "4.src/\n" +
                                "5.res/\n" +
                                "6.assets/\n",
                        "11"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Explain the use of 'bundle' in android ? ",
                        "We use bundles to pass the required data to various subfolders.",
                        "12"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is an application resource file ?",
                        "The files which can be injected for the building up of a process are called as application resource file. ",
                        "13"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the use of LINUX ID in android ?",
                        "A unique Linux ID is assigned to each application in android. It is used for the tracking of a process.",
                        "14"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Can the bytecode be written in java be run on android ?",
                        "No",
                        "15"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "List the various storages that are provided by Android.",
                        "The various storage provided by android are:\n" +
                                "\n" +
                                "1.Shared Preferences\n" +
                                "2.Internal Storage\n" +
                                "3.External Storage\n" +
                                "4.SQLite Databases\n" +
                                "5.Network Connection\n",
                        "16"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How are layouts placed in Android ?",
                        "Layouts in Android are placed as XML files.",
                        "17"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Where are layouts placed in Android ?",
                        "Layouts in Android are placed in the layout folder. ",
                        "18"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the implicit intent in android ?",
                        "The Implicit intent is used to invoke the system components. ",
                        "19"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is explicit intent in android ?",
                        "An explicit intent is used to invoke the activity class.",
                        "20"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "How to call another activity in android ?",
                        "Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  \n" +
                                "startActivity(i);  ",
                        "21"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is service in android ?",
                        "A service is a component that runs in the background. It is used to play music, handle network transaction, etc.",
                        "22"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the name of the database used in android ?",
                        "SQLite: An opensource and lightweight relational database for mobile devices.",
                        "23"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is AAPT ?",
                        "AAPT is an acronym for android asset packaging tool. It handles the packaging process.",
                        "24"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is a content provider ?",
                        "A content provider is used to share information between Android applications.",
                        "25"
                ));  productList.add(
                new Quations_java(
                        1,
                        "What is fragment ?",
                        "The fragment is a part of Activity by which we can display multiple screens on one activity.",
                        "26"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is ADB ?",
                        "ADB stands for Android Debug Bridge. It is a command line tool that is used to communicate with the emulator instance.",
                        "27"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is NDK ?",
                        "NDK stands for Native Development Kit. By using NDK, you can develop a part of an app using native language such as C/C++ to boost the performance.",
                        "28"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is ANR ?",
                        "ANR stands for Application Not Responding. It is a dialog box that appears if the application is no longer responding.",
                        "29"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is the Google Android SDK?",
                        "The Google Android SDK is a toolset which is used by developers to write apps on Android-enabled devices. It contains a graphical interface that emulates an Android-driven handheld environment and allows them to test and debug their codes.",
                        "30"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is an APK format ?",
                        "APK is a short form stands for Android Packaging Key. It is a compressed key with classes, UI's, supportive assets and manifest. All files are compressed to a single file is called APK.",
                        "31"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Which language does Android support to develop an application ?",
                        "Android applications are written by using the java (Android SDK) and C/C++ (Android NDK).",
                        "32"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is ADT in Android ?",
                        "ADT stands for Android Development Tool. It is used to develop the applications and test the applications.",
                        "33"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is View Group in Android ?",
                        "View Group is a collection of views and other child views. It is an invisible part and the base class for layouts.",
                        "34"
                ));  productList.add(
                new Quations_java(
                        1,
                        "What is the Adapter in Android ? ",
                        "An adapter is used to create a child view to present the parent view items.",
                        "35"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is nine-patch images tool in Android ?",
                        "We can change bitmap images into nine sections with four corners, four edges, and an axis.",
                        "36"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Which kernel is used in Android ?",
                        "Android is a customized Linux 3.6 kernel.",
                        "37"
                ));
        productList.add(
                new Quations_java(
                        1,
                        " What is application Widgets in Android ?",
                        "Application widgets are miniature application views that can be embedded in other applications and receive periodic updates.",
                        "38"
                ));  productList.add(
                new Quations_java(
                        1,
                        "Which types of flags are used to run an application on Android ?",
                        "Following are two types of flags to run an application in Android:\n" +
                                "\n" +
                                "1.FLAG_ACTIVITY_NEW_TASK\n" +
                                "2.FLAG_ACTIVITY_CLEAR_TOP\n",
                        "39"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is a singleton class in Android ?",
                        "A singleton class is a class which can create only an object that can be shared by all other classes.",
                        "40"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is sleep mode in Android ?",
                        "In sleep mode, CPU is slept and doesn't accept any commands from android device except Radio interface layer and alarm.",
                        "41"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What do you mean by a drawable folder in Android ?",
                        "In Android, a drawable folder is compiled a visual resource that can use as a background, banners, icons, splash screen, etc.",
                        "42"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is DDMS ? ",
                        "DDMS stands for Dalvik Debug Monitor Server. It gives the wide array of debugging features:\n" +
                                "\n" +
                                "1.Port forwarding services\n" +
                                "2.Screen capture\n" +
                                "3.Thread and heap information\n" +
                                "4.Network traffic tracking\n" +
                                "5.Location data spoofing\n",
                        "43"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Define Android Architecture ?",
                        "The Android architecture consists of 4 components:\n" +
                                "\n" +
                                "    Linux Kernal\n" +
                                "    Libraries\n" +
                                "    Android Framework\n" +
                                "    Android Applications\n",
                        "44"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What is a portable wi-fi hotspot ?",
                        "The portable wi-fi hotspot is used to share internet connection to other wireless devices.",
                        "45"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Name the dialog box which is supported by Android ?",
                        "\n" +
                                "1.Alert Dialog\n" +
                                "2.Progress Dialog\n" +
                                "3.Date Picker Dialog\n" +
                                "4.Time picker Dialog\n",
                        "46"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "Name some exceptions in Android ?",
                        "\n" +
                                "1.Inflate Exception\n" +
                                "2.Surface.OutOfResourceException\n" +
                                "3.SurfaceHolder.BadSurfaceTypeException\n" +
                                "4.WindowManager.BadTokenException\n",
                        "47"
                ));
        productList.add(
                new Quations_java(
                        1,
                        "What are the basic tools used to develop an Android app ?",
                        "\n" +
                                "    JDK\n" +
                                "    Eclipse+ADT plugin\n" +
                                "    SDK Tools\n",
                        "48"
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


