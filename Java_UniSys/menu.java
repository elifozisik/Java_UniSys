package javaUniSys;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class menu extends javax.swing.JFrame {
Universitaet uni = new Universitaet("Türkisch-Deutsche Universität","İstanbul");
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_student_geschlecht = new javax.swing.ButtonGroup();
        buttonGroup_dozent_geschlecht = new javax.swing.ButtonGroup();
        tf_addStudent_nachname = new javax.swing.JTextField();
        tf_addStudent_land = new javax.swing.JTextField();
        button_studentadd = new javax.swing.JButton();
        tf_addStudent_fakultaet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_addStudent_maennlich = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        button_addStudent_weiblich = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_addStudent_matrikelnummer = new javax.swing.JTextField();
        tf_addStudent_geburtsjahr = new javax.swing.JTextField();
        tf_addStudent_vorname = new javax.swing.JTextField();
        tf_addStudent_email = new javax.swing.JTextField();
        tf_addStudent_fach = new javax.swing.JTextField();
        tf_addStudent_semester = new javax.swing.JTextField();
        button_studentsuchen = new javax.swing.JButton();
        button_studentBearbeiten = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_sucheStudent_matrikelnummer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_studentSuchen = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_studentlist = new javax.swing.JTable();
        button_studentloeschen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_Dozentsuchen = new javax.swing.JButton();
        button_DozentBearbeiten = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_sucheDozent_personalnummer = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_dozentSuchen = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        button_addDozent_weiblich = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_studentlva = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        button_Dozentloeschen = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_addDozent_personalnummer = new javax.swing.JTextField();
        tf_addDozent_geburtsjahr = new javax.swing.JTextField();
        tf_addDozent_vorname = new javax.swing.JTextField();
        tf_addDozent_email = new javax.swing.JTextField();
        tf_addDozent_nachname = new javax.swing.JTextField();
        tf_addDozent_land = new javax.swing.JTextField();
        button_Dozentadd = new javax.swing.JButton();
        tf_addDozent_fakultaet = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        button_addDozent_maennlich = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        tf_addDozent_fach = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tf_addLVA_modulname = new javax.swing.JTextField();
        tf_addLVA_code = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_dozentlist = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        button_LVAadd = new javax.swing.JButton();
        button_LVAsuchen = new javax.swing.JButton();
        button_LVABearbeiten = new javax.swing.JButton();
        tf_sucheLVA_code = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_LVASuchen = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        button_LVAloeschen = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_dozentlva = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_listallstudentlvas = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        button_student_abmelden = new javax.swing.JButton();
        button_student_anmelden = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        button_dozent_abmelden = new javax.swing.JButton();
        button_dozent_zuweisen = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        table_listalldozentlvas = new javax.swing.JTable();
        exitbutton = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        table_LVAlist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management Programm");

        tf_addStudent_nachname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addStudent_nachname.setMaximumSize(null);
        tf_addStudent_nachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addStudent_nachnameActionPerformed(evt);
            }
        });

        button_studentadd.setText("Student Hinzufuegen");
        button_studentadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_studentaddActionPerformed(evt);
            }
        });

        jLabel5.setText("Geschlecht");

        jLabel6.setText("Geburtsjahr");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup_student_geschlecht.add(button_addStudent_maennlich);
        button_addStudent_maennlich.setText("maennlich");
        button_addStudent_maennlich.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setText("Email Adresse");

        buttonGroup_student_geschlecht.add(button_addStudent_weiblich);
        button_addStudent_weiblich.setText("weiblich");
        button_addStudent_weiblich.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addStudent_weiblich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addStudent_weiblichActionPerformed(evt);
            }
        });

        jLabel8.setText("Land");

        jLabel12.setText("Fach");

        jLabel9.setText("Fakultaet");

        jLabel10.setText("Semester");

        jLabel4.setText("Nachname");

        tf_addStudent_matrikelnummer.setToolTipText("");
        tf_addStudent_matrikelnummer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addStudent_matrikelnummer.setMaximumSize(null);
        tf_addStudent_matrikelnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addStudent_matrikelnummerActionPerformed(evt);
            }
        });

        tf_addStudent_vorname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addStudent_vorname.setMaximumSize(null);
        tf_addStudent_vorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addStudent_vornameActionPerformed(evt);
            }
        });

        button_studentsuchen.setText("Suchen");
        button_studentsuchen.setFocusable(false);
        button_studentsuchen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_studentsuchen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_studentsuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_studentsuchenActionPerformed(evt);
            }
        });

        button_studentBearbeiten.setText("Aenderungen speichern");
        button_studentBearbeiten.setFocusable(false);
        button_studentBearbeiten.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_studentBearbeiten.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_studentBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_studentBearbeitenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student List");

        tf_sucheStudent_matrikelnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sucheStudent_matrikelnummerActionPerformed(evt);
            }
        });

        table_studentSuchen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_studentSuchen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer", "Vorname", "Nachname", "Geschlecht", "Geburtsjahr", "Email", "Land", "Fakultaet", "Fach", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_studentSuchen);
        if (table_studentSuchen.getColumnModel().getColumnCount() > 0) {
            table_studentSuchen.getColumnModel().getColumn(2).setHeaderValue("Nachname");
            table_studentSuchen.getColumnModel().getColumn(3).setPreferredWidth(50);
            table_studentSuchen.getColumnModel().getColumn(3).setHeaderValue("W/M");
            table_studentSuchen.getColumnModel().getColumn(4).setHeaderValue("Geburtsjahr");
            table_studentSuchen.getColumnModel().getColumn(5).setHeaderValue("Email");
            table_studentSuchen.getColumnModel().getColumn(6).setHeaderValue("Land");
            table_studentSuchen.getColumnModel().getColumn(7).setHeaderValue("Fakultaet");
            table_studentSuchen.getColumnModel().getColumn(8).setHeaderValue("Fach");
            table_studentSuchen.getColumnModel().getColumn(9).setPreferredWidth(30);
            table_studentSuchen.getColumnModel().getColumn(9).setHeaderValue("Semester");
        }

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Student Suchen / Bearbeiten");

        jLabel13.setText("Geben Sie die Matrikelnummer des gesuchten Students ein:");

        jLabel14.setText("Matrikelnummer");

        jLabel15.setText("Vorname");

        table_studentlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer", "Vorname", "Nachname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_studentlist);

        button_studentloeschen.setText("Loeschen");
        button_studentloeschen.setFocusable(false);
        button_studentloeschen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_studentloeschen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_studentloeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_studentloeschenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Student Hinzufuegen");

        button_Dozentsuchen.setText("Suchen");
        button_Dozentsuchen.setFocusable(false);
        button_Dozentsuchen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_Dozentsuchen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_Dozentsuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DozentsuchenActionPerformed(evt);
            }
        });

        button_DozentBearbeiten.setText("Aenderungen speichern");
        button_DozentBearbeiten.setFocusable(false);
        button_DozentBearbeiten.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_DozentBearbeiten.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_DozentBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DozentBearbeitenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Dozent List");

        tf_sucheDozent_personalnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sucheDozent_personalnummerActionPerformed(evt);
            }
        });

        table_dozentSuchen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_dozentSuchen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Personalnummer", "Vorname", "Nachname", "W/M", "Geburtsjahr", "Email", "Land", "Fakultaet", "Fach"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_dozentSuchen);
        if (table_dozentSuchen.getColumnModel().getColumnCount() > 0) {
            table_dozentSuchen.getColumnModel().getColumn(2).setHeaderValue("Nachname");
            table_dozentSuchen.getColumnModel().getColumn(3).setPreferredWidth(50);
            table_dozentSuchen.getColumnModel().getColumn(3).setHeaderValue("W/M");
            table_dozentSuchen.getColumnModel().getColumn(4).setHeaderValue("Geburtsjahr");
            table_dozentSuchen.getColumnModel().getColumn(5).setHeaderValue("Email");
            table_dozentSuchen.getColumnModel().getColumn(6).setHeaderValue("Land");
            table_dozentSuchen.getColumnModel().getColumn(7).setHeaderValue("Fakultaet");
            table_dozentSuchen.getColumnModel().getColumn(8).setHeaderValue("Fach");
        }

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Dozent Suchen / Bearbeiten");

        jLabel17.setText("Geben Sie die Personalnummer des gesuchten Dozent ein:");

        jLabel18.setText("TC-Nummer");

        jLabel19.setText("Vorname");

        buttonGroup_dozent_geschlecht.add(button_addDozent_weiblich);
        button_addDozent_weiblich.setText("weiblich");
        button_addDozent_weiblich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addDozent_weiblichActionPerformed(evt);
            }
        });

        table_studentlva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulname", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_studentlva);

        jLabel20.setText("Land");

        jLabel21.setText("Fach");

        button_Dozentloeschen.setText("Loeschen");
        button_Dozentloeschen.setFocusable(false);
        button_Dozentloeschen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_Dozentloeschen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_Dozentloeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DozentloeschenActionPerformed(evt);
            }
        });

        jLabel22.setText("Fakultaet");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Dozent Hinzufuegen");

        jLabel25.setText("Nachname");

        tf_addDozent_personalnummer.setToolTipText("");
        tf_addDozent_personalnummer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addDozent_personalnummer.setMaximumSize(null);
        tf_addDozent_personalnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addDozent_personalnummerActionPerformed(evt);
            }
        });

        tf_addDozent_vorname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addDozent_vorname.setMaximumSize(null);
        tf_addDozent_vorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addDozent_vornameActionPerformed(evt);
            }
        });

        tf_addDozent_nachname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addDozent_nachname.setMaximumSize(null);
        tf_addDozent_nachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addDozent_nachnameActionPerformed(evt);
            }
        });

        button_Dozentadd.setText("Dozent Hinzufuegen");
        button_Dozentadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DozentaddActionPerformed(evt);
            }
        });

        jLabel26.setText("Geschlecht");

        jLabel27.setText("Geburtsjahr");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup_dozent_geschlecht.add(button_addDozent_maennlich);
        button_addDozent_maennlich.setText("maennlich");

        jLabel28.setText("Email Adresse");

        jLabel23.setText("Modulname");

        jLabel29.setText("Code");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("LVA Hinzufuegen");

        tf_addLVA_modulname.setToolTipText("");
        tf_addLVA_modulname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addLVA_modulname.setMaximumSize(null);
        tf_addLVA_modulname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addLVA_modulnameActionPerformed(evt);
            }
        });

        tf_addLVA_code.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_addLVA_code.setMaximumSize(null);
        tf_addLVA_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addLVA_codeActionPerformed(evt);
            }
        });

        table_dozentlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC-Nummer", "Vorname", "Nachname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(table_dozentlist);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("LVA List");

        button_LVAadd.setText("LVA Hinzufuegen");
        button_LVAadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LVAaddActionPerformed(evt);
            }
        });

        button_LVAsuchen.setText("Suchen");
        button_LVAsuchen.setFocusable(false);
        button_LVAsuchen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_LVAsuchen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_LVAsuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LVAsuchenActionPerformed(evt);
            }
        });

        button_LVABearbeiten.setText("Aenderungen speichern");
        button_LVABearbeiten.setFocusable(false);
        button_LVABearbeiten.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_LVABearbeiten.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_LVABearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LVABearbeitenActionPerformed(evt);
            }
        });

        tf_sucheLVA_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sucheLVA_codeActionPerformed(evt);
            }
        });

        table_LVASuchen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_LVASuchen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulname", "Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(table_LVASuchen);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("LVA Suchen / Bearbeiten");

        jLabel33.setText("Code des gesuchten LVAs:");

        button_LVAloeschen.setText("Loeschen");
        button_LVAloeschen.setFocusable(false);
        button_LVAloeschen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_LVAloeschen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_LVAloeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LVAloeschenActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("angemeldeten Studenten der LVA");

        table_dozentlva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulname", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(table_dozentlva);

        table_listallstudentlvas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer", "Vorname", "Nachname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_listallstudentlvas);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("LVAs des Students");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("LVAs des Dozents");

        button_student_abmelden.setText("Abmelden");
        button_student_abmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_student_abmeldenActionPerformed(evt);
            }
        });

        button_student_anmelden.setText("Anmelden");
        button_student_anmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_student_anmeldenActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Student zur LVA anmelden/ von LVA abmelden");

        button_dozent_abmelden.setText("Abmelden");
        button_dozent_abmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dozent_abmeldenActionPerformed(evt);
            }
        });

        button_dozent_zuweisen.setText("Zuweisen");
        button_dozent_zuweisen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dozent_zuweisenActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("Dozent zur LVA zuweisen/von LVA abmelden");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("verantwortlichen Dozenten der LVA ");

        table_listalldozentlvas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Personalnummer", "Vorname", "Nachname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(table_listalldozentlvas);

        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        table_LVAlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulname", "Code"
            }
        ));
        jScrollPane11.setViewportView(table_LVAlist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_sucheStudent_matrikelnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(button_studentsuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel4))
                                            .addGap(38, 38, 38)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(button_studentadd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tf_addStudent_nachname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(button_addStudent_weiblich)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button_addStudent_maennlich))
                                                    .addComponent(tf_addStudent_semester)
                                                    .addComponent(tf_addStudent_fach)
                                                    .addComponent(tf_addStudent_geburtsjahr)
                                                    .addComponent(tf_addStudent_email)
                                                    .addComponent(tf_addStudent_land)
                                                    .addComponent(tf_addStudent_fakultaet)
                                                    .addComponent(tf_addStudent_vorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tf_addStudent_matrikelnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(171, 171, 171)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(61, 61, 61)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(287, 287, 287))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(button_studentloeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button_student_anmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button_student_abmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(button_studentBearbeiten))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel35))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(button_Dozentloeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button_dozent_zuweisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button_dozent_abmelden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(128, 128, 128)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(button_DozentBearbeiten))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(button_LVAloeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button_LVABearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel32)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel33)
                                            .addGap(18, 18, 18)
                                            .addComponent(tf_sucheLVA_code, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_LVAsuchen))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button_LVAadd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel29))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_addLVA_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_addLVA_modulname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel41))))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel27)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel25))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(button_Dozentadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tf_addDozent_nachname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(button_addDozent_weiblich)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(button_addDozent_maennlich))
                                                        .addComponent(tf_addDozent_fach)
                                                        .addComponent(tf_addDozent_geburtsjahr)
                                                        .addComponent(tf_addDozent_email)
                                                        .addComponent(tf_addDozent_land)
                                                        .addComponent(tf_addDozent_fakultaet)
                                                        .addComponent(tf_addDozent_vorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tf_addDozent_personalnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(94, 94, 94))
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_sucheDozent_personalnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button_Dozentsuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(203, 203, 203))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel31)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel24)
                    .addComponent(jLabel3)
                    .addComponent(jLabel30))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_personalnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_vorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(button_addDozent_weiblich)
                                            .addComponent(button_addDozent_maennlich)
                                            .addComponent(jLabel26))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_geburtsjahr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_land, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addDozent_fach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))
                                        .addGap(18, 18, 18)
                                        .addComponent(button_Dozentadd))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_matrikelnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_vorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(button_addStudent_weiblich)
                                            .addComponent(button_addStudent_maennlich)
                                            .addComponent(jLabel5))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_geburtsjahr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_land, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_fach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_addStudent_semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button_studentadd))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(tf_sucheStudent_matrikelnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_studentsuchen))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_studentBearbeiten)
                                    .addComponent(button_studentloeschen)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(tf_sucheDozent_personalnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Dozentsuchen))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_DozentBearbeiten)
                                    .addComponent(button_Dozentloeschen))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel38))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(button_student_anmelden)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(button_student_abmelden)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel40)
                                            .addGap(53, 53, 53)
                                            .addComponent(button_dozent_zuweisen)
                                            .addGap(12, 12, 12)
                                            .addComponent(button_dozent_abmelden))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_addLVA_modulname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_addLVA_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(5, 5, 5)
                        .addComponent(button_LVAadd)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_LVAsuchen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(tf_sucheLVA_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_LVABearbeiten)
                            .addComponent(button_LVAloeschen))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTabelle_alleLVA_von_Student(String matrikelnummer) // ALL LVAS EINES STUDENTS
    {
        
        Student student=uni.getstudent(Long.parseLong(matrikelnummer));
        
        DefaultTableModel dtm_studentlva= (DefaultTableModel) table_studentlva.getModel();
        dtm_studentlva.setRowCount(0);
        for(int i=0;i<uni.lvalist.size();i++)
        {
           if(uni.lvalist.get(i).getLva_studenten().contains(student)==true)
           {
               String[] studentslvas=new String[2];
               studentslvas[0]=uni.lvalist.get(i).getModulname();
               studentslvas[1]=uni.lvalist.get(i).getCode();
               dtm_studentlva.addRow(studentslvas);
           }
        }
    }
    
    private void updateTabelle_alleLVA_von_Dozent(String personalnummer)// ALLE LVAS EINES DOZENTS
    {
        Dozent dozent=uni.getdozent(Long.parseLong(personalnummer));
        
        DefaultTableModel dtm_dozentlva= (DefaultTableModel) table_dozentlva.getModel();
        dtm_dozentlva.setRowCount(0);
        for(int i=0;i<uni.lvalist.size();i++)
        {
           if(uni.lvalist.get(i).getLva_dozenten().contains(dozent)==true)
           {
               String[] dozentslvas=new String[2];
               dozentslvas[0]=uni.lvalist.get(i).getModulname();
               dozentslvas[1]=uni.lvalist.get(i).getCode();
               dtm_dozentlva.addRow(dozentslvas);
           }
        }
    }
    private void updateTabelle_alleStudenten(String code) //ALLE STUDENTS EINES LVAS
    {
        
        LVA lvasuchen_student=uni.getlva(code);
        
        DefaultTableModel dtm_allstudents= (DefaultTableModel)table_listallstudentlvas.getModel();
        
        dtm_allstudents.setRowCount(0);
        
        for(int i=0;i<uni.stlist.size();i++)
        {
               String[] studentlvas=new String[3];
               studentlvas[0]=Long.toString(lvasuchen_student.getLva_studenten().get(i).getMatrikelnummer());
               studentlvas[1]=lvasuchen_student.getLva_studenten().get(i).getVorname().toUpperCase();
               studentlvas[2]=lvasuchen_student.getLva_studenten().get(i).getNachname().toUpperCase();
               dtm_allstudents.addRow(studentlvas);
           
        }    
    }
    private void updateTabelle_alleDozenten(String code)//ALLE DOZENTS EINES LVAS
    {
        
        LVA lvasuchen_fuer_dozent=uni.getlva(code); 
        
        DefaultTableModel dtm_alldozents= (DefaultTableModel)table_listalldozentlvas.getModel();
        dtm_alldozents.setRowCount(0);
        
        //add dozent to lva list
        for(int j=0;j<uni.dzlist.size();j++)
        {
               String[] dozentslvas=new String[3];
               dozentslvas[0]=Long.toString(lvasuchen_fuer_dozent.getLva_dozenten().get(j).getPersonalnummer());
               dozentslvas[1]=lvasuchen_fuer_dozent.getLva_dozenten().get(j).getVorname().toUpperCase();
               dozentslvas[2]=lvasuchen_fuer_dozent.getLva_dozenten().get(j).getNachname().toUpperCase();
               dtm_alldozents.addRow(dozentslvas);
           
        }
    }
    
    private void loesche_tabelle(JTable table_loeschen) //TO CLEAR GIVEN TABELLE
    {
        DefaultTableModel loesche= (DefaultTableModel)table_loeschen.getModel();
        loesche.setRowCount(0);
    }
    
    private void tf_addStudent_nachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addStudent_nachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addStudent_nachnameActionPerformed

    private void button_studentaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_studentaddActionPerformed

        String addStudent_matrikelnummer = tf_addStudent_matrikelnummer.getText();
        String addStudent_vorname= "";
        addStudent_vorname=tf_addStudent_vorname.getText().trim().toUpperCase();
        String addStudent_nachname="";
        addStudent_nachname= tf_addStudent_nachname.getText().trim().toUpperCase();
        String addStudent_email= "";
        addStudent_email=tf_addStudent_email.getText().trim();
        String addStudent_fakultaet= "";
        addStudent_fakultaet=tf_addStudent_fakultaet.getText().trim();
        String addStudent_land= "";
        addStudent_land=tf_addStudent_land.getText().trim();
        String addStudent_fach="";
        addStudent_fach= tf_addStudent_fach.getText().trim();
        String addStudent_geburtsjahr ="";
        addStudent_geburtsjahr=tf_addStudent_geburtsjahr.getText();
        String addStudent_semester="";
        addStudent_semester= tf_addStudent_semester.getText();

        String addStudent_geschlecht="";

        //BUTTON GROUP
        if(button_addStudent_weiblich.isSelected())
        {
            addStudent_geschlecht="Weiblich";
        }
        else if(button_addStudent_maennlich.isSelected())
        {
            addStudent_geschlecht="Maennlich";
        }

        if(tf_addStudent_matrikelnummer.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Matrikelnummer musst ausgefüllt werden!");
        }
        else
        {
            if(Student.mnvalidation(Long.parseLong(addStudent_matrikelnummer))==false)//CHECKS IF MATRIKELNUMMER VALID
            {
                JOptionPane.showMessageDialog(null, "Es ist nicht möglich ein Student ohne gültige Matrikulationnummer zu registieren");
            }
            else if(uni.getstudent(Long.parseLong(addStudent_matrikelnummer))!=null)//CHECKS IF A STUDENT ALREADY EXISTS
            {
                JOptionPane.showMessageDialog(null, "Ein Student mit dieser Matrikelnummer existiert bereits");
            }
            else
            {
                
                uni.student_add(Long.parseLong(addStudent_matrikelnummer),addStudent_vorname,addStudent_nachname,addStudent_geschlecht,addStudent_geburtsjahr,addStudent_email,addStudent_land,addStudent_fakultaet,addStudent_fach,addStudent_semester);
                //JOptionPane.showMessageDialog(null, "Student wurde hinzugefuegt.");
                 
                //CREATING NEW STUDENT TO ADD LIST WITH FIRST 3 ATTRIBUTES -VOR-NACH NAME WITH GROSSBUCHSTABEN-
                String[] student = new String[3];
                student[0]=Long.toString(uni.getstudent(Long.parseLong(addStudent_matrikelnummer)).getMatrikelnummer());
                student[1]=uni.getstudent(Long.parseLong(addStudent_matrikelnummer)).getVorname().toUpperCase();
                student[2]=uni.getstudent(Long.parseLong(addStudent_matrikelnummer)).getNachname().toUpperCase();
                
                Object[] row={student[0],student[1],student[2]};
                
                //ADD THIS STUDENT OBJECT TO STUDENT LIST
                DefaultTableModel dtm_studentlist = (DefaultTableModel) table_studentlist.getModel();
                dtm_studentlist.addRow(row);
                
                 //CLEARING FIELDS AFTER ADDING STUDENT
                 buttonGroup_student_geschlecht.clearSelection();
                 tf_addStudent_vorname.setText("");
                 tf_addStudent_nachname.setText("");
                 tf_addStudent_email.setText("");
                 tf_addStudent_fakultaet.setText("");
                 tf_addStudent_land.setText("");
                 tf_addStudent_fach.setText("");
                 tf_addStudent_geburtsjahr .setText("");  
                 tf_addStudent_semester.setText("");
            }
        }
       
    }//GEN-LAST:event_button_studentaddActionPerformed

    private void button_addStudent_weiblichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addStudent_weiblichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addStudent_weiblichActionPerformed

    private void tf_addStudent_matrikelnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addStudent_matrikelnummerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_addStudent_matrikelnummerActionPerformed

    private void tf_addStudent_vornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addStudent_vornameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_addStudent_vornameActionPerformed

    private void button_studentsuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_studentsuchenActionPerformed
        // 2.table
         
        String sucheStudent_matrikelnummer = tf_sucheStudent_matrikelnummer.getText();
        
        if(uni.getstudent(Long.parseLong(sucheStudent_matrikelnummer))==null)
        {
                JOptionPane.showMessageDialog(null, "Student existiert nicht.");
        }
        else
        {
        Student studentsuchen=uni.getstudent(Long.parseLong(sucheStudent_matrikelnummer));
        
        String[] suchentable_studentarray = new String[10];
        suchentable_studentarray[0]=sucheStudent_matrikelnummer;
        suchentable_studentarray[1]=studentsuchen.getVorname();
        suchentable_studentarray[2]=studentsuchen.getNachname();
        suchentable_studentarray[3]=studentsuchen.getGeschlecht();
        suchentable_studentarray[4]=studentsuchen.getGeburtsjahr();
        suchentable_studentarray[5]=studentsuchen.getEmail();
        suchentable_studentarray[6]=studentsuchen.getLand();        
        suchentable_studentarray[7]=studentsuchen.getFakultaet();
        suchentable_studentarray[8]=studentsuchen.getFach();
        suchentable_studentarray[9]=studentsuchen.getSemester();
                
        DefaultTableModel dtm_studentsuchen= (DefaultTableModel) table_studentSuchen.getModel();
        dtm_studentsuchen.setRowCount(0);
        dtm_studentsuchen.addRow(suchentable_studentarray);
        
        updateTabelle_alleLVA_von_Student(sucheStudent_matrikelnummer); //LİSTS STUDENTS LVAS
        }
        
    }//GEN-LAST:event_button_studentsuchenActionPerformed

    private void button_studentBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_studentBearbeitenActionPerformed
        
        
            int i=table_studentSuchen.getSelectedRow(); //Suchen Tabelle
            
            String matrikelnummer = tf_sucheStudent_matrikelnummer.getText(); //suchend matrikelnummer
            
            Student student=uni.getstudent(Long.parseLong(matrikelnummer)); //object mit suchend
           
            student.setMatrikelnummer(Long.parseLong(table_studentSuchen.getValueAt(i, 0).toString()));
            student.setVorname(table_studentSuchen.getValueAt(i, 1).toString().toUpperCase());// neu vorname
            student.setNachname(table_studentSuchen.getValueAt(i, 2).toString().toUpperCase());//neu nachname
            student.setGeschlecht(table_studentSuchen.getValueAt(i, 3).toString());
            student.setGeburtsjahr(table_studentSuchen.getValueAt(i, 4).toString());
            student.setEmail(table_studentSuchen.getValueAt(i, 5).toString());
            student.setLand(table_studentSuchen.getValueAt(i, 6).toString());
            student.setFakultaet(table_studentSuchen.getValueAt(i, 7).toString());
            student.setFach(table_studentSuchen.getValueAt(i, 8).toString());
            student.setSemester(table_studentSuchen.getValueAt(i, 9).toString());
            
            
            DefaultTableModel dtm_studentlist = (DefaultTableModel) table_studentlist.getModel();//liste tabelle
            for(int k=0;k<dtm_studentlist.getRowCount();k++)
            {
                if(matrikelnummer.equals(table_studentlist.getValueAt(k, 0).toString())) 
                {
                
                String[] neustudent = new String[3];
                
                neustudent[0]=Long.toString(student.getMatrikelnummer());
                neustudent[1]=student.getVorname().toUpperCase();
                neustudent[2]=student.getNachname().toUpperCase();
                
                Object[] neustudentrow={neustudent[0],neustudent[1],neustudent[2]};
                
                dtm_studentlist.removeRow(k);
                dtm_studentlist.addRow(neustudentrow);
                
                JOptionPane.showMessageDialog(null, "Studentinformationen wurde bearbeitet.");break;
                }
            }
            tf_sucheStudent_matrikelnummer.setText(Long.toString(student.getMatrikelnummer()));
            loesche_tabelle(table_studentlva);
            loesche_tabelle(table_listallstudentlvas);
    }//GEN-LAST:event_button_studentBearbeitenActionPerformed

    private void tf_sucheStudent_matrikelnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sucheStudent_matrikelnummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sucheStudent_matrikelnummerActionPerformed

    private void button_studentloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_studentloeschenActionPerformed
       
        
        
            DefaultTableModel dtm_studentsuchen= (DefaultTableModel) table_studentSuchen.getModel();
            int i=table_studentSuchen.getSelectedRow();
            long matrikelnummer= Long.parseLong(table_studentSuchen.getValueAt(i, 0).toString());
            
            
            JOptionPane.showMessageDialog(null, "Student wurde geloescht");
            uni.student_loeschen(matrikelnummer);
            dtm_studentsuchen.removeRow(i);//loesche von suche tabelle
         
            DefaultTableModel dtm_studentlist = (DefaultTableModel) table_studentlist.getModel();
            for(int k=0;k<dtm_studentlist.getRowCount();k++)
            {
                if(matrikelnummer==Long.parseLong(table_studentlist.getValueAt(k, 0).toString()))
                {
                    dtm_studentlist.removeRow(k);//loesche von list tabelle
                }
            }
        loesche_tabelle(table_studentlva);
        loesche_tabelle(table_listallstudentlvas);
    }//GEN-LAST:event_button_studentloeschenActionPerformed

    private void button_DozentsuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DozentsuchenActionPerformed
        
        String sucheDozent_personalnummer = tf_sucheDozent_personalnummer.getText();
        if(uni.getdozent(Long.parseLong(sucheDozent_personalnummer))==null)
        {
                JOptionPane.showMessageDialog(null, "Dozent existiert nicht.");
        }
        else
        {
        Dozent dozentsuchen=uni.getdozent(Long.parseLong(sucheDozent_personalnummer));
        
        String[] suchentable_dozentarray = new String[10];
        suchentable_dozentarray[0]=sucheDozent_personalnummer;
        suchentable_dozentarray[1]=dozentsuchen.getVorname();
        suchentable_dozentarray[2]=dozentsuchen.getNachname();
        suchentable_dozentarray[3]=dozentsuchen.getGeschlecht();
        suchentable_dozentarray[4]=dozentsuchen.getGeburtsjahr();
        suchentable_dozentarray[5]=dozentsuchen.getEmail();
        suchentable_dozentarray[6]=dozentsuchen.getLand();        
        suchentable_dozentarray[7]=dozentsuchen.getFakultaet();
        suchentable_dozentarray[8]=dozentsuchen.getFach();
                
        DefaultTableModel dtm_dozentsuchen= (DefaultTableModel) table_dozentSuchen.getModel();
        dtm_dozentsuchen.setRowCount(0);
        dtm_dozentsuchen.addRow(suchentable_dozentarray);
        
        updateTabelle_alleLVA_von_Dozent(sucheDozent_personalnummer);
        }
        
        
    }//GEN-LAST:event_button_DozentsuchenActionPerformed

    private void button_DozentBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DozentBearbeitenActionPerformed
        
         
        
            int i=table_dozentSuchen.getSelectedRow(); //Suchen Tabelle
            
            String personalnummer = tf_sucheDozent_personalnummer.getText(); //suchend matrikelnummer
            
            Dozent dozent=uni.getdozent(Long.parseLong(personalnummer)); //object mit suchend
           
            //neu attributen
            dozent.setPersonalnummer(Long.parseLong(table_dozentSuchen.getValueAt(i, 0).toString()));
            dozent.setVorname(table_dozentSuchen.getValueAt(i, 1).toString());// neu vorname
            dozent.setNachname(table_dozentSuchen.getValueAt(i, 2).toString());//neu nachname
            dozent.setGeschlecht(table_dozentSuchen.getValueAt(i, 3).toString());
            dozent.setGeburtsjahr(table_dozentSuchen.getValueAt(i, 4).toString());
            dozent.setEmail(table_dozentSuchen.getValueAt(i, 5).toString());
            dozent.setLand(table_dozentSuchen.getValueAt(i, 6).toString());
            dozent.setFakultaet(table_dozentSuchen.getValueAt(i, 7).toString());
            dozent.setFach(table_dozentSuchen.getValueAt(i, 8).toString());
            
            
            DefaultTableModel dtm_dozentlist = (DefaultTableModel) table_dozentlist.getModel();//liste tabelle
            for(int k=0;k<dtm_dozentlist.getRowCount();k++)
            {
                if(personalnummer.equals(table_dozentlist.getValueAt(k, 0).toString())) 
                {
                
                String[] neudozent = new String[3];
                
                neudozent[0]=Long.toString(dozent.getPersonalnummer());
                neudozent[1]=dozent.getVorname().toUpperCase();
                neudozent[2]=dozent.getNachname().toUpperCase();
                
                Object[] neudozentrow={neudozent[0],neudozent[1],neudozent[2]};
                
                dtm_dozentlist.removeRow(k);
                dtm_dozentlist.addRow(neudozentrow);
                
                JOptionPane.showMessageDialog(null, "Dozentinformationen wurde bearbeitet.");break;
                }
            }
            tf_sucheDozent_personalnummer.setText(Long.toString(dozent.getPersonalnummer()));
            loesche_tabelle(table_dozentlva);
            loesche_tabelle(table_listalldozentlvas);
    }//GEN-LAST:event_button_DozentBearbeitenActionPerformed

    private void tf_sucheDozent_personalnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sucheDozent_personalnummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sucheDozent_personalnummerActionPerformed

    private void button_addDozent_weiblichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addDozent_weiblichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addDozent_weiblichActionPerformed

    private void button_DozentloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DozentloeschenActionPerformed
        
        
            DefaultTableModel dtm_dozentsuchen= (DefaultTableModel) table_dozentSuchen.getModel();
            int i=table_dozentSuchen.getSelectedRow();
            long personalnummer= Long.parseLong(table_dozentSuchen.getValueAt(i, 0).toString());
            
            
            uni.dozent_loeschen(personalnummer);//loesche von dozentlist
            dtm_dozentsuchen.removeRow(i);//loesche von suche tabelle
            JOptionPane.showMessageDialog(null, "Dozent wurde geloescht");
            
            DefaultTableModel dtm_dozentlist = (DefaultTableModel) table_dozentlist.getModel();
            for(int k=0;k<dtm_dozentlist.getRowCount();k++)
            {
                if(personalnummer==Long.parseLong(table_dozentlist.getValueAt(k, 0).toString()))
                {
                    dtm_dozentlist.removeRow(k);//loesche von list tabelle
                }
            }
            loesche_tabelle(table_dozentlva);
            loesche_tabelle(table_listalldozentlvas);
        
    }//GEN-LAST:event_button_DozentloeschenActionPerformed

    private void tf_addDozent_personalnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addDozent_personalnummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addDozent_personalnummerActionPerformed

    private void tf_addDozent_vornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addDozent_vornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addDozent_vornameActionPerformed

    private void tf_addDozent_nachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addDozent_nachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addDozent_nachnameActionPerformed

    private void button_DozentaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DozentaddActionPerformed
        
        String addDozent_personalnummer = tf_addDozent_personalnummer.getText();
        String addDozent_vorname= "";
        addDozent_vorname=tf_addDozent_vorname.getText().trim().toUpperCase();
        String addDozent_nachname="";
        addDozent_nachname= tf_addDozent_nachname.getText().trim().toUpperCase();
        String addDozent_email= "";
        addDozent_email=tf_addDozent_email.getText().trim();
        String addDozent_fakultaet= "";
        addDozent_fakultaet=tf_addDozent_fakultaet.getText().trim();
        String addDozent_land= "";
        addDozent_land=tf_addDozent_land.getText().trim();
        String addDozent_fach="";
        addDozent_fach= tf_addDozent_fach.getText().trim();
        String addDozent_geburtsjahr ="";
        addDozent_geburtsjahr=tf_addDozent_geburtsjahr.getText();

        String addDozent_geschlecht="";

        if(button_addDozent_weiblich.isSelected())
        {
            addDozent_geschlecht="Weiblich";
        }
        else if(button_addDozent_maennlich.isSelected())
        {
            addDozent_geschlecht="Maennlich";
        }

        if(tf_addDozent_personalnummer.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "TC-Nummer musst ausgefüllt werden!");//TCNUMMER FIELD CANT BE BLANK
        }
        else
        {
            if(Dozent.pnvalidantion((Long.parseLong(addDozent_personalnummer)))==false)
            {
                JOptionPane.showMessageDialog(null, "Es ist nicht möglich ein Dozent ohne gültige Personalnummer zu registieren");//CHECKS IF TCNUMMER VALID
            }
            else if(uni.getdozent(Long.parseLong(addDozent_personalnummer))!=null)
            {
                JOptionPane.showMessageDialog(null, "Ein Dozent mit dieser Personalnummer existiert bereits");//CHECKS IF DOZENT ALREADY EXISTS
            }
            else
            {
                //CREATING A NEW DOZENT WITH GIVEN VALUES
                uni.dozent_add(Long.parseLong(addDozent_personalnummer),addDozent_vorname,addDozent_nachname,addDozent_geschlecht,addDozent_geburtsjahr,addDozent_email,addDozent_land,addDozent_fakultaet,addDozent_fach);
                // JOptionPane.showMessageDialog(null, "Dozent wurde hinzugefuegt.");
                 
                //ADDING DOZENT TO LISTALL TABELLE
                String[] dozent = new String[3];
                dozent[0]=Long.toString(uni.getdozent(Long.parseLong(addDozent_personalnummer)).getPersonalnummer());
                dozent[1]=uni.getdozent(Long.parseLong(addDozent_personalnummer)).getVorname().toUpperCase();
                dozent[2]=uni.getdozent(Long.parseLong(addDozent_personalnummer)).getNachname().toUpperCase();
                
                Object[] row={dozent[0],dozent[1],dozent[2]};
                
                
                DefaultTableModel dtm_dozentlist = (DefaultTableModel) table_dozentlist.getModel();
                dtm_dozentlist.addRow(row);
                
                
                //CLEARING FIELDS AFTER CREATING A NEW DOZENT
                buttonGroup_dozent_geschlecht.clearSelection();
                tf_addDozent_vorname.setText("");
                tf_addDozent_nachname.setText("");
                tf_addDozent_geburtsjahr.setText("");
                tf_addDozent_land.setText("");
                tf_addDozent_email.setText("");
                tf_addDozent_fach.setText("");
                tf_addDozent_fakultaet.setText("");
            }
        }
    }//GEN-LAST:event_button_DozentaddActionPerformed

    private void tf_addLVA_modulnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addLVA_modulnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addLVA_modulnameActionPerformed

    private void tf_addLVA_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addLVA_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addLVA_codeActionPerformed

    private void button_LVAaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LVAaddActionPerformed
        
        String addLVA_modulname ="";
        addLVA_modulname=tf_addLVA_modulname.getText();
        String addLVA_code= "";
        addLVA_code=tf_addLVA_code.getText().trim();
        


        if(tf_addLVA_code.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Code field musst ausgefüllt werden!");
        }
        else
        {
            if(LVA.lvavalidation(addLVA_code)==false)
            {
                JOptionPane.showMessageDialog(null, "Es ist nicht möglich ein LVA ohne gültige Code zu erstellen");
            }
            else if(uni.getlva(addLVA_code)!=null)
            {
                JOptionPane.showMessageDialog(null, "Ein LVA mit dieser Code existiert bereits");
            }
            else
            {
                uni.lva_add(addLVA_code,addLVA_modulname);
                //JOptionPane.showMessageDialog(null, "LVA wurde erstellt.");
                 
                //list table
                String[] lva = new String[2];
                lva[0]=uni.getlva(addLVA_code).getModulname();
                lva[1]=uni.getlva(addLVA_code).getCode();
                
                Object[] lva_row={lva[0],lva[1]};
                
                
                DefaultTableModel dtm_lvalist = (DefaultTableModel) table_LVAlist.getModel();
                dtm_lvalist.addRow(lva_row);
                
                tf_addLVA_modulname.setText("");
                tf_addLVA_code.setText("");
            }
        }
    }//GEN-LAST:event_button_LVAaddActionPerformed

    private void button_LVAsuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LVAsuchenActionPerformed
       
        String sucheLVA_code = tf_sucheLVA_code.getText();
        
        if(uni.getlva(sucheLVA_code)==null)
        {
            JOptionPane.showMessageDialog(null, "LVA existiert nicht.");
        }
        else
        {
        LVA lvasuchen=uni.getlva(sucheLVA_code);
        
        String[] suchentable_lvaarray = new String[2];
        suchentable_lvaarray[0]=lvasuchen.getModulname();
        suchentable_lvaarray[1]=lvasuchen.getCode();
       
                
        DefaultTableModel dtm_lvasuchen= (DefaultTableModel) table_LVASuchen.getModel();
        dtm_lvasuchen.setRowCount(0);
        dtm_lvasuchen.addRow(suchentable_lvaarray);
        
        
        //LIST STUDENTS DES LVAS
        
        updateTabelle_alleStudenten(sucheLVA_code);
        

        //LIST DOZENTS DES LVAS
        
        DefaultTableModel dtm_lvalist= (DefaultTableModel) table_listalldozentlvas.getModel();
        dtm_lvalist.setRowCount(0);
        updateTabelle_alleDozenten(sucheLVA_code);
                
        
        }
    }//GEN-LAST:event_button_LVAsuchenActionPerformed

    private void button_LVABearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LVABearbeitenActionPerformed
    
            
            String code = tf_addLVA_code.getText();
            
            LVA lva=uni.getlva(code); //object mit suchend code
           
            lva.setModulname(table_LVASuchen.getValueAt(0, 0).toString());//neu modulname
                lva.setCode(table_LVASuchen.getValueAt(0, 1).toString());
            
            DefaultTableModel dtm_lvalist = (DefaultTableModel) table_LVAlist.getModel();//liste tabelle
            
            for(int k=0;k<dtm_lvalist.getRowCount();k++)
            {
                if(code.equals(table_LVAlist.getValueAt(k, 1))) 
                {
                String[] neulva = new String[2];
                
                neulva[0]=lva.getModulname();
                neulva[1]=lva.getCode();
                
                Object[] neulvarow={neulva[0],neulva[1]};
                
                dtm_lvalist.removeRow(k);
                dtm_lvalist.addRow(neulvarow);
                
                JOptionPane.showMessageDialog(null, "LVA-Informationen wurde bearbeitet.");break;
                }
            }
    }//GEN-LAST:event_button_LVABearbeitenActionPerformed

    private void tf_sucheLVA_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sucheLVA_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sucheLVA_codeActionPerformed

    private void button_LVAloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LVAloeschenActionPerformed
        
        DefaultTableModel dtm_lvasuchen= (DefaultTableModel) table_LVASuchen.getModel();
            int i=table_LVASuchen.getSelectedRow();
            String code= table_LVASuchen.getValueAt(i, 1).toString();
            
            
            uni.lva_loeschen(code);//loesche von dozentlist
            dtm_lvasuchen.removeRow(i);//loesche von suche tabelle
            JOptionPane.showMessageDialog(null, "LVA wurde geloescht");
            
            DefaultTableModel dtm_lvalist = (DefaultTableModel) table_LVAlist.getModel();
            for(int k=0;k<dtm_lvalist.getRowCount();k++)
            {
                if(code.equals(dtm_lvalist.getValueAt(k, 1).toString()))
                {
                    dtm_lvalist.removeRow(k);//loesche von list tabelle
                }
            }
            loesche_tabelle(table_studentlva);
            loesche_tabelle(table_dozentlva);
    }//GEN-LAST:event_button_LVAloeschenActionPerformed

    private void button_student_anmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_student_anmeldenActionPerformed
        
        String student_anmelden_code=tf_sucheLVA_code.getText();
        String matrikelnummer_students=tf_sucheStudent_matrikelnummer.getText();
        
        LVA lva=uni.getlva(student_anmelden_code);
        Student student=uni.getstudent(Long.parseLong(matrikelnummer_students));
        
        
        if(uni.getlva(student_anmelden_code)==null)
        {
            JOptionPane.showMessageDialog(null, "LVA existiert nicht");
        }
        else if((lva.getLva_studenten().contains(student))==false)//anmelde nur 1 mal
        {
            uni.student_anmelden(Long.parseLong(matrikelnummer_students), student_anmelden_code);//wurde angemeldet
        }
                
        //add lva to all student list
        updateTabelle_alleLVA_von_Student(matrikelnummer_students);
        
        //add student to all lva list
        updateTabelle_alleStudenten(student_anmelden_code);    
    }//GEN-LAST:event_button_student_anmeldenActionPerformed

    private void button_dozent_zuweisenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dozent_zuweisenActionPerformed

        String dozent_zuweisen_code=tf_sucheLVA_code.getText();
        String personalnummer_dozents=tf_sucheDozent_personalnummer.getText();
        
        LVA lva=uni.getlva(dozent_zuweisen_code);
        Dozent dozent=uni.getdozent(Long.parseLong(personalnummer_dozents));
        
        if(uni.getlva(dozent_zuweisen_code)==null)
        {
            JOptionPane.showMessageDialog(null, "LVA existiert nicht");
        }
        else if((lva.getLva_dozenten().contains(dozent))==false)//zugeweist nur 1 mal
        {
            uni.dozent_zuweisen(Long.parseLong(personalnummer_dozents), dozent_zuweisen_code);//wurde angemeldet
        
        }
        
        //lists all lva der dozents
        updateTabelle_alleLVA_von_Dozent(personalnummer_dozents);
        //lists all dozents that gives that class
        updateTabelle_alleDozenten(dozent_zuweisen_code);
        
        
        
    }//GEN-LAST:event_button_dozent_zuweisenActionPerformed

    private void button_student_abmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_student_abmeldenActionPerformed
        
        String student_anmelden_code=tf_sucheLVA_code.getText();
        String matrikelnummer_students=tf_sucheStudent_matrikelnummer.getText();
        
        uni.student_abmelden(Long.parseLong(matrikelnummer_students), student_anmelden_code);//wurde abgemeldet
        
        JOptionPane.showMessageDialog(null, "Student wurde abgemeldet");
        
        updateTabelle_alleLVA_von_Student(matrikelnummer_students);
        updateTabelle_alleStudenten(student_anmelden_code);    
        
    }//GEN-LAST:event_button_student_abmeldenActionPerformed

    private void button_dozent_abmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dozent_abmeldenActionPerformed
        String dozent_zuweisen_code=tf_sucheLVA_code.getText();
        String personalnummer_dozents=tf_sucheDozent_personalnummer.getText();
        
        uni.dozent_abmelden(Long.parseLong(personalnummer_dozents), dozent_zuweisen_code);//wurde abgemeldet
        
        JOptionPane.showMessageDialog(null, "Dozent wurde abgemeldet");
        
        updateTabelle_alleLVA_von_Dozent(personalnummer_dozents);
        updateTabelle_alleDozenten(dozent_zuweisen_code);
    }//GEN-LAST:event_button_dozent_abmeldenActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_dozent_geschlecht;
    private javax.swing.ButtonGroup buttonGroup_student_geschlecht;
    private javax.swing.JButton button_DozentBearbeiten;
    private javax.swing.JButton button_Dozentadd;
    private javax.swing.JButton button_Dozentloeschen;
    private javax.swing.JButton button_Dozentsuchen;
    private javax.swing.JButton button_LVABearbeiten;
    private javax.swing.JButton button_LVAadd;
    private javax.swing.JButton button_LVAloeschen;
    private javax.swing.JButton button_LVAsuchen;
    private javax.swing.JRadioButton button_addDozent_maennlich;
    private javax.swing.JRadioButton button_addDozent_weiblich;
    private javax.swing.JRadioButton button_addStudent_maennlich;
    private javax.swing.JRadioButton button_addStudent_weiblich;
    private javax.swing.JButton button_dozent_abmelden;
    private javax.swing.JButton button_dozent_zuweisen;
    private javax.swing.JButton button_studentBearbeiten;
    private javax.swing.JButton button_student_abmelden;
    private javax.swing.JButton button_student_anmelden;
    private javax.swing.JButton button_studentadd;
    private javax.swing.JButton button_studentloeschen;
    private javax.swing.JButton button_studentsuchen;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable table_LVASuchen;
    private javax.swing.JTable table_LVAlist;
    private javax.swing.JTable table_dozentSuchen;
    private javax.swing.JTable table_dozentlist;
    private javax.swing.JTable table_dozentlva;
    private javax.swing.JTable table_listalldozentlvas;
    private javax.swing.JTable table_listallstudentlvas;
    private javax.swing.JTable table_studentSuchen;
    private javax.swing.JTable table_studentlist;
    private javax.swing.JTable table_studentlva;
    private javax.swing.JTextField tf_addDozent_email;
    private javax.swing.JTextField tf_addDozent_fach;
    private javax.swing.JTextField tf_addDozent_fakultaet;
    private javax.swing.JTextField tf_addDozent_geburtsjahr;
    private javax.swing.JTextField tf_addDozent_land;
    private javax.swing.JTextField tf_addDozent_nachname;
    private javax.swing.JTextField tf_addDozent_personalnummer;
    private javax.swing.JTextField tf_addDozent_vorname;
    private javax.swing.JTextField tf_addLVA_code;
    private javax.swing.JTextField tf_addLVA_modulname;
    private javax.swing.JTextField tf_addStudent_email;
    private javax.swing.JTextField tf_addStudent_fach;
    private javax.swing.JTextField tf_addStudent_fakultaet;
    private javax.swing.JTextField tf_addStudent_geburtsjahr;
    private javax.swing.JTextField tf_addStudent_land;
    private javax.swing.JTextField tf_addStudent_matrikelnummer;
    private javax.swing.JTextField tf_addStudent_nachname;
    private javax.swing.JTextField tf_addStudent_semester;
    private javax.swing.JTextField tf_addStudent_vorname;
    private javax.swing.JTextField tf_sucheDozent_personalnummer;
    private javax.swing.JTextField tf_sucheLVA_code;
    private javax.swing.JTextField tf_sucheStudent_matrikelnummer;
    // End of variables declaration//GEN-END:variables
}
