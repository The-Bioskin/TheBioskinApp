package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Account extends AppCompatActivity {
    ImageButton btnback;
    LinearLayout lnMyOrder, lnVoucher, lnHelpCenter, lnLogOut, lnChangePassword, lnLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        linkViews();
        addEvents();
    }

    private void linkViews() {
        btnback = findViewById(R.id.btnBack);
        lnMyOrder = findViewById(R.id.lnMyOrder);
        lnVoucher = findViewById(R.id.lnMyVoucher);
        lnHelpCenter = findViewById(R.id.lnHelpCenter);
        lnLogOut = findViewById(R.id.lnLogout);
        lnChangePassword = findViewById(R.id.lnChangePassword);
        lnLanguage = findViewById(R.id.lnLanguage);
    }

    private void addEvents() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        lnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Order.class);
                startActivity(intent);
            }
        });

        lnVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, MyVoucher.class);
                startActivity(intent);
            }
        });

        lnHelpCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, HelpCenter.class);
                startActivity(intent);
            }
        });

        lnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, ChangePasswordd.class);
                startActivity(intent);
            }
        });

        lnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Language.class);
                startActivity(intent);
            }
        });
    }

    public void openDialog(View view) {
        Dialog dialog = new Dialog(Account.this);
        dialog.setContentView(R.layout.activity_logout);
        TextView tvOk = dialog.findViewById(R.id.tvOk);
        tvOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Account.this,Login.class);
                startActivity(intent);
            }
        });

        TextView tvCancel = dialog.findViewById(R.id.tvCancel);
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}