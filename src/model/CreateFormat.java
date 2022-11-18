/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author truong
 */
public class CreateFormat {
    public static  Image getImageApp(){
        URL url =  CreateFormat.class.getResource("/img/IconApp.png");
        Image img =new ImageIcon(url).getImage();
        return img;
    }
    public static void formatJrame(JFrame frame,String title){
        frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setResizable(false);
       frame.setIconImage(getImageApp());
       frame.setTitle(title);
    }
}
