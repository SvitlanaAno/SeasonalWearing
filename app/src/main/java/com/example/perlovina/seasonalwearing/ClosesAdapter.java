package com.example.perlovina.seasonalwearing;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClosesAdapter extends ArrayAdapter<Closes> {
    private int color;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param closes A List of words objects to display in a list
     */
    public ClosesAdapter(@NonNull Context context, ArrayList<Closes> closes, int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, closes);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        GridView list = (GridView) parent;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Closes closesObject = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID title
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title word from the current Closes object and
        // set this text on the name TextView
        nameTextView.setText(closesObject != null ? closesObject.getTitle() : null);
        View colorLayout = listItemView.findViewById(R.id.linear);
        int backgroundColor = ContextCompat.getColor(getContext(), color);
        colorLayout.setBackgroundColor(backgroundColor);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(closesObject != null ? closesObject.getImage() : 0);

        // Return the whole list item layout (containing 1 TextView and an ImageView)
        // so that it can be shown in the GridView
        return listItemView;
    }
}
