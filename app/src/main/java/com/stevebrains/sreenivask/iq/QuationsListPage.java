package com.stevebrains.sreenivask.iq;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class QuationsListPage extends AppCompatActivity {

    Button android_app_questions,java_questions,c_questions,python_questions,linux_questions,DataStructure_questions,spring,java_spt,php;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.questions_list_page);


        java_questions = findViewById(R.id.java_questions);
        c_questions = findViewById(R.id.c_questions);
        python_questions = findViewById(R.id.python_questions);
        android_app_questions = findViewById(R.id.android_app_questions);
        linux_questions = findViewById(R.id.Linux_questions);
        DataStructure_questions = findViewById(R.id.DataStructure_questions);
        spring = findViewById(R.id.spring);
        java_spt = findViewById(R.id.java_spt);
        php = findViewById(R.id.php);


        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle("SteveBrains");
//        getSupportActionBar().setSubtitle("Top 100+ interview questions");
        getSupportActionBar().setTitle(null);


        java_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,java_questions.class);
                startActivity(intent);


            }
        });


        c_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,c_questions.class);
                startActivity(intent);


            }
        });
        python_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,python_questions.class);
                startActivity(intent);


            }
        });
        android_app_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,android_app_questions.class);
                startActivity(intent);


            }
        });


        linux_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,linux_questions.class);
                startActivity(intent);


            }
        });

        DataStructure_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,DataStructures_questions.class);
                startActivity(intent);


            }
        });
        spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,spring_interview_questions.class);
                startActivity(intent);


            }
        });
        java_spt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,Java_Script_i_Q.class);
                startActivity(intent);


            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuationsListPage.this,php_interview_Q.class);
                startActivity(intent);


            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_manu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){


            case R.id.about:
                Intent i =new Intent(QuationsListPage.this,About.class);
                startActivity(i);

            case android.R.id.home:
                finish();
                break;

            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "I Recently Found Super app for students.\nMore then 900 + interview Questions.\nAll Questions are prepared by Top Company people.\n\n \uD83D\uDC47\uD83C\uDFFB \n https://play.google.com/store/apps/details?id=com.stevebrains.sreenivask.iq";

                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with"));


        }


        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {

        finish();
    }
}

