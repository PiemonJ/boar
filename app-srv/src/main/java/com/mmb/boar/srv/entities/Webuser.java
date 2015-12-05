package com.mmb.boar.srv.entities;

import java.util.Date;

public class Webuser {
    private Integer id;

    private String username;

    private String passworld;

    private String rename;

    private String sex;

    private String idcard;

    private String usertel;

    private String safeid;

    private String question;

    private String answer;

    private String email;

    private String ismail;

    private String extend;

    private Date regtime;

    private Date lasttime;

    private String regip;

    private String lastip;

    private String nickname;

    private Integer isvip;

    private Integer maopoint;

    private Integer maodou;

    private Integer cropoint;

    private Integer glorypoint;

    private Integer crogame;

    private String croserver;

    private Integer isgame;

    private Integer isadmin;

    private Integer servicegood;

    private Integer changevip;

    private String cardcode;

    public Webuser(Integer id, String username, String passworld, String rename, String sex, String idcard, String usertel, String safeid, String question, String answer, String email, String ismail, String extend, Date regtime, Date lasttime, String regip, String lastip, String nickname, Integer isvip, Integer maopoint, Integer maodou, Integer cropoint, Integer glorypoint, Integer crogame, String croserver, Integer isgame, Integer isadmin, Integer servicegood, Integer changevip, String cardcode) {
        this.id = id;
        this.username = username;
        this.passworld = passworld;
        this.rename = rename;
        this.sex = sex;
        this.idcard = idcard;
        this.usertel = usertel;
        this.safeid = safeid;
        this.question = question;
        this.answer = answer;
        this.email = email;
        this.ismail = ismail;
        this.extend = extend;
        this.regtime = regtime;
        this.lasttime = lasttime;
        this.regip = regip;
        this.lastip = lastip;
        this.nickname = nickname;
        this.isvip = isvip;
        this.maopoint = maopoint;
        this.maodou = maodou;
        this.cropoint = cropoint;
        this.glorypoint = glorypoint;
        this.crogame = crogame;
        this.croserver = croserver;
        this.isgame = isgame;
        this.isadmin = isadmin;
        this.servicegood = servicegood;
        this.changevip = changevip;
        this.cardcode = cardcode;
    }

    public Webuser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld == null ? null : passworld.trim();
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename == null ? null : rename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getSafeid() {
        return safeid;
    }

    public void setSafeid(String safeid) {
        this.safeid = safeid == null ? null : safeid.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIsmail() {
        return ismail;
    }

    public void setIsmail(String ismail) {
        this.ismail = ismail == null ? null : ismail.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip == null ? null : lastip.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public Integer getMaopoint() {
        return maopoint;
    }

    public void setMaopoint(Integer maopoint) {
        this.maopoint = maopoint;
    }

    public Integer getMaodou() {
        return maodou;
    }

    public void setMaodou(Integer maodou) {
        this.maodou = maodou;
    }

    public Integer getCropoint() {
        return cropoint;
    }

    public void setCropoint(Integer cropoint) {
        this.cropoint = cropoint;
    }

    public Integer getGlorypoint() {
        return glorypoint;
    }

    public void setGlorypoint(Integer glorypoint) {
        this.glorypoint = glorypoint;
    }

    public Integer getCrogame() {
        return crogame;
    }

    public void setCrogame(Integer crogame) {
        this.crogame = crogame;
    }

    public String getCroserver() {
        return croserver;
    }

    public void setCroserver(String croserver) {
        this.croserver = croserver == null ? null : croserver.trim();
    }

    public Integer getIsgame() {
        return isgame;
    }

    public void setIsgame(Integer isgame) {
        this.isgame = isgame;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getServicegood() {
        return servicegood;
    }

    public void setServicegood(Integer servicegood) {
        this.servicegood = servicegood;
    }

    public Integer getChangevip() {
        return changevip;
    }

    public void setChangevip(Integer changevip) {
        this.changevip = changevip;
    }

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode == null ? null : cardcode.trim();
    }
}