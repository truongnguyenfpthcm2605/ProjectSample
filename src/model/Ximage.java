/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author truong
 */
public class Ximage {
    public static ImageIcon read(String fileName, JLabel lblImage){
        File path =  new File("Logos", fileName);
        ImageIcon myImage = new ImageIcon(path.getAbsolutePath());
        Image img = myImage.getImage();
        Image newimg = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
        
    }
    public static void save(File src){
        // kiem tra thu mua co ton tai hay chua -> chua thi tao ra thu muc
        File root = new File("Logos", src.getName());
        if(!root.getParentFile().exists()){
            root.getParentFile().mkdirs();
        }
        // luu hinh anh vao thu muc, neu co thi thay the
        try {
            Path from  = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(root.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }

}
