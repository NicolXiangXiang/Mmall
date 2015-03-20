package mmall.com.mmall.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mmall.com.mmall.R;
import mmall.com.mmall.activity.ProductListActivity;

/**
 * Created by nicol.xiang on 2015/3/3.
 */
public class CategoryItemAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mCategorys={"手机","电脑","平板","相机"};

    public CategoryItemAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mCategorys.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            convertView = new TextView(mContext);
            holder.txtSubName = (TextView) convertView;
            holder.txtSubName.setBackgroundColor(0xffffffff);
            holder.txtSubName.setTextColor(R.color.standBlack);
            holder.txtSubName.setPadding(10,20,10,20);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtSubName.setText(mCategorys[position]);
        holder.txtSubName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(mContext, ProductListActivity.class);
                mContext.startActivity(intentLogin);
            }
        });
        return convertView;
    }

    public class ViewHolder {
        TextView txtSubName;
    }
}
