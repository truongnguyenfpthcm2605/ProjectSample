/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enity;

import java.util.Date;

/**
 *
 * @author truong
 */
public class KhoaHoc {
    private int maKhoaHoc;
    private String maCD;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayKG;
    private String ghichu;
    private String maNV;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int maKhoaHoc, String maCD, float hocPhi, int thoiLuong, Date ngayKG, String ghichu, String maNV, Date ngayTao) {
        this.maKhoaHoc = maKhoaHoc;
        this.maCD = maCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghichu = ghichu;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return this.getGhichu();
    }
   
    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
}
