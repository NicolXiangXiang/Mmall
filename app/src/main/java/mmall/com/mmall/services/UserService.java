package mmall.com.mmall.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lidroid.xutils.exception.DbException;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;

import org.json.JSONObject;

import java.io.IOException;

import mmall.com.mmall.ApiUrl;
import mmall.com.mmall.JsonHelper;
import mmall.com.mmall.models.HomePageDataModel;
import mmall.com.mmall.models.UserModel;

/**
 * Created by nicol.xiang on 2015/2/12.
 */
public class UserService extends  ServiceBase {

    public UserModel signUp(String email,String password){
        UserModel user=null;
        RequestParams params = new RequestParams();
        try {
            params.addBodyParameter("email", email);
            params.addBodyParameter("password", password);
            user= execute(HttpRequest.HttpMethod.POST, ApiUrl.USER_REGISTRATION, params, UserModel.class);
            if(user!=null) {
                getDbUtils().deleteAll(UserModel.class);
                getDbUtils().save(user);
            };
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(DbException e){
            e.printStackTrace();
        }
        return user;
    }

    public UserModel signIn(String email,String password){
        UserModel user=null;
        RequestParams params = new RequestParams();
        try {
                params.addBodyParameter("email", email);
                params.addBodyParameter("password", password);
            user= execute(HttpRequest.HttpMethod.POST, ApiUrl.USER_LOGIN, params, UserModel.class);
            if(user!=null) {
                getDbUtils().deleteAll(UserModel.class);
                getDbUtils().save(user);
            };
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(DbException e){
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 获取登录用户信息，可用于判断是否登录
     * @return
     */
    public UserModel getSignInUser(){
        UserModel user=null;
        try {
            user=getDbUtils().findFirst(UserModel.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return user;
    }
}
