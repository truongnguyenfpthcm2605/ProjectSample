/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Enity.ChuyenDe;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import SQL.JDBCHelper;
/**
 *
 * @author truong
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{

    @Override
    public void insert(ChuyenDe enity) {
        String sql = " INSERT INTO CHUYENDE(MACD,TENCD,HOCPHI,THOILUONG,HINH,MOTA) VALUES(?,?,?,?,?,?)";
        JDBCHelper.update(sql, enity.getMaCD(),enity.getTenCD(),enity.getHocPhi(),enity.getThoiLuong(),enity.getHinh(),enity.getMoTa());
    }

    @Override
    public void update(ChuyenDe enity) {
        String sql = "UPDATE  CHUYENDE SET TENCD =?,HOCPHI=?,THOILUONG=?,HINH=?,MOTA=? WHERE MACD= ?";
        JDBCHelper.update(sql, enity.getTenCD(),enity.getHocPhi(),enity.getThoiLuong(),enity.getHinh(),enity.getMoTa(),enity.getMaCD() );
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM CHUYENDE WHERE MACD = ?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public ChuyenDe selectByID(String key) {
        String sql =" SELECT * FROM CHUYENDE WHERE MACD = ?";
        List<ChuyenDe> list = this.getById(sql, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> getAllDate() {
        String sql = " SELECT * FROM CHUYENDE";
        return this.getById(sql);
    }

    @Override
    protected List<ChuyenDe> getById(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString(1));
                cd.setTenCD(rs.getString(2));
                cd.setHocPhi(rs.getFloat(3));
                cd.setThoiLuong(rs.getInt(4));
                cd.setHinh(rs.getString(5));
                cd.setMoTa(rs.getString(6));
                list.add(cd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
    
}
