package mmall.com.mmall.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.ArrayList;

import mmall.com.mmall.R;
import mmall.com.mmall.adapter.HomePageListAdapter;
import mmall.com.mmall.models.HomePageDataModel;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link mmall.com.mmall.fragment.MyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFragment extends Fragment {

    private ImageView mProfileImage;
    private ImageView mMyBackground;
    private TextView txtName;
    private TextView txtAllCount;
    private TextView txtPaymentCount;
    private TextView txtGoodsCount;
    private TextView txtCommentCount;
    private LinearLayout llFavoriateProduct;
    private LinearLayout llFavoriateStore;
    private LinearLayout llMyStore;
    private LinearLayout llReceiptAddress;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment HomePageFragment.
     */
    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }

    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.my, container, false);

        mProfileImage=(ImageView)v.findViewById(R.id.iv_my_profileimage);
        mMyBackground=(ImageView)v.findViewById(R.id.iv_my_bg);
        txtName=(TextView)v.findViewById(R.id.tv_my_name);
       txtAllCount=(TextView)v.findViewById(R.id.tv_all_count);
       txtPaymentCount=(TextView)v.findViewById(R.id.tv_payment_count);
       txtGoodsCount=(TextView)v.findViewById(R.id.tv_goods_count);
         txtCommentCount=(TextView)v.findViewById(R.id.tv_comment_count);
         llFavoriateProduct=(LinearLayout)v.findViewById(R.id.ll_favoriate_product);
       llFavoriateStore=(LinearLayout)v.findViewById(R.id.ll_favoriate_store);
         llMyStore=(LinearLayout)v.findViewById(R.id.ll_mystore);
        llReceiptAddress=(LinearLayout)v.findViewById(R.id.ll_receipt_address);

        return v;
    }
}
