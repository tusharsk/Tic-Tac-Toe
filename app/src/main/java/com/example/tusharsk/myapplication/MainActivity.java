package com.example.tusharsk.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.play1);
        ed2=(EditText) findViewById(R.id.play2);
    }

    public void bbuclick(View view){

        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();

        String p1=ed1.getText().toString();
        String p2=ed2.getText().toString();
        Intent intent=new Intent(getApplicationContext(),Game.class);
        intent.putExtra("player1",p1);
        intent.putExtra("player2",p2);
        startActivity(intent);

    }

}
