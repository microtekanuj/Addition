package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1=(EditText)findViewById(R.id.e1);
                EditText e2=(EditText)findViewById(R.id.e2);
                TextView t1=(TextView)findViewById(R.id.t1);
                //final int n1=Integer.parseInt(e1.getText().toString());
                String n1=e1.getText().toString();
                float num1=Float.parseFloat(n1);
                //final int n2=Integer.parseInt(e2.getText().toString());
                String n2=e2.getText().toString();
                float num2=Float.parseFloat(n2);
                float sum=num1+num2;
                String su=String.valueOf(sum);
                t1.setText(su);
                Toast.makeText(MainActivity.this, "Sum="+su, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
