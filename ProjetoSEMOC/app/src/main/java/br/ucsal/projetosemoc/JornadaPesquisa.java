package br.ucsal.projetosemoc;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class JornadaPesquisa extends AppCompatActivity {
    private List<Evento> eventos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        eventos = Arrays.asList(new Evento("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n", "Geotecnologias aplicadas ao Planejamento Urbano e Desenvolvimento Social\n", "18/10\n\n\n\n\n\n\n14 hrs às 16:30", "Sala 201\n\n\n\n\n\n\nBloco B"),
                new Evento("TEMA 2 - DIVERSIDADE E ALTERIDADE\n", "A pessoa com deficiência e o mercado/mundo do trabalho", "18/10\n\n\n\n\n\n14 hrs às 16:30", "Sala 203\n\n\n\n\n\nBloco B"),
                new Evento("TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n", "Um Exame do Racismo Ambiental no Setor do Saneamento Básico\n", "18/10\n\n\n\n\n\n\n\n14 hrs às 16:30", "Sala 204\n\n\n\n\n\n\n\nBloco B"),
                new Evento("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n", "Grupo de Pesquisa Territórios em Resistência", "18/10\n\n\n\n\n\n14 hrs às 16:30", "Sala 205\n\n\n\n\n\nBloco B"),
                new Evento("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n", "O Direito à Moradia na perspectiva do Direito à Ocupação, à Reparação Justa e à Regularização Fundiária", "19/10\n\n\n\n\n\n14 hrs às 16:30", "Sala 201\n\n\n\n\n\nBloco B"));

        ListView listView = findViewById(R.id.list_item_principal);
        MeuAdapter adapter = new MeuAdapter(this, eventos);

        listView.setAdapter(adapter);
    }
}
