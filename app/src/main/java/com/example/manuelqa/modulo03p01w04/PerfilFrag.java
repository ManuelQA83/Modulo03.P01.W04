package com.example.manuelqa.modulo03p01w04;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFrag extends Fragment {

    ArrayList<Mascota> mascotaPerfil;
    private RecyclerView listaPerfil;


    public PerfilFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_perfil, container, false);

        listaPerfil= v.findViewById(R.id.rvMascotas02);

        GridLayoutManager llm = new GridLayoutManager(getActivity(),3);

        this.inicializaListaMascotas();
        listaPerfil.setLayoutManager(llm);
        inicializaAdaptadorPerfil();



        return v;
    }

    public void inicializaAdaptadorPerfil(){
        MascotaAdaptadorPerfil adaptadorPer = new MascotaAdaptadorPerfil(mascotaPerfil);
        listaPerfil.setAdapter(adaptadorPer);

    }

    public void inicializaListaMascotas(){
        mascotaPerfil=new ArrayList<Mascota>();


        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",5));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",3));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",2));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",1));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",3));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",4));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",5));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",3));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",2));
        mascotaPerfil.add(new Mascota(R.drawable.hamsters,"Pummy",1));

    }

}
