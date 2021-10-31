package com.cmfi.cantique.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cmfi.cantique.ClassSimple.ListCantique;
import com.cmfi.cantique.DetailCantique;
import com.cmfi.cantique.MainActivity;
import com.cmfi.cantique.R;
import com.cmfi.cantique.listerner.BaseListener;
import com.cmfi.cantique.ui.home.HomeFragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AdapterListCantique extends RecyclerView.Adapter<AdapterListCantique.ViewHolder> implements Filterable {


    BaseListener listener;
    private List<ListCantique> listItems ;
    private List<ListCantique> listItemsSearch;
    private Context context;

    private List<Integer> selectionnes;

    public AdapterListCantique(Context context, List<ListCantique> listItem, BaseListener listener) {
        super();
        this.listItems = listItem;
        this.context = context;
        this.listener = listener;
        selectionnes = new ArrayList<>(  );
        listItemsSearch = new ArrayList<>( listItem );
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( context )
                .inflate( R.layout.item_list_cantique, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.titreCantique.setText( listItems.get( position ).getTitre() );
        holder.numeroCantique.setText( listItems.get( position ).getNumero() );
        holder.lettre.setText( listItems.get( position ).getTitre().substring(0,1) );


        if(selectionnes.contains( position )) {
            // todo: afficher l'icone de sélection
            Log.d("","");

        }

        holder.card.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Intent intent;
                intent = new Intent(v.getContext(), DetailCantique.class);
                intent.putExtra( "titre du cantique", listItems.get( position ).getTitre() )
                        .putExtra( "numero cantique", listItems.get( position ).getNumero() )
                        .putExtra( "couplet 1", listItems.get( position ).getCouplet1() )
                        .putExtra( "couplet 2", listItems.get( position ).getCouplet2() )
                        .putExtra( "couplet 3", listItems.get( position ).getCouplet3() )
                        .putExtra( "couplet 4", listItems.get( position ).getCouplet4() )
                        .putExtra( "couplet 5", listItems.get( position ).getCouplet5() )
                        .putExtra( "couplet 6", listItems.get( position ).getCouplet6() )
                        .putExtra( "refrain",   listItems.get( position ).getRefrain() )
                        .putExtra( "refrain 1", listItems.get( position ).getRefrain1() )
                        .putExtra( "refrain 2", listItems.get( position ).getRefrain2() )
                        .putExtra( "refrain 3", listItems.get( position ).getRefrain3() )
                        .putExtra( "refrain 4", listItems.get( position ).getRefrain4() )
                        .putExtra( "refrain 5", listItems.get( position ).getRefrain5() )
                        .putExtra( "refrain 6", listItems.get( position ).getRefrain6() );
                v.getContext().startActivity(intent);

            }
        } );
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                List<ListCantique> filteredList = new ArrayList<>();

                if (constraint == null || constraint.length() == 0) {
                    filteredList.addAll(listItemsSearch);
                } else {

                    String charSequenceString = constraint.toString();

                    for (ListCantique item : listItemsSearch) {
                        if (item.getTitre().toLowerCase().contains(charSequenceString.toLowerCase().trim())) {
                            filteredList.add(item);
                        }
                        listItems = filteredList;
                    }



                }
                FilterResults results = new FilterResults();
                results.values = filteredList;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                //listItems.clear();
                //listItems.addAll((List) results.values);
                listItems = (List<ListCantique>) results.values;
                notifyDataSetChanged();
            }
        };
    }



    class ViewHolder extends RecyclerView.ViewHolder {


        private TextView titreCantique;
        private TextView numeroCantique;
        private TextView lettre;
        private LinearLayout card;


        ViewHolder(@NonNull View itemView) {

            super( itemView );

            titreCantique = (TextView)itemView.findViewById( R.id.titre_cantique );
            numeroCantique = (TextView)itemView.findViewById( R.id.numero_cantique );
            lettre = (TextView)itemView.findViewById( R.id.lettre );
            card = (LinearLayout)itemView.findViewById( R.id.item_card );



        }
    }








}

