package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btn_Login ;
    EditText edt_NameInput, edt_PasswordInput ;
    TextView txt_ForgotPassword, txt_RegisterNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        linkViews();
        addEvents();
    }

    private void linkViews() {
        edt_NameInput = findViewById(R.id.edt_NameInput);
        edt_PasswordInput = findViewById(R.id.edt_PasswordInput);
        txt_ForgotPassword = findViewById(R.id.txt_ForgotPassword);
        txt_RegisterNow = findViewById(R.id.txt_RegisterNow);
        btn_Login = findViewById(R.id.btn_Login);
    }
    private void addEvents() {
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_NameInput.getText().toString().trim().isEmpty()
                        || edt_PasswordInput.getText().toString().trim().isEmpty()){
                    Toast.makeText(Login.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(Login.this, HomeActivity.class);
                startActivity(intent);
                }

        });
        txt_ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);
            }
        });
        txt_RegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }
        });
    }

}