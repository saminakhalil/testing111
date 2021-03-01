package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    EditText face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.ed1);
        password = findViewById(R.id.ed22);
    }
    

        public void Login(View view){


            String email1=email.getText().toString();
            String password2 =password.getText().toString();
            String face =password.getText().toString();
            Toast.makeText(this, email1, Toast.LENGTH_LONG).show();
            Toast.makeText(this, password2, Toast.LENGTH_LONG).show();
            Toast.makeText(this, face, Toast.LENGTH_LONG).show();








        }

    public void facebook(View view) {
    }
}
