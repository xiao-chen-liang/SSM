package pojo;

public class Class {
    private Integer cid;
    private String cname;

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Class(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Class() {
    }
}
