package com.example.estan.censodecarga;

import android.mtp.MtpConstants;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Resultado extends AppCompatActivity {
   private EditText txtTotal;
   private EditText txtDesviacion;
   private EditText txtReportado;
   private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        txtTotal = (EditText)findViewById(R.id.txtTotal);
        txtDesviacion=(EditText)findViewById(R.id.txtDesviacion);
        lblResultado=(TextView)findViewById(R.id.lblResultado);
        txtReportado=(EditText)findViewById(R.id.txtReportado);
        txtReportado.setSelected(true);
        txtTotal.setText(""+Metodos.totalizador());


    }

    public void Evaluar (View v){

        int desviacion;
        int total;
        int report;
         total=Integer.parseInt(txtTotal.getText().toString());
         report = Integer.parseInt(txtReportado.getText().toString());
         desviacion=report-total;

         txtDesviacion.setText(""+desviacion);

         if(total==report){
             lblResultado.setText("CONFORME");
         }else{
             lblResultado.setText("NO CONFORME");
         }
    }
}
