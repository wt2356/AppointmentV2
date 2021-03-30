package cdu.jaav.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:22:52
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 467794990764190953L;
    /**
     * id
     */
    private int sId;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 1:拒绝访问，2：正常访问
     */
    private int status;
    /**
     * 名字
     */
    private String name;
    /**
     * 违规次数
     */
    private int flag;
    /**
     * 第一次违规时间
     */
    private Date time;


    public int getSId() {
        return sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}