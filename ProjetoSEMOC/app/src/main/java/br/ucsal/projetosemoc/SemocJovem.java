package br.ucsal.projetosemoc;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class SemocJovem extends AppCompatActivity {
    private List<Evento> eventos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        eventos = Arrays.asList(new Evento("\nACOLHIMENTO\n", "", "19/10\n\n\n\n08:30 às 09:30", "Auditório Térreo\n\n\n\nBloco A"),
                new Evento("\nAPRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO\n", "", "19/10\n\n\n\n\n\n\n10 hrs às 12 hrs", "Sala Google\n\n\n\n\n\n"));

        ListView listView = findViewById(R.id.list_item_principal);
        MeuAdapter adapter = new MeuAdapter(this, eventos);

        listView.setAdapter(adapter);
    }
}
