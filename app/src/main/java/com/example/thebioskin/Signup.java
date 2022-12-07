package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    Button btn_SignUp;
    EditText edt_FullnameInput, edt_PhoneNumberInput, edt_EmailInput, edt_PasswordInput ;
    CheckBox ckb_Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        linkViews();
        addEvents();
    }

    private void linkViews() {
        edt_FullnameInput = findViewById(R.id.edt_FullnameInput);
        edt_PhoneNumberInput = findViewById(R.id.edt_PhoneNumberInput);
        edt_EmailInput = findViewById(R.id.edt_EmailInput);
        edt_PasswordInput = findViewById(R.id.edt_PasswordInput);
        btn_SignUp = findViewById(R.id.btn_SignUp);
        ckb_Check = findViewById(R.id.ckb_Check);

    }
    private void addEvents() {
        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_FullnameInput.getText().toString().trim().isEmpty()
                        || edt_PhoneNumberInput.getText().toString().trim().isEmpty()
                        || edt_EmailInput.getText().toString().trim().isEmpty()
                        || edt_PasswordInput.getText().toString().trim().isEmpty()) {

                    Toast.makeText(Signup.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;

                } else {
                    Toast.makeText(Signup.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Signup.this, Login.class);
                    startActivity(intent);
                    return;
                }
            }
        });
    }
}