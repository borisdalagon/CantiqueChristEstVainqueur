package com.cmfi.cantique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmfi.cantique.ClassSimple.SharedPrefManager;

import java.util.Locale;

public class Launcher extends AppCompatActivity {

    ImageView logoLauncher;
    TextView jesus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        if(SharedPrefManager.newInstance(Launcher.this).getLangue() != null) {

            String langue = SharedPrefManager.newInstance(Launcher.this).getLangue();

            Log.d("XXX_LANGUE_33", langue);
            setLocale(langue, Launcher.this);

            setContentView( R.layout.activity_launcher );
        }
        else {
            setContentView( R.layout.activity_launcher );
        }




        logoLauncher = (ImageView)findViewById( R.id.logo_launcher );
        jesus = (TextView)findViewById( R.id.jesus );


        presenterApp();


    }


    public void setLocale(String lang, Context context){
        Locale locale = new Locale(lang);
        locale.setDefault(locale);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            Configuration config = new Configuration(context.getResources().getConfiguration());
            config.setLocale(locale);

            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
        }else {
            Configuration config = new Configuration();
            config.locale = locale;

            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
        }


        SharedPrefManager.newInstance(Launcher.this).setLangue(lang);

    }






    private void presenterApp() {

        Animation animationWelcome = AnimationUtils.loadAnimation( getApplicationContext(), R.anim.anim_welcome );

        jesus.setAnimation( animationWelcome );

        animationWelcome.setAnimationListener( new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

                Log.d("onAnimationStart","on");

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                startActivity( new android.content.Intent( getApplicationContext(), MainActivity.class ) );
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

                Log.d("onAnimationRepeat","on");

            }
        } );
    }


}
