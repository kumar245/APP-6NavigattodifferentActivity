package com.kumar.user.app_6navigattodifferentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        textView= (TextView) findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String resultDatafromBundle=bundle.getString("Activity one");
            textView.setText(resultDatafromBundle);
        }

    }

    public void sendToFirstActivity(View view) {
        Intent returnIntent=getIntent();
        returnIntent.putExtra("return Data","THis is from second Activity");
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}
