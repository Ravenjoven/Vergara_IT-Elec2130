package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

//import android.view.View;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String TAG = "Main Activity";
        Log.v(TAG, "This is a verbose log.");
        Log.d(TAG, "This is a debug log.");
        Log.i(TAG, "This is a info log.");
        Log.w(TAG, "This is a warn log.");
        Log.e(TAG, "This is a error log.");

        Button button = (Button) findViewById(R.id.raven);

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
            }
        }));
/*Intent intent = new Intent(MainActivity.this. SecondActivity.java);
    }
}

 */
    }
}