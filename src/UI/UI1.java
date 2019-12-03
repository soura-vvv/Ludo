/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.*;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Sourav
 */
class pawn
{
    public int value;
    public int pos;
    public int col;
    public int inside;
    pawn(int a,int b,int c,int d)
    {
        value=a;
        pos=b;
        col=c;
        inside=d;
    }
    
}
public class UI1 extends javax.swing.JFrame{

    /**
     * Creates new form UI1
     */
    void setup()
    {
        r1.setIcon(iconred);
        r3.setIcon(iconred);
        r2.setIcon(iconred);
        r4.setIcon(iconred);
        
       
        y1.setIcon(iconyellow);
        y2.setIcon(iconyellow);
        y3.setIcon(iconyellow);
        y4.setIcon(iconyellow);
        
       
        g1.setIcon(icongreen);
        g2.setIcon(icongreen);
        g3.setIcon(icongreen);
        g4.setIcon(icongreen);
        
       
        b1.setIcon(iconblue);
        b2.setIcon(iconblue);
        b3.setIcon(iconblue);
        b4.setIcon(iconblue);
        
    }
   
  
    
    void displayscreen(pawn x1)
    {
        Icon whatcolour=null;
        switch(x1.col)
        {
            case 1:whatcolour=iconyellow;break;
            case 2:whatcolour=iconred;break;
            case 3:whatcolour=iconblue;break;
            case 4:whatcolour=icongreen;break;
        }
        switch(x1.pos)
        {
            case 1:yr1.setIcon(whatcolour);yr1.setDisabledIcon(whatcolour);break;
            case 14:rb1.setIcon(whatcolour);rb1.setDisabledIcon(whatcolour);break;
            case 27:bg1.setIcon(whatcolour);bg1.setDisabledIcon(whatcolour);break;
            case 40:gy1.setIcon(whatcolour);gy1.setDisabledIcon(whatcolour);break;
            
            case 2:yr2.setIcon(whatcolour);yr2.setDisabledIcon(whatcolour);break;
            case 3:yr3.setIcon(whatcolour);yr3.setDisabledIcon(whatcolour);break;
            case 4:yr4.setIcon(whatcolour);yr4.setDisabledIcon(whatcolour);break;
            case 5:yr5.setIcon(whatcolour);yr5.setDisabledIcon(whatcolour);break;
            case 6:yr6.setIcon(whatcolour);yr6.setDisabledIcon(whatcolour);break;
            case 7:yr7.setIcon(whatcolour);yr7.setDisabledIcon(whatcolour);break;
            case 8:yr8.setIcon(whatcolour);yr8.setDisabledIcon(whatcolour);break;
            case 9:yr9.setIcon(whatcolour);yr9.setDisabledIcon(whatcolour);break;
            case 10:yr10.setIcon(whatcolour);yr10.setDisabledIcon(whatcolour);break;
            case 11:yr11.setIcon(whatcolour);yr11.setDisabledIcon(whatcolour);break;
            case 12:yr12.setIcon(whatcolour);yr12.setDisabledIcon(whatcolour);break;
            case 13:yr13.setIcon(whatcolour);yr13.setDisabledIcon(whatcolour);break;
            
            case 15:rb2.setIcon(whatcolour);rb2.setDisabledIcon(whatcolour);break;
            case 16:rb3.setIcon(whatcolour);rb3.setDisabledIcon(whatcolour);break;
            case 17:rb4.setIcon(whatcolour);rb4.setDisabledIcon(whatcolour);break;
            case 18:rb5.setIcon(whatcolour);rb5.setDisabledIcon(whatcolour);break;
            case 19:rb6.setIcon(whatcolour);rb6.setDisabledIcon(whatcolour);break;
            case 20:rb7.setIcon(whatcolour);rb7.setDisabledIcon(whatcolour);break;
            case 21:rb8.setIcon(whatcolour);rb8.setDisabledIcon(whatcolour);break;
            case 22:rb9.setIcon(whatcolour);rb9.setDisabledIcon(whatcolour);break;
            case 23:rb10.setIcon(whatcolour);rb10.setDisabledIcon(whatcolour);break;
            case 24:rb11.setIcon(whatcolour);rb11.setDisabledIcon(whatcolour);break;
            case 25:rb12.setIcon(whatcolour);rb12.setDisabledIcon(whatcolour);break;
            case 26:rb13.setIcon(whatcolour);rb13.setDisabledIcon(whatcolour);break;
            
            case 28:bg2.setIcon(whatcolour);bg2.setDisabledIcon(whatcolour);break;
            case 29:bg3.setIcon(whatcolour);bg3.setDisabledIcon(whatcolour);break;
            case 30:bg4.setIcon(whatcolour);bg4.setDisabledIcon(whatcolour);break;
            case 31:bg5.setIcon(whatcolour);bg5.setDisabledIcon(whatcolour);break;
            case 32:bg6.setIcon(whatcolour);bg6.setDisabledIcon(whatcolour);break;
            case 33:bg7.setIcon(whatcolour);bg7.setDisabledIcon(whatcolour);break;
            case 34:bg8.setIcon(whatcolour);bg8.setDisabledIcon(whatcolour);break;
            case 35:bg9.setIcon(whatcolour);bg9.setDisabledIcon(whatcolour);break;
            case 36:bg10.setIcon(whatcolour);bg10.setDisabledIcon(whatcolour);break;
            case 37:bg11.setIcon(whatcolour);bg11.setDisabledIcon(whatcolour);break;
            case 38:bg12.setIcon(whatcolour);bg12.setDisabledIcon(whatcolour);break;
            case 39:bg13.setIcon(whatcolour);bg13.setDisabledIcon(whatcolour);break;
            
            case 41:gy2.setIcon(whatcolour);gy2.setDisabledIcon(whatcolour);break;
            case 42:gy3.setIcon(whatcolour);gy3.setDisabledIcon(whatcolour);break;
            case 43:gy4.setIcon(whatcolour);gy4.setDisabledIcon(whatcolour);break;
            case 44:gy5.setIcon(whatcolour);gy5.setDisabledIcon(whatcolour);break;
            case 45:gy6.setIcon(whatcolour);gy6.setDisabledIcon(whatcolour);break;
            case 46:gy7.setIcon(whatcolour);gy7.setDisabledIcon(whatcolour);break;
            case 47:gy8.setIcon(whatcolour);gy8.setDisabledIcon(whatcolour);break;
            case 48:gy9.setIcon(whatcolour);gy9.setDisabledIcon(whatcolour);break;
            case 49:gy10.setIcon(whatcolour);gy10.setDisabledIcon(whatcolour);break;
            case 50:gy11.setIcon(whatcolour);gy11.setDisabledIcon(whatcolour);break;
            case 51:gy12.setIcon(whatcolour);gy12.setDisabledIcon(whatcolour);break;
            case 52:gy13.setIcon(whatcolour);gy13.setDisabledIcon(whatcolour);break;
            
            case 53:y1.setIcon(iconyellow);y1.setDisabledIcon(iconyellow);break;
            case 54:y2.setIcon(iconyellow);y2.setDisabledIcon(iconyellow);break;
            case 55:y3.setIcon(iconyellow);y3.setDisabledIcon(iconyellow);break;
            case 56:y4.setIcon(iconyellow);y4.setDisabledIcon(iconyellow);break;
            
            case 57:r1.setIcon(iconred);r1.setDisabledIcon(iconred);break;
            case 58:r2.setIcon(iconred);r2.setDisabledIcon(iconred);break;
            case 59:r3.setIcon(iconred);r3.setDisabledIcon(iconred);break;
            case 60:r4.setIcon(iconred);r4.setDisabledIcon(iconred);break;
            
            case 61:b1.setIcon(iconblue);b1.setDisabledIcon(iconblue);break;
            case 62:b2.setIcon(iconblue);b2.setDisabledIcon(iconblue);break;
            case 63:b3.setIcon(iconblue);b3.setDisabledIcon(iconblue);break;
            case 64:b4.setIcon(iconblue);b4.setDisabledIcon(iconblue);break;
            
            case 65:g1.setIcon(icongreen);g1.setDisabledIcon(icongreen);break;
            case 66:g2.setIcon(icongreen);g2.setDisabledIcon(icongreen);break;
            case 67:g3.setIcon(icongreen);g3.setDisabledIcon(icongreen);break;
            case 68:g4.setIcon(icongreen);g4.setDisabledIcon(icongreen);break;
        }
        
        
    }
    void displayboard()
    {
        displayscreen(yy1);
        displayscreen(yy2);
        displayscreen(yy3);
        displayscreen(yy4);
        displayscreen(rr1);
        displayscreen(rr2);
        displayscreen(rr3);
        displayscreen(rr4);
        displayscreen(bb1);
        displayscreen(bb2);
        displayscreen(bb3);
        displayscreen(bb4);
        displayscreen(gg1);
        displayscreen(gg2);
        displayscreen(gg3);
        displayscreen(gg4);
        
    }
    pawn freehome(pawn d1,int coloi)
    {
        switch(coloi)
        {
            case 1:
            {
                if(yy1.pos!=53)
                    d1.pos=53;
                else if(yy2.pos!=54)
                    d1.pos=54;
                else if(yy3.pos!=55)
                    d1.pos=55;
                else if(yy4.pos!=56)
                    d1.pos=56;
                break;
                
            }
            case 2:
            {
                 if(rr1.pos!=57)
                    d1.pos=57;
                else if(rr2.pos!=58)
                    d1.pos=58;
                else if(rr3.pos!=59)
                    d1.pos=59;
                else if(rr4.pos!=60)
                    d1.pos=60;
                break;
            }
            case 3:
            {
                 if(bb1.pos!=61)
                    d1.pos=61;
                else if(bb2.pos!=62)
                    d1.pos=62;
                else if(bb3.pos!=63)
                    d1.pos=63;
                else if(bb4.pos!=64)
                    d1.pos=64;
                break;
            }
            case 4:
            {
                 if(gg1.pos!=65)
                    d1.pos=65;
                else if(gg2.pos!=66)
                    d1.pos=66;
                else if(gg3.pos!=67)
                    d1.pos=67;
                else if(gg4.pos!=68)
                    d1.pos=68;
                break;
                
            }
        }
        return d1;
    }
    pawn killchecker(pawn m1,pawn m2,int lame)
    {
        if(m2.pos==lame)
        {
            if(m2.col!=m1.col)
            {
                m2.inside=0;
               m2=freehome(m2,m2.col);
               //m2.pos=0;
                chance--;
            }
        }
        return m2;
    }
    pawn play(pawn p1,int distance)
    {
       if(p1.inside==0)
       {
           switch(p1.col)
           { 
               case 1:p1.pos=1;break;
               case 2:p1.pos=14;break;
               case 3:p1.pos=27;break;
               case 4:p1.pos=40;break;
           }
          
           displayboard();
          
           p1.inside=1;
           
       }    
        else
       {
           
            
          int bam=p1.pos+distance;
          yy1=killchecker(p1,yy1,bam); 
          yy2=killchecker(p1,yy2,bam);
          yy3=killchecker(p1,yy3,bam);
          yy4=killchecker(p1,yy4,bam); 
          rr1=killchecker(p1,rr1,bam);
          rr2=killchecker(p1,rr2,bam);
          rr3=killchecker(p1,rr3,bam); 
          rr4=killchecker(p1,rr4,bam);
          bb1=killchecker(p1,bb1,bam);
          bb2=killchecker(p1,bb2,bam); 
          bb3=killchecker(p1,bb3,bam);
          bb4=killchecker(p1,bb4,bam);
          gg1=killchecker(p1,gg1,bam);
          gg2=killchecker(p1,gg2,bam); 
          gg3=killchecker(p1,gg3,bam);
          gg4=killchecker(p1,gg4,bam);
          
          
           p1.pos=p1.pos+distance;
           if(p1.pos>52)
               p1.pos=(p1.pos)-52;
           displayboard();
          jButton5.setEnabled(true);
       }
       
        
        
        T2.setText(""+p1.inside);
        jButton5.setEnabled(true);
        return p1;
    }
    pawn checker(pawn f1,int pal,int farther)
    {
        for(int i=1;i<53;i++)
        {
            if(pal==f1.pos)
            {
                f1=play(f1,farther);
                fid=1;
            }
        }
        return f1;
    }
    pawn checkersafe(pawn f1,int pal,int farther)
    {   int colouriser;
        if(chance==0)
            colouriser=4;
        else 
            colouriser=chance;
        if(f1.col==colouriser)
        {
            for(int i=1;i<53;i++)
            {
                if(pal==f1.pos)
                {
                    f1=play(f1,farther);
                }
            }
        }
            
        return f1;
    }
    void valuecheck(int val,int far)
    {   
       if(val==1 || val==9 || val==14 || val==22 || val==27 || val==35 || val==40 || val==48)
    {
       yy1=checkersafe(yy1,val,far);
       yy2=checkersafe(yy2,val,far);
       yy3=checkersafe(yy3,val,far);
       yy4=checkersafe(yy4,val,far);
       rr1=checkersafe(rr1,val,far);
       rr2=checkersafe(rr2,val,far);
       rr3=checkersafe(rr3,val,far);
       rr4=checkersafe(rr4,val,far);
       bb1=checkersafe(bb1,val,far);
       bb2=checkersafe(bb2,val,far);
       bb3=checkersafe(bb3,val,far);
       bb4=checkersafe(bb4,val,far);
       gg1=checkersafe(gg1,val,far);
       gg2=checkersafe(gg2,val,far);
       gg3=checkersafe(gg3,val,far);
       gg4=checkersafe(gg4,val,far);       
    }
      else
        {
         fid=0;
            checker(yy1,val,far);
        if(fid==0)
            checker(yy2,val,far);
        if(fid==0)
            checker(yy3,val,far);
        if(fid==0)
            checker(yy4,val,far);
        if(fid==0)
            checker(rr1,val,far);
        if(fid==0)
            checker(rr2,val,far);
        if(fid==0)
            checker(rr3,val,far);
        if(fid==0)
            checker(rr4,val,far);
        if(fid==0)
            checker(bb1,val,far);
        if(fid==0)
            checker(bb2,val,far);
        if(fid==0)
            checker(bb3,val,far);
        if(fid==0)
            checker(bb4,val,far);
        if(fid==0)
            checker(gg1,val,far);
        if(fid==0)
            checker(gg2,val,far);
        if(fid==0)
            checker(gg3,val,far);
        if(fid==0)
            checker(gg4,val,far);
        }
       
        
    }
   void disableAll()
   {
       y1.setEnabled(false);
       y2.setEnabled(false);
       y3.setEnabled(false);
       y4.setEnabled(false);
       r1.setEnabled(false);
       r2.setEnabled(false);
       r3.setEnabled(false);
       r4.setEnabled(false);
       b1.setEnabled(false);
       b2.setEnabled(false);
       b3.setEnabled(false);
       b4.setEnabled(false);
       g1.setEnabled(false);
       g2.setEnabled(false);
       g3.setEnabled(false);
       g4.setEnabled(false);
   }
   void enableYellow(int number)
   {
      switch(number)
      {
          case 1: y1.setEnabled(true);break;
          case 2: y2.setEnabled(true);break;
          case 3: y3.setEnabled(true);break;
          case 4: y4.setEnabled(true);break;
          case 5:
          {
                y1.setEnabled(true);
                y2.setEnabled(true);
                y3.setEnabled(true);
                y4.setEnabled(true);
                break;
          }
      }
       
       
       

   }
   void enableRed(int number)
   {
       switch(number)
      {
          case 1: r1.setEnabled(true);break;
          case 2: r2.setEnabled(true);break;
          case 3: r3.setEnabled(true);break;
          case 4: r4.setEnabled(true);break;
          case 5:
          {
                r1.setEnabled(true);
                r2.setEnabled(true);
                r3.setEnabled(true);
                r4.setEnabled(true);
                break;
          }
       }
   }
   void enableBlue(int number)
   {
       switch(number)
      {
          case 1: b1.setEnabled(true);break;
          case 2: b2.setEnabled(true);break;
          case 3: b3.setEnabled(true);break;
          case 4: b4.setEnabled(true);break;
          case 5:
          {
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                break;
          }
       }
   }
   void enableGreen(int number)
   {
       switch(number)
      {
          case 1: g1.setEnabled(true);break;
          case 2: g2.setEnabled(true);break;
          case 3: g3.setEnabled(true);break;
          case 4: g4.setEnabled(true);break;
          case 5:
          {
                g1.setEnabled(true);
                g2.setEnabled(true);
                g3.setEnabled(true);
                g4.setEnabled(true);
                break;
          }
       }
   }
   void enabler(pawn c1)
   {
       if(c1.inside==1)
       {
          switch(c1.pos)
          {
            case 1:yr1.setEnabled(true);break;
            case 14:rb1.setEnabled(true);break;
            case 27:bg1.setEnabled(true);break;
            case 40:gy1.setEnabled(true);break;
            
            case 2:yr2.setEnabled(true);break;
            case 3:yr3.setEnabled(true);break;
            case 4:yr4.setEnabled(true);break;
            case 5:yr5.setEnabled(true);break;
            case 6:yr6.setEnabled(true);break;
            case 7:yr7.setEnabled(true);break;
            case 8:yr8.setEnabled(true);break;
            case 9:yr9.setEnabled(true);break;
            case 10:yr10.setEnabled(true);break;
            case 11:yr11.setEnabled(true);break;
            case 12:yr12.setEnabled(true);break;
            case 13:yr13.setEnabled(true);break;
            
            case 15:rb2.setEnabled(true);break;
            case 16:rb3.setEnabled(true);break;
            case 17:rb4.setEnabled(true);break;
            case 18:rb5.setEnabled(true);break;
            case 19:rb6.setEnabled(true);break;
            case 20:rb7.setEnabled(true);break;
            case 21:rb8.setEnabled(true);break;
            case 22:rb9.setEnabled(true);break;
            case 23:rb10.setEnabled(true);break;
            case 24:rb11.setEnabled(true);break;
            case 25:rb12.setEnabled(true);break;
            case 26:rb13.setEnabled(true);break;
            
            case 28:bg2.setEnabled(true);break;
            case 29:bg3.setEnabled(true);break;
            case 30:bg4.setEnabled(true);break;
            case 31:bg5.setEnabled(true);break;
            case 32:bg6.setEnabled(true);break;
            case 33:bg7.setEnabled(true);break;
            case 34:bg8.setEnabled(true);break;
            case 35:bg9.setEnabled(true);break;
            case 36:bg10.setEnabled(true);break;
            case 37:bg11.setEnabled(true);break;
            case 38:bg12.setEnabled(true);break;
            case 39:bg13.setEnabled(true);break;
            
            case 41:gy2.setEnabled(true);break;
            case 42:gy3.setEnabled(true);break;
            case 43:gy4.setEnabled(true);break;
            case 44:gy5.setEnabled(true);break;
            case 45:gy6.setEnabled(true);break;
            case 46:gy7.setEnabled(true);break;
            case 47:gy8.setEnabled(true);break;
            case 48:gy9.setEnabled(true);break;
            case 49:gy10.setEnabled(true);break;
            case 50:gy11.setEnabled(true);break;
            case 51:gy12.setEnabled(true);break;
            case 52:gy13.setEnabled(true);break;
              
          }
       }
      
  
   }
   void dicer(int howfar)
   {
       jButton5.setEnabled(false);
       switch(chance)
        {
            case 0://Yellow Plays
            {
                
                    
                T1.setText("Player : Yellow");
                T1.setBackground(new java.awt.Color(255, 255, 0));
                if(howfar!=6)
                    chance++;
               
                if(yy1.inside==0 && yy2.inside==0 &&  yy3.inside==0 && yy4.inside==0)
                    jButton5.setEnabled(true);
                    else
                    {    
                        enabler(yy1);
                        enabler(yy2);
                        enabler(yy3);
                        enabler(yy4);
                    }
                break;
            }
               
            case 1://Red Plays
            {
                disableAll();
                T1.setText("Player : Red");
                T1.setBackground(new java.awt.Color(204, 0, 51));
                if(howfar!=6)
                    chance++;
                if(yy1.inside==0 && yy2.inside==0 &&  yy3.inside==0 && yy4.inside==0)
                    jButton5.setEnabled(true);
                    else
                    {    
                        enabler(yy1);
                        enabler(yy2);
                        enabler(yy3);
                        enabler(yy4);
                    }
                break;
            }
               
            case 2://Blue Plays
            {
                disableAll();
                T1.setText("Player : Blue");
                T1.setBackground(new java.awt.Color(51, 0, 204));
                 if(dicenum!=6)
                    chance++;
                 switch(howfar)
                 {
                    case 6:
                    {
                       enableBlue(5);
                        break;
                    }
                    default:
                    {
                        if(bb1.inside==0 && bb2.inside==0 && bb3.inside==0 && bb4.inside==0)
                            jButton5.setEnabled(true);
                        else
                        {
                            enabler(bb1);
                             enabler(bb2);
                              enabler(bb3);
                               enabler(bb4);
                               
                        }
                    }
                 }
                 break;
            }
            case 3://Green Plays
            {
                disableAll();
                T1.setText("Player : Green");
                T1.setBackground(new java.awt.Color(51, 153, 0));
                 if(dicenum!=6)
                    chance=0;
                 switch(howfar)
                 {
                   case 6:
                    {
                       
                        enableGreen(5);
                        break;
                    }
                   default:
                   {
                       
                        if(gg1.inside==0 && gg2.inside==0 && gg3.inside==0 && gg4.inside==0)
                            jButton5.setEnabled(true);
                        else
                        {
                            enabler(gg1);
                            enabler(gg2);
                            enabler(gg3);
                            enabler(gg4);
                        }
                   }
                 }
                 break;
            }
    
        }
        
   }
    public UI1() {
        initComponents();
       setSize(1400,1200);
        setLocationRelativeTo(null);
        
        setup();
        
        
 
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        panel9 = new java.awt.Panel();
        r1 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r4 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        panel12 = new java.awt.Panel();
        y1 = new javax.swing.JButton();
        y2 = new javax.swing.JButton();
        y3 = new javax.swing.JButton();
        y4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panel16 = new java.awt.Panel();
        rb11 = new javax.swing.JButton();
        rb10 = new javax.swing.JButton();
        rb9 = new javax.swing.JButton();
        rb8 = new javax.swing.JButton();
        rb7 = new javax.swing.JButton();
        rb6 = new javax.swing.JButton();
        panel17 = new java.awt.Panel();
        rb12 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        panel18 = new java.awt.Panel();
        rb13 = new javax.swing.JButton();
        bg1 = new javax.swing.JButton();
        bg2 = new javax.swing.JButton();
        bg3 = new javax.swing.JButton();
        bg4 = new javax.swing.JButton();
        bg5 = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        panel10 = new java.awt.Panel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        panel13 = new java.awt.Panel();
        yr13 = new javax.swing.JButton();
        rb1 = new javax.swing.JButton();
        rb2 = new javax.swing.JButton();
        rb3 = new javax.swing.JButton();
        rb4 = new javax.swing.JButton();
        rb5 = new javax.swing.JButton();
        panel14 = new java.awt.Panel();
        yr12 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        panel15 = new java.awt.Panel();
        yr11 = new javax.swing.JButton();
        yr10 = new javax.swing.JButton();
        yr9 = new javax.swing.JButton();
        yr8 = new javax.swing.JButton();
        yr7 = new javax.swing.JButton();
        yr6 = new javax.swing.JButton();
        panel6 = new java.awt.Panel();
        panel19 = new java.awt.Panel();
        bg6 = new javax.swing.JButton();
        bg7 = new javax.swing.JButton();
        bg8 = new javax.swing.JButton();
        bg9 = new javax.swing.JButton();
        bg10 = new javax.swing.JButton();
        bg11 = new javax.swing.JButton();
        panel20 = new java.awt.Panel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        bg12 = new javax.swing.JButton();
        panel21 = new java.awt.Panel();
        gy5 = new javax.swing.JButton();
        gy4 = new javax.swing.JButton();
        gy3 = new javax.swing.JButton();
        gy2 = new javax.swing.JButton();
        gy1 = new javax.swing.JButton();
        bg13 = new javax.swing.JButton();
        panel7 = new java.awt.Panel();
        panel11 = new java.awt.Panel();
        g1 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        panel8 = new java.awt.Panel();
        panel22 = new java.awt.Panel();
        yr5 = new javax.swing.JButton();
        yr4 = new javax.swing.JButton();
        yr3 = new javax.swing.JButton();
        yr2 = new javax.swing.JButton();
        yr1 = new javax.swing.JButton();
        gy13 = new javax.swing.JButton();
        panel23 = new java.awt.Panel();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        gy12 = new javax.swing.JButton();
        panel24 = new java.awt.Panel();
        gy6 = new javax.swing.JButton();
        gy7 = new javax.swing.JButton();
        gy8 = new javax.swing.JButton();
        gy9 = new javax.swing.JButton();
        gy10 = new javax.swing.JButton();
        gy11 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ludo");

        panel1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setPreferredSize(new java.awt.Dimension(500, 500));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel3.setBackground(new java.awt.Color(204, 0, 51));
        panel3.setPreferredSize(new java.awt.Dimension(400, 400));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel9.setBackground(new java.awt.Color(153, 153, 153));
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        r1.setEnabled(false);
        r1.setBackground(new java.awt.Color(204, 204, 204));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        panel9.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        r3.setEnabled(false);
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        panel9.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        r2.setEnabled(false);
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        panel9.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        r4.setEnabled(false);
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        panel9.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel3.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        panel2.setBackground(new java.awt.Color(255, 255, 0));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel12.setBackground(new java.awt.Color(0, 0, 0));
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        y1.setEnabled(false);
        y1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });
        panel12.add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        y2.setEnabled(false);
        y2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
            }
        });
        panel12.add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        y3.setEnabled(false);
        y3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });
        panel12.add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        y4.setEnabled(false);
        y4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y4ActionPerformed(evt);
            }
        });
        panel12.add(y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel2.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 400, 400));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel16.setBackground(new java.awt.Color(102, 102, 255));
        panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb11.setEnabled(false);
        rb11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb11ActionPerformed(evt);
            }
        });
        panel16.add(rb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        rb10.setEnabled(false);
        rb10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb10ActionPerformed(evt);
            }
        });
        panel16.add(rb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 70));

        rb9.setEnabled(false);
        rb9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5)));
        rb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb9ActionPerformed(evt);
            }
        });
        panel16.add(rb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 70, 70));

        rb8.setEnabled(false);
        rb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb8ActionPerformed(evt);
            }
        });
        panel16.add(rb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 70));

        rb7.setEnabled(false);
        rb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb7ActionPerformed(evt);
            }
        });
        panel16.add(rb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, 70));

        rb6.setEnabled(false);
        rb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });
        panel16.add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, 50));

        jPanel1.add(panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 400));

        panel17.setBackground(new java.awt.Color(0, 204, 255));
        panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb12.setEnabled(false);
        rb12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb12ActionPerformed(evt);
            }
        });
        panel17.add(rb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 70));

        jButton66.setEnabled(false);
        jButton66.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 70));

        jButton67.setEnabled(false);
        jButton67.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, 70));

        jButton68.setEnabled(false);
        jButton68.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 60, 70));

        jButton69.setEnabled(false);
        jButton69.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 70));

        jButton70.setEnabled(false);
        jButton70.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 60, 50));

        jPanel1.add(panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 400));

        panel18.setBackground(new java.awt.Color(102, 102, 255));
        panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb13.setEnabled(false);
        rb13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb13ActionPerformed(evt);
            }
        });
        panel18.add(rb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        bg1.setEnabled(false);
        bg1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        bg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg1ActionPerformed(evt);
            }
        });
        panel18.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 70));

        bg2.setEnabled(false);
        bg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg2ActionPerformed(evt);
            }
        });
        panel18.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 70, 70));

        bg3.setEnabled(false);
        bg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg3ActionPerformed(evt);
            }
        });
        panel18.add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 70));

        bg4.setEnabled(false);
        bg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg4ActionPerformed(evt);
            }
        });
        panel18.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, 70));

        bg5.setEnabled(false);
        bg5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg5ActionPerformed(evt);
            }
        });
        panel18.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, 50));

        jPanel1.add(panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 400));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 400));

        panel4.setBackground(new java.awt.Color(51, 0, 204));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel10.setBackground(new java.awt.Color(0, 0, 0));
        panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setEnabled(false);
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel10.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        b2.setEnabled(false);
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        panel10.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        b3.setEnabled(false);
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel10.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        b4.setEnabled(false);
        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel10.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel4.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 400, 400));

        panel5.setBackground(new java.awt.Color(255, 51, 102));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel13.setBackground(new java.awt.Color(255, 51, 153));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr13.setEnabled(false);
        yr13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr13ActionPerformed(evt);
            }
        });
        panel13.add(yr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        rb1.setEnabled(false);
        rb1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5)));
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        panel13.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        rb2.setEnabled(false);
        rb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        panel13.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        rb3.setEnabled(false);
        rb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        panel13.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        rb4.setEnabled(false);
        rb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        panel13.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        rb5.setEnabled(false);
        rb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });
        panel13.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 70));

        panel5.add(panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        panel14.setBackground(new java.awt.Color(255, 102, 204));
        panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr12.setEnabled(false);
        yr12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr12ActionPerformed(evt);
            }
        });
        panel14.add(yr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jButton84.setEnabled(false);
        jButton84.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 60));

        jButton85.setEnabled(false);
        jButton85.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 60));

        jButton86.setEnabled(false);
        jButton86.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 60));

        jButton87.setEnabled(false);
        jButton87.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 60));

        jButton88.setEnabled(false);
        jButton88.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 60));

        panel5.add(panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 60));

        panel15.setBackground(new java.awt.Color(255, 51, 153));
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr11.setEnabled(false);
        yr11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr11ActionPerformed(evt);
            }
        });
        panel15.add(yr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        yr10.setEnabled(false);
        yr10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr10ActionPerformed(evt);
            }
        });
        panel15.add(yr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        yr9.setEnabled(false);
        yr9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        yr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr9ActionPerformed(evt);
            }
        });
        panel15.add(yr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        yr8.setEnabled(false);
        yr8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr8ActionPerformed(evt);
            }
        });
        panel15.add(yr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        yr7.setEnabled(false);
        yr7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr7ActionPerformed(evt);
            }
        });
        panel15.add(yr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        yr6.setEnabled(false);
        yr6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr6ActionPerformed(evt);
            }
        });
        panel15.add(yr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 70));

        panel5.add(panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 70));

        panel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 400, 200));

        panel6.setBackground(new java.awt.Color(153, 255, 153));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel19.setBackground(new java.awt.Color(0, 102, 0));
        panel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg6.setEnabled(false);
        bg6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg6ActionPerformed(evt);
            }
        });
        panel19.add(bg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 70));

        bg7.setEnabled(false);
        bg7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg7ActionPerformed(evt);
            }
        });
        panel19.add(bg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 70));

        bg8.setEnabled(false);
        bg8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg8ActionPerformed(evt);
            }
        });
        panel19.add(bg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 70));

        bg9.setEnabled(false);
        bg9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        bg9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg9ActionPerformed(evt);
            }
        });
        panel19.add(bg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 70));

        bg10.setEnabled(false);
        bg10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg10ActionPerformed(evt);
            }
        });
        panel19.add(bg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 70));

        bg11.setEnabled(false);
        bg11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg11ActionPerformed(evt);
            }
        });
        panel19.add(bg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 70));

        panel6.add(panel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        panel20.setBackground(new java.awt.Color(102, 255, 0));
        panel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton71.setEnabled(false);
        jButton71.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jButton72.setEnabled(false);
        jButton72.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 60));

        jButton71.setEnabled(false);
        jButton73.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 60));

        jButton74.setEnabled(false);
        jButton74.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 60));

        jButton75.setEnabled(false);
        jButton75.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 60));

        bg12.setEnabled(false);
        bg12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg12ActionPerformed(evt);
            }
        });
        panel20.add(bg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 60));

        panel6.add(panel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 60));

        panel21.setBackground(new java.awt.Color(51, 102, 0));
        panel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gy5.setEnabled(false);
        gy5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy5ActionPerformed(evt);
            }
        });
        panel21.add(gy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 70));

        gy4.setEnabled(false);
        gy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy4ActionPerformed(evt);
            }
        });
        panel21.add(gy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 70));

        gy3.setEnabled(false);
        gy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy3ActionPerformed(evt);
            }
        });
        panel21.add(gy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 70));

        gy2.setEnabled(false);
        gy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy2ActionPerformed(evt);
            }
        });
        panel21.add(gy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 70));

        gy1.setEnabled(false);
        gy1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 5)));
        gy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy1ActionPerformed(evt);
            }
        });
        panel21.add(gy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 70));

        bg13.setEnabled(false);
        bg13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg13ActionPerformed(evt);
            }
        });
        panel21.add(bg13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 70));

        panel6.add(panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 70));

        panel1.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 400, 200));

        panel7.setBackground(new java.awt.Color(51, 153, 0));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel11.setBackground(new java.awt.Color(0, 0, 0));
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g1.setEnabled(false);
        g1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        panel11.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        g2.setEnabled(false);
        g2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });
        panel11.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        g3.setEnabled(false);
        g3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        panel11.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        g4.setEnabled(false);
        g4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });
        panel11.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel7.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 400, 400));

        panel8.setBackground(new java.awt.Color(255, 255, 153));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel22.setBackground(new java.awt.Color(255, 204, 0));
        panel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr5.setEnabled(false);
        yr5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr5ActionPerformed(evt);
            }
        });
        panel22.add(yr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        yr4.setEnabled(false);
        yr4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr4ActionPerformed(evt);
            }
        });
        panel22.add(yr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 70));

        yr3.setEnabled(false);
        yr3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr3ActionPerformed(evt);
            }
        });
        panel22.add(yr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 70));

        yr2.setEnabled(false);
        yr2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr2ActionPerformed(evt);
            }
        });
        panel22.add(yr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, 70));

        yr1.setEnabled(false);
        yr1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        yr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr1ActionPerformed(evt);
            }
        });
        panel22.add(yr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 70, 70));

        gy13.setEnabled(false);
        gy13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy13ActionPerformed(evt);
            }
        });
        panel22.add(gy13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 70));

        panel8.add(panel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 400));

        panel23.setBackground(new java.awt.Color(255, 255, 102));
        panel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton77.setEnabled(false);
        jButton77.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jButton78.setEnabled(false);
        jButton78.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 70));

        jButton79.setEnabled(false);
        jButton79.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 60, 70));

        jButton80.setEnabled(false);
        jButton80.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 70));

        jButton81.setEnabled(false);
        jButton81.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 60, 70));

        gy12.setEnabled(false);
        gy12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy12ActionPerformed(evt);
            }
        });
        panel23.add(gy12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 60, 70));

        panel8.add(panel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 400));

        panel24.setBackground(new java.awt.Color(255, 204, 0));
        panel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gy6.setEnabled(false);
        gy6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy6ActionPerformed(evt);
            }
        });
        panel24.add(gy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        gy7.setEnabled(false);
        gy7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy7ActionPerformed(evt);
            }
        });
        panel24.add(gy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 70));

        gy8.setEnabled(false);
        gy8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy8ActionPerformed(evt);
            }
        });
        panel24.add(gy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 70));

        gy9.setEnabled(false);
        gy9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        gy9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy9ActionPerformed(evt);
            }
        });
        panel24.add(gy9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, 70));

        gy10.setEnabled(false);
        gy10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy10ActionPerformed(evt);
            }
        });
        panel24.add(gy10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 70, 70));

        gy11.setEnabled(false);
        gy11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        gy11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gy11ActionPerformed(evt);
            }
        });
        panel24.add(gy11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 70));

        panel8.add(panel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 400));

        panel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 200, 400));

        jButton89.setEnabled(false);
        panel1.add(jButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 200, 200));

        jButton90.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton90.setText("Exit");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        panel1.add(jButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 650, 220, 70));

        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 220, 220));

        T1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        panel1.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 220, 60));
        panel1.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 210, 60));

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        Icon iconred=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\x-mark-48 (1).png");
        Icon iconyellow=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\x-mark-48.png");
        Icon icongreen=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\x-mark-48 (3).png");
        Icon iconblue=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\x-mark-48 (2).png");
        Icon iconmiddle=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\");
           
        Icon icondiceone=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-one.png");
        Icon icondicetwo=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-two.png");
        Icon icondicethree=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-three.png");
        Icon icondicefour=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-four.png");
        Icon icondicefive=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-five.png");
        Icon icondicesix=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-six.png");
        int dicenum;
        int chance=0;
        int currentval;
        int fid=0;
        pawn yy1=new pawn(1,53,1,0);
        pawn yy2=new pawn(2,54,1,0);
        pawn yy3=new pawn(3,55,1,0);
        pawn yy4=new pawn(4,56,1,0);
        pawn rr1=new pawn(5,57,2,0);
        pawn rr2=new pawn(6,58,2,0);
        pawn rr3=new pawn(7,59,2,0);
        pawn rr4=new pawn(8,60,2,0);
        pawn bb1=new pawn(9,61,3,0);
        pawn bb2=new pawn(10,62,3,0);
        pawn bb3=new pawn(11,63,3,0);
        pawn bb4=new pawn(12,64,3,0);
        pawn gg1=new pawn(13,65,4,0);
        pawn gg2=new pawn(14,66,4,0);
        pawn gg3=new pawn(15,67,4,0);
        pawn gg4=new pawn(16,68,4,0);
        
      //  UI1.setIcon(icondicefive);
    // Clicklistener click= new Clicklistener();
           
    private void yr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr13ActionPerformed
     yr13.setEnabled(false);
       yr13.setIcon(null);
      yr13.setDisabledIcon(null);
       valuecheck(13,dicenum);
    }//GEN-LAST:event_yr13ActionPerformed

       
    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dicenum=ThreadLocalRandom.current().nextInt(1,7);
        switch(dicenum)
        {
            case 1: jButton5.setIcon(icondiceone);break;
            case 2: jButton5.setIcon(icondicetwo);break;
            case 3: jButton5.setIcon(icondicethree);break;
            case 4: jButton5.setIcon(icondicefour);break;
            case 5: jButton5.setIcon(icondicefive);break;
            case 6: jButton5.setIcon(icondicesix);break;
        }
        
        dicer(dicenum);
        //jButton5.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed
//yellow house played
    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        
        y1.setEnabled(false);
        y1.setIcon(null);
      y1.setDisabledIcon(null);
       yy1=play(yy1,dicenum);

    }//GEN-LAST:event_y1ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
        y2.setEnabled(false);
        y2.setIcon(null);
          y2.setDisabledIcon(null);
        yy2= play(yy2,dicenum);
    }//GEN-LAST:event_y2ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
        y3.setEnabled(false);
        y3.setIcon(null);
          y3.setDisabledIcon(null);
        yy3=play(yy3,dicenum);
    }//GEN-LAST:event_y3ActionPerformed

    private void y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y4ActionPerformed
        y4.setEnabled(false);
        y4.setIcon(null);
          y4.setDisabledIcon(null);
        yy4=play(yy4,dicenum);
    }//GEN-LAST:event_y4ActionPerformed
//red house played
    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        r1.setEnabled(false);
        r1.setIcon(null);
        r1.setDisabledIcon(null);
        rr1=play(rr1,dicenum);
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        r2.setEnabled(false);
        r2.setIcon(null);
        r2.setDisabledIcon(null);
        rr2=play(rr2,dicenum);
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
      r3.setEnabled(false);
        r3.setIcon(null);
        r3.setDisabledIcon(null);
        rr3=play(rr3,dicenum);
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
         r4.setEnabled(false);
        r4.setIcon(null);
        r4.setDisabledIcon(null);
        rr4=play(rr4,dicenum);
       
    }//GEN-LAST:event_r4ActionPerformed
//blue house played
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setEnabled(false);
        b1.setIcon(null);
        b1.setDisabledIcon(null);
        bb1=play(bb1,dicenum);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setEnabled(false);
        b2.setIcon(null);
        b2.setDisabledIcon(null);
        bb2=play(bb2,dicenum); 
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         b3.setEnabled(false);
        b3.setIcon(null);
        b3.setDisabledIcon(null);
        bb3=play(bb3,dicenum);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
         b4.setEnabled(false);
        b4.setIcon(null);
        b4.setDisabledIcon(null);
        bb4=play(bb4,dicenum);
    }//GEN-LAST:event_b4ActionPerformed
//green house played
    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        g1.setEnabled(false);
        g1.setIcon(null);
        g1.setDisabledIcon(null);
        gg1=play(gg1,dicenum);
    }//GEN-LAST:event_g1ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        g2.setEnabled(false);
        g2.setIcon(null);
        g2.setDisabledIcon(null);
        gg2=play(gg2,dicenum);        
    }//GEN-LAST:event_g2ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        g3.setEnabled(false);
        g3.setIcon(null);
        g3.setDisabledIcon(null);
        gg3=play(gg3,dicenum);
    }//GEN-LAST:event_g3ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        g4.setEnabled(false);
        g4.setIcon(null);
        g4.setDisabledIcon(null);
        gg4=play(gg4,dicenum);
    }//GEN-LAST:event_g4ActionPerformed

    private void yr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr1ActionPerformed
        yr1.setEnabled(false);
        yr1.setIcon(null);
      yr1.setDisabledIcon(null);
        valuecheck(1,dicenum);
      
    }//GEN-LAST:event_yr1ActionPerformed

    private void yr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr2ActionPerformed
      yr2.setEnabled(false);
        yr2.setIcon(null);
      yr2.setDisabledIcon(null);
        valuecheck(2,dicenum);
       
    }//GEN-LAST:event_yr2ActionPerformed

    private void yr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr3ActionPerformed
       yr3.setEnabled(false);
        yr3.setIcon(null);
      yr3.setDisabledIcon(null);
        valuecheck(3,dicenum);
       
    }//GEN-LAST:event_yr3ActionPerformed

    private void yr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr4ActionPerformed
       yr4.setEnabled(false);
        yr4.setIcon(null);
      yr4.setDisabledIcon(null);
        valuecheck(4,dicenum);
      
    }//GEN-LAST:event_yr4ActionPerformed

    private void yr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr5ActionPerformed
       yr5.setEnabled(false);
        yr5.setIcon(null);
    yr5.setDisabledIcon(null);
        valuecheck(5,dicenum);
       
    }//GEN-LAST:event_yr5ActionPerformed

    private void yr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr6ActionPerformed
          yr6.setEnabled(false);
        yr6.setIcon(null);
     yr6.setDisabledIcon(null);
        valuecheck(6,dicenum);
      
    }//GEN-LAST:event_yr6ActionPerformed

    private void yr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr7ActionPerformed
       
        yr7.setEnabled(false);
        yr7.setIcon(null);
      yr7.setDisabledIcon(null);
       valuecheck(7,dicenum);
    }//GEN-LAST:event_yr7ActionPerformed

    private void yr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr8ActionPerformed
       yr8.setEnabled(false);
        yr8.setIcon(null);
       yr8.setDisabledIcon(null);
        valuecheck(8,dicenum);
       
    }//GEN-LAST:event_yr8ActionPerformed

    private void yr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr9ActionPerformed
     yr9.setEnabled(false);
       yr9.setIcon(null);
       yr9.setDisabledIcon(null);
         valuecheck(9,dicenum);
    }//GEN-LAST:event_yr9ActionPerformed

    private void yr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr10ActionPerformed
       yr10.setEnabled(false);
        yr10.setIcon(null);
       yr10.setDisabledIcon(null);
        valuecheck(10,dicenum);
       
    }//GEN-LAST:event_yr10ActionPerformed

    private void yr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr11ActionPerformed
        yr11.setEnabled(false);
        yr11.setIcon(null);
      yr11.setDisabledIcon(null);
        valuecheck(11,dicenum);
      
    }//GEN-LAST:event_yr11ActionPerformed

    private void yr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr12ActionPerformed
         yr12.setEnabled(false);
        yr12.setIcon(null);
      yr12.setDisabledIcon(null);
        valuecheck(12,dicenum);
      
    }//GEN-LAST:event_yr12ActionPerformed

    private void rb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb7ActionPerformed
        rb7.setEnabled(false); 
        rb7.setIcon(null);
      rb7.setDisabledIcon(null);
        valuecheck(20,dicenum);
       
    }//GEN-LAST:event_rb7ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
         rb1.setIcon(null); 
        rb1.setEnabled(false); 
       
      rb1.setDisabledIcon(null);
        valuecheck(14,dicenum);
     
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        rb2.setEnabled(false);
        rb2.setIcon(null);
      rb2.setDisabledIcon(null);
        valuecheck(15,dicenum);
       
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        rb3.setEnabled(false);
        rb3.setIcon(null);
      rb3.setDisabledIcon(null);
        valuecheck(16,dicenum);
       
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
       rb4.setEnabled(false);
        rb4.setIcon(null);
      rb4.setDisabledIcon(null);
        valuecheck(17,dicenum);
       
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
      rb5.setIcon(null);
        rb5.setEnabled(false);
        
       rb5.setDisabledIcon(null);
        valuecheck(18,dicenum);
       
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
         rb6.setIcon(null); 
        rb6.setEnabled(false);
       
      rb6.setDisabledIcon(null);
        valuecheck(19,dicenum);
       
    }//GEN-LAST:event_rb6ActionPerformed

    private void rb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb8ActionPerformed
       rb8.setIcon(null);
        rb8.setEnabled(false);
       
       rb8.setDisabledIcon(null);
        valuecheck(21,dicenum);
       
    }//GEN-LAST:event_rb8ActionPerformed

    private void rb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb9ActionPerformed
        rb9.setIcon(null);
        rb9.setEnabled(false); 
       
       rb9.setDisabledIcon(null);
        valuecheck(22,dicenum);
      
    }//GEN-LAST:event_rb9ActionPerformed

    private void rb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb10ActionPerformed
        rb10.setIcon(null);
        rb10.setEnabled(false);
        
       rb10.setDisabledIcon(null);
        valuecheck(23,dicenum);
       
    }//GEN-LAST:event_rb10ActionPerformed

    private void rb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb11ActionPerformed
        rb11.setIcon(null);
       rb11.setEnabled(false);
       rb11.setDisabledIcon(null);
        valuecheck(24,dicenum);
      
    }//GEN-LAST:event_rb11ActionPerformed

    private void rb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb12ActionPerformed
      rb12.setIcon(null);
       rb12.setEnabled(false);
       rb12.setDisabledIcon(null);
        valuecheck(25,dicenum);
       
    }//GEN-LAST:event_rb12ActionPerformed

    private void rb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb13ActionPerformed
        rb13.setIcon(null);
       rb13.setEnabled(false);
       rb13.setDisabledIcon(null);
        valuecheck(26,dicenum);
       
    }//GEN-LAST:event_rb13ActionPerformed

    private void bg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg1ActionPerformed
        bg1.setIcon(null);
       bg1.setEnabled(false);
       bg1.setDisabledIcon(null);
        valuecheck(27,dicenum);
      
    }//GEN-LAST:event_bg1ActionPerformed

    private void bg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg2ActionPerformed
        bg2.setIcon(null);
       bg2.setEnabled(false);
        bg2.setDisabledIcon(null);
        valuecheck(28,dicenum);
      
    }//GEN-LAST:event_bg2ActionPerformed

    private void bg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg3ActionPerformed
      bg3.setIcon(null);
       bg3.setEnabled(false);
        bg3.setDisabledIcon(null);
        valuecheck(29,dicenum);
       
    }//GEN-LAST:event_bg3ActionPerformed

    private void bg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg4ActionPerformed
         bg4.setIcon(null);
       bg4.setEnabled(false);
        bg4.setDisabledIcon(null);
        valuecheck(30,dicenum);
     
    }//GEN-LAST:event_bg4ActionPerformed

    private void bg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg5ActionPerformed
       bg5.setIcon(null);
       bg5.setEnabled(false);
        bg5.setDisabledIcon(null);
        valuecheck(31,dicenum);
       
    }//GEN-LAST:event_bg5ActionPerformed

    private void bg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg6ActionPerformed
     bg6.setIcon(null);
       bg6.setEnabled(false);
        bg6.setDisabledIcon(null);
        valuecheck(32,dicenum);
       
    }//GEN-LAST:event_bg6ActionPerformed

    private void bg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg7ActionPerformed
      bg7.setIcon(null);
       bg7.setEnabled(false);
        bg7.setDisabledIcon(null);
        valuecheck(33,dicenum);
       
    }//GEN-LAST:event_bg7ActionPerformed

    private void bg8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg8ActionPerformed
      bg8.setIcon(null);
       bg8.setEnabled(false);
        bg8.setDisabledIcon(null);
        valuecheck(34,dicenum);
      
    }//GEN-LAST:event_bg8ActionPerformed

    private void bg9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg9ActionPerformed
      bg9.setIcon(null);
       bg9.setEnabled(false);
        bg9.setDisabledIcon(null);
        valuecheck(35,dicenum);
      
    }//GEN-LAST:event_bg9ActionPerformed

    private void bg10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg10ActionPerformed
      bg10.setIcon(null);
       bg10.setEnabled(false);
        bg10.setDisabledIcon(null);
        valuecheck(36,dicenum);
       
    }//GEN-LAST:event_bg10ActionPerformed

    private void bg11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg11ActionPerformed
      bg11.setIcon(null);
       bg11.setEnabled(false);
        bg11.setDisabledIcon(null);
        valuecheck(37,dicenum);
       
    }//GEN-LAST:event_bg11ActionPerformed

    private void bg12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg12ActionPerformed
        bg12.setIcon(null);
       bg12.setEnabled(false);
        bg12.setDisabledIcon(null);
        valuecheck(38,dicenum);
      
    }//GEN-LAST:event_bg12ActionPerformed

    private void bg13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg13ActionPerformed
       bg13.setIcon(null);
       bg13.setEnabled(false);
        bg13.setDisabledIcon(null);
        valuecheck(39,dicenum);
      
    }//GEN-LAST:event_bg13ActionPerformed

    private void gy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy1ActionPerformed
      gy1.setIcon(null);
       gy1.setEnabled(false);
        gy1.setDisabledIcon(null);
        valuecheck(40,dicenum);
       
    }//GEN-LAST:event_gy1ActionPerformed

    private void gy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy2ActionPerformed
    gy2.setIcon(null);
       gy2.setEnabled(false);
        gy2.setDisabledIcon(null);
        valuecheck(41,dicenum);
      
    }//GEN-LAST:event_gy2ActionPerformed

    private void gy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy3ActionPerformed
     gy3.setIcon(null);
       gy3.setEnabled(false);
        gy3.setDisabledIcon(null);
        valuecheck(42,dicenum);
       
    }//GEN-LAST:event_gy3ActionPerformed

    private void gy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy4ActionPerformed
    gy4.setIcon(null);
       gy4.setEnabled(false);
        gy4.setDisabledIcon(null);
        valuecheck(43,dicenum);
       
    }//GEN-LAST:event_gy4ActionPerformed

    private void gy6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy6ActionPerformed
     gy6.setIcon(null);
       gy6.setEnabled(false);
        gy6.setDisabledIcon(null);
        valuecheck(45,dicenum);
       
    }//GEN-LAST:event_gy6ActionPerformed

    private void gy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy5ActionPerformed
      gy5.setIcon(null);
       gy5.setEnabled(false);
        gy5.setDisabledIcon(null);
        valuecheck(44,dicenum);
      
    }//GEN-LAST:event_gy5ActionPerformed

    private void gy7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy7ActionPerformed
       gy7.setIcon(null);
       gy7.setEnabled(false);
        gy7.setDisabledIcon(null);
        valuecheck(46,dicenum);
       
    }//GEN-LAST:event_gy7ActionPerformed

    private void gy8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy8ActionPerformed
       gy8.setIcon(null);
       gy8.setEnabled(false);
        gy8.setDisabledIcon(null);
        valuecheck(47,dicenum);
      
    }//GEN-LAST:event_gy8ActionPerformed

    private void gy9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy9ActionPerformed
       gy9.setIcon(null);
       gy9.setEnabled(false);
        gy9.setDisabledIcon(null);
        valuecheck(48,dicenum);
      
    }//GEN-LAST:event_gy9ActionPerformed

    private void gy10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy10ActionPerformed
      gy10.setIcon(null);
       gy10.setEnabled(false);
        gy10.setDisabledIcon(null);
        valuecheck(49,dicenum);
       
    }//GEN-LAST:event_gy10ActionPerformed

    private void gy11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy11ActionPerformed
     gy11.setIcon(null);
       gy11.setEnabled(false);
        gy11.setDisabledIcon(null);
        valuecheck(50,dicenum);
       
    }//GEN-LAST:event_gy11ActionPerformed

    private void gy12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy12ActionPerformed
      gy12.setIcon(null);
       gy12.setEnabled(false);
        gy12.setDisabledIcon(null);
        valuecheck(51,dicenum);
       
    }//GEN-LAST:event_gy12ActionPerformed

    private void gy13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gy13ActionPerformed
      gy13.setIcon(null);
       gy13.setEnabled(false);
        gy13.setDisabledIcon(null);
        valuecheck(52,dicenum);
       
    }//GEN-LAST:event_gy13ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    public javax.swing.JButton b1;
    public javax.swing.JButton b2;
    public javax.swing.JButton b3;
    public javax.swing.JButton b4;
    private javax.swing.JButton bg1;
    private javax.swing.JButton bg10;
    private javax.swing.JButton bg11;
    private javax.swing.JButton bg12;
    private javax.swing.JButton bg13;
    private javax.swing.JButton bg2;
    private javax.swing.JButton bg3;
    private javax.swing.JButton bg4;
    private javax.swing.JButton bg5;
    private javax.swing.JButton bg6;
    private javax.swing.JButton bg7;
    private javax.swing.JButton bg8;
    private javax.swing.JButton bg9;
    public javax.swing.JButton g1;
    public javax.swing.JButton g2;
    public javax.swing.JButton g3;
    public javax.swing.JButton g4;
    private javax.swing.JButton gy1;
    private javax.swing.JButton gy10;
    private javax.swing.JButton gy11;
    private javax.swing.JButton gy12;
    private javax.swing.JButton gy13;
    private javax.swing.JButton gy2;
    private javax.swing.JButton gy3;
    private javax.swing.JButton gy4;
    private javax.swing.JButton gy5;
    private javax.swing.JButton gy6;
    private javax.swing.JButton gy7;
    private javax.swing.JButton gy8;
    private javax.swing.JButton gy9;
    public javax.swing.JButton jButton5;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel10;
    private java.awt.Panel panel11;
    private java.awt.Panel panel12;
    private java.awt.Panel panel13;
    private java.awt.Panel panel14;
    private java.awt.Panel panel15;
    private java.awt.Panel panel16;
    private java.awt.Panel panel17;
    private java.awt.Panel panel18;
    private java.awt.Panel panel19;
    private java.awt.Panel panel2;
    private java.awt.Panel panel20;
    private java.awt.Panel panel21;
    private java.awt.Panel panel22;
    private java.awt.Panel panel23;
    private java.awt.Panel panel24;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    public javax.swing.JButton r1;
    public javax.swing.JButton r2;
    public javax.swing.JButton r3;
    public javax.swing.JButton r4;
    private javax.swing.JButton rb1;
    private javax.swing.JButton rb10;
    public javax.swing.JButton rb11;
    private javax.swing.JButton rb12;
    private javax.swing.JButton rb13;
    private javax.swing.JButton rb2;
    private javax.swing.JButton rb3;
    private javax.swing.JButton rb4;
    private javax.swing.JButton rb5;
    private javax.swing.JButton rb6;
    private javax.swing.JButton rb7;
    private javax.swing.JButton rb8;
    private javax.swing.JButton rb9;
    public javax.swing.JButton y1;
    public javax.swing.JButton y2;
    public javax.swing.JButton y3;
    public javax.swing.JButton y4;
    public javax.swing.JButton yr1;
    public javax.swing.JButton yr10;
    public javax.swing.JButton yr11;
    public javax.swing.JButton yr12;
    public javax.swing.JButton yr13;
    public javax.swing.JButton yr2;
    public javax.swing.JButton yr3;
    public javax.swing.JButton yr4;
    public javax.swing.JButton yr5;
    private javax.swing.JButton yr6;
    private javax.swing.JButton yr7;
    public javax.swing.JButton yr8;
    public javax.swing.JButton yr9;
    // End of variables declaration//GEN-END:variables
}
