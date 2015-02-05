package mmall.com.mmall.models;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
public class HomePageDataModel {
    private List<ActivitiesModel> activities;
    private List<ProductModel> recommends;

    public List<ActivitiesModel> getActivities(){return activities==null?new ArrayList<ActivitiesModel>():activities;}
    public void setActivities(List<ActivitiesModel> activities){this.activities=activities;}

    public List<ProductModel> getRecommends(){return recommends==null?new ArrayList<ProductModel>():recommends;}
    public void setRecommends(List<ProductModel> recommends){this.recommends=recommends;}
}
