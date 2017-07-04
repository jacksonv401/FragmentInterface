package com.noegenesys.fragmentinterface;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicate{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void addData() {
        FragmentManager fm = getFragmentManager();
        FragmentTwo two = (FragmentTwo)fm.findFragmentById(R.id.frame2);
        two.incrementData();
    }

    @Override
    public void subData() {
        FragmentManager fm = getFragmentManager();
        FragmentTwo two = (FragmentTwo)fm.findFragmentById(R.id.frame2);
        two.decrementData();
    }
}
