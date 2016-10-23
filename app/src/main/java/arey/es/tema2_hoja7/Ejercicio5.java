package arey.es.tema2_hoja7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Ejercicio5 extends AppCompatActivity {

    private ListView myListView;
    private ArrayList<Student> myStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        myListView = (ListView)findViewById(R.id.listEjercicio5);

        myStudents = new ArrayList<Student>();
        myStudents.add(new Student("Ana Sánchez", 20));
        myStudents.add(new Student("Pedro Morales", 23));
        myStudents.add(new Student("Juan Abad", 30));
        myStudents.add(new Student("Elisa Sanz", 21));
        myStudents.add(new Student("José Lamas", 28));

        StudentArrayAdapter anAdapter = new StudentArrayAdapter(this, R.layout.row_ej5, myStudents);

        myListView.setAdapter(anAdapter);

        // Ejercicio 6
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setBackgroundColor(Color.RED);
            }
        });
    }
}
