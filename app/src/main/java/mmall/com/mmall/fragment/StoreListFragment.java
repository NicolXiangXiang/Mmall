package mmall.com.mmall.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import mmall.com.mmall.R;
import mmall.com.mmall.adapter.ShoppingCartAdapter;
import mmall.com.mmall.adapter.StoreListAdapter;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link mmall.com.mmall.fragment.StoreListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoreListFragment extends BaseFragment {

    ListView mListView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomePageFragment.
     */
    public static StoreListFragment newInstance() {
        StoreListFragment fragment = new StoreListFragment();
        return fragment;
    }

    public StoreListFragment() {
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
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        InitiateView(v);
        return v;
    }


    private void InitiateView(View v) {
        mListView=(ListView)v.findViewById(R.id.lv_store);
        mListView.setAdapter(new StoreListAdapter(getActivity()));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
