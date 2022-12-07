package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {
    Button btn_ReceiveOtp, btn_OtpOk, btn_back;
    EditText edt_PhoneNumber, edt_Otp ;
    TextView txt_SendAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        linkViews();
        addEvents();
        otpInputs();
        edt_PhoneNumber.setText(String.format("%s", getIntent().getStringExtra("mobile")));
    }

    private void otpInputs() {
    }

    private void linkViews() {
        edt_PhoneNumber = findViewById(R.id.edt_PhoneNumber);
        btn_ReceiveOtp = findViewById(R.id.btn_ReceiveOtp);
        edt_Otp = findViewById(R.id.edt_Otp);
        txt_SendAgain = findViewById(R.id.txt_SendAgain);
        btn_OtpOk = findViewById(R.id.btn_OtpOk);
        btn_back = findViewById(R.id.btn_back);
    }
    private void addEvents() {
        btn_ReceiveOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_PhoneNumber.getText().toString().trim().isEmpty()){
                    Toast.makeText(ForgotPassword.this, "Vui lòng nhập số điện thoại", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(ForgotPassword.this, OTPVerify.class);
                intent.putExtra("mobile", edt_PhoneNumber.getText().toString());
                startActivity(intent);
            }
        });
        txt_SendAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgotPassword.this, "OTP sẽ được gửi đến trong vài giây nữa. Vui lòng kiểm tra tin nhắn", Toast.LENGTH_SHORT).show();
            }
        });
        btn_OtpOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_Otp.getText().toString().trim().isEmpty()){
                    Toast.makeText(ForgotPassword.this, "OTP Không hợp lệ", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    Toast.makeText(ForgotPassword.this, "Xác nhận OTP thành công!", Toast.LENGTH_SHORT).show();
//                    return;

                    Intent intent = new Intent(ForgotPassword.this, UpdatePassword.class);
                    startActivity(intent);
                }
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}