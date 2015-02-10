package mmall.com.mmall.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import mmall.com.mmall.R;
import mmall.com.mmall.activity.FavoriteProductActivity;
import mmall.com.mmall.activity.FavoriteStoreActivity;
import mmall.com.mmall.activity.MyStoreActivity;
import mmall.com.mmall.activity.ReceiptAddressActivity;
import mmall.com.mmall.activity.SettingActivity;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link mmall.com.mmall.fragment.MyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFragment extends Fragment implements View.OnClickListener {

    private ImageView mProfileImage;
    private ImageView mMyBackground;
    private ImageButton btnSetting;
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
     *
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
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        InitiateView(v);
        return v;
    }


    private void InitiateView(View v) {
        btnSetting = (ImageButton) v.findViewById(R.id.btn_my_setting);
        btnSetting.setOnClickListener(this);

        mProfileImage = (ImageView) v.findViewById(R.id.iv_my_profileimage);
        mMyBackground = (ImageView) v.findViewById(R.id.iv_my_bg);
        txtName = (TextView) v.findViewById(R.id.tv_my_name);
        txtAllCount = (TextView) v.findViewById(R.id.tv_all_count);
        txtPaymentCount = (TextView) v.findViewById(R.id.tv_payment_count);
        txtGoodsCount = (TextView) v.findViewById(R.id.tv_goods_count);
        txtCommentCount = (TextView) v.findViewById(R.id.tv_comment_count);

        llFavoriateProduct = (LinearLayout) v.findViewById(R.id.ll_favoriate_product);
        llFavoriateProduct.setOnClickListener(this);
        llFavoriateStore = (LinearLayout) v.findViewById(R.id.ll_favoriate_store);
        llFavoriateStore.setOnClickListener(this);
        llMyStore = (LinearLayout) v.findViewById(R.id.ll_mystore);
        llMyStore.setOnClickListener(this);
        llReceiptAddress = (LinearLayout) v.findViewById(R.id.ll_receipt_address);
        llReceiptAddress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_my_setting:
                Intent intent1 = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent1);
                break;
            case R.id.ll_favoriate_product:
                Intent intent2 = new Intent(getActivity(), FavoriteProductActivity.class);
                startActivity(intent2);
                break;
            case R.id.ll_favoriate_store:
                Intent intent3 = new Intent(getActivity(), FavoriteStoreActivity.class);
                startActivity(intent3);
                break;
            case R.id.ll_mystore:
                Intent intent4 = new Intent(getActivity(), MyStoreActivity.class);
                startActivity(intent4);
                break;
            case R.id.ll_receipt_address:
                Intent intent5 = new Intent(getActivity(), ReceiptAddressActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
