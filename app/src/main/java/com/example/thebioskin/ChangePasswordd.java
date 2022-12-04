package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ChangePasswordd extends AppCompatActivity {
    ImageView imvBack;
    EditText edtCurrentPass, edtChangePass, edtRetype;
    Button btnChangePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_passwordd);

        linkViews();
        addEvent();
    }

    private void addEvent() {
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChangePasswordd.this, Account.class);
                startActivity(intent);
            }
        });

        btnChangePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtCurrentPass.getText().toString().trim().isEmpty() || edtChangePass.getText().toString().trim().isEmpty() || edtRetype.getText().toString().trim().isEmpty()){
                    Toast.makeText(ChangePasswordd.this, "Vui lòng nhập mật khẩu mới hoặc xác nhận mật khẩu mới", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    if (edtRetype.getText().toString() != edtChangePass.getText().toString()){
                        Toast.makeText(ChangePasswordd.this, "Mật khẩu nhập lại không khớp", Toast.LENGTH_SHORT).show();
                        return;
                    }else if (edtRetype.getText().toString() == edtChangePass.getText().toString()){
                        Toast.makeText(ChangePasswordd.this, "Cập nhật mật khẩu thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private void linkViews() {
        imvBack = findViewById(R.id.imvBack);
        btnChangePass = findViewById(R.id.btn_ChangePassword);
        edtCurrentPass = findViewById(R.id.edt_CurrentPassword);
        edtChangePass = findViewById(R.id.edt_NewPassword);
        edtRetype = findViewById(R.id.edt_Retype);
    }
}