package co.konrad.citytrend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos  extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{


    ArrayList<String> listDato;


    public AdapterDatos(ArrayList<String> listDatos) {
        this.listDato = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false    );
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDato.get(position));
        
    }

    @Override
    public int getItemCount() {
        if (listDato != null)
            return listDato.size();
        return 0;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            dato = (TextView) itemView.findViewById(R.id.dato);
        }

        public void asignarDatos(String s) {
                dato.setText(s);
        }
    }
}
