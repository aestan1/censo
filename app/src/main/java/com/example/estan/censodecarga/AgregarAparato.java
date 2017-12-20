package com.example.estan.censodecarga;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AgregarAparato extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Resources resources;
    private Spinner cmbCategoria;
    private Spinner cmbItem;
    private EditText txtCantidad;
    private String cat[];
    private String itemAlumbrado[];
    private String itemClimatizacion[];
    private String itemCocina[];
    private String itemElectro[];
    private String itemComercial[];
    private String itemIndustrial[];
    private String itemTvs[];
    private Intent i;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_aparato);
        resources = this.getResources();
        cmbCategoria = (Spinner)findViewById(R.id.cmbCategoria);
        cmbItem=(Spinner)findViewById(R.id.cmbItem);
        txtCantidad=(EditText)findViewById(R.id.txtCantidad);
        cat = resources.getStringArray(R.array.cat);


        ArrayAdapter<CharSequence> adapterCat =  ArrayAdapter.createFromResource(this, R.array.cat, android.R.layout.simple_spinner_item);
        adapterCat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbCategoria.setAdapter(adapterCat);
        cmbCategoria.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    int[] item = {R.array.itemVacio, R.array.itemAlumbrado, R.array.itemClimatizacion, R.array.itemCocina, R.array.itemElectrodomesticos, R.array.itemComercial, R.array.itemIndustrial, R.array.itemTvS};
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, item[i], android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbItem.setAdapter(adapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void agregarAparato(View v) {
       // if (validar()) {
            int cant, aux, w, total;
            String it;

            aux = cmbItem.getSelectedItemPosition();
            cant = Integer.parseInt(txtCantidad.getText().toString());
            it = cmbItem.getItemAtPosition(aux).toString();
            w = Metodos.valorCargaItem(it);
            total=cant*w;

            Toast.makeText(this, R.string.mensaje1, Toast.LENGTH_SHORT).show();


            Aparato a = new Aparato(it, cant, total);
            a.guardar();



        }
}
