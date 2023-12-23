package com.example.capitulosdiarios;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class LivroAdapter extends ArrayAdapter<LivroNovoTestamento> {

    private LayoutInflater inflater;

    public LivroAdapter(Context context, List<LivroNovoTestamento> livros) {
        super(context, 0, livros);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_spinner_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.text = convertView.findViewById(android.R.id.text1);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        LivroNovoTestamento livro = getItem(position);
        if (livro != null) {
            viewHolder.text.setText(livro.getNome());
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (position == 0) {
            // Caso seja a posição da entrada da dica
            convertView = inflater.inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.text = convertView.findViewById(android.R.id.text1);
            convertView.setTag(viewHolder);
            viewHolder.text.setText("Selecione o Livro");
        } else {
            // Caso seja uma posição de livro normal
            convertView = inflater.inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.text = convertView.findViewById(android.R.id.text1);
            convertView.setTag(viewHolder);
            LivroNovoTestamento livro = getItem(position);
            if (livro != null) {
                viewHolder.text.setText(livro.getNome());
            }
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView text;
    }
}
