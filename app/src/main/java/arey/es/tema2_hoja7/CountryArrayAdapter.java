package arey.es.tema2_hoja7;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ireneyera on 23/10/16.
 */

public class CountryArrayAdapter extends ArrayAdapter<Country> {

    private Context myContext;
    private int layout;
    private ArrayList<Country> countryList;

    public CountryArrayAdapter(Context aContext, int layout, ArrayList<Country> countryList) {
        super(aContext, layout, countryList);

        myContext = aContext;
        this.layout = layout;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater anInflater = ((Activity)myContext).getLayoutInflater();
        View row = anInflater.inflate(layout,parent,false);

        ImageView flag = (ImageView)row.findViewById(R.id.imageViewFlag);
        TextView country = (TextView)row.findViewById(R.id.textViewCountry);

        Country aCountry = countryList.get(position);

        flag.setImageResource(aCountry.getFlag());
        country.setText(aCountry.getName());

        return row;
    }
}
