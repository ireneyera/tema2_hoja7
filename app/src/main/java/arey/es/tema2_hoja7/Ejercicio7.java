package arey.es.tema2_hoja7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Ejercicio7 extends AppCompatActivity {

    private ListView aListView;

    private ArrayList<Country> myCountries = new ArrayList<Country>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        aListView = (ListView)findViewById(R.id.listViewEj6);

        myCountries.add(new Country("España", R.drawable.spain));
        myCountries.add(new Country("Francia", R.drawable.france));
        myCountries.add(new Country("Italia", R.drawable.italy));
        myCountries.add(new Country("Alemania", R.drawable.germany));
        myCountries.add(new Country("Suecia", R.drawable.sweden));
        myCountries.add(new Country("Reino Unido", R.drawable.uk));
        myCountries.add(new Country("China", R.drawable.china));
        myCountries.add(new Country("Estados Unidos de América", R.drawable.us));

        CountryArrayAdapter anAdapter = new CountryArrayAdapter(this, R.layout.row_ej7, myCountries);

        aListView.setAdapter(anAdapter);
    }
}
