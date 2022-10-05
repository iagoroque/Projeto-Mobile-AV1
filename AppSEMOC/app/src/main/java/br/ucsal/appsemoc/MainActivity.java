package br.ucsal.appsemoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import br.ucsal.busucsal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Horario> horarios =
                Arrays.asList(new Horario("Auditório Térreo\n\n\nBloco A","17/10\n\n\n18:30 às 21 hrs","","\nABERTURA"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\n\nBloco A","18/10\n\n\n\n\n\n\n\n9:30 às 12 hrs","\nDireitos Fundamentais, Efetividade e Jurisdição Constitucional\n","EIXO 2"),
                        new Horario("Sala 201\n\n\n\n\n\nBloco B","18/10\n\n\n\n\n\n09:30 às 12 hrs","\nAcessibilidade em Escolas Municipais: ir, estar e voltar\n","EIXO 2"),
                        new Horario("Auditório da Pós\n\n\n\n\n\n","18/10\n\n\n\n\n\n09:30 às 12 hrs","\n\"Primeira infância primeiro\"\n","EIXO 5"),
                        new Horario("ONLINE\n\n\n\n\nYouTube\nUCSal Oficial","18/10\n\n\n\n\n\n09:30 às 12 hrs","\nPovos tradicionais e o direito ao território\n","EIXO 3"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","18/10\n\n\n\n\n\n\n14 hrs às 16:30","\nO Olhar na História para Identificar os Caminhos da Ciência\n","EIXO 4"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\n\n\n\nBloco A","18/10\n\n\n\n\n\n\n\n\n\n18:30 às 21 hrs","\nO PIBID e a Residência Pedagógica na UCSAL: Desafios e experiências da Inclusão na Educação Básica e a Formação de Professores\n","EIXO 2"),
                        new Horario("Auditório da Pós\n\n\n\n\n\n\n","18/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nAlteridade e busca de sentido para uma educação inclusiva e dialógica\n","EIXO 2"),
                        new Horario("Sala 201\n\n\n\n\n\n\nBloco B","18/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nInstrumentos democráticos por uma educaçãoinclusiva e efetiva\n","EIXO 1"),
                        new Horario("ONLINE\n\n\n\n\n\nYouTube\nUCSal Oficial","19/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nDireito à moradia e violações na pandemiade COVID-19\n","EIXO 3"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","19/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nCriminologia Crítica na América Latina: Punitivismo e Direitos Humanos\n","EIXO 4"),
                        new Horario("Sala 201\n\n\n\n\n\n\nBloco B","19/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nInclusão educacional das pessoas com deficiência e boas práticas\n","EIXO 2"),
                        new Horario("Auditório da Pós\n\n\n\n\n\n\n","19/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nFamílias e Educação: Novos olhares e reflexões sobre inclusão social\n","EIXO 5"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","19/10\n\n\n\n\n\n\n14 hrs às 16:30","\nA pessoa com deficiência no ensino superior: desafios e conquistas\n","EIXO 5"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","19/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nA questão racial na educaçãoe a luta por direitos\n","EIXO 3"),
                        new Horario("Sala 201\n\n\n\n\n\n\nBloco B","19/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nA figura do poliedro em tempos de crise: o processo de inclusão e diálogo fraterno\n","EIXO 2"),
                        new Horario("ONLINE\n\n\n\n\n\nYouTube\nUCSal Oficial","20/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nAs cidades digitais, o Governo eletrônico e a participação popular\n","EIXO 3"),
                        new Horario("Auditório Térreo\n\n\n\n\n\nBloco A","20/10\n\n\n\n\n\n09:30 às 12 hrs","\nBioética e Relação Médico-Paciente\n","EIXO 4"),
                        new Horario("Auditório da Pós\n\n\n\n\n\n\n","20/10\n\n\n\n\n\n\n\n09:30 às 12 hrs","\nEnvelhecimento e Educação Inclusiva: o idoso como sujeito de direitos\n","EIXO 5"),
                        new Horario("ONLINE\n\n\n\n\n\n\n\nYouTube\nUCSal Oficial","20/10\n\n\n\n\n\n\n\n\n14 hrs às 16:30","\nRacismo Ambiental, Refugiados Ambientais, Políticas Públicas e Inclusão Social\n","EIXO 1"),
                        new Horario("ONLINE\n\n\n\n\n\n\nYouTube\nUCSal Oficial","20/10\n\n\n\n\n\n\n\n18:30 às 21 hrs","\nParadigmas, Constituição e Educação para e pelos Direitos Humanos\n","EIXO 2"),
                        new Horario("Auditório da Pós\n\n\n\n\n","20/10\n\n\n\n\n18:30 às 21 hrs","\nConstituição, Política e Instituições Judiciais\n","EIXO 1"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","20/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nA educação inclusiva como meio de ressocialização no sistema carcerário\n","EIXO 1"),
                        new Horario("Sala 201\n\n\n\n\n\n\nBloco B","20/10\n\n\n\n\n\n\n18:30 às 21 hrs","\nEducação, inclusão e serviço social, interfaces da segregação\n","EIXO 1"),
                        new Horario("Auditório Térreo\n\n\n\n\n\n\nBloco A","21/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nPós-Humanismo como Novo Paradigma Jurídico para o Estudo da Terra\n","EIXO 4"),
                        new Horario("Auditório da Pós\n\n\n\n\n","21/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nPolíticas Públicas e Promoção das Capacidades\n","EIXO 1"),
                        new Horario("Sala 201\n\n\n\n\n\n\nBloco B","21/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nArbitragem Empresarial e Acesso à Justiça\n","EIXO 3"),
                        new Horario("ONLINE\n\n\n\n\n\nYouTube\nUCSal Oficial","20/10\n\n\n\n\n\n\n09:30 às 12 hrs","\nInclusão social: o reverso da exclusão social?\n","ENCERRAMENTO"));




        // new String[]{"06:30","06:45","07:00","07:20","07:40","09:00","10:00"};

        ListView listView = findViewById(R.id.main_list_horarios);

        // ListAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, horarios);

        MeuAdapter adaptador = new MeuAdapter(this, horarios);

        listView.setAdapter(adaptador);
    }
}