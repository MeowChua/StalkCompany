package com.company;

public class objectIn4 {
    private String name;
    private String tax;
    private String address;
    public objectIn4(){}
    public objectIn4(String name,String tax, String address){
        this.address = address;
        this.tax = tax;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getTax() {
        return tax;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setTax(String Tax){
        this.tax=Tax;
    }
    public void setAddress(String Address){
        this.address=Address;
    }




}
