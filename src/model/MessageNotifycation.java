/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Component;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author truong
 */
public class MessageNotifycation {
    public int confirmMessage(Component com, String content,String title){
       return JOptionPane.showConfirmDialog(com,content , title, JOptionPane.YES_NO_OPTION);
    }
    public void messageNotify(Component com,String content,String title){
        JOptionPane.showMessageDialog(com, content, title, JOptionPane.DEFAULT_OPTION);
    }
    public String prompt(Component com ,String content, String title){
       return  JOptionPane.showInputDialog(com, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public void print(JTable table,String header,String footer){
        MessageFormat h = new MessageFormat(header);
        MessageFormat f = new MessageFormat(footer);
        try {
            table.print(JTable.PrintMode.NORMAL, h, f);
          
        } catch (PrinterException e) {
            messageNotify(table, "Print Fail", "Fail");
        }
    }
}
