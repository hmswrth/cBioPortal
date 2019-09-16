package com.mudra.hem.cbioportal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {





        //onclicks
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openweb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cbioportal.org/"));
        startActivity(browserIntent);
    }
    public void opentuts(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cbioportal.org/tutorials"));
        startActivity(browserIntent);
    }
    public void openfaq(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cbioportal.org/faq"));
        startActivity(browserIntent);
    }
    public void openintro(View view){
        Intent myIntent = new Intent(Main2Activity.this,IntroActivity.class);
        startActivity(myIntent);
    }

}

