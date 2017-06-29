package com.salangsang.romeo.burnedcaloriescalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class BurnedCaloriesCalculatorActivity extends AppCompatActivity {

    //Declare Variables here

    //Declare Variables
    TextView weightTV, milesRanTV, caloriesBurntTV, milesRan;
    TextView caloriesTV, heightTV, bmiTV, bmiOutTV, nameTV;
    Spinner spinner1, spinner2;
    SeekBar seekBar;
    EditText weightET, nameET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burned_calories_calculator);

        //Reference to my widget

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        milesRan = (TextView) findViewById(R.id.milesRan);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        TextView weightTV = (TextView) findViewById(R.id.weightTV);
        final TextView milesRan = (TextView) findViewById(R.id.milesRan);
        final TextView milesRanTV = (TextView) findViewById(R.id.milesRanTV);
        final TextView caloriesBurntTV = (TextView) findViewById(R.id.caloriesBurntTV);
        final TextView caloriesTV = (TextView) findViewById(R.id.caloriesTV);
        TextView heightTV = (TextView) findViewById(R.id.heightTV);
        final TextView bmiTV = (TextView) findViewById(R.id.bmiTV);
        final int bmiOutTV;
        TextView nameTV = (TextView) findViewById(R.id.nameTV);
        weightET = (EditText) findViewById(R.id.weightET);
        nameET = (EditText) findViewById(R.id.nameET);

        //Setting up my listeners
        weightET.setOnEditorActionListener(this);
        weightET.setOnKeyListener(this);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setOnKeyListener(this);


        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(BurnedCaloriesCalculatorActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner1));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(BurnedCaloriesCalculatorActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner2));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter);


        //Event Handler for Edit Text
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_ACTION_DONE ||
                    actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {
                calculateAndDisplay();
            }
            return false;


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                milesRan.setText(progress + "mi");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


                public void calculateAndDisplay() {
                int var1 = (int) 0.75; {
                    // get the milesRan
                        if (milesRan.equals("")) {
                            caloriesBurntTV = 0;
                        }else
                    caloriesBurntTV = Float.parseFloat();
                    }
                    else {
                        // calculate BMI
                        bmiOutTV = weightET * 703 / ((12 * spinner1) *(12 * spinner2));
                    }

                    // get
                    int progress = seekBar.getProgress();
                    milesRan = (float) progress / 100;

                    // calculate BMI
                    float weightTV = 0;
                    float bmiOutTV = 0;
                    if

                    }

        })
