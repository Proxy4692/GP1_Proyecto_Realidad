
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import conexion.Conexion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pacientes;
import servicios.PacientesService;
import javax.swing.SpinnerNumberModel;
import modelo.Alimentos;
import modelo.Comidas;
import modelo.MenuDiarios;
import modelo.RenglonDeMenus;
import servicios.ComidasService;
import servicios.MenuDiariosService;
import servicios.RenglonDeMenusService;

public class MenuPrincipal extends javax.swing.JFrame{
    private DefaultTableModel modeloBorrador= new DefaultTableModel();
    private DefaultTableModel modeloAlimento= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesA = new Class []{
                java.lang.Integer.class, java.lang.String.class,  java.lang.Boolean.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesA [columnIndex];
            }
    };
    private DefaultTableModel modeloComida= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class []{
                java.lang.Integer.class, java.lang.String.class,  java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
        public Class getColumnClass(int columnIndex){
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuD= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class []{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex){
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuA= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class []{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex){
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuC= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class []{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex){
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuM= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class []{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex){
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuN= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==4){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuLu= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuMa= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuMi= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuJu= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuVi= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuSa= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private DefaultTableModel modeloMenuDo= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,  java.lang.Double.class, java.lang.Integer.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };

    private PacientesService pacServ=new PacientesService();
    private ComidasService comServ=new ComidasService();
    private RenglonDeMenusService rengMenu= new RenglonDeMenusService();
    private MenuDiariosService menuServ= new MenuDiariosService();
    private Pacientes pacienteActual=null;
    private Alimentos alimentoActual=null;
    private Comidas comidaActual=null;
    private RenglonDeMenus renglonActual=null;
    private MenuDiarios menuActual=null;
    private Integer edad;
    private Integer altura;
    private Double pesoBuscado;
    private Double pesoActual;
    private Double alturaP;
    private Double imc;
    private Integer imcInt;
    private String nombre;
    private Integer cantMenu;   
    private String kcalSem;
    private Integer kcalDia = 1150;
    private Integer etapa=1;
    private Integer kcalCol=1;
    private Integer opcionActual=0;
    private Integer desActual;
    private Integer almActual;
    private Integer colActual;
    private Integer merActual;
    private Integer cenActual;
    
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;


    

    public MenuPrincipal() {
        initComponents();
        Connection con=Conexion.getConexion();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);       
        initForm();
        etapa1();
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
        jLPesoActual1 = new javax.swing.JLabel();
        jLPesoActual2 = new javax.swing.JLabel();
        jLPesoActual3 = new javax.swing.JLabel();
        jLPesoActual4 = new javax.swing.JLabel();
        jLPesoActual5 = new javax.swing.JLabel();
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
        jbAltaC = new javax.swing.JButton();
        jLRPaso1 = new javax.swing.JLabel();
        jbPaso1 = new javax.swing.JButton();
        jLRPaso2 = new javax.swing.JLabel();
        jbPaso2 = new javax.swing.JButton();
        jLRPaso3 = new javax.swing.JLabel();
        jbPaso3 = new javax.swing.JButton();
        jLDefinicionCom = new javax.swing.JLabel();
        jPDatos3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSAlimentos = new javax.swing.JScrollPane();
        jtComidas1 = new javax.swing.JTable();
        jSComidas = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
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
        modJueves = new javax.swing.JButton();
        modMiercoles = new javax.swing.JButton();
        modMartes = new javax.swing.JButton();
        modLunes = new javax.swing.JButton();
        modViernes = new javax.swing.JButton();
        modSabado = new javax.swing.JButton();
        modDomingo = new javax.swing.JButton();
        jLDesayuno = new javax.swing.JLabel();
        jSDesayuno = new javax.swing.JScrollPane();
        jTDesayuno = new javax.swing.JTable();
        jLAlmuerzo = new javax.swing.JLabel();
        jSAlmuerzo = new javax.swing.JScrollPane();
        jTAlmuerzo = new javax.swing.JTable();
        jLColacion = new javax.swing.JLabel();
        jSColacion = new javax.swing.JScrollPane();
        jTColacion = new javax.swing.JTable();
        jLMerienda = new javax.swing.JLabel();
        jSMerienda = new javax.swing.JScrollPane();
        jTMerienda = new javax.swing.JTable();
        jLCena = new javax.swing.JLabel();
        jSCena = new javax.swing.JScrollPane();
        jTCena = new javax.swing.JTable();
        jCTipoComida = new javax.swing.JComboBox<>();
        jLRPaso4 = new javax.swing.JLabel();
        jbPaso4 = new javax.swing.JButton();
        jLRPaso5 = new javax.swing.JLabel();
        jbPaso5 = new javax.swing.JButton();
        jLRPaso6 = new javax.swing.JLabel();
        jbPaso6 = new javax.swing.JButton();
        jbReasignar = new javax.swing.JButton();
        jtReasignar = new javax.swing.JTextField();
        selColacion = new javax.swing.JTextField();
        selDesayuno = new javax.swing.JTextField();
        selMerienda = new javax.swing.JTextField();
        selCena = new javax.swing.JTextField();
        selAlmuerzo = new javax.swing.JTextField();
        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/nutriFondo.png"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
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
        setTitle("NutriDastDiet");
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

        jtNroPaciente.setBackground(new java.awt.Color(51, 51, 55));
        jtNroPaciente.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNroPaciente.setForeground(new java.awt.Color(204, 255, 255));
        jtNroPaciente.setToolTipText("Codigo de paciente autogenerado");
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

        jtNombre.setBackground(new java.awt.Color(204, 255, 255));
        jtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre.setToolTipText("Ingrese apellido y nombre");
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

        jLEdad.setBackground(new java.awt.Color(255, 51, 102));
        jLEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEdad.setText("Edad:");

        jtEdad.setBackground(new java.awt.Color(204, 255, 255));
        jtEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(102, 0, 204));
        jtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtEdad.setToolTipText("Ingrese edad");
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

        jtAltura.setBackground(new java.awt.Color(204, 255, 255));
        jtAltura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(102, 0, 204));
        jtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtAltura.setToolTipText("Ingrese altura");
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

        jtIMC.setBackground(new java.awt.Color(51, 51, 55));
        jtIMC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtIMC.setForeground(new java.awt.Color(204, 255, 255));
        jtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtIMC.setToolTipText("Indice de Masa Corporal");
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

        jtPesoActual.setBackground(new java.awt.Color(204, 255, 255));
        jtPesoActual.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoActual.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPesoActual.setToolTipText("Ingrese su peso");
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

        jtPesoBuscado.setBackground(new java.awt.Color(204, 255, 255));
        jtPesoBuscado.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtPesoBuscado.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoBuscado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPesoBuscado.setToolTipText("Ingrese su peso buscado");
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
        jbAltaP.setToolTipText("Guardar Paciente");
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

        jLPesoActual1.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLPesoActual1.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPesoActual1.setText("Kg");

        jLPesoActual2.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPesoActual2.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPesoActual2.setText("Kg/m2");

        jLPesoActual3.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLPesoActual3.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPesoActual3.setText("Kg");

        jLPesoActual4.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPesoActual4.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPesoActual4.setText("años");

        jLPesoActual5.setBackground(new java.awt.Color(255, 51, 102));
        jLPesoActual5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPesoActual5.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoActual5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPesoActual5.setText("mts");

        javax.swing.GroupLayout jPDatos1Layout = new javax.swing.GroupLayout(jPDatos1);
        jPDatos1.setLayout(jPDatos1Layout);
        jPDatos1Layout.setHorizontalGroup(
            jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                                .addComponent(jLErrorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(239, 239, 239))))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLNroPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAltaP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLPesoActual4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLErrorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLErrorIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addComponent(jLIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLPesoActual2)))
                        .addGap(18, 18, 18))))
            .addGroup(jPDatos1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLErrorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(jPDatos1Layout.createSequentialGroup()
                        .addComponent(jLPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLErrorPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLPesoActual3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPesoActual5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPDatos1Layout.createSequentialGroup()
                                        .addComponent(jLPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPDatos1Layout.createSequentialGroup()
                                                .addComponent(jtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(jLPesoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLErrorPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap())
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
                .addComponent(jLErrorNroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPesoActual2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLAltura)
                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLIMC)
                        .addComponent(jLPesoActual4)
                        .addComponent(jLPesoActual5)
                        .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLErrorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorEdad)
                    .addComponent(jLErrorIMC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLPesoActual1)
                        .addComponent(jLPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPesoActual)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLPesoActual3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLErrorPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jSCantMenu.setToolTipText("Cantidad de días semanales del menu");
        jSCantMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSCantMenuStateChanged(evt);
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
        jLKcalPorSemana.setText("Kcal/100g por semana:");
        jLKcalPorSemana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jCKcalS.setToolTipText("Cantidad de kcal semanal");
        jCKcalS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCKcalSItemStateChanged(evt);
            }
        });

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
        jtFechaIni.setToolTipText("Fecha Inicio Dieta");
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
        jdFechaIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaIniPropertyChange(evt);
            }
        });

        jLFechaFin.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaFin.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaFin.setText("Fecha Final:");

        jtFechaFin.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaFin.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaFin.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaFin.setToolTipText("Fecha Finalizada la Dieta");
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
        jdFechaFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaFinPropertyChange(evt);
            }
        });

        jbAltaC.setBackground(new java.awt.Color(255, 255, 51));
        jbAltaC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbAltaC.setForeground(new java.awt.Color(0, 0, 255));
        jbAltaC.setText("Confirmar");
        jbAltaC.setToolTipText("Confirmar configuracion de Dieta");
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
                        .addGap(12, 12, 12)
                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                            .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jLErrorMenusDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))
                                .addGap(15, 15, 15)
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jLFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos2Layout.createSequentialGroup()
                                                .addComponent(jLKcalPorSemana)
                                                .addGap(11, 11, 11)
                                                .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLErrorKcalS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPDatos2Layout.createSequentialGroup()
                                .addComponent(jLNombreDieta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLErrorNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPDatos2Layout.createSequentialGroup()
                                        .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jbAltaC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(14, 14, 14))
        );

        jLRPaso1.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso1.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso1.setText("Confirmar COMIDAS");
        jLRPaso1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso1.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso1.setText("Paso1");
        jbPaso1.setToolTipText("Paso1: Comidas");
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
        jLRPaso2.setText("Confirmar MENÚS");
        jLRPaso2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso2.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso2.setText("Paso 2");
        jbPaso2.setToolTipText("Paso 2: Renglones");
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
        jbPaso3.setToolTipText("Paso 3: Dieta");
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

        jLDefinicionCom.setBackground(new java.awt.Color(0, 204, 204));
        jLDefinicionCom.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLDefinicionCom.setForeground(new java.awt.Color(0, 51, 255));
        jLDefinicionCom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDefinicionCom.setText("Seleccione Ingredientes del Menú");
        jLDefinicionCom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos3.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPDatos3.setToolTipText("");

        jtComidas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jSAlimentos.setViewportView(jtComidas1);

        jtComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jSComidas.setViewportView(jtComidas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSComidas, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jSAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSComidas, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        javax.swing.GroupLayout jPDatos3Layout = new javax.swing.GroupLayout(jPDatos3);
        jPDatos3.setLayout(jPDatos3Layout);
        jPDatos3Layout.setHorizontalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPDatos3Layout.setVerticalGroup(
            jPDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatos3Layout.createSequentialGroup()
                .addContainerGap()
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
        jLOpcion1.setText("LUNES");
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
            .addComponent(jS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        jPanelO1Layout.setVerticalGroup(
            jPanelO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO1Layout.createSequentialGroup()
                .addComponent(jS1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLOpcion2.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion2.setText("MARTES");
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
            .addComponent(jS2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanelO2Layout.setVerticalGroup(
            jPanelO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jS2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        jLOpcion3.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion3.setText("MIÉRCOLES");
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
            .addComponent(jS3, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        jPanelO3Layout.setVerticalGroup(
            jPanelO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO3Layout.createSequentialGroup()
                .addComponent(jS3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLOpcion4.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion4.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion4.setText("JUEVES");
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
            .addComponent(jS4, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        jPanelO4Layout.setVerticalGroup(
            jPanelO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO4Layout.createSequentialGroup()
                .addComponent(jS4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLOpcion5.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion5.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion5.setText("VIERNES");
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
            .addComponent(jS5, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        jPanelO5Layout.setVerticalGroup(
            jPanelO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO5Layout.createSequentialGroup()
                .addComponent(jS5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLOpcion6.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion6.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion6.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion6.setText("SÁBADO");
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
            .addComponent(jS6, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        jPanelO6Layout.setVerticalGroup(
            jPanelO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jS6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLOpcion7.setBackground(new java.awt.Color(255, 51, 102));
        jLOpcion7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLOpcion7.setForeground(new java.awt.Color(255, 255, 255));
        jLOpcion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOpcion7.setText("DOMINGO");
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
            .addComponent(jS7, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanelO7Layout.setVerticalGroup(
            jPanelO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelO7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jS7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modJueves.setBackground(new java.awt.Color(102, 0, 102));
        modJueves.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modJueves.setForeground(new java.awt.Color(102, 0, 0));
        modJueves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modJueves.setToolTipText("Cambiar Dieta Jueves");
        modJueves.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modJueves.setMaximumSize(new java.awt.Dimension(81, 24));
        modJueves.setMinimumSize(new java.awt.Dimension(81, 24));
        modJueves.setName(""); // NOI18N
        modJueves.setPreferredSize(new java.awt.Dimension(81, 28));
        modJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modJuevesActionPerformed(evt);
            }
        });

        modMiercoles.setBackground(new java.awt.Color(102, 0, 102));
        modMiercoles.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modMiercoles.setForeground(new java.awt.Color(102, 0, 0));
        modMiercoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modMiercoles.setToolTipText("Cambiar Dieta Miercoles");
        modMiercoles.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modMiercoles.setMaximumSize(new java.awt.Dimension(81, 24));
        modMiercoles.setMinimumSize(new java.awt.Dimension(81, 24));
        modMiercoles.setName(""); // NOI18N
        modMiercoles.setPreferredSize(new java.awt.Dimension(81, 28));
        modMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMiercolesActionPerformed(evt);
            }
        });

        modMartes.setBackground(new java.awt.Color(102, 0, 102));
        modMartes.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modMartes.setForeground(new java.awt.Color(102, 0, 0));
        modMartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modMartes.setToolTipText("Cambiar Dieta Martes");
        modMartes.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modMartes.setMaximumSize(new java.awt.Dimension(81, 24));
        modMartes.setMinimumSize(new java.awt.Dimension(81, 24));
        modMartes.setName(""); // NOI18N
        modMartes.setPreferredSize(new java.awt.Dimension(81, 28));
        modMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMartesActionPerformed(evt);
            }
        });

        modLunes.setBackground(new java.awt.Color(102, 0, 102));
        modLunes.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modLunes.setForeground(new java.awt.Color(102, 0, 0));
        modLunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modLunes.setToolTipText("Cambiar Dieta Lunes");
        modLunes.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modLunes.setMaximumSize(new java.awt.Dimension(81, 24));
        modLunes.setMinimumSize(new java.awt.Dimension(81, 24));
        modLunes.setName(""); // NOI18N
        modLunes.setPreferredSize(new java.awt.Dimension(81, 28));
        modLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modLunesActionPerformed(evt);
            }
        });

        modViernes.setBackground(new java.awt.Color(102, 0, 102));
        modViernes.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modViernes.setForeground(new java.awt.Color(102, 0, 0));
        modViernes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modViernes.setToolTipText("Cambiar Dieta Viernes");
        modViernes.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modViernes.setMaximumSize(new java.awt.Dimension(81, 24));
        modViernes.setMinimumSize(new java.awt.Dimension(81, 24));
        modViernes.setName(""); // NOI18N
        modViernes.setPreferredSize(new java.awt.Dimension(81, 28));
        modViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modViernesActionPerformed(evt);
            }
        });

        modSabado.setBackground(new java.awt.Color(102, 0, 102));
        modSabado.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modSabado.setForeground(new java.awt.Color(102, 0, 0));
        modSabado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modSabado.setToolTipText("Cambiar Dieta Sabado");
        modSabado.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modSabado.setMaximumSize(new java.awt.Dimension(81, 24));
        modSabado.setMinimumSize(new java.awt.Dimension(81, 24));
        modSabado.setName(""); // NOI18N
        modSabado.setPreferredSize(new java.awt.Dimension(81, 28));
        modSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modSabadoActionPerformed(evt);
            }
        });

        modDomingo.setBackground(new java.awt.Color(102, 0, 102));
        modDomingo.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        modDomingo.setForeground(new java.awt.Color(102, 0, 0));
        modDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar30.gif"))); // NOI18N
        modDomingo.setToolTipText("Cambiar Dieta Domingo");
        modDomingo.setMargin(new java.awt.Insets(2, 7, 2, 7));
        modDomingo.setMaximumSize(new java.awt.Dimension(81, 24));
        modDomingo.setMinimumSize(new java.awt.Dimension(81, 24));
        modDomingo.setName(""); // NOI18N
        modDomingo.setPreferredSize(new java.awt.Dimension(81, 28));
        modDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modDomingoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatos4Layout = new javax.swing.GroupLayout(jPDatos4);
        jPDatos4.setLayout(jPDatos4Layout);
        jPDatos4Layout.setHorizontalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOpcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addComponent(jPanelO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addComponent(jPanelO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addComponent(jPanelO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPDatos4Layout.setVerticalGroup(
            jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatos4Layout.createSequentialGroup()
                .addComponent(jLOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addComponent(jPanelO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatos4Layout.createSequentialGroup()
                                        .addComponent(jPanelO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLOpcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(modJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(modMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatos4Layout.createSequentialGroup()
                                .addComponent(jPanelO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLOpcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(modMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatos4Layout.createSequentialGroup()
                        .addComponent(jPanelO6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLOpcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLDesayuno.setBackground(new java.awt.Color(0, 204, 204));
        jLDesayuno.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLDesayuno.setForeground(new java.awt.Color(0, 153, 153));
        jLDesayuno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDesayuno.setText("Menú de DESAYUNO");
        jLDesayuno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTDesayuno.setModel(new javax.swing.table.DefaultTableModel(
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
        jTDesayuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDesayunoMouseClicked(evt);
            }
        });
        jTDesayuno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDesayunoKeyReleased(evt);
            }
        });
        jSDesayuno.setViewportView(jTDesayuno);

        jLAlmuerzo.setBackground(new java.awt.Color(0, 204, 204));
        jLAlmuerzo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLAlmuerzo.setForeground(new java.awt.Color(0, 153, 153));
        jLAlmuerzo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAlmuerzo.setText("Menú de ALMUERZO");
        jLAlmuerzo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTAlmuerzo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlmuerzoMouseClicked(evt);
            }
        });
        jTAlmuerzo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAlmuerzoKeyReleased(evt);
            }
        });
        jSAlmuerzo.setViewportView(jTAlmuerzo);

        jLColacion.setBackground(new java.awt.Color(0, 204, 204));
        jLColacion.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLColacion.setForeground(new java.awt.Color(0, 153, 153));
        jLColacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLColacion.setText("Menú de COLACIÓN");
        jLColacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTColacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jTColacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTColacionMouseClicked(evt);
            }
        });
        jTColacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTColacionKeyReleased(evt);
            }
        });
        jSColacion.setViewportView(jTColacion);

        jLMerienda.setBackground(new java.awt.Color(0, 204, 204));
        jLMerienda.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLMerienda.setForeground(new java.awt.Color(0, 153, 153));
        jLMerienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMerienda.setText("Menú de MERIENDA");
        jLMerienda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTMerienda.setModel(new javax.swing.table.DefaultTableModel(
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
        jTMerienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMeriendaMouseClicked(evt);
            }
        });
        jTMerienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTMeriendaKeyReleased(evt);
            }
        });
        jSMerienda.setViewportView(jTMerienda);

        jLCena.setBackground(new java.awt.Color(0, 204, 204));
        jLCena.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLCena.setForeground(new java.awt.Color(0, 153, 153));
        jLCena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCena.setText("Menú de CENA");
        jLCena.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTCena.setModel(new javax.swing.table.DefaultTableModel(
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
        jTCena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCenaMouseClicked(evt);
            }
        });
        jTCena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCenaKeyReleased(evt);
            }
        });
        jSCena.setViewportView(jTCena);

        jCTipoComida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCTipoComidaItemStateChanged(evt);
            }
        });

        jLRPaso4.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso4.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso4.setText("Confirmar COMIDAS");
        jLRPaso4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso4.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso4.setText("Paso1");
        jbPaso4.setToolTipText("Paso 1: Comidas");
        jbPaso4.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso4.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso4.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso4.setName(""); // NOI18N
        jbPaso4.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso4ActionPerformed(evt);
            }
        });

        jLRPaso5.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso5.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso5.setText("Confirmar MENÚS");
        jLRPaso5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso5.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso5.setText("Paso 2");
        jbPaso5.setToolTipText("Paso 2: Renglones");
        jbPaso5.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso5.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso5.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso5.setName(""); // NOI18N
        jbPaso5.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso5ActionPerformed(evt);
            }
        });

        jLRPaso6.setBackground(new java.awt.Color(0, 204, 204));
        jLRPaso6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRPaso6.setForeground(new java.awt.Color(0, 51, 255));
        jLRPaso6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRPaso6.setText("Confirmar DIETA");
        jLRPaso6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbPaso6.setBackground(new java.awt.Color(255, 255, 51));
        jbPaso6.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbPaso6.setText("Paso 3");
        jbPaso6.setToolTipText("Paso 3: Dieta");
        jbPaso6.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbPaso6.setMaximumSize(new java.awt.Dimension(81, 24));
        jbPaso6.setMinimumSize(new java.awt.Dimension(81, 24));
        jbPaso6.setName(""); // NOI18N
        jbPaso6.setPreferredSize(new java.awt.Dimension(81, 28));
        jbPaso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaso6ActionPerformed(evt);
            }
        });

        jbReasignar.setBackground(new java.awt.Color(255, 153, 153));
        jbReasignar.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jbReasignar.setForeground(new java.awt.Color(102, 0, 0));
        jbReasignar.setText("RE-ASIGNAR");
        jbReasignar.setToolTipText("Reasignar Dieta");
        jbReasignar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbReasignar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbReasignar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbReasignar.setName(""); // NOI18N
        jbReasignar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbReasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReasignarActionPerformed(evt);
            }
        });

        jtReasignar.setBackground(new java.awt.Color(255, 255, 255));
        jtReasignar.setFont(new java.awt.Font("Dubai Light", 2, 14)); // NOI18N
        jtReasignar.setForeground(new java.awt.Color(0, 51, 102));
        jtReasignar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtReasignar.setText("Mueva manualmente las combinaciones de replones de los distintos Menus Diarios");
        jtReasignar.setToolTipText("Ingrese su nombre");
        jtReasignar.setMinimumSize(new java.awt.Dimension(25, 25));
        jtReasignar.setName(""); // NOI18N
        jtReasignar.setPreferredSize(new java.awt.Dimension(25, 25));
        jtReasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtReasignarActionPerformed(evt);
            }
        });

        selColacion.setBackground(new java.awt.Color(102, 0, 102));
        selColacion.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        selColacion.setForeground(new java.awt.Color(255, 255, 255));
        selColacion.setToolTipText("");
        selColacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selColacionMouseClicked(evt);
            }
        });

        selDesayuno.setBackground(new java.awt.Color(102, 0, 102));
        selDesayuno.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        selDesayuno.setForeground(new java.awt.Color(255, 255, 255));
        selDesayuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selDesayunoMouseClicked(evt);
            }
        });

        selMerienda.setBackground(new java.awt.Color(102, 0, 102));
        selMerienda.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        selMerienda.setForeground(new java.awt.Color(255, 255, 255));
        selMerienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selMeriendaMouseClicked(evt);
            }
        });

        selCena.setBackground(new java.awt.Color(102, 0, 102));
        selCena.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        selCena.setForeground(new java.awt.Color(255, 255, 255));
        selCena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selCenaMouseClicked(evt);
            }
        });

        selAlmuerzo.setBackground(new java.awt.Color(102, 0, 102));
        selAlmuerzo.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        selAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        selAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selAlmuerzoMouseClicked(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(500, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2094, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DatosDelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLDefinicionCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDatos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLRPaso1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jbPaso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRPaso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbPaso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPDatos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtReasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbReasignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSDesayuno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addComponent(jSCena, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(selCena))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selAlmuerzo))
                    .addComponent(jSAlmuerzo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selColacion))
                    .addComponent(jSColacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selMerienda))
                    .addComponent(jSMerienda)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selDesayuno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbPaso4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLRPaso4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbPaso5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLRPaso5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbPaso6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLRPaso6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                            .addComponent(jLCena, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 2091, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DatosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DietaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtReasignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbReasignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SeleccionDeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDefinicionCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCTipoComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jLRPaso2)
                                    .addComponent(jLRPaso3)
                                    .addComponent(jLRPaso1))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLRPaso6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(jLRPaso5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLRPaso4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbPaso4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbPaso5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbPaso6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selColacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSCena, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
        );

        jCTipoComida.getAccessibleContext().setAccessibleParent(jtComidas);

        getAccessibleContext().setAccessibleName("Nutricionista");
        getAccessibleContext().setAccessibleDescription("Base de datos de la Universidad de la Punta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPaso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso1ActionPerformed
        if(etapa ==2){
            etapa3();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
    }//GEN-LAST:event_jbPaso1ActionPerformed

    private void jbPaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso2ActionPerformed
        if(etapa ==3){
            etapa4();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
    }//GEN-LAST:event_jbPaso2ActionPerformed

    private void jbPaso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso3ActionPerformed
        if(etapa ==4){
            etapa5();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
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
            if(jtEdad.getText().isEmpty()||Integer.parseInt(jtEdad.getText())>150){
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
            if(jtAltura.getText().isEmpty()||Double.parseDouble(jtAltura.getText())>3){
                jLErrorAltura.setText("FALTA COMPLETAR SU ALTURA");
                jLErrorAltura.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            alturaP= Double.parseDouble(jtAltura.getText()); 
            jLErrorAltura.setText("");
            if(!jtPesoActual.getText().isEmpty()){
                imc= pesoActual/(alturaP*alturaP);
                imcInt = imc.intValue();
                jtIMC.setText(imcInt.toString());
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
            if(jtPesoActual.getText().isEmpty()||Double.parseDouble(jtPesoActual.getText())>300){
                jLErrorPesoActual.setText("FALTA COMPLETAR SU PESO ACTUAL");
                jLErrorPesoActual.setForeground(new java.awt.Color(255, 51, 102));
                return;
            }
            pesoActual= Double.parseDouble(jtPesoActual.getText()); 
            jLErrorPesoActual.setText("");
            if(!jtAltura.getText().isEmpty()){
                imc= pesoActual/(alturaP*alturaP);
                imcInt = imc.intValue();
                jtIMC.setText(imcInt.toString());
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
            if(jtPesoBuscado.getText().isEmpty()||Double.parseDouble(jtPesoBuscado.getText())>300){
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

        if(jbAltaP.getText().equalsIgnoreCase("Guardar")){
            if(jtNombre.getText().isEmpty()||jtEdad.getText().isEmpty()||jtAltura.getText().isEmpty()||jtPesoActual.getText().isEmpty()||jtPesoBuscado.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Complete los datos del Paciente para poder definir la dieta");               
            }else{
                etapa2();  
            }
        }else{
            etapa1();
        }    

    }//GEN-LAST:event_jbAltaPActionPerformed

    private void jbAltaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCActionPerformed

        if(jbAltaC.getText().equalsIgnoreCase("Confirmar")){
            if(etapa!=5){
                if(jtFechaIni.getText().isEmpty()||jtFechaFin.getText().isEmpty()||jCKcalS.toString().isEmpty()||jSCantMenu.toString().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Complete los datos de la dieta");               
                }else{                     
                        etapa2b();
                }
            }
        }else{
            etapa2();
        }    
    }//GEN-LAST:event_jbAltaCActionPerformed

    private void jSCantMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSCantMenuStateChanged

        cantMenu= (Integer)jSCantMenu.getValue();
        jLErrorMenusDiarios.setText("");
        Etapa2Completa();
        
    }//GEN-LAST:event_jSCantMenuStateChanged

    private void jCKcalSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCKcalSItemStateChanged
        
        kcalSem= jCKcalS.toString();
        switch(kcalSem){ 
            case "5850k-MuyBajo":
                kcalDia=1050;
                kcalCol = 1;
                break;
            case "7000k-Bajo":
                kcalDia=1100;
                kcalCol = 2;
                break;
            case "8050k-Medio":
                kcalDia=1150;
                kcalCol = 3;
                break;
            case "9450k-Alto":
                kcalDia=1200;
                kcalCol = 4;
                break;
            case "10500k-MuyAlto":
                kcalDia=1250;
                kcalCol = 5;
                break;
            default:
                kcalDia=1150;
                kcalCol = 3;
                break;
        }
        jLErrorKcalS.setText("");
        Etapa2Completa();    
        
    }//GEN-LAST:event_jCKcalSItemStateChanged

    private void jdFechaIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaIniPropertyChange
        
        if(evt.getPropertyName().equals("date")){
            if(jdFechaIni.getDate()!=null){
                java.util.Date fechaVieja= jdFechaIni.getDate();
                long tiempo= fechaVieja.getTime();
                java.sql.Date fecha= new java.sql.Date(tiempo);
                fechaInicio= fecha.toLocalDate();
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                jtFechaIni.setText(fechaInicio.format(dtf));
                jLErrorFechaIni.setText("");
                Etapa2Completa();
            }else{
                jLErrorFechaIni.setText("INGRESE UNA FECHA VALIDA");
                jLErrorFechaIni.setForeground(new java.awt.Color(255, 51, 102));
                jdFechaIni.requestFocus(); 
            }        
        }
    }//GEN-LAST:event_jdFechaIniPropertyChange

    private void jdFechaFinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaFinPropertyChange

        if(evt.getPropertyName().equals("date")){
            if(jdFechaFin.getDate()!=null){
                java.util.Date fechaVieja= jdFechaFin.getDate();
                long tiempo= fechaVieja.getTime();
                java.sql.Date fecha= new java.sql.Date(tiempo);
                fechaFinal= fecha.toLocalDate();
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                jtFechaFin.setText(fechaFinal.format(dtf));  
                jLErrorFechaFin.setText("");
                Etapa2Completa();
            }else{
                jLErrorFechaFin.setText("INGRESE UNA FECHA VALIDA");
                jLErrorFechaFin.setForeground(new java.awt.Color(255, 51, 102));
                jdFechaFin.requestFocus(); 
            }        
        }
    }//GEN-LAST:event_jdFechaFinPropertyChange

    private void jCTipoComidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCTipoComidaItemStateChanged
       cargarDatosComidas();   
    }//GEN-LAST:event_jCTipoComidaItemStateChanged

    private void jTDesayunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDesayunoKeyReleased
        guardarDatosMenusDesayuno();
    }//GEN-LAST:event_jTDesayunoKeyReleased

    private void jTAlmuerzoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAlmuerzoKeyReleased
        guardarDatosMenusAlmuerzo();
    }//GEN-LAST:event_jTAlmuerzoKeyReleased

    private void jTColacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColacionKeyReleased
        guardarDatosMenusColacion();
    }//GEN-LAST:event_jTColacionKeyReleased

    private void jTMeriendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMeriendaKeyReleased
        guardarDatosMenusMerienda();
    }//GEN-LAST:event_jTMeriendaKeyReleased

    private void jTCenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCenaKeyReleased
        guardarDatosMenusCena();
    }//GEN-LAST:event_jTCenaKeyReleased

    private void jbPaso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso6ActionPerformed
        if(etapa ==4){
            etapa5();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
    }//GEN-LAST:event_jbPaso6ActionPerformed

    private void jbPaso5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso5ActionPerformed
        if(etapa ==3){
            etapa4();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
    }//GEN-LAST:event_jbPaso5ActionPerformed

    private void jbPaso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaso4ActionPerformed
        if(etapa ==2){
            etapa3();            
        }else{
            JOptionPane.showMessageDialog(this,"Paso incorrecto"); 
        }
    }//GEN-LAST:event_jbPaso4ActionPerformed

    private void jbReasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReasignarActionPerformed
        String msj="Alternativa obtenida desde tabla MENUS POSIBLES - 7 posibles combinaciones.";
        switch(opcionActual){
            case 0:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual); 
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(153,255,255));; 
                break;
            case 1:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(255, 153, 255));; 
                break;
            case 2:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(255,204,153));; 
                break;
            case 3:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(255,255,153));; 
                break;
            case 4:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(153,153,255));; 
                break;
            case 5:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(153,255,153));; 
                break;
            case 6:
                opcionActual++;
                jbReasignar.setText("ALTERNATIVA N°"+opcionActual);
                cargarDietaDiaria();
                jtReasignar.setText(msj); 
                jbReasignar.setBackground(new java.awt.Color(153,153,255));; 
                opcionActual=0;
                break;
            default:
                opcionActual=0;
                break;        
        }
    }//GEN-LAST:event_jbReasignarActionPerformed

    private void jtReasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtReasignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtReasignarActionPerformed

    private void jTDesayunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDesayunoMouseClicked
        int filaElegida=jTDesayuno.getSelectedRow();
        if(filaElegida!=-1){
            String desayuno= (String)jTDesayuno.getValueAt(filaElegida, 2);  
            selDesayuno.setText(desayuno);
            desActual=(Integer)jTDesayuno.getValueAt(filaElegida, 1); 
        }
    }//GEN-LAST:event_jTDesayunoMouseClicked

    private void jTAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlmuerzoMouseClicked
        int filaElegida=jTAlmuerzo.getSelectedRow();
        if(filaElegida!=-1){
            String desayuno= (String)jTAlmuerzo.getValueAt(filaElegida, 2);  
            selAlmuerzo.setText(desayuno);
            almActual=(Integer)jTAlmuerzo.getValueAt(filaElegida, 1); 
        }
    }//GEN-LAST:event_jTAlmuerzoMouseClicked

    private void jTColacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTColacionMouseClicked
        int filaElegida=jTColacion.getSelectedRow();
        if(filaElegida!=-1){
            String desayuno= (String)jTColacion.getValueAt(filaElegida, 2);  
            selColacion.setText(desayuno);
            colActual=(Integer)jTColacion.getValueAt(filaElegida, 1); 
        }
    }//GEN-LAST:event_jTColacionMouseClicked

    private void jTMeriendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMeriendaMouseClicked
        int filaElegida=jTMerienda.getSelectedRow();
        if(filaElegida!=-1){
            String desayuno= (String)jTMerienda.getValueAt(filaElegida, 2);  
            selMerienda.setText(desayuno);
            merActual=(Integer)jTMerienda.getValueAt(filaElegida, 1); 
        }
    }//GEN-LAST:event_jTMeriendaMouseClicked

    private void jTCenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCenaMouseClicked
        int filaElegida=jTCena.getSelectedRow();
        if(filaElegida!=-1){
            String desayuno= (String)jTCena.getValueAt(filaElegida, 2);  
            selCena.setText(desayuno);
            cenActual=(Integer)jTCena.getValueAt(filaElegida, 1); 
        }
    }//GEN-LAST:event_jTCenaMouseClicked

    private void modMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMartesActionPerformed
        modificarMenuMartes();
    }//GEN-LAST:event_modMartesActionPerformed

    private void modJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modJuevesActionPerformed
        modificarMenuJueves();
    }//GEN-LAST:event_modJuevesActionPerformed

    private void modLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modLunesActionPerformed
        modificarMenuLunes();
    }//GEN-LAST:event_modLunesActionPerformed

    private void modMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMiercolesActionPerformed
        modificarMenuMiercoles();
    }//GEN-LAST:event_modMiercolesActionPerformed

    private void modSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modSabadoActionPerformed
        modificarMenuSabado();
    }//GEN-LAST:event_modSabadoActionPerformed

    private void modViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modViernesActionPerformed
        modificarMenuViernes();
    }//GEN-LAST:event_modViernesActionPerformed

    private void modDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modDomingoActionPerformed
        modificarMenuDomingo();
    }//GEN-LAST:event_modDomingoActionPerformed

    private void selDesayunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selDesayunoMouseClicked
            selDesayuno.setText(null);
            desActual=0; 
    }//GEN-LAST:event_selDesayunoMouseClicked

    private void selAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selAlmuerzoMouseClicked
            selAlmuerzo.setText(null);
            almActual=0; 
    }//GEN-LAST:event_selAlmuerzoMouseClicked

    private void selColacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selColacionMouseClicked
            selColacion.setText(null);
            colActual=0; 
    }//GEN-LAST:event_selColacionMouseClicked

    private void selMeriendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selMeriendaMouseClicked
            selMerienda.setText(null);
            merActual=0; 
    }//GEN-LAST:event_selMeriendaMouseClicked

    private void selCenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selCenaMouseClicked
            selCena.setText(null);
            cenActual=0; 
    }//GEN-LAST:event_selCenaMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    private void Etapa1Completa(){
        
        if(!jtNombre.getText().isEmpty()&&!jtEdad.getText().isEmpty()&&!jtAltura.getText().isEmpty()&&!jtPesoActual.getText().isEmpty()&&!jtPesoBuscado.getText().isEmpty()){
            jLErrorNroPaciente.setText("");
            jLErrorIMC.setText("");
            jbAltaP.setBackground(new java.awt.Color(0, 204, 102));
        }
        
    }
    
    private void Etapa2Completa(){
        
        if(!jtFechaIni.getText().isEmpty()&&!jtFechaFin.getText().isEmpty()&&!jCKcalS.toString().isEmpty()&&!jSCantMenu.toString().isEmpty()){
            if(fechaInicio.isBefore(fechaFinal)){
                jLErrorNombreDieta.setText("");
                jbAltaC.setBackground(new java.awt.Color(0, 204, 102));
                jLErrorFechaIni.setForeground(new java.awt.Color(0, 47, 78));
                jLErrorFechaFin.setForeground(new java.awt.Color(0, 47, 78));
            }else{
                jtFechaFin.setText("");
                
                jLErrorFechaFin.setText("ELIJA FECHA MAYOR QUE LA INICIAL");
                jLErrorFechaFin.setForeground(new java.awt.Color(255, 51, 102));
                jbAltaC.setBackground(new java.awt.Color(255, 255, 51));
                
            }

        }
        
    }
    
    private void PacienteEnc(){
        DatosDelPaciente.setVisible(true);
        jPDatos1.setVisible(true);
    }
    private void PacienteApg(){
        DatosDelPaciente.setVisible(false);
        jPDatos1.setVisible(false);
    }
    
    private void PacienteHab(){
        jbAltaP.setText("GUARDAR");
        jPDatos1.setBackground(new java.awt.Color(153, 153, 153));
        jtNroPaciente.setEditable(false);
        jtIMC.setEditable(false);
        jtNombre.setEditable(true);
        jtEdad.setEditable(true);
        jtAltura.setEditable(true);
        jtPesoActual.setEditable(true);
        jtPesoBuscado.setEditable(true);
        jLErrorNroPaciente.setText("NÚMERO AUTOASIGNADO");
        jLErrorIMC.setText("ÍNDICE IMC CALCULADO");
    }
    
    private void PacienteBlq(){
        jbAltaP.setText("Modificar");
        jPDatos1.setBackground(new java.awt.Color(0, 47, 78));
        jtNombre.setEditable(false);
        jtEdad.setEditable(false);
        jtAltura.setEditable(false);
        jtPesoActual.setEditable(false);
        jtPesoBuscado.setEditable(false);
        jLErrorNombre.setText("");
        jLErrorEdad.setText("");
        jLErrorAltura.setText("");
        jLErrorPesoActual.setText("");
        jLErrorPesoBuscado.setText("");
    }
     
    private void ComidaEnc(){
        armarCabeceraAlimentos(); 
        cargarDatosAlimentos();
        jSAlimentos.setVisible(true);
        jSComidas.setVisible(false);
        SeleccionDeDieta.setVisible(true);
        jPDatos2.setVisible(true);
        jLDefinicionCom.setVisible(true);
        jPDatos3.setVisible(true);
        jCTipoComida.setVisible(false);
    }
    private void ComidaApg(){
        SeleccionDeDieta.setVisible(false);
        jPDatos2.setVisible(false);
        jLDefinicionCom.setVisible(false);
        jPDatos3.setVisible(false);
        jCTipoComida.setVisible(false);
    }
    
    private void ComidaHab(){
        jbAltaC.setText("CONFIRMAR");
        jbAltaC.setBackground(new java.awt.Color(255, 255, 51));
        jPDatos2.setBackground(new java.awt.Color(153, 153, 153));
        jtNombreDieta.setEditable(false);
        jtFechaIni.setEditable(false);
        jtFechaFin.setEditable(false);
        jdFechaIni.setEnabled(true);
        jdFechaFin.setEnabled(true);       
        jSCantMenu.setEnabled(true);
        jCKcalS.setEditable(true);
        jtNombreDieta.setText("DIETA LUNAR");
        jLErrorNombreDieta.setText("NOMBRE AUTOASIGNADO");
        jLErrorMenusDiarios.setText("ELIGA ENTRE 3 Y 7 MENUS DIARIOS");
        jLErrorKcalS.setText("REGULE NIVEL KCAL SEMANALES DE DIETA");
        jLErrorFechaFin.setText("INGRESE UNA FECHA FINAL DE DIETA");
        jLErrorFechaIni.setText("INGRESE LA FECHA INICIAL DE DIETA");
        jLDefinicionCom.setVisible(true);
        jPDatos3.setVisible(true);
        jtComidas.setEnabled(true);
    }
    
    private void ComidaBlq(){
        jbAltaC.setText("Modificar");
        jPDatos2.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaIni.setEnabled(false);
        jdFechaFin.setEnabled(false);   
        jSCantMenu.setEnabled(false);
        jtEdad.setEditable(false);
        jCKcalS.setEditable(false);
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
    }
    
    private void PasosApg(){
        jLRPaso1.setVisible(false);
        jbPaso1.setVisible(false);
        jLRPaso2.setVisible(false);
        jbPaso2.setVisible(false);
        jLRPaso3.setVisible(false);
        jbPaso3.setVisible(false);
    }
    
    private void PasosEnc2(){
        jLRPaso4.setVisible(true);
        jbPaso4.setVisible(true);
        jLRPaso5.setVisible(true);
        jbPaso5.setVisible(true);
        jLRPaso6.setVisible(true);
        jbPaso6.setVisible(true);
    }
    
    private void PasosApg2(){
        jLRPaso4.setVisible(false);
        jbPaso4.setVisible(false);
        jLRPaso5.setVisible(false);
        jbPaso5.setVisible(false);
        jLRPaso6.setVisible(false);
        jbPaso6.setVisible(false);
    }
    
    private void RenglonesEnc(){
        guardarDatosComidas();  
        jtComidas.setEnabled(false);
        jPDatos3.setBackground(new java.awt.Color(0, 47, 78));
        rengMenu.eliminarTodosRenglones();
        armarCabeceraMenusDesayuno();
        cargarDatosMenusDesayuno();
        armarCabeceraMenusAlmuerzo();
        cargarDatosMenusAlmuerzo();
        armarCabeceraMenusColacion();
        cargarDatosMenusColacion();
        armarCabeceraMenusMerienda();
        cargarDatosMenusMerienda();
        armarCabeceraMenusCena();
        cargarDatosMenusCena();
        jLDesayuno.setVisible(true);
        jLAlmuerzo.setVisible(true);
        jLColacion.setVisible(true);
        jLMerienda.setVisible(true);
        jLCena.setVisible(true);
        jSDesayuno.setVisible(true);
        jSAlmuerzo.setVisible(true);
        jSColacion.setVisible(true);
        jSMerienda.setVisible(true);
        jSCena.setVisible(true);

    }
    private void RenglonesApg(){
        jLDesayuno.setVisible(false);
        jLAlmuerzo.setVisible(false);
        jLColacion.setVisible(false);
        jLMerienda.setVisible(false);
        jLCena.setVisible(false);
        jSDesayuno.setVisible(false);
        jSAlmuerzo.setVisible(false);
        jSColacion.setVisible(false);
        jSMerienda.setVisible(false);
        jSCena.setVisible(false);
    }
    
    private void DietaEnc(){   
        DietaDiaria.setVisible(true);
        jPDatos4.setVisible(true);
        jbReasignar.setVisible(true);
        jtReasignar.setEditable(false);
        jtReasignar.setVisible(true);
        selDesayuno.setVisible(true);
        selAlmuerzo.setVisible(true);
        selColacion.setVisible(true);
        selMerienda.setVisible(true);
        selCena.setVisible(true);
        selDesayuno.setEditable(false);
        selAlmuerzo.setEditable(false);
        selColacion.setEditable(false);
        selMerienda.setEditable(false);
        selCena.setEditable(false);
        switch(cantMenu){
            case 3:
                modLunes.setVisible(true);
                modMiercoles.setVisible(true);
                modViernes.setVisible(true);
                jPanelO1.setVisible(true);
                jPanelO3.setVisible(true);
                jPanelO5.setVisible(true);
                jLOpcion1.setVisible(true);
                jLOpcion3.setVisible(true);
                jLOpcion5.setVisible(true);
                break;
            case 4:
                modLunes.setVisible(true);
                modMartes.setVisible(true);
                modJueves.setVisible(true);
                modViernes.setVisible(true);  
                jPanelO1.setVisible(true);
                jPanelO2.setVisible(true);
                jPanelO4.setVisible(true);
                jPanelO5.setVisible(true);
                jLOpcion1.setVisible(true);
                jLOpcion2.setVisible(true);
                jLOpcion4.setVisible(true);
                jLOpcion5.setVisible(true);
                break;
            case 5:
                modLunes.setVisible(true);
                modMartes.setVisible(true);
                modMiercoles.setVisible(true);
                modJueves.setVisible(true);
                modViernes.setVisible(true);               
                jPanelO1.setVisible(true);
                jPanelO2.setVisible(true);
                jPanelO3.setVisible(true);
                jPanelO4.setVisible(true);
                jPanelO5.setVisible(true);
                jLOpcion1.setVisible(true);
                jLOpcion2.setVisible(true);
                jLOpcion3.setVisible(true);
                jLOpcion4.setVisible(true);
                jLOpcion5.setVisible(true);
                break;
            case 6:
                modLunes.setVisible(true);
                modMartes.setVisible(true);
                modMiercoles.setVisible(true);
                modJueves.setVisible(true);
                modViernes.setVisible(true);
                modSabado.setVisible(true);
                modDomingo.setVisible(true);
                jPanelO1.setVisible(true);                
                jPanelO2.setVisible(true);                
                jPanelO3.setVisible(true);                
                jPanelO4.setVisible(true);                
                jPanelO5.setVisible(true);                
                jPanelO6.setVisible(true);                
                jLOpcion1.setVisible(true);                
                jLOpcion2.setVisible(true);                
                jLOpcion3.setVisible(true);                
                jLOpcion4.setVisible(true);                
                jLOpcion5.setVisible(true);                
                jLOpcion6.setVisible(true);                
                break;
            case 7:
                modLunes.setVisible(true);
                modMartes.setVisible(true);
                modMiercoles.setVisible(true);
                modJueves.setVisible(true);
                modViernes.setVisible(true);
                modSabado.setVisible(true);
                modDomingo.setVisible(true);
                jPanelO1.setVisible(true);
                jPanelO2.setVisible(true);
                jPanelO3.setVisible(true);
                jPanelO4.setVisible(true);
                jPanelO5.setVisible(true);
                jPanelO6.setVisible(true);
                jPanelO7.setVisible(true);
                jLOpcion1.setVisible(true);
                jLOpcion2.setVisible(true);
                jLOpcion3.setVisible(true);
                jLOpcion4.setVisible(true);
                jLOpcion5.setVisible(true);
                jLOpcion6.setVisible(true);
                jLOpcion7.setVisible(true);
                break;          
        }     
        desActual=0;
        almActual=0;
        merActual=0;
        colActual=0;
        cenActual=0;
        armarCabeceraMenusSemanal();
        jTOpcion1.setEnabled(true);
        jTOpcion2.setEnabled(true);
        jTOpcion3.setEnabled(true);
        jTOpcion4.setEnabled(true);
        jTOpcion5.setEnabled(true);
        jTOpcion6.setEnabled(true);
        jTOpcion7.setEnabled(true);
        
    }
    
    private void DietaApg(){
        DietaDiaria.setVisible(false);
        jPDatos4.setVisible(false);
        jbReasignar.setVisible(false);
        jtReasignar.setVisible(false);
        selDesayuno.setVisible(false);
        selAlmuerzo.setVisible(false);
        selColacion.setVisible(false);
        selMerienda.setVisible(false);
        selCena.setVisible(false);
        modLunes.setVisible(false);
        modMartes.setVisible(false);
        modMiercoles.setVisible(false);
        modJueves.setVisible(false);
        modViernes.setVisible(false);
        modSabado.setVisible(false);
        modDomingo.setVisible(false);       
        jPanelO1.setVisible(false);
        jPanelO2.setVisible(false);
        jPanelO3.setVisible(false);
        jPanelO4.setVisible(false);
        jPanelO5.setVisible(false);
        jPanelO6.setVisible(false);
        jPanelO7.setVisible(false);
        jLOpcion1.setVisible(false);
        jLOpcion2.setVisible(false);
        jLOpcion3.setVisible(false);
        jLOpcion4.setVisible(false);
        jLOpcion5.setVisible(false);
        jLOpcion6.setVisible(false);
        jLOpcion7.setVisible(false);
    }
    
    private void DietaBlq(){
        jTOpcion1.setEnabled(false);
        jTOpcion2.setEnabled(false);
        jTOpcion3.setEnabled(false);
        jTOpcion4.setEnabled(false);
        jTOpcion5.setEnabled(false);
        jTOpcion6.setEnabled(false);
        jTOpcion7.setEnabled(false);
    }
     
    private void etapa1(){
        PacienteEnc();
        PacienteHab();
        ComidaApg();
        PasosApg();
        PasosApg2();
        RenglonesApg();
        DietaApg();
        etapa = 1;
    }
    
    private void etapa2(){
        
        PacienteBlq();
        ComidaEnc();
        ComidaHab();  
        PasosApg();
        PasosApg2();
        RenglonesApg();
        DietaApg();
        etapa = 2;
    }
    
    private void etapa2b(){
        ComidaBlq();
        guardarDatosAlimentos();
        armarCabeceraComidas(); 
        jCTipoComida.setVisible(true);
        cargarDatosComidas();
        jSAlimentos.setVisible(false);
        jSComidas.setVisible(true);
        PasosEnc();  
        jbPaso1.setEnabled(true);
        jbPaso4.setEnabled(true);
        jbPaso2.setEnabled(false);
        jbPaso5.setEnabled(false);
        jbPaso3.setEnabled(false);
        jbPaso6.setEnabled(false);
    }
    
    private void etapa3(){
        jbPaso1.setBackground(new java.awt.Color(0, 204, 102));
        jbPaso4.setBackground(new java.awt.Color(0, 204, 102));
        RenglonesEnc();
        PasosApg();
        PasosEnc2();
        DietaApg();
        jbPaso2.setEnabled(true);
        jbPaso5.setEnabled(true);
        etapa = 3;
    }

    private void etapa4(){
        jbPaso2.setBackground(new java.awt.Color(0, 204, 102));
        jbPaso5.setBackground(new java.awt.Color(0, 204, 102));
        PacienteApg();
        ComidaApg(); 
        DietaEnc();
        jbPaso3.setEnabled(true);
        jbPaso6.setEnabled(true);
        etapa = 4;
    }
    
    private void etapa5(){ 
        DietaBlq();
        RenglonesApg();
        PasosApg2();
        jbPaso3.setBackground(new java.awt.Color(0, 204, 102));
        jbPaso6.setBackground(new java.awt.Color(0, 204, 102));
        jbReasignar.setVisible(false);
        jtReasignar.setVisible(false);
        selDesayuno.setVisible(false);
        selAlmuerzo.setVisible(false);
        selColacion.setVisible(false);
        selMerienda.setVisible(false);
        selCena.setVisible(false);
        modLunes.setVisible(false);
        modMartes.setVisible(false);
        modMiercoles.setVisible(false);
        modJueves.setVisible(false);
        modViernes.setVisible(false);
        modSabado.setVisible(false);
        modDomingo.setVisible(false);
        PacienteEnc();
        jSAlimentos.setVisible(false);
        jSComidas.setVisible(true);
        SeleccionDeDieta.setVisible(true);
        jPDatos2.setVisible(true);
        jPDatos3.setVisible(true);
        jCTipoComida.setVisible(false);
        jbAltaC.setVisible(false);
        jCKcalS.setEnabled(false);
        etapa = 5;
    }
        
    private void initForm(){
        
        SpinnerNumberModel cm = new SpinnerNumberModel();
        cm.setMaximum(7);
        cm.setMinimum(3);
        cm.setStepSize(1);
        jSCantMenu.setModel(cm);
        jSCantMenu.setValue(3);
              
        jCKcalS.addItem("5850k-MuyBajo");
        jCKcalS.addItem("7000k-Bajo");
        jCKcalS.addItem("8050k-Medio");
        jCKcalS.addItem("9450k-Alto");
        jCKcalS.addItem("10500k-MuyAlto");
        jCKcalS.setSelectedItem(new String("8050k-Medio"));
        
        jCTipoComida.addItem("Desayuno");
        jCTipoComida.addItem("Almuerzo");
        jCTipoComida.addItem("Colacion");
        jCTipoComida.addItem("Merienda");
        jCTipoComida.addItem("Cena");
        jCTipoComida.setSelectedItem(new String("Desayuno"));        
        
    }
    
    private void armarCabeceraAlimentos(){
        jLDefinicionCom.setText("Seleccione los ALIMENTOS que desea incluir");
        jCTipoComida.setVisible(false);
        jLDefinicionCom.setForeground(new java.awt.Color(0, 51, 255));
        jPDatos3.setBackground(new java.awt.Color(0, 51, 255));
        modeloAlimento.addColumn("nroAlimento");
        modeloAlimento.addColumn("nombre");
        modeloAlimento.addColumn("seleccionar");
        jtComidas1.setModel(modeloAlimento);
    }

    private void cargarDatosAlimentos(){
        int filasA=modeloAlimento.getRowCount()-1;
        for(int f=filasA;f>=0;f--){
            modeloAlimento.removeRow(f);
        }
        for (Alimentos alimento : comServ.listarAlimento()) {
            modeloAlimento.addRow(new Object[]{alimento.getCodAlimento(), alimento.getNombreA(), alimento.isSelA()});          
        }
        jtComidas1.enable(true);
    }
    
    private void guardarDatosAlimentos(){
        int filasA=jtComidas1.getRowCount()-1;
        for(int f=filasA;f>=0;f--){
            int codA=(Integer)jtComidas1.getValueAt(f, 0);
            String nA=(String)jtComidas1.getValueAt(f, 1);
            Boolean sA=(Boolean)jtComidas1.getValueAt(f, 2);
            Alimentos alimentoNuevo= new Alimentos(codA,nA,sA);
            comServ.actualizarSeleccionAlimento(alimentoNuevo);
        }
        jtComidas1.enable(false);        
    }
    
    private void armarCabeceraComidas(){
        jLDefinicionCom.setText("Seleccione las COMIDAS que no desea incluir");
        jLDefinicionCom.setForeground(new java.awt.Color(255, 51, 102));
        jPDatos3.setBackground(new java.awt.Color(255, 51, 102));
        modeloComida.addColumn("código");
        modeloComida.addColumn("nombre");
        modeloComida.addColumn("detalle");
        modeloComida.addColumn("kcal/100grs");
        modeloComida.addColumn("no incluir");
        jtComidas.setModel(modeloComida);
    }

    private void cargarDatosComidas(){
        if(jCTipoComida.getSelectedObjects().equals(null)){
            JOptionPane.showMessageDialog(this,"Seleccione un tipo de Comida válido");
            return;
        }
        int filasC=modeloComida.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloComida.removeRow(f);
        }
        for (Comidas comida : comServ.listarComida()) {
            if(comida.getTipoComida().toString().equals(jCTipoComida.getSelectedItem())){
                modeloComida.addRow(new Object[]{
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getDetalle(),
                    comida.getCaloriasPor100g(),
                    comida.isBaja(),
                }); 
            }
        }
        jtComidas.enable(true);      
    }
    
    private void guardarDatosComidas(){    
        int filas=jtComidas.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jtComidas.getValueAt(f, 0);
            String nC=(String)jtComidas.getValueAt(f, 1);
            String tC=(String)jtComidas.getValueAt(f, 2);
            int kC=(Integer)jtComidas.getValueAt(f, 3);
            Boolean bC=(Boolean)jtComidas.getValueAt(f, 4);
            Comidas comidaNuevo= new Comidas(codC, nC, tC, kC, bC);
            comServ.actualizarBajaComidas(comidaNuevo);
        }
        jtComidas.enable(false);       
    }
    
    private void armarCabeceraMenusDesayuno(){
        modeloMenuD.addColumn("nroRenglón");
        modeloMenuD.addColumn("código");
        modeloMenuD.addColumn("comida");
        modeloMenuD.addColumn("kcal/100grs");
        modeloMenuD.addColumn("gramos");
        modeloMenuD.addColumn("Total Kcal");
        jTDesayuno.setModel(modeloMenuD);
    }
    
    private void cargarDatosMenusDesayuno(){
        Double kcal = kcalDia * 0.2;
        int filasC=modeloMenuD.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuD.removeRow(f);
        }
        for (Comidas comida : comServ.listarComidaNoBaja()) {
            if(comida.getTipoComida().toString().equals("Desayuno")){
                rengMenu.borrarRenglonDeMenus(comida.getCodComida());
                rengMenu.crearRenglonDeMenus(comida, kcal.intValue());
                renglonActual = rengMenu.buscarRenglonDeMenu(comida.getCodComida());
                modeloMenuD.addRow(new Object[]{
                    renglonActual.getNroRenglon(),
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getCaloriasPor100g(),
                    renglonActual.getCantidadGrs(),
                    renglonActual.getSubtotalCalorias(),
                }); 
            }
        }
        jTDesayuno.enable(true);
    }
    
   
    private void guardarDatosMenusDesayuno(){    
        int filas=jTDesayuno.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jTDesayuno.getValueAt(f, 1);
            renglonActual = rengMenu.buscarRenglonDeMenu(codC);
            Double grsR=(Double)jTDesayuno.getValueAt(f, 4);
            rengMenu.actualizarGramosRenglon(renglonActual, grsR);
            jTDesayuno.setValueAt(renglonActual.getSubtotalCalorias(), f, 5);
        }        
    }
    
    private void armarCabeceraMenusAlmuerzo(){
        modeloMenuA.addColumn("nroRenglón");
        modeloMenuA.addColumn("código");
        modeloMenuA.addColumn("comida");
        modeloMenuA.addColumn("kcal/100grs");
        modeloMenuA.addColumn("gramos");
        modeloMenuA.addColumn("Total Kcal");
        jTAlmuerzo.setModel(modeloMenuA);
    }
    
    private void cargarDatosMenusAlmuerzo(){
        Double kcal = kcalDia * 0.3;
        int filasC=modeloMenuA.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuA.removeRow(f);
        }
        for (Comidas comida : comServ.listarComidaNoBaja()) {
            if(comida.getTipoComida().toString().equals("Almuerzo")){
                rengMenu.crearRenglonDeMenus(comida, kcal.intValue());
                renglonActual = rengMenu.buscarRenglonDeMenu(comida.getCodComida());
                modeloMenuA.addRow(new Object[]{
                    renglonActual.getNroRenglon(),
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getCaloriasPor100g(),
                    renglonActual.getCantidadGrs(),
                    renglonActual.getSubtotalCalorias(),
                }); 
            }
        }
        jTAlmuerzo.enable(true);
    }
    
    private void guardarDatosMenusAlmuerzo(){    
        int filas=jTAlmuerzo.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jTAlmuerzo.getValueAt(f, 1);
            renglonActual = rengMenu.buscarRenglonDeMenu(codC);
            Double grsR=(Double)jTAlmuerzo.getValueAt(f, 4);
            rengMenu.actualizarGramosRenglon(renglonActual, grsR);
            jTAlmuerzo.setValueAt(renglonActual.getSubtotalCalorias(), f, 5);
        }        
    }
        
    private void armarCabeceraMenusColacion(){
        modeloMenuC.addColumn("nroRenglón");
        modeloMenuC.addColumn("código");
        modeloMenuC.addColumn("comida");
        modeloMenuC.addColumn("kcal/100grs");
        modeloMenuC.addColumn("gramos");
        modeloMenuC.addColumn("Total Kcal");
        jTColacion.setModel(modeloMenuC);
    }
    
    private void cargarDatosMenusColacion(){
        Double kcal = kcalDia * 0.1;
        int filasC=modeloMenuC.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuC.removeRow(f);
        }
        for (Comidas comida : comServ.listarComidaNoBaja()) {
            if(comida.getTipoComida().toString().equals("Colacion")){
                rengMenu.crearRenglonDeMenus(comida, kcal.intValue());
                renglonActual = rengMenu.buscarRenglonDeMenu(comida.getCodComida());
                modeloMenuC.addRow(new Object[]{
                    renglonActual.getNroRenglon(),
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getCaloriasPor100g(),
                    renglonActual.getCantidadGrs(),
                    renglonActual.getSubtotalCalorias(),
                }); 
            }
        }
        jTColacion.enable(true);
    }
    
    private void guardarDatosMenusColacion(){    
        int filas=jTColacion.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jTColacion.getValueAt(f, 1);
            renglonActual = rengMenu.buscarRenglonDeMenu(codC);
            Double grsR=(Double)jTColacion.getValueAt(f, 4);
            rengMenu.actualizarGramosRenglon(renglonActual, grsR);
            jTColacion.setValueAt(renglonActual.getSubtotalCalorias(), f, 5);
        }        
    }
        
    private void armarCabeceraMenusMerienda(){
        modeloMenuM.addColumn("nroRenglón");
        modeloMenuM.addColumn("código");
        modeloMenuM.addColumn("comida");
        modeloMenuM.addColumn("kcal/100grs");
        modeloMenuM.addColumn("gramos");
        modeloMenuM.addColumn("Total Kcal");
        jTMerienda.setModel(modeloMenuM);
    }
    
    private void cargarDatosMenusMerienda(){
        Double kcal = kcalDia * 0.1;
        int filasC=modeloMenuM.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuM.removeRow(f);
        }
        for (Comidas comida : comServ.listarComidaNoBaja()) {
            if(comida.getTipoComida().toString().equals("Merienda")){
                rengMenu.crearRenglonDeMenus(comida, kcal.intValue());
                renglonActual = rengMenu.buscarRenglonDeMenu(comida.getCodComida());
                modeloMenuM.addRow(new Object[]{
                    renglonActual.getNroRenglon(),
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getCaloriasPor100g(),
                    renglonActual.getCantidadGrs(),
                    renglonActual.getSubtotalCalorias(),
                }); 
            }
        }
        jTMerienda.enable(true);
    }
    
    private void guardarDatosMenusMerienda(){    
        int filas=jTMerienda.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jTMerienda.getValueAt(f, 1);
            renglonActual = rengMenu.buscarRenglonDeMenu(codC);
            Double grsR=(Double)jTMerienda.getValueAt(f, 4);
            rengMenu.actualizarGramosRenglon(renglonActual, grsR);
            jTMerienda.setValueAt(renglonActual.getSubtotalCalorias(), f, 5);
        }        
    }
        
    private void armarCabeceraMenusCena(){
        modeloMenuN.addColumn("nroRenglón");
        modeloMenuN.addColumn("código");
        modeloMenuN.addColumn("comida");
        modeloMenuN.addColumn("kcal/100grs");
        modeloMenuN.addColumn("gramos");
        modeloMenuN.addColumn("Total Kcal");
        jTCena.setModel(modeloMenuN);
    }
    
    private void cargarDatosMenusCena(){
        Double kcal = kcalDia * 0.3;        
        int filasC=modeloMenuN.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuN.removeRow(f);
        }
        for (Comidas comida : comServ.listarComidaNoBaja()) {
            if(comida.getTipoComida().toString().equals("Cena")){
                rengMenu.crearRenglonDeMenus(comida, kcal.intValue());
                renglonActual = rengMenu.buscarRenglonDeMenu(comida.getCodComida());
                modeloMenuN.addRow(new Object[]{
                    renglonActual.getNroRenglon(),
                    comida.getCodComida(),                  
                    comida.getNombre(),
                    comida.getCaloriasPor100g(),
                    renglonActual.getCantidadGrs(),
                    renglonActual.getSubtotalCalorias(),
                }); 
            }
        }
        jTCena.enable(true);
    }
    
    private void guardarDatosMenusCena(){    
        int filas=jTCena.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            int codC=(Integer)jTCena.getValueAt(f, 1);
            renglonActual = rengMenu.buscarRenglonDeMenu(codC);
            Double grsR=(Double)jTCena.getValueAt(f, 4);
            rengMenu.actualizarGramosRenglon(renglonActual, grsR);
            jTCena.setValueAt(renglonActual.getSubtotalCalorias(), f, 5);
        }        
    }
    
    private void armarCabeceraMenusSemanal(){
        modeloMenuLu.addColumn("código");
        modeloMenuLu.addColumn("comida");
        modeloMenuLu.addColumn("detalle");
        modeloMenuLu.addColumn("gramos");
        modeloMenuLu.addColumn("kcal");
        jTOpcion1.setModel(modeloMenuLu);
        
        modeloMenuMa.addColumn("código");
        modeloMenuMa.addColumn("comida");
        modeloMenuMa.addColumn("detalle");
        modeloMenuMa.addColumn("gramos");
        modeloMenuMa.addColumn("kcal");
        jTOpcion2.setModel(modeloMenuMa);
        
        modeloMenuMi.addColumn("código");
        modeloMenuMi.addColumn("comida");
        modeloMenuMi.addColumn("detalle");
        modeloMenuMi.addColumn("gramos");
        modeloMenuMi.addColumn("kcal");
        jTOpcion3.setModel(modeloMenuMi);
        
        modeloMenuJu.addColumn("código");
        modeloMenuJu.addColumn("comida");
        modeloMenuJu.addColumn("detalle");
        modeloMenuJu.addColumn("gramos");
        modeloMenuJu.addColumn("kcal");
        jTOpcion4.setModel(modeloMenuJu);
        
        modeloMenuVi.addColumn("código");
        modeloMenuVi.addColumn("comida");
        modeloMenuVi.addColumn("detalle");
        modeloMenuVi.addColumn("gramos");
        modeloMenuVi.addColumn("kcal");
        jTOpcion5.setModel(modeloMenuVi);
        
        modeloMenuSa.addColumn("código");
        modeloMenuSa.addColumn("comida");
        modeloMenuSa.addColumn("detalle");
        modeloMenuSa.addColumn("gramos");
        modeloMenuSa.addColumn("kcal");
        jTOpcion6.setModel(modeloMenuSa);
        
        modeloMenuDo.addColumn("código");
        modeloMenuDo.addColumn("comida");
        modeloMenuDo.addColumn("detalle");
        modeloMenuDo.addColumn("gramos");
        modeloMenuDo.addColumn("kcal");
        jTOpcion7.setModel(modeloMenuDo);
    }

    private void borrarMenus(){
        int filasC=modeloMenuLu.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuLu.removeRow(f);
        }
        filasC=modeloMenuMa.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuMa.removeRow(f);
        }
        filasC=modeloMenuMi.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuMi.removeRow(f);
        }
        filasC=modeloMenuJu.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuJu.removeRow(f);
        }
        filasC=modeloMenuVi.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuVi.removeRow(f);
        }
        filasC=modeloMenuSa.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuSa.removeRow(f);
        }
        filasC=modeloMenuDo.getRowCount()-1;
        for(int f=filasC;f>=0;f--){
            modeloMenuDo.removeRow(f);
        }
    }
    
    private void cargarDietaDiaria(){
        borrarMenus();
        int fila=1;
        for (MenuDiarios menu : menuServ.listarMenusDiario(kcalCol, opcionActual)){

            if(fila==1){
                crearFilaMenuLu(menu.getDesayuno());               
                crearFilaMenuLu(menu.getAlmuerzo());
                crearFilaMenuLu(menu.getColacion());
                crearFilaMenuLu(menu.getMerienda());
                crearFilaMenuLu(menu.getCena());
            }
            if(fila==2){
                crearFilaMenuMa(menu.getDesayuno());               
                crearFilaMenuMa(menu.getAlmuerzo());
                crearFilaMenuMa(menu.getColacion());
                crearFilaMenuMa(menu.getMerienda());
                crearFilaMenuMa(menu.getCena());
            }
            if(fila==3){
                crearFilaMenuMi(menu.getDesayuno());               
                crearFilaMenuMi(menu.getAlmuerzo());
                crearFilaMenuMi(menu.getColacion());
                crearFilaMenuMi(menu.getMerienda());
                crearFilaMenuMi(menu.getCena());
            }
            if(fila==4){
                crearFilaMenuJu(menu.getDesayuno());               
                crearFilaMenuJu(menu.getAlmuerzo());
                crearFilaMenuJu(menu.getColacion());
                crearFilaMenuJu(menu.getMerienda());
                crearFilaMenuJu(menu.getCena());
            }
            if(fila==5){
                crearFilaMenuVi(menu.getDesayuno());               
                crearFilaMenuVi(menu.getAlmuerzo());
                crearFilaMenuVi(menu.getColacion());
                crearFilaMenuVi(menu.getMerienda());
                crearFilaMenuVi(menu.getCena());
            }
            if(fila==6){
                crearFilaMenuSa(menu.getDesayuno());               
                crearFilaMenuSa(menu.getAlmuerzo());
                crearFilaMenuSa(menu.getColacion());
                crearFilaMenuSa(menu.getMerienda());
                crearFilaMenuSa(menu.getCena());
            }
            if(fila==7){
                crearFilaMenuDo(menu.getDesayuno());               
                crearFilaMenuDo(menu.getAlmuerzo());
                crearFilaMenuDo(menu.getColacion());
                crearFilaMenuDo(menu.getMerienda());
                crearFilaMenuDo(menu.getCena());
            }
            fila++;
        }
  
    }
        
    private void crearFilaMenuLu(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuLu.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()}); 
        }else{
            modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
        }
    }
    private void crearFilaMenuMa(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuMa.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
        } 
    }
    private void crearFilaMenuMi(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuMi.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
        }  
    }
    private void crearFilaMenuJu(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuJu.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
        }    
    }
    private void crearFilaMenuVi(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuVi.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
        }   
    }
    private void crearFilaMenuSa(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuSa.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
        }    
    }
    private void crearFilaMenuDo(int codComida){
        renglonActual = rengMenu.buscarRenglonDeMenu(codComida);
        comidaActual = comServ.buscarComida(renglonActual.getConComida());
        if(!comidaActual.isBaja()){
            modeloMenuDo.addRow(new Object[]{comidaActual.getCodComida(), comidaActual.getNombre(), comidaActual.getDetalle(), renglonActual.getCantidadGrs(), renglonActual.getSubtotalCalorias()});
        }else{
            modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
        }     
    }
    
    private void modificarMenuLunes(){

        int filasC=modeloMenuLu.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion1.getRowCount()>0){
            desAnterior=(Integer)jTOpcion1.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion1.getRowCount()>1){
            almAnterior=(Integer)jTOpcion1.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion1.getRowCount()>2){
            colAnterior=(Integer)jTOpcion1.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion1.getRowCount()>3){
            merAnterior=(Integer)jTOpcion1.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion1.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion1.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuLu.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuLu(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuLu(desAnterior); 
            }else{
                modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuLu(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuLu(almAnterior); 
            }else{
                modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuLu(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuLu(colAnterior); 
            }else{
                modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuLu(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuLu(merAnterior); 
            }else{
                modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuLu(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuLu(cenAnterior); 
            }else{
                modeloMenuLu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuMartes(){

        int filasC=modeloMenuMa.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion2.getRowCount()>0){
            desAnterior=(Integer)jTOpcion2.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion2.getRowCount()>1){
            almAnterior=(Integer)jTOpcion2.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion2.getRowCount()>2){
            colAnterior=(Integer)jTOpcion2.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion2.getRowCount()>3){
            merAnterior=(Integer)jTOpcion2.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion2.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion2.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuMa.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuMa(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuMa(desAnterior); 
            }else{
                modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuMa(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuMa(almAnterior); 
            }else{
                modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuMa(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuMa(colAnterior); 
            }else{
                modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuMa(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuMa(merAnterior); 
            }else{
                modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuMa(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuMa(cenAnterior); 
            }else{
                modeloMenuMa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuMiercoles(){

        int filasC=modeloMenuMi.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion3.getRowCount()>0){
            desAnterior=(Integer)jTOpcion3.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion3.getRowCount()>1){
            almAnterior=(Integer)jTOpcion3.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion3.getRowCount()>2){
            colAnterior=(Integer)jTOpcion3.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion3.getRowCount()>3){
            merAnterior=(Integer)jTOpcion3.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion3.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion3.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuMi.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuMi(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuMi(desAnterior); 
            }else{
                modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuMi(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuMi(almAnterior); 
            }else{
                modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuMi(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuMi(colAnterior); 
            }else{
                modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuMi(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuMi(merAnterior); 
            }else{
                modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuMi(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuMi(cenAnterior); 
            }else{
                modeloMenuMi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuJueves(){

        int filasC=modeloMenuJu.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion4.getRowCount()>0){
            desAnterior=(Integer)jTOpcion4.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion4.getRowCount()>1){
            almAnterior=(Integer)jTOpcion4.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion4.getRowCount()>2){
            colAnterior=(Integer)jTOpcion4.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion4.getRowCount()>3){
            merAnterior=(Integer)jTOpcion4.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion4.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion4.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuJu.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuJu(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuJu(desAnterior); 
            }else{
                modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuJu(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuJu(almAnterior); 
            }else{
                modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuJu(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuJu(colAnterior); 
            }else{
                modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuJu(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuJu(merAnterior); 
            }else{
                modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuJu(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuJu(cenAnterior); 
            }else{
                modeloMenuJu.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuViernes(){

        int filasC=modeloMenuVi.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion5.getRowCount()>0){
            desAnterior=(Integer)jTOpcion5.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion5.getRowCount()>1){
            almAnterior=(Integer)jTOpcion5.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion5.getRowCount()>2){
            colAnterior=(Integer)jTOpcion5.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion5.getRowCount()>3){
            merAnterior=(Integer)jTOpcion5.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion5.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion5.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuVi.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuVi(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuVi(desAnterior); 
            }else{
                modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuVi(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuVi(almAnterior); 
            }else{
                modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuVi(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuVi(colAnterior); 
            }else{
                modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuVi(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuVi(merAnterior); 
            }else{
                modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuVi(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuVi(cenAnterior); 
            }else{
                modeloMenuVi.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuSabado(){

        int filasC=modeloMenuSa.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion6.getRowCount()>0){
            desAnterior=(Integer)jTOpcion6.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion6.getRowCount()>1){
            almAnterior=(Integer)jTOpcion6.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion6.getRowCount()>2){
            colAnterior=(Integer)jTOpcion6.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion6.getRowCount()>3){
            merAnterior=(Integer)jTOpcion6.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion6.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion6.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuSa.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuSa(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuSa(desAnterior); 
            }else{
                modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuSa(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuSa(almAnterior); 
            }else{
                modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuSa(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuSa(colAnterior); 
            }else{
                modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuSa(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuSa(merAnterior); 
            }else{
                modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuSa(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuSa(cenAnterior); 
            }else{
                modeloMenuSa.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    private void modificarMenuDomingo(){

        int filasC=modeloMenuDo.getRowCount()-1;
        int desAnterior, almAnterior, colAnterior, merAnterior, cenAnterior;        
        desAnterior=0;
        if(jTOpcion7.getRowCount()>0){
            desAnterior=(Integer)jTOpcion7.getValueAt(0, 0);
        }        
        almAnterior=0;
        if(jTOpcion7.getRowCount()>1){
            almAnterior=(Integer)jTOpcion7.getValueAt(1, 0);
        }       
        colAnterior=0;
        if(jTOpcion7.getRowCount()>2){
            colAnterior=(Integer)jTOpcion7.getValueAt(2, 0);
        }        
        merAnterior=0;
        if(jTOpcion7.getRowCount()>3){
            merAnterior=(Integer)jTOpcion7.getValueAt(3, 0);
        }
        cenAnterior=0;
        if(jTOpcion7.getRowCount()>4){
            cenAnterior=(Integer)jTOpcion7.getValueAt(4, 0);
        }        
        
        for(int f=filasC;f>=0;f--){
            modeloMenuDo.removeRow(f);
        }
        if(desActual!=0){
            crearFilaMenuDo(desActual);  
        }else{
            if(desAnterior!=0){
                crearFilaMenuDo(desAnterior); 
            }else{
                modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(almActual!=0){
            crearFilaMenuDo(almActual); 
        }else{
            if(almAnterior!=0){
                crearFilaMenuDo(almAnterior); 
            }else{
                modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
            }    
        }
        if(colActual!=0){
            crearFilaMenuDo(colActual);  
        }else{
            if(colAnterior!=0){
                crearFilaMenuDo(colAnterior); 
            }else{
                modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(merActual!=0){
            crearFilaMenuDo(merActual);  
        }else{
            if(merAnterior!=0){
                crearFilaMenuDo(merAnterior); 
            }else{
                modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
        if(cenActual!=0){
            crearFilaMenuDo(cenActual);  
        }else{
            if(cenAnterior!=0){
                crearFilaMenuDo(cenAnterior); 
            }else{
                modeloMenuDo.addRow(new Object[]{0, "", "", 0, 0});
            }  
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatosDelPaciente;
    private javax.swing.JLabel DietaDiaria;
    private javax.swing.JLabel SeleccionDeDieta;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JComboBox<String> jCKcalS;
    private javax.swing.JComboBox<String> jCTipoComida;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAlmuerzo;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLCantMenu;
    private javax.swing.JLabel jLCena;
    private javax.swing.JLabel jLColacion;
    private javax.swing.JLabel jLDefinicionCom;
    private javax.swing.JLabel jLDesayuno;
    private javax.swing.JLabel jLEdad;
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
    private javax.swing.JLabel jLMerienda;
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
    private javax.swing.JLabel jLPesoActual1;
    private javax.swing.JLabel jLPesoActual2;
    private javax.swing.JLabel jLPesoActual3;
    private javax.swing.JLabel jLPesoActual4;
    private javax.swing.JLabel jLPesoActual5;
    private javax.swing.JLabel jLPesoBuscado;
    private javax.swing.JLabel jLRPaso1;
    private javax.swing.JLabel jLRPaso2;
    private javax.swing.JLabel jLRPaso3;
    private javax.swing.JLabel jLRPaso4;
    private javax.swing.JLabel jLRPaso5;
    private javax.swing.JLabel jLRPaso6;
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
    private javax.swing.JScrollPane jSAlimentos;
    private javax.swing.JScrollPane jSAlmuerzo;
    private javax.swing.JSpinner jSCantMenu;
    private javax.swing.JScrollPane jSCena;
    private javax.swing.JScrollPane jSColacion;
    private javax.swing.JScrollPane jSComidas;
    private javax.swing.JScrollPane jSDesayuno;
    private javax.swing.JScrollPane jSMerienda;
    private javax.swing.JTable jTAlmuerzo;
    private javax.swing.JTable jTCena;
    private javax.swing.JTable jTColacion;
    private javax.swing.JTable jTDesayuno;
    private javax.swing.JTable jTMerienda;
    private javax.swing.JTable jTOpcion1;
    private javax.swing.JTable jTOpcion2;
    private javax.swing.JTable jTOpcion3;
    private javax.swing.JTable jTOpcion4;
    private javax.swing.JTable jTOpcion5;
    private javax.swing.JTable jTOpcion6;
    private javax.swing.JTable jTOpcion7;
    private javax.swing.JButton jbAltaC;
    private javax.swing.JButton jbAltaP;
    private javax.swing.JButton jbPaso1;
    private javax.swing.JButton jbPaso2;
    private javax.swing.JButton jbPaso3;
    private javax.swing.JButton jbPaso4;
    private javax.swing.JButton jbPaso5;
    private javax.swing.JButton jbPaso6;
    private javax.swing.JButton jbReasignar;
    private com.toedter.calendar.JDateChooser jdFechaFin;
    private com.toedter.calendar.JDateChooser jdFechaIni;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTable jtComidas;
    private javax.swing.JTable jtComidas1;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFechaFin;
    private javax.swing.JTextField jtFechaIni;
    private javax.swing.JTextField jtIMC;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreDieta;
    private javax.swing.JTextField jtNroPaciente;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoBuscado;
    private javax.swing.JTextField jtReasignar;
    private javax.swing.JButton modDomingo;
    private javax.swing.JButton modJueves;
    private javax.swing.JButton modLunes;
    private javax.swing.JButton modMartes;
    private javax.swing.JButton modMiercoles;
    private javax.swing.JButton modSabado;
    private javax.swing.JButton modViernes;
    private javax.swing.JTextField selAlmuerzo;
    private javax.swing.JTextField selCena;
    private javax.swing.JTextField selColacion;
    private javax.swing.JTextField selDesayuno;
    private javax.swing.JTextField selMerienda;
    // End of variables declaration//GEN-END:variables
}
