/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Enity.KhoaHoc;
import SQL.JDBCHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truong
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, String> {

    @Override
    public void insert(KhoaHoc enity) {
        String sql ="INSERT INTO KHOAHOC(MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV,NGAYTAO) VALUES(?,?,?,?,?,?,?)";
        JDBCHelper.update(sql,enity.getMaCD(),enity.getHocPhi(),enity.getThoiLuong(),enity.getNgayKG(),enity.getGhichu(),enity.getMaNV(),enity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc enity) {
        String sql = "UPDATE KHOAHOC SET HOCPHI = ? , THOILUONG = ?,NGAYKG = ?,GHICHU = ?,MANV = ?, NGAYTAO = ? WHERE MAKH = ?";
        JDBCHelper.update(sql, enity.getHocPhi(),enity.getThoiLuong(),enity.getNgayKG(),enity.getGhichu(),enity.getMaNV(),enity.getNgayTao(),enity.getMaKhoaHoc());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM KHOAHOC WHERE MACD = ?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public KhoaHoc selectByID(String key) {
        String sql =" SELECT * FROM KHOAHOC WHERE MACD = ?";
        List<KhoaHoc> list = getById(sql, key);
        if(list.isEmpty()){
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public List<KhoaHoc> getAllDate() {
        String sql =" SELECT * FROM KHOAHOC";
        return getById(sql);
    }

    @Override
    protected List<KhoaHoc> getById(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhoaHoc course = new KhoaHoc();
                course.setMaKhoaHoc(rs.getInt(1));
                course.setMaCD(rs.getString(2));
                course.setHocPhi(rs.getFloat(3));
                course.setThoiLuong(rs.getInt(4));
                course.setNgayKG(rs.getDate(5));
                course.setGhichu(rs.getString(6));
                course.setMaNV(rs.getString(7));
                course.setNgayTao(rs.getDate(8));
                list.add(course);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }

    }
    public List<KhoaHoc> selectByChuyenDe(String macd){
        String sql = "SELECT * FROM KHOAHOC WHERE MACD = ?";
        return this.getById(sql, macd);
    }
  public List<Integer> selectYears(){
        List<Integer> list= new ArrayList<>();
        String sql = "SELECT  DISTINCT YEAR(NGAYKG) YE FROM KHOAHOC ORDER BY YE DESC";
        try {
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
  public KhoaHoc selectByCourse(int makh){
      String sql = "SELECT * FROM KHOAHOC WHERE MAKH = ?";
      return this.getById(sql, makh).get(0);
  }
  public void deletes(int makh){
        String sql = "DELETE FROM KHOAHOC WHERE MAKH = ?";
        JDBCHelper.update(sql, makh);
  }
 

}