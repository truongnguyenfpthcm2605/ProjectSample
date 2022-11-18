/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import SQL.JDBCHelper;
/**
 *
 * @author truong
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql,String[] cols,Object...args){
        try {
            // tao list luu tru
            List<Object[]> list = new ArrayList<>();
            // lay ket qua tu query
           ResultSet rs = JDBCHelper.query(sql, args);
           while(rs.next()){
               // tai mang voi do dai bang do dai cua mang côt
               Object[] vals = new Object[cols.length];
               // duyet qua for de them vao mang
               for (int i = 0; i < cols.length; i++) {
                   vals[i]= rs.getObject(cols[i]);
                   
               }
               // sau moi lam them add vao phan tu cua list
               list.add(vals);
           }
           rs.getStatement().getConnection().close();
           return list;
           
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
    public List<Object[]> getBangDiem(Integer maKh){
        String sql = "{CALL SP_BANGDIEM(?)}";
        String[] cols = {"MANH","HOTEN","DIEM"};
        return getListOfArray(sql, cols,maKh );
    }
    public List<Object[]> getThongKeDiem(){
        String sql = "{CALL SP_DIEMCHUYENDE}";
        String[] cols = {"TENCD","SLHV","THAPNHAT","CAONHAT","TRUNGBINH"};
        return getListOfArray(sql, cols);
    }
    public List<Object[]> getSoLuongNguoiHoc(){
        String sql = "{CALL SP_SOLUONGNGUOIHOC}";
        String[] cols = {"NAM","SOLUONG","DAUTIEN","CUOICUNG"};
        return getListOfArray(sql, cols);
    }
    public List<Object[]> getDoanhThu(Integer year){
        String sql = "{CALL SP_THONGDOANHTHU(?)}";
        String[] cols = {"TENCD","SOKH","SOHV","DOANHTHU","THAPNHAT","CAONHAT","TRUNGBINH"};
        return getListOfArray(sql, cols, year);
    }
}
