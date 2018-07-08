package com.example.student.myapplicationfragmentsexaple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CommActivity extends AppCompatActivity implements FirstBlankFragment.OnSaveDataClicgListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm);


    }

    @Override
    public void onSaveDataClicked() {
        System.out.println("==========");
        SecondFragment fragment =(SecondFragment) getSupportFragmentManager().findFragmentById(R.id.second_fr);
        if(fragment != null){
            fragment.updateUI("VTS !!!!!");
        }
    }
}
