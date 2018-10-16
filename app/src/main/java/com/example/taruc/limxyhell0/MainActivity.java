package com.example.taruc.limxyhell0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main()function

        super.onCreate(savedInstanceState);

        //To display UI
        //R = resource class
        //Layout = folder name
        setContentView(R.layout.activity_main);
    }
    //View = class
    //v = an instance of a class
    public void showMessage(View v) {
        //Linking UI to program
        TextView textViewMsg;
        textViewMsg = findViewByID(R.id.textViewMessage);
        textViewMsg.setText("Hello, I am Mark");

    }

    public void clearScreen(View v){
        textViewMsg.setText("");

    }

}
