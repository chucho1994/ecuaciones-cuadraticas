package com.example.chicharronera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
              EditText et_a,et_b,et_c;
              TextView tv_raiz,tv_x1,tv_x2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_a=(EditText)findViewById(R.id.ingresa_A);
        et_b=(EditText)findViewById(R.id.ingresa_b);
        et_c=(EditText)findViewById(R.id.ingresa_c);

        tv_raiz=(TextView)findViewById(R.id.resultado_raiz);
        tv_x1=(TextView)findViewById(R.id.resultado_x1);
        tv_x2=(TextView)findViewById(R.id.resultado_x2);

    }


    public void calcular(View calcular) {
        int a,b,c;
        a=Integer.parseInt(et_a.getText().toString());
        b=Integer.parseInt(et_b.getText().toString());
        c=Integer.parseInt(et_c.getText().toString());

        float resultado_raiz=0,resultado1=0,resultado2=0;
        int suma_dentro_raiz=(b*b)-4*a*c;
        resultado_raiz=(float)Math.sqrt(suma_dentro_raiz);

        if(suma_dentro_raiz<=0){
            Toast.makeText(this,"No se puede ralizar la raiz es negativa RESULTADO: ",Toast.LENGTH_SHORT).show();

        }else if(suma_dentro_raiz>=1){
            resultado1=(-1*b+(resultado_raiz))/(2*a);
            resultado2=(-1*b-(resultado_raiz))/(2*a);
        }




        String parseo1,parseo2,parseo3;
        parseo1=String.valueOf(resultado1);

        tv_raiz.setText(String.valueOf(resultado_raiz));
        tv_x1.setText(parseo1);
        tv_x2.setText(String.valueOf(resultado2));

    }



    }





