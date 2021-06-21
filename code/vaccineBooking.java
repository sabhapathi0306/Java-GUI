package GUI;
// package importing-------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
public class vaccineBooking implements ActionListener {
    JTextField t1, t2, t3, t5, t6, t7, t8, t9;
    JTextArea t4;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, a1, p1;
    JLabel d1,d2,d3,d4,d5,d6,d7,c1,c2;
    JFrame f;
    JDialog g;
    JRadioButton B1, B2, B3, D1, D2;
    JSpinner s;
    JButton b1, b2;

    //-----------------------------------------------------------------
    vaccineBooking() {

        //Frame and dialog box object----------------------------------
        f = new JFrame("Vaccine Booking");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\adith\\Desktop\\jdk\\IN.png");
        f.setIconImage(icon);
        g = new JDialog();
        //top labels-----------------------------------------------------
        l10 = new JLabel("FILL ALL ENTRIES");
        l10.setFont(new Font("Times new roman", Font.BOLD, 16));
        l11 = new JLabel("Disability Proof should summit during vaccination,if YES");
        l11.setBounds(380, 70, 300, 30);
        l11.setFont(new Font("Times new roman", Font.BOLD, 12));
        l10.setBounds(450, 40, 500, 30);
        t1 = new JTextField();
        t1.setBounds(400, 115, 300, 40);//name
        l1 = new JLabel("Enter your Name :");
        l1.setBounds(280, 110, 200, 60);
        t2 = new JTextField();
        t2.setBounds(400, 170, 200, 40);//aadhar
        l2 = new JLabel("Aadhaar Number :");
        l2.setBounds(300, 160, 200, 60);
        t3 = new JTextField();
        t3.setBounds(400, 220, 200, 40);//mobile
        l3 = new JLabel("Mobile Number :");
        l3.setBounds(300, 210, 200, 60);
        String vaccine[] = {"COVAXIN", "COVIDSHEILD", "MODERNA", "PFIZER", "JHONSON AND JHONSON", "NOVAVAX", "SPUTNIK V"};//vaccines
        s = new JSpinner(new SpinnerListModel(vaccine));
        s.setBounds(400, 270, 200, 40);
        JFormattedTextField t = ((JSpinner.DefaultEditor) s.getEditor()).getTextField();//formatter
        t.setEditable(false);
        l4 = new JLabel("vaccine :");
        l4.setBounds(300, 260, 200, 60);
        t4 = new JTextArea(2, 2);
        t4.setBounds(400, 320, 300, 70);//address
        l5 = new JLabel("Address :");
        l5.setBounds(300, 310, 200, 60);
        //gender and disability radiobuttons-----------------------------------------------------
        l6 = new JLabel("Gender :");
        l6.setBounds(300, 390, 200, 60);
        B1 = new JRadioButton("Male");
        B1.setBounds(400, 400, 100, 30);
        B2 = new JRadioButton("Female");
        B2.setBounds(400, 420, 100, 30);
        B3 = new JRadioButton("Others");
        B3.setBounds(400, 440, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(B1);
        bg.add(B2);
        bg.add(B3);
        l7 = new JLabel("Disability :");
        l7.setBounds(300, 470, 200, 60);
        D1 = new JRadioButton("Yes");
        D1.setBounds(400, 485, 50, 30);
        D2 = new JRadioButton("No");
        D2.setBounds(460, 485, 50, 30);
        ButtonGroup gg = new ButtonGroup();
        gg.add(D1);
        gg.add(D2);
        //State,District and pin----------------------------------------------------------------------
        l8 = new JLabel("State : ");
        l8.setBounds(300, 580, 200, 60);
        l12 = new JLabel("District: ");
        l12.setBounds(500, 575, 80, 60);
        p1 = new JLabel("Pin:");
        p1.setBounds(690, 590, 50, 30);
        t7 = new JTextField();
        t7.setBounds(550, 595, 130, 30);//district
        t6 = new JTextField();
        t6.setBounds(400, 540, 50, 30);//state
        t9 = new JTextField();
        t9.setBounds(725, 595, 80, 30);//pin
        l9 = new JLabel("Age :");
        l9.setBounds(300, 530, 200, 60);
        t5 = new JTextField();
        t5.setBounds(355, 595, 130, 30);//age
        t8 = new JTextField();
        t8.setBounds(565, 530, 100, 30);//date
        l13 = new JLabel("Date :");
        l13.setBounds(525, 530, 80, 20);
        a1 = new JLabel("(yyyy-mm-dd)");
        a1.setBounds(670, 530, 100, 30);
        b1 = new JButton("Enter");
        b1.setBounds(400, 650, 100, 50);//enter button
        b1.addActionListener(this);
        b2 = new JButton("Clear");
        b2.setBounds(600, 650, 100, 50);//clear button
        b2.addActionListener(this);
        //----------------------------------------------------------------------------------------------
        c1 = new JLabel("Example:");
        d1 = new JLabel("COVAXIN = 200/-");
        d2 = new JLabel("COVIDSHEILD = 1000/-");
        d3 = new JLabel("MODERNA = 2500/-");
        d4= new JLabel("PFIZER = 1500/-");
        d5 = new JLabel("JOHNSON AND JOHNSON = 750/-");
        d6 = new JLabel("NOVAVAX = 1200/-");
        d7 = new JLabel("SPUTNIK V = 800/-");
        c1.setBounds(900,85,100,40);
        d1.setBounds(900, 105, 300, 40);d2.setBounds(900, 125, 300, 40);
        d3.setBounds(900, 145, 300, 40);d4.setBounds(900, 165, 300, 40);
        d5.setBounds(900, 185, 300, 40);d6.setBounds(900, 205, 300, 40);
        d7.setBounds(900, 225, 300, 40);
        f.add(t1);
        f.add(t2);f.add(t3);f.add(t4);f.add(t5);
        f.add(t7);f.add(t8);f.add(a1);f.add(c1);
        f.add(t9);f.add(p1);f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l10);
        f.add(l11);f.add(b1);f.add(s);f.add(b2);f.add(B1);f.add(B2);
        f.add(B3);f.add(t6);f.add(l9);f.add(l12);f.add(l13);f.add(D1);
        f.add(D2);f.add(d1);f.add(d2);f.add(d3);f.add(d4);f.add(d5);f.add(d6);f.add(d7);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String a = t1.getText();
        String username = a.toUpperCase();
        String aadhar = t2.getText();
        String mobile_number = t3.getText();
        String gender1 = B1.getText();
        String gender2 = B2.getText();
        String gender3 = B3.getText();
        String address = t4.getText();
        String age = t5.getText();
        String state = t6.getText();
        String State = state.toUpperCase();
        String district = t7.getText();
        String District = district.toUpperCase();
        String pin = t9.getText();
        String dis1 = D1.getText();
        String dis2 = D2.getText();
        JLabel b = new JLabel("" + s.getValue());
        String sDate1 = t8.getText();
        if (e.getSource() == b2) {
            t1.setText("");t4.setText("");
            t2.setText("");t3.setText("");
            t5.setText("");t6.setText("");
            t7.setText("");t8.setText("");
            t9.setText("");
        }
        if (e.getSource() == b1) {
            if (username == null && aadhar == null) {

                JPanel l = new JPanel();
                JLabel er = new JLabel("FILL ALL ENTRIES CORRECTLY");
                er.setFont(new Font("Times new roman", Font.BOLD, 14));
                l.add(er);
                JOptionPane.showMessageDialog(null, l);
            }
            //covaxibn--------------------------------------------------------------------------------------------------------------
            if (s.getValue() == "COVAXIN") {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "//username", "//password");
                    Date date = Date.valueOf(sDate1);
                    System.out.println(date);
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);
                        //If female and disable
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 200.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 200.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 200.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 200.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 200.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 200.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                } catch (Exception e1) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman", Font.CENTER_BASELINE, 12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);
                    j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e1.printStackTrace();
                    ;
                }
            }

            if (s.getValue() == "COVIDSHEILD") {
                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 1000.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //if aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 1000.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 1000.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 1000.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 1000.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 1000.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e2) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e2.printStackTrace();
                }
            }

            if (s.getValue() == "MODERNA") {
                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 2500.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 2500.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 2500.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 2500.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 2500.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 2500.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e3) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e3.printStackTrace();
                }
            }

            if (s.getValue() == "PFIZER") {

                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 1500.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 1500.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 1500.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 1500.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 1500.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 1500.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e4) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e4.printStackTrace();
                }
            }

            if (s.getValue() == "JHONSON AND JHONSON") {

                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 750.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 750.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 750.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 750.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 750.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 750.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e5) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e5.printStackTrace();
                }
            }

            if (s.getValue() == "SPUTNIK V") {

                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 800.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 800.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 800.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 800.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 800.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 800.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e6) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e6.printStackTrace();
                }
            }

            if (s.getValue() == "NOVAVAX") {

                try {
                    //databse connection----------------------------------------------------------------------
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "adi", "2001");
                    Date date = Date.valueOf(sDate1);
                    //aadhar,mobile, and pin error-----------------------------------------------------------
                    if (aadhar.length() != 12 || mobile_number.length() != 10 || pin.length() != 6) {
                        JPanel k = new JPanel();
                        JLabel er1 = new JLabel("Check mobile number,Aadhaar number and Pin");
                        er1.setFont(new Font("Times new roman", Font.ITALIC, 12));
                        k.setLayout(new BoxLayout(k, BoxLayout.Y_AXIS));
                        k.add(er1);
                        JOptionPane.showMessageDialog(null, k);
                    } else {
                        String n = username.substring(0, 3) + aadhar.substring(aadhar.length() - 4);//ref_number generator
                        //If female and disable--------------------------------------------------------------------
                        if (D1.isSelected() && B2.isSelected()) {
                            Double price = 1200.00;
                            Double q = price * 0.15;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }

                        }
                        //female not disable--------------------------------------------------------
                        else if (D2.isSelected() && B2.isSelected()) {
                            Double price = 1200.00;
                            Double q = price * 0.10;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender2 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male not disable------------------------------------------------------------------------
                        else if (D2.isSelected() && B1.isSelected()) {
                            Double price = 1200.00;
                            //Double q = price * 0.05;
                            // Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + price + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + price + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //male and disable-------------------------------------------------------------------
                        else if (D1.isSelected() && B1.isSelected()) {
                            Double price = 1200.00;
                            Double q = price * 0.05;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender1 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others-and disable-------------------------------------------------------------------------------
                        else if (B3.isSelected() && D1.isSelected()) {
                            Double price = 1200.00;
                            Double q = price * 0.20;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D1.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                        //others non disable---------------------------------------------------------------------
                        else if (D2.isSelected() && B3.isSelected()) {
                            Double price = 1200.00;
                            Double q = price * 0.16;
                            Double r = price - q;
                            JLabel o = new JLabel("Amount to be paid: " + r + "/-");
                            Statement s = connection.createStatement();
                            String query = "SELECT aadhar FROM details WHERE aadhar = '" + aadhar + "' ";
                            ResultSet rs = s.executeQuery(query);
                            //id aadhar already exits-------------------------------------------------------------------
                            if (rs.isBeforeFirst()) {
                                JPanel l = new JPanel();
                                JLabel err = new JLabel("AADHAR NUMBER ALREADY EXITS !!");
                                err.setFont(new Font("Times new roman", Font.BOLD, 14));
                                l.add(err);
                                JOptionPane.showMessageDialog(b1, l);
                            } else {
                                //data insertion into database--------------------------------------------------------
                                String sqlstatement = "insert into details (username,aadhar,mobile_number,vaccine,address,gender,Disability,age,Date,state,district,Pin,Ref_number,Amount) values('" + username + "','" + aadhar + "','" + mobile_number + "','" + b.getText() + "','" +
                                    address + "','" + gender3 + "','" + D2.getText() + "','" + State + "','" + date + "','" + age + "','" + District + "','" + pin + "','" + n + "','" + r + "')";
                                int row = s.executeUpdate(sqlstatement);
                                JPanel j = new JPanel();
                                JLabel l = new JLabel("_____Booking is Successful_____");
                                l.setFont(new Font("Times new roman", Font.BOLD, 12));
                                JLabel m = new JLabel("Name: " + username);
                                j.add(l);
                                j.add(m);
                                j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                                j.setSize(500, 500);
                                j.add(b);
                                JLabel ref = new JLabel("Ref_number: " + n);
                                j.add(ref);
                                j.add(o);
                                JOptionPane.showMessageDialog(null, j, "Message", JOptionPane.DEFAULT_OPTION);
                                s.close();
                                connection.close();
                            }
                        }
                    }
                }
                //Exception handlings-------------------------------------------------------------------------------
                catch (Exception e5) {
                    JPanel j = new JPanel();
                    JLabel er = new JLabel("--CHEACK FOR BLANK BOX--");
                    JLabel da = new JLabel("Enter date in proper fromate(eg:2020-2-31)");
                    er.setFont(new Font("Times new roman", Font.BOLD, 14));
                    da.setFont(new Font("Times new roman",Font.CENTER_BASELINE,12));
                    j.setLayout(new BoxLayout(j, BoxLayout.Y_AXIS));
                    j.add(er);j.add(da);
                    JOptionPane.showMessageDialog(null, j);
                    e5.printStackTrace();
                }
            }
        }
    }


    public static void main(String args[]) {
        new vaccineBooking();
    }
}
