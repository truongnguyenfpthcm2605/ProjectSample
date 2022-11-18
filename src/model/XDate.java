/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author truong
 */
public class XDate {
    public static SimpleDateFormat formater = new SimpleDateFormat();
    // chuyen tu chuoi -> thoi gian
    public static Date toDate(String date,String pattern){
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
    // chuyen tu thoi gian -> chuoi
    public static String toString(Date date,String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    // bo sung ngay vao thoi gian hien tai
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime()+ days*24*60*60*1000);
        return date;
    }


}
