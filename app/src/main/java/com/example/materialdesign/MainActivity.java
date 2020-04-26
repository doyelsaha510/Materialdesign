package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextInputEditText emailId, passwd, name;
    MaterialButton signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.btn_signup);
        emailId = findViewById(R.id.input_email);
        passwd = findViewById(R.id.input_password);
        name = findViewById(R.id.input_name);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=emailId.getText().toString().trim();
                String password=passwd.getText().toString().trim();
                String fname=name.getText().toString().trim();
                if(!(email.isEmpty() &&password.isEmpty() && fname.isEmpty())) {
                    Toast.makeText(MainActivity.this, email + "\n" + fname, Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "All fields required", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
