package com.rzj.rxmvp.bean;


/**
 * 登录数据Bean
 */
public class LogonBean {


    /**
     * u_id : 1
     * nickname : 会员123456
     * user_name : 18666666666
     * avatar : XXX.png
     * passport_num : 16504539
     * real_name : 张三
     * gender : 男
     * id_number : 4105******5862
     * expire_time : 2018-05-16
     * type_name : 豪华版会员
     * passport_status : 2
     * score : 500
     * notice : 2019-05-05 过期
     * is_expired : 0
     */

    private int u_id;
    private String nickname;
    private String user_name;
    private String avatar;
    private String passport_num;
    private String real_name;
    private String gender;
    private String id_number;
    private String expire_time;
    private String type_name;
    private int passport_status;
    private int score;
    private String notice;
    private int is_expired;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassport_num() {
        return passport_num;
    }

    public void setPassport_num(String passport_num) {
        this.passport_num = passport_num;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getPassport_status() {
        return passport_status;
    }

    public void setPassport_status(int passport_status) {
        this.passport_status = passport_status;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getIs_expired() {
        return is_expired;
    }

    public void setIs_expired(int is_expired) {
        this.is_expired = is_expired;
    }
}
