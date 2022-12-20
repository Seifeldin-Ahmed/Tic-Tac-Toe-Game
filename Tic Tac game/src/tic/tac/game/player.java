/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic.tac.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Seifeldin Ahmed
 */
public class player extends javax.swing.JFrame{

    private static int AI_Row = -1;
    private static int AI_Col = -1;
    private static String game_state = " ";

    public player() {
        initComponents();
        button1.setFocusable(false);
        button1.setFont(new Font(null, Font.BOLD, 42));
        button2.setFocusable(false);
        button2.setFont(new Font(null, Font.BOLD, 42));
        button3.setFocusable(false);
        button3.setFont(new Font(null, Font.BOLD, 42));
        button4.setFocusable(false);
        button4.setFont(new Font(null, Font.BOLD, 42));
        button5.setFocusable(false);
        button5.setFont(new Font(null, Font.BOLD, 42));
        button6.setFocusable(false);
        button6.setFont(new Font(null, Font.BOLD, 42));
        button7.setFocusable(false);
        button7.setFont(new Font(null, Font.BOLD, 42));
        button8.setFocusable(false);
        button8.setFont(new Font(null, Font.BOLD, 42));
        button9.setFocusable(false);
        button9.setFont(new Font(null, Font.BOLD, 42));
        ImageIcon image = new ImageIcon("E:\\Courses\\Java Course\\Projects\\Tic Tac game\\Tic Tac game\\src\\tic\\tac\\game\\logo.jpg");
        this.setIconImage(image.getImage());
        this.setLocationRelativeTo(null);
        this.setTitle(" Tic-Tac Game ");
        this.setResizable(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        result.setForeground(new Color(0, 255, 0));  //change the color of the label's text 
        result.setFont(new Font("MV Boli", Font.PLAIN, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        result = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        button2 = new button.mybutton();
        button3 = new button.mybutton();
        button4 = new button.mybutton();
        button1 = new button.mybutton();
        button5 = new button.mybutton();
        button6 = new button.mybutton();
        button7 = new button.mybutton();
        button8 = new button.mybutton();
        button9 = new button.mybutton();
        start = new button.mybutton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setText("PLAY");
        jPanel1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 210, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button2.setBorder(null);
        button2.setForeground(new java.awt.Color(255, 51, 0));
        button2.setBorderColor(new java.awt.Color(255, 255, 255));
        button2.setBorderPainted(false);
        button2.setColor(new java.awt.Color(29, 20, 51));
        button2.setColorClick(new java.awt.Color(152, 216, 243));
        button2.setColorOver(new java.awt.Color(35, 113, 119));
        button2.setColorText(new java.awt.Color(255, 102, 102));
        button2.setRadius(10);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel2.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 84, 63));

        button3.setBorder(null);
        button3.setForeground(new java.awt.Color(255, 51, 0));
        button3.setBorderColor(new java.awt.Color(255, 255, 255));
        button3.setBorderPainted(false);
        button3.setColor(new java.awt.Color(29, 20, 51));
        button3.setColorClick(new java.awt.Color(152, 216, 243));
        button3.setColorOver(new java.awt.Color(35, 113, 119));
        button3.setColorText(new java.awt.Color(255, 102, 102));
        button3.setRadius(10);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 84, 63));

        button4.setBorder(null);
        button4.setForeground(new java.awt.Color(255, 51, 0));
        button4.setBorderColor(new java.awt.Color(255, 255, 255));
        button4.setBorderPainted(false);
        button4.setColor(new java.awt.Color(29, 20, 51));
        button4.setColorClick(new java.awt.Color(152, 216, 243));
        button4.setColorOver(new java.awt.Color(35, 113, 119));
        button4.setColorText(new java.awt.Color(255, 102, 102));
        button4.setRadius(10);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 84, 63));

        button1.setBorder(null);
        button1.setForeground(new java.awt.Color(255, 51, 0));
        button1.setBorderColor(new java.awt.Color(255, 255, 255));
        button1.setBorderPainted(false);
        button1.setColor(new java.awt.Color(29, 20, 51));
        button1.setColorClick(new java.awt.Color(152, 216, 243));
        button1.setColorOver(new java.awt.Color(35, 113, 119));
        button1.setColorText(new java.awt.Color(255, 102, 102));
        button1.setRadius(10);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 84, 63));

        button5.setBorder(null);
        button5.setForeground(new java.awt.Color(255, 51, 0));
        button5.setBorderColor(new java.awt.Color(255, 255, 255));
        button5.setBorderPainted(false);
        button5.setColor(new java.awt.Color(29, 20, 51));
        button5.setColorClick(new java.awt.Color(152, 216, 243));
        button5.setColorOver(new java.awt.Color(35, 113, 119));
        button5.setColorText(new java.awt.Color(255, 102, 102));
        button5.setRadius(10);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel2.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 84, 63));

        button6.setBorder(null);
        button6.setForeground(new java.awt.Color(255, 51, 0));
        button6.setBorderColor(new java.awt.Color(255, 255, 255));
        button6.setBorderPainted(false);
        button6.setColor(new java.awt.Color(29, 20, 51));
        button6.setColorClick(new java.awt.Color(152, 216, 243));
        button6.setColorOver(new java.awt.Color(35, 113, 119));
        button6.setColorText(new java.awt.Color(255, 102, 102));
        button6.setRadius(10);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel2.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 84, 63));

        button7.setBorder(null);
        button7.setForeground(new java.awt.Color(255, 51, 0));
        button7.setBorderColor(new java.awt.Color(255, 255, 255));
        button7.setBorderPainted(false);
        button7.setColor(new java.awt.Color(29, 20, 51));
        button7.setColorClick(new java.awt.Color(152, 216, 243));
        button7.setColorOver(new java.awt.Color(35, 113, 119));
        button7.setColorText(new java.awt.Color(255, 102, 102));
        button7.setRadius(10);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel2.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 84, 63));

        button8.setBorder(null);
        button8.setForeground(new java.awt.Color(255, 51, 0));
        button8.setBorderColor(new java.awt.Color(255, 255, 255));
        button8.setBorderPainted(false);
        button8.setColor(new java.awt.Color(29, 20, 51));
        button8.setColorClick(new java.awt.Color(152, 216, 243));
        button8.setColorOver(new java.awt.Color(35, 113, 119));
        button8.setColorText(new java.awt.Color(255, 102, 102));
        button8.setRadius(10);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel2.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 84, 63));

        button9.setBorder(null);
        button9.setForeground(new java.awt.Color(255, 51, 0));
        button9.setBorderColor(new java.awt.Color(255, 255, 255));
        button9.setBorderPainted(false);
        button9.setColor(new java.awt.Color(29, 20, 51));
        button9.setColorClick(new java.awt.Color(152, 216, 243));
        button9.setColorOver(new java.awt.Color(35, 113, 119));
        button9.setColorText(new java.awt.Color(255, 102, 102));
        button9.setRadius(10);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel2.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 84, 63));

        start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        start.setForeground(new java.awt.Color(0, 51, 51));
        start.setText("Start Game");
        start.setBorderColor(new java.awt.Color(153, 153, 255));
        start.setBorderPainted(false);
        start.setColorClick(new java.awt.Color(152, 209, 240));
        start.setColorOver(new java.awt.Color(255, 255, 255));
        start.setColorText(new java.awt.Color(255, 255, 0));
        start.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        start.setRadius(8);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startKeyTyped(evt);
            }
        });
        jPanel2.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 470, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ff.jpg"))); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 10, 660, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void status(String state) {
        game_state = state;
    }
    
    public static void AI_Move(int row, int col) {
        AI_Row = row;
        AI_Col = col;
    }  
    
    private String check_cell(int row, int col) {
        if (row == 0 && col == 0) {
            return "Button1";
        } else if (row == 0 && col == 1) {
            return "Button2";
        } else if (row == 0 && col == 2) {
            return "Button3";
        } else if (row == 1 && col == 0) {
            return "Button4";
        } else if (row == 1 && col == 1) {
            return "Button5";
        } else if (row == 1 && col == 2) {
            return "Button6";
        } else if (row == 2 && col == 0) {
            return "Button7";
        } else if (row == 2 && col == 1) {
            return "Button8";
        } else if (row == 2 && col == 2) {
            return "Button9";
        } else {
            return "out_of_index";
        }
    }

    private void AI_Play(String cell) {
        switch (cell) {
            case "Button1":
                if(TicTacGame.AI== 'O')
                {
                    button1.setForeground(new Color(100,240,0)); //green
                    button1.setText("O");
                }
                else
                {  
                   button1.setForeground(Color.white); 
                   button1.setText("X"); 
                } 
                break;
            case "Button2":
                if(TicTacGame.AI== 'O')
                {
                    button2.setForeground(new Color(100,240,0)); //green
                    button2.setText("O");
                }
                else
                {  
                   button2.setForeground(Color.white); 
                   button2.setText("X"); 
                } 
                break;
            case "Button3":
                if(TicTacGame.AI== 'O')
                {
                    button3.setForeground(new Color(100,240,0)); //green
                    button3.setText("O");
                }
                else
                {  
                   button3.setForeground(Color.white); 
                   button3.setText("X"); 
                } 
                break;
            case "Button4":
                if(TicTacGame.AI== 'O')
                {
                    button4.setForeground(new Color(100,240,0)); //green
                    button4.setText("O");
                }
                else
                {  
                   button4.setForeground(Color.white); 
                   button4.setText("X"); 
                } 
                break;
            case "Button5":
                if(TicTacGame.AI== 'O')
                {
                    button5.setForeground(new Color(100,240,0)); //green
                    button5.setText("O");
                }
                else
                {  
                   button5.setForeground(Color.white); 
                   button5.setText("X"); 
                }
                break;
            case "Button6":
                if(TicTacGame.AI== 'O')
                {
                    button6.setForeground(new Color(100,240,0)); //green
                    button6.setText("O");
                }
                else
                {  
                   button6.setForeground(Color.white); 
                   button6.setText("X"); 
                } 
                break;
            case "Button7":
                if(TicTacGame.AI== 'O')
                {
                    button7.setForeground(new Color(100,240,0)); //green
                    button7.setText("O");
                }
                else
                {  
                   button7.setForeground(Color.white); 
                   button7.setText("X"); 
                } 
                break;
            case "Button8":            
                if(TicTacGame.AI== 'O')
                {
                    button8.setForeground(new Color(100,240,0)); //green
                    button8.setText("O");
                }
                else
                {  
                   button8.setForeground(Color.white); 
                   button8.setText("X"); 
                }
                break;
            case "Button9":
                if(TicTacGame.AI== 'O')
                {
                    button9.setForeground(new Color(100,240,0)); //green
                    button9.setText("O");
                }
                else
                {  
                   button9.setForeground(Color.white); 
                   button9.setText("X"); 
                }
                break;
            default:
                break;
        }
    }

     private  void game_result()
    {
           if( game_state.equals("Draw") ||  game_state.equals("Lost")  || game_state.equals("Win") )
         {       result.setText(game_state);
                 start.enableInputMethods(false);
                 button1.setEnabled(false);
                 button2.setEnabled(false);
                 button3.setEnabled(false);
                 button4.setEnabled(false);
                 button5.setEnabled(false);
                 button6.setEnabled(false);
                 button7.setEnabled(false);
                 button8.setEnabled(false);
                 button9.setEnabled(false);
         }
    }
     
     private void back_to_initial_state()
     {
                 button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
        for(int i=0;i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
               TicTacGame.board[i][j]=' ';
            }
        }
        game_state=" ";
     }
     
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        TicTacGame.tic_tac(0, 1);
        if(TicTacGame.HUMAN == 'X')
        {   button2.setForeground(Color.white);
            button2.setText("X");
        }                      
        else
        {
            button2.setText("O");
            button2.setForeground(new Color(100,240,0)); //green
        }

        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
        game_result();

    }//GEN-LAST:event_button2ActionPerformed
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        TicTacGame.tic_tac(0, 0); // Human will play at cell[0][0]
        if(TicTacGame.HUMAN == 'X')
        {   button1.setForeground(Color.white);
            button1.setText("X");
        }                      
        else
        {
            button1.setText("O");
            button1.setForeground(new Color(100,240,0)); //green
        }
        
        String cell = check_cell(AI_Row, AI_Col); //check which cell will AI play
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
       game_result();
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        TicTacGame.tic_tac(0, 2);
        if(TicTacGame.HUMAN == 'X')
        {   button3.setForeground(Color.white);
            button3.setText("X");
        }                      
        else
        {
            button3.setText("O");
            button3.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
       game_result();

    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

        TicTacGame.tic_tac(1, 0);
        if(TicTacGame.HUMAN == 'X')
        {   button4.setForeground(Color.white);
            button4.setText("X");
        }                      
        else
        {
            button4.setText("O");
            button4.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
        game_result();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed

        TicTacGame.tic_tac(1, 1);
        if(TicTacGame.HUMAN == 'X')
        {   button5.setForeground(Color.white);
            button5.setText("X");
        }                      
        else
        {
            button5.setText("O");
            button5.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        } 
        game_result();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed

        TicTacGame.tic_tac(1, 2);
        if(TicTacGame.HUMAN == 'X')
        {   button6.setForeground(Color.white);
            button6.setText("X");
        }                      
        else
        {
            button6.setText("O");
            button6.setForeground(new Color(100,240,0)); //green
        }
         
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
        game_result();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed

        TicTacGame.tic_tac(2, 0);
        if(TicTacGame.HUMAN == 'X')
        {   button7.setForeground(Color.white);
            button7.setText("X");
        }                      
        else
        {
            button7.setText("O");
            button7.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
         game_result();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed

        TicTacGame.tic_tac(2, 1);
        if(TicTacGame.HUMAN == 'X')
        {   button8.setForeground(Color.white);
            button8.setText("X");
        }                      
        else
        {
            button8.setText("O");
            button8.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
        game_result();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed

        TicTacGame.tic_tac(2, 2);
        if(TicTacGame.HUMAN == 'X')
        {   button9.setForeground(Color.white);
            button9.setText("X");
        }                      
        else
        {
            button9.setText("O");
            button9.setForeground(new Color(100,240,0)); //green
        }
        String cell = check_cell(AI_Row, AI_Col);
        if (null == cell) {
        } else {
            AI_Play(cell);
        }
        game_result();
      
         
    }//GEN-LAST:event_button9ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        back_to_initial_state();
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        result.setText("Started");
    }//GEN-LAST:event_startActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentShown

    private void startKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startKeyTyped
    }//GEN-LAST:event_startKeyTyped

    private void startKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startKeyPressed
      if(evt.getKeyCode()== 10) // if pressed enter
          {
            back_to_initial_state();
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            result.setText("Started");
          }
    }//GEN-LAST:event_startKeyPressed

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
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new player().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.mybutton button1;
    private button.mybutton button2;
    private button.mybutton button3;
    private button.mybutton button4;
    private button.mybutton button5;
    private button.mybutton button6;
    private button.mybutton button7;
    private button.mybutton button8;
    private button.mybutton button9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel result;
    private button.mybutton start;
    // End of variables declaration//GEN-END:variables


}
