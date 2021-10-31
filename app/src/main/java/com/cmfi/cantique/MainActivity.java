package com.cmfi.cantique;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.cmfi.cantique.ClassSimple.SharedPrefManager;
import com.cmfi.cantique.ui.tools.ToolsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.util.Locale;

import umairayub.madialog.MaDialog;
import umairayub.madialog.MaDialogListener;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        if(SharedPrefManager.newInstance(MainActivity.this).getLangue() != null) {

            setLocale(SharedPrefManager.newInstance(MainActivity.this).getLangue(), MainActivity.this);

        }

        //Pour empêcher le clavier de démarer dans le oncreate
        getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN );


        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        DrawerLayout drawer = findViewById( R.id.drawer_layout );
        NavigationView navigationView = findViewById( R.id.nav_view );
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_numero, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send )
                .setDrawerLayout( drawer )
                .build();
        NavController navController = Navigation.findNavController( this, R.id.nav_host_fragment );
        NavigationUI.setupActionBarWithNavController( this, navController, mAppBarConfiguration );
        NavigationUI.setupWithNavController( navigationView, navController );
    }



    //*************Methodes de Changement de langue**********************

    public void setLocale(String lang,Context context){

        Locale locale = new Locale(lang);
        locale.setDefault(locale);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            Configuration config = new Configuration(context.getResources().getConfiguration());
            config.setLocale(locale);

            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

            //SharedPrefManager.newInstance(MainActivity.this).setLangue("");

            Log.d("XXX_LANGUE_11", lang);
            SharedPrefManager.newInstance(MainActivity.this).setLangue(lang);
            Log.d("XXX_LANGUE_111", SharedPrefManager.newInstance(MainActivity.this).getLangue());

        }else {
            Configuration config = new Configuration();
            config.locale = locale;

            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

            //SharedPrefManager.newInstance(MainActivity.this).setLangue(null);

            Log.d("XXX_LANGUE_22", lang);
            SharedPrefManager.newInstance(MainActivity.this).setLangue(lang);
        }


    }



    public static void doRestart(Context c) {
        try {
            //check if the context is given
            if (c != null) {
                //fetch the packagemanager so we can get the default launch activity
                // (you can replace this intent with any other activity if you want
                PackageManager pm = c.getPackageManager();
                //check if we got the PackageManager
                if (pm != null) {
                    //create the intent with the default start activity for your application
                    Intent mStartActivity = pm.getLaunchIntentForPackage(
                            c.getPackageName()
                    );
                    if (mStartActivity != null) {
                        mStartActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        //create a pending intent so the application is restarted after System.exit(0) was called.
                        // We use an AlarmManager to call this intent in 100ms
                        int mPendingIntentId = 223344;
                        PendingIntent mPendingIntent = PendingIntent
                                .getActivity(c, mPendingIntentId, mStartActivity,
                                        PendingIntent.FLAG_CANCEL_CURRENT);
                        AlarmManager mgr = (AlarmManager) c.getSystemService(Context.ALARM_SERVICE);
                        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
                        //kill the application
                        System.exit(0);
                    } else {
                        Log.d("RESTART_1", "Was not able to restart application, mStartActivity null");
                    }
                } else {
                    Log.d("RESTART_2", "Was not able to restart application, PM null");
                }
            } else {
                Log.d("RESTART_3", "Was not able to restart application, Context null");
            }
        } catch (Exception ex) {
            Log.d("RESTART_4", "Was not able to restart application");
        }
    }


    //*************************************Fin methodes de changement de Langue**********************************





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController( this, R.id.nav_host_fragment );
        return NavigationUI.navigateUp( navController, mAppBarConfiguration )
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:

                dialog( getResources().getString(R.string.dialog_titre),
                        getResources().getString(R.string.dialog_text),
                        getResources().getString(R.string.francais),
                        getResources().getString(R.string.anglais));

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    //Methode de l'Alert Dialog
    public void dialog(String titre, String message, String textPositifButon, String textNegatifButon){


        new MaDialog.Builder(MainActivity.this)
                .setTitle(titre)
                .setMessage(message)
                .setPositiveButtonText(textPositifButon)
                .setNegativeButtonText(textNegatifButon)
                .setBackgroundColor( R.color.colorBlanche )
                .setButtonTextColor( Color.parseColor("#8D291E") )
                .setTitleTextColor( Color.parseColor("#8D291E") )
                .setMessageTextColor( Color.parseColor("#000000") )
                .setButtonOrientation( LinearLayout.HORIZONTAL)
                .setPositiveButtonListener(new MaDialogListener() {
                    @Override
                    public void onClick() {


                        setLocale(String.valueOf(Locale.FRENCH), MainActivity.this);

                        Log.d("XXX_LANGUE",String.valueOf(Locale.FRENCH));
                        doRestart(MainActivity.this);


                    }
                })
                .setNegativeButtonListener(new MaDialogListener() {
                    @Override
                    public void onClick() {


                        setLocale(String.valueOf(Locale.ENGLISH), MainActivity.this);

                        Log.d("XXX_LANGUE",String.valueOf(Locale.ENGLISH));
                        doRestart(MainActivity.this);

                    }
                })
                .build();

    }
}
