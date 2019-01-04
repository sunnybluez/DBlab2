package entity;

import java.io.Serializable;
import java.util.Date;

public class BookRecord extends BookRecordKey implements Serializable {
    private Date infecttime;

    private Date endtime;

    private Boolean iseffect;

    private static final long serialVersionUID = 1L;

    public Date getInfecttime() {
        return infecttime;
    }

    public void setInfecttime(Date infecttime) {
        this.infecttime = infecttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Boolean getIseffect() {
        return iseffect;
    }

    public void setIseffect(Boolean iseffect) {
        this.iseffect = iseffect;
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
        BookRecord other = (BookRecord) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getInfecttime() == null ? other.getInfecttime() == null : this.getInfecttime().equals(other.getInfecttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getIseffect() == null ? other.getIseffect() == null : this.getIseffect().equals(other.getIseffect()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getInfecttime() == null) ? 0 : getInfecttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getIseffect() == null) ? 0 : getIseffect().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infecttime=").append(infecttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", iseffect=").append(iseffect);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}