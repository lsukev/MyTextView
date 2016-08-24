package com.lsukev.mytextview;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonId;
    private TextView textViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonId = (Button)findViewById(R.id.buttonId);
        textViewId = (TextView)findViewById(R.id.textViewId);

        buttonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "I was clicked", Toast.LENGTH_LONG).show();
                textViewId.setText("The button was pressed!");

            }
        });
    }
}
