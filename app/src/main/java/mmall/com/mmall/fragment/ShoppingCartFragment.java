package mmall.com.mmall.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import mmall.com.mmall.R;
import mmall.com.mmall.adapter.CategoryListAdapter;
import mmall.com.mmall.adapter.ShoppingCartAdapter;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link mmall.com.mmall.fragment.ShoppingCartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingCartFragment extends BaseFragment {

    ImageButton imgBtnMore;
    ListView lvShoppingCart;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomePageFragment.
     */
    public static ShoppingCartFragment newInstance() {
        ShoppingCartFragment fragment = new ShoppingCartFragment();
        return fragment;
    }

    public ShoppingCartFragment() {
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
        View v = inflater.inflate(R.layout.fragment_shoppingcart, container, false);
        InitiateView(v);
        return v;
    }


    private void InitiateView(View v) {
        imgBtnMore=(ImageButton)v.findViewById(R.id.btn_more);
        lvShoppingCart=(ListView)v.findViewById(R.id.lv_shoppingcart);
        lvShoppingCart.setAdapter(new ShoppingCartAdapter(getActivity()));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
