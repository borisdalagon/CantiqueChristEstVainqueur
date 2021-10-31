package com.cmfi.cantique;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class DetailCantique extends AppCompatActivity {

    TextView titreCantique;
    TextView numero;
    TextView refraintop;
    TextView refrain1;
    TextView refrain2;
    TextView refrain3;
    TextView refrain4;
    TextView refrain5;
    TextView refrain6;
    TextView couplet1;
    TextView couplet2;
    TextView couplet3;
    TextView couplet4;
    TextView couplet5;
    TextView couplet6;

    LinearLayout choeur;
    LinearLayout choeur1;
    LinearLayout choeur2;
    LinearLayout choeur3;
    LinearLayout choeur4;
    LinearLayout choeur5;
    LinearLayout choeur6;

    String refrain = "";
    String refrain1String = "";
    String refrain2String = "";
    String refrain3String = "";
    String refrain4String = "";
    String refrain5String = "";
    String refrain6String = "";

    String titre = "";

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail_cantique );

        titre = getIntent().getStringExtra( "titre du cantique" );

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(titre);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        titreCantique = findViewById( R.id.titre_detail_cantique );
        numero = findViewById( R.id.numero_detail_cantique );
        refraintop =  findViewById( R.id.refrain_top );
        refrain1 = findViewById( R.id.refrain1 );
        refrain2 = findViewById( R.id.refrain2 );
        refrain3 = findViewById( R.id.refrain3 );
        refrain4 = findViewById( R.id.refrain4 );
        refrain5 = findViewById( R.id.refrain5 );
        refrain6 = findViewById( R.id.refrain6 );
        couplet1 = findViewById( R.id.couplet1 );
        couplet2 = findViewById( R.id.couplet2 );
        couplet3 = findViewById( R.id.couplet3 );
        couplet4 = findViewById( R.id.couplet4 );
        couplet5 = findViewById( R.id.couplet5 );
        couplet6 = findViewById( R.id.couplet6 );

        choeur = findViewById( R.id.choeur );
        choeur1 = findViewById( R.id.choeur1 );
        choeur2 = findViewById( R.id.choeur2 );
        choeur3 = findViewById( R.id.choeur3 );
        choeur4 = findViewById( R.id.choeur4 );
        choeur5 = findViewById( R.id.choeur5 );
        choeur6 = findViewById( R.id.choeur6 );

        titreCantique.setText( titre );
        numero.setText( getIntent().getStringExtra( "numero cantique" ) );

        refrain = getIntent().getStringExtra( "refrain" );
        refrain1String = getIntent().getStringExtra( "refrain 1" );
        refrain2String = getIntent().getStringExtra( "refrain 2" );
        refrain3String = getIntent().getStringExtra( "refrain 3" );
        refrain4String = getIntent().getStringExtra( "refrain 4" );
        refrain5String = getIntent().getStringExtra( "refrain 5" );
        refrain6String = getIntent().getStringExtra( "refrain 6" );

        refraintop.setText( refrain );
        refrain1.setText(refrain1String);
        refrain2.setText(refrain2String);
        refrain3.setText(refrain3String);
        refrain4.setText(refrain4String);
        refrain5.setText(refrain5String);
        refrain6.setText(refrain6String);


        if(!refrain.equals( "" )) {
            choeur.setVisibility( View.VISIBLE );
        }

        if(!refrain1String.equals( "" )) {
            choeur1.setVisibility( View.VISIBLE );
        }

         if(!refrain2String.equals( "" )) {
            choeur2.setVisibility( View.VISIBLE );
        }

         if(!refrain3String.equals( "" )) {
            choeur3.setVisibility( View.VISIBLE );
        }

         if(!refrain4String.equals( "" )) {
            choeur4.setVisibility( View.VISIBLE );
        }

         if(!refrain5String.equals( "" )) {
            choeur5.setVisibility( View.VISIBLE );
        }

         if(!refrain6String.equals( "" )) {
            choeur6.setVisibility( View.VISIBLE );
        }


        couplet1.setText( getIntent().getStringExtra( "couplet 1" ) );
        couplet2.setText( getIntent().getStringExtra( "couplet 2" ) );
        couplet3.setText( getIntent().getStringExtra( "couplet 3" ) );
        couplet4.setText( getIntent().getStringExtra( "couplet 4" ) );
        couplet5.setText( getIntent().getStringExtra( "couplet 5" ) );
        couplet6.setText( getIntent().getStringExtra( "couplet 6" ) );


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
