package mmall.com.mmall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import mmall.com.mmall.model.ActivitiesModel;
import mmall.com.mmall.model.HomePageDataModel;
import mmall.com.mmall.model.ProductModel;

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
        if(data.Activies.size()>0){
            View v=convertView==null?LayoutInflater.from(mContext).inflate(R.layout.homepage_activities,null):convertView;
            ActivitiesModel activity1 =data.Activies.get(0);
            TextView txtS1Title=((TextView)v.findViewById(R.id.txt_s1_title));
            txtS1Title.setText(activity1.Title);
            TextView txtS1SubTitle=(TextView)v.findViewById(R.id.txt_s1_subtitle);
            txtS1SubTitle.setText(activity1.SubTitle);
            ImageView ivS1=(ImageView)v.findViewById(R.id.iv_s1);
            ImageLoader.getInstance().displayImage(activity1.ImageUrl,ivS1);//display image

            ActivitiesModel activity2 =data.Activies.get(0);
            TextView txtS2Title=(TextView)v.findViewById(R.id.txt_s2_title);
            txtS2Title.setText(activity2.Title);
            TextView txtS2SubTitle=(TextView)v.findViewById(R.id.txt_s2_subtitle);
            txtS1SubTitle.setText(activity2.SubTitle);
            ImageView ivS2=(ImageView)v.findViewById(R.id.iv_s2);
            ImageLoader.getInstance().displayImage(activity2.ImageUrl,ivS2);//display image

            ActivitiesModel activity3 =data.Activies.get(0);
            TextView txtS3Title=(TextView)v.findViewById(R.id.txt_s3_title);
            txtS3Title.setText(activity3.Title);
            TextView txtS3SubTitle=(TextView)v.findViewById(R.id.txt_s3_subtitle);
            txtS3SubTitle.setText(activity3.SubTitle);
            ImageView ivS3=(ImageView)v.findViewById(R.id.iv_s3);
            ImageLoader.getInstance().displayImage(activity3.ImageUrl,ivS3);//display image
            return v;
        }else{
            View v=convertView==null?LayoutInflater.from(mContext).inflate(R.layout.recommend_item,null):convertView;

            TextView txtRecommendTitle=(TextView)v.findViewById(R.id.txt_recommend_title);

            ProductModel product1=data.Recommends.get(0);
            TextView txtP1Title=(TextView)v.findViewById(R.id.txt_p1_title);
            txtP1Title.setText(product1.Title);
            TextView txtP1SubTitle=(TextView)v.findViewById(R.id.txt_p1_subtitle);
            txtP1SubTitle.setText(product1.SubTitle);
            TextView txtP1DiscountPrice=(TextView)v.findViewById(R.id.txt_p1_discount_price);
            txtP1DiscountPrice.setText(product1.DiscountPrice);
            TextView txtP1Price=(TextView)v.findViewById(R.id.txt_p1_price);
            txtP1Price.setText(product1.Price);
            ImageView ivP1=(ImageView)v.findViewById(R.id.iv_p1);
            ImageLoader.getInstance().displayImage(product1.ThumbUrl,ivP1);

            ProductModel product2=data.Recommends.get(1);
            TextView txtP2Title=(TextView)v.findViewById(R.id.txt_p2_title);
            txtP2Title.setText(product2.Title);
            TextView txtP2DiscountPrice=(TextView)v.findViewById(R.id.txt_p2_discount_price);
            txtP2DiscountPrice.setText(product2.DiscountPrice);
            TextView txtP2Price=(TextView)v.findViewById(R.id.txt_p2_price);
            txtP2Price.setText(product2.Price);
            ImageView ivP2=(ImageView)v.findViewById(R.id.iv_p2);
            ImageLoader.getInstance().displayImage(product2.ThumbUrl,ivP2);

            ProductModel product3=data.Recommends.get(2);
            TextView txtP3Title=(TextView)v.findViewById(R.id.txt_p3_title);
            txtP3Title.setText(product3.Title);
            TextView txtP3DiscountPrice=(TextView)v.findViewById(R.id.txt_p3_discount_price);
            txtP3DiscountPrice.setText(product3.DiscountPrice);
            TextView txtP3Price=(TextView)v.findViewById(R.id.txt_p3_price);
            txtP3Price.setText(product3.Price);
            ImageView ivP3=(ImageView)v.findViewById(R.id.iv_p3);
            ImageLoader.getInstance().displayImage(product3.ThumbUrl,ivP3);

            ProductModel product4=data.Recommends.get(3);
            TextView txtP4Title=(TextView)v.findViewById(R.id.txt_p4_title);
            txtP4Title.setText(product4.Title);
            TextView txtP4DiscountPrice=(TextView)v.findViewById(R.id.txt_p4_discount_price);
            txtP4DiscountPrice.setText(product4.DiscountPrice);
            TextView txtP4Price=(TextView)v.findViewById(R.id.txt_p4_price);
            txtP4Price.setText(product4.Price);
            ImageView ivP4=(ImageView)v.findViewById(R.id.iv_p4);
            ImageLoader.getInstance().displayImage(product4.ThumbUrl,ivP4);

            ProductModel product5=data.Recommends.get(4);
            TextView txtP5Title=(TextView)v.findViewById(R.id.txt_p5_title);
            txtP5Title.setText(product5.Title);
            TextView txtP5DiscountPrice=(TextView)v.findViewById(R.id.txt_p5_discount_price);
            txtP5DiscountPrice.setText(product5.DiscountPrice);
            TextView txtP5Price=(TextView)v.findViewById(R.id.txt_p5_price);
            txtP5Price.setText(product5.Price);
            ImageView ivP5=(ImageView)v.findViewById(R.id.iv_p5);
            ImageLoader.getInstance().displayImage(product5.ThumbUrl,ivP5);
            return  v;
        }
    }
}
