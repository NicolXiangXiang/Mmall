package mmall.com.mmall;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;

import java.util.ArrayList;

import mmall.com.mmall.model.HomePageDataModel;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link HomePageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomePageFragment extends Fragment {
    private Button mSearchButton;
    private Button mSettingButton;
    private ListView mListView;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment HomePageFragment.
     */
    public static HomePageFragment newInstance() {
        HomePageFragment fragment = new HomePageFragment();
        return fragment;
    }

    public HomePageFragment() {
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
        View v= inflater.inflate(R.layout.homepage, container, false);
        mListView=(ListView)v.findViewById(R.id.lv_homepage);
        mSearchButton=(Button)v.findViewById(R.id.btn_search);
        mSettingButton=(Button)v.findViewById(R.id.btn_setting);
        mSettingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context mContext=HomePageFragment.this.getActivity();
                //View menuView= LayoutInflater.from(mContext).inflate(R.layout.homepage_setting_pop, null, false);
                PopupMenu popupMenu=new PopupMenu(mContext,mSettingButton);
                MenuInflater menuInflater = new MenuInflater(mContext);
                menuInflater.inflate(R.menu.homepage_menu, popupMenu.getMenu());
                popupMenu.show();
            }
        });
        HomePageListAdapter adapter=new HomePageListAdapter(new ArrayList<HomePageDataModel>(),HomePageFragment.this.getActivity());
        mListView.setAdapter(adapter);
        return v;
    }
}
