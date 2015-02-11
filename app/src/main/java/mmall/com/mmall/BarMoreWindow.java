package mmall.com.mmall;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/**
 * Created by nicol.xiang on 2015/2/11.
 */
public class BarMoreWindow {
    private static BarMoreWindow barMoreWindow;
    public static BarMoreWindow getInstence(){
        if(barMoreWindow!=null)
            barMoreWindow=new BarMoreWindow();
        return barMoreWindow;
    }

    public static void showWindow(View v){
        View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.menu_common, null);
        PopupWindow mPopupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable(v.getContext().getResources(), (Bitmap) null));
        mPopupWindow.showAsDropDown(v);
    }
}
