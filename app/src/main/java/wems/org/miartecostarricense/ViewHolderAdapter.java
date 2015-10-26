package wems.org.miartecostarricense;

/**
 * Created by will on 10/25/15.
 */

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class ViewHolderAdapter extends ArrayAdapter<Mensaje> {

    private static String TAG = "RecycleAdapter";

    private Context mContext;
    private LayoutInflater mInflater;

    public ViewHolderAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mContext = context;
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    static class ViewHolder {
        TextView name;
        TextView longtext;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "position=" + position);

        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.chat_item, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.longtext = (TextView) convertView
                    .findViewById(R.id.longtext);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Mensaje data = getItem(position);
        holder.name.setText(data.getNombre());
        holder.longtext.setText(data.getTexto());

        return convertView;

    }

}
