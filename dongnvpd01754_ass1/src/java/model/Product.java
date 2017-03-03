/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dell
 */
public class Product {

    private String maSp;
    private String tenSP;
    private String mota;
    private String soluong;
    private double dongia;
    private String hinhanh;
    private String nhaSanxuat;
    private String maloai;

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getNhaSanxuat() {
        return nhaSanxuat;
    }

    public void setNhaSanxuat(String nhaSanxuat) {
        this.nhaSanxuat = nhaSanxuat;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public Product(String maSp, String tenSP, String mota, String soluong, double dongia, String hinhanh, String nhaSanxuat, String maloai) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.mota = mota;
        this.soluong = soluong;
        this.dongia = dongia;
        this.hinhanh = hinhanh;
        this.nhaSanxuat = nhaSanxuat;
        this.maloai = maloai;
    }

    public Product() {
    }

}
