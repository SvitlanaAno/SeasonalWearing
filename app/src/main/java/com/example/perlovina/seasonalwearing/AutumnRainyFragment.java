package com.example.perlovina.seasonalwearing;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutumnRainyFragment extends Fragment {


    public AutumnRainyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.closes_list, container, false);

        final ArrayList<Closes> closes = new ArrayList<>();
        closes.add(new Closes("day", R.drawable.close_rain_15));
        closes.add(new Closes("work", R.drawable.close_rain_16));
        closes.add(new Closes("gym style", R.drawable.close_rain_17));
        closes.add(new Closes("evening", R.drawable.close_rain_18));
        closes.add(new Closes("work", R.drawable.close_sunny_19));
        closes.add(new Closes("evening", R.drawable.close_sunny_17));
        closes.add(new Closes("friends", R.drawable.close_sunny_18));

        ClosesAdapter itemsAdapter = new ClosesAdapter(getActivity(), closes, R.color.category_summer);

        GridView listView = (GridView) rootView.findViewById(R.id.grid);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailsViewActivity.class);
                intent.putExtra("image", closes.get(i).getImage());
                startActivity(intent);
            }
        });
        return rootView;
    }

}
