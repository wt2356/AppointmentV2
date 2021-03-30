package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Manager)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:19:48
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = 921615872468117780L;
    /**
     * 管理员id
     */
    private int mId;
    /**
     * 管理员name
     */
    private String name;
    /**
     * 管理员联系电话
     */
    private int tel;


    public int getMId() {
        return mId;
    }

    public void setMId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}