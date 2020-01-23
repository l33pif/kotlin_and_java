package com.l33pif.kotlin_and_java;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.l33pif.kotlin_and_java.PojoBasico;

import java.util.List;


public class AdapterListado extends RecyclerView.Adapter<AdapterListado.ViewHolder> {

    private List<PojoBasico> list;

    public AdapterListado(List<PojoBasico> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PojoBasico data = list.get(position);
        holder.txtTitle.setText(data.getTitulo());
        holder.txtDesc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        TextView txtDesc;

        public ViewHolder(View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtItemTitle);
            txtDesc = itemView.findViewById(R.id.txtItemDesc);
        }
    }
}
