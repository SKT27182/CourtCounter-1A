package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int a = 0;


    /***************************************************
     * method for A
     ****************************************************/
    public void addThreeA(View view) {
        a += 3;
        ThreeA(a);
    }

    public void addTwoA(View view) {
        a += 2;
        ThreeA(a);
    }

    public void addFreeA(View view) {
        a += 1;
        ThreeA(a);
    }

    private void ThreeA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.A);
        quantityTextView.setText("" + number);

    }


    /*********************************************
     * method for B
     *********************************************/

    int b = 0;

    public void addThreeB(View view) {
        b += 3;
        ThreeB(b);
    }

    public void addTwoB(View view) {
        b += 2;
        ThreeB(b);
    }

    public void addFreeB(View view) {
        b += 1;
        ThreeB(b);
    }

    private void ThreeB(int i) {
        TextView t = (TextView) findViewById(R.id.B);
        t.setText("" + i);
    }


    /***********************************************
     * Method for reset
     ***********************************************/

    public void ResetAB(View view) {
        a = 0;
        b = 0;
        clearA(a);
        clearB(b);

    }

    private void clearA(int i) {
        TextView t = (TextView) findViewById(R.id.A);
        t.setText("" + i);

    }

    private void clearB(int i) {
        TextView t = (TextView) findViewById(R.id.B);
        t.setText("" + i);

    }


}