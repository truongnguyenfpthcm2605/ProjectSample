/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Enity.NguoiHoc;
import SQL.JDBCHelper;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author truong
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String>{

    @Override
    public void insert(NguoiHoc enity) {
        String sql = " INSERT INTO NGUOIHOC(MANH,HOTENZ,GIOITINH,NGAYSINH,DIENTHOAI,EMAIL,GHICHU,MANV,NGAYDK) VALUES (?,?,?,?,?,?,?,?,?)";
        JDBCHelper.update(sql, enity.getMaNH(),enity.getHoTen(),enity.isGioiTinh(),enity.getNgaySinh(),enity.getDienThoai(),enity.getEmail(),enity.getGhiChu(),enity.getMaNV(),enity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc enity) {
           String sql = "UPDATE NGUOIHOC SET HOTENZ = ?,GIOITINH = ? ,NGAYSINH = ?, DIENTHOAI =?,EMAIL = ? ,GHICHU = ? ,MANV = ? ,NGAYDK =? WHERE MANH = ?";
        JDBCHelper.update(sql,enity.getHoTen(),enity.isGioiTinh(),enity.getNgaySinh(),enity.getDienThoai(),enity.getEmail(),enity.getGhiChu(),enity.getMaNV(),enity.getNgayDK(), enity.getMaNH());
    
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM NGUOIHOC WHERE MANH = ?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public NguoiHoc selectByID(String key) {
        String sql = " SELECT * FROM NGUOIHOC WHERE MANH = ?";
        List<NguoiHoc> list ;
        list = getById(sql, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> getAllDate() {
        String sql= " SELECT * FROM NGUOIHOC";
        return getById(sql);
    }

    @Override
    protected List<NguoiHoc> getById(String sql, Object... args) {
         List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                NguoiHoc leaner = new NguoiHoc();
                leaner.setMaNH(rs.getString(1));
                leaner.setHoTen(rs.getString(2));
                leaner.setGioiTinh(rs.getBoolean(3));
                leaner.setNgaySinh(rs.getDate(4));
                leaner.setDienThoai(rs.getString(5));
                leaner.setEmail(rs.getString(6));
                leaner.setGhiChu(rs.getString(7));
                leaner.setMaNV(rs.getString(8));
                leaner.setNgayDK(rs.getDate(9));
                list.add(leaner);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<NguoiHoc> selectByKeyWord(String keyword){
        String sql = "SELECT * FROM NGUOIHOC WHERE HOTENZ  LIKE ?";
        String key = "%"+keyword+"%";
        return this.getById(sql, key);
    }
    public List<NguoiHoc> selectNotinCourse(int makh , String key){
        String sql = "  SELECT * FROM NGUOIHOC WHERE HOTENZ LIKE ? AND MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.getById(sql, "%"+key+"%",makh);
    }
    
}
