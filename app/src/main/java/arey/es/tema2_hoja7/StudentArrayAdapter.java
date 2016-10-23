package arey.es.tema2_hoja7;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ireneyera on 23/10/16.
 */

public class StudentArrayAdapter extends ArrayAdapter<Student> {

    private Context myContext;
    private int layout;
    private ArrayList<Student> students;

    public StudentArrayAdapter(Context aContext, int layout, ArrayList<Student> students) {
        super(aContext,layout,students);

        myContext = aContext;
        this.layout = layout;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater anInflater = ((Activity)myContext).getLayoutInflater();
        View row = anInflater.inflate(layout, parent, false);

        TextView name = (TextView)row.findViewById(R.id.textViewName);
        TextView age = (TextView)row.findViewById(R.id.textViewAge);

        Student selectedStudent = students.get(position);
        name.setText(selectedStudent.getName());
        age.setText("Edad:" + Integer.toString(selectedStudent.getAge()));

        if (position%2 == 0) {
            row.setBackgroundColor(Color.GRAY);
        }

        return row;
    }
}
