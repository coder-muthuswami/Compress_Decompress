/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import CodeFiles.Decompress;
import CodeFiles.compress;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bijja
 */
public class view extends JFrame implements ActionListener {
   
    JButton Compress;
    JButton Decompresss;
    
    
    view(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        
        Compress= new JButton("Select fle to compress");
        Compress.addActionListener(this);
        Compress.setBounds(20, 100, 200, 30);
        
        Decompresss= new JButton("Select fle to Decompress");
        Decompresss.addActionListener(this);
        Decompresss.setBounds(250, 100, 200, 30);
        
        this.add(Compress);
        this.add(Decompresss);
        this.getContentPane().setBackground(Color.black);
        
        
        this.setSize(500,200);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == Compress){
            JFileChooser fileChooser = new JFileChooser();
            int response =fileChooser.showSaveDialog(null);
            
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                
                try{
                    compress.method(file);   
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null, excp.toString());
                }
            }
        }
        
        if (e.getSource() == Decompresss){
            JFileChooser fileChooser = new JFileChooser();
            int response =fileChooser.showSaveDialog(null);
            
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                
                try{
                    Decompress.method(file);   
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null, excp.toString());
                }
            }
        }
        
    }
    public static void main(String [] main){
        view view= new view();
        view.setVisible(true);
    }
}
