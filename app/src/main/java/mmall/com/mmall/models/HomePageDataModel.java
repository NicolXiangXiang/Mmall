package mmall.com.mmall.models;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
public class HomePageDataModel {
    private List<ActivitiesModel> activities;
    private List<ProductModel> recomms;
    private List<ProductModel> discounts;
    private List<ProductModel> hots;

    public List<ActivitiesModel> getActivities(){return activities==null?new ArrayList<ActivitiesModel>():activities;}
    public void setActivities(List<ActivitiesModel> activities){this.activities=activities;}

    public List<ProductModel> getRecomms(){return recomms==null?new ArrayList<ProductModel>():recomms;}
    public void setRecomms(List<ProductModel> recomms){this.recomms=recomms;}

    public List<ProductModel> getDiscounts(){return discounts==null?new ArrayList<ProductModel>():discounts;}
    public void setDiscounts(List<ProductModel> discounts){this.discounts=discounts;}

    public List<ProductModel> getHots(){return hots==null?new ArrayList<ProductModel>():hots;}
    public void setHots(List<ProductModel> hots){this.hots=hots;}
}
