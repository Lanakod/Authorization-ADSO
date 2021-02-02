package com.left2create.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        Bundle arg = getIntent().getExtras();
        if(arg != null)
        {
            String login = arg.getString("login");
            TextView textView = findViewById(R.id.afterLogin_text);
            textView.setText(String.format("Добро пожаловать, %s", login));
        }
    }
    public void buttonExit(View view)
    {
        this.finishAffinity();
    }
}