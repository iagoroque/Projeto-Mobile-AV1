package br.ucsal.projetosemoc;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class SessaoCientifica extends AppCompatActivity {
    private List<Evento> eventos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        eventos = Arrays.asList(new Evento("\nTEMA - BIOÉTICA E SAÚDE\n", "", "19/10\n\n\n\n09 hrs às 12 hrs", "Sala A118b\n\n\n\n"),
                new Evento("\nTEMA - COMUNIDADES TRADICIONAIS E FAMÍLIA\n", "", "19/10\n\n\n\n\n\n09 hrs às 12 hrs", "Sala A120b\n\n\n"),
                new Evento("\nTEMA - POVOS TRADICIONAIS E TERRITÓRIO\n", "", "19/10\n\n\n\n\n\n09 hrs às 12 hrs", "Sala de Atos\n\n"),
                new Evento("\nTEMA - DIVERSIDADE E ALTERIDADE\n", "", "19/10\n\n\n\n\n18:30 às 21 hrs", "Sala de Atos\n\n"),
                new Evento("\nTEMA - METODOLOGIA, ENSINO E PESQUISA\n", "", "19/10\n\n\n\n\n\n18:30 às 21 hrs", "Sala A118b\n\n\n\n\n\n\n"));

        ListView listView = findViewById(R.id.list_item_principal);
        MeuAdapter adapter = new MeuAdapter(this, eventos);

        listView.setAdapter(adapter);
    }
}
