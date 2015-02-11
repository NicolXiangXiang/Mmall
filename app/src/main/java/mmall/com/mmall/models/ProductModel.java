package mmall.com.mmall.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nicol.xiang on 2015/2/3.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductModel {
//    "iimg2": "p220150104-232557.jpg",
//            "ppprice": 280,
//            "pmprice": 218,
//            "pname": "衬衫",
//            "proid": 77,
//            "pmodel": "WL",
//            "iimg1": "p1_102_20150104-232557.jpg"

    private String proid;
    private String pname;
    private String pcaption;
    private String pmprice;
    private String ppprice;
    private String iimg1;
    private String iimg2;

    public String getProid(){return proid;}
    public void setProid(String proid){this.proid=proid;}

    public String getPname(){return pname;}
    public void setPname(String pname){this.pname=pname;}

    public String getPcaption(){return pcaption;}
    public void  setPcaption(String subTitle){this.pcaption=subTitle;}

    public String getPmprice(){return pmprice;}
    public void setPmprice(String discountPrice){this.pmprice=pmprice;}

    public String getPpprice(){return ppprice;}
    public void setPpprice(String ppprice){this.ppprice=ppprice;}

    public String getIimg1(){return this.iimg1;}
    public void setIimg1(String iimg1){this.iimg1=iimg1;}

    public String getIimg2(){return this.iimg2;}
    public void setIimg2(String iimg2){this.iimg2=iimg2;}
}
