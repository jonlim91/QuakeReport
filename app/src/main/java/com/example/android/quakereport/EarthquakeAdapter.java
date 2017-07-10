package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jonathan on 7/9/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Earthquake eq = getItem(position);

        TextView mag = (TextView) listItemView.findViewById(R.id.magnitude);
        mag.setText(""+eq.getMagnitude());

        TextView loc = (TextView) listItemView.findViewById(R.id.location);
        loc.setText(""+eq.getLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(""+eq.getDate());

        return listItemView;
    }

    EarthquakeAdapter(Context context, ArrayList<Earthquake> equake){
        super(context, 0, equake);
    }
}
