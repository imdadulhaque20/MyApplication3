package com.example.jony.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Jony on 4/3/2016.
 */
public class ActivityA extends ActionBarActivity implements View.OnClickListener {

    private ViewGroup mRoot;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_a);

        mRoot =(ViewGroup)findViewById(R.id.container);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);

        mRoot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Fade fade = new Fade();
//        fade.setDuration(4000);
//        TransitionManager.beginDelayedTransition(mRoot,fade);
        toggleVisibility(bt1,bt2,bt3,bt4);

    }

    public void toggleVisibility(View... views){
        for(View current:views){
            if(current.getVisibility()==View.VISIBLE){
                current.setVisibility(View.INVISIBLE);
            }
        }
    }
}
