package com.odc.kwarti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.astuetz.viewpager.extensions.sample.R;
import com.parse.Parse;
import com.parse.ParseObject;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("R1G4VjcjeG97zzPyxHa3n1bQA0PGkTH4CmMp0rxW")
                .server("http://YOUR_PARSE_SERVER:1337/parse")

        .build()
        );

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }

}