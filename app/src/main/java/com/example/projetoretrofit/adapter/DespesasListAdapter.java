package com.example.projetoretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.projetoretrofit.R;
import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DespesasDTO;

import java.util.ArrayList;

public class DespesasListAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<DespesasDTO> despesas;


    public DespesasListAdapter(Context context,
                               ArrayList<DespesasDTO> despesas) {
        this.context = context;
        this.despesas = despesas;
    }

    @Override
    public int getCount() {
        return despesas.size();
    }

    @Override
    public Object getItem(int i) {
        return despesas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = LayoutInflater.from(context).
                    inflate(R.layout.deputados_list_item,
                            viewGroup, false);
        }
        TextView tvDespesas = view.findViewById(R.id.tvDespesas);
        DespesasDTO despesa = despesas.get(i);
        tvDespesas.setText(despesa.getAno()+
                " - "+despesa.getCnpjCpfFornecedor()+
                "/"+despesa.getCodDocumento());


        return view;
    }
}
