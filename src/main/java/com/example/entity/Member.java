package com.example.entity;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "tbl_member")
public class Member {
    private static final long serialVersionUID = 1L;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "uid")
    public Collection<VROrderVip> vrOrderVips;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.id
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.account
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    @Column(name = "account", unique = false, nullable = false)
    private String account;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.password
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String password;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.tel
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String tel;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.zone
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String zone;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.login_id
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */


    @Column(name = "login_id")
    private String loginId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.email
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String email;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.face
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String face;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.nickname
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String nickname;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.sex
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Integer sex;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.age
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String age;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.name
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.idcard
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String idcard;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.signature
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String signature;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.grade
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Integer grade;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.ban
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Integer ban;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.hxaccount
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String hxaccount;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.hxpsw
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String hxpsw;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.sendmessage
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Integer sendmessage;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.tdmessagetime
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private String tdmessagetime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.mold
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Integer mold;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.lastlogintime
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Date lastlogintime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_member.reigsttime
     *
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    private Date reigsttime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.id
     *
     * @return the value of tbl_member.id
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.id
     *
     * @param id the value for tbl_member.id
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.account
     *
     * @return the value of tbl_member.account
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.account
     *
     * @param account the value for tbl_member.account
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.password
     *
     * @return the value of tbl_member.password
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.password
     *
     * @param password the value for tbl_member.password
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.tel
     *
     * @return the value of tbl_member.tel
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.tel
     *
     * @param tel the value for tbl_member.tel
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.zone
     *
     * @return the value of tbl_member.zone
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getZone() {
        return zone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.zone
     *
     * @param zone the value for tbl_member.zone
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.login_id
     *
     * @return the value of tbl_member.login_id
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.login_id
     *
     * @param loginId the value for tbl_member.login_id
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.email
     *
     * @return the value of tbl_member.email
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.email
     *
     * @param email the value for tbl_member.email
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.face
     *
     * @return the value of tbl_member.face
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getFace() {
        return face;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.face
     *
     * @param face the value for tbl_member.face
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.nickname
     *
     * @return the value of tbl_member.nickname
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.nickname
     *
     * @param nickname the value for tbl_member.nickname
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.sex
     *
     * @return the value of tbl_member.sex
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.sex
     *
     * @param sex the value for tbl_member.sex
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.age
     *
     * @return the value of tbl_member.age
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.age
     *
     * @param age the value for tbl_member.age
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.name
     *
     * @return the value of tbl_member.name
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.name
     *
     * @param name the value for tbl_member.name
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.idcard
     *
     * @return the value of tbl_member.idcard
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.idcard
     *
     * @param idcard the value for tbl_member.idcard
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.signature
     *
     * @return the value of tbl_member.signature
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.signature
     *
     * @param signature the value for tbl_member.signature
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.grade
     *
     * @return the value of tbl_member.grade
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.grade
     *
     * @param grade the value for tbl_member.grade
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.ban
     *
     * @return the value of tbl_member.ban
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getBan() {
        return ban;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.ban
     *
     * @param ban the value for tbl_member.ban
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setBan(Integer ban) {
        this.ban = ban;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.hxaccount
     *
     * @return the value of tbl_member.hxaccount
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getHxaccount() {
        return hxaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.hxaccount
     *
     * @param hxaccount the value for tbl_member.hxaccount
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setHxaccount(String hxaccount) {
        this.hxaccount = hxaccount == null ? null : hxaccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.hxpsw
     *
     * @return the value of tbl_member.hxpsw
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getHxpsw() {
        return hxpsw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.hxpsw
     *
     * @param hxpsw the value for tbl_member.hxpsw
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setHxpsw(String hxpsw) {
        this.hxpsw = hxpsw == null ? null : hxpsw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.sendmessage
     *
     * @return the value of tbl_member.sendmessage
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getSendmessage() {
        return sendmessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.sendmessage
     *
     * @param sendmessage the value for tbl_member.sendmessage
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setSendmessage(Integer sendmessage) {
        this.sendmessage = sendmessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.tdmessagetime
     *
     * @return the value of tbl_member.tdmessagetime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public String getTdmessagetime() {
        return tdmessagetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.tdmessagetime
     *
     * @param tdmessagetime the value for tbl_member.tdmessagetime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setTdmessagetime(String tdmessagetime) {
        this.tdmessagetime = tdmessagetime == null ? null : tdmessagetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.mold
     *
     * @return the value of tbl_member.mold
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Integer getMold() {
        return mold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.mold
     *
     * @param mold the value for tbl_member.mold
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setMold(Integer mold) {
        this.mold = mold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.lastlogintime
     *
     * @return the value of tbl_member.lastlogintime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.lastlogintime
     *
     * @param lastlogintime the value for tbl_member.lastlogintime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_member.reigsttime
     *
     * @return the value of tbl_member.reigsttime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public Date getReigsttime() {
        return reigsttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_member.reigsttime
     *
     * @param reigsttime the value for tbl_member.reigsttime
     * @mbggenerated Fri Aug 26 11:37:05 CST 2016
     */
    public void setReigsttime(Date reigsttime) {
        this.reigsttime = reigsttime;
    }

    public Collection<VROrderVip> getVrOrderVips() {
        return vrOrderVips;
    }

    public void setVrOrderVips(Collection<VROrderVip> vrOrderVips) {
        this.vrOrderVips = vrOrderVips;
    }

}
