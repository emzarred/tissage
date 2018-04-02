package com.example.pc.emer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class gestion extends Activity implements View.OnClickListener {
    ImageButton add, search, delete, adda, searcha, deletea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ges);
        add = (ImageButton) findViewById(R.id.add);
        search = (ImageButton) findViewById(R.id.search);
        delete = (ImageButton) findViewById(R.id.delete);
        adda = (ImageButton) findViewById(R.id.addA);
        searcha = (ImageButton) findViewById(R.id.searchA);
        deletea = (ImageButton) findViewById(R.id.deleteA);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(gestion.this, ajoutE.class);
        startActivity(i);
    }

    public void onSearch(View v) {
        Intent i = new Intent(gestion.this, chercherE.class);
        startActivity(i);
    }

    public void onDelete(View v) {
        Intent i = new Intent(gestion.this, supprimerE.class);
        startActivity(i);

    }
    public void onClickA(View v) {
        Intent i = new Intent(gestion.this, ajoutA.class);
        startActivity(i);

    }
    public void onSearchA(View v) {
        Intent i = new Intent(gestion.this, chercherA.class);
        startActivity(i);

    }
    public void onDeleteA(View v) {
        Intent i = new Intent(gestion.this, supprimerA.class);
        startActivity(i);

    }
}