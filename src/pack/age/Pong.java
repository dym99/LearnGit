/*
 * To change this template, choose Tools | Templates
 * and do the dance. open the template in the editor.
 */
package pack.age;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Admin
 */
public class Pong
{
    JFrame frame;
    JButton btn;
    public Pong()
    {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn = new JButton("lololol");
        JPanel panel;
        panel = new JPanel();
        panel.setSize(64, 32);
        panel.add(btn);
        frame.add(panel);
        
    }

    public static void main(String[] args)
    {
        new Pong();
    }
}
