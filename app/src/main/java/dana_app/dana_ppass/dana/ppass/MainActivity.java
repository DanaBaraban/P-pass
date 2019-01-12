package dana_app.dana_ppass.dana.ppass;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.searchForToilets);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Dosis-Regular.ttf");
        button.setTypeface(typeface);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

        handlePr();
    }
    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


   void handlePr(){
       if(checkPermissions()) {

           String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION,
                   Manifest.permission.ACCESS_COARSE_LOCATION};
           if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                   FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
               if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                       COURSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
               }else{
                   ActivityCompat.requestPermissions(this,
                           permissions,
                           LOCATION_PERMISSION_REQUEST_CODE);
               }
           }else{
               ActivityCompat.requestPermissions(this,
                       permissions,
                       LOCATION_PERMISSION_REQUEST_CODE);
           }
       }
    }


    private boolean checkPermissions() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            requestPermissions();
            return false;
        }
    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                1);
    }
    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COURSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;
}