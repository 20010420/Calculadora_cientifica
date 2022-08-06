package com.example.calculadora_cientifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvdisplay;
    double n1,n2,res;
    String Operador,nivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
    }
    public void bCero(View view){
        tvdisplay.setText(tvdisplay.getText()+"0");
    }
    public void bUno(View view){
        tvdisplay.setText(tvdisplay.getText()+"1");
    }
    public void bDos(View view){
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void bTres(View view){
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void bCuatro(View view){
        tvdisplay.setText(tvdisplay.getText()+"4");
    }
    public void bCinco(View view){
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void bSeis(View view){tvdisplay.setText(tvdisplay.getText()+"6");}
    public void bSiete(View view){
        tvdisplay.setText(tvdisplay.getText()+"7");
    }
    public void bOcho(View view){
        tvdisplay.setText(tvdisplay.getText()+"8");
    }
    public void bNueve(View view){
        tvdisplay.setText(tvdisplay.getText()+"9");
    }
    public void bPunto(View view){
        tvdisplay.setText(tvdisplay.getText()+".");
    }

    public void OnClickOperacionCapturaNumero1(View view){
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
    public void OnClickOperacionCapturaNumero2(View view){
        n2=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
    public void Sumar(View view){
        Operador="+";
        if(n1==0){
            OnClickOperacionCapturaNumero1(view);
        }else {
            if (n2 == 0){
                bIgual(view);
            }
        }
    }
    public void Restar(View view){
        Operador="-";
        if(n1==0){
            OnClickOperacionCapturaNumero1(view);
        }else {
            if (n2 == 0){
                bIgual(view);
            }
        }
    }
    public void Multiplicar(View view){
        Operador="*";
        if(n1==0){
            OnClickOperacionCapturaNumero1(view);
        }else {
            if (n2 == 0){
                bIgual(view);
            }
        }
    }
    public void Dividir(View view){
        Operador="/";
        if(n1==0){
            OnClickOperacionCapturaNumero1(view);
        }else {
            if (n2 == 0){
                bIgual(view);
            }
        }
    }
    public void Expn(View view){
        Operador="exp";
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
        }catch (NumberFormatException nfe){}
    }
    public void bIgual(View view){ // COFICACIÓN DEL BOTON IGUAL
        n2=Double.parseDouble(tvdisplay.getText().toString());
        if (Operador.equals("+")){
            res=n1 + n2;
        }else if (Operador.equals("-")){
            res = n1 - n2;
        }else if (Operador.equals("*")){
            res = n1 * n2;
        }else if (Operador.equals("/")){
            res = n1 / n2;
        }else if (Operador.equals("exp")){
            tvdisplay=(TextView)findViewById(R.id.tv_dis);
            n2=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
            res= Math.pow(n1,n2);
        }
        tvdisplay.setText(""+res);
        n2 = 0;
        n1 = 0;
    }


    public void Rnd(View view){ //na va hacer el numero aleatorio,
        //random genera el numero aleatorio
        for(int x = 0; x <= 100; x++){
            int na= (int)Math.floor(Math.random() * (100-(1+1))+(1));
            tvdisplay.setText(String.valueOf(na));
        }
    }
    public void Raiz(View view){ //sqrt permite sacar la raiz y
        //visualizar el resultado
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.sqrt(n1);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}

    }
    public void ExpCuadrado(View view){
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,2);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void ExpCubo(View view){
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,3);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Sen(View view){ // rd va hacer los radianes
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Cos(View view){ // rd va hacer los radianes
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.cos(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Tan(View view){ // rd va hacer los radianes
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.tan(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Factorial(View view){ //no se si es x o +
        int fact=1;
        int x;
        try {
            for (x = 1; x <= n1; x ++) {
                fact = fact * x;
            }
            tvdisplay.setText(String.valueOf(res));

        }catch (NumberFormatException nfe){}
    }
    public void BorrarUlt (View view){
        if(!tvdisplay.getText().toString().equals("")){
            String txt = tvdisplay.getText().subSequence(0,tvdisplay.getText().length() -1)+ "";// permite ver la longitud de lo que ingresa pero restando ()-1+"";

            tvdisplay.setText(txt);
            txt = "";
        }else {
            Toast.makeText(this, "El campo esta en blanco", Toast.LENGTH_LONG).show();
        }
    }
    public void bBorrarTodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(" ");
    }
    public void salir(View view){ //permite salir de la calculadora
        finish();
    }
}