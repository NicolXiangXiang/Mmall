package mmall.com.mmall.models;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
public class ProductModel {
    private String title;
    private String subTitle;
    private String discountPrice;
    private String price;
    private String thumbUrl;

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String getSubTitle(){return subTitle;}
    public void  setSubTitle(String subTitle){this.subTitle=subTitle;}

    public String getDiscountPrice(){return discountPrice;}
    public void setDiscountPrice(String discountPrice){this.discountPrice=discountPrice;}

    public String getPrice(){return price;}
    public void setPrice(String price){this.price=price;}

    public String getThumbUrl(){return this.thumbUrl;}
    public void setThumbUrl(String thumbUrl){this.thumbUrl=thumbUrl;}
}
