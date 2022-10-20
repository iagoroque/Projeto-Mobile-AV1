package br.ucsal.projetosemoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MeuAdapter extends BaseAdapter {

    private List<Evento> lista;
    private Context context;

    public MeuAdapter(Context context, List<Evento> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        // bind

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_secundaria, viewGroup, false);
        }

        TextView tema = view.findViewById(R.id.list_item_tema);
        TextView programacao = view.findViewById(R.id.list_item_programacao);
        TextView horario = view.findViewById(R.id.list_item_horario);
        TextView local = view.findViewById(R.id.list_item_local);

        Evento eventos = lista.get(posicao);

        local.setText(eventos.getLocal());
        horario.setText(eventos.getHorario());
        programacao.setText(eventos.getProgramacao());
        tema.setText(eventos.getTema());

        return view;
    }
}
