package wems.org.miartecostarricense;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 10/26/15.
 */
public class CheckedListViewAdapter extends ArrayAdapter<TipoArtesania> {

    private Context context;
    private int layoutResourceId;
    private ArrayList<TipoArtesania> data = new ArrayList<>();

    public CheckedListViewAdapter(Context context, int resource, ArrayList<TipoArtesania> data) {

        super(context, resource, data);

        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.checkBox = (CheckBox)row.findViewById(R.id.check1);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        TipoArtesania artesania = data.get(position);

        holder.checkBox.setText(artesania.getNombre());
        holder.checkBox.setChecked(artesania.isChecked());
        return row;
    }


    static class ViewHolder {
        CheckBox checkBox;
    }
}