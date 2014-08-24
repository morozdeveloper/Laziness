package com.example.user.laziness;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

    TextView out;
    Button btnyes;
    Button btnno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        out = (TextView) findViewById(R.id.out);
        btnyes = (Button) findViewById(R.id.btnyes);
        btnno = (Button) findViewById(R.id.btnno);

        out.setText("Ты лентяй?");
        btnyes.setText("Да");
        btnno.setText("Нет");


        View.OnClickListener oclbtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.btnyes:
                        out.setText("Не грусти, человек! Все мы ленивы...");
                        break;
                    case R.id.btnno:
                        out.setText("Хехе Лжешь ведь, лжешь..");
                        break;

                }
            }
        };

        btnyes.setOnClickListener(oclbtn);
        btnno.setOnClickListener(oclbtn);

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

