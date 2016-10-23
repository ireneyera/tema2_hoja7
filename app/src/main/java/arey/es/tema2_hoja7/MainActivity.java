package arey.es.tema2_hoja7;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        Intent anIntent;
        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.ejercicio1: anIntent = new Intent(this, Ejercicio1.class);
                                  startActivity(anIntent);
                                  return true;
            case R.id.ejercicio2: anIntent = new Intent(this, Ejercicio2.class);
                                  startActivity(anIntent);
                                  return true;
            case R.id.ejercicio3: anIntent = new Intent(this, Ejercicio3.class);
                                  startActivity(anIntent);
                                  return true;
            case R.id.ejercicio4: anIntent = new Intent(this, Ejercicio4.class);
                                  startActivity(anIntent);
                                  return true;
            case R.id.ejercicio5: anIntent = new Intent(this, Ejercicio5.class);
                                  startActivity(anIntent);
                                  return true;
            case R.id.ejercicio7: anIntent = new Intent(this, Ejercicio7.class);
                                  startActivity(anIntent);
                                  return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
