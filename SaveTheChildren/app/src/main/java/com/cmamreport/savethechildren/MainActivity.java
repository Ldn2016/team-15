package com.cmamreport.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void newReport(View view) {
        //create NewReport
        Intent intent = new Intent(this, NewReport.class);
        startActivity(intent);


    }

    public void upload(View view) {
        //todo upload and sync db
    }
}
