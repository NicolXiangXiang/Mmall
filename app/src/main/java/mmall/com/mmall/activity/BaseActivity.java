package mmall.com.mmall.activity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/2/10.
 */
public class BaseActivity extends Activity implements View.OnClickListener {
    protected Button btnBack;
    @Override
    protected void onStart() {
        super.onStart();
        btnBack=(Button)this.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId=v.getId();
        switch (viewId){
            case R.id.btn_back:
                this.finish();
                break;
        }

    }
}
