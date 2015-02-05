package mmall.com.mmall;

public class ApiUrl {
	
	/*
	 * API域名
	 */
	public static final String API_DOMAIN = "http://v1.api.woyo.li/";

	/*
	 * 会员登录
	 */
	public static final String MEMBER_SIGN_IN = "members/signin";
	
	/*
	 * 会员注册
	 */
	public static final String MEMBER_SIGN_UP = "members/signup";
	
	/*
	 * 获取验证码
	 */
	public static final String MEMBER_SMS_VERIFY = "members/sms_verify";
	
	/*
	 * 丢失密码
	 */
	public static final String MEMBER_LOST_PASSWORD = "members/lostpass";
	
	/**
	 * 丢失密码验证后修改密码
	 */
	public static final String MEMBER_LOST_PASSWORD_UPDATE = "members/lostpass_update";	
	
	/**
	 * 更新用户名
	 */
	public static final String MEMBER_UPDATE_USERNAME = "members/update_username";
	
	/**
	 * 修改密码
	 */
	public static final String MEMBER_UPDATE_PASSWORD = "members/update_password";
	
	/**
	 * 修改性别
	 */
	public static final String MEMBER_UPDATE_GENDER = "members/update_gender";
	
	/**
	 * 修改生日
	 */
	public static final String MEMBER_UPDATE_BIRTH = "members/update_birth";
	
	/*
	 * QQ登录
	 */
	public static final String QQ_LOGIN = "qq/login";
	
	/*
	 * QQ第一次登录
	 */
	public static final String QQ_FIRST_LOGIN = "qq/qq_first_login";
	
	/**
	 * 微博登录
	 */
	public static final String WEIBO_LOGIN = "weibo/login";
	
	/**
	 * 微博第一次登录
	 */
	public static final String WEIBO_FIRST_LOGIN = "weibo/weibo_first_login";
	
	/**
	 * 首页
	 */
	public static final String HOME = "home";
	
	/**
	 * 礼物详细
	 */
	public static final String GIFT_DETAIL = "gift/detail";
	
	/**
	 * 修改昵称
	 */
	public static final String UPDATE_NICK="members/update_username";
	
	/**
	 * 修改性别
	 */
	public static final String UPDATE_GENDER="members/update_gender";
	
	/**
	 * 修改生日
	 */
	public static final String UPDATE_BIRTH="members/update_birth";
	
	/**
	 * 修改密码
	 */
	public static final String UPDATE_PASSWORD="members/update_password";
	
	/**
	 * 发送修改 Email 或者手机的时候的验证码
	 */
	public static final String UPDATE_VERIFY_SEND="members/update_verify_send";
	
	/**
	 * 修改手机
	 */
	public static final String UPDATE_PHONE="members/update_phone";
	
	/**
	 * 修改邮箱
	 */
	public static final String UPDATE_EMAIL="members/update_email";
	
	/**
	 * 上传头像
	 */
	public static final String UPDATE_AVATAR="members/update_avatar";
	
	/**
	 * 添加收藏
	 */
	public static final String ADD_GIFT_FAVORITES = "fav/gift_add";
	
	/**
	 * 删除礼物收藏
	 */
	public static final String REMOVE_GIFT_FAVORITES="fav/gift_remove";
	
	/**
	 * 添加商家收藏
	 */
	public static final String ADD_STORE_FAVORITES = "fav/store_add";
	
	/**
	 * 删除商家收藏
	 */
	public static final String REMOVE_STORE_FAVORITES="fav/store_remove";
	
	/**
	 * 好友列表
	 */
	public static final String FRIENDS_LIST = "my/friends";
	
	/**
	 * 搜索用户
	 */
	public static final String SEARCH_FRIENDS = "my/search_friends";
	
	/**
	 * 添加好友
	 */
	public static final String ADD_FRIENDS = "my/add_friends";
	
	/**
	 * 删除好友
	 */
	public static final String REMOVE_FRIENDS = "my/remove_friends";
	
	
	/**
	 * 退出
	 */
	public static final String LOGOUT = "members/logout";
	
	/**
	 * 商户列表、选礼店，在ＡＰＩ中又叫做商家收藏列表，描述的都是同一个东西
	 */
	public static final String STORE_LIST = "store/";
	
	/**
	 * 商家详情
	 */
	public static final String STORE_DETAIL = "store/detail/";
	
	/**
	 * 获取收藏的礼物
	 */
	public static final String FAVORITE_GIFT = "fav/gift";
	
	/**
	 * 获取收藏的商家
	 */
	public static final String FAVORITE_STORE = "fav/store";
	
	/**
	 * 获取我收藏的礼物
	 */
	public static final String MY_FAVORITE_GIFT = "my/fav_gift";
	
	/**
	 * 获取我收藏的商家
	 */
	public static final String MY_FAVORITE_STORE = "my/fav_store";
	
	/**
	 * 获取礼物列表
	 */
	public static final String GIFT_LIST="gift";
	
	/**
	 * 获取我收到的所有礼物
	 */
	public static final String MY_GIFT_ALL_LIST="my/gift";
	
	/**
	 * 获取我收到的所有的尚未使用的礼物
	 */
	public static final String MY_GIFT_UNUSED_LIST="my/gift_unused";
	
	/**
	 * 获取我收到的所有的已经使用的礼物
	 */
	public static final String MY_GIFT_USED_LIST="my/gift_used";
	
	/**
	 * 获取我的全部订单
	 */
	public static final String MY_INDENT_ALL_LIST="my/orders";
	
	/**
	 * 获取我的未支付订单
	 */
	public static final String MY_INDENT_UNPAID_LIST="my/orders_unpaid";
	
	/**
	 * 获取我的已支付订单
	 */
	public static final String MY_INDENT_PAID_LIST="my/orders_paid";
	
	/**
	 * 下单
	 */
	public static final String MY_NEW_ORDER = "my/new_order";
	
	/**
	 * 更多
	 */
	public static final String APP_MORE = "m/more";
	
	/**
	 * 转赠礼物给我有礼好友
	 */
	public static final String MY_GIFT_GIVEN_WOYOLI = "my/gift_given";
	
	/**
	 * 转赠礼物给微信好友
	 */
	public static final String MY_GIFT_GIVEN_WECHAT = "my/wx_share/";
	
	public static final String ORDER_DETAIL="my/order_detail";
}
