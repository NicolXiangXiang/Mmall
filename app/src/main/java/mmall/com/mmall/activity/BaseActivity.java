package mmall.com.mmall.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import mmall.com.mmall.BarMoreWindow;
import mmall.com.mmall.R;

/**
 * Created by nicol.xiang on 2015/2/10.
 */
public class BaseActivity extends Activity implements View.OnClickListener {
    protected Button btnBack;

    @Override
    protected void onStart() {
        super.onStart();
        this.findViewById(R.id.btn_back).setOnClickListener(this);
        this.findViewById(R.id.btn_more).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.btn_back:
                this.finish();
                break;
            case R.id.btn_more:
                BarMoreWindow.getInstence().showWindow(v);
                break;
        }

    }
}
