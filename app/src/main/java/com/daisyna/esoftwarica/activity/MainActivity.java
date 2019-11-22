package com.daisyna.esoftwarica.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.daisyna.esoftwarica.R;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtName.getText().toString().matches("")){
                    edtName.setError("Enter your username.");
                    return;
                }
                if(edtPassword.getText().toString().matches("")){
                    edtPassword.setError("Enter your password.");
                    return;
                }
                login();

            }
        });
    }

    private void login(){
        String username=edtName.getText().toString().trim();
        String password=edtPassword.getText().toString().trim();

        if(username.equals("daisyna")&&password.equals("daisyna")){
            Intent intent=new Intent(this,Display.class);
            startActivity(intent);

        }
        else {
            Toast.makeText(this,"Please enter correct credentials !",Toast.LENGTH_LONG).show();
        }
    }}
