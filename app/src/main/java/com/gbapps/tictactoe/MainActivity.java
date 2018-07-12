package com.gbapps.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int chance=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);

        /*btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);*/


    }


    @Override
    public void onClick(View view){

        switch (view.getId()){
            case R.id.btn1:
                if(btn1.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn1.setText("O");

                    }
                    else{
                        result();
                        chance=0;
                        btn1.setText("X");
                    }
                }
                break;
            case R.id.btn2:
                if(btn2.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn2.setText("O");
                    }
                    else{
                        chance=0;
                        result();
                        btn2.setText("X");
                    }
                }
                break;
            case R.id.btn3:
                if(btn3.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn3.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn3.setText("X");
                    }
                }
                break;
            case R.id.btn4:
                if(btn4.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn4.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn4.setText("X");
                    }
                }
                break;
            case R.id.btn5:
                if(btn5.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn5.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn5.setText("X");
                    }
                }
                break;
            case R.id.btn6:
                if(btn6.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn6.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn6.setText("X");
                    }
                }
                break;
            case R.id.btn7:
                if(btn7.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn7.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn7.setText("X");
                    }
                }
                break;
            case R.id.btn8:
                if(btn8.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn8.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn8.setText("X");
                    }
                }
                break;
            case R.id.btn9:
                if(btn9.getText().toString().equals("")){
                    if(chance==0){
                        result();
                        chance=1;
                        btn9.setText("O");
                    }
                    else{
                        result();
                        chance=0;
                        btn9.setText("X");
                    }
                }
                break;

        }

    }
    public void result(){
        if(btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }

        else if(btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }

        else if(btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")){
            Toast.makeText(this,"Player X wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
        else if(btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")){
            Toast.makeText(this,"Player O wins",Toast.LENGTH_SHORT).show();
        }
    }
}
