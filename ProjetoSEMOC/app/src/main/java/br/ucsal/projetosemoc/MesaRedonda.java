package br.ucsal.projetosemoc;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MesaRedonda extends AppCompatActivity {
    private List<Evento> eventos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        eventos = Arrays.asList(new Evento("\nABERTURA\n", "", "17/10\n\n\n18:30 às 21 hrs", "Auditório Térreo\n\n\nBloco A"),
                new Evento("EIXO 2", "\nDireitos Fundamentais, Efetividade e Jurisdição Constitucional\n", "18/10\n\n\n\n\n\n9:30 às 12 hrs", "Auditório Térreo\n\n\n\n\n\nBloco A"),
                new Evento("EIXO 2", "\nAcessibilidade em Escolas Municipais: ir, estar e voltar\n", "18/10\n\n\n\n\n\n09:30 às 12 hrs", "Sala 201\n\n\n\n\n\nBloco B"),
                new Evento("EIXO 5", "\n\"Primeira infância primeiro\"\n", "18/10\n\n\n\n\n\n09:30 às 12 hrs", "Auditório da Pós\n\n\n\n\n\n"),
                new Evento("EIXO 3", "\nPovos tradicionais e o direito ao território\n", "18/10\n\n\n\n\n\n09:30 às 12 hrs", "ONLINE\n\n\n\n\nYouTube\nUCSal Oficial"),
                new Evento("EIXO 4", "\nO Olhar na História para Identificar os Caminhos da Ciência\n", "18/10\n\n\n\n\n\n\n14 hrs às 16:30", "Auditório Térreo\n\n\n\n\n\n\nBloco A"));

        ListView listView = findViewById(R.id.list_item_principal);
        MeuAdapter adapter = new MeuAdapter(this, eventos);

        listView.setAdapter(adapter);
    }
}
