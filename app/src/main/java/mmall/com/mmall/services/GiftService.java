package mmall.com.mmall.services;

import java.io.IOException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
import mmall.com.mmall.ApiUrl;
import mmall.com.mmall.Constant;
import mmall.com.mmall.JsonHelper;
import mmall.com.mmall.models.ApiListResponse;
import mmall.com.mmall.models.ApiResponse;
import mmall.com.mmall.models.ApiResult;
//import mmall.com.mmall.models.Gift;
//import mmall.com.mmall.models.GiftDetail;
//import mmall.com.mmall.models.Member;
//import mmall.com.mmall.models.MyGift;

public class GiftService extends ServiceBase {

//	/**
//	 * 首页
//	 *
//	 * @return
//	 */
//	public ApiListResponse<Gift> home() {
//		RequestParams params = new RequestParams();
//		ApiListResponse<Gift> result = null;
//		try {
//			Member member = (new MemberService()).getLoginUser();
//			if (member != null) {
//				params.addBodyParameter("uid", member.getUid());
//				params.addBodyParameter("token", member.getToken());
//			}
//			String content = execute(HttpMethod.GET, ApiUrl.HOME, params);
//			result = JsonHelper.convert(content,
//					new TypeReference<ApiListResponse<Gift>>() {
//					});
//
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return result;
//
//	}
//
//	/**
//	 * 获取礼物详情
//	 * @param gift_id
//	 * @return
//	 */
//	public ApiResponse<GiftDetail> detail(String gift_id) {
//		RequestParams params = new RequestParams();
//		params.addBodyParameter("gift_id", gift_id);
//
//		ApiResponse<GiftDetail> result = null;
//		try {
//			Member member = (new MemberService()).getLoginUser();
//			if (member != null) {
//				params.addBodyParameter("uid", member.getUid());
//				params.addBodyParameter("token", member.getToken());
//			}
//			String content = execute(HttpMethod.POST, ApiUrl.GIFT_DETAIL,
//					params);
//			result = JsonHelper.convert(content,
//					new TypeReference<ApiResponse<GiftDetail>>() {
//					});
//
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return result;
//
//	}
//
//	public ApiResult getGiftList(String cbd, String tag, String order_by,
//			String lat, String lng, int page) {
//		ApiResult result = null;
//		try {
//			Member member = new MemberService().getLoginUser();
//			RequestParams params = new RequestParams();
//			params.addBodyParameter("cbd", cbd);
//			params.addBodyParameter("tag", tag);
//			params.addBodyParameter("order_by", order_by);
//			// 离我最近时传递经纬度
//			if (Constant.SORT_WITH_DISTANCE.equals(order_by)) {
//				params.addBodyParameter("lat", lat);
//				params.addBodyParameter("lng", lng);
//			}
//			params.addBodyParameter("page", String.valueOf(page));
//			if (member != null) {
//				params.addBodyParameter("uid", member.getUid());
//				params.addBodyParameter("token", member.getToken());
//			}
//			String content = execute(HttpMethod.POST, ApiUrl.GIFT_LIST, params);
//			result = JsonHelper.convert(content,
//					new TypeReference<ApiResult>() {
//					});
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//	/**
//	 * 获取我收到的所有礼物、未使用的礼物、已使用的礼物
//	 * @param page 页数
//	 * @param type 类型（0：全部， 1：未使用， 2：已使用， 3：可转赠）
//	 * @return
//	 */
//	public ApiListResponse<MyGift> getMyGift(int page, int type) {
//		ApiListResponse<MyGift> result = null;
//		try {
//			Member member = new MemberService().getLoginUser();
//			RequestParams params = new RequestParams();
//			params.addBodyParameter("page", String.valueOf(page));
//			if (member != null) {
//				params.addBodyParameter("uid", member.getUid());
//				params.addBodyParameter("token", member.getToken());
//			}
//			String content = null;
//			switch (type) {
//			case 0:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_ALL_LIST,
//						params);
//				break;
//
//			case 1:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_UNUSED_LIST,
//						params);
//				break;
//
//			case 2:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_USED_LIST,
//						params);
//				break;
//
//			case 3:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_ALL_LIST,
//						params);
//				break;
//
//			img_default:
//				break;
//			}
//			result = JsonHelper.convert(content,
//					new TypeReference<ApiListResponse<MyGift>>() {
//					});
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//	/**
//	 *
//	 * 转赠礼物
//	 * @param order_id 订单号
//	 * @param to_uid 收礼人ＩＤ
//	 * @param friendType 好友类型：0我有礼好友，1表微信好友
//	 */
//	public ApiResult givenGift(String order_id, String to_uid, int friendType) {
//		ApiResult result = null;
//		try {
//			Member member = new MemberService().getLoginUser();
//			RequestParams params = new RequestParams();
//			if (member != null) {
//				params.addBodyParameter("uid", member.getUid());
//				params.addBodyParameter("token", member.getToken());
//			}
//			params.addBodyParameter("order_id", order_id);
//			params.addBodyParameter("to_uid", to_uid);
//
//			String content = null;
//			switch (friendType) {
//			case 0:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_GIVEN_WOYOLI, params);
//				break;
//			case 1:
//				content = execute(HttpMethod.POST, ApiUrl.MY_GIFT_GIVEN_WECHAT, params);
//				break;
//
//			img_default:
//				break;
//			}
//			result = JsonHelper.convert(content,
//					new TypeReference<ApiResult>() {
//					});
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
}
