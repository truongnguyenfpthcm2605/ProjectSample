/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author truong
 */
public class CheckData {

    public boolean checkEmail(String e) {
        String parttern = "^\\w{3,}@\\w{2,}(\\.[a-zA-Z]{2,3}){1,2}$";
        return e.matches(parttern);
    }

    public boolean checkNumberPhone(String s) {
        String parttern = "0[932]\\d{8}";
        return s.matches(parttern);
    }

    public boolean checkDate(String date) {
        String partten = "^([0-9]{4}[-/]?((0[13-9]|1[012])[-/]?(0[1-9]|[12][0-9]|30)|(0[13578]|1[02])[-/]?31|02[-/]?(0[1-9]|1[0-9]|2[0-8]))|([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00)[-/]?02[-/]?29)$";
        return date.matches(partten);
    }

    public boolean checkIsEmpty(JTextField text) {
        if (text.getText().isEmpty()) {
            text.setBackground(Color.yellow);
            return false;
        } else {
            text.setBackground(Color.white);
        }
        return true;
    }

    public void changColorLabel(boolean stand, JLabel lb, String content) {
        if (stand) {
            lb.setForeground(Color.green);
        } else {
            lb.setForeground(Color.red);
        }
        String err = stand == true ? "Successful " : content;
        lb.setText(err);
        lb.setFont(new Font("Eras Medium ITC", Font.ITALIC, 12));

    }

    public boolean checkFee(String a) {
        try {
            float b = Float.parseFloat(a);
            return b >= 1000;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public boolean checkTime(String time) {
        try {
            int a = Integer.parseInt(time);
            if ((int) a == a && a > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

}
