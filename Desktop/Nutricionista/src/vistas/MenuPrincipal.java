package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import conexion.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pacientes;
import servicios.PacientesService;

public class MenuPrincipal extends javax.swing.JFrame{
    private DefaultTableModel modeloPaciente= new DefaultTableModel();
    private PacientesService pacServ=new PacientesService();
    private Pacientes pacienteActual=null;
    private Integer edad;
    private Integer altura;
    private Double pesoBuscado;
    private Double pesoActual;
    private Double alturaP;
    private Double imc;
    private String nombre;
    private Integer cantMenu;
    
    public MenuPrincipal(){
        initComponents();
        Connection con=Conexion.getConexion();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);

        PacienteHab();
        ComidaApg();
        PasosApg();
        RenglonesApg();
        DietaApg();
        
        armarCabeceraPacientes();
        cargarDatosPacientes();
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
        jLNroPaciente = new javax.swing.JLabel();
        jtNroPaciente = new javax.swing.JTextField();
        jLErrorNroPaciente = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLErrorNombre = new javax.swing.JLabel();
        jLErrorAlta = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jLErrorEdad = new javax.swing.JLabel();
        jLAltura = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jLErrorAltura = new javax.swing.JLabel();
        jLIMC = new javax.swing.JLabel();
        jtIMC = new javax.swing.JTextField();
        jLErrorIMC = new javax.swing.JLabel();
        jLPesoActual = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jLErrorPesoActual = new javax.swing.JLabel();
        jLPesoBuscado = new javax.swing.JLabel();
        jtPesoBuscado = new javax.swing.JTextField();
        jLErrorPesoBuscado = new javax.swing.JLabel();
        jbAltaP = new javax.swing.JButton();
        SeleccionDeDieta = new javax.swing.JLabel();
        jPDatos2 = new javax.swing.JPanel();
        jLNombreDieta = new javax.swing.JLabel();
        jtNombreDieta = new javax.swing.JTextField();
        jLErrorNombreDieta = new javax.swing.JLabel();
        jLCantMenu = new javax.swing.JLabel();
        jSCantMenu = new javax.swing.JSpinner();
        jLErrorMenusDiarios = new javax.swing.JLabel();
        jLKcalPorSemana = new javax.swing.JLabel();
        jCKcalS = new javax.swing.JComboBox<>();
        jLErrorKcalS = new javax.swing.JLabel();
        jLFechaIni = new javax.swing.JLabel();
        jtFechaIni = new javax.swing.JTextField();
        jLErrorFechaFin = new javax.swing.JLabel();
        jdFechaIni = new com.toedter.calendar.JDateChooser();
        jLFechaFin = new javax.swing.JLabel();
        jtFechaFin = new javax.swing.JTextField();
        jLErrorFechaIni = new javax.swing.JLabel();
        jdFechaFin = new com.toedter.calendar.JDateChooser();
        jLSelA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSDesMer = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbAltaC = new javax.swing.JButton();
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
        TablaPaciente = new javax.swing.JLabel();
        jST1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        TablaComida = new javax.swing.JLabel();
        jST2 = new javax.swing.JScrollPane();
        jTableComida = new javax.swing.JTable();
        TablaRenglones = new javax.swing.JLabel();
        jST3 = new javax.swing.JScrollPane();
        jTableRenglones = new javax.swing.JTable();
        TablaDietaDiaria = new javax.swing.JLabel();
        jST4 = new javax.swing.JScrollPane();
        jTableDietaDiaria = new javax.swing.JTable();
        FIN = new javax.swing.JLabel();
        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/nutriFondo.png"));
        Image miImagen=icono.getImage();
        escritorio2 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar = new javax.swing.JMenuBar();
        jmMaterias = new javax.swing.JMenu();
        jmAdministracion = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmAlumnos = new javax.swing.JMenu();
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
        setMinimumSize(new java.awt.Dimension(1600, 1130));
        setPreferredSize(new java.awt.Dimension(1600, 1130));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 600));
        setType(java.awt.Window.Type.UTILITY);

        DatosDelPaciente.setBackground(new java.awt.Color(0, 204, 204));
        DatosDelPaciente.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DatosDelPaciente.setForeground(new java.awt.Color(0, 51, 255));
        DatosDelPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatosDelPaciente.setText("Datos del Paciente");
        DatosDelPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos1.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNroPaciente.setBackground(new java.awt.Color(255, 51, 102));
        jLNroPaciente.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNroPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jLNroPaciente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNroPaciente.setText("Nro Paciente:");
        jLNroPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtNroPaciente.setBackground(new java.awt.Color(255, 255, 255));
        jtNroPaciente.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNroPaciente.setForeground(new java.awt.Color(102, 0, 204));
        jtNroPaciente.setToolTipText("Codigo de paiente autogenerado");
        jtNroPaciente.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNroPaciente.setName(""); // NOI18N
        jtNroPaciente.setPreferredSize(new java.awt.Dimension(25, 25));

        jLErrorNroPaciente.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorNroPaciente.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorNroPaciente.setForeground(new java.awt.Color(102, 0, 204));
        jLErrorNroPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorNroPaciente.setText(" ");
        jLErrorNroPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLNombre.setBackground(new java.awt.Color(255, 51, 102));
        jLNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre.setText("Nombre:");

        jtNombre.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre.setToolTipText("Ingrese apellido del alumno");
        jtNombre.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre.setName(""); // NOI18N
        jtNombre.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });

        jLErrorNombre.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorNombre.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorNombre.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLErrorAlta.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorAlta.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorAlta.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorAlta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorAlta.setText(" ");
        jLErrorAlta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLEdad.setBackground(new java.awt.Color(255, 51, 102));
        jLEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEdad.setText("Edad");

        jtEdad.setBackground(new java.awt.Color(255, 204, 255));
        jtEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(102, 0, 204));
        jtEdad.setToolTipText("Ingrese nombre del alumno");
        jtEdad.setMinimumSize(new java.awt.Dimension(25, 25));
        jtEdad.setName(""); // NOI18N
        jtEdad.setPreferredSize(new java.awt.Dimension(25, 25));
        jtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEdadFocusLost(evt);
            }
        });

        jLErrorEdad.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorEdad.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorEdad.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorEdad.setText(" ");
        jLErrorEdad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLAltura.setBackground(new java.awt.Color(255, 51, 102));
        jLAltura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLAltura.setForeground(new java.awt.Color(255, 255, 255));
        jLAltura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLAltura.setText("Altura:");

        jtAltura.setBackground(new java.awt.Color(255, 204, 255));
        jtAltura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(102, 0, 204));
        jtAltura.setToolTipText("Ingrese nombre del alumno");
        jtAltura.setMinimumSize(new java.awt.Dimension(25, 25));
        jtAltura.setName(""); // NOI18N
        jtAltura.setPreferredSize(new java.awt.Dimension(25, 25));
        jtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtAlturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAlturaFocusLost(evt);
            }
        });

        jLErrorAltura.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorAltura.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorAltura.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorAltura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorAltura.setText(" ");
        jLErrorAltura.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLIMC.setBackground(new java.awt.Color(255, 51, 102));
        jLIMC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLIMC.setForeground(new java.awt.Color(255, 255, 255));
        jLIMC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIMC.setText("IMC:");

        jtIMC.setBackground(new java.awt.Color(255, 255, 255));
        jtIMC.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtIMC.setForeground(new java.awt.Color(102, 0, 204));
        jtIMC.setToolTipText("Ingrese nombre del alumno");
        jtIMC.setMinimumSize(new java.awt.Dimension(25, 25));
        jtIMC.setName(""); // NOI18N
        jtIMC.setPreferredSize(new java.awt.Dimension(25, 25));

        jLErrorIMC.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorIMC.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorIMC.setForeground(new java.awt.Color(102, 0, 204));
        jLErrorIMC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorIMC.setText(" ");
        jLErrorIMC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLPesoActual.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLPesoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLPesoActual.setText("Peso Actual:");

        jtPesoActual.setBackground(new java.awt.Color(255, 204, 255));
        jtPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoActual.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoActual.setToolTipText("Ingrese su nombre");
        jtPesoActual.setMaximumSize(new java.awt.Dimension(25, 71));
        jtPesoActual.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoActual.setName(""); // NOI18N
        jtPesoActual.setPreferredSize(new java.awt.Dimension(25, 71));
        jtPesoActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPesoActualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPesoActualFocusLost(evt);
            }
        });

        jLErrorPesoActual.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorPesoActual.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorPesoActual.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorPesoActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorPesoActual.setText(" ");
        jLErrorPesoActual.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
        jtPesoBuscado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPesoBuscadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPesoBuscadoFocusLost(evt);
            }
        });

        jLErrorPesoBuscado.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorPesoBuscado.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorPesoBuscado.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorPesoBuscado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorPesoBuscado.setText(" ");
        jLErrorPesoBuscado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jbAltaP.setBackground(new java.awt.Color(255, 255, 51));
        jbAltaP.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbAltaP.setForeground(new java.awt.Color(0, 0, 255));
        jbAltaP.setText("Alta");
        jbAltaP.setToolTipText("Búsqueda por DNI");
        jbAltaP.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbAltaP.setMaximumSize(new java.awt.Dimension(81, 24));
        jbAltaP.setMinimumSize(new java.awt.Dimension(81, 24));
        jbAltaP.setName(""); // NOI18N
        jbAltaP.setPreferredSize(new java.awt.Dimension(81, 28));
        jbAltaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaPActionPerformed(evt);
            }
        });

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
                                .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addComponent(jLErrorEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(182, 182, 182))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtPesoBuscado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLErrorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNroPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLErrorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAltaP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                                .addComponent(jLAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addComponent(jLErrorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLErrorIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLErrorPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPDatos1Layout.setVerticalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAltaP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLNroPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLErrorNroPaciente)
                    .addComponent(jLErrorAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAltura)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLIMC)
                            .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLErrorEdad))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLErrorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLErrorIMC))
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLErrorPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPesoActual)
                            .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        SeleccionDeDieta.setBackground(new java.awt.Color(0, 204, 204));
        SeleccionDeDieta.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        SeleccionDeDieta.setForeground(new java.awt.Color(0, 51, 255));
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

        jtNombreDieta.setBackground(new java.awt.Color(255, 255, 255));
        jtNombreDieta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNombreDieta.setForeground(new java.awt.Color(102, 0, 204));
        jtNombreDieta.setText("DIETA LUNAR");
        jtNombreDieta.setToolTipText("Nombre de la dieta");
        jtNombreDieta.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombreDieta.setName(""); // NOI18N
        jtNombreDieta.setPreferredSize(new java.awt.Dimension(25, 25));

        jLErrorNombreDieta.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorNombreDieta.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorNombreDieta.setForeground(new java.awt.Color(102, 0, 204));
        jLErrorNombreDieta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLErrorNombreDieta.setText(" ");
        jLErrorNombreDieta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLCantMenu.setBackground(new java.awt.Color(255, 51, 102));
        jLCantMenu.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCantMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLCantMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCantMenu.setText("Cantidad de menus diarios:");
        jLCantMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSCantMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSCantMenuStateChanged(evt);
            }
        });
        jSCantMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jSCantMenuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSCantMenuFocusLost(evt);
            }
        });

        jLErrorMenusDiarios.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorMenusDiarios.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorMenusDiarios.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorMenusDiarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorMenusDiarios.setText(" ");
        jLErrorMenusDiarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLKcalPorSemana.setBackground(new java.awt.Color(255, 51, 102));
        jLKcalPorSemana.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLKcalPorSemana.setForeground(new java.awt.Color(255, 255, 255));
        jLKcalPorSemana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLKcalPorSemana.setText("Kcal por semana:");
        jLKcalPorSemana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jCKcalS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLErrorKcalS.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorKcalS.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorKcalS.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorKcalS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorKcalS.setText(" ");
        jLErrorKcalS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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

        jLErrorFechaFin.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorFechaFin.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorFechaFin.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorFechaFin.setText(" ");
        jLErrorFechaFin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jdFechaIni.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaIni.setToolTipText("");

        jLFechaFin.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaFin.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaFin.setText("Fecha Final:");

        jtFechaFin.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaFin.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaFin.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaFin.setToolTipText("Ingrese su nombre");
        jtFechaFin.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaFin.setName(""); // NOI18N
        jtFechaFin.setPreferredSize(new java.awt.Dimension(25, 25));

        jLErrorFechaIni.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorFechaIni.setFont(new java.awt.Font("Dubai", 0, 8)); // NOI18N
        jLErrorFechaIni.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorFechaIni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErrorFechaIni.setText(" ");
        jLErrorFechaIni.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jdFechaFin.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaFin.setToolTipText("");

        jLSelA.setBackground(new java.awt.Color(255, 51, 102));
        jLSelA.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLSelA.setForeground(new java.awt.Color(255, 255, 255));
        jLSelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSelA.setText("Selección de alimentos del menú:");
        jLSelA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codAlimento", "Alimento", "kcal100g", "seleccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setMinimumSize(new java.awt.Dimension(33, 85));
        jTable2.setName(""); // NOI18N
        jTable2.setPreferredSize(new java.awt.Dimension(33, 85));
        jSDesMer.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSDesMer, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSDesMer, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbAltaC.setBackground(new java.awt.Color(255, 255, 51));
        jbAltaC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbAltaC.setForeground(new java.awt.Color(0, 0, 255));
        jbAltaC.setText("Alta");
        jbAltaC.setToolTipText("Búsqueda por DNI");
        jbAltaC.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbAltaC.setMaximumSize(new java.awt.Dimension(81, 24));
        jbAltaC.setMinimumSize(new java.awt.Dimension(81, 24));
        jbAltaC.setName(""); // NOI18N
        jbAltaC.setPreferredSize(new java.awt.Dimension(81, 28));
        jbAltaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaCActionPerformed(evt);
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
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLErrorMenusDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                                        .addComponent(jLKcalPorSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLErrorKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos2Layout.createSequentialGroup()
                                                .addComponent(jLFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jdFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))))
                                    .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPDatos2Layout.createSequentialGroup()
                                            .addComponent(jLNombreDieta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPDatos2Layout.createSequentialGroup()
                                                    .addComponent(jLErrorNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPDatos2Layout.createSequentialGroup()
                                                    .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jbAltaC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPDatos2Layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPDatos2Layout.createSequentialGroup()
                        .addComponent(jLErrorFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLErrorFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))))
        );
        jPDatos2Layout.setVerticalGroup(
            jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreDieta)
                    .addComponent(jbAltaC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLErrorNombreDieta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLKcalPorSemana)
                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantMenu)
                    .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLErrorKcalS)
                    .addComponent(jLErrorMenusDiarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLFechaIni)
                        .addComponent(jLFechaFin)
                        .addComponent(jtFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jtFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLErrorFechaFin)
                    .addComponent(jLErrorFechaIni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSelA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLRPaso1.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso1.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso1.setText("Definir Renglones");
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
        jbPaso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso1ActionPerformed(evt);
            }
        });

        jLRPaso2.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso2.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso2.setText("Definir Dietas");
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
        jbPaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso2ActionPerformed(evt);
            }
        });

        jLRPaso3.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso3.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso3.setText("Guardar e Imprimir");
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
        jbPaso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso3ActionPerformed(evt);
            }
        });

        DefinicionDeComidas.setBackground(new java.awt.Color(0, 204, 204));
        DefinicionDeComidas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DefinicionDeComidas.setForeground(new java.awt.Color(0, 51, 255));
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
                "codComida", "NombreComida", "Kcal", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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
        DietaDiaria.setForeground(new java.awt.Color(0, 51, 255));
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS1.setViewportView(jTOpcion1);

        javax.swing.GroupLayout jPanelO1Layout = new javax.swing.GroupLayout(jPanelO1);
        jPanelO1.setLayout(jPanelO1Layout);
        jPanelO1Layout.setHorizontalGroup(
            jPanelO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS2.setViewportView(jTOpcion2);

        javax.swing.GroupLayout jPanelO2Layout = new javax.swing.GroupLayout(jPanelO2);
        jPanelO2.setLayout(jPanelO2Layout);
        jPanelO2Layout.setHorizontalGroup(
            jPanelO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS2)
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS3.setViewportView(jTOpcion3);

        javax.swing.GroupLayout jPanelO3Layout = new javax.swing.GroupLayout(jPanelO3);
        jPanelO3.setLayout(jPanelO3Layout);
        jPanelO3Layout.setHorizontalGroup(
            jPanelO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS3)
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS5.setViewportView(jTOpcion5);

        javax.swing.GroupLayout jPanelO5Layout = new javax.swing.GroupLayout(jPanelO5);
        jPanelO5.setLayout(jPanelO5Layout);
        jPanelO5Layout.setHorizontalGroup(
            jPanelO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jS5)
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS6.setViewportView(jTOpcion6);

        javax.swing.GroupLayout jPanelO6Layout = new javax.swing.GroupLayout(jPanelO6);
        jPanelO6.setLayout(jPanelO6Layout);
        jPanelO6Layout.setHorizontalGroup(
            jPanelO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jS6)
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jS7.setViewportView(jTOpcion7);

        javax.swing.GroupLayout jPanelO7Layout = new javax.swing.GroupLayout(jPanelO7);
        jPanelO7.setLayout(jPanelO7Layout);
        jPanelO7Layout.setHorizontalGroup(
            jPanelO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jS7)
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

        TablaPaciente.setBackground(new java.awt.Color(0, 204, 204));
        TablaPaciente.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        TablaPaciente.setForeground(new java.awt.Color(0, 153, 153));
        TablaPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TablaPaciente.setText("tabla PACIENTE");
        TablaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jST1.setViewportView(jTablePaciente);

        TablaComida.setBackground(new java.awt.Color(0, 204, 204));
        TablaComida.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        TablaComida.setForeground(new java.awt.Color(0, 153, 153));
        TablaComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TablaComida.setText("tabla COMIDA");
        TablaComida.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableComida.setModel(new javax.swing.table.DefaultTableModel(
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
        jST2.setViewportView(jTableComida);

        TablaRenglones.setBackground(new java.awt.Color(0, 204, 204));
        TablaRenglones.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        TablaRenglones.setForeground(new java.awt.Color(0, 153, 153));
        TablaRenglones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TablaRenglones.setText("tabla RENGLONES DE DIETA");
        TablaRenglones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableRenglones.setModel(new javax.swing.table.DefaultTableModel(
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
        jST3.setViewportView(jTableRenglones);

        TablaDietaDiaria.setBackground(new java.awt.Color(0, 204, 204));
        TablaDietaDiaria.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        TablaDietaDiaria.setForeground(new java.awt.Color(0, 153, 153));
        TablaDietaDiaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TablaDietaDiaria.setText("tabla DIETA DIARIA");
        TablaDietaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableDietaDiaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jST4.setViewportView(jTableDietaDiaria);

        FIN.setBackground(new java.awt.Color(0, 204, 204));
        FIN.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        FIN.setForeground(new java.awt.Color(0, 153, 153));
        FIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FIN.setText("fin");
        FIN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        escritorio2.setBackground(new java.awt.Color(255, 255, 255));
        escritorio2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio2.setName(""); // NOI18N
        escritorio2.setPreferredSize(new java.awt.Dimension(500, 900));

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1640, Short.MAX_VALUE)
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1059, Short.MAX_VALUE)
        );

        jmMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/materia50.gif"))); // NOI18N
        jmMaterias.setToolTipText("Materias");
        jmMaterias.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmMaterias.setMaximumSize(new java.awt.Dimension(112, 69));
        jmMaterias.setMinimumSize(new java.awt.Dimension(72, 69));
        jmMaterias.setName(""); // NOI18N
        jmMaterias.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmMaterias);

        jmAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/administracion50.gif"))); // NOI18N
        jmAdministracion.setToolTipText("Administración");
        jmAdministracion.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmAdministracion.setMaximumSize(new java.awt.Dimension(112, 69));
        jmAdministracion.setMinimumSize(new java.awt.Dimension(72, 69));
        jmAdministracion.setName(""); // NOI18N
        jmAdministracion.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmAdministracion);

        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consulta50.gif"))); // NOI18N
        jmConsultas.setToolTipText("Consultas");
        jmConsultas.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmConsultas.setMaximumSize(new java.awt.Dimension(112, 69));
        jmConsultas.setMinimumSize(new java.awt.Dimension(72, 69));
        jmConsultas.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmConsultas);

        jmAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alumno50.gif"))); // NOI18N
        jmAlumnos.setToolTipText("Alumnos");
        jmAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmAlumnos.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmAlumnos.setMaximumSize(new java.awt.Dimension(112, 69));
        jmAlumnos.setMinimumSize(new java.awt.Dimension(72, 69));
        jmAlumnos.setName(""); // NOI18N
        jmAlumnos.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmAlumnos);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir50.gif"))); // NOI18N
        jmSalir.setToolTipText("Salir");
        jmSalir.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jmSalir.setMaximumSize(new java.awt.Dimension(112, 69));
        jmSalir.setMinimumSize(new java.awt.Dimension(72, 69));
        jmSalir.setName(""); // NOI18N
        jmSalir.setPreferredSize(new java.awt.Dimension(72, 69));
        jMenuBar.add(jmSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DatosDelPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPDatos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPDatos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DefinicionDeComidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLRPaso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbPaso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLRPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLRPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DietaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jST2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TablaDietaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(TablaPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jST4, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jST1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TablaComida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TablaRenglones, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jST3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(escritorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 1640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 558, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TablaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(28, 28, 28)
                        .addComponent(DefinicionDeComidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jST1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TablaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jST2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TablaRenglones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jST3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TablaDietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jST4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(FIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(escritorio2, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );

        getAccessibleContext().setAccessibleName("Nutricionista");
        getAccessibleContext().setAccessibleDescription("Base de datos de la Universidad de la Punta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPaso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso1ActionPerformed
        RenglonesEnc();
        jbPaso2.setEnabled(true);

    }//GEN-LAST:event_jbPaso1ActionPerformed

    private void jbPaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso2ActionPerformed
        DietaEnc();
        jbPaso3.setEnabled(true);

    }//GEN-LAST:event_jbPaso2ActionPerformed

    private void jbPaso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso3ActionPerformed

        PacienteHab();
        ComidaApg();
        PasosApg();
        RenglonesApg();
        DietaApg();
    }//GEN-LAST:event_jbPaso3ActionPerformed

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained

        jLErrorNombre.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorNombre.setText("INGRESE SU APELLIDO Y SU NOMBRE COMPLETO");        
        
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost

        if(jtNombre.getText().isEmpty()){
            jLErrorNombre.setText("FALTA COMPLETAR SU NOMBRE");
            jLErrorNombre.setForeground(new java.awt.Color(255, 51, 102));
            return;
        }
        nombre= jtNombre.getText();
        jLErrorNombre.setText("");
        Etapa1Completa();
        
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEdadFocusGained

        jLErrorEdad.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorEdad.setText("INGRESE SU EDAD");
        
    }//GEN-LAST:event_jtEdadFocusGained

    private void jtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEdadFocusLost

        try{
            if(jtEdad.getText().isEmpty()){
                jLErrorEdad.setText("FALTA COMPLETAR SU EDAD");
                jLErrorEdad.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            edad= Integer.parseInt(jtEdad.getText());
            jLErrorEdad.setText("");
            Etapa1Completa();
        }catch(NumberFormatException nf){
            jLErrorEdad.setText("LA EDAD ES UN VALOR NUMERICO");
            jLErrorEdad.setForeground(new java.awt.Color(255, 51, 102));
            jtEdad.setText("");
        }
    }//GEN-LAST:event_jtEdadFocusLost

    private void jtAlturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAlturaFocusGained

        jLErrorAltura.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorAltura.setText("INGRESE SU ALTURA");        
        
    }//GEN-LAST:event_jtAlturaFocusGained

    private void jtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAlturaFocusLost

        try{
            if(jtAltura.getText().isEmpty()){
                jLErrorAltura.setText("FALTA COMPLETAR SU ALTURA");
                jLErrorAltura.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            alturaP= Double.parseDouble(jtAltura.getText()); 
            jLErrorAltura.setText("");
            if(!jtPesoActual.getText().isEmpty()){
                imc= pesoActual/(alturaP*alturaP);
                jtIMC.setText(imc.toString());
                jLErrorIMC.setText("");
            }
            Etapa1Completa();
        }catch(NumberFormatException nf){
            jLErrorAltura.setText("LA ALTURA ES UN VALOR NUMERICO");
            jLErrorAltura.setForeground(new java.awt.Color(255, 51, 102));
            jtAltura.setText("");
        }        
    }//GEN-LAST:event_jtAlturaFocusLost

    private void jtPesoActualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoActualFocusGained

        jLErrorPesoActual.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorPesoActual.setText("SU PESO ACTUAL EN KG");        
        
    }//GEN-LAST:event_jtPesoActualFocusGained

    private void jtPesoActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoActualFocusLost

        try{
            if(jtPesoActual.getText().isEmpty()){
                jLErrorPesoActual.setText("FALTA COMPLETAR SU PESO ACTUAL");
                jLErrorPesoActual.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            pesoActual= Double.parseDouble(jtPesoActual.getText()); 
            jLErrorPesoActual.setText("");
            if(!jtAltura.getText().isEmpty()){
                imc= pesoActual/(alturaP*alturaP);
                jtIMC.setText(imc.toString());
                jLErrorIMC.setText("");
            }
            Etapa1Completa();
        }catch(NumberFormatException nf){
            jLErrorPesoActual.setText("EL PESO ACTUAL ES UN VALOR NUMERICO");
            jLErrorPesoActual.setForeground(new java.awt.Color(255, 51, 102));
            jtPesoActual.setText("");
        }
    }//GEN-LAST:event_jtPesoActualFocusLost

    private void jtPesoBuscadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoBuscadoFocusGained

        jLErrorPesoBuscado.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorPesoBuscado.setText("INGRESE SU PESO BUSCADO EN KG");         
        
    }//GEN-LAST:event_jtPesoBuscadoFocusGained

    private void jtPesoBuscadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoBuscadoFocusLost

        try{
            if(jtPesoBuscado.getText().isEmpty()){
                jLErrorPesoBuscado.setText("FALTA COMPLETAR SU PESO BUSCADO");
                jLErrorPesoBuscado.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            pesoBuscado= Double.parseDouble(jtPesoBuscado.getText());
            jLErrorPesoBuscado.setText("");
            Etapa1Completa();
        }catch(NumberFormatException nf){
            jLErrorPesoBuscado.setText("EL PESO BUSCADO ES UN VALOR NUMERICO");
            jLErrorPesoBuscado.setForeground(new java.awt.Color(255, 51, 102));
            jtPesoBuscado.setText("");
        }
    }//GEN-LAST:event_jtPesoBuscadoFocusLost

    private void jbAltaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaPActionPerformed

        if(jtNombre.getText().isEmpty()||jtEdad.getText().isEmpty()||jtAltura.getText().isEmpty()||jtPesoActual.getText().isEmpty()||jtPesoBuscado.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Complete los datos del Paciente para poder definir la dieta");
            PacienteHab();
            ComidaApg();
            PasosApg();
            RenglonesApg();
            DietaApg();               
        }else{
            PacienteBlq();
            ComidaEnc();
            ComidaHab();  
        }
    }//GEN-LAST:event_jbAltaPActionPerformed

    private void jbAltaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCActionPerformed

//    if(jtFechaIni.getText().isEmpty()||jtFechaFin.getText().isEmpty()){
//        JOptionPane.showMessageDialog(this,"Complete los datos de definicion de Comidas");
//        ComidaHab();
//        PasosApg();
//        RenglonesApg();
//        DietaApg();              
//    }else{
        ComidaBlq();
        PasosEnc();
//    }
    }//GEN-LAST:event_jbAltaCActionPerformed

    private void jSCantMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSCantMenuStateChanged

        int vmax=8;
        int vmin=2;
        if(jSCantMenu.equals(vmin)){
            jSCantMenu.setValue(3);
            jLErrorMenusDiarios.setText("LA CANTIDAD DE MENUS DIARIOS NO PUEDE SER MENOS DE 3");
            jLErrorMenusDiarios.setForeground(new java.awt.Color(255, 51, 102));
        }
        if(jSCantMenu.equals(vmax)){
            jSCantMenu.setValue(7);
            jLErrorMenusDiarios.setText("LA CANTIDAD DE MENUS DIARIOS NO PUEDE SUPERAR 7");
            jLErrorMenusDiarios.setForeground(new java.awt.Color(255, 51, 102));
        }
    }//GEN-LAST:event_jSCantMenuStateChanged

    private void jSCantMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSCantMenuFocusGained

        jLErrorMenusDiarios.setForeground(new java.awt.Color(0, 47, 78));
        jLErrorMenusDiarios.setText("INGRESE CANTIDAD DE MENUS DIARIOS : DESDE 3 HASTA 7");
    }//GEN-LAST:event_jSCantMenuFocusGained

    private void jSCantMenuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSCantMenuFocusLost

        cantMenu= Integer.parseInt(jSCantMenu.toString()); 
        jLErrorMenusDiarios.setText("");
        Etapa2Completa();
    }//GEN-LAST:event_jSCantMenuFocusLost

    public static void main(String args[]){
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
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    private void Etapa1Completa(){
        if(jtNombre.getText().isEmpty()&&jtEdad.getText().isEmpty()&&jtAltura.getText().isEmpty()&&jtPesoActual.getText().isEmpty()&&jtPesoBuscado.getText().isEmpty()){
            jLErrorNroPaciente.setText("");
            jLErrorAlta.setText("ASIGNAR UNA DIETA DIARIA");
            jLErrorIMC.setText("");
            jbAltaP.setEnabled(true);
        }
    }
    
    private void Etapa2Completa(){
        if(jtFechaIni.getText().isEmpty()||jtFechaFin.getText().isEmpty()){
        jLErrorNombreDieta.setText("");
        jbAltaC.setEnabled(true);
        }
    }
    
    private void PacienteEnc(){
        DatosDelPaciente.setVisible(true);
        jPDatos1.setVisible(true);
        jbAltaP.setEnabled(false);
        jbAltaC.setEnabled(false);
    }
    private void PacienteApg(){
        DatosDelPaciente.setVisible(false);
        jPDatos1.setVisible(false);
    }
    
    private void PacienteHab(){
        jPDatos1.setBackground(new java.awt.Color(153, 153, 153));
        jLErrorNroPaciente.setBackground(new java.awt.Color(255, 51, 102));
        jLErrorIMC.setBackground(new java.awt.Color(255, 51, 102));
        jtNroPaciente.setEditable(false);
        jtIMC.setEditable(false);
        jtNombre.setEditable(true);
        jtEdad.setEditable(true);
        jtAltura.setEditable(true);
        jtPesoActual.setEditable(true);
        jtPesoBuscado.setEditable(true);
        PacienteErr();
    }
    
    private void PacienteBlq(){
        jPDatos1.setBackground(new java.awt.Color(0, 47, 78));
        jLErrorNroPaciente.setBackground(new java.awt.Color(0, 47, 78));
        jLErrorIMC.setBackground(new java.awt.Color(0, 47, 78));
        jtNombre.setEditable(false);
        jtEdad.setEditable(false);
        jtAltura.setEditable(false);
        jtPesoActual.setEditable(false);
        jtPesoBuscado.setEditable(false);
        PacienteNoErr();
    }
    
    private void PacienteErr(){      
        jLErrorNroPaciente.setText("NÚMERO AUTOASIGNADO");
        jLErrorAlta.setText("");
        jLErrorIMC.setText("ÍNDICE IMC CALCULADO");
        jLErrorNombre.setText("");
        jLErrorEdad.setText("");
        jLErrorAltura.setText("");
        jLErrorPesoActual.setText("");
        jLErrorPesoBuscado.setText("");
    }
    
    private void PacienteNoErr(){
        jLErrorNroPaciente.setText("");
        jLErrorNombre.setText("");
        jLErrorAlta.setText(" ");
        jLErrorEdad.setText("");
        jLErrorAltura.setText("");
        jLErrorIMC.setText("");
        jLErrorPesoActual.setText("");
        jLErrorPesoBuscado.setText("");
    }
    
    private void ComidaEnc(){
        SeleccionDeDieta.setVisible(true);
        jPDatos2.setVisible(true);
    }
    private void ComidaApg(){
        SeleccionDeDieta.setVisible(false);
        jPDatos2.setVisible(false);
    }
    
    private void ComidaHab(){
        jPDatos2.setBackground(new java.awt.Color(153, 153, 153));
        jLErrorNombreDieta.setBackground(new java.awt.Color(255, 51, 102));
        jtNombreDieta.setEditable(false);
        jtFechaIni.setEditable(false);
        jtFechaFin.setEditable(false);
        jSCantMenu.setEnabled(true);
        jCKcalS.setEditable(false);
        jSCantMenu.setValue(3);
        ComidaErr();
    }
    
    private void ComidaBlq(){
        jPDatos2.setBackground(new java.awt.Color(0, 47, 78));
        jLErrorNombreDieta.setBackground(new java.awt.Color(0, 47, 78));
        jSCantMenu.setEnabled(false);
        jtEdad.setEditable(false);
        jCKcalS.setEditable(false);
        ComidaNoErr();
    }
    
    private void ComidaErr(){
        jtNombreDieta.setText("DIETA LUNAR");
        jLErrorNombreDieta.setText("NOMBRE AUTOASIGNADO");
        jLErrorMenusDiarios.setText("INGRESE CANTIDAD DE MENUS DIARIOS : DESDE 3 HASTA 7");
        jLErrorKcalS.setText("INGRESE UN VALOR DE KCAL SEMANALES");
        jLErrorFechaFin.setText("INGRESE UNA FECHA DE FINALIZADA LA DIETA");
        jLErrorFechaIni.setText("INGRESE LA FECHA DE COMIENZO DE LA DIETA");
    }
    
    private void ComidaNoErr(){
        jtNombreDieta.setText("");
        jLErrorNombreDieta.setText("");
        jLErrorMenusDiarios.setText("");
        jLErrorKcalS.setText("");
        jLErrorFechaFin.setText("");
        jLErrorFechaIni.setText("");
    }
    
    private void PasosEnc(){
        jLRPaso1.setVisible(true);
        jbPaso1.setVisible(true);
        jLRPaso2.setVisible(true);
        jbPaso2.setVisible(true);
        jLRPaso3.setVisible(true);
        jbPaso3.setVisible(true);
        jbPaso1.setEnabled(true);
    }
    
    private void PasosApg(){
        jLRPaso1.setVisible(false);
        jbPaso1.setVisible(false);
        jLRPaso2.setVisible(false);
        jbPaso2.setVisible(false);
        jLRPaso3.setVisible(false);
        jbPaso3.setVisible(false);
        jbPaso1.setEnabled(false);
        jbPaso2.setEnabled(false);
        jbPaso3.setEnabled(false);
    }
    
    private void RenglonesEnc(){
        DefinicionDeComidas.setVisible(true);
        jPDatos3.setVisible(true);
    }
    
    private void RenglonesApg(){
        DefinicionDeComidas.setVisible(false);
        jPDatos3.setVisible(false);
    }
    
    private void DietaEnc(){
        
        DietaDiaria.setVisible(true);
        jPDatos4.setVisible(true);
        TablaPaciente.setVisible(true);
        TablaComida.setVisible(true);
        TablaRenglones.setVisible(true);
        TablaDietaDiaria.setVisible(true);
        FIN.setVisible(true);
        jST1.setVisible(true);
        jST2.setVisible(true);
        jST3.setVisible(true);
        jST4.setVisible(true);
    }
    
    private void DietaApg(){
        DietaDiaria.setVisible(false);
        jPDatos4.setVisible(false);
        TablaPaciente.setVisible(false);
        jST1.setVisible(false);
        TablaComida.setVisible(false);
        jST2.setVisible(false);
        TablaRenglones.setVisible(false);
        jST3.setVisible(false);
        TablaDietaDiaria.setVisible(false);
        jST4.setVisible(false);
        FIN.setVisible(false);
    }
    
    private void armarCabeceraPacientes(){     
        modeloPaciente.addColumn("nroPaciente");
        modeloPaciente.addColumn("nombre");
        modeloPaciente.addColumn("edad");
        modeloPaciente.addColumn("altura");
        modeloPaciente.addColumn("Peso Actual");
        modeloPaciente.addColumn("Peso Buscado");
        modeloPaciente.addColumn("Codigo Dieta");
        
        jTablePaciente.setModel(modeloPaciente);
    }

    private void cargarDatosPacientes(){
        int filas=jTablePaciente.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modeloPaciente.removeRow(f);
        }
        for(Pacientes paciente : pacServ.listarPaciente()){
            modeloPaciente.addRow(new Object[]{paciente.getNroPaciente(), paciente.getNombre(), paciente.getEdad(),paciente.getAltura(),paciente.getPesoActual(), paciente.getPesoBuscado(),0});          
        }
        jTablePaciente.enable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatosDelPaciente;
    private javax.swing.JLabel DefinicionDeComidas;
    private javax.swing.JLabel DietaDiaria;
    private javax.swing.JLabel FIN;
    private javax.swing.JLabel SeleccionDeDieta;
    private javax.swing.JLabel TablaComida;
    private javax.swing.JLabel TablaDietaDiaria;
    private javax.swing.JLabel TablaPaciente;
    private javax.swing.JLabel TablaRenglones;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JDesktopPane escritorio2;
    private javax.swing.JComboBox<String> jCKcalS;
    private javax.swing.JComboBox<String> jCTipoComida;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLCantMenu;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLErrorAlta;
    private javax.swing.JLabel jLErrorAltura;
    private javax.swing.JLabel jLErrorEdad;
    private javax.swing.JLabel jLErrorFechaFin;
    private javax.swing.JLabel jLErrorFechaIni;
    private javax.swing.JLabel jLErrorIMC;
    private javax.swing.JLabel jLErrorKcalS;
    private javax.swing.JLabel jLErrorMenusDiarios;
    private javax.swing.JLabel jLErrorNombre;
    private javax.swing.JLabel jLErrorNombreDieta;
    private javax.swing.JLabel jLErrorNroPaciente;
    private javax.swing.JLabel jLErrorPesoActual;
    private javax.swing.JLabel jLErrorPesoBuscado;
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
    private javax.swing.JSpinner jSCantMenu;
    private javax.swing.JScrollPane jSDesMer;
    private javax.swing.JScrollPane jST1;
    private javax.swing.JScrollPane jST2;
    private javax.swing.JScrollPane jST3;
    private javax.swing.JScrollPane jST4;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable jTOpcion1;
    private javax.swing.JTable jTOpcion2;
    private javax.swing.JTable jTOpcion3;
    private javax.swing.JTable jTOpcion4;
    private javax.swing.JTable jTOpcion5;
    private javax.swing.JTable jTOpcion6;
    private javax.swing.JTable jTOpcion7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableComida;
    private javax.swing.JTable jTableDietaDiaria;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTable jTableRenglones;
    private javax.swing.JButton jbAltaC;
    private javax.swing.JButton jbAltaP;
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