package mmall.com.mmall.services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;


import java.io.IOException;

import mmall.com.mmall.ApiUrl;
import mmall.com.mmall.JsonHelper;
import mmall.com.mmall.models.ApiListResponse;
import mmall.com.mmall.models.HomePageDataModel;
import mmall.com.mmall.models.ProductModel;

/**
 * Created by nicol.xiang on 2015/2/11.
 */
public class ProductService extends ServiceBase {
    public HomePageDataModel GetHomePageProducts() {

        RequestParams params = new RequestParams();
        HomePageDataModel result = null;
        try {
//            Member member = (new MemberService()).getLoginUser();
//            if (member != null) {
//                params.addBodyParameter("uid", member.getUid());
//                params.addBodyParameter("token", member.getToken());
//            }
            String content = execute(HttpRequest.HttpMethod.GET, ApiUrl.HOMEPAGE_PRODUCT, null);
            result = JsonHelper.convert(content,
                    new TypeReference<HomePageDataModel>() {
                    });
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }
}
