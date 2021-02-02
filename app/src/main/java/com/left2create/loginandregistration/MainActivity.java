package com.left2create.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[][] logins = {{"Андрей", "KBT1"},
                         { "Антон", "KBT2"},
                         {"Максим", "KBT3"},
                         {"Виктор", "KBT4"},
                         {"Сергей", "KBT5"}};
    Boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void fromAuthToHelp(View view)
    {
        Intent intent = new Intent(this, RegActivity.class);
        startActivity(intent);
    }

    public void auth_sequence(View view)
    {
        EditText login = findViewById(R.id.auth_loginTextBox),
                 password = findViewById(R.id.auth_passwordTextBox);

        for(int i = 0; i < 5; i++) { if(login.getText().toString().equals(logins[i][0]) && password.getText().toString().equals(logins[i][1])){ isLogin = true; break; } }
        if(isLogin)
        {
            isLogin = false;
            Intent intent = new Intent(this, AfterLogin.class);
            intent.putExtra("login", login.getText().toString());
            startActivity(intent);
        }
        else Toast.makeText(getApplicationContext(), "Неверный логин или пароль!", Toast.LENGTH_SHORT).show();
    }
}