
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import conexion.Conexion;

public class MenuView_1 extends javax.swing.JFrame {


    public MenuView_1() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtLegajo1 = new javax.swing.JTextField();
        jtNombre1 = new javax.swing.JTextField();
        jtFechaNacimiento1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jrEstado1 = new javax.swing.JRadioButton();
        jtNombre2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtNombre3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtFechaNacimiento2 = new javax.swing.JTextField();
        jtApellido2 = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPDatos2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtFechaNacimiento3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtFechaNacimiento4 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jtApellido1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLRotulo1 = new javax.swing.JLabel();
        jbBuscar1 = new javax.swing.JButton();
        jbBuscar2 = new javax.swing.JButton();
        jPDatos3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jtFechaNacimiento5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtFechaNacimiento6 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jtApellido3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/nutriFondo.png"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumnos = new javax.swing.JMenu();
        MenuAlu1 = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        MenuMat1 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        MenuAd1 = new javax.swing.JMenuItem();
        MenuAd2 = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        MenuCon1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

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
        setMinimumSize(new java.awt.Dimension(1600, 971));
        setPreferredSize(new java.awt.Dimension(1600, 971));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 600));
        setType(java.awt.Window.Type.UTILITY);

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Alta del Paciente");
        jLRotulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos1.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(255, 51, 102));
        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nombre:");

        jLabel8.setBackground(new java.awt.Color(255, 51, 102));
        jLabel8.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nro Paciente:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel9.setBackground(new java.awt.Color(255, 51, 102));
        jLabel9.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Edad");

        jtLegajo1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtLegajo1.setText("0001");
        jtLegajo1.setToolTipText("Codigo de paiente autogenerado");
        jtLegajo1.setEnabled(false);
        jtLegajo1.setMinimumSize(new java.awt.Dimension(25, 25));
        jtLegajo1.setName(""); // NOI18N
        jtLegajo1.setPreferredSize(new java.awt.Dimension(25, 25));
        jtLegajo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajo1ActionPerformed(evt);
            }
        });

        jtNombre1.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre1.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre1.setToolTipText("Ingrese nombre del alumno");
        jtNombre1.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre1.setName(""); // NOI18N
        jtNombre1.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombre1ActionPerformed(evt);
            }
        });

        jtFechaNacimiento1.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento1.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento1.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento1.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento1.setName(""); // NOI18N
        jtFechaNacimiento1.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 51, 102));
        jLabel11.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Peso Actual:");

        jrEstado1.setBackground(new java.awt.Color(102, 0, 153));
        jrEstado1.setForeground(new java.awt.Color(255, 255, 255));
        jrEstado1.setText("activo");
        jrEstado1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jtNombre2.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre2.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre2.setToolTipText("Ingrese nombre del alumno");
        jtNombre2.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre2.setName(""); // NOI18N
        jtNombre2.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombre2ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 51, 102));
        jLabel12.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Altura:");

        jtNombre3.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre3.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre3.setToolTipText("Ingrese nombre del alumno");
        jtNombre3.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre3.setName(""); // NOI18N
        jtNombre3.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombre3ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 51, 102));
        jLabel13.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Sexo:");

        jLabel14.setBackground(new java.awt.Color(255, 51, 102));
        jLabel14.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Peso Buscado:");

        jtFechaNacimiento2.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento2.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento2.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento2.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento2.setName(""); // NOI18N
        jtFechaNacimiento2.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento2ActionPerformed(evt);
            }
        });

        jtApellido2.setBackground(new java.awt.Color(255, 204, 255));
        jtApellido2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtApellido2.setForeground(new java.awt.Color(102, 0, 204));
        jtApellido2.setToolTipText("Ingrese apellido del alumno");
        jtApellido2.setMinimumSize(new java.awt.Dimension(25, 25));
        jtApellido2.setName(""); // NOI18N
        jtApellido2.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPDatos1Layout = new javax.swing.GroupLayout(jPDatos1);
        jPDatos1.setLayout(jPDatos1Layout);
        jPDatos1Layout.setHorizontalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrEstado1))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jtFechaNacimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPDatos1Layout.setVerticalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrEstado1))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFechaNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jbBuscar.setBackground(new java.awt.Color(255, 255, 51));
        jbBuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbBuscar.setText("Paso 3");
        jbBuscar.setToolTipText("Búsqueda por DNI");
        jbBuscar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbBuscar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbBuscarFocusGained(evt);
            }
        });
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(0, 47, 78));
        jbEliminar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbEliminar.setToolTipText("Eliminar");
        jbEliminar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbEliminar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbEliminar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbEliminar.setName(""); // NOI18N
        jbEliminar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 47, 78));
        jbGuardar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbGuardar.setToolTipText("Guardar");
        jbGuardar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbGuardar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbGuardar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbGuardar.setName(""); // NOI18N
        jbGuardar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 47, 78));
        jbSalir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbSalir.setToolTipText("Salir");
        jbSalir.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbSalir.setMaximumSize(new java.awt.Dimension(81, 24));
        jbSalir.setMinimumSize(new java.awt.Dimension(81, 24));
        jbSalir.setName(""); // NOI18N
        jbSalir.setPreferredSize(new java.awt.Dimension(81, 28));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jPDatos2.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(255, 51, 102));
        jLabel15.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Cantidad de menus diarios:");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtFechaNacimiento3.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento3.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento3.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento3.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento3.setName(""); // NOI18N
        jtFechaNacimiento3.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento3ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 51, 102));
        jLabel17.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha Inicial:");

        jLabel20.setBackground(new java.awt.Color(255, 51, 102));
        jLabel20.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("FechaFinal");

        jtFechaNacimiento4.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento4.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento4.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento4.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento4.setName(""); // NOI18N
        jtFechaNacimiento4.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento4ActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 51, 102));
        jLabel21.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Cantidad de controles de peso:");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtApellido1.setBackground(new java.awt.Color(255, 204, 255));
        jtApellido1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtApellido1.setForeground(new java.awt.Color(102, 0, 204));
        jtApellido1.setToolTipText("Ingrese apellido del alumno");
        jtApellido1.setMinimumSize(new java.awt.Dimension(25, 25));
        jtApellido1.setName(""); // NOI18N
        jtApellido1.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel22.setBackground(new java.awt.Color(255, 51, 102));
        jLabel22.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Nombre de la dieta:");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel23.setBackground(new java.awt.Color(255, 51, 102));
        jLabel23.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Colación");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel25.setBackground(new java.awt.Color(255, 51, 102));
        jLabel25.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Desayuno- Merienda");

        jLabel24.setBackground(new java.awt.Color(255, 51, 102));
        jLabel24.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Almuerzo -Cena");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPDatos2Layout = new javax.swing.GroupLayout(jPDatos2);
        jPDatos2.setLayout(jPDatos2Layout);
        jPDatos2Layout.setHorizontalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFechaNacimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtFechaNacimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPDatos2Layout.setVerticalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtFechaNacimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtFechaNacimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Selección de la Dieta");
        jLRotulo1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbBuscar1.setBackground(new java.awt.Color(255, 255, 51));
        jbBuscar1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbBuscar1.setText("Paso1");
        jbBuscar1.setToolTipText("Búsqueda por DNI");
        jbBuscar1.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbBuscar1.setMaximumSize(new java.awt.Dimension(81, 24));
        jbBuscar1.setMinimumSize(new java.awt.Dimension(81, 24));
        jbBuscar1.setName(""); // NOI18N
        jbBuscar1.setPreferredSize(new java.awt.Dimension(81, 28));
        jbBuscar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbBuscar1FocusGained(evt);
            }
        });
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        jbBuscar2.setBackground(new java.awt.Color(255, 255, 51));
        jbBuscar2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbBuscar2.setText("Paso 2");
        jbBuscar2.setToolTipText("Búsqueda por DNI");
        jbBuscar2.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbBuscar2.setMaximumSize(new java.awt.Dimension(81, 24));
        jbBuscar2.setMinimumSize(new java.awt.Dimension(81, 24));
        jbBuscar2.setName(""); // NOI18N
        jbBuscar2.setPreferredSize(new java.awt.Dimension(81, 28));
        jbBuscar2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbBuscar2FocusGained(evt);
            }
        });
        jbBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar2ActionPerformed(evt);
            }
        });

        jPDatos3.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setBackground(new java.awt.Color(255, 51, 102));
        jLabel16.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Cantidad de menus diarios:");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtFechaNacimiento5.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento5.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento5.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento5.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento5.setName(""); // NOI18N
        jtFechaNacimiento5.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento5ActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 51, 102));
        jLabel18.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha Inicial:");

        jLabel26.setBackground(new java.awt.Color(255, 51, 102));
        jLabel26.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("FechaFinal");

        jtFechaNacimiento6.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento6.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento6.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento6.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento6.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento6.setName(""); // NOI18N
        jtFechaNacimiento6.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimiento6ActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 51, 102));
        jLabel27.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Cantidad de controles de peso:");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtApellido3.setBackground(new java.awt.Color(255, 204, 255));
        jtApellido3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtApellido3.setForeground(new java.awt.Color(102, 0, 204));
        jtApellido3.setToolTipText("Ingrese apellido del alumno");
        jtApellido3.setMinimumSize(new java.awt.Dimension(25, 25));
        jtApellido3.setName(""); // NOI18N
        jtApellido3.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel28.setBackground(new java.awt.Color(255, 51, 102));
        jLabel28.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Nombre de la dieta:");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jLabel29.setBackground(new java.awt.Color(255, 51, 102));
        jLabel29.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Colación");

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        jLabel30.setBackground(new java.awt.Color(255, 51, 102));
        jLabel30.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Desayuno- Merienda");

        jLabel31.setBackground(new java.awt.Color(255, 51, 102));
        jLabel31.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Almuerzo -Cena");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPDatos3Layout = new javax.swing.GroupLayout(jPDatos3);
        jPDatos3.setLayout(jPDatos3Layout);
        jPDatos3Layout.setHorizontalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos3Layout.createSequentialGroup()
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos3Layout.createSequentialGroup()
                        .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos3Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFechaNacimiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos3Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtFechaNacimiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDatos3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPDatos3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtApellido3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatos3Layout.setVerticalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtFechaNacimiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jtFechaNacimiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(500, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jmAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alumno50.gif"))); // NOI18N
        jmAlumnos.setToolTipText("Alumnos");
        jmAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmAlumnos.setMaximumSize(new java.awt.Dimension(95, 69));
        jmAlumnos.setMinimumSize(new java.awt.Dimension(95, 69));
        jmAlumnos.setName(""); // NOI18N
        jmAlumnos.setPreferredSize(new java.awt.Dimension(95, 69));
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

        jmMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/materia50.gif"))); // NOI18N
        jmMaterias.setToolTipText("Materias");
        jmMaterias.setMaximumSize(new java.awt.Dimension(95, 69));
        jmMaterias.setPreferredSize(new java.awt.Dimension(95, 69));

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
        jmAdministracion.setMaximumSize(new java.awt.Dimension(95, 69));
        jmAdministracion.setName(""); // NOI18N
        jmAdministracion.setPreferredSize(new java.awt.Dimension(95, 69));

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
        jmConsultas.setMaximumSize(new java.awt.Dimension(95, 69));
        jmConsultas.setPreferredSize(new java.awt.Dimension(95, 69));

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
        jmSalir.setMaximumSize(new java.awt.Dimension(95, 69));
        jmSalir.setName(""); // NOI18N
        jmSalir.setPreferredSize(new java.awt.Dimension(95, 69));
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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLRotulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLRotulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDatos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(706, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(572, 572, 572)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1576, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(618, 618, 618)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(231, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jbBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarFocusGained

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtFechaNacimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento2ActionPerformed

    private void jtNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre3ActionPerformed

    private void jtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre2ActionPerformed

    private void jtFechaNacimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento1ActionPerformed

    private void jtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre1ActionPerformed

    private void jtLegajo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLegajo1ActionPerformed

    private void jtFechaNacimiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento4ActionPerformed

    private void jtFechaNacimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento3ActionPerformed

    private void jbBuscar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbBuscar1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscar1FocusGained

    private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscar1ActionPerformed

    private void jbBuscar2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbBuscar2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscar2FocusGained

    private void jbBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscar2ActionPerformed

    private void jtFechaNacimiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento5ActionPerformed

    private void jtFechaNacimiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimiento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimiento6ActionPerformed

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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPDatos1;
    private javax.swing.JPanel jPDatos2;
    private javax.swing.JPanel jPDatos3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JButton jbBuscar2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JRadioButton jrEstado1;
    private javax.swing.JTextField jtApellido1;
    private javax.swing.JTextField jtApellido2;
    private javax.swing.JTextField jtApellido3;
    private javax.swing.JTextField jtFechaNacimiento1;
    private javax.swing.JTextField jtFechaNacimiento2;
    private javax.swing.JTextField jtFechaNacimiento3;
    private javax.swing.JTextField jtFechaNacimiento4;
    private javax.swing.JTextField jtFechaNacimiento5;
    private javax.swing.JTextField jtFechaNacimiento6;
    private javax.swing.JTextField jtLegajo1;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtNombre2;
    private javax.swing.JTextField jtNombre3;
    // End of variables declaration//GEN-END:variables
}
