package com.example.demo.snmpServer.Data;


public class InterFace {
    private String ifDescr;
    private IFType ifType;
    private int ifMtu;
    private int ifSpeed;
    private String ifPhysAddress;
    private Status ifAdminStatus;
    private Status ifOperStatus;
    private String ifLastChange;

    public void setIfDescr(String ifDescr) {
        this.ifDescr = ifDescr;
    }
    public String getIfDescr(){
        return this.ifDescr;
    }

    public void setIfAdminStatus(Status ifAdminStatus) {
        this.ifAdminStatus = ifAdminStatus;
    }

    public Status getIfAdminStatus() {
        return ifAdminStatus;
    }

    public void setIfLastChange(String ifLastChange) {
        this.ifLastChange = ifLastChange;
    }

    public String getIfLastChange() {
        return ifLastChange;
    }

    public void setIfMtu(int ifMtu) {
        this.ifMtu = ifMtu;
    }

    public int getIfMtu() {
        return ifMtu;
    }

    public void setIfOperStatus(Status ifOperStatus) {
        this.ifOperStatus = ifOperStatus;
    }

    public Status getIfOperStatus() {
        return ifOperStatus;
    }

    public void setIfPhysAddress(String ifPhysAddress) {
        this.ifPhysAddress = ifPhysAddress;
    }

    public String getIfPhysAddress() {
        return ifPhysAddress.length() == 0 ? "无物理地址" : ifPhysAddress;
    }
    //Speed原始单位是bit/s
    public void setIfSpeed(int ifSpeed) {
        this.ifSpeed = ifSpeed;
    }
    //输出时把它换成MB/s 加上单位
    public String getIfSpeed() {
        String s = new String();
        double result = (double)this.ifSpeed / (1024.0 * 8.0 * 1024.0);
        s = String.format("%.2fMB/s", result);
        return s;
    }

    public void setIfType(IFType ifType) {
        this.ifType = ifType;
    }
    //输出时肯定不输出标识符了
    public String getIfType() {
        return ifType.toString();
    }
}
