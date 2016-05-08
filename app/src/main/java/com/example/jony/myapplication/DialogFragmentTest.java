package com.example.jony.myapplication;

import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jony on 4/9/2016.
 */
public class DialogFragmentTest extends AppCompatActivity {
    Button btDialog;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.dialog_layout);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

        }else{

        }

        btDialog = (Button)findViewById(R.id.showDialog);
        btDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager= getFragmentManager();
                MyDialog myDialog= new MyDialog();
                myDialog.show(manager,"My Dialog");

            }
        });
    }

}
