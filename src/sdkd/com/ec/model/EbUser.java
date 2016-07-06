package sdkd.com.ec.model;

/**
 * 用户表
 * Created by 王晓敏 on 2016/7/5.
 */
public class EbUser {

    private Integer euUserId;
    private String euUserName;
    private String euPassword;
    private String euSex;
    private String euBirthday;
    private String euIdentityCode;
    private String euEmail;
    private Integer euMobile;
    private String euAddress;
    private int euStatus;

    public Integer getEuUserId() {
        return euUserId;
    }

    public void setEuUserId(Integer euUserId) {
        this.euUserId = euUserId;
    }

    public String getEuUserName() {
        return euUserName;
    }

    public void setEuUserName(String euUserName) {
        this.euUserName = euUserName;
    }

    public String getEuPassword() {
        return euPassword;
    }

    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword;
    }

    public String getEuSex() {
        return euSex;
    }

    public void setEuSex(String euSex) {
        this.euSex = euSex;
    }

    public String getEuBirthday() {
        return euBirthday;
    }

    public void setEuBirthday(String euBirthday) {
        this.euBirthday = euBirthday;
    }

    public String getEuIdentityCode() {
        return euIdentityCode;
    }

    public void setEuIdentityCode(String euIdentityCode) {
        this.euIdentityCode = euIdentityCode;
    }

    public String getEuEmail() {
        return euEmail;
    }

    public void setEuEmail(String euEmail) {
        this.euEmail = euEmail;
    }

    public Integer getEuMobile() {
        return euMobile;
    }

    public void setEuMobile(Integer euMobile) {
        this.euMobile = euMobile;
    }

    public String getEuAddress() {
        return euAddress;
    }

    public void setEuAddress(String euAddress) {
        this.euAddress = euAddress;
    }

    public int getEuStatus() {
        return euStatus;
    }

    public void setEuStatus(int euStatus) {
        this.euStatus = euStatus;
    }
}
