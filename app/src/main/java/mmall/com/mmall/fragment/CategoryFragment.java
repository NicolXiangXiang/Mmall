package mmall.com.mmall.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import mmall.com.mmall.R;
import mmall.com.mmall.activity.FavoriteProductActivity;
import mmall.com.mmall.activity.FavoriteStoreActivity;
import mmall.com.mmall.activity.MyStoreActivity;
import mmall.com.mmall.activity.ReceiptAddressActivity;
import mmall.com.mmall.activity.SettingActivity;
import mmall.com.mmall.adapter.CategoryListAdapter;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link mmall.com.mmall.fragment.CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends BaseFragment {

    Button btnSearch;
    ImageButton imgBtnMore;
    ListView lvCategory;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomePageFragment.
     */
    public static CategoryFragment newInstance() {
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_category, container, false);
        InitiateView(v);
        return v;
    }


    private void InitiateView(View v) {
        btnSearch=(Button)v.findViewById(R.id.btn_search);
        imgBtnMore=(ImageButton)v.findViewById(R.id.btn_more);
        lvCategory=(ListView)v.findViewById(R.id.lv_category);
        lvCategory.setAdapter(new CategoryListAdapter(getActivity()));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
