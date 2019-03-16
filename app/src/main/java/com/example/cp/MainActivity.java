package com.example.cp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,add_btn,sub_btn,mul_btn,div_btn,dot_btn,ac_btn,equ_btn,mot_btn;
    TextView textView;
    ImageButton imageButton,power_button;
    double node1,node2;
    boolean add,sub,mul,div,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding data
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        add_btn=findViewById(R.id.add_btn);
        dot_btn=findViewById(R.id.dot_btn);
        sub_btn=findViewById(R.id.sub_btn);
        mul_btn=findViewById(R.id.mul_btn);
        div_btn=findViewById(R.id.div_btn);
        ac_btn=findViewById(R.id.ac_btn);
        imageButton=findViewById(R.id.xbtn);
        textView=findViewById(R.id.textView);
        equ_btn=findViewById(R.id.equ_btn);
        mot_btn=findViewById(R.id.mod_btn);
        power_button=findViewById(R.id.power_btn);
        //add listener
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        add_btn.setOnClickListener(this);
        dot_btn.setOnClickListener(this);
        sub_btn.setOnClickListener(this);
        mul_btn.setOnClickListener(this);
        div_btn.setOnClickListener(this);
        ac_btn.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        equ_btn.setOnClickListener(this);
        mot_btn.setOnClickListener(this);
        power_button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        try {
            if (v.getId()==R.id.power_btn){
                Toast.makeText(getApplicationContext(),"Closed Calculator",Toast.LENGTH_SHORT).show();
                finish();
            }
            else if (v.getId()==R.id.btn_0){
                textView.setText(textView.getText()+"0");
            }
            else if (v.getId()==R.id.btn_1){
                textView.setText(textView.getText()+"1");
            }
            else if (v.getId()==R.id.btn_2){
                textView.setText(textView.getText()+"2");
            }
            else if (v.getId()==R.id.btn_3){
                textView.setText(textView.getText()+"3");
            }
            else if (v.getId()==R.id.btn_4){
                textView.setText(textView.getText()+"4");
            }
            else if (v.getId()==R.id.btn_5){
                textView.setText(textView.getText()+"5");
            }
            else if (v.getId()==R.id.btn_6){
                textView.setText(textView.getText()+"6");
            } else if (v.getId()==R.id.btn_7){
                textView.setText(textView.getText()+"7");
            }
            else if (v.getId()==R.id.btn_8){
                textView.setText(textView.getText()+"8");
            }
            else if (v.getId()==R.id.btn_9){
                textView.setText(textView.getText()+"9");
            }
            else if (v.getId()==R.id.dot_btn){
                textView.setText(textView.getText()+".");
            }
            else if (v.getId()==R.id.ac_btn){
                textView.setText("");
            }
            else if (v.getId()==R.id.add_btn){
                node1=Double.parseDouble(textView.getText()+"");
                add=true;
                textView.setText(null);
            }
            else if (v.getId()==R.id.xbtn){
                String text=textView.getText().toString();
                textView.setText(text.substring(0,text.length()-1));
            }

            else if (v.getId()==R.id.sub_btn){
                node1=Double.parseDouble(textView.getText()+"");
                sub=true;
                textView.setText(null);
            }
            else if (v.getId()==R.id.mul_btn){
                node1=Double.parseDouble(textView.getText()+"");
                mul=true;
                textView.setText(null);
            }
            else if (v.getId()==R.id.div_btn){
                node1=Double.parseDouble(textView.getText()+"");
                div=true;
                textView.setText(null);
            }
            else if (v.getId()==R.id.mod_btn){
                node1=Double.parseDouble(textView.getText()+"");
                mod=true;
                textView.setText(null);
            }
            else if (v.getId()==R.id.equ_btn) {
                node2 = Double.parseDouble(textView.getText() + "");
                if (add == true) {
                    textView.setText(node1 + node2 + "");
                    add = false;
                } else if (sub == true) {
                    textView.setText(node1 - node2 + "");
                    sub = false;
                } else if (mul == true) {
                    textView.setText(node1 * node2 + "");
                    mul = false;
                } else if (div == true) {
                    textView.setText(node1 / node2 + "");
                    div = false;
                } else if (mod == true) {
                    textView.setText(node1 % node2 + "");
                    mod = false;
                }
            }

        }catch (Exception e){

        }





    }
}
