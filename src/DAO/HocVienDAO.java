/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Enity.HocVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import SQL.JDBCHelper;

/**
 *
 * @author truong
 */
public class HocVienDAO extends EduSysDAO<HocVien, String> {

    @Override
    public void insert(HocVien enity) {
        String sql = "INSERT INTO HOCVIEN(MAKH,MANH,DIEM) VALUES(?,?,?)";
        JDBCHelper.update(sql, enity.getMaKH(), enity.getMaNH(), enity.getDiem());
    }

    @Override
    public void update(HocVien enity) {
        String sql = "UPDATE HOCVIEN SET  DIEM = ? WHERE MAHV = ?";
        JDBCHelper.update(sql, enity.getDiem(), enity.getMaHV());
    }

    @Override
    public void delete(String key) {
        String sql = " DELETE FROM HOCVIEN WHERE MAHV = ?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public HocVien selectByID(String key) {
        String sql = " SELECT * FROM HOCVIEN WHERE MAHV = ?";
        List<HocVien> list = this.getById(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> getAllDate() {
        String sql = " SELECT * FROM HOCVIEN";
        return this.getById(sql);
    }

    @Override
    protected List<HocVien> getById(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt(1));
                hv.setMaKH(rs.getInt(2));
                hv.setMaNH(rs.getString(3));
                hv.setDiem(rs.getFloat(4));
                list.add(hv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HocVien> selectByKhoaHoc(int makh) {
        String sql = " SELECT * FROM HOCVIEN WHERE MAKH = ?";
        return this.getById(sql, makh);
    }

    public void deletes(int key) {
        String sql = " DELETE FROM HOCVIEN WHERE MAHV = ?";
        JDBCHelper.update(sql, key);
    }

    public HocVien selectByIDs(int key) {
        String sql = " SELECT * FROM HOCVIEN WHERE MAHV = ?";
        List<HocVien> list = this.getById(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

}
