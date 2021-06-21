package GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.sql.Date;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.chrono.JapaneseChronology;

public class doctor extends JFrame implements ActionListener {
    //Initializing Components
    JLabel lb, lb1, lb2, lb3, lb4, lb5,lb6,lb7,a1,a2,lb8,lb9,lb10;
    JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8,tf9,tf10;
    JButton btn,btn2,btn3;
    JCheckBox j1,j2,r1,r2,S1,S2;
    //Creating Constructor for initializing JFrame components
    doctor() {
        //Providing Title
        JFrame j  = new JFrame("Doctor portal");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\adith\\Desktop\\jdk\\DO.png");
        j.setIconImage(icon);
        lb5 = new JLabel("Enter Ref_number:");
        lb5.setBounds(400, 20, 150, 20);
        tf5 = new JTextField(20);
        tf5.setBounds(530, 20, 150, 30);//Ref_number
        //-----------------------------------------------------------------------------
        lb = new JLabel("Details of the vaccine receiver");
        lb.setBounds(500, 100, 450, 30);
        lb.setForeground(Color.BLACK);
        lb.setFont(new Font("Times new roman", Font.BOLD, 20));
        //---------------------------------------------------------------------------------
        lb1 = new JLabel("Name:");
        lb1.setBounds(400, 140, 100, 20);
        tf1 = new JTextField(50);
        tf1.setBounds(460, 140, 200, 30);//name
        //---------------------------------------------------------------------------------
        lb2 = new JLabel("vaccine:");
        lb2.setBounds(400, 200, 100, 20);
        tf2 = new JTextField(100);
        tf2.setBounds(460, 200, 200, 30);//vaccine
        //---------------------------------------------------------------------------------
        lb3 = new JLabel("Aadhaar:");
        lb3.setBounds(400, 260, 100, 20);
        tf3 = new JTextField(50);
        tf3.setBounds(460, 260, 200, 30);//Aadhar
        //----------------------------------------------------------------------------------
        lb4 = new JLabel("Mobile:");
        lb4.setBounds(400, 320, 100, 20);
        tf4 = new JTextField(50);
        tf4.setBounds(460, 320, 100, 30);//mobile
        //------------------------------------------------------------------------------------
        lb6 = new JLabel("Amount:");
        lb6.setBounds(400, 380, 100, 20);
        tf6 = new JTextField(50);
        tf6.setBounds(460, 380, 100, 30);//Amount
        //--------------------------------------------------------------------------------
        lb7 = new JLabel("Registered Date:");
        lb7.setBounds(400, 460, 150, 20);
        a1 = new JLabel("(yyyy-mm-dd)");
        a1.setBounds(600,460,100,20);
        tf7 = new JTextField(50);
        tf7.setBounds(500, 460, 100, 30);//date
        //--------------------------------------------------------------------------------
        a2 = new JLabel("(yyyy-mm-dd)");
        a2.setBounds(650,520,100,20);
        lb8 = new JLabel("vaccine received Date:");
        lb8.setBounds(400, 520, 150, 20);
        tf8 = new JTextField(50);
        tf8.setBounds(550, 520, 60, 30);//recived
        //---------------------------------------------------------------------------------------------
        lb9 = new JLabel("Age:");
        lb9.setBounds(570,380,60,20);
        tf9 = new JTextField();
        tf9. setBounds(600,380,60,30);
        //-----------------------------------------------------------------------------------------
        lb10 = new JLabel("Disability:");
        lb10.setBounds(670,380,60,20);
        tf10 = new JTextField();
        tf10.setBounds(730,380,60,30);
        tf1.setEditable(false);tf2.setEditable(false);tf3.setEditable(false);
        tf4.setEditable(false);tf6.setEditable(false);tf7.setEditable(false);
        tf9.setEditable(false);tf10.setEditable(false);

        // - -------------------------------------------------------------------
        JLabel a3 = new JLabel("Dose:");
        JLabel a4 = new JLabel("Payment:");
        a3.setBounds(360,580,40,20);
        j1 = new JCheckBox("First");
        j1.setBounds(410,580,60,20);
        j2 = new JCheckBox("Second");
        j2.setBounds(470,580,80,20);
        //----------------------------------------------------------------------------------
        r1 = new JCheckBox("paid");
        r2 = new JCheckBox("Not paid");
        a4.setBounds(550,580,60,20);
        r1.setBounds(610,580,60,20);
        r2.setBounds(670,580,80,20);
        JLabel a5 = new JLabel("Status:");
        a5.setBounds(750,580,50,20);
        S1 = new JCheckBox("Received");
        S2 = new JCheckBox("Not Received");
        S1.setBounds(800,580,80,20);
        S2.setBounds(890,580,110,20);
        ButtonGroup bg = new ButtonGroup();
        ButtonGroup Bg = new ButtonGroup();
        ButtonGroup gg = new ButtonGroup();
        gg.add(S1);gg.add(S2);
        bg.add(j1);bg.add(j2);
        Bg.add(r1);Bg.add(r2);
        //--------------------------------------------------------------------------
        btn = new JButton("Submit");
        btn.setBounds(430, 50, 80, 30);
        btn.addActionListener(this);
        btn2 = new JButton("Enter");
        btn2.setBounds(730, 650, 80, 30);
        btn2.addActionListener(this);
        btn3 = new JButton("Clear");
        btn3.setBounds(430,650,80,30);
        btn3.addActionListener(this);
        //_________________________________________________________________________________

        j.add(lb5);j.add(tf5);j.add(btn);j.add(lb);j.add(lb1);j.add(tf1);j.add(lb2);j.add(lb7);j.add(tf8);j.add(lb8);j.add(tf9);
        j.add(tf2);j.add(lb3);j.add(tf3);j.add(lb4);j.add(tf4);j.add(lb6);j.add(tf6);j.add(tf7);j.add(btn2);j.add(a2);j.add(a1);
        j.add(j1);j.add(a3);j.add(j2);j.add(a4);j.add(r1);j.add(r2);j.add(btn3);j.add(lb9);j.add(lb10);j.add(tf10);j.add(a5);j.add(S1);
        j.add(S2);

        j.setLayout(null);
        j.setVisible(true);
        j.setSize(500, 500);
        //Add components to the JFrame
        //Set TextField Editable False


    }

    public void actionPerformed(ActionEvent e) {
        String r = j1.getText();
        String R = j2.getText();
        String E = r1.getText();
        String F = r2.getText();
        String g = tf8.getText();
        String A = S1.getText();
        String B = S2.getText();
        if (e.getSource() == btn3) {
            tf5.setText("");
            tf8.setText("");
        }
        else
            {
            try {
                String str = tf5.getText();
                if (str.length() != 7) {
                    JOptionPane.showMessageDialog(null, "ENTER CORRECT Ref_number");
                } else {
                    //database connection-------------------------------------------------------------------------------------------
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    PreparedStatement st = con.prepareStatement("select * from details where Ref_number=?");
                    st.setString(1, str);
                    ResultSet rs = st.executeQuery();
                    if (e.getSource() == btn) {
                        //Data retriving-------------------------------------------------------------------------------------------------------
                        if (rs.next()) {
                            String s1 = rs.getString("username");
                            String s2 = rs.getString("vaccine");
                            String s3 = rs.getString("aadhar");
                            String s4 = rs.getString("mobile_number");
                            String s5 = rs.getString("Amount");
                            String s6 = rs.getString("age");
                            String s7 = rs.getString("Date");
                            String s9 = rs.getString("Disability");
                            //Sets Records in TextFields.
                            tf1.setText(s1);
                            tf2.setText(s2);
                            tf3.setText(s3);
                            tf4.setText(s4);
                            tf6.setText(s5);
                            tf7.setText(s7);
                            tf9.setText(s6);
                            tf10.setText(s9);

                        }
                        //If search is not found_-----------------------------------------------------------------------------------------------------------------------
                        else {
                            JOptionPane.showMessageDialog(null, "Data not Found");
                        }
                    }
                    //Clear the search bar-------------------------------------------------------------------------------------------------------------------------------
                    //Sql connection to put retrived data in new database-----------------------------------------------------------------------------
                    if (e.getSource() == btn2) {
                        try {

                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctordb", "adi", "2001");
                            Statement Sql_connection = connection.createStatement();
                            if (rs.next()) {
                                String s1 = rs.getString("username");
                                String s2 = rs.getString("vaccine");
                                String s3 = rs.getString("aadhar");
                                String s4 = rs.getString("mobile_number");
                                String s5 = rs.getString("Amount");
                                String s6 = rs.getString("age");
                                String s7 = rs.getString("Date");
                                String s9 = rs.getString("Disability");
                                String s11 = r;
                                String s12 = E;
                                String s13 = R;
                                String s14 = F;
                                String s15 = A;
                                String s16 = B;
                                //Sets Records in TextFields.

                                Date date = Date.valueOf(g);
                                System.out.println(date);

                                // if paid and vaccine received----------------------------------------------------------------------------
                                if (j1.isSelected() && r1.isSelected() && S1.isSelected()) {


                                    String sqlstatement = "insert into details (name,vaccine,aadhar,mobile_number,Amount,Disability,age,Reg_Date,Recevied_Date,Payment,Dose,Status) " +
                                        "values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" +
                                        s5 + "','" + s9 + "','" + s6 + "','" + s7 + "','" + date + "','" + s12 + "','" + s11 + "','" + s15 + "')";
                                    int row = Sql_connection.executeUpdate(sqlstatement);
                                    JOptionPane.showMessageDialog(null, "Data updated");

                                }
                                //if not----------------------------------------------------------------------------------------------------------------------
                                if (j1.isSelected() && r2.isSelected() && S2.isSelected()) {

                                    String sqlstatement = "insert into details (name,vaccine,aadhar,mobile_number,Amount,Disability,age,Reg_Date,Recevied_Date,Payment,Dose,Status) " +
                                        "values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" +
                                        s5 + "','" + s9 + "','" + s6 + "','" + s7 + "','" + date + "','" + s14 + "','" + s11 + "','" + s16 + "')";
                                    int row = Sql_connection.executeUpdate(sqlstatement);
                                    JOptionPane.showMessageDialog(null, "Data updated");
                                }
                                //second dose ,paid and received--------------------------------------------
                                if (j2.isSelected() && r1.isSelected() && S1.isSelected()) {

                                    String sqlstatement = "insert into details (name,vaccine,aadhar,mobile_number,Amount,Disability,age,Reg_Date,Recevied_Date,Payment,Dose,Status)" +
                                        "values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" +
                                        s5 + "','" + s9 + "','" + s6 + "','" + s7 + "','" + date + "','" + s12 + "','" + s13 + "','" + s15 + "')";
                                    int row = Sql_connection.executeUpdate(sqlstatement);
                                    JOptionPane.showMessageDialog(null, "Data updated");
                                }
                                //second dose, not paid and not received
                                if (j2.isSelected() && r2.isSelected() && S2.isSelected()) {

                                    String sqlstatement = "insert into details (name,vaccine,aadhar,mobile_number,Amount,Disability,age,Reg_Date,Recevied_Date,Payment,Dose,Status) " +
                                        "values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" +
                                        s5 + "','" + s9 + "','" + s6 + "','" + s7 + "','" + date + "','" + s14 + "','" + s13 + "','" + s16 + "')";
                                    int row = Sql_connection.executeUpdate(sqlstatement);
                                    JOptionPane.showMessageDialog(null, "Data updated");
                                }
                            }

                        } catch (Exception e1) {
                            JLabel er = new JLabel("Data Error");
                            JPanel j = new JPanel();
                            er.setFont(new Font("Times new roman", Font.BOLD, 14));
                            j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                            j.add(er);
                            JOptionPane.showMessageDialog(null, j);
                            e1.printStackTrace();
                        }
                    }
                }
            }
            //exception------------------------------------------------------------------------------------------------------------------------------------
            catch (Exception ex) {

                ex.printStackTrace();
            }
        }
    }


    public static void main(String args[]) {
        new doctor();
    }
}