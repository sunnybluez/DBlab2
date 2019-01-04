package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class PackageUsage extends PackageUsageKey implements Serializable {
    private Integer callsLeft;

    private Integer msgLeft;

    private BigDecimal localdataLeft;

    private BigDecimal nationaldataLeft;

    private static final long serialVersionUID = 1L;

    public Integer getCallsLeft() {
        return callsLeft;
    }

    public void setCallsLeft(Integer callsLeft) {
        this.callsLeft = callsLeft;
    }

    public Integer getMsgLeft() {
        return msgLeft;
    }

    public void setMsgLeft(Integer msgLeft) {
        this.msgLeft = msgLeft;
    }

    public BigDecimal getLocaldataLeft() {
        return localdataLeft;
    }

    public void setLocaldataLeft(BigDecimal localdataLeft) {
        this.localdataLeft = localdataLeft;
    }

    public BigDecimal getNationaldataLeft() {
        return nationaldataLeft;
    }

    public void setNationaldataLeft(BigDecimal nationaldataLeft) {
        this.nationaldataLeft = nationaldataLeft;
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
        PackageUsage other = (PackageUsage) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCallsLeft() == null ? other.getCallsLeft() == null : this.getCallsLeft().equals(other.getCallsLeft()))
            && (this.getMsgLeft() == null ? other.getMsgLeft() == null : this.getMsgLeft().equals(other.getMsgLeft()))
            && (this.getLocaldataLeft() == null ? other.getLocaldataLeft() == null : this.getLocaldataLeft().equals(other.getLocaldataLeft()))
            && (this.getNationaldataLeft() == null ? other.getNationaldataLeft() == null : this.getNationaldataLeft().equals(other.getNationaldataLeft()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCallsLeft() == null) ? 0 : getCallsLeft().hashCode());
        result = prime * result + ((getMsgLeft() == null) ? 0 : getMsgLeft().hashCode());
        result = prime * result + ((getLocaldataLeft() == null) ? 0 : getLocaldataLeft().hashCode());
        result = prime * result + ((getNationaldataLeft() == null) ? 0 : getNationaldataLeft().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", callsLeft=").append(callsLeft);
        sb.append(", msgLeft=").append(msgLeft);
        sb.append(", localdataLeft=").append(localdataLeft);
        sb.append(", nationaldataLeft=").append(nationaldataLeft);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}