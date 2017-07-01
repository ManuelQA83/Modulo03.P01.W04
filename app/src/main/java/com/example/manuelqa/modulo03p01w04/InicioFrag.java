package com.example.manuelqa.modulo03p01w04;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFrag extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public InicioFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_inicio, container, false);

        listaMascotas=(RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.inicializaListaMascotas();
        listaMascotas.setLayoutManager(llm);
        inicializaAdaptador();

        return v;
    }



    public void inicializaAdaptador(){
        MascotaAdaptador adaptadorMas = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptadorMas);

    }

    public void inicializaListaMascotas(){
        mascotas=new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.conejo,"Banner",3));
        mascotas.add(new Mascota(R.drawable.gato01,"Lala",5));
        mascotas.add(new Mascota(R.drawable.gato02,"Mishu",2));
        mascotas.add(new Mascota(R.drawable.hamsters,"Pummy",5));
        mascotas.add(new Mascota(R.drawable.pajaro,"Spinenr",5));
        mascotas.add(new Mascota(R.drawable.perro01,"Yugo",5));
        mascotas.add(new Mascota(R.drawable.perro02,"Jacky",1));
    }

}
