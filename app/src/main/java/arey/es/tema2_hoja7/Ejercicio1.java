package arey.es.tema2_hoja7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Ejercicio1 extends AppCompatActivity {

    private String[] anArray = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja"};

    private ArrayList<String> aSecondArray;

    private ListView aListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        aListView = (ListView)findViewById(R.id.listEjercicio1);

        // Parte 1
        //ArrayAdapter anArrayAdapterEstatic = new ArrayAdapter(this,android.R.layout.simple_list_item_1, anArray);

        //aListView.setAdapter(anArrayAdapterEstatic);

        // Parte 2
        aSecondArray = new ArrayList<>();
        aSecondArray.add("Rojo");
        aSecondArray.add("Azul");
        aSecondArray.add("Verde");
        aSecondArray.add("Amarillo");
        aSecondArray.add("Naranja");
        ArrayAdapter anArrayAdapterDynamic = new ArrayAdapter(this,android.R.layout.simple_list_item_1, aSecondArray);
        aListView.setAdapter(anArrayAdapterDynamic);
    }
}
