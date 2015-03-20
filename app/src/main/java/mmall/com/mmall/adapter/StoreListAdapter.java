package mmall.com.mmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/3/3.
 */
public class StoreListAdapter extends BaseAdapter {
    private Context mContext;

    public StoreListAdapter(Context context){
        mContext=context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=new ViewHolder();
        if(convertView==null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_store, null);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        return convertView;
    }

   public class ViewHolder{

    }
}
