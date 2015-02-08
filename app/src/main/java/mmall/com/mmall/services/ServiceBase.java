package mmall.com.mmall.services;

import java.io.IOException;

import android.util.Log;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseStream;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
import mmall.com.mmall.ApiUrl;
import mmall.com.mmall.Constant;
import mmall.com.mmall.JsonHelper;
import mmall.com.mmall.MmallApp;
import mmall.com.mmall.models.ApiResult;
import mmall.com.mmall.models.ResponseStatus;

public abstract class ServiceBase{
	
	private HttpUtils httpClient;
	
	protected DbUtils getDbUtils(){
		return MmallApp.getDbUtils();
	}
	
	protected HttpUtils getHttpClient(){
		if(httpClient==null){
			httpClient = new HttpUtils();	
		}
		
		return httpClient;
	}
	
	protected  <T> T execute(HttpMethod method, String url, RequestParams params, Class<T> type) throws HttpException, IOException{
		String apiUrl = ApiUrl.API_DOMAIN + url;	
		ResponseStream stream = getHttpClient().sendSync(method, apiUrl, params);
		String content = stream.readString();	
		Log.d(Constant.DEBUG_TAG, content);
		ApiResult result = JsonHelper.convert(content, ApiResult.class);
		if(ResponseStatus.SUCCESS.equals(result.getStatus())){
			return JsonHelper.convert(result.getData().toString(), type);
		}else{
			
			throw new HttpException(result.getMessage());
		}
	}
		
	protected  String execute(HttpMethod method, String url, RequestParams params) throws HttpException, IOException{
		String apiUrl = ApiUrl.API_DOMAIN + url;
		ResponseStream stream = getHttpClient().sendSync(method, apiUrl, params);
		String content = stream.readString();
		Log.d(Constant.DEBUG_TAG, content);
		return content;
	}
	
	protected  <T> T executeWholeUrl(HttpMethod method, String url, RequestParams params, Class<T> type) throws HttpException, IOException{
		ResponseStream stream = getHttpClient().sendSync(method, url, params);
		String content = stream.readString();	
		Log.d(Constant.DEBUG_TAG, content);
		ApiResult result = JsonHelper.convert(content, ApiResult.class);
		if(ResponseStatus.SUCCESS.equals(result.getStatus())){
			return JsonHelper.convert(result.getData().toString(), type);
		}else{
			
			throw new HttpException(result.getMessage());
		}
	}
	
	protected  String executeWholeUrl(HttpMethod method, String url, RequestParams params) throws HttpException, IOException{
		ResponseStream stream = getHttpClient().sendSync(method, url, params);
		String content = stream.readString();
		Log.d(Constant.DEBUG_TAG, content);
		return content;
	}
	
}
