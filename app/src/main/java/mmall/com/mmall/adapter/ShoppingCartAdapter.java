package mmall.com.mmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/3/3.
 */
public class ShoppingCartAdapter extends BaseAdapter {
    private Context mContext;

    public ShoppingCartAdapter(Context context){
        mContext=context;
    }

    @Override
    public int getCount() {
        return 3;
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_shoppingcart, null);
            holder.llProducts=(LinearLayout)convertView.findViewById(R.id.ll_products);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        holder.llProducts.addView( LayoutInflater.from(mContext).inflate(R.layout.item_item_shoppingcart, null));
        return convertView;
    }

   public class ViewHolder{
        LinearLayout llProducts;
    }
}
