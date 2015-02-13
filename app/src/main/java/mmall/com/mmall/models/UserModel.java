package mmall.com.mmall.models;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Created by nicol.xiang on 2015/2/12.
 */
@Table(name = "Users")
public class UserModel {

    @Column(column = "id")
    private String id;

    @Column(column = "email")
    private String email;

    @Column(column = "userName")
    private String userName;

    @Column(column = "passwd")
    private String passwd;

    @Column(column = "selfno")
    private String selfno;

    @Column(column = "level")
    private String level;

    @Column(column = "loginip")
    private String loginip;

    @Column(column = "lastTime")
    private String lastTime;

    @Column(column = "status")
    private String status;

    @Column(column = "vfyDate")
    private String vfyDate;

    @Column(column = "regDate")
    private String regDate;

    @Column(column = "reset_token")
    private String reset_token;

    public String getId(){return this.id;}
    public void setId(String id){this.id=id;}

    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email=email;}

    public String getUserName(){return this.userName;}
    public void  setUserName(String userName){this.userName=userName;}

    public String getPasswd(){return this.passwd;}
    public void setPasswd(String passwd){this.passwd=passwd;}

    public String getSelfno(){return  this.selfno;}
    public void  setSelfno(String selfno){this.selfno=selfno;}

    public String getLevel(){return this.level;}
    public void setLevel(String level){this.level=level;}

    public String getLoginip(){return this.loginip;}
    public void setLoginip(String loginip){this.loginip=loginip;}

    public String getLastTime(){return this.lastTime;}
    public void setLastTime(String lastTime){this.lastTime=lastTime;}

    public String getStatus(){return this.status;}
    public void setStatus(String status){this.status=status;}

    public String getVfyDate(){return  this.vfyDate;}
    public void setVfyDate(String vfyDate){this.vfyDate=vfyDate;}

    public String getRegDate(){return this.regDate;}
    public void setRegDate(String regDate){this.regDate=regDate;}

    public String getReset_token(){return this.reset_token;}
    public void setReset_token(String reset_token){this.reset_token=reset_token;}

}
