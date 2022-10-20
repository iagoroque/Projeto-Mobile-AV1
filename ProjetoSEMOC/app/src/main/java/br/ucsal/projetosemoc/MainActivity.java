package br.ucsal.projetosemoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView categorySemoc;
    private String[] filter = {"\nBate-Papo\n", "\nJornadas de Pesquisa\n", "\nMesas Redondas\n", "\nSEMOC Jovem\n", "\nSessões Científicas\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        categorySemoc = findViewById(R.id.list_item_principal);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, filter);
        categorySemoc.setAdapter(adapter);

        categorySemoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected = categorySemoc.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT).show();
                Intent intent;
                switch (i) {
                    case 0:
                        intent = new Intent(MainActivity.this, BatePapo.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, JornadaPesquisa.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, MesaRedonda.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, SemocJovem.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, SessaoCientifica.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}