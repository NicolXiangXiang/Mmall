package mmall.com.mmall.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/3/3.
 */
public class CategoryListAdapter extends BaseAdapter {
    private Context mContext;

    public CategoryListAdapter(Context context){
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_category, null);
            holder.imgIcon=(ImageView)convertView.findViewById(R.id.iv_icon);
            holder.txtTitle=(TextView)convertView.findViewById(R.id.txt_title);
            holder.gvSubCategory=(GridView)convertView.findViewById(R.id.gv_subcategory);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        holder.gvSubCategory.setAdapter(new CategoryItemAdapter(mContext));
        return convertView;
    }

   public class ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        GridView gvSubCategory;
    }
}
