package com.cmamreport.savethechildren;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class NewReport extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_report);

        FrameLayout frame = new FrameLayout(this);
        Fragment admissionsFragment = new Fragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(android.R.id.content, admissionsFragment).commit();
    }


    public void openDischarge(View view) {

    }
}
