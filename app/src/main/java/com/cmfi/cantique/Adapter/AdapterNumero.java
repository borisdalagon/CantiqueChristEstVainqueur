package com.cmfi.cantique.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cmfi.cantique.ClassSimple.ListNumero;
import com.cmfi.cantique.DetailCantique;
import com.cmfi.cantique.R;
import com.cmfi.cantique.listerner.BaseListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class AdapterNumero extends RecyclerView.Adapter<AdapterNumero.ViewHolder> {

    SharedPreferences shared;
    SharedPreferences.Editor editor;
    BaseListener listener;
    SimpleDateFormat simpleDateFormat;
    private List<ListNumero> listItems;
    Context context;

    private List<Integer> selectionnes;

    public AdapterNumero(Context context, List<ListNumero> listItems, BaseListener listener) {
        this.listItems = listItems;
        this.context = context;
        this.listener = listener;
        selectionnes = new ArrayList<>(  );
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.item_list_numero, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final ListNumero listem = listItems.get( position );


        holder.numero.setText( listem.getNumero() );

        holder.cardNumero.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Intent intent;
                intent = new Intent(v.getContext(), DetailCantique.class);
                intent.putExtra( "titre du cantique", listem.getTitre() )
                        .putExtra( "numero cantique", listem.getNumero() )
                        .putExtra( "couplet 1", listem.getCouplet1() )
                        .putExtra( "couplet 2", listem.getCouplet2() )
                        .putExtra( "couplet 3", listem.getCouplet3() )
                        .putExtra( "couplet 4", listem.getCouplet4() )
                        .putExtra( "couplet 5", listem.getCouplet5() )
                        .putExtra( "couplet 6", listem.getCouplet6() )
                        .putExtra( "refrain", listem.getRefrain() )
                        .putExtra( "refrain 1", listem.getRefrain1() )
                        .putExtra( "refrain 2", listem.getRefrain2() )
                        .putExtra( "refrain 3", listem.getRefrain3() )
                        .putExtra( "refrain 4", listem.getRefrain4() )
                        .putExtra( "refrain 5", listem.getRefrain5() )
                        .putExtra( "refrain 6", listem.getRefrain6() );
                v.getContext().startActivity(intent);
            }
        } );


        if(selectionnes.contains( position )) {
            // todo: afficher l'icone de sélection
            Log.d("","");

        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView numero;
        public CardView cardNumero;


        public ViewHolder(View itemView) {

            super( itemView );


            numero = (TextView)itemView.findViewById( R.id.numero );
            cardNumero = (CardView) itemView.findViewById( R.id.card_numero );



        }
    }
}

