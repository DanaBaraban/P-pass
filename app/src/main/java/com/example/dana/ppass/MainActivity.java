package com.example.dana.ppass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;


//    private Handler mHandler = new Handler();

//    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.searchForToilets);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });
    }
    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



//        timer = new Timer();
  //      timer.schedule(new TimerTask() {
    //        @Override
      //      public void run() {
        //        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
          //      startActivity(intent);
            //    finish();
           // }
        //}, 3000);
    }