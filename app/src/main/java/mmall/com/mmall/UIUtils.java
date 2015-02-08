package mmall.com.mmall;

import java.io.File;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

public class UIUtils {
	
	public static File getFileDir(Context mContext) {
		File cacheDir = null;

		if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
			cacheDir = mContext.getExternalFilesDir(null);
		} else {
			cacheDir = mContext.getFilesDir();

		}
		return cacheDir;
	}
	
	/**
	 * make file path
	 * @param mContext
	 * @param forlderName
	 * @return
	 */
	public static String makeFilePath(Context mContext, String forlderName){
		File cacheDir = new File(getFileDir(mContext), forlderName);
		if (!cacheDir.exists()) {
			cacheDir.mkdirs();
		}
		return cacheDir.getPath();
	}


	/**
	 * dip to px
	 * @param context
	 * @param dpValue
	 * @return
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}
	/**
	 * px to dip
	 * @param context
	 * @param pxValue
	 * @return
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}
	
	/**
	 * get 1/2 of screen's width except padding
	 * @param context
	 * @param dpValue Padding value
	 * @return square image's length of a side
	 */
	public static int getSideLength(Context context, float dpValue) {
		int length = (context.getResources().getDisplayMetrics().widthPixels - dip2px(context, dpValue)) / 2;
		return length;
	}
}
