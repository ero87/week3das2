package com.example.student.myapplicationfragmentsexaple;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FirstBlankFragment.OnSaveDataClicgListener {
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button remove = (Button) findViewById(R.id.remuve);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        remove.setOnClickListener(this);

        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.container, new FirstBlankFragment(),"FR_1")
                .commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1: {
                //TODO
                manager.beginTransaction()
                        .replace(R.id.container, new FirstBlankFragment(), "FR_1")
                        .addToBackStack(null)
                        .commit();
                break;
            }
            case R.id.button2: {
                //TODO
                manager.beginTransaction()
                        .replace(R.id.container, new SecondFragment(),"FR_2")
                        .commit();
                break;
            }
            case R.id.button3: {
                //TODO
                manager.beginTransaction()
                        .replace(R.id.container, new Third(),"FR_3")
                .addToBackStack(null)
                        .commit();
                break;
            }
            case R.id.remuve: {
                Fragment fragment;
                if(manager.findFragmentByTag("FR_1") != null){
                    fragment = manager.findFragmentByTag("FR_1");
                }else if(manager.findFragmentByTag("FR_2") != null){
                    fragment = manager.findFragmentByTag("FR_2");
                }else {
                    fragment = manager.findFragmentByTag("FR_3");
                }
                manager.beginTransaction()
                        .remove(fragment)
                        .commit();
                manager.popBackStack();
                break;
            }

        }
    }

    @Override
    public void onSaveDataClicked() {

    }
}
