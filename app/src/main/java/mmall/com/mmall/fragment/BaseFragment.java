package mmall.com.mmall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mmall.com.mmall.BarMoreWindow;
import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/2/11.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {


    @Override
    public void onResume() {
        super.onResume();
        this.getView().findViewById(R.id.btn_more).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId=v.getId();
        switch (viewId){
            case R.id.btn_more:
                BarMoreWindow.getInstence().showWindow(v);
            break;
        }
    }
}
