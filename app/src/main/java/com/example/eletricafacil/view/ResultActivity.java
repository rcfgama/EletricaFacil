package com.example.eletricafacil.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eletricafacil.R;
import com.example.eletricafacil.data.SecurityPreferences;

public class ResultActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolder.textLampada = findViewById(R.id.text_lampada);
        this.mViewHolder.editLampada = findViewById(R.id.edit_lampada);
        this.mViewHolder.textDisjuntor = findViewById(R.id.text_disjuntor);
        this.mViewHolder.editDisjuntor = findViewById(R.id.edit_disjuntor);

        this.getResult();
    }

    private void getResult() {
        String potlamp = this.mSecurityPreferences.getStoredLampada("rlamp");
        int disjuntor = this.mSecurityPreferences.getStoredDisjuntor("rDisj");

        this.mViewHolder.editLampada.setText(potlamp);
        this.mViewHolder.editDisjuntor.setText(disjuntor);
    }

    private static class ViewHolder {
        TextView textLampada;
        EditText editLampada;
        TextView textDisjuntor;
        EditText editDisjuntor;
    }
}