package com.example.manuelqa.modulo03p01w04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MacotaFav extends AppCompatActivity {

    ArrayList<Mascota> mascotasfav;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macota_fav);

        listaMascotas=(RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.buscaMascotaFav();
        listaMascotas.setLayoutManager(llm);
        inicializaAdaptador();

    }

    public void irMainActivity(View v){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void inicializaAdaptador(){
        MascotaAdaptador adaptadorMas = new MascotaAdaptador(mascotasfav);
        listaMascotas.setAdapter(adaptadorMas);

    }

    public void buscaMascotaFav(){
        mascotasfav=new ArrayList<Mascota>();

        mascotasfav.add(new Mascota(R.drawable.gato01,"Lala",5));
        mascotasfav.add(new Mascota(R.drawable.hamsters,"Pummy",5));
        mascotasfav.add(new Mascota(R.drawable.pajaro,"Spinenr",5));
        mascotasfav.add(new Mascota(R.drawable.perro01,"Yugo",5));
        mascotasfav.add(new Mascota(R.drawable.conejo,"Banner",3));
    }


}

