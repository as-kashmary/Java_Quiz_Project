/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens.userScreens;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class FinalQuiz12 extends javax.swing.JFrame {
    String it=null;
    String sci=null;
    String gk=null;
    String math=null;
    String nq=null;
    Connection conn=null;
    ResultSet rs1=null;
    ResultSet rs2=null;
    ResultSet rs3=null;
    ResultSet rs4=null;
    /**
     * Creates new form FinalQuiz
     */
    
    public FinalQuiz12(String itc, String scic, String gkc, String mathc, String nqc) {
        initComponents();
        it=itc;
        gk=gkc;
        math=mathc;
        sci=scic;
        nq=nqc;
        
        System.out.print(itc);
        System.out.print(gkc);
        System.out.print(scic);
        System.out.print(mathc);
        System.out.print(nqc);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/netbeans?serverTimezone=UTC","root","");
            //itc,scic,gkc,mathc,nqc
            int a=0,b=0,c=0;
            if(it!=null){
                if(sci!=null){
                    if(gk!=null){
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'ict' LIMIT 4;");
                        rs1=stm1.executeQuery();
                        PreparedStatement stm2= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'science' LIMIT 4;");
                        rs2=stm2.executeQuery();
                        PreparedStatement stm3= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'general' LIMIT 4;");
                        rs3=stm3.executeQuery();
                        a=4;b=4;c=4;
                    }else{
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'ict' LIMIT 6;");
                        rs1=stm1.executeQuery();
                        PreparedStatement stm2= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'science' LIMIT 6;");
                        rs2=stm2.executeQuery();
                        a=6;b=6;
                    }
                }else{
                    if(gk!=null){
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'general' LIMIT 6;");
                        rs1=stm1.executeQuery();
                        PreparedStatement stm2= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'ict' LIMIT 6;");
                        rs2=stm2.executeQuery();
                        a=6;b=6;
                    }else{
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'ict' LIMIT 12;");
                        rs1=stm1.executeQuery();
                        a=12;
                        
                    }
                }
            }else{
                if(sci!=null){
                    if(gk!=null){
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'general' LIMIT 6;");
                        rs1=stm1.executeQuery();
                        PreparedStatement stm2= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'science' LIMIT 6;");
                        rs2=stm2.executeQuery();
                        a=6;b=6;
                    }else{
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'science' LIMIT 12;");
                        rs1=stm1.executeQuery();
                        a=12;
                        
                    }
                }else{
                    if(gk!=null){
                        PreparedStatement stm1= conn.prepareStatement("SELECT * FROM quiz WHERE category = 'general' LIMIT 12;");
                        rs1=stm1.executeQuery();
                        a=12;
                        
                    }else{
                        
                        
                        
                    }
                }
            }
            int tot=0;
            for(int i=0;i<a;i++){
                if(rs1.next()){
                    if(tot==0){
                        q_10.setText(rs1.getString("question"));
                        q_10_1.setText(rs1.getString("option1"));
                        q_10_2.setText(rs1.getString("option2"));
                        q_10_3.setText(rs1.getString("option3"));
                        q_10_4.setText(rs1.getString("option4"));
                    }if(tot==1){
                        q_11.setText(rs1.getString("question"));
                        q_11_1.setText(rs1.getString("option1"));
                        q_11_2.setText(rs1.getString("option2"));
                        q_11_3.setText(rs1.getString("option3"));
                        q_11_4.setText(rs1.getString("option4"));
                    }if(tot==2){
                        q_12.setText(rs1.getString("question"));
                        q_12_1.setText(rs1.getString("option1"));
                        q_12_2.setText(rs1.getString("option2"));
                        q_12_3.setText(rs1.getString("option3"));
                        q_12_4.setText(rs1.getString("option4"));
                    }if(tot==3){
                        q_13.setText(rs1.getString("question"));
                        q_13_1.setText(rs1.getString("option1"));
                        q_13_2.setText(rs1.getString("option2"));
                        q_13_3.setText(rs1.getString("option3"));
                        q_13_4.setText(rs1.getString("option4"));
                    }if(tot==4){
                        q_14.setText(rs1.getString("question"));
                        q_14_1.setText(rs1.getString("option1"));
                        q_14_2.setText(rs1.getString("option2"));
                        q_14_3.setText(rs1.getString("option3"));
                        q_14_4.setText(rs1.getString("option4"));
                    }if(tot==5){
                        q_15.setText(rs1.getString("question"));
                        q_15_1.setText(rs1.getString("option1"));
                        q_15_2.setText(rs1.getString("option2"));
                        q_15_3.setText(rs1.getString("option3"));
                        q_15_4.setText(rs1.getString("option4"));
                    }if(tot==6){
                        q_16.setText(rs1.getString("question"));
                        q_16_1.setText(rs1.getString("option1"));
                        q_16_2.setText(rs1.getString("option2"));
                        q_16_3.setText(rs1.getString("option3"));
                        q_16_4.setText(rs1.getString("option4"));
                    }if(tot==7){
                        q_17.setText(rs1.getString("question"));
                        q_17_1.setText(rs1.getString("option1"));
                        q_17_2.setText(rs1.getString("option2"));
                        q_17_3.setText(rs1.getString("option3"));
                        q_17_4.setText(rs1.getString("option4"));
                    }if(tot==8){
                        q_18.setText(rs1.getString("question"));
                        q_18_1.setText(rs1.getString("option1"));
                        q_18_2.setText(rs1.getString("option2"));
                        q_18_3.setText(rs1.getString("option3"));
                        q_18_4.setText(rs1.getString("option4"));
                    }if(tot==9){
                        q_19.setText(rs1.getString("question"));
                        q_19_1.setText(rs1.getString("option1"));
                        q_19_2.setText(rs1.getString("option2"));
                        q_19_3.setText(rs1.getString("option3"));
                        q_19_4.setText(rs1.getString("option4"));
                    }if(tot==10){
                        q_20.setText(rs1.getString("question"));
                        q_20_1.setText(rs1.getString("option1"));
                        q_20_2.setText(rs1.getString("option2"));
                        q_20_3.setText(rs1.getString("option3"));
                        q_20_4.setText(rs1.getString("option4"));
                    }if(tot==11){
                        q_21.setText(rs1.getString("question"));
                        q_21_1.setText(rs1.getString("option1"));
                        q_21_2.setText(rs1.getString("option2"));
                        q_21_3.setText(rs1.getString("option3"));
                        q_21_4.setText(rs1.getString("option4"));
                    }
                    tot++;
                }
            }
            for(int i=0;i<b;i++){
                if(rs2.next()){
                    if(tot==0){
                        q_10.setText(rs2.getString("question"));
                        q_10_1.setText(rs2.getString("option1"));
                        q_10_2.setText(rs2.getString("option2"));
                        q_10_3.setText(rs2.getString("option3"));
                        q_10_4.setText(rs2.getString("option4"));
                    }if(tot==1){
                        q_11.setText(rs2.getString("question"));
                        q_11_1.setText(rs2.getString("option1"));
                        q_11_2.setText(rs2.getString("option2"));
                        q_11_3.setText(rs2.getString("option3"));
                        q_11_4.setText(rs2.getString("option4"));
                    }if(tot==2){
                        q_12.setText(rs2.getString("question"));
                        q_12_1.setText(rs2.getString("option1"));
                        q_12_2.setText(rs2.getString("option2"));
                        q_12_3.setText(rs2.getString("option3"));
                        q_12_4.setText(rs2.getString("option4"));
                    }if(tot==3){
                        q_13.setText(rs2.getString("question"));
                        q_13_1.setText(rs2.getString("option1"));
                        q_13_2.setText(rs2.getString("option2"));
                        q_13_3.setText(rs2.getString("option3"));
                        q_13_4.setText(rs2.getString("option4"));
                    }if(tot==4){
                        q_14.setText(rs2.getString("question"));
                        q_14_1.setText(rs2.getString("option1"));
                        q_14_2.setText(rs2.getString("option2"));
                        q_14_3.setText(rs2.getString("option3"));
                        q_14_4.setText(rs2.getString("option4"));
                    }if(tot==5){
                        q_15.setText(rs2.getString("question"));
                        q_15_1.setText(rs2.getString("option1"));
                        q_15_2.setText(rs2.getString("option2"));
                        q_15_3.setText(rs2.getString("option3"));
                        q_15_4.setText(rs2.getString("option4"));
                    }if(tot==6){
                        q_16.setText(rs2.getString("question"));
                        q_16_1.setText(rs2.getString("option1"));
                        q_16_2.setText(rs2.getString("option2"));
                        q_16_3.setText(rs2.getString("option3"));
                        q_16_4.setText(rs2.getString("option4"));
                    }if(tot==7){
                        q_17.setText(rs2.getString("question"));
                        q_17_1.setText(rs2.getString("option1"));
                        q_17_2.setText(rs2.getString("option2"));
                        q_17_3.setText(rs2.getString("option3"));
                        q_17_4.setText(rs2.getString("option4"));
                    }if(tot==8){
                        q_18.setText(rs2.getString("question"));
                        q_18_1.setText(rs2.getString("option1"));
                        q_18_2.setText(rs2.getString("option2"));
                        q_18_3.setText(rs2.getString("option3"));
                        q_18_4.setText(rs2.getString("option4"));
                    }if(tot==9){
                        q_19.setText(rs2.getString("question"));
                        q_19_1.setText(rs2.getString("option1"));
                        q_19_2.setText(rs2.getString("option2"));
                        q_19_3.setText(rs2.getString("option3"));
                        q_19_4.setText(rs2.getString("option4"));
                    }if(tot==10){
                        q_20.setText(rs2.getString("question"));
                        q_20_1.setText(rs2.getString("option1"));
                        q_20_2.setText(rs2.getString("option2"));
                        q_20_3.setText(rs2.getString("option3"));
                        q_20_4.setText(rs2.getString("option4"));
                    }if(tot==11){
                        q_21.setText(rs2.getString("question"));
                        q_21_1.setText(rs2.getString("option1"));
                        q_21_2.setText(rs2.getString("option2"));
                        q_21_3.setText(rs2.getString("option3"));
                        q_21_4.setText(rs2.getString("option4"));
                    }
                    tot++;
                }
            }
            for(int i=0;i<c;i++){
                if(rs3.next()){
                    if(tot==0){
                        q_10.setText(rs3.getString("question"));
                        q_10_1.setText(rs3.getString("option1"));
                        q_10_2.setText(rs3.getString("option2"));
                        q_10_3.setText(rs3.getString("option3"));
                        q_10_4.setText(rs3.getString("option4"));
                    }if(tot==1){
                        q_11.setText(rs3.getString("question"));
                        q_11_1.setText(rs3.getString("option1"));
                        q_11_2.setText(rs3.getString("option2"));
                        q_11_3.setText(rs3.getString("option3"));
                        q_11_4.setText(rs3.getString("option4"));
                    }if(tot==2){
                        q_12.setText(rs3.getString("question"));
                        q_12_1.setText(rs3.getString("option1"));
                        q_12_2.setText(rs3.getString("option2"));
                        q_12_3.setText(rs3.getString("option3"));
                        q_12_4.setText(rs3.getString("option4"));
                    }if(tot==3){
                        q_13.setText(rs3.getString("question"));
                        q_13_1.setText(rs3.getString("option1"));
                        q_13_2.setText(rs3.getString("option2"));
                        q_13_3.setText(rs3.getString("option3"));
                        q_13_4.setText(rs3.getString("option4"));
                    }if(tot==4){
                        q_14.setText(rs3.getString("question"));
                        q_14_1.setText(rs3.getString("option1"));
                        q_14_2.setText(rs3.getString("option2"));
                        q_14_3.setText(rs3.getString("option3"));
                        q_14_4.setText(rs3.getString("option4"));
                    }if(tot==5){
                        q_15.setText(rs3.getString("question"));
                        q_15_1.setText(rs3.getString("option1"));
                        q_15_2.setText(rs3.getString("option2"));
                        q_15_3.setText(rs3.getString("option3"));
                        q_15_4.setText(rs3.getString("option4"));
                    }if(tot==6){
                        q_16.setText(rs3.getString("question"));
                        q_16_1.setText(rs3.getString("option1"));
                        q_16_2.setText(rs3.getString("option2"));
                        q_16_3.setText(rs3.getString("option3"));
                        q_16_4.setText(rs3.getString("option4"));
                    }if(tot==7){
                        q_17.setText(rs3.getString("question"));
                        q_17_1.setText(rs3.getString("option1"));
                        q_17_2.setText(rs3.getString("option2"));
                        q_17_3.setText(rs3.getString("option3"));
                        q_17_4.setText(rs3.getString("option4"));
                    }if(tot==8){
                        q_18.setText(rs3.getString("question"));
                        q_18_1.setText(rs3.getString("option1"));
                        q_18_2.setText(rs3.getString("option2"));
                        q_18_3.setText(rs3.getString("option3"));
                        q_18_4.setText(rs3.getString("option4"));
                    }if(tot==9){
                        q_19.setText(rs3.getString("question"));
                        q_19_1.setText(rs3.getString("option1"));
                        q_19_2.setText(rs3.getString("option2"));
                        q_19_3.setText(rs3.getString("option3"));
                        q_19_4.setText(rs3.getString("option4"));
                    }if(tot==10){
                        q_20.setText(rs3.getString("question"));
                        q_20_1.setText(rs3.getString("option1"));
                        q_20_2.setText(rs3.getString("option2"));
                        q_20_3.setText(rs3.getString("option3"));
                        q_20_4.setText(rs3.getString("option4"));
                    }if(tot==11){
                        q_21.setText(rs3.getString("question"));
                        q_21_1.setText(rs3.getString("option1"));
                        q_21_2.setText(rs3.getString("option2"));
                        q_21_3.setText(rs3.getString("option3"));
                        q_21_4.setText(rs3.getString("option4"));
                    }
                    tot++;
                }
            }
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            
            
            
            
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        q_3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        q_1_o_5 = new javax.swing.JCheckBox();
        q_1_o_6 = new javax.swing.JCheckBox();
        q_1_o_7 = new javax.swing.JCheckBox();
        q_1_o_8 = new javax.swing.JCheckBox();
        q_4 = new javax.swing.JLabel();
        q_2_o_5 = new javax.swing.JCheckBox();
        q_2_o_6 = new javax.swing.JCheckBox();
        q_2_o_7 = new javax.swing.JCheckBox();
        q_2_o_8 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        q_1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        q_1_o_2 = new javax.swing.JCheckBox();
        q_1_o_3 = new javax.swing.JCheckBox();
        q_1_o_4 = new javax.swing.JCheckBox();
        q_2 = new javax.swing.JLabel();
        q_2_o_1 = new javax.swing.JCheckBox();
        q_2_o_2 = new javax.swing.JCheckBox();
        q_2_o_4 = new javax.swing.JCheckBox();
        q_1_o_1 = new javax.swing.JCheckBox();
        q_2_o_9 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        q_10 = new javax.swing.JLabel();
        q_10_1 = new javax.swing.JCheckBox();
        q_10_2 = new javax.swing.JCheckBox();
        q_10_3 = new javax.swing.JCheckBox();
        q_10_4 = new javax.swing.JCheckBox();
        q_11 = new javax.swing.JLabel();
        q_11_1 = new javax.swing.JCheckBox();
        q_11_2 = new javax.swing.JCheckBox();
        q_11_3 = new javax.swing.JCheckBox();
        q_11_4 = new javax.swing.JCheckBox();
        q_12 = new javax.swing.JLabel();
        q_12_1 = new javax.swing.JCheckBox();
        q_12_2 = new javax.swing.JCheckBox();
        q_12_3 = new javax.swing.JCheckBox();
        q_12_4 = new javax.swing.JCheckBox();
        q_13 = new javax.swing.JLabel();
        q_13_1 = new javax.swing.JCheckBox();
        q_13_2 = new javax.swing.JCheckBox();
        q_13_3 = new javax.swing.JCheckBox();
        q_13_4 = new javax.swing.JCheckBox();
        q_14 = new javax.swing.JLabel();
        q_14_1 = new javax.swing.JCheckBox();
        q_14_2 = new javax.swing.JCheckBox();
        q_14_3 = new javax.swing.JCheckBox();
        q_14_4 = new javax.swing.JCheckBox();
        q_15 = new javax.swing.JLabel();
        q_15_1 = new javax.swing.JCheckBox();
        q_15_2 = new javax.swing.JCheckBox();
        q_15_3 = new javax.swing.JCheckBox();
        q_15_4 = new javax.swing.JCheckBox();
        q_18 = new javax.swing.JLabel();
        q_18_1 = new javax.swing.JCheckBox();
        q_18_2 = new javax.swing.JCheckBox();
        q_18_3 = new javax.swing.JCheckBox();
        q_18_4 = new javax.swing.JCheckBox();
        q_19 = new javax.swing.JLabel();
        q_19_1 = new javax.swing.JCheckBox();
        q_19_2 = new javax.swing.JCheckBox();
        q_19_3 = new javax.swing.JCheckBox();
        q_19_4 = new javax.swing.JCheckBox();
        q_20 = new javax.swing.JLabel();
        q_16 = new javax.swing.JLabel();
        q_20_1 = new javax.swing.JCheckBox();
        q_16_1 = new javax.swing.JCheckBox();
        q_20_2 = new javax.swing.JCheckBox();
        q_16_2 = new javax.swing.JCheckBox();
        q_20_3 = new javax.swing.JCheckBox();
        q_20_4 = new javax.swing.JCheckBox();
        q_16_3 = new javax.swing.JCheckBox();
        q_16_4 = new javax.swing.JCheckBox();
        q_17 = new javax.swing.JLabel();
        q_17_1 = new javax.swing.JCheckBox();
        q_21 = new javax.swing.JLabel();
        q_21_1 = new javax.swing.JCheckBox();
        q_21_2 = new javax.swing.JCheckBox();
        q_21_3 = new javax.swing.JCheckBox();
        q_17_2 = new javax.swing.JCheckBox();
        q_21_4 = new javax.swing.JCheckBox();
        q_17_3 = new javax.swing.JCheckBox();
        q_17_4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        submit_b = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q_3.setText("q_1");
        jPanel4.add(q_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 390, 20));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 170, 20));

        q_1_o_5.setText("jCheckBox1");
        jPanel4.add(q_1_o_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 370, 20));

        q_1_o_6.setText("jCheckBox1");
        jPanel4.add(q_1_o_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 550, -1));

        q_1_o_7.setText("jCheckBox1");
        jPanel4.add(q_1_o_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 20));

        q_1_o_8.setText("jCheckBox1");
        jPanel4.add(q_1_o_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 510, 20));

        q_4.setText("q_1");
        jPanel4.add(q_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 390, 20));

        q_2_o_5.setText("jCheckBox1");
        jPanel4.add(q_2_o_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 550, -1));

        q_2_o_6.setText("jCheckBox1");
        jPanel4.add(q_2_o_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 480, 20));

        q_2_o_7.setText("jCheckBox1");
        jPanel4.add(q_2_o_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 510, 20));

        q_2_o_8.setText("jCheckBox1");
        jPanel4.add(q_2_o_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 370, 20));

        jScrollPane1.setBackground(new java.awt.Color(51, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q_1.setText("q_1");
        jPanel3.add(q_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 390, 20));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 170, 20));

        q_1_o_2.setText("jCheckBox1");
        jPanel3.add(q_1_o_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 550, -1));

        q_1_o_3.setText("jCheckBox1");
        jPanel3.add(q_1_o_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 20));

        q_1_o_4.setText("jCheckBox1");
        jPanel3.add(q_1_o_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 510, 20));

        q_2.setText("q_1");
        jPanel3.add(q_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 390, 20));

        q_2_o_1.setText("jCheckBox1");
        jPanel3.add(q_2_o_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 550, -1));

        q_2_o_2.setText("jCheckBox1");
        q_2_o_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q_2_o_2ActionPerformed(evt);
            }
        });
        jPanel3.add(q_2_o_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 480, 20));

        q_2_o_4.setText("jCheckBox1");
        jPanel3.add(q_2_o_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 370, 20));

        q_1_o_1.setText("jCheckBox1");
        q_1_o_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q_1_o_1ActionPerformed(evt);
            }
        });
        jPanel3.add(q_1_o_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 510, 20));

        q_2_o_9.setText("jCheckBox1");
        q_2_o_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q_2_o_9ActionPerformed(evt);
            }
        });
        jPanel3.add(q_2_o_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 510, 20));

        jScrollPane1.setViewportView(jPanel3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(51, 255, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        q_10.setText("jLabel1");

        q_10_1.setText("jCheckBox1");

        q_10_2.setText("jCheckBox2");

        q_10_3.setText("jCheckBox3");

        q_10_4.setText("jCheckBox4");

        q_11.setText("jLabel1");

        q_11_1.setText("jCheckBox1");

        q_11_2.setText("jCheckBox2");

        q_11_3.setText("jCheckBox3");

        q_11_4.setText("jCheckBox4");

        q_12.setText("jLabel1");

        q_12_1.setText("jCheckBox1");

        q_12_2.setText("jCheckBox2");

        q_12_3.setText("jCheckBox3");

        q_12_4.setText("jCheckBox4");

        q_13.setText("jLabel1");

        q_13_1.setText("jCheckBox1");

        q_13_2.setText("jCheckBox2");

        q_13_3.setText("jCheckBox3");

        q_13_4.setText("jCheckBox4");

        q_14.setText("jLabel1");

        q_14_1.setText("jCheckBox1");

        q_14_2.setText("jCheckBox2");

        q_14_3.setText("jCheckBox3");

        q_14_4.setText("jCheckBox4");

        q_15.setText("jLabel1");

        q_15_1.setText("jCheckBox1");

        q_15_2.setText("jCheckBox2");

        q_15_3.setText("jCheckBox3");

        q_15_4.setText("jCheckBox4");

        q_18.setText("jLabel1");

        q_18_1.setText("jCheckBox1");

        q_18_2.setText("jCheckBox2");

        q_18_3.setText("jCheckBox3");

        q_18_4.setText("jCheckBox4");

        q_19.setText("jLabel1");

        q_19_1.setText("jCheckBox1");

        q_19_2.setText("jCheckBox2");

        q_19_3.setText("jCheckBox3");

        q_19_4.setText("jCheckBox4");

        q_20.setText("jLabel1");

        q_16.setText("jLabel1");

        q_20_1.setText("jCheckBox1");

        q_16_1.setText("jCheckBox1");

        q_20_2.setText("jCheckBox2");

        q_16_2.setText("jCheckBox2");

        q_20_3.setText("jCheckBox3");

        q_20_4.setText("jCheckBox4");

        q_16_3.setText("jCheckBox3");

        q_16_4.setText("jCheckBox4");

        q_17.setText("jLabel1");

        q_17_1.setText("jCheckBox1");

        q_21.setText("jLabel1");

        q_21_1.setText("jCheckBox1");

        q_21_2.setText("jCheckBox2");

        q_21_3.setText("jCheckBox3");

        q_17_2.setText("jCheckBox2");

        q_21_4.setText("jCheckBox4");

        q_17_3.setText("jCheckBox3");

        q_17_4.setText("jCheckBox4");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iPhone 8 - 1.png"))); // NOI18N

        jButton3.setText("Quit ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        submit_b.setText("Submit");
        submit_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q_21_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_21_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_21_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_21_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_21, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_20_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_20_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_20_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_20_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_20, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_19_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_19_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_19_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_19_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_19, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_18_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_18_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_18_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_18_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_18, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_17_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_17_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_17_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_17_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(416, 416, 416)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q_13_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_13_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_13_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_13, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_12_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_12_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_12_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_12, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_11_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_11_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_11, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_10_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_10, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_17, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_16_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_16_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_16_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_16_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_16, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_15, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_14_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_14_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_14_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_14_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_14, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_13_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_15_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_15_2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_15_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_15_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(submit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)
                        .addGap(1245, 1245, 1245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_10_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_10_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_10_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_10_4)
                        .addGap(36, 36, 36)
                        .addComponent(q_11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_11_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_11_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_11_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_11_4)
                        .addGap(18, 18, 18)
                        .addComponent(q_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_12_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_12_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_12_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_12_4)
                        .addGap(36, 36, 36)
                        .addComponent(q_13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_13_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_13_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_13_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_13_4)
                        .addGap(18, 18, 18)
                        .addComponent(q_14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_14_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_14_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_14_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_14_4)
                        .addGap(36, 36, 36)
                        .addComponent(q_15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_15_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_15_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_15_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_15_4)
                        .addGap(18, 18, 18)
                        .addComponent(q_16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_16_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_16_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q_16_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q_16_4)
                        .addGap(36, 36, 36)
                        .addComponent(q_17)
                        .addGap(18, 18, 18)))
                .addComponent(q_17_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_17_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q_17_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_17_4)
                .addGap(18, 18, 18)
                .addComponent(q_18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_18_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_18_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q_18_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_18_4)
                .addGap(36, 36, 36)
                .addComponent(q_19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_19_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_19_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q_19_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_19_4)
                .addGap(18, 18, 18)
                .addComponent(q_20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_20_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_20_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q_20_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_20_4)
                .addGap(36, 36, 36)
                .addComponent(q_21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_21_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_21_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q_21_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q_21_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(submit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jScrollPane2.setViewportView(jPanel5);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void q_1_o_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q_1_o_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q_1_o_1ActionPerformed

    private void q_2_o_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q_2_o_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q_2_o_9ActionPerformed

    private void q_2_o_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q_2_o_2ActionPerformed
        // TODO add your handling code here:
        if(sci==null)
    }//GEN-LAST:event_q_2_o_2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       var response=JOptionPane.showConfirmDialog(this, "Do you want to Quit?","Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(response==JOptionPane.YES_OPTION){
           QuizSelection frmtwo=new QuizSelection();
        setVisible(false);
        frmtwo.show();
       }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submit_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_bActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_submit_bActionPerformed

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
            java.util.logging.Logger.getLogger(FinalQuiz12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalQuiz12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalQuiz12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalQuiz12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalQuiz12(null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel q_1;
    private javax.swing.JLabel q_10;
    private javax.swing.JCheckBox q_10_1;
    private javax.swing.JCheckBox q_10_2;
    private javax.swing.JCheckBox q_10_3;
    private javax.swing.JCheckBox q_10_4;
    private javax.swing.JLabel q_11;
    private javax.swing.JCheckBox q_11_1;
    private javax.swing.JCheckBox q_11_2;
    private javax.swing.JCheckBox q_11_3;
    private javax.swing.JCheckBox q_11_4;
    private javax.swing.JLabel q_12;
    private javax.swing.JCheckBox q_12_1;
    private javax.swing.JCheckBox q_12_2;
    private javax.swing.JCheckBox q_12_3;
    private javax.swing.JCheckBox q_12_4;
    private javax.swing.JLabel q_13;
    private javax.swing.JCheckBox q_13_1;
    private javax.swing.JCheckBox q_13_2;
    private javax.swing.JCheckBox q_13_3;
    private javax.swing.JCheckBox q_13_4;
    private javax.swing.JLabel q_14;
    private javax.swing.JCheckBox q_14_1;
    private javax.swing.JCheckBox q_14_2;
    private javax.swing.JCheckBox q_14_3;
    private javax.swing.JCheckBox q_14_4;
    private javax.swing.JLabel q_15;
    private javax.swing.JCheckBox q_15_1;
    private javax.swing.JCheckBox q_15_2;
    private javax.swing.JCheckBox q_15_3;
    private javax.swing.JCheckBox q_15_4;
    private javax.swing.JLabel q_16;
    private javax.swing.JCheckBox q_16_1;
    private javax.swing.JCheckBox q_16_2;
    private javax.swing.JCheckBox q_16_3;
    private javax.swing.JCheckBox q_16_4;
    private javax.swing.JLabel q_17;
    private javax.swing.JCheckBox q_17_1;
    private javax.swing.JCheckBox q_17_2;
    private javax.swing.JCheckBox q_17_3;
    private javax.swing.JCheckBox q_17_4;
    private javax.swing.JLabel q_18;
    private javax.swing.JCheckBox q_18_1;
    private javax.swing.JCheckBox q_18_2;
    private javax.swing.JCheckBox q_18_3;
    private javax.swing.JCheckBox q_18_4;
    private javax.swing.JLabel q_19;
    private javax.swing.JCheckBox q_19_1;
    private javax.swing.JCheckBox q_19_2;
    private javax.swing.JCheckBox q_19_3;
    private javax.swing.JCheckBox q_19_4;
    private javax.swing.JCheckBox q_1_o_1;
    private javax.swing.JCheckBox q_1_o_2;
    private javax.swing.JCheckBox q_1_o_3;
    private javax.swing.JCheckBox q_1_o_4;
    private javax.swing.JCheckBox q_1_o_5;
    private javax.swing.JCheckBox q_1_o_6;
    private javax.swing.JCheckBox q_1_o_7;
    private javax.swing.JCheckBox q_1_o_8;
    private javax.swing.JLabel q_2;
    private javax.swing.JLabel q_20;
    private javax.swing.JCheckBox q_20_1;
    private javax.swing.JCheckBox q_20_2;
    private javax.swing.JCheckBox q_20_3;
    private javax.swing.JCheckBox q_20_4;
    private javax.swing.JLabel q_21;
    private javax.swing.JCheckBox q_21_1;
    private javax.swing.JCheckBox q_21_2;
    private javax.swing.JCheckBox q_21_3;
    private javax.swing.JCheckBox q_21_4;
    private javax.swing.JCheckBox q_2_o_1;
    private javax.swing.JCheckBox q_2_o_2;
    private javax.swing.JCheckBox q_2_o_4;
    private javax.swing.JCheckBox q_2_o_5;
    private javax.swing.JCheckBox q_2_o_6;
    private javax.swing.JCheckBox q_2_o_7;
    private javax.swing.JCheckBox q_2_o_8;
    private javax.swing.JCheckBox q_2_o_9;
    private javax.swing.JLabel q_3;
    private javax.swing.JLabel q_4;
    private javax.swing.JButton submit_b;
    // End of variables declaration//GEN-END:variables
}
