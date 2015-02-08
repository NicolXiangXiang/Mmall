package mmall.com.mmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import mmall.com.mmall.R;
import mmall.com.mmall.models.ActivitiesModel;
import mmall.com.mmall.models.HomePageDataModel;
import mmall.com.mmall.models.ProductModel;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
public class HomePageListAdapter extends BaseAdapter {

    List<HomePageDataModel> mListData;
    Context mContext;
public HomePageListAdapter(List<HomePageDataModel> listData,Context context){
    mListData=listData;
    mContext=context;
}
    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HomePageDataModel data=mListData.get(position);
        if(data.getActivities().size()>0){
            View v=convertView==null?LayoutInflater.from(mContext).inflate(R.layout.homepage_activities,null):convertView;
            ActivitiesModel activity1 =data.getActivities().get(0);
            TextView txtS1Title=((TextView)v.findViewById(R.id.txt_s1_title));
            txtS1Title.setText(activity1.getTitle());
            TextView txtS1SubTitle=(TextView)v.findViewById(R.id.txt_s1_subtitle);
            txtS1SubTitle.setText(activity1.getSubTitle());
            ImageView ivS1=(ImageView)v.findViewById(R.id.iv_s1);
            ImageLoader.getInstance().displayImage(activity1.getImageUrl(),ivS1);//display image

            ActivitiesModel activity2 =data.getActivities().get(0);
            TextView txtS2Title=(TextView)v.findViewById(R.id.txt_s2_title);
            txtS2Title.setText(activity2.getTitle());
            TextView txtS2SubTitle=(TextView)v.findViewById(R.id.txt_s2_subtitle);
            txtS1SubTitle.setText(activity2.getSubTitle());
            ImageView ivS2=(ImageView)v.findViewById(R.id.iv_s2);
            ImageLoader.getInstance().displayImage(activity2.getImageUrl(),ivS2);//display image

            ActivitiesModel activity3 =data.getActivities().get(0);
            TextView txtS3Title=(TextView)v.findViewById(R.id.txt_s3_title);
            txtS3Title.setText(activity3.getTitle());
            TextView txtS3SubTitle=(TextView)v.findViewById(R.id.txt_s3_subtitle);
            txtS3SubTitle.setText(activity3.getSubTitle());
            ImageView ivS3=(ImageView)v.findViewById(R.id.iv_s3);
            ImageLoader.getInstance().displayImage(activity3.getImageUrl(),ivS3);//display image
            return v;
        }else{
            View v=convertView==null?LayoutInflater.from(mContext).inflate(R.layout.recommend_item,null):convertView;

            TextView txtRecommendTitle=(TextView)v.findViewById(R.id.txt_recommend_title);

            ProductModel product1=data.getRecommends().get(0);
            TextView txtP1Title=(TextView)v.findViewById(R.id.txt_p1_title);
            txtP1Title.setText(product1.getTitle());
            TextView txtP1SubTitle=(TextView)v.findViewById(R.id.txt_p1_subtitle);
            txtP1SubTitle.setText(product1.getSubTitle());
            TextView txtP1DiscountPrice=(TextView)v.findViewById(R.id.txt_p1_discount_price);
            txtP1DiscountPrice.setText(product1.getDiscountPrice());
            TextView txtP1Price=(TextView)v.findViewById(R.id.txt_p1_price);
            txtP1Price.setText(product1.getPrice());
            ImageView ivP1=(ImageView)v.findViewById(R.id.iv_p1);
            ImageLoader.getInstance().displayImage(product1.getThumbUrl(),ivP1);

            ProductModel product2=data.getRecommends().get(1);
            TextView txtP2Title=(TextView)v.findViewById(R.id.txt_p2_title);
            txtP2Title.setText(product2.getTitle());
            TextView txtP2DiscountPrice=(TextView)v.findViewById(R.id.txt_p2_discount_price);
            txtP2DiscountPrice.setText(product2.getDiscountPrice());
            TextView txtP2Price=(TextView)v.findViewById(R.id.txt_p2_price);
            txtP2Price.setText(product2.getPrice());
            ImageView ivP2=(ImageView)v.findViewById(R.id.iv_p2);
            ImageLoader.getInstance().displayImage(product2.getThumbUrl(),ivP2);

            ProductModel product3=data.getRecommends().get(2);
            TextView txtP3Title=(TextView)v.findViewById(R.id.txt_p3_title);
            txtP3Title.setText(product3.getTitle());
            TextView txtP3DiscountPrice=(TextView)v.findViewById(R.id.txt_p3_discount_price);
            txtP3DiscountPrice.setText(product3.getDiscountPrice());
            TextView txtP3Price=(TextView)v.findViewById(R.id.txt_p3_price);
            txtP3Price.setText(product3.getPrice());
            ImageView ivP3=(ImageView)v.findViewById(R.id.iv_p3);
            ImageLoader.getInstance().displayImage(product3.getThumbUrl(),ivP3);

            ProductModel product4=data.getRecommends().get(3);
            TextView txtP4Title=(TextView)v.findViewById(R.id.txt_p4_title);
            txtP4Title.setText(product4.getTitle());
            TextView txtP4DiscountPrice=(TextView)v.findViewById(R.id.txt_p4_discount_price);
            txtP4DiscountPrice.setText(product4.getDiscountPrice());
            TextView txtP4Price=(TextView)v.findViewById(R.id.txt_p4_price);
            txtP4Price.setText(product4.getPrice());
            ImageView ivP4=(ImageView)v.findViewById(R.id.iv_p4);
            ImageLoader.getInstance().displayImage(product4.getThumbUrl(), ivP4);

            ProductModel product5=data.getRecommends().get(4);
            TextView txtP5Title=(TextView)v.findViewById(R.id.txt_p5_title);
            txtP5Title.setText(product5.getTitle());
            TextView txtP5DiscountPrice=(TextView)v.findViewById(R.id.txt_p5_discount_price);
            txtP5DiscountPrice.setText(product5.getDiscountPrice());
            TextView txtP5Price=(TextView)v.findViewById(R.id.txt_p5_price);
            txtP5Price.setText(product5.getPrice());
            ImageView ivP5=(ImageView)v.findViewById(R.id.iv_p5);
            ImageLoader.getInstance().displayImage(product5.getThumbUrl(),ivP5);
            return  v;
        }
    }
}
