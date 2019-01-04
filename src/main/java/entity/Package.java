package entity;

import java.io.Serializable;

public class Package implements Serializable {
    private Integer pid;

    private Integer charge;

    private Integer calls;

    private Integer msg;

    private Integer localdata;

    private Integer nationaldata;

    private String packagename;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Integer getCalls() {
        return calls;
    }

    public void setCalls(Integer calls) {
        this.calls = calls;
    }

    public Integer getMsg() {
        return msg;
    }

    public void setMsg(Integer msg) {
        this.msg = msg;
    }

    public Integer getLocaldata() {
        return localdata;
    }

    public void setLocaldata(Integer localdata) {
        this.localdata = localdata;
    }

    public Integer getNationaldata() {
        return nationaldata;
    }

    public void setNationaldata(Integer nationaldata) {
        this.nationaldata = nationaldata;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Package other = (Package) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()))
            && (this.getCalls() == null ? other.getCalls() == null : this.getCalls().equals(other.getCalls()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getLocaldata() == null ? other.getLocaldata() == null : this.getLocaldata().equals(other.getLocaldata()))
            && (this.getNationaldata() == null ? other.getNationaldata() == null : this.getNationaldata().equals(other.getNationaldata()))
            && (this.getPackagename() == null ? other.getPackagename() == null : this.getPackagename().equals(other.getPackagename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        result = prime * result + ((getCalls() == null) ? 0 : getCalls().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getLocaldata() == null) ? 0 : getLocaldata().hashCode());
        result = prime * result + ((getNationaldata() == null) ? 0 : getNationaldata().hashCode());
        result = prime * result + ((getPackagename() == null) ? 0 : getPackagename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", charge=").append(charge);
        sb.append(", calls=").append(calls);
        sb.append(", msg=").append(msg);
        sb.append(", localdata=").append(localdata);
        sb.append(", nationaldata=").append(nationaldata);
        sb.append(", packagename=").append(packagename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}