package com.example.app2;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Myadapter class job is to put data into each row of the listview
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.WordViewHolder> {
    String[] languages;
    public Myadapter(String[] languagesData) {
        languages =languagesData;
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

        return null;
    }

    /**
     * onBindViewHolder job is to write data on planks
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull Myadapter.WordViewHolder holder, int position) {

    }

    /**
     * job is to keep the count of no of items in the data set
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * WorldViewHolder job is to hold the recycled stock and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
