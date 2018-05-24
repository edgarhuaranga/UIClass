package com.ehuaranga.uiclass;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by edhuar on 23.05.18.
 */

public class ActividadesAdapter extends RecyclerView.Adapter<ActividadesAdapter.ViewHolderActividad> {
    Context context;
    HashMap<String, ArrayList<Evento>> programaDia;


    @Override
    public ActividadesAdapter.ViewHolderActividad onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_actividades, parent, false);

        return new ViewHolderActividad(itemView);
    }

    @Override
    public void onBindViewHolder(ActividadesAdapter.ViewHolderActividad holder, int position) {

    }

    @Override
    public int getItemCount() {
        return programaDia.keySet().size();
    }

    public class ViewHolderActividad extends RecyclerView.ViewHolder {
        public TextView textviewHorario;
        public TextView textViewNumEventos;


        public ViewHolderActividad(View view) {
            super(view);
            textviewHorario =  view.findViewById(R.id.textview_horario);
            textViewNumEventos = view.findViewById(R.id.textview_numero_actividades);
        }
    }

}
