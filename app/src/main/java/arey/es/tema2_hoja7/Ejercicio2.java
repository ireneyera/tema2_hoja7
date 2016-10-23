package arey.es.tema2_hoja7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Ejercicio2 extends AppCompatActivity {

    private ArrayList<Book> myBooks;

    private ListView aListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        myBooks = new ArrayList<Book>();

        myBooks.add(new Book("El Quijote", "Miguel de Cervantes"));
        myBooks.add(new Book("El lazarillo de Tormes", "Anónimo"));
        myBooks.add(new Book("La colmena", "Camilo José Cela"));
        myBooks.add(new Book("Cien años de soledad", "Gabriel García Márquez"));


        aListView = (ListView)findViewById(R.id.listEjercicio2);


        ArrayAdapter<Book> anArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myBooks);
        aListView.setAdapter(anArrayAdapter);
    }
}
