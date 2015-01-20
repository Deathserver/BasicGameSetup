package basicGameSetup;



import java.awt.Rectangle;

import javax.swing.JFrame;

import java.awt.event.*;

import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Game extends JFrame implements ActionListener, KeyListener{
    
    int x = 250;
    int y = 250;
	
	
    
    Timer timer;
    
    public void paint(Graphics g){
        
        
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.WHITE);
        g2.fill(new Rectangle(0,0,500,500));
        
        g2.setColor(Color.GREEN);
        g2.fill(new Rectangle(x-5,y-5,10,10));
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        
        move();
        repaint();
        
    }
    
    public void keyReleased(KeyEvent e){}
    
    public void keyTyped(KeyEvent e){}
    
    public void keyPressed(KeyEvent e){
        
        if(e.getKeyCode() == KeyEvent.VK_UP){
        	y -= 10;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
        	y += 10;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
        	x -= 10;
        }
		
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
        	x += 10;
        }
    }
    
    public static void main (String[] args){
        
        
        
        JFrame window = new Game();
        window.setSize(500,500);
        window.setResizable(false);
        window.setTitle("Game Test");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        window.setVisible(true);
        
        
        
        
    }
    
    public void move(){
        
        
        
    }
    
    
    
    
    public Game() {
        timer = new Timer(100,this);
        
        timer.setInitialDelay(500);
        timer.start();
        
        
        
        addKeyListener(this);
    }
    
    
    
    
}









