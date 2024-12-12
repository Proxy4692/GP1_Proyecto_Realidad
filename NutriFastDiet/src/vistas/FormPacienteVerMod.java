package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pacientes;
import servicios.PacientesService;

public class FormPacienteVerMod extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
        Class[] typesC = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class,  java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
        public Class getColumnClass(int columnIndex) {
                return typesC [columnIndex];
            }
    };
    private PacientesService pacServ=new PacientesService();
    private Pacientes pacienteActual=null;
    private Integer edad;
    private Double pesoBuscado;
    private Double pesoActual;
    private Double alturaP;
    private String nombre;
    
    public FormPacienteVerMod() {
        initComponents();
        armarCabecera(); 
        cargarDatos();            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jtNroPaciente = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtPesoBuscado = new javax.swing.JTextField();
        jSTabla = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLRotulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(480, 600));

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Pacientes");
        jLRotulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPDatos.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(255, 51, 102));
        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        jLabel2.setBackground(new java.awt.Color(255, 51, 102));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("cod. Paciente:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setBackground(new java.awt.Color(255, 51, 102));
        jLabel4.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Edad:");

        jtNombre.setBackground(new java.awt.Color(102, 255, 204));
        jtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre.setToolTipText("Apellido y nombre de paciente");
        jtNombre.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre.setName(""); // NOI18N
        jtNombre.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });

        jtEdad.setBackground(new java.awt.Color(204, 204, 255));
        jtEdad.setFont(new java.awt.Font("Dubai", 1, 10)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(102, 0, 204));
        jtEdad.setToolTipText("Edad de paciente");
        jtEdad.setMinimumSize(new java.awt.Dimension(25, 25));
        jtEdad.setName(""); // NOI18N
        jtEdad.setPreferredSize(new java.awt.Dimension(25, 25));
        jtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEdadFocusLost(evt);
            }
        });

        jtNroPaciente.setEditable(false);
        jtNroPaciente.setBackground(new java.awt.Color(204, 204, 204));
        jtNroPaciente.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNroPaciente.setForeground(new java.awt.Color(102, 0, 204));
        jtNroPaciente.setToolTipText("Número de paciente autogenerado");
        jtNroPaciente.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNroPaciente.setName(""); // NOI18N
        jtNroPaciente.setPreferredSize(new java.awt.Dimension(25, 25));

        jbBuscar.setBackground(new java.awt.Color(102, 255, 204));
        jbBuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar30.gif"))); // NOI18N
        jbBuscar.setToolTipText("Búsqueda por nombre ingresado");
        jbBuscar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbBuscar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 51, 102));
        jLabel7.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Altura:");

        jtAltura.setBackground(new java.awt.Color(204, 204, 255));
        jtAltura.setFont(new java.awt.Font("Dubai", 1, 10)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(102, 0, 204));
        jtAltura.setToolTipText("Altura de paciente");
        jtAltura.setMinimumSize(new java.awt.Dimension(25, 25));
        jtAltura.setName(""); // NOI18N
        jtAltura.setPreferredSize(new java.awt.Dimension(25, 25));
        jtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAlturaFocusLost(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 51, 102));
        jLabel8.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Peso Actual:");

        jtPesoActual.setBackground(new java.awt.Color(204, 204, 255));
        jtPesoActual.setFont(new java.awt.Font("Dubai", 1, 10)); // NOI18N
        jtPesoActual.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoActual.setToolTipText("Peso actual de paciente");
        jtPesoActual.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoActual.setName(""); // NOI18N
        jtPesoActual.setPreferredSize(new java.awt.Dimension(25, 25));
        jtPesoActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPesoActualFocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 51, 102));
        jLabel9.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Peso Buscado:");

        jtPesoBuscado.setBackground(new java.awt.Color(204, 204, 255));
        jtPesoBuscado.setFont(new java.awt.Font("Dubai", 1, 10)); // NOI18N
        jtPesoBuscado.setForeground(new java.awt.Color(102, 0, 204));
        jtPesoBuscado.setToolTipText("Peso buscado del paciente");
        jtPesoBuscado.setMinimumSize(new java.awt.Dimension(25, 25));
        jtPesoBuscado.setName(""); // NOI18N
        jtPesoBuscado.setPreferredSize(new java.awt.Dimension(25, 25));
        jtPesoBuscado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPesoBuscadoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtPacientes.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtPacientes.setForeground(new java.awt.Color(0, 153, 153));
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jtPacientes.setToolTipText("Listado de Pacientes");
        jtPacientes.setFillsViewportHeight(true);
        jtPacientes.setGridColor(new java.awt.Color(0, 47, 78));
        jtPacientes.setSelectionForeground(new java.awt.Color(204, 0, 153));
        jtPacientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtPacientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPacientesFocusGained(evt);
            }
        });
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPacientesMouseClicked(evt);
            }
        });
        jSTabla.setViewportView(jtPacientes);

        jbGuardar.setBackground(new java.awt.Color(0, 47, 78));
        jbGuardar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar30.gif"))); // NOI18N
        jbGuardar.setToolTipText("Guardar paciente");
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

        jbNuevo.setBackground(new java.awt.Color(0, 47, 78));
        jbNuevo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevo30.gif"))); // NOI18N
        jbNuevo.setToolTipText("Nuevo paciente");
        jbNuevo.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbNuevo.setMaximumSize(new java.awt.Dimension(81, 24));
        jbNuevo.setMinimumSize(new java.awt.Dimension(81, 24));
        jbNuevo.setName(""); // NOI18N
        jbNuevo.setPreferredSize(new java.awt.Dimension(81, 28));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 47, 78));
        jbSalir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salida30.gif"))); // NOI18N
        jbSalir.setToolTipText("Cerrar ventana");
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

        jbEliminar.setBackground(new java.awt.Color(0, 47, 78));
        jbEliminar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eliminar30.gif"))); // NOI18N
        jbEliminar.setToolTipText("Eliminar paciente");
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

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Lista de Paciente");
        jLRotulo1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSTabla)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(600, 100, 493, 701);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
            if(pacienteActual==null){
                pacienteActual=new Pacientes(nombre, edad, alturaP, pesoActual, pesoBuscado);
                pacServ.guardarPaciente(pacienteActual);
            }else{
                pacienteActual.setNombre(nombre);
                pacienteActual.setEdad(edad);
                pacienteActual.setAltura(alturaP);
                pacienteActual.setPesoActual(pesoActual);
                pacienteActual.setPesoBuscado(pesoBuscado);
                pacServ.modificarPaciente(pacienteActual);
            }
            cargarDatos();
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"Por favor, verifique el formato de los datos");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
        pacienteActual=null;
        jtPacientes.enable(true);        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        jtPacientes.enable(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if(pacienteActual!=null){
            pacServ.eliminarPaciente(pacienteActual.getNroPaciente());
            pacienteActual=null;
            limpiarCampos();
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(this,"Debe haber un paciente seleccionado para eliminar");            
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    try{
        String nomb= jtNombre.getText(); 
        pacienteActual=pacServ.buscarPacientePorNombre(nomb);
        if(pacienteActual!=null){
                jtNroPaciente.setText(""+pacienteActual.getNroPaciente());
                jtNombre.setText(pacienteActual.getNombre());
                nombre=pacienteActual.getNombre();
                jtEdad.setText(""+pacienteActual.getEdad());
                edad=pacienteActual.getEdad();
                jtAltura.setText(""+pacienteActual.getAltura());
                alturaP=pacienteActual.getAltura();
                jtPesoActual.setText(""+pacienteActual.getPesoActual());
                pesoActual= pacienteActual.getPesoActual();
                jtPesoBuscado.setText(""+pacienteActual.getPesoBuscado());   
                pesoBuscado=pacienteActual.getPesoBuscado();   
        }else{
            JOptionPane.showMessageDialog(this,"El paciente que busca no existe");
            jtNroPaciente.requestFocus();
        }        
        jtPacientes.enable(true);
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"El DNI debe ser un valor numérico");
        jtNroPaciente.requestFocus();
    }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMouseClicked
        int filaElegida=jtPacientes.getSelectedRow();
        if(filaElegida!=-1){
            Integer id= (Integer)jtPacientes.getValueAt(filaElegida, 0);  
            pacienteActual=pacServ.buscarPaciente(id);
            if(pacienteActual!=null){
                jtNroPaciente.setText(""+pacienteActual.getNroPaciente());
                jtNombre.setText(pacienteActual.getNombre());
                nombre=pacienteActual.getNombre();
                jtEdad.setText(""+pacienteActual.getEdad());
                edad=pacienteActual.getEdad();
                jtAltura.setText(""+pacienteActual.getAltura());
                alturaP=pacienteActual.getAltura();
                jtPesoActual.setText(""+pacienteActual.getPesoActual());
                pesoActual= pacienteActual.getPesoActual();
                jtPesoBuscado.setText(""+pacienteActual.getPesoBuscado());   
                pesoBuscado=pacienteActual.getPesoBuscado();                  
            }
        }
    }//GEN-LAST:event_jtPacientesMouseClicked

    private void jtPacientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPacientesFocusGained
        jbBuscar.requestFocus();
    }//GEN-LAST:event_jtPacientesFocusGained

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if(jtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Por favor, ingrese el nombre completo del paciente");
            return;
        }
        nombre= jtNombre.getText();
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEdadFocusLost
        try{
            if(jtEdad.getText().isEmpty()||Integer.parseInt(jtEdad.getText())>150){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese la edad del paciente");
                return;
            }
            edad= Integer.parseInt(jtEdad.getText());
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"La edad debe ser un valor numérico");
            jtEdad.requestFocus();
        }
    }//GEN-LAST:event_jtEdadFocusLost

    private void jtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAlturaFocusLost
        try{
            if(jtEdad.getText().isEmpty()||Integer.parseInt(jtEdad.getText())>150){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese la altura del paciente");
                return;
            }
            alturaP= Double.parseDouble(jtAltura.getText()); 
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"La altura debe ser un valor numérico");
            jtAltura.requestFocus();
        }
    }//GEN-LAST:event_jtAlturaFocusLost

    private void jtPesoActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoActualFocusLost
        try{
            if(jtEdad.getText().isEmpty()||Integer.parseInt(jtEdad.getText())>150){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese el peso actual del paciente");
                return;
            }
            pesoActual= Double.parseDouble(jtPesoActual.getText()); 
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"El peso debe ser un valor numérico");
            jtPesoActual.requestFocus();
        }
    }//GEN-LAST:event_jtPesoActualFocusLost

    private void jtPesoBuscadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesoBuscadoFocusLost
        try{
            if(jtEdad.getText().isEmpty()||Integer.parseInt(jtEdad.getText())>150){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese el peso buscado del paciente");
                return;
            }
            pesoBuscado= Double.parseDouble(jtPesoBuscado.getText());
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"El peso debe ser un valor numérico");
            jtPesoBuscado.requestFocus();
        }
    }//GEN-LAST:event_jtPesoBuscadoFocusLost
    
    private void limpiarCampos(){  
        jtNroPaciente.setText("");
        jtEdad.setText("");
        jtNombre.setText("");
        jtAltura.setText("");
        jtPesoActual.setText("");
        jtPesoBuscado.setText("");
    }     
    
    private void armarCabecera(){     
        modelo.addColumn("nroPaciente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Altura");
        modelo.addColumn("Peso Actual");
        modelo.addColumn("Peso Buscado");
        jtPacientes.setModel(modelo);
    }

    private void cargarDatos(){
        int filas=jtPacientes.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }
        for (Pacientes paciente : pacServ.listarPacientes()) {
            modelo.addRow(new Object[]{paciente.getNroPaciente(), paciente.getNombre(), paciente.getEdad(),paciente.getAltura(),paciente.getPesoActual(),paciente.getPesoBuscado()});          
        }
        jtPacientes.enable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNroPaciente;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoBuscado;
    // End of variables declaration//GEN-END:variables
}
