package com.example.manuelqa.modulo03p01w04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Manuel QA on 01/07/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {


    private ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas=mascotas;
    }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        //inflamos la cardview. le damos vida. Estamos asociando el cardview al recyclerview
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaHolder, int position) {
        Mascota mascota=mascotas.get(position);
        mascotaHolder.imMascota.setImageResource(mascota.getFoto());
        mascotaHolder.tvNombreMascota.setText(mascota.getNombre());
        mascotaHolder.tvRatinMascota.setText(String.valueOf(mascota.getRatin()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }



    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imMascota;
        private TextView tvNombreMascota;
        private TextView tvRatinMascota;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imMascota=(ImageView) itemView.findViewById(R.id.ivMascota);
            tvNombreMascota=(TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvRatinMascota=(TextView) itemView.findViewById(R.id.tvRatinMascota);

        }
    }
}