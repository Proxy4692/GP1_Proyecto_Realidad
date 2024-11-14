
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import conexion.Conexion;

public class EscritMenu extends javax.swing.JFrame {


    public EscritMenu() {
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
        DatosDelPaciente = new javax.swing.JLabel();
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
        SeleccionDeDieta = new javax.swing.JLabel();
        jPDatos2 = new javax.swing.JPanel();
        jLNombreDieta = new javax.swing.JLabel();
        jtNombreDieta = new javax.swing.JTextField();
        jrConfirmar = new javax.swing.JRadioButton();
        jLCantMenu = new javax.swing.JLabel();
        jSCantMenu = new javax.swing.JSpinner();
        jLKcalPorSemana = new javax.swing.JLabel();
        jCKcalS = new javax.swing.JComboBox<>();
        jLFechaIni = new javax.swing.JLabel();
        jtFechaIni = new javax.swing.JTextField();
        jdFechaIni = new com.toedter.calendar.JDateChooser();
        jLFechaFin = new javax.swing.JLabel();
        jtFechaFin = new javax.swing.JTextField();
        jdFechaFin = new com.toedter.calendar.JDateChooser();
        jLSelA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLAlmCena = new javax.swing.JLabel();
        jSAlmCena = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLDesMer = new javax.swing.JLabel();
        jSDesMer = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLColacion = new javax.swing.JLabel();
        jSColacion = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLRPaso1 = new javax.swing.JLabel();
        jbPaso1 = new javax.swing.JButton();
        jLRPaso2 = new javax.swing.JLabel();
        jbPaso2 = new javax.swing.JButton();
        jLRPaso3 = new javax.swing.JLabel();
        jbPaso3 = new javax.swing.JButton();
        DefinicionDeComidas = new javax.swing.JLabel();
        jPDatos3 = new javax.swing.JPanel();
        jCTipoComida = new javax.swing.JComboBox<>();
        jLReglones = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        DietaDiaria = new javax.swing.JLabel();
        jPDatos4 = new javax.swing.JPanel();
        jLOpcion1 = new javax.swing.JLabel();
        jPanelO1 = new javax.swing.JPanel();
        jS1 = new javax.swing.JScrollPane();
        jTOpcion1 = new javax.swing.JTable();
        jLOpcion2 = new javax.swing.JLabel();
        jPanelO2 = new javax.swing.JPanel();
        jS2 = new javax.swing.JScrollPane();
        jTOpcion2 = new javax.swing.JTable();
        jLOpcion3 = new javax.swing.JLabel();
        jPanelO3 = new javax.swing.JPanel();
        jS3 = new javax.swing.JScrollPane();
        jTOpcion3 = new javax.swing.JTable();
        jLOpcion4 = new javax.swing.JLabel();
        jPanelO4 = new javax.swing.JPanel();
        jS4 = new javax.swing.JScrollPane();
        jTOpcion4 = new javax.swing.JTable();
        jLOpcion5 = new javax.swing.JLabel();
        jPanelO5 = new javax.swing.JPanel();
        jS5 = new javax.swing.JScrollPane();
        jTOpcion5 = new javax.swing.JTable();
        jLOpcion6 = new javax.swing.JLabel();
        jPanelO6 = new javax.swing.JPanel();
        jS6 = new javax.swing.JScrollPane();
        jTOpcion6 = new javax.swing.JTable();
        jLOpcion7 = new javax.swing.JLabel();
        jPanelO7 = new javax.swing.JPanel();
        jS7 = new javax.swing.JScrollPane();
        jTOpcion7 = new javax.swing.JTable();
        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/nutriFondo.png"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar = new javax.swing.JMenuBar();
        jmMaterias = new javax.swing.JMenu();
        MenuMat1 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        MenuAd1 = new javax.swing.JMenuItem();
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

        DatosDelPaciente.setBackground(new java.awt.Color(0, 204, 204));
        DatosDelPaciente.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DatosDelPaciente.setForeground(new java.awt.Color(0, 153, 153));
        DatosDelPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatosDelPaciente.setText("Datos del Paciente");
        DatosDelPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        jtEdad.setBackground(new java.awt.Color(255, 204, 255));
        jtEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(102, 0, 204));
        jtEdad.setToolTipText("Ingrese nombre del alumno");
        jtEdad.setMinimumSize(new java.awt.Dimension(25, 25));
        jtEdad.setName(""); // NOI18N
        jtEdad.setPreferredSize(new java.awt.Dimension(25, 25));

        jtPesoActual.setBackground(new java.awt.Color(255, 204, 255));
        jtPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoActual.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoActual.setToolTipText("Ingrese su nombre");
        jtPesoActual.setMaximumSize(new java.awt.Dimension(25, 71));
        jtPesoActual.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoActual.setName(""); // NOI18N
        jtPesoActual.setPreferredSize(new java.awt.Dimension(25, 71));

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

        SeleccionDeDieta.setBackground(new java.awt.Color(0, 204, 204));
        SeleccionDeDieta.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        SeleccionDeDieta.setForeground(new java.awt.Color(0, 153, 153));
        SeleccionDeDieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeleccionDeDieta.setText("Selección de la Dieta");
        SeleccionDeDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos2.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNombreDieta.setBackground(new java.awt.Color(255, 51, 102));
        jLNombreDieta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombreDieta.setForeground(new java.awt.Color(255, 255, 255));
        jLNombreDieta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombreDieta.setText("Nombre de la dieta:");
        jLNombreDieta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtNombreDieta.setBackground(new java.awt.Color(255, 204, 255));
        jtNombreDieta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNombreDieta.setForeground(new java.awt.Color(102, 0, 204));
        jtNombreDieta.setText("Dieta Lunar");
        jtNombreDieta.setToolTipText("Nombre de la dieta");
        jtNombreDieta.setEnabled(false);
        jtNombreDieta.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombreDieta.setName(""); // NOI18N
        jtNombreDieta.setPreferredSize(new java.awt.Dimension(25, 25));

        jrConfirmar.setBackground(new java.awt.Color(102, 0, 153));
        jrConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jrConfirmar.setText("Confirmar");
        jrConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrConfirmarActionPerformed(evt);
            }
        });

        jLCantMenu.setBackground(new java.awt.Color(255, 51, 102));
        jLCantMenu.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCantMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLCantMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCantMenu.setText("Cantidad de menus diarios:");
        jLCantMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLKcalPorSemana.setBackground(new java.awt.Color(255, 51, 102));
        jLKcalPorSemana.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLKcalPorSemana.setForeground(new java.awt.Color(255, 255, 255));
        jLKcalPorSemana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLKcalPorSemana.setText("Kcal por semana:");
        jLKcalPorSemana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jCKcalS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLFechaIni.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaIni.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaIni.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaIni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaIni.setText("Fecha Inicial:");

        jtFechaIni.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaIni.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaIni.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaIni.setToolTipText("Ingrese su nombre");
        jtFechaIni.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaIni.setName(""); // NOI18N
        jtFechaIni.setPreferredSize(new java.awt.Dimension(25, 25));

        jdFechaIni.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaIni.setToolTipText("");

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

        jdFechaFin.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaFin.setToolTipText("");

        jLSelA.setBackground(new java.awt.Color(255, 51, 102));
        jLSelA.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLSelA.setForeground(new java.awt.Color(255, 255, 255));
        jLSelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSelA.setText("Selección de alimentos del menú:");
        jLSelA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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

        jLDesMer.setBackground(new java.awt.Color(255, 51, 102));
        jLDesMer.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLDesMer.setForeground(new java.awt.Color(255, 255, 255));
        jLDesMer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDesMer.setText("Desayuno- Merienda");

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

        jLColacion.setBackground(new java.awt.Color(255, 51, 102));
        jLColacion.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLColacion.setForeground(new java.awt.Color(255, 255, 255));
        jLColacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLColacion.setText("Colación");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSDesMer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLDesMer, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLColacion, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAlmCena)
                    .addComponent(jLDesMer)
                    .addComponent(jLColacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSDesMer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSAlmCena, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPDatos2Layout = new javax.swing.GroupLayout(jPDatos2);
        jPDatos2.setLayout(jPDatos2Layout);
        jPDatos2Layout.setHorizontalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addComponent(jLNombreDieta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLCantMenu)
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jLFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jLFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jrConfirmar)
                                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                                .addComponent(jLKcalPorSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPDatos2Layout.setVerticalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreDieta)
                    .addComponent(jrConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLKcalPorSemana)
                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantMenu)
                    .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jdFechaIni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFechaIni)
                            .addComponent(jtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFechaFin)
                            .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLRPaso1.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso1.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso1.setText("Paso 1 : Comidas");
        jLRPaso1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso1.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso1.setText("Paso1");
        jbPaso1.setToolTipText("Búsqueda por DNI");
        jbPaso1.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso1.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso1.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso1.setName(""); // NOI18N
        jbPaso1.setPreferredSize(new java.awt.Dimension(81, 28));

        jLRPaso2.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso2.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso2.setText("Paso 2: Renglones");
        jLRPaso2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso2.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso2.setText("Paso 2");
        jbPaso2.setToolTipText("Búsqueda por DNI");
        jbPaso2.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso2.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso2.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso2.setName(""); // NOI18N
        jbPaso2.setPreferredSize(new java.awt.Dimension(81, 28));

        jLRPaso3.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso3.setForeground(new java.awt.Color(0, 153, 153));
        jLRPaso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso3.setText("Paso 3: Dieta diaria");
        jLRPaso3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso3.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso3.setText("Paso 3");
        jbPaso3.setToolTipText("Búsqueda por DNI");
        jbPaso3.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso3.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso3.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso3.setName(""); // NOI18N
        jbPaso3.setPreferredSize(new java.awt.Dimension(81, 28));

        DefinicionDeComidas.setBackground(new java.awt.Color(0, 204, 204));
        DefinicionDeComidas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DefinicionDeComidas.setForeground(new java.awt.Color(0, 153, 153));
        DefinicionDeComidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinicionDeComidas.setText("Definición de Comidas");
        DefinicionDeComidas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos3.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLReglones.setBackground(new java.awt.Color(255, 51, 102));
        jLReglones.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLReglones.setForeground(new java.awt.Color(255, 255, 255));
        jLReglones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLReglones.setText("Reglones de comida");
        jLReglones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPDatos3Layout = new javax.swing.GroupLayout(jPDatos3);
        jPDatos3.setLayout(jPDatos3Layout);
        jPDatos3Layout.setHorizontalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDatos3Layout.createSequentialGroup()
                        .addComponent(jLReglones, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        jPDatos3Layout.setVerticalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLReglones)
                    .addComponent(jCTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DietaDiaria.setBackground(new java.awt.Color(0, 204, 204));
        DietaDiaria.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DietaDiaria.setForeground(new java.awt.Color(0, 153, 153));
        DietaDiaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DietaDiaria.setText("Dieta Diaria");
        DietaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos4.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLOpcion1.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion1.setText("Alternativa de Menú N° 1 ");
        jLOpcion1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion1.setModel(new javax.swing.table.DefaultTableModel(
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
        jS1.setViewportView(jTOpcion1);

        javax.swing.GroupLayout jPanelO1Layout = new javax.swing.GroupLayout(jPanelO1);
        jPanelO1.setLayout(jPanelO1Layout);
        jPanelO1Layout.setHorizontalGroup(
            jPanelO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO1Layout.setVerticalGroup(
            jPanelO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLOpcion2.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion2.setText("Alternativa de Menú N° 2");
        jLOpcion2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion2.setModel(new javax.swing.table.DefaultTableModel(
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
        jS2.setViewportView(jTOpcion2);

        javax.swing.GroupLayout jPanelO2Layout = new javax.swing.GroupLayout(jPanelO2);
        jPanelO2.setLayout(jPanelO2Layout);
        jPanelO2Layout.setHorizontalGroup(
            jPanelO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS2, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO2Layout.setVerticalGroup(
            jPanelO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLOpcion3.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion3.setText("Alternativa de Menú N° 3 ");
        jLOpcion3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion3.setModel(new javax.swing.table.DefaultTableModel(
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
        jS3.setViewportView(jTOpcion3);

        javax.swing.GroupLayout jPanelO3Layout = new javax.swing.GroupLayout(jPanelO3);
        jPanelO3.setLayout(jPanelO3Layout);
        jPanelO3Layout.setHorizontalGroup(
            jPanelO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS3, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO3Layout.setVerticalGroup(
            jPanelO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLOpcion4.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion4.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion4.setText("Alternativa de Menú N° 4 ");
        jLOpcion4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion4.setModel(new javax.swing.table.DefaultTableModel(
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
        jS4.setViewportView(jTOpcion4);

        javax.swing.GroupLayout jPanelO4Layout = new javax.swing.GroupLayout(jPanelO4);
        jPanelO4.setLayout(jPanelO4Layout);
        jPanelO4Layout.setHorizontalGroup(
            jPanelO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS4)
                .addContainerGap())
        );
        jPanelO4Layout.setVerticalGroup(
            jPanelO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLOpcion5.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion5.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion5.setText("Alternativa de Menú N° 5");
        jLOpcion5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion5.setModel(new javax.swing.table.DefaultTableModel(
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
        jS5.setViewportView(jTOpcion5);

        javax.swing.GroupLayout jPanelO5Layout = new javax.swing.GroupLayout(jPanelO5);
        jPanelO5.setLayout(jPanelO5Layout);
        jPanelO5Layout.setHorizontalGroup(
            jPanelO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS5, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO5Layout.setVerticalGroup(
            jPanelO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jLOpcion6.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion6.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion6.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion6.setText("Alternativa de Menú N° 6");
        jLOpcion6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion6.setModel(new javax.swing.table.DefaultTableModel(
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
        jS6.setViewportView(jTOpcion6);

        javax.swing.GroupLayout jPanelO6Layout = new javax.swing.GroupLayout(jPanelO6);
        jPanelO6.setLayout(jPanelO6Layout);
        jPanelO6Layout.setHorizontalGroup(
            jPanelO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jS6, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO6Layout.setVerticalGroup(
            jPanelO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jS6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLOpcion7.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion7.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion7.setText("Alternativa de Menú N° 7 ");
        jLOpcion7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTOpcion7.setModel(new javax.swing.table.DefaultTableModel(
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
        jS7.setViewportView(jTOpcion7);

        javax.swing.GroupLayout jPanelO7Layout = new javax.swing.GroupLayout(jPanelO7);
        jPanelO7.setLayout(jPanelO7Layout);
        jPanelO7Layout.setHorizontalGroup(
            jPanelO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jS7, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelO7Layout.setVerticalGroup(
            jPanelO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jS7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPDatos4Layout = new javax.swing.GroupLayout(jPDatos4);
        jPDatos4.setLayout(jPDatos4Layout);
        jPDatos4Layout.setHorizontalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelO7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPDatos4Layout.setVerticalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addComponent(jLOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(500, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1059, Short.MAX_VALUE)
        );

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
        jmMaterias.add(MenuMat1);

        jMenuBar.add(jmMaterias);

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
        jmAdministracion.add(MenuAd1);

        jMenuBar.add(jmAdministracion);

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
        jmConsultas.add(MenuCon1);

        jMenuBar.add(jmConsultas);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir50.gif"))); // NOI18N
        jmSalir.setToolTipText("Salir");
        jmSalir.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmSalir.setMaximumSize(new java.awt.Dimension(112, 69));
        jmSalir.setMinimumSize(new java.awt.Dimension(72, 69));
        jmSalir.setName(""); // NOI18N
        jmSalir.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmSalir);

        jmAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alumno50.gif"))); // NOI18N
        jmAlumnos.setToolTipText("Alumnos");
        jmAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmAlumnos.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmAlumnos.setMaximumSize(new java.awt.Dimension(112, 69));
        jmAlumnos.setMinimumSize(new java.awt.Dimension(72, 69));
        jmAlumnos.setName(""); // NOI18N
        jmAlumnos.setPreferredSize(new java.awt.Dimension(72, 69));

        MenuAlu1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAlu1.setBackground(new java.awt.Color(0, 102, 153));
        MenuAlu1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAlu1.setText("Formulario de Alumno");
        jmAlumnos.add(MenuAlu1);

        jMenuBar.add(jmAlumnos);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DatosDelPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPDatos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPDatos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DefinicionDeComidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLRPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLRPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLRPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addComponent(jPDatos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DietaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(40, 40, 40)
                        .addComponent(DefinicionDeComidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Nutricionista");
        getAccessibleContext().setAccessibleDescription("Base de datos de la Universidad de la Punta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAltaActionPerformed

    }//GEN-LAST:event_jrAltaActionPerformed

    private void jrConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(EscritMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatosDelPaciente;
    private javax.swing.JLabel DefinicionDeComidas;
    private javax.swing.JLabel DietaDiaria;
    private javax.swing.JMenuItem MenuAd1;
    private javax.swing.JMenuItem MenuAlu1;
    private javax.swing.JMenuItem MenuCon1;
    private javax.swing.JMenuItem MenuMat1;
    private javax.swing.JLabel SeleccionDeDieta;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JComboBox<String> jCKcalS;
    private javax.swing.JComboBox<String> jCTipoComida;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAlmCena;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLCantMenu;
    private javax.swing.JLabel jLColacion;
    private javax.swing.JLabel jLDesMer;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLFechaFin;
    private javax.swing.JLabel jLFechaIni;
    private javax.swing.JLabel jLIMC;
    private javax.swing.JLabel jLKcalPorSemana;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombreDieta;
    private javax.swing.JLabel jLNroPaciente;
    private javax.swing.JLabel jLOpcion1;
    private javax.swing.JLabel jLOpcion2;
    private javax.swing.JLabel jLOpcion3;
    private javax.swing.JLabel jLOpcion4;
    private javax.swing.JLabel jLOpcion5;
    private javax.swing.JLabel jLOpcion6;
    private javax.swing.JLabel jLOpcion7;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLPesoBuscado;
    private javax.swing.JLabel jLRPaso1;
    private javax.swing.JLabel jLRPaso2;
    private javax.swing.JLabel jLRPaso3;
    private javax.swing.JLabel jLReglones;
    private javax.swing.JLabel jLSelA;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPDatos1;
    private javax.swing.JPanel jPDatos2;
    private javax.swing.JPanel jPDatos3;
    private javax.swing.JPanel jPDatos4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelO1;
    private javax.swing.JPanel jPanelO2;
    private javax.swing.JPanel jPanelO3;
    private javax.swing.JPanel jPanelO4;
    private javax.swing.JPanel jPanelO5;
    private javax.swing.JPanel jPanelO6;
    private javax.swing.JPanel jPanelO7;
    private javax.swing.JScrollPane jS1;
    private javax.swing.JScrollPane jS2;
    private javax.swing.JScrollPane jS3;
    private javax.swing.JScrollPane jS4;
    private javax.swing.JScrollPane jS5;
    private javax.swing.JScrollPane jS6;
    private javax.swing.JScrollPane jS7;
    private javax.swing.JScrollPane jSAlmCena;
    private javax.swing.JSpinner jSCantMenu;
    private javax.swing.JScrollPane jSColacion;
    private javax.swing.JScrollPane jSDesMer;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable jTOpcion1;
    private javax.swing.JTable jTOpcion2;
    private javax.swing.JTable jTOpcion3;
    private javax.swing.JTable jTOpcion4;
    private javax.swing.JTable jTOpcion5;
    private javax.swing.JTable jTOpcion6;
    private javax.swing.JTable jTOpcion7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JButton jbPaso1;
    private javax.swing.JButton jbPaso2;
    private javax.swing.JButton jbPaso3;
    private com.toedter.calendar.JDateChooser jdFechaFin;
    private com.toedter.calendar.JDateChooser jdFechaIni;
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
