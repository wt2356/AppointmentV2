package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:20:46
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 777015640127993783L;
    /**
     * 阅览室id
     */
    private int rId;
    /**
     * 位置
     */
    private String location;
    /**
     * 阅览室名字
     */
    private String name;
    /**
     * 0：空闲 1：满
     */
    private int status;
    /**
     * 总的位置数量
     */
    private int allNum;
    /**
     * 空闲座位数
     */
    private int num;


    public int getRId() {
        return rId;
    }

    public void setRId(int rId) {
        this.rId = rId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAllNum() {
        return allNum;
    }

    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}