package cdu.jaav.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:20:37
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 643841438455996049L;
    /**
     * 学生id
     */
    private int sId;
    /**
     * 预约信息id
     */
    private int oId;
    /**
     * 预约开始时间
     */
    private Date startTime;
    /**
     * 预约结束时间
     */
    private Date endTime;
    /**
     * 座位id
     */
    private int dId;
    /**
     * 1，正常  2，违规
     */
    private int flag;
    /**
     * 1.未签到 2.已签到 3.签离
     */
    private int status;


    public int getSId() {
        return sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    public int getOId() {
        return oId;
    }

    public void setOId(int oId) {
        this.oId = oId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getDId() {
        return dId;
    }

    public void setDId(int dId) {
        this.dId = dId;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}