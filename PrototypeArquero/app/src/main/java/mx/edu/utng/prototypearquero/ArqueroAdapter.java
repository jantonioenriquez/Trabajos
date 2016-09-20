package mx.edu.utng.prototypearquero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jose Antonio Enrique on 17/09/2016.
 */
public class ArqueroAdapter extends ArrayAdapter<Arquero> {
    public ArqueroAdapter(Context context, ArrayList<Arquero> arqueros){
        super(context, 0, arqueros);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Arquero arquero = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.arquero_layout, parent, false);
        }
        TextView txvArquero = (TextView)convertView.findViewById(R.id.txv_celular);
        txvArquero.setText(arquero.getNombre()+"-"+arquero.getAtaque()+""+arquero.getDefensa());

        return convertView;
    }
}
