package cdu.jaav.entity.DTO;

import java.util.Date;

public class OrderDTO {
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
    private String studentName;
    private String roomName;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
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

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "sId=" + sId +
                ", oId=" + oId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", dId=" + dId +
                ", flag=" + flag +
                ", status=" + status +
                ", studentName='" + studentName + '\'' +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
