package com.example.manuelqa.modulo03p01w04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Manuel QA on 01/07/2017.
 */

public class MascotaAdaptadorPerfil extends RecyclerView.Adapter<MascotaAdaptadorPerfil.MascotaViewHolder>{

    private ArrayList<Mascota> mascotas;

    public MascotaAdaptadorPerfil(ArrayList<Mascota> mascotas){
        this.mascotas=mascotas;
    }


    @Override
    public MascotaAdaptadorPerfil.MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota02,parent,false);

        return new MascotaAdaptadorPerfil.MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaAdaptadorPerfil.MascotaViewHolder mascotaHolder, int position) {
        Mascota mascota=mascotas.get(position);
        mascotaHolder.imMascota.setImageResource(mascota.getFoto());
        mascotaHolder.tvRatinMascota.setText(String.valueOf(mascota.getRatin()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }



    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imMascota;
        private TextView tvRatinMascota;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imMascota=(ImageView) itemView.findViewById(R.id.ivMascota02);
            tvRatinMascota=(TextView) itemView.findViewById(R.id.tvRatinMascota02);

        }
    }
}
