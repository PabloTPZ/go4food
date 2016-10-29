package com.example.hola.go4food;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.hola.go4food.Fragment.Fragment_lista;


public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_lista lista= new Fragment_lista();
        //fragmentTransaction.setCustomAnimations(R.anim.right_in, R.anim.right_out);
        fragmentTransaction.replace(R.id.contenedor_principal, lista);
        fragmentTransaction.commit();
    }
}
