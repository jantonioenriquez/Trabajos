package mx.edu.utng.prototype;

/**
 * Created by Jose Antonio Enrique on 14/09/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class RelojAdapter extends ArrayAdapter<Reloj> {

    public RelojAdapter(Context context, ArrayList<Reloj> relojs){
        super(context, 0, relojs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Reloj reloj = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.reloj_layout, parent, false);
        }
        TextView txvReloj = (TextView)convertView.findViewById(R.id.txv_reloj);
        txvReloj.setText(reloj.getMarca()+"-"+reloj.getColor());

        return convertView;
    }
}

