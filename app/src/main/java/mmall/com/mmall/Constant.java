package mmall.com.mmall;


public class Constant {

	public static final String MCONTENT = "mContent";

	// QQ app Id for test.RD482f4q483Kn39q
	public static final String QQ_APP_ID = "1103514317";// "222222";

	// // 应用的APP_KEY
	public static final String SINA_APP_KEY = "3520700794";// "1113204708";

	// 应用的回调页，应该和微博页注册的一致
	public static final String REDIRECT_URL = "http://www.woyo.li/weibo/callback";

	// 应用申请的高级权限
	public static final String SCOPE = "email,direct_messages_read,direct_messages_write,"
			+ "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
			+ "follow_app_official_microblog," + "invitation_write";

	// login type
	public static final String LOGIN_TYPE = "login_type";
	public static final String QQ_LOGIN = "QQ";
	public static final String WEIBO_LOGIN = "Weibo";
	// 修改绑定手机号
	public static final String BIND_PHONE = "bindphone";

	public static final String QQ_OPENID = "qq_openid";
	public static final String QQ_TOKEN = "qq_token";

	public static final String WEIBO_UUID = "weibo_uuid";
	public static final String WEIBO_TOKEN = "weibo_token";

	// api response errror code
	public static final String TOKEN_ERROR = "-1";

	public static final String ERROR = "0";
	public static final String SUCCESS = "1";
	public static final String UNBINDING_USER_ERROR = "2";

	// 修改头像打开窗体类型(用户信息打开窗体)

	// 取消
	public static final int HEAD_MENUORCANCEL = 0;

	// 拍照
	public static final int HEAD_TAKE_PHOTO = 1;

	// 从相册中选取
	public static final int HEAD_PICK_PHOTO = 2;

	public static final String IMAGE_CACHE_PATH = "imagecaches";

	public static final String DEBUG_TAG = "Woyoli";

	// 修改昵称
	public static final int USER_ACTIVITY_NICK = 3;

	// 修改密码
	public static final int USER_ACTIVITY_PASSWORD = 4;

	// 修改绑定手机号
	public static final int USER_ACTIVITY_BIND_PHONE = 5;

	// 修改绑定邮箱
	public static final int USER_ACTIVITY_BIND_EMAIL = 6;

	// 头像裁剪
	public static final int USER_ACTIVITY_CROP = 7;

	// LOGIN
	public static final int USER_ACTIVITY_LOGIN = 8;

	// 退出后打开登录页面
	public static final int USER_ACTIVITY_LOGIN_WITH_EXIST = 9;

	// 添加好友画面
	public static final int FRIENDS_ACTIVITY_ADD = 101;

	// 好友详情
	public static final int FRIENDS_ACTIVITY_INFO = 102;

	// 注册
	public static final int REGISTER_ACTIVITY = 900;

	// 使用礼物
	public static final int USING_GIFT_ACTIVITY = 800;

	// 退出（表示登录画面打开是从退出按钮、初次登录还是修改信息登录）
	public static final String LOGOUT_OR_FIRST_LOGIN = "LogoutOrFirstLogin";

	// 排序方式是按离我最近排序
	public static final String SORT_WITH_DISTANCE = "distance";

	// 分享的内容
	public static final String SHARE_CONTENT = "ShareContent";

	public static final String LABEL_POSTER_HOT = "h";
	public static final String LABEL_POSTER_NEW_STRING = "n";

	// 使用或赠送礼物结果
	public static final String USE_GIVE_GIFT_RESULT = "UseGiveResult";
	public static final String USE_GIVE_GIFT_SUCCESS = "UseGiveSuccess";
	public static final String USE_GIVE_GIFT_FAILED = "UseGiveFailed";

	// 传递打开URL的参数KEY
	public static final String LOAD_URL_KEY = "LoadUrlKey";
	// 加载URL的类型
	public static final String LOAD_URL_TYPE = "LoadUrlType";
	// 意见反馈
	public static final String LOAD_FEEDBACK = "LoadFeedback";
	// 购买流程
	public static final String LOAD_BUY_FLOW = "LoadBuyFlow";
	// 使用说明
	public static final String LOAD_INTRODUCTION = "LoadIntroduction";
	// 关注我有礼
	public static final String LOAD_FOLLOW = "LoadFollow";
	// 联系我们
	public static final String LOAD_CONTACT_US = "LoadContactUs";
	// 版本更新
	public static final String LOAD_VERSION = "LoadVersion";

	// 收礼人是微信好友的时候，UID为“0”
	public static final String GIVEN_UID_WECHAT = "0";
	
	// 需要发票
	public static final String NEED_BILL = "1";
	
	public static final String IS_CHOOSE_FRIENDS="IsChooseFriend";
	
	/** 下订单的时候选择好友类型还是转赠礼物的时候选择好友类型：0表下单，1表转赠 */
	public static final String INDENT_GIVEN_CHOOSE_FRIEND="IndentGivenChooseFriend";
	public static final int CHOOSE_FRIEND_INDENT = 0;
	public static final int CHOOSE_FRIEND_GIVEN = 1;
	
	/**
	 * 我有礼好友
	 */
	public static final int FRIEND_WOYOLI = 0;
	
	/**
	 * 微信好友
	 */
	public static final int FRIEND_WECHAT = 1;
}
