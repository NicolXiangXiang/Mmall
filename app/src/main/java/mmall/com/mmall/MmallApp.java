package mmall.com.mmall;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.DbUtils.DbUpgradeListener;
import mmall.com.mmall.activity.MainActivity;

import mmall.com.mmall.activity.MainActivity;

public class MmallApp extends Application {

	private static DbUtils dbUtils;

	private final String DB_NAME = "mmall.db";

	private final int DB_VERSION = 1;

	public static DbUtils getDbUtils() {
		return dbUtils;
	}

	public static BitmapUtils bitmapUtils;

	// 图片缓存路径
	public static String cachePath;

	// 当前的主页面
	public static MainActivity currentMainActivity;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Context context = getApplicationContext();

		cachePath = getExternalFilesDir(null) + "/imagecaches";

		bitmapUtils = new BitmapUtils(context, cachePath);
		// globalConfig = BitmapGlobalConfig.getInstance(context, cachePath);
		bitmapUtils.configMemoryCacheEnabled(true);
		bitmapUtils.configDiskCacheEnabled(true);
		bitmapUtils.configDefaultLoadingImage(R.drawable.cache);// 默认背景图片
		bitmapUtils.configDefaultLoadFailedImage(R.drawable.cache);// 加载失败图片
		bitmapUtils.configDefaultBitmapConfig(Bitmap.Config.RGB_565);// 设置图片压缩类型

		dbUtils = DbUtils.create(context, DB_NAME, DB_VERSION,
				new DbUpgradeListener() {
					@Override
					public void onUpgrade(DbUtils db, int oldVersion,
							int newVersion) {

					}
				});

		dbUtils.configDebug(true);
	}

	/**
	 * 设置默认图片
	 * 
	 * @param isRect
	 *            :是否是长方形
	 */
	public static void setDefaultImage(boolean isRect) {
		if (isRect) {
			bitmapUtils.configDefaultLoadingImage(R.drawable.cache_rectangle);// 默认背景图片
			bitmapUtils
					.configDefaultLoadFailedImage(R.drawable.cache_rectangle);// 加载失败图片
		} else {
			bitmapUtils.configDefaultLoadingImage(R.drawable.cache);// 默认背景图片
			bitmapUtils.configDefaultLoadFailedImage(R.drawable.cache);// 加载失败图片
		}
	}

}
