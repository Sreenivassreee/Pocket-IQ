package com.stevebrains.sreenivask.iq;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;



public class Welcome extends AppCompatActivity {

    private static int KSV = 1500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcome);
//        btn=findViewById(R.id.TTTTTEst);




//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#673AB7")));



//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Welcome.this,features.class);
//                startActivity(i);
//            }
//        });


            //we are connected to a network



//                if (FirebaseAuth.getInstance().getCurrentUser() != null) {

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intant = new Intent(Welcome.this,QuationsListPage.class);
                            startActivity(intant);

                            this.overridePendingTransition(1000, 1000);
                            finish();

                        }

                        private void overridePendingTransition(int i, int i1) {
                        }


                    }, KSV);
//
//                }else{
//                    Toast.makeText(this, "Something is goes Wrong please report to admin ", Toast.LENGTH_LONG).show();





    }
}





