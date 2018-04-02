package com.example.pc.emer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;

/**
 * Created by pc on 05/02/2018.
 */

public class ajoutE extends Activity {
   private EditText matricule,nom,prenom;
   private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        matricule= (EditText) findViewById(R.id.matricule);
        nom= (EditText) findViewById(R.id.Nom);
        prenom=(EditText)findViewById(R.id.prenom);
        add=(Button)findViewById(R.id.add);
        
    }
}