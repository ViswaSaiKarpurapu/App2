package com.example.app2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Myadapter class job is to put data into each row of the listview
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.WordViewHolder> {
    String[] languages;
    LayoutInflater layoutInflater;

    public Myadapter( Context context, String[] languagesData) {
        languages = languagesData;
//        LayoutInflater.from(context);
        layoutInflater = LayoutInflater.from(context);
    }

    /**
     * on createViewHolder job is to buy wooden planks
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public Myadapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = layoutInflater.inflate(R.layout.array_list,parent,false);
        return new WordViewHolder(rowView);
    }

    /**
     * onBindViewHolder job is to write data on planks
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull Myadapter.WordViewHolder holder, int position) {

        holder.titleTextView.setText(languages[position]);

    }

    /**
     * job is to keep the count of no of items in the data set
     * @return
     */
    @Override
    public int getItemCount() {
        return  languages.length;
    }

    /**
     * WorldViewHolder job is to hold the recycled stock and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.textViewResult);
        }
    }
}
