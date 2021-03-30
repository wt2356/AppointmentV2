package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Desk)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:19:09
 */
public class Desk implements Serializable {
    private static final long serialVersionUID = -96695908970801702L;
    /**
     * 座位id
     */
    private int dId;
    /**
     * 阅览室id
     */
    private int rId;
    /**
     * 0,空闲  1，使用中
     */
    private int status;


    public int getDId() {
        return dId;
    }

    public void setDId(int dId) {
        this.dId = dId;
    }

    public int getRId() {
        return rId;
    }

    public void setRId(int rId) {
        this.rId = rId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}