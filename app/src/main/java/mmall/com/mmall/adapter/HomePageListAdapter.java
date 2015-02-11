package mmall.com.mmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import mmall.com.mmall.MmallApp;
import mmall.com.mmall.R;
import mmall.com.mmall.models.ActivitiesModel;
import mmall.com.mmall.models.HomePageDataModel;
import mmall.com.mmall.models.ProductModel;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
public class HomePageListAdapter extends BaseAdapter {

    HomePageDataModel products;
    Context mContext;

    public HomePageListAdapter(HomePageDataModel products, Context context) {
        this.products = products;
        mContext = context;
    }

    public void updateData(HomePageDataModel data) {
        this.products = data;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (products != null)
            return 4;
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (products != null) {
            if (position == 0) {
                View v = LayoutInflater.from(mContext).inflate(R.layout.homepage_activities, null);
                return v;
            } else {
                View v = LayoutInflater.from(mContext).inflate(R.layout.recommend_item, null);
                TextView txtRecommendTitle = (TextView) v.findViewById(R.id.txt_recommend_title);
                List<ProductModel> item = new ArrayList<ProductModel>();
                int color = R.color.standRed;
                if (position == 1) {
                    item = products.getRecomms();
                    txtRecommendTitle.setBackgroundResource(R.color.standRed);
                    txtRecommendTitle.setText("Mmall热荐");
                } else if (position == 2) {
                    item = products.getDiscounts();
                    txtRecommendTitle.setBackgroundResource(R.color.standOrange);
                    txtRecommendTitle.setText("热点产品");
                } else if (position == 3) {
                    item = products.getHots();
                    txtRecommendTitle.setBackgroundResource(R.color.standBlue);
                    txtRecommendTitle.setText("折扣产品");
                }




                ProductModel product1 = item.get(0);
                TextView txtP1Title = (TextView) v.findViewById(R.id.txt_p1_title);
                txtP1Title.setText(product1.getPname());
                TextView txtP1SubTitle = (TextView) v.findViewById(R.id.txt_p1_subtitle);
                txtP1SubTitle.setText(product1.getPcaption());
                TextView txtP1DiscountPrice = (TextView) v.findViewById(R.id.txt_p1_discount_price);
                txtP1DiscountPrice.setText(product1.getPmprice());
                TextView txtP1Price = (TextView) v.findViewById(R.id.txt_p1_price);
                txtP1Price.setText(product1.getPpprice());
                ImageView ivP1 = (ImageView) v.findViewById(R.id.iv_p1);
                MmallApp.bitmapUtils.display(ivP1, product1.getIimg1());

                ProductModel product2 = item.get(1);
                TextView txtP2Title = (TextView) v.findViewById(R.id.txt_p2_title);
                txtP2Title.setText(product2.getPname());
                TextView txtP2DiscountPrice = (TextView) v.findViewById(R.id.txt_p2_discount_price);
                txtP2DiscountPrice.setText(product2.getPmprice());
                TextView txtP2Price = (TextView) v.findViewById(R.id.txt_p2_price);
                txtP2Price.setText(product2.getPpprice());
                ImageView ivP2 = (ImageView) v.findViewById(R.id.iv_p2);
                MmallApp.bitmapUtils.display(ivP2, product2.getIimg1());

                ProductModel product3 = item.get(2);
                TextView txtP3Title = (TextView) v.findViewById(R.id.txt_p3_title);
                txtP3Title.setText(product3.getPname());
                TextView txtP3DiscountPrice = (TextView) v.findViewById(R.id.txt_p3_discount_price);
                txtP3DiscountPrice.setText(product3.getPmprice());
                TextView txtP3Price = (TextView) v.findViewById(R.id.txt_p3_price);
                txtP3Price.setText(product3.getPpprice());
                ImageView ivP3 = (ImageView) v.findViewById(R.id.iv_p3);
                MmallApp.bitmapUtils.display(ivP3, product3.getIimg1());

                ProductModel product4 = item.get(3);
                TextView txtP4Title = (TextView) v.findViewById(R.id.txt_p4_title);
                txtP4Title.setText(product4.getPname());
                TextView txtP4DiscountPrice = (TextView) v.findViewById(R.id.txt_p4_discount_price);
                txtP4DiscountPrice.setText(product4.getPmprice());
                TextView txtP4Price = (TextView) v.findViewById(R.id.txt_p4_price);
                txtP4Price.setText(product4.getPpprice());
                ImageView ivP4 = (ImageView) v.findViewById(R.id.iv_p4);
                MmallApp.bitmapUtils.display(ivP4, product4.getIimg1());

                ProductModel product5 = item.get(4);
                TextView txtP5Title = (TextView) v.findViewById(R.id.txt_p5_title);
                txtP5Title.setText(product5.getPname());
                TextView txtP5DiscountPrice = (TextView) v.findViewById(R.id.txt_p5_discount_price);
                txtP5DiscountPrice.setText(product5.getPmprice());
                TextView txtP5Price = (TextView) v.findViewById(R.id.txt_p5_price);
                txtP5Price.setText(product5.getPpprice());
                ImageView ivP5 = (ImageView) v.findViewById(R.id.iv_p5);
                MmallApp.bitmapUtils.display(ivP5, product5.getIimg1());

                return v;
            }
        } else {
            return null;
        }
    }
}
