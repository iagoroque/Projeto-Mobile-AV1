package br.ucsal.appsemoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.ucsal.busucsal.R;

public class MeuAdapter extends BaseAdapter {

    private List<Horario> lista;
    private Context context;

    public MeuAdapter(Context context, List<Horario> lista) {
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

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_horario,viewGroup,false);
        }

        TextView local = view.findViewById(R.id.list_item_local);
        TextView data = view.findViewById(R.id.list_item_data);
        TextView programacao = view.findViewById(R.id.list_item_programacao);
        TextView eixo = view.findViewById(R.id.list_item_eixo);

        Horario horario = lista.get(posicao);

        local.setText(horario.getLocal());
        data.setText(horario.getData());
        programacao.setText(horario.getProgramacao());
        eixo.setText(horario.getEixo());

        return view;
    }
}
