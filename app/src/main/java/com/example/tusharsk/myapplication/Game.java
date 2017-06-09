package com.example.tusharsk.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Game extends AppCompatActivity {

    TextView ed21;
    TextView ed22;
    int win=-1;
    int turn ;
    int cou=0;
    ArrayList<Integer> player1=new ArrayList<Integer>();
    ArrayList<Integer> player2=new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Bundle b = getIntent().getExtras();
        String pname1 = b.getString("player1");
        String pname2 = b.getString("player2");
        ed21 = (TextView) findViewById(R.id.p21);
        ed22 = (TextView) findViewById(R.id.p22);
        ed21.setText(pname1);
         turn = 1;
        ed22.setText(pname2);
        Toast.makeText(this, "Game start", Toast.LENGTH_SHORT).show();
    }
    public void buclick(View view) {
        Button buselecte = (Button) view;

        int id=0;
        cou=cou+1;
        switch (buselecte.getId()) {
            case R.id.b1:
                id = 1;
                break;
            case R.id.b2:
                id = 2;
                break;
            case R.id.b3:
                id = 3;
                break;
            case R.id.b4:
                id = 4;
                break;
            case R.id.b5:
                id = 5;
                break;
            case R.id.b6:
                id = 6;
                break;
            case R.id.b7:
                id = 7;
                break;
            case R.id.b8:
                id = 8;
                break;
            case R.id.b9:
                id = 9;
                break;
        }
        playgame(id,buselecte);
        checkwinner(cou);
        buselecte.setEnabled(false);
    }


    public  void playgame(int id,Button buselecte){
        if(turn==1)
        {
            buselecte.setText("X");
            buselecte.setBackgroundColor(Color.GREEN);
            player1.add(id);
            turn=2;
        }
        else if(turn ==2){
            buselecte.setText("0");
            buselecte.setBackgroundColor(Color.YELLOW);
            player2.add(id);
            turn=1;
        }
    }

    public void checkwinner(int cout){
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            win=1;
        }
        else if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            win=2;
        }

        else if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            win=1;
        }
        else if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            win=2;
        }


        else if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            win=1;
        }
        else if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            win=2;
        }



        else if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            win=1;
        }
        else if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            win=2;
        }


        else if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            win=1;
        }
        else if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            win=2;
        }

        else if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            win=1;
        }
        else if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            win=2;
        }


        else if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            win=1;
        }
        else if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            win=2;
        }

        else if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            win=1;
        }
        else if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            win=2;
        }


        if(win==1)
        {
            Toast.makeText(this,"PLAYER 1 WINS",Toast.LENGTH_SHORT).show();
            finish();
        }
        if(win==2)
        {
            Toast.makeText(this,"PLAYER 2 WINS",Toast.LENGTH_SHORT).show();
            finish();
        }
        if(win==-1&& cout==9)
        {
            Toast.makeText(this,"DRAW",Toast.LENGTH_SHORT).show();
            finish();
        }
    }


}
