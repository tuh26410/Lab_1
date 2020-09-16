package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String change = "You clicked the button!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView my_TextView = findViewById(R.id.textView);

        Button my_Button = findViewById(R.id.button);
        my_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my_TextView.setText(change);
            }
        });

    }
}