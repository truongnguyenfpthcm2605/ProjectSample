/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Enity.NhanVien;

/**
 *
 * @author truong
 */
public class Authentication {
   public static NhanVien user = null;
   public static void clear(){
       user = null;
   }
   public static boolean  isLogin(){
       return user!=null;
   }
   public static boolean isManager(){
       return user.getVaiTro() ==1;
   }
   
}
