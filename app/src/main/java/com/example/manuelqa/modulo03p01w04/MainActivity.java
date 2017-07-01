package com.example.manuelqa.modulo03p01w04;

import android.app.Fragment;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        tabLayout=(TabLayout) findViewById(R.id.tabLayout);
        viewPager=(ViewPager) findViewById(R.id.viewpager);
        setUpViewPager();



/*
        listaMascotas=(RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.inicializaListaMascotas();
        listaMascotas.setLayoutManager(llm);
        inicializaAdaptador();*/



        if (toolbar!=null){
            setSupportActionBar(toolbar);
        }

    }


    private ArrayList<android.support.v4.app.Fragment> agregarFragments(){
        ArrayList<android.support.v4.app.Fragment> fragments=new ArrayList<>();
        fragments.add(new InicioFrag());
        fragments.add(new PerfilFrag());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_profile);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFavoritas:
                Intent i01=new Intent(this, MacotaFav.class);
                startActivity(i01);
                break;
            case R.id.mContacto:
                Intent i02=new Intent(this, Mail.class);
                startActivity(i02);
                break;
            case R.id.mAcerdaDe:
                Intent i03=new Intent(this, AcercaDe.class);
                startActivity(i03);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void irFavoritoMastocas(View v){
        Intent i=new Intent(this, MacotaFav.class);
        startActivity(i);
    }

}
