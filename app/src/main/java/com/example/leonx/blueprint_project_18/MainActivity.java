package com.example.leonx.blueprint_project_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "hello again", Toast.LENGTH_LONG);
        myToast.show();
    }
}
