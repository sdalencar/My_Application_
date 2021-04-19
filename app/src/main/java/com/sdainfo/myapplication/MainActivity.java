package com.sdainfo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //cria o menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //trata a seleção
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String escolha;
        switch (item.getItemId()){
            case R.id.menu_salvar:
                escolha = "Salvar";
                msg(escolha);
                break;
            case R.id.menu_editar:
                escolha = "Editar";
                msg(escolha);
                break;
            case R.id.menu_apagar:
                escolha = "Apagar";
                msg(escolha);
                break;
            case R.id.menu_voltar:
                escolha = "voltar";
                msg(escolha);
                break;
            case R.id.menu_sair:
                escolha = "Sair";
                msg(escolha);
                break;
        }

        return super.onOptionsItemSelected(item);

    }

    private void msg(String escolha){
        Toast.makeText(getApplicationContext(), escolha, Toast.LENGTH_SHORT).show();
    }


}



