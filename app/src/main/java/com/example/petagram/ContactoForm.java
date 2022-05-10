package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class ContactoForm extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_form);

        TraerFrame();
    }

public void TraerFrame(){
    Fragment fragment = new ContactoFragment();
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contacto,fragment).commit();
}

/* Fragment fragment = new ContactoFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).*/
}