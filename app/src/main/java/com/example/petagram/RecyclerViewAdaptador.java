package com.example.petagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView namePet;
        private ImageView picturePet;

        public ViewHolder( View itemView) {
            super(itemView);
            namePet=(TextView)itemView.findViewById(R.id.tvPet);
            picturePet=(ImageView)itemView.findViewById(R.id.imagePet);

        }
    }
    public List<PetModelo>listamascotas;

    public RecyclerViewAdaptador(List<PetModelo> listamascotas) {
        this.listamascotas = listamascotas;
    }


    @Override
    public RecyclerViewAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pet,parent,false);
    ViewHolder viewHolder= new ViewHolder(view);
    return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdaptador.ViewHolder holder, int position) {
    holder.namePet.setText(listamascotas.get(position).getNamePet());
    holder.picturePet.setImageResource(listamascotas.get(position).getPicturePet());
    }

    @Override
    public int getItemCount() {
        return listamascotas.size();
    }


}
