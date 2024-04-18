package pmsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
        Connect();
        
        alt.setVisible(false);
        error.setVisible(false);
        ok.setVisible(false);
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "monitoringsystemdb", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    String age, gender, question, answer, access;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        Fname13 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        Fname14 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JLabel();
        Fname15 = new javax.swing.JLabel();
        Email13 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        Email14 = new javax.swing.JLabel();
        Add13 = new javax.swing.JLabel();
        Add14 = new javax.swing.JLabel();
        Add15 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        useraccess = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JRadioButton();
        btnStaff = new javax.swing.JRadioButton();
        Add26 = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JRadioButton();
        check = new javax.swing.JCheckBox();
        checkc = new javax.swing.JCheckBox();
        Add16 = new javax.swing.JLabel();
        jaddress = new javax.swing.JPanel();
        txtaddress = new javax.swing.JTextField();
        janswer = new javax.swing.JPanel();
        txtanswer = new javax.swing.JTextField();
        fname = new javax.swing.JPanel();
        txtfname = new javax.swing.JTextField();
        jlname = new javax.swing.JPanel();
        txtlname = new javax.swing.JTextField();
        jage = new javax.swing.JPanel();
        cbAge = new javax.swing.JComboBox<>();
        jgender = new javax.swing.JPanel();
        cbGender = new javax.swing.JComboBox<>();
        jdate = new javax.swing.JPanel();
        choosebirth = new com.toedter.calendar.JDateChooser();
        jemail = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jpass = new javax.swing.JPanel();
        txtpassword = new javax.swing.JPasswordField();
        jcpass = new javax.swing.JPanel();
        txtcpass = new javax.swing.JPasswordField();
        jcontact = new javax.swing.JPanel();
        txtcontact = new javax.swing.JTextField();
        Add17 = new javax.swing.JLabel();
        jques = new javax.swing.JPanel();
        combq = new javax.swing.JComboBox<>();
        alt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 750));
        setPreferredSize(new java.awt.Dimension(1200, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("REGISTRATION FORM");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        Fname13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname13.setForeground(new java.awt.Color(255, 255, 255));
        Fname13.setText("FIRST NAME:");
        jPanel2.add(Fname13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("LAST NAME:");
        jPanel2.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        Fname14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname14.setForeground(new java.awt.Color(255, 255, 255));
        Fname14.setText("AGE:");
        jPanel2.add(Fname14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        fullname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullname1.setForeground(new java.awt.Color(255, 255, 255));
        fullname1.setText("GENDER:");
        jPanel2.add(fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        Fname15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname15.setForeground(new java.awt.Color(255, 255, 255));
        Fname15.setText("DATE OF BIRTH:");
        jPanel2.add(Fname15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        Email13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email13.setForeground(new java.awt.Color(255, 255, 255));
        Email13.setText("EMAIL:");
        jPanel2.add(Email13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, -1));

        btnclear.setBackground(new java.awt.Color(0, 51, 255));
        btnclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR ALL");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        Email14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email14.setForeground(new java.awt.Color(255, 255, 255));
        Email14.setText("PASSWORD:");
        jPanel2.add(Email14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        Add13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add13.setForeground(new java.awt.Color(255, 255, 255));
        Add13.setText("CONFIRM PASSWORD:");
        jPanel2.add(Add13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        Add14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add14.setForeground(new java.awt.Color(255, 255, 255));
        Add14.setText("ADDRESS:");
        jPanel2.add(Add14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        Add15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add15.setForeground(new java.awt.Color(255, 255, 255));
        Add15.setText("CONTACT NUMBER:");
        jPanel2.add(Add15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        btnregister.setBackground(new java.awt.Color(0, 51, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Already have an account? Login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 180, -1));

        useraccess.setBackground(new java.awt.Color(0, 0, 153));
        useraccess.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        useraccess.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        useraccess.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btnStaff.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnStaff.setText("Staff");
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        useraccess.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Add26.setBackground(new java.awt.Color(0, 0, 0));
        Add26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add26.setForeground(new java.awt.Color(255, 255, 255));
        Add26.setText("USER ACCESS:");
        useraccess.add(Add26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        btnCustomer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        useraccess.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jPanel2.add(useraccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 540, 40));

        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel2.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, 20));

        checkc.setForeground(new java.awt.Color(255, 255, 255));
        checkc.setText("show password");
        checkc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcActionPerformed(evt);
            }
        });
        jPanel2.add(checkc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        Add16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add16.setForeground(new java.awt.Color(255, 255, 255));
        Add16.setText("ANSWER:");
        jPanel2.add(Add16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jaddress.setBackground(new java.awt.Color(0, 0, 153));
        jaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jaddress.setPreferredSize(new java.awt.Dimension(260, 40));

        txtaddress.setBackground(new java.awt.Color(0, 0, 153));
        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaddress.setForeground(new java.awt.Color(255, 255, 255));
        txtaddress.setBorder(null);
        txtaddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jaddressLayout = new javax.swing.GroupLayout(jaddress);
        jaddress.setLayout(jaddressLayout);
        jaddressLayout.setHorizontalGroup(
            jaddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        jaddressLayout.setVerticalGroup(
            jaddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaddressLayout.createSequentialGroup()
                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 540, 40));

        janswer.setBackground(new java.awt.Color(0, 0, 153));
        janswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtanswer.setBackground(new java.awt.Color(0, 0, 153));
        txtanswer.setForeground(new java.awt.Color(255, 255, 255));
        txtanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout janswerLayout = new javax.swing.GroupLayout(janswer);
        janswer.setLayout(janswerLayout);
        janswerLayout.setHorizontalGroup(
            janswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        janswerLayout.setVerticalGroup(
            janswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janswerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(janswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 260, 40));

        fname.setBackground(new java.awt.Color(0, 0, 153));
        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fname.setPreferredSize(new java.awt.Dimension(260, 40));

        txtfname.setBackground(new java.awt.Color(0, 0, 153));
        txtfname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfname.setForeground(new java.awt.Color(255, 255, 255));
        txtfname.setToolTipText("");
        txtfname.setBorder(null);
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fnameLayout = new javax.swing.GroupLayout(fname);
        fname.setLayout(fnameLayout);
        fnameLayout.setHorizontalGroup(
            fnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fnameLayout.setVerticalGroup(
            fnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jlname.setBackground(new java.awt.Color(0, 0, 153));
        jlname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlname.setPreferredSize(new java.awt.Dimension(260, 40));

        txtlname.setBackground(new java.awt.Color(0, 0, 153));
        txtlname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlname.setForeground(new java.awt.Color(255, 255, 255));
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlnameLayout = new javax.swing.GroupLayout(jlname);
        jlname.setLayout(jlnameLayout);
        jlnameLayout.setHorizontalGroup(
            jlnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jlnameLayout.setVerticalGroup(
            jlnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jage.setBackground(new java.awt.Color(0, 0, 153));
        jage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        cbAge.setBackground(new java.awt.Color(255, 255, 255));
        cbAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAge.setForeground(new java.awt.Color(0, 51, 153));
        cbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));
        cbAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jageLayout = new javax.swing.GroupLayout(jage);
        jage.setLayout(jageLayout);
        jageLayout.setHorizontalGroup(
            jageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jageLayout.createSequentialGroup()
                .addComponent(cbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jageLayout.setVerticalGroup(
            jageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 40));

        jgender.setBackground(new java.awt.Color(0, 0, 153));
        jgender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jgender.setPreferredSize(new java.awt.Dimension(260, 40));

        cbGender.setBackground(new java.awt.Color(255, 255, 255));
        cbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbGender.setMaximumRowCount(3);
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jgenderLayout = new javax.swing.GroupLayout(jgender);
        jgender.setLayout(jgenderLayout);
        jgenderLayout.setHorizontalGroup(
            jgenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jgenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jgenderLayout.setVerticalGroup(
            jgenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jgenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 260, 40));

        jdate.setBackground(new java.awt.Color(0, 0, 153));
        jdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        choosebirth.setDateFormatString("MMMM d, yyyy");

        javax.swing.GroupLayout jdateLayout = new javax.swing.GroupLayout(jdate);
        jdate.setLayout(jdateLayout);
        jdateLayout.setHorizontalGroup(
            jdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(choosebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jdateLayout.setVerticalGroup(
            jdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(choosebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 40));

        jemail.setBackground(new java.awt.Color(0, 0, 153));
        jemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jemail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmsystem/remove.png"))); // NOI18N
        jemail.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 40));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmsystem/save.png"))); // NOI18N
        jemail.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 40));

        txtemail.setBackground(new java.awt.Color(0, 0, 153));
        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jemail.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jPanel2.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 540, 40));

        jpass.setBackground(new java.awt.Color(0, 0, 153));
        jpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtpassword.setBackground(new java.awt.Color(0, 0, 153));
        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpassLayout = new javax.swing.GroupLayout(jpass);
        jpass.setLayout(jpassLayout);
        jpassLayout.setHorizontalGroup(
            jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpassLayout.setVerticalGroup(
            jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, 40));

        jcpass.setBackground(new java.awt.Color(0, 0, 153));
        jcpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtcpass.setBackground(new java.awt.Color(0, 0, 153));
        txtcpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcpass.setForeground(new java.awt.Color(255, 255, 255));
        txtcpass.setBorder(null);
        txtcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcpassLayout = new javax.swing.GroupLayout(jcpass);
        jcpass.setLayout(jcpassLayout);
        jcpassLayout.setHorizontalGroup(
            jcpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcpassLayout.createSequentialGroup()
                .addComponent(txtcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jcpassLayout.setVerticalGroup(
            jcpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcpassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 260, 40));

        jcontact.setBackground(new java.awt.Color(0, 0, 153));
        jcontact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jcontact.setPreferredSize(new java.awt.Dimension(260, 40));
        jcontact.setRequestFocusEnabled(false);

        txtcontact.setBackground(new java.awt.Color(0, 0, 153));
        txtcontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcontact.setForeground(new java.awt.Color(255, 255, 255));
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });
        txtcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jcontactLayout = new javax.swing.GroupLayout(jcontact);
        jcontact.setLayout(jcontactLayout);
        jcontactLayout.setHorizontalGroup(
            jcontactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcontactLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jcontactLayout.setVerticalGroup(
            jcontactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcontactLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 260, 40));

        Add17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add17.setForeground(new java.awt.Color(255, 255, 255));
        Add17.setText("SECURITY QUESTION:");
        jPanel2.add(Add17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jques.setBackground(new java.awt.Color(0, 0, 153));
        jques.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        combq.setBackground(new java.awt.Color(255, 255, 255));
        combq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combq.setForeground(new java.awt.Color(255, 255, 255));
        combq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite color? ", "What is your favorite food?", "What is your nickname?" }));
        combq.setMinimumSize(new java.awt.Dimension(260, 40));
        combq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jquesLayout = new javax.swing.GroupLayout(jques);
        jques.setLayout(jquesLayout);
        jquesLayout.setHorizontalGroup(
            jquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jquesLayout.createSequentialGroup()
                .addComponent(combq, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jquesLayout.setVerticalGroup(
            jquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jquesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(combq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jques, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 260, 40));

        alt.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        alt.setForeground(new java.awt.Color(255, 102, 102));
        alt.setText("Sorry... Email is already taken");
        jPanel2.add(alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 630, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 740));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmsystem/frontpage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 650, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtfname.setText("");
        txtfname.setText("");
        txtcontact.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtpassword.setText("");
        txtcpass.setText("");
        btnAdmin.setSelected(false);
        btnCustomer.setSelected(false);
        btnStaff.setSelected(false);
        cbAge.setSelectedItem(false);
        cbGender.setSelectedItem(false);
        combq.setSelectedItem(false);
        txtanswer.setText("");       
    }//GEN-LAST:event_btnclearActionPerformed

    
    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void cbAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAgeActionPerformed

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenderActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
   
    String fname = txtfname.getText();
    String lname = txtlname.getText();
    age = (String)cbAge.getSelectedItem().toString();
    gender = (String)cbGender.getSelectedItem().toString();
    SimpleDateFormat dFormat  = new SimpleDateFormat("yyyy-MM-dd");
    String birthday = dFormat.format(choosebirth.getDate());
    String email = txtemail.getText();
    String password = txtpassword.getText();
    String cpass = txtcpass.getText();
    String address = txtaddress.getText();
    String contact = txtcontact.getText();
    question = (String)combq.getSelectedItem().toString();
    String answer = txtanswer.getText();
   
    
            if (btnCustomer.isSelected()) {
                access = "Customer";
            } else if (btnStaff.isSelected()) {
                access = "Staff";
            }else if (btnAdmin.isSelected()) {
                access = "Admin";
            } else {
                JOptionPane.showMessageDialog(this, "Please select user access", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit method if no radio button is selected
            }
    
   
    if(txtfname.getText().isEmpty()||txtlname.getText().isEmpty()||cbAge.getSelectedItem().toString().isEmpty()||cbGender.getSelectedItem().toString().isEmpty()
            ||dFormat.format(choosebirth.getDate()).isEmpty()||txtemail.getText().isEmpty()||txtpassword.getText().isEmpty()||txtcpass.getText().isEmpty()|txtaddress.getText().isEmpty()
            ||txtcontact.getText().isEmpty()||combq.getSelectedItem().toString().isEmpty()||txtanswer.getText().isEmpty()){
        JOptionPane.showMessageDialog( this,  "Complete all Requirements!", "Input Missing", JOptionPane.ERROR_MESSAGE);
                    return;
    }
    if(!(new String(txtpassword.getPassword()).equals(new String(txtcpass.getPassword())))) {
        JOptionPane.showMessageDialog(this, "Your Password does not Match!");
        return;
    }
   
     try {
 
            pst = (PreparedStatement) con.prepareStatement("INSERT INTO registration(fname, lname, age, gender, birthday, email, password, cpass, address, contact, question, answer, access)"+  "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");                    
            
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, birthday);
            pst.setString(6, email);
            pst.setString(7, password);
            pst.setString(8, cpass);
            pst.setString(9, address);
            pst.setString(10, contact);
            pst.setString(11, question);
            pst.setString(12, answer);
            pst.setString(13, access);
          
            
            int x=pst.executeUpdate();
               
                      
            if(x == 1){
                JOptionPane.showMessageDialog(this,"Registration Successful");
                txtfname.setText("");
                txtcontact.setText("");
                txtaddress.setText("");
                txtemail.setText("");
                txtpassword.setText("");
                txtcpass.setText("");
                 
                 
             this.setVisible(false);
             new login().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"Registration Failed");
            }
                          
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        if(btnAdmin.isSelected())
            btnCustomer.setSelected(false);
            btnStaff.setSelected(false);           
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        if(btnStaff.isSelected())
            btnAdmin.setSelected(false);
            btnCustomer.setSelected(false);            
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        if(btnCustomer.isSelected())
            btnStaff.setSelected(false);
            btnAdmin.setSelected(false);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         new login().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpassActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()) {
            txtpassword.setEchoChar((char)0);
        }
        else {
            txtpassword.setEchoChar('*');            
        }
    }//GEN-LAST:event_checkActionPerformed

    private void checkcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcActionPerformed
        if(checkc.isSelected()) {
            txtcpass.setEchoChar((char)0);
        }
        else {
            txtcpass.setEchoChar('*');            
        }
    }//GEN-LAST:event_checkcActionPerformed

    private void txtanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanswerActionPerformed

    private void combqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combqActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        String Email = txtemail.getText();
        
        try{
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM registration WHERE email = '"+ Email + "'");
            
            if(rs.next()) {
                String yes = rs.getString("email");
                System.out.println(yes);
                alt.setVisible(true);
                error.setVisible(true);
                ok.setVisible(false);
                
                
            }else{
                
                int lng = Email.length();
                
                if (lng >= 20){
                    
                    System.out.println("no users");
                    alt.setVisible(false);
                    error.setVisible(false);
                    
                                    
                if(Email.equals("")){
                    ok.setVisible(false);
                }else{
                    ok.setVisible(true);
                }
                    
                }else{
                    alt.setText("Username must be atleast 20 characters");
                    alt.setVisible(true);
                    error.setVisible(true);
                    ok.setVisible(false);
                
                }                
                

          
            }
            
        } catch(Exception e){
            System.out.println(e);
            
            
        }
        

    }//GEN-LAST:event_txtemailKeyReleased

    private void txtcontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactKeyReleased

    }//GEN-LAST:event_txtcontactKeyReleased

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add13;
    private javax.swing.JLabel Add14;
    private javax.swing.JLabel Add15;
    private javax.swing.JLabel Add16;
    private javax.swing.JLabel Add17;
    private javax.swing.JLabel Add26;
    private javax.swing.JLabel Email13;
    private javax.swing.JLabel Email14;
    private javax.swing.JLabel Fname13;
    private javax.swing.JLabel Fname14;
    private javax.swing.JLabel Fname15;
    private javax.swing.JLabel alt;
    private javax.swing.JRadioButton btnAdmin;
    private javax.swing.JRadioButton btnCustomer;
    private javax.swing.JRadioButton btnStaff;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cbAge;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JCheckBox check;
    private javax.swing.JCheckBox checkc;
    private com.toedter.calendar.JDateChooser choosebirth;
    private javax.swing.JComboBox<String> combq;
    private javax.swing.JLabel error;
    private javax.swing.JPanel fname;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel fullname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jaddress;
    private javax.swing.JPanel jage;
    private javax.swing.JPanel janswer;
    private javax.swing.JPanel jcontact;
    private javax.swing.JPanel jcpass;
    private javax.swing.JPanel jdate;
    private javax.swing.JPanel jemail;
    private javax.swing.JPanel jgender;
    private javax.swing.JPanel jlname;
    private javax.swing.JPanel jpass;
    private javax.swing.JPanel jques;
    private javax.swing.JLabel ok;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPanel useraccess;
    // End of variables declaration//GEN-END:variables
}
