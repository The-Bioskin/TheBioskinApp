package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdatePassword extends AppCompatActivity {
    EditText edtNewPassInput, edtNewPassReInput;
    Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);
        linkViews();
        addEvents();
    }
    private void linkViews() {
        edtNewPassInput = findViewById(R.id.edt_Password);
        edtNewPassReInput = findViewById(R.id.edt_PasswordAgain);

        btnConfirm = findViewById(R.id.btn_Confirm);
    }


    private void addEvents(){
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNewPassInput.getText().toString().trim().isEmpty() || edtNewPassReInput.getText().toString().trim().isEmpty()){
                    Toast.makeText(UpdatePassword.this, "Vui lòng nhập mật khẩu mới hoặc xác nhận mật khẩu mới", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    if (edtNewPassInput.getText().toString() != edtNewPassReInput.getText().toString()){
                        Toast.makeText(UpdatePassword.this, "Mật khẩu nhập lại không khớp", Toast.LENGTH_SHORT).show();
                        return;
                    }else if (edtNewPassInput.getText().toString() == edtNewPassReInput.getText().toString()){
                        Toast.makeText(UpdatePassword.this, "Cập nhật mật khẩu thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }
}