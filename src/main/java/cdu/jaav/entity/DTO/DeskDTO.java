package cdu.jaav.entity.DTO;


public class DeskDTO{
    /**
     * 座位id
     */
    private int dId;
    /**
     * 0,空闲  1，使用中
     */
    private int status;
    /**
     * 阅览室名字
     */
    private String name;

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
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

    @Override
    public String toString() {
        return "DeskDTO{" +
                "dId=" + dId +
                ", status=" + status +
                ", name='" + name + '\'' +
                '}';
    }
}
