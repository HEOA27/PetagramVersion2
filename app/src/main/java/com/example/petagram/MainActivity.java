package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPet;
    private RecyclerViewAdaptador rvAdaptadorPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPet=(RecyclerView)findViewById(R.id.recyclerPet);
        recyclerViewPet.setLayoutManager(new LinearLayoutManager(this));

        rvAdaptadorPet=new RecyclerViewAdaptador(obtenerMascotas());
        recyclerViewPet.setAdapter(rvAdaptadorPet);
    }

    private List<PetModelo> obtenerMascotas() {
        List<PetModelo>pet=new ArrayList<>();
        pet.add(new PetModelo("Bone",R.drawable.bone));
        pet.add(new PetModelo("Beagle",R.drawable.beagle ));
        pet.add(new PetModelo("Boxer",R.drawable.boxer));
        pet.add(new PetModelo("Braco",R.drawable.braco ));
        pet.add(new PetModelo("Bulldog",R.drawable.bulldog));
        pet.add(new PetModelo("Cat",R.drawable.cat));
        pet.add(new PetModelo("Dog",R.drawable.hamster));
        pet.add(new PetModelo("Pet",R.drawable.pet));

        return pet;

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.itemContacto){
         //   Toast.makeText(this, "Contacto", Toast.LENGTH_SHORT).show();
         /*  Fragment fragment = new ContactoFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();*/
            Intent intent= new Intent(getApplicationContext(),ContactoForm.class);
            startActivity(intent);
        }else if(id == R.id.itemAcerca){
           // Toast.makeText(this, "Acerca de", Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(getApplicationContext(),BiografiaDesarrollador.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }
}