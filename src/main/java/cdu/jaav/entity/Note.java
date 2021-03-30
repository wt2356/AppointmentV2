package cdu.jaav.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Note)实体类
 *
 * @author makejava
 * @since 2021-03-30 16:20:22
 */
public class Note implements Serializable {
    private static final long serialVersionUID = -59413455512953452L;
    /**
     * 公告id
     */
    private int nId;
    /**
     * 标题
     */
    private String title;
    /**
     * 管理员id
     */
    private int mId;
    /**
     * 发布时间
     */
    private Date time;
    /**
     * 公告内容
     */
    private String text;


    public int getNId() {
        return nId;
    }

    public void setNId(int nId) {
        this.nId = nId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMId() {
        return mId;
    }

    public void setMId(int mId) {
        this.mId = mId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}