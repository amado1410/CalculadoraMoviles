package com.example.calcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     public EditText pant;
     public double operan1, operan2, res;
     int ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       pant=(EditText)findViewById(R.id.caja);

    }
    public void btn1(View v){
    String cap= pant.getText().toString();
    cap=cap+"1";
    pant.setText(cap);
    }
    public void btn2(View v){
        String cap= pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }

    public void btn3(View v){
        String cap= pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }
    public void btn4(View v){
        String cap= pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }
    public void btn5(View v){
        String cap= pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }
    public void btn6(View v){
        String cap= pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }
    public void btn7(View v){
        String cap= pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }
    public void btn8(View v){
        String cap= pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }
    public void btn9(View v){
        String cap= pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }
    public void btn0(View v){
        String cap= pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }

    public void btnpunt(View v){
        String cap= pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }
  public void suma(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=1;
  }

    public void resta(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=2;
    }
    public void multiplicacion(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=3;
    }
    public void division(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=4;
    }

    public void potencia(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=5;
    }
    public void porcentaje(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=6;
    }


    public void raiz(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("√("+operan1+")");
        ope=7;
    }

    public void factorial(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=8;
    }


    public void igual(View v){
        try{
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}

         pant.setText("");

        if(ope==1){
            res=operan1+operan2;

        }else if(ope==2){
            res=operan1-operan2;
        }else if(ope==3){
            res=operan1*operan2;
        }else if(ope==4){
            if(operan2==0) {
                pant.setText("Error");
            }else {
                res = operan1 / operan2;
            }

        }else if(ope==5){
            res=Math.pow(operan1,operan2);
        }
        else if(ope==6){
            res=operan2*(operan1/100.0);
        } else if(ope==7){
            res=Math.sqrt(operan1);
        }else if(ope==8){
            res=1;
            for(double j=operan1; j>=1; j--){
                res=res*j;
            }

        }

        pant.setText(""+res);
        operan1=res;

    }
public void clear(View v){
   pant.setText("");
   operan1=0.0;
   operan2=0.0;
   res=0.0;
}
public void borrar(View v){
        if(!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }
}
public void off(View v){
        finish();
}
}
