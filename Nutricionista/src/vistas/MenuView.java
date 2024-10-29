
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import conexion.Conexion;

public class MenuView extends javax.swing.JFrame {


    public MenuView() {
        initComponents();
        Connection con=Conexion.getConexion();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLRotulo = new javax.swing.JLabel();
        jPDatos1 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jLNroPaciente = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        jtNroPaciente = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jtPesoActual = new javax.swing.JTextField();
        jLPesoActual = new javax.swing.JLabel();
        jrAlta = new javax.swing.JRadioButton();
        jtAltura = new javax.swing.JTextField();
        jLAltura = new javax.swing.JLabel();
        jtIMC = new javax.swing.JTextField();
        jLIMC = new javax.swing.JLabel();
        jLPesoBuscado = new javax.swing.JLabel();
        jtPesoBuscado = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbPaso3 = new javax.swing.JButton();
        jPDatos2 = new javax.swing.JPanel();
        jLCantMenu = new javax.swing.JLabel();
        jtFechaIni = new javax.swing.JTextField();
        jLFechaIni = new javax.swing.JLabel();
        jLFechaFin = new javax.swing.JLabel();
        jtFechaFin = new javax.swing.JTextField();
        jSCantMenu = new javax.swing.JSpinner();
        jSCantContrl = new javax.swing.JSpinner();
        jLCantContrl = new javax.swing.JLabel();
        jtNombreDieta = new javax.swing.JTextField();
        jLNombreDieta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLColacion = new javax.swing.JLabel();
        jLDesMer = new javax.swing.JLabel();
        jLAlmCena = new javax.swing.JLabel();
        jSAlmCena = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSDesMer = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSColacion = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLSelA = new javax.swing.JLabel();
        jrConfirmar = new javax.swing.JRadioButton();
        jLRDieta = new javax.swing.JLabel();
        jbPaso1 = new javax.swing.JButton();
        jbPaso2 = new javax.swing.JButton();
        jPDatos4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPDatos5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLRDDiaria = new javax.swing.JLabel();
        jPDatos6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLRDComidas = new javax.swing.JLabel();
        jLRPaso2 = new javax.swing.JLabel();
        jLRPaso3 = new javax.swing.JLabel();
        jLRPaso1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMaterias = new javax.swing.JMenu();
        MenuMat1 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        MenuAd1 = new javax.swing.JMenuItem();
        MenuAd2 = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        MenuCon1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmAlumnos = new javax.swing.JMenu();
        MenuAlu1 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        jMenu7.setText("jMenu7");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Universidad ULP");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(1600, 1130));
        setPreferredSize(new java.awt.Dimension(1600, 1130));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 600));
        setType(java.awt.Window.Type.UTILITY);

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Datos del Paciente");
        jLRotulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos1.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNombre.setBackground(new java.awt.Color(255, 51, 102));
        jLNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre.setText("Nombre:");

        jLNroPaciente.setBackground(new java.awt.Color(255, 51, 102));
        jLNroPaciente.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNroPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jLNroPaciente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNroPaciente.setText("Nro Paciente:");
        jLNroPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLEdad.setBackground(new java.awt.Color(255, 51, 102));
        jLEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEdad.setText("Edad");

        jtNroPaciente.setBackground(new java.awt.Color(255, 204, 255));
        jtNroPaciente.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNroPaciente.setText("0001");
        jtNroPaciente.setToolTipText("Codigo de paiente autogenerado");
        jtNroPaciente.setEnabled(false);
        jtNroPaciente.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNroPaciente.setName(""); // NOI18N
        jtNroPaciente.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNroPacienteActionPerformed(evt);
            }
        });

        jtEdad.setBackground(new java.awt.Color(255, 204, 255));
        jtEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(102, 0, 204));
        jtEdad.setToolTipText("Ingrese nombre del alumno");
        jtEdad.setMinimumSize(new java.awt.Dimension(25, 25));
        jtEdad.setName(""); // NOI18N
        jtEdad.setPreferredSize(new java.awt.Dimension(25, 25));
        jtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadActionPerformed(evt);
            }
        });

        jtPesoActual.setBackground(new java.awt.Color(255, 204, 255));
        jtPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoActual.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoActual.setToolTipText("Ingrese su nombre");
        jtPesoActual.setMaximumSize(new java.awt.Dimension(25, 71));
        jtPesoActual.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoActual.setName(""); // NOI18N
        jtPesoActual.setPreferredSize(new java.awt.Dimension(25, 71));
        jtPesoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesoActualActionPerformed(evt);
            }
        });

        jLPesoActual.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLPesoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLPesoActual.setText("Peso Actual:");

        jrAlta.setBackground(new java.awt.Color(102, 0, 153));
        jrAlta.setForeground(new java.awt.Color(255, 255, 255));
        jrAlta.setText("Alta");
        jrAlta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAltaActionPerformed(evt);
            }
        });

        jtAltura.setBackground(new java.awt.Color(255, 204, 255));
        jtAltura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(102, 0, 204));
        jtAltura.setToolTipText("Ingrese nombre del alumno");
        jtAltura.setMinimumSize(new java.awt.Dimension(25, 25));
        jtAltura.setName(""); // NOI18N
        jtAltura.setPreferredSize(new java.awt.Dimension(25, 25));
        jtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAlturaActionPerformed(evt);
            }
        });

        jLAltura.setBackground(new java.awt.Color(255, 51, 102));
        jLAltura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLAltura.setForeground(new java.awt.Color(255, 255, 255));
        jLAltura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLAltura.setText("Altura:");

        jtIMC.setBackground(new java.awt.Color(255, 204, 255));
        jtIMC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtIMC.setForeground(new java.awt.Color(102, 0, 204));
        jtIMC.setToolTipText("Ingrese nombre del alumno");
        jtIMC.setEnabled(false);
        jtIMC.setMinimumSize(new java.awt.Dimension(25, 25));
        jtIMC.setName(""); // NOI18N
        jtIMC.setPreferredSize(new java.awt.Dimension(25, 25));
        jtIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIMCActionPerformed(evt);
            }
        });

        jLIMC.setBackground(new java.awt.Color(255, 51, 102));
        jLIMC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLIMC.setForeground(new java.awt.Color(255, 255, 255));
        jLIMC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIMC.setText("IMC:");

        jLPesoBuscado.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoBuscado.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLPesoBuscado.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoBuscado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLPesoBuscado.setText("Peso Buscado:");

        jtPesoBuscado.setBackground(new java.awt.Color(255, 204, 255));
        jtPesoBuscado.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoBuscado.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoBuscado.setToolTipText("Ingrese su nombre");
        jtPesoBuscado.setMaximumSize(new java.awt.Dimension(25, 71));
        jtPesoBuscado.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoBuscado.setName(""); // NOI18N
        jtPesoBuscado.setPreferredSize(new java.awt.Dimension(25, 25));
        jtPesoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesoBuscadoActionPerformed(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre.setToolTipText("Ingrese apellido del alumno");
        jtNombre.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre.setName(""); // NOI18N
        jtNombre.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPDatos1Layout = new javax.swing.GroupLayout(jPDatos1);
        jPDatos1.setLayout(jPDatos1Layout);
        jPDatos1Layout.setHorizontalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51))
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrAlta)))
                .addGap(24, 24, 24))
        );
        jPDatos1Layout.setVerticalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNroPaciente)
                    .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrAlta))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAltura)
                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLIMC)
                    .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPesoBuscado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jbPaso3.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso3.setText("Paso 3");
        jbPaso3.setToolTipText("Búsqueda por DNI");
        jbPaso3.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso3.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso3.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso3.setName(""); // NOI18N
        jbPaso3.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbPaso3FocusGained(evt);
            }
        });
        jbPaso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso3ActionPerformed(evt);
            }
        });

        jPDatos2.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLCantMenu.setBackground(new java.awt.Color(255, 51, 102));
        jLCantMenu.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCantMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLCantMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCantMenu.setText("Cantidad de menus diarios:");
        jLCantMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtFechaIni.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaIni.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaIni.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaIni.setToolTipText("Ingrese su nombre");
        jtFechaIni.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaIni.setName(""); // NOI18N
        jtFechaIni.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaIniActionPerformed(evt);
            }
        });

        jLFechaIni.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaIni.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaIni.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaIni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaIni.setText("Fecha Inicial:");

        jLFechaFin.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaFin.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaFin.setText("Fecha Final");

        jtFechaFin.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaFin.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaFin.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaFin.setToolTipText("Ingrese su nombre");
        jtFechaFin.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaFin.setName(""); // NOI18N
        jtFechaFin.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaFinActionPerformed(evt);
            }
        });

        jLCantContrl.setBackground(new java.awt.Color(255, 51, 102));
        jLCantContrl.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCantContrl.setForeground(new java.awt.Color(255, 255, 255));
        jLCantContrl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCantContrl.setText("Cantidad de controles de peso:");
        jLCantContrl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtNombreDieta.setBackground(new java.awt.Color(255, 204, 255));
        jtNombreDieta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNombreDieta.setForeground(new java.awt.Color(102, 0, 204));
        jtNombreDieta.setText("Dieta Lunar");
        jtNombreDieta.setToolTipText("Nombre de la dieta");
        jtNombreDieta.setEnabled(false);
        jtNombreDieta.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombreDieta.setName(""); // NOI18N
        jtNombreDieta.setPreferredSize(new java.awt.Dimension(25, 25));

        jLNombreDieta.setBackground(new java.awt.Color(255, 51, 102));
        jLNombreDieta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombreDieta.setForeground(new java.awt.Color(255, 255, 255));
        jLNombreDieta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombreDieta.setText("Nombre de la dieta:");
        jLNombreDieta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLColacion.setBackground(new java.awt.Color(255, 51, 102));
        jLColacion.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLColacion.setForeground(new java.awt.Color(255, 255, 255));
        jLColacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLColacion.setText("Colación");

        jLDesMer.setBackground(new java.awt.Color(255, 51, 102));
        jLDesMer.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLDesMer.setForeground(new java.awt.Color(255, 255, 255));
        jLDesMer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDesMer.setText("Desayuno- Merienda");

        jLAlmCena.setBackground(new java.awt.Color(255, 51, 102));
        jLAlmCena.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLAlmCena.setForeground(new java.awt.Color(255, 255, 255));
        jLAlmCena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAlmCena.setText("Almuerzo -Cena");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setMinimumSize(new java.awt.Dimension(33, 85));
        jTable4.setName(""); // NOI18N
        jTable4.setPreferredSize(new java.awt.Dimension(33, 85));
        jSAlmCena.setViewportView(jTable4);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setMinimumSize(new java.awt.Dimension(33, 85));
        jTable2.setName(""); // NOI18N
        jTable2.setPreferredSize(new java.awt.Dimension(33, 85));
        jSDesMer.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setMinimumSize(new java.awt.Dimension(33, 85));
        jTable3.setName(""); // NOI18N
        jTable3.setPreferredSize(new java.awt.Dimension(33, 85));
        jSColacion.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSDesMer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLDesMer, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLColacion, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAlmCena)
                    .addComponent(jLDesMer)
                    .addComponent(jLColacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSDesMer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLSelA.setBackground(new java.awt.Color(255, 51, 102));
        jLSelA.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLSelA.setForeground(new java.awt.Color(255, 255, 255));
        jLSelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSelA.setText("Selección de alimentos del menú:");
        jLSelA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jrConfirmar.setBackground(new java.awt.Color(102, 0, 153));
        jrConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jrConfirmar.setText("Confirmar");
        jrConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatos2Layout = new javax.swing.GroupLayout(jPDatos2);
        jPDatos2.setLayout(jPDatos2Layout);
        jPDatos2Layout.setHorizontalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jLFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                                .addComponent(jLCantMenu)
                                                .addGap(3, 3, 3)
                                                .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLCantContrl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                                .addComponent(jLNombreDieta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSCantContrl)
                                    .addComponent(jrConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPDatos2Layout.setVerticalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreDieta)
                    .addComponent(jrConfirmar))
                .addGap(18, 18, 18)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSCantContrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantContrl)
                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaIni)
                    .addComponent(jtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFechaFin)
                    .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLRDieta.setBackground(new java.awt.Color(0, 204, 204));
        jLRDieta.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRDieta.setForeground(new java.awt.Color(0, 153, 153));
        jLRDieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRDieta.setText("Selección de la Dieta");
        jLRDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso1.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso1.setText("Paso1");
        jbPaso1.setToolTipText("Búsqueda por DNI");
        jbPaso1.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso1.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso1.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso1.setName(""); // NOI18N
        jbPaso1.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbPaso1FocusGained(evt);
            }
        });
        jbPaso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso1ActionPerformed(evt);
            }
        });

        jbPaso2.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso2.setText("Paso 2");
        jbPaso2.setToolTipText("Búsqueda por DNI");
        jbPaso2.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso2.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso2.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso2.setName(""); // NOI18N
        jbPaso2.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbPaso2FocusGained(evt);
            }
        });
        jbPaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso2ActionPerformed(evt);
            }
        });

        jPDatos4.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setBackground(new java.awt.Color(255, 51, 102));
        jLabel29.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Tipo de comida:");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPDatos4Layout = new javax.swing.GroupLayout(jPDatos4);
        jPDatos4.setLayout(jPDatos4Layout);
        jPDatos4Layout.setHorizontalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPDatos4Layout.setVerticalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDatos5.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setBackground(new java.awt.Color(255, 51, 102));
        jLabel30.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Alternativa de Menú N° 1 ");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLabel32.setBackground(new java.awt.Color(255, 51, 102));
        jLabel32.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Alternativa de Menú N° 2");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jTable9);

        jLabel34.setBackground(new java.awt.Color(255, 51, 102));
        jLabel34.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Alternativa de Menú N° 1 ");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLabel33.setBackground(new java.awt.Color(255, 51, 102));
        jLabel33.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Alternativa de Menú N° 3 ");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel35.setBackground(new java.awt.Color(255, 51, 102));
        jLabel35.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Alternativa de Menú N° 5");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel36.setBackground(new java.awt.Color(255, 51, 102));
        jLabel36.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Alternativa de Menú N° 4 ");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane16.setViewportView(jTable10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane16)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane17.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLabel37.setBackground(new java.awt.Color(255, 51, 102));
        jLabel37.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Alternativa de Menú N° 6");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel38.setBackground(new java.awt.Color(255, 51, 102));
        jLabel38.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Alternativa de Menú N° 1 ");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane19.setViewportView(jTable13);

        jLabel40.setBackground(new java.awt.Color(255, 51, 102));
        jLabel40.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Alternativa de Menú N° 1 ");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel39.setBackground(new java.awt.Color(255, 51, 102));
        jLabel39.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Alternativa de Menú N° 7 ");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel41.setBackground(new java.awt.Color(255, 51, 102));
        jLabel41.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Alternativa de Menú N° 1 ");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane20.setViewportView(jTable14);

        jLabel42.setBackground(new java.awt.Color(255, 51, 102));
        jLabel42.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Alternativa de Menú N° 1 ");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPDatos5Layout = new javax.swing.GroupLayout(jPDatos5);
        jPDatos5.setLayout(jPDatos5Layout);
        jPDatos5Layout.setHorizontalGroup(
            jPDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPDatos5Layout.setVerticalGroup(
            jPDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos5Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLRDDiaria.setBackground(new java.awt.Color(0, 204, 204));
        jLRDDiaria.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRDDiaria.setForeground(new java.awt.Color(0, 153, 153));
        jLRDDiaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRDDiaria.setText("Dieta Diaria");
        jLRDDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos6.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setBackground(new java.awt.Color(255, 51, 102));
        jLabel31.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Reglones de comida");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPDatos6Layout = new javax.swing.GroupLayout(jPDatos6);
        jPDatos6.setLayout(jPDatos6Layout);
        jPDatos6Layout.setHorizontalGroup(
            jPDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatos6Layout.setVerticalGroup(
            jPDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLRDComidas.setBackground(new java.awt.Color(0, 204, 204));
        jLRDComidas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRDComidas.setForeground(new java.awt.Color(0, 153, 153));
        jLRDComidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRDComidas.setText("Definición de Comidas");
        jLRDComidas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLRPaso2.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso2.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso2.setText("Paso 2: Renglones");
        jLRPaso2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLRPaso3.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso3.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso3.setText("Paso 3: Dieta diaria");
        jLRPaso3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLRPaso1.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso1.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso1.setText("Paso 1 : Comidas");
        jLRPaso1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jmMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/materia50.gif"))); // NOI18N
        jmMaterias.setToolTipText("Materias");
        jmMaterias.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmMaterias.setMaximumSize(new java.awt.Dimension(112, 69));
        jmMaterias.setMinimumSize(new java.awt.Dimension(72, 69));
        jmMaterias.setName(""); // NOI18N
        jmMaterias.setPreferredSize(new java.awt.Dimension(72, 69));

        MenuMat1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuMat1.setBackground(new java.awt.Color(0, 102, 153));
        MenuMat1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuMat1.setText("Formulario de Materia");
        MenuMat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMat1ActionPerformed(evt);
            }
        });
        jmMaterias.add(MenuMat1);

        jMenuBar1.add(jmMaterias);

        jmAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/administracion50.gif"))); // NOI18N
        jmAdministracion.setToolTipText("Administración");
        jmAdministracion.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmAdministracion.setMaximumSize(new java.awt.Dimension(112, 69));
        jmAdministracion.setMinimumSize(new java.awt.Dimension(72, 69));
        jmAdministracion.setName(""); // NOI18N
        jmAdministracion.setPreferredSize(new java.awt.Dimension(72, 69));

        MenuAd1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAd1.setBackground(new java.awt.Color(0, 102, 153));
        MenuAd1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAd1.setText("Manejo de Inscripciones");
        MenuAd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAd1ActionPerformed(evt);
            }
        });
        jmAdministracion.add(MenuAd1);

        MenuAd2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAd2.setBackground(new java.awt.Color(0, 102, 153));
        MenuAd2.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAd2.setText("Manipulacion de Notas");
        MenuAd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAd2ActionPerformed(evt);
            }
        });
        jmAdministracion.add(MenuAd2);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consulta50.gif"))); // NOI18N
        jmConsultas.setToolTipText("Consultas");
        jmConsultas.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmConsultas.setMaximumSize(new java.awt.Dimension(112, 69));
        jmConsultas.setMinimumSize(new java.awt.Dimension(72, 69));
        jmConsultas.setPreferredSize(new java.awt.Dimension(72, 69));

        MenuCon1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuCon1.setBackground(new java.awt.Color(0, 102, 153));
        MenuCon1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuCon1.setText("Alumnos por materia");
        MenuCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCon1ActionPerformed(evt);
            }
        });
        jmConsultas.add(MenuCon1);

        jMenuBar1.add(jmConsultas);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir50.gif"))); // NOI18N
        jmSalir.setToolTipText("Salir");
        jmSalir.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmSalir.setMaximumSize(new java.awt.Dimension(112, 69));
        jmSalir.setMinimumSize(new java.awt.Dimension(72, 69));
        jmSalir.setName(""); // NOI18N
        jmSalir.setPreferredSize(new java.awt.Dimension(72, 69));
        jmSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmSalirMenuSelected(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        jmAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alumno50.gif"))); // NOI18N
        jmAlumnos.setToolTipText("Alumnos");
        jmAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmAlumnos.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmAlumnos.setMaximumSize(new java.awt.Dimension(112, 69));
        jmAlumnos.setMinimumSize(new java.awt.Dimension(72, 69));
        jmAlumnos.setName(""); // NOI18N
        jmAlumnos.setPreferredSize(new java.awt.Dimension(72, 69));
        jmAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosActionPerformed(evt);
            }
        });

        MenuAlu1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAlu1.setBackground(new java.awt.Color(0, 102, 153));
        MenuAlu1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAlu1.setText("Formulario de Alumno");
        MenuAlu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlu1ActionPerformed(evt);
            }
        });
        jmAlumnos.add(MenuAlu1);

        jMenuBar1.add(jmAlumnos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLRotulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(jLRDieta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLRDComidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPDatos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDatos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRDDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLRDDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLRDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLRPaso1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLRPaso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLRPaso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLRDComidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPDatos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPDatos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleName("Nutricionista");
        getAccessibleContext().setAccessibleDescription("Base de datos de la Universidad de la Punta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAlu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlu1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_MenuAlu1ActionPerformed

    private void jmAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAlumnosActionPerformed

    private void MenuAd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAd1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_MenuAd1ActionPerformed

    private void MenuAd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAd2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_MenuAd2ActionPerformed

    private void MenuMat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMat1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_MenuMat1ActionPerformed

    private void jmSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmSalirMenuSelected
        // TODO add your handling code here:

    }//GEN-LAST:event_jmSalirMenuSelected

    private void MenuCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCon1ActionPerformed
        // TODO add your handling code here:

       
    }//GEN-LAST:event_MenuCon1ActionPerformed

    private void jbPaso3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbPaso3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaso3FocusGained

    private void jbPaso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso3ActionPerformed

    }//GEN-LAST:event_jbPaso3ActionPerformed

    private void jtPesoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesoBuscadoActionPerformed

    private void jtIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIMCActionPerformed

    private void jtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlturaActionPerformed

    private void jtPesoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesoActualActionPerformed

    private void jtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadActionPerformed

    private void jtNroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNroPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNroPacienteActionPerformed

    private void jtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaFinActionPerformed

    private void jtFechaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaIniActionPerformed

    private void jbPaso1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbPaso1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaso1FocusGained

    private void jbPaso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaso1ActionPerformed

    private void jbPaso2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbPaso2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaso2FocusGained

    private void jbPaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaso2ActionPerformed

    private void jdFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaNacPropertyChange


    }//GEN-LAST:event_jdFechaNacPropertyChange

    private void jdFechaNac1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaNac1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jdFechaNac1PropertyChange

    private void jrAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAltaActionPerformed

    private void jrConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAd1;
    private javax.swing.JMenuItem MenuAd2;
    private javax.swing.JMenuItem MenuAlu1;
    private javax.swing.JMenuItem MenuCon1;
    private javax.swing.JMenuItem MenuMat1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAlmCena;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLCantContrl;
    private javax.swing.JLabel jLCantMenu;
    private javax.swing.JLabel jLColacion;
    private javax.swing.JLabel jLDesMer;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLFechaFin;
    private javax.swing.JLabel jLFechaIni;
    private javax.swing.JLabel jLIMC;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombreDieta;
    private javax.swing.JLabel jLNroPaciente;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLPesoBuscado;
    private javax.swing.JLabel jLRDComidas;
    private javax.swing.JLabel jLRDDiaria;
    private javax.swing.JLabel jLRDieta;
    private javax.swing.JLabel jLRPaso1;
    private javax.swing.JLabel jLRPaso2;
    private javax.swing.JLabel jLRPaso3;
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLSelA;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPDatos1;
    private javax.swing.JPanel jPDatos2;
    private javax.swing.JPanel jPDatos4;
    private javax.swing.JPanel jPDatos5;
    private javax.swing.JPanel jPDatos6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jSAlmCena;
    private javax.swing.JSpinner jSCantContrl;
    private javax.swing.JSpinner jSCantMenu;
    private javax.swing.JScrollPane jSColacion;
    private javax.swing.JScrollPane jSDesMer;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JButton jbPaso1;
    private javax.swing.JButton jbPaso2;
    private javax.swing.JButton jbPaso3;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JRadioButton jrAlta;
    private javax.swing.JRadioButton jrConfirmar;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFechaFin;
    private javax.swing.JTextField jtFechaIni;
    private javax.swing.JTextField jtIMC;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreDieta;
    private javax.swing.JTextField jtNroPaciente;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoBuscado;
    // End of variables declaration//GEN-END:variables
}
