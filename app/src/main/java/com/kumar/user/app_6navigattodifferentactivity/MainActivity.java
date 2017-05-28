package com.kumar.user.app_6navigattodifferentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tView;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView= (TextView) findViewById(R.id.textView2);

    }

    public void buSecondActivity(View view) {
        Intent intent=new Intent(this,Second_Activity.class);
        intent.putExtra("Activity one","Hey this data from firstactivity throug intent");
//        startActivity(intent);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == REQUEST_CODE){
                if (resultCode==RESULT_OK){
                    String result=data.getStringExtra("return Data");
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }

            }
    }
}
