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

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Sourav
 */

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
    void play(int distance,int runner)
    {
        
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
   void dicer(int howfar)
   {
       switch(chance)
        {
            case 0:
            {
                disableAll();
                
                if(dicenum!=6)
                    chance++;
                else if(dicenum==6)
                    enableYellow(5);
                break;
            }
               
            case 1:
            {
                disableAll();
                
                if(dicenum!=6)
                    chance++;
                else if(dicenum==6)
                    enableRed(5);
                break;
            }
               
            case 2:
            {
                disableAll();
               
                 if(dicenum!=6)
                    chance++;
                 else if(dicenum==6)
                     enableBlue(5);
                 break;
            }
            case 3:
            {
                disableAll();
               
                 if(dicenum!=6)
                    chance=0;
                 else if(dicenum==6)
                      enableGreen(5);
                 break;
            }
    
        }
        
   }
    public UI1() {
        initComponents();
       setSize(1400,1200);
        setLocationRelativeTo(null);
        setup();
        
        
         
        //jButton89.setIcon(iconmiddle);
       /* jButton6.setIcon(iconred);
        //jButton30.setIcon(iconblue);*/
       // jButton66.setIcon(iconred);
        
    /*    Icon icondiceone=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-one.png");
        Icon icondiceotwo=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-two.png");
        Icon icondicethree=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-three.png");
        Icon icondicefour=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-four.png");
        Icon icondicefive=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-five.png");
        Icon icondicesix=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-six.png");
        */
        
        //jButton6.
       
      /* Border blackline;
      
       blackline=BorderFactory.createLineBorder(Color.black);
       panel3.setBorder(blackline);*/
      
        
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

        r1.setBackground(new java.awt.Color(204, 204, 204));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel9.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel9.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel9.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel9.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel3.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        panel2.setBackground(new java.awt.Color(255, 255, 0));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel12.setBackground(new java.awt.Color(0, 0, 0));
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        y1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel12.add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        y2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel12.add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        y3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel12.add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        y4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel12.add(y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel2.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 400, 400));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel16.setBackground(new java.awt.Color(102, 102, 255));
        panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel16.add(rb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        rb10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel16.add(rb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 70));

        rb9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5)));
        panel16.add(rb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 70, 70));

        rb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel16.add(rb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 70));

        rb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel16.add(rb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, 70));

        rb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel16.add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, 50));

        jPanel1.add(panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 400));

        panel17.setBackground(new java.awt.Color(0, 204, 255));
        panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel17.add(rb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 70));

        jButton66.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 70));

        jButton67.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, 70));

        jButton68.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 60, 70));

        jButton69.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 70));

        jButton70.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel17.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 60, 50));

        jPanel1.add(panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 400));

        panel18.setBackground(new java.awt.Color(102, 102, 255));
        panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel18.add(rb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        bg1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5)));
        panel18.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 70));

        bg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel18.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 70, 70));

        bg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel18.add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 70));

        bg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel18.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, 70));

        bg5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel18.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, 50));

        jPanel1.add(panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 400));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 400));

        panel4.setBackground(new java.awt.Color(51, 0, 204));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel10.setBackground(new java.awt.Color(0, 0, 0));
        panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel10.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel10.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel10.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel10.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel4.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 400, 400));

        panel5.setBackground(new java.awt.Color(255, 51, 102));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel13.setBackground(new java.awt.Color(255, 51, 153));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        yr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr13ActionPerformed(evt);
            }
        });
        panel13.add(yr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        rb1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5)));
        panel13.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        rb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel13.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        rb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel13.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        rb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel13.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        rb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel13.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 70));

        panel5.add(panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        panel14.setBackground(new java.awt.Color(255, 102, 204));
        panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel14.add(yr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jButton84.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 60));

        jButton85.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 60));

        jButton86.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 60));

        jButton87.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 60));

        jButton88.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5)));
        panel14.add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 60));

        panel5.add(panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 60));

        panel15.setBackground(new java.awt.Color(255, 51, 153));
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel15.add(yr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        yr10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel15.add(yr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        yr9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        panel15.add(yr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        yr8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel15.add(yr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        yr7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel15.add(yr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        yr6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel15.add(yr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 70));

        panel5.add(panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 70));

        panel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 400, 200));

        panel6.setBackground(new java.awt.Color(153, 255, 153));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel19.setBackground(new java.awt.Color(0, 102, 0));
        panel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel19.add(bg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 70));

        bg7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel19.add(bg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 70));

        bg8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel19.add(bg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 70));

        bg9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        panel19.add(bg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 70));

        bg10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel19.add(bg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 70));

        bg11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel19.add(bg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 70));

        panel6.add(panel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        panel20.setBackground(new java.awt.Color(102, 255, 0));
        panel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton71.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jButton72.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 60));

        jButton73.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 60));

        jButton74.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 60));

        jButton75.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 0), 5)));
        panel20.add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 60));

        bg12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel20.add(bg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 60));

        panel6.add(panel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 60));

        panel21.setBackground(new java.awt.Color(51, 102, 0));
        panel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gy5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel21.add(gy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 70));

        gy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel21.add(gy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 70));

        gy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel21.add(gy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 70));

        gy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel21.add(gy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 70));

        gy1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 5)));
        panel21.add(gy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 70));

        bg13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel21.add(bg13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 70));

        panel6.add(panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 70));

        panel1.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 400, 200));

        panel7.setBackground(new java.awt.Color(51, 153, 0));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel11.setBackground(new java.awt.Color(0, 0, 0));
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel11.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        g2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel11.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        g3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel11.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        g4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel11.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panel7.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 200));

        panel1.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 400, 400));

        panel8.setBackground(new java.awt.Color(255, 255, 153));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel22.setBackground(new java.awt.Color(255, 204, 0));
        panel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yr5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel22.add(yr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        yr4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel22.add(yr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 70));

        yr3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel22.add(yr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 70));

        yr2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel22.add(yr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, 70));

        yr1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel22.add(yr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 70, 70));

        gy13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel22.add(gy13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 70));

        panel8.add(panel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 400));

        panel23.setBackground(new java.awt.Color(255, 255, 102));
        panel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton77.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jButton78.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 70));

        jButton79.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 60, 70));

        jButton80.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 70));

        jButton81.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5)));
        panel23.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 60, 70));

        gy12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel23.add(gy12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 60, 70));

        panel8.add(panel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 400));

        panel24.setBackground(new java.awt.Color(255, 204, 0));
        panel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gy6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel24.add(gy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        gy7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel24.add(gy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 70));

        gy8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel24.add(gy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 70));

        gy9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8)));
        panel24.add(gy9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, 70));

        gy10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel24.add(gy10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 70, 70));

        gy11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        panel24.add(gy11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 70));

        panel8.add(panel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 400));

        panel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 200, 400));
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

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        Icon iconred=new ImageIcon("G:\\Downloads\\x-mark-red-64 .png");
        Icon iconyellow=new ImageIcon("G:\\Downloads\\x-mark-yellow-64 .png");
        Icon icongreen=new ImageIcon("G:\\Downloads\\x-mark-green-64.png");
        Icon iconblue=new ImageIcon("G:\\Downloads\\x-mark-blue-64 .png");
        Icon iconmiddle=new ImageIcon("C:\\Users\\Sourav\\Downloads\\brooo.png");
           
        Icon icondiceone=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-one.png");
        Icon icondicetwo=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-two.png");
        Icon icondicethree=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-three.png");
        Icon icondicefour=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-four.png");
        Icon icondicefive=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-five.png");
        Icon icondicesix=new ImageIcon("F:\\Programming\\Ludo_OOP-Proj\\dice-six-faces-six.png");
        int dicenum;
        int chance=0;
        
           
    private void yr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr13ActionPerformed
        // TODO add your handling code here:
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
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
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
    private javax.swing.JButton g1;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
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
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JButton rb1;
    private javax.swing.JButton rb10;
    private javax.swing.JButton rb11;
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
    private javax.swing.JButton y1;
    private javax.swing.JButton y2;
    private javax.swing.JButton y3;
    private javax.swing.JButton y4;
    private javax.swing.JButton yr1;
    private javax.swing.JButton yr10;
    private javax.swing.JButton yr11;
    private javax.swing.JButton yr12;
    private javax.swing.JButton yr13;
    private javax.swing.JButton yr2;
    private javax.swing.JButton yr3;
    private javax.swing.JButton yr4;
    private javax.swing.JButton yr5;
    private javax.swing.JButton yr6;
    private javax.swing.JButton yr7;
    private javax.swing.JButton yr8;
    private javax.swing.JButton yr9;
    // End of variables declaration//GEN-END:variables
}
