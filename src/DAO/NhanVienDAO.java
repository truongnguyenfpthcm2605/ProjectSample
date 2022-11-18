/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Enity.NhanVien;
import java.util.List;
import SQL.JDBCHelper;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author truong
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String>{

    @Override
    public void insert(NhanVien enity) {
        String sql = "INSERT INTO NHANVIEN(MANV,MATKHAU,HOTEN,VAITRO) VALUES(?,?,?,?)";
        JDBCHelper.update(sql,enity.getMaNV(),enity.getMatKhau(),enity.getHoTen(),enity.getVaiTro() );
    }

    @Override
    public void update(NhanVien enity) {
        String sql = " UPDATE NHANVIEN SET MATKHAU = ?, HOTEN= ?, VAITRO = ? WHERE MANV = ?";
        JDBCHelper.update(sql,enity.getMatKhau(),enity.getHoTen(),enity.getVaiTro(),enity.getMaNV() );
    }

    @Override
    public void delete(String key) {
       String sql = " DELETE FROM NHANVIEN WHERE MANV = ?";
       JDBCHelper.update(sql, key);
    }

    @Override
    public NhanVien selectByID(String key) {
       String sql = "SELECT * FROM NHANVIEN WHERE MANV =?";
       List<NhanVien> list = this.getById(sql, key);
      if(list.isEmpty()){
          return null;
      }
      return list.get(0);
      
    }

    @Override
    public List<NhanVien> getAllDate() {
        String sql = "SELECT * FROM NHANVIEN";
        return this.getById(sql);
    }

    @Override
    protected List<NhanVien> getById(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setMatKhau(rs.getString(2));
                 nv.setHoTen(rs.getString(3));
                nv.setVaiTro(rs.getInt(4));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
