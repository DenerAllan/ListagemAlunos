package com.example.listagemalunos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class cadastroAluno extends AppCompatActivity {

    Spinner lstCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        lstCursos = findViewById(R.id.spnCursos);

        String [] cursos = getResources().getStringArray(R.array.Cursos);

        ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cursos);

        lstCursos.setAdapter(adp);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro_aluno, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuSalvar: {
                break;
            }

            case R.id.menuCancelar: {
                finish();
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
