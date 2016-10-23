package arey.es.tema2_hoja7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Ejercicio3 extends AppCompatActivity {

    private ListView aListView;

    private ArrayList<Student> myStudents;
    private ArrayAdapter<Student> arrayAdapterStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        aListView = (ListView)findViewById(R.id.listEjercicio3);

        myStudents = new ArrayList<Student>();
        myStudents.add(new Student("Ana Sánchez", 20));
        myStudents.add(new Student("Pedro Morales", 23));
        myStudents.add(new Student("Juan Abad", 30));
        myStudents.add(new Student("Elisa Sanz", 21));
        myStudents.add(new Student("José Lamas", 28));

        arrayAdapterStudents = new ArrayAdapter<Student>(this, android.R.layout.simple_list_item_1, myStudents);

        aListView.setAdapter(arrayAdapterStudents);

        aListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                myStudents.remove(i);
                arrayAdapterStudents.notifyDataSetChanged();
            }
        });

    }
}
