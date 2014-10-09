package com.example.sbunke.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.sbunke.myapplication.patient.PatientMain;
import com.example.sbunke.myapplication.patient.PatientTest;
import com.example.sbunke.myapplication.physician.PhysicianMain;
import com.example.sbunke.myapplication.physician.PhysicianTest;


public class MyActivity extends Activity {

    public final static String USER_ID = "com.example.sbunke.myapplication.ID";
    Activity main;

    public final static String id = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        main = this;



        //Button patientButton = ((Button) findViewById(R.id.patientButton));
        ((Button) findViewById(R.id.patientButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent = new Intent(main, PatientTest.class);
                intent.putExtra(MyActivity.USER_ID, id);
                main.startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.physicianButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent = new Intent(main, PhysicianTest.class);
                intent.putExtra(MyActivity.USER_ID, id);
                main.startActivity(intent);
            }
        });

    }

    private void addIdToIntent(Intent intent, int id) {
        intent.putExtra(USER_ID, id);
    }

    private void navigateToPatientActivity() {

    }

    private void navigateToPhysicianActivity() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
