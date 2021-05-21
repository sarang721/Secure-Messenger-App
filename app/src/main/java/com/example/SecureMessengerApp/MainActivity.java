package com.example.SecureMessengerApp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button aes;
    Button des;
    Button rsa;
    Button md5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aes=findViewById(R.id.aesenc);
        getSupportActionBar().hide();
        des=findViewById(R.id.desenc);
        rsa=findViewById(R.id.rsaenc);
        md5=findViewById(R.id.md5hash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        aes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AES.class);
                startActivity(intent);
            }
        });


        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DES.class);
                startActivity(intent);
            }
        });

        rsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RSA.class);
                startActivity(intent);
            }
        });

        md5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MD5.class);
                startActivity(intent);
            }
        });









    }
}