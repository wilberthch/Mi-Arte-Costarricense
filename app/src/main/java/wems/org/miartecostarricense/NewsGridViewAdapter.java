package wems.org.miartecostarricense;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by will on 10/25/15.
 */
public class NewsGridViewAdapter extends ArrayAdapter {

    private Context context;
    private int layoutResourceId;
    private ArrayList<News> news = new ArrayList<>();

    public NewsGridViewAdapter(Context context, int layoutResourceId, ArrayList<News> news) {
        super(context, layoutResourceId, news);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.news = news;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.lblTituloNoticia = (TextView)row.findViewById(R.id.lblTituloNoticia);
            holder.txtFecha = (TextView)row.findViewById(R.id.txtFecha);
            holder.txtHora = (TextView)row.findViewById(R.id.txthora);
            holder.txtDescripcion = (TextView)row.findViewById(R.id.txtDescripcion);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        News _new = news.get(position);
        
        holder.lblTituloNoticia.setText(_new.getTituloNoticia());
        holder.txtFecha.setText(_new.getFecha());
        holder.txtHora.setText(_new.getHora());
        holder.txtDescripcion.setText(_new.getDescripcion());
        
        return row;
    }

    static class ViewHolder {
        TextView lblTituloNoticia;
        TextView txtFecha;
        TextView txtHora;
        TextView txtDescripcion;
    }

}
