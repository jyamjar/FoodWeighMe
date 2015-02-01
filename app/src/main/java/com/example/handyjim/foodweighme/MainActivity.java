package com.example.handyjim.foodweighme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    public String mFoodWeight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Weight mWeight = new Weight();


        Log.d(TAG, "Initial Weight is " + mWeight.getWeightPound());
        Log.d(TAG, "Initial Calories is " + mWeight.getWeightCal());

        // EditText
        final EditText pounds = (EditText)findViewById(R.id.weight_input);


        //Buttons
        Button bigMacs = (Button)findViewById(R.id.button_bigmac);
        bigMacs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText pounds = (EditText)findViewById(R.id.weight_input);
                String sTextFromET = pounds.getText().toString();
                int nIntFromET = new Integer(sTextFromET).intValue();

                mWeight.setWeightPound(nIntFromET);
                mWeight.setWeightCal(nIntFromET);
                int i = mWeight.getWeightCal() / 550;
                Log.d(TAG, "mWeight is " +mWeight.getWeightPound());
                Log.d(TAG, "You weigh " +i+" Big Macs");

                TextView weight = (TextView)findViewById(R.id.food_weight);
                weight.setText("You weigh " +i+ " Big Macs!");
            }
        });

        Button burritos = (Button)findViewById(R.id.button_burrito);
        burritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText pounds = (EditText)findViewById(R.id.weight_input);
                String sTextFromET = pounds.getText().toString();
                int nIntFromET = new Integer(sTextFromET).intValue();

                mWeight.setWeightPound(nIntFromET);
                mWeight.setWeightCal(nIntFromET);
                int i = mWeight.getWeightCal() / 970;
                Log.d(TAG, "mWeight is " +mWeight.getWeightPound());
                Log.d(TAG, "You weigh " +i+" Burritos");

                TextView weight = (TextView)findViewById(R.id.food_weight);
                weight.setText("You weigh " +i+ " Burritos!");
            }
        });

        Button pizzas = (Button)findViewById(R.id.button_pizza);
        pizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText pounds = (EditText)findViewById(R.id.weight_input);
                String sTextFromET = pounds.getText().toString();
                int nIntFromET = new Integer(sTextFromET).intValue();

                mWeight.setWeightPound(nIntFromET);
                mWeight.setWeightCal(nIntFromET);
                int i = mWeight.getWeightCal() / 285;
                Log.d(TAG, "mWeight is " +mWeight.getWeightPound());
                Log.d(TAG, "You weigh " +i+" Pizza Slices");

                TextView weight = (TextView)findViewById(R.id.food_weight);
                weight.setText("You weigh " +i+ " Pizza Slices!");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

        // Add share button at top right of menu for social share
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
