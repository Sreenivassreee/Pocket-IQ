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

public class linux_questions extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.linux_questions);




                List<Quations_java> productList;

                RecyclerView recyclerView;

                toolbar=findViewById(R.id.toolbar);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                getSupportActionBar().setTitle("SteveBrains");
                toolbar.setSubtitle("Linux Interview Q 2020");
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
                                "What is Linux ?",
                                "Linux is a UNIX based operating system. Linus Torvalds first introduced it. It is an open source operating system that was designed to provide free and a low-cost operating system for the computer users.",
                                "1"
                        ));

                productList.add(
                        new Quations_java(
                                1,
                                "What is the difference between UNIX and Linux ?",
                                "UNIX was originally started as a propriety operating system for Bell Laboratories, which later release their commercial version while Linux is a free, open source and a non-propriety operating system for the mass uses. ",
                                "2"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is Linux Kernel ?",
                                "Linux Kernel is low-level system software. It is used to manage the hardware resources for the users. It provides an interface for user-level interaction. ",
                                "3"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Is it legal to edit Linux Kernel ?",
                                "Yes. You can edit Linux Kernel because it is released under General Public License (GPL) and anyone can edit it. It comes under the category of free and open source software. ",
                                "4"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is LILO?",
                                "LILO is a boot loader for Linux. It is used to load the Linux operating system into the main memory to begin its operations.",
                                "5"
                        ));

                        productList.add(
                        new Quations_java(
                                1,
                                "What is the advantage of open source ?",
                                "Open source facilitates you to distribute your software, including source codes freely to anyone who is interested. So, you can add features and even debug and correct errors of the source code. ",
                                "6"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What are the basic components of Linux ?",
                                "Just like other operating systems, Linux has all components like kernel, shells, GUIs, system utilities and application programs. ",
                                "7"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is the advantage of Linux ?",
                                "Every aspect comes with additional features, and it provides a free downloading facility for all codes. ",
                                "8"
                        ));

                        productList.add(
                        new Quations_java(
                                1,
                                "Define shell",
                                "t is an interpreter in Linux.",
                                "9"
                        ));

                        productList.add(
                        new Quations_java(
                                1,
                                "Name some shells that are commonly used in Linux.",
                                "The most commonly used shells in Linux are bash, csh, ksh, bsh.",
                                "10"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Name the Linux which is specially designed by the Sun Microsystems. ",
                                "Solaris is the Linux of Sun Microsystems. ",
                                "11"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Solaris is the Linux of Sun Microsystems. ",
                                "LILO is the Linux loader.",
                                "12"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "If you have saved a file in Linux. Later you wish to rename that file, what command is designed for it?",
                                "The 'mv' command is used to rename a file.",
                                "13"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Write about an internal command.",
                                "The commands which are built in the shells are called as the internal commands.",
                                "14"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Define inode.",
                                "Each file is given a unique name by the operating system which is called as the inode. ",
                                "15"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "If the programmer wishes to execute an instruction at the specified time. Which command is used ?",
                                "The 'at' command is used for the same.",
                                "16"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Explain process id.",
                                "The operating system uniquely identifies each process by a unique id called as the process id.",
                                "17"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Name some Linux variants.",
                                "Some of the Linux commands are:\n" +
                                        "\n" +
                                        "    CentOS\n" +
                                        "    Ubuntu\n" +
                                        "    Redhat\n" +
                                        "    Debian\n" +
                                        "    Fedora",
                                "18"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is Swap Space ?",
                                "Swap space is used to specify a space which is used by Linux to hold some concurrent running program temporarily. It is used when RAM does not have enough space to hold all programs that are executing.",
                                "19"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is BASH ?",
                                "BASH is a short form of Bourne Again SHell. It was a replacement to the original Bourne shell, written by Steve Bourne.",
                                "20"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is the basic difference between BASH and DOS ?",
                                "\n" +
                                        "    BASH commands are case sensitive while DOS commands are not case sensitive.\n" +
                                        "    DOS follows a convention in naming files. In DOS, 8 character file name is followed by a dot and 3 characters for the extension. BASH doesn't follow such convention.",
                                "21"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is a root account ?",
                                "The root account is like a system administrator account. It provides you full control of the system. You can create and maintain user accounts, assign different permission for each account, etc. ",
                                "22"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is CLI ? ",
                                "CLI stands for Command Line Interface. It is an interface that allows users to type declarative commands to instruct the computer to perform operations. ",
                                "23"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is the GUI ?",
                                "GUI stands for Graphical User Interface. It uses the images and the icons which are clicked by the users to communicate with the system. It is more attractive and user-friendly because of the use of the images and icons.",
                                "24"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Which popular office suite is available free for both Microsoft and Linux?",
                                "Open Office Suite is available free for both Microsoft and Linux. You can install it on both of them.",
                                "25"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Suppose your company is recently switched from Microsoft to Linux and you have some MS Word document to save and work in Linux, what will you do ?",
                                "Install Open Office Suite on Linux. It facilitates you to work with Microsoft documents. ",
                                "26"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is SMTP ?",
                                "SMTP stands for Simple Mail Transfer Protocol. It is an internet standard for mail transmission. ",
                                "27"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is Samba? Why is it used ?",
                                "Samba service is used to connect Linux machines to Microsoft network resources by providing Microsoft SMB support. ",
                                "28"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What are the basic commands for user management ?",

                                "    last,\n" +
                                        "    chage,\n" +
                                        "    chsh,\n" +
                                        "    lsof,\n" +
                                        "    chown,\n" +
                                        "    chmod,\n" +
                                        "    useradd,\n" +
                                        "    userdel,\n" +
                                        "    newusers etc.",
                                "29"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is the maximum length for a filename in Linux ?",
                                "255 characters.",
                                "30"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Is Linux Operating system virus free ?",
                                "No, There is no operating system till date that is virus free, but Linux is known to have less number of viruses. ",
                                "31"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Which partition stores the system configuration files in Linux system ?",
                                "/stc partition.",
                                "32"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Which command is used to uncompress gzip files ?",
                                "gunzip command is used to uncompress gzip files. ",
                                "33"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Why do developers use MD5 options on passwords ?",
                                "MD5 is an encryption method, so it is used to encrypt the passwords before saving. ",
                                "34"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is a virtual desktop ?",
                                "The virtual desktop is used as an alternative to minimizing and maximizing different windows on the current desktop. Virtual desktop facilitates you to open one or more programs on a clean slate rather than minimizing or restoring all the needed programs. ",
                                "35"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "What is the difference between soft and hard mounting points ?",
                                "In the soft mount, if the client fails to connect the server, it gives an error report and closes the connection whereas in the hard mount, if the client fails to access the server, the connection hangs; and once the system is up, it again accesses the server.",
                                "36"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "Does the Alt+Ctrl+Del key combination work in Linux ?",
                                "Yes, it works like windows.",
                                "37"
                        ));


                productList.add(
                        new Quations_java(
                                1,
                                "What are the file permissions in Linux ?",
                                "There are 3 types of permissions in Linux OS that are given below:\n" +
                                        "\n" +
                                        "* Read: User can read the file and list the directory.\n" +
                                        "* Write: User can write new files in the directory .\n" +
                                        "* Execute: User can access and run the file in a directory.\n",
                                "38"
                        ));


                productList.add(
                        new Quations_java(
                                1,
                                "What are the modes used in VI editor ?",
                                "There are 3 types of modes in vi Editor:\n" +
                                        "\n" +
                                        "1.Regular mode or command mode\n" +
                                        "2.Insertion mode or edit mode\n" +
                                        "3.Replacement mode or Ex-mode",
                                "39"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "How to exit from vi editors ?",
                                "The following commands are used to exit from vi editors.\n" +
                                        "\n" +
                                        ":wq saves the current work and exits the VI.\n" +
                                        ":q! exits the VI without saving current work.",
                                "40"
                        ));

                productList.add(
                        new Quations_java(
                                1,
                                "How to delete information from a file in vi ?",
                                "The following commands are used to delete information from vi editors.\n" +
                                        "\n" +
                                        "  *  x deletes a current character.\n" +
                                        "  *  dd deletes the current line.",
                                "41"
                        ));
                productList.add(
                        new Quations_java(
                                1,
                                "How to create a new file or modify an existing file in vi ?",
                                "vi filename  ",
                                "42"
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


