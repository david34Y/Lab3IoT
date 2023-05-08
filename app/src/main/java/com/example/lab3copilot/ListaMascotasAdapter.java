package com.example.lab3copilot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaMascotasAdapter extends RecyclerView.Adapter<ListaMascotasAdapter.MascotaViewHolder>{
    private List<Mascota> listaMascotas;
    private Context context;

    private RecyclerView.Adapter adapter;

    public RecyclerView.Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.adapter = adapter;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Mascota m = listaMascotas.get(position);
        holder.mascota = m;

        TextView textViewMascotaName = holder.itemView.findViewById(R.id.textView);
        textViewMascotaName.setText("Mascota");

        TextView textViewGeneroMascota = holder.itemView.findViewById(R.id.textView2);
        textViewGeneroMascota.setText("Género");

        TextView textViewMascotaDueno = holder.itemView.findViewById(R.id.textView3);
        textViewMascotaDueno.setText("Dueño");

        TextView textViewDni = holder.itemView.findViewById(R.id.textView4);
        textViewDni.setText("Dni");

        TextView textViewdescripcion = holder.itemView.findViewById(R.id.textView5);
        textViewdescripcion.setText("Descripción");

        TextView textViewRuta = holder.itemView.findViewById(R.id.textView6);
        textViewRuta.setText("Ruta");

        TextView textViewMascotaNameA = holder.itemView.findViewById(R.id.textView7);
        textViewMascotaNameA.setText(m.getNombre());

        TextView textViewGeneroMascotaA = holder.itemView.findViewById(R.id.textView8);
        textViewGeneroMascotaA.setText(m.getGenero()?"Masculino":"Femenino");

        TextView textViewMascotaDuenoA = holder.itemView.findViewById(R.id.textView9);
        textViewMascotaDuenoA.setText(m.getDueno());

        TextView textViewDniA = holder.itemView.findViewById(R.id.textView10);
        textViewDniA.setText(m.getDni());

        TextView textViewdescripcionA = holder.itemView.findViewById(R.id.textView11);
        textViewdescripcionA.setText(m.getDescripcion());

        TextView textViewRutaA = holder.itemView.findViewById(R.id.textView12);
        textViewRutaA.setText(m.getRuta());
    }

    @Override
    public int getItemCount() {
        if (listaMascotas == null) {
            return 0;
        }
        return listaMascotas.size();
    }

    public class MascotaViewHolder extends RecyclerView.ViewHolder{

        Mascota mascota;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
