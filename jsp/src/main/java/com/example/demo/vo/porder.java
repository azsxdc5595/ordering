package com.example.demo.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class porder {
    private Integer id;
    private String deskno;
    private String memberno;
    private Date ordertime;
    private String number;
    private String phone;

    public porder(String deskno, String memberno, Date ordertime, String number, String phone) {
        super();
        this.deskno = deskno;
        this.memberno = memberno;
        this.ordertime = ordertime;
        this.number = number;
        this.phone = phone;
    }

    public porder() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getDeskno() {
        return deskno;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public String getNumber() {
        return number;
    }

    public Integer getId() {
        return id;
    }

    public String getMemberno() {
        return memberno;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setOrdertime(Date newOrdertime) {
        this.ordertime = newOrdertime;
    }
    
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    
    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

	
}

