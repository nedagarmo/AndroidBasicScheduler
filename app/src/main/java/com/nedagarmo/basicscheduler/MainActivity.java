package com.nedagarmo.basicscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.nedagarmo.basicscheduler.username";
    public EditText tbUsername, tbPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbUsername = (EditText) findViewById(R.id.username);
        tbPassword = (EditText) findViewById(R.id.password);
    }

    public void onLogin(View view) {
        if(tbUsername.getText().toString().isEmpty() || tbPassword.getText().toString().isEmpty())
        {
            Toast toast = Toast.makeText(this, "Debe proporcionar un usuario y contraseña", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, tbUsername.getText().toString());
        startActivity(intent);
    }
}
