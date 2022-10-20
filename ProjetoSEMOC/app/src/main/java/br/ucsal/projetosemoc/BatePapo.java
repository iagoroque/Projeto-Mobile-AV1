package br.ucsal.projetosemoc;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class BatePapo extends AppCompatActivity {
    private List<Evento> eventos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        eventos = Arrays.asList(new Evento("BATE PAPO SOBRE O CEP\n", "Comitê de Ética em Pesquisa", "18/10\n\n\n\n\n\n09 hrs às 10 hrs", "Sala Google\n\n\n\n\n\n"),
                new Evento("BATE PAPO SOBRE O CEC\n", "Centro de Escrita Científica", "18/10\n\n\n\n\n\n10 hrs às 11 hrs", "Sala Google\n\n\n\n\n"),
                new Evento("\nBATE PAPO SOBRE CARREIRA PROFISSIONAL", "", "20/10\n\n\n\n\n9 hrs às 11 hrs", "Sala Google\n\n\n\n"));

        ListView listView = findViewById(R.id.list_item_principal);
        MeuAdapter adapter = new MeuAdapter(this, eventos);

        listView.setAdapter(adapter);
    }
}
