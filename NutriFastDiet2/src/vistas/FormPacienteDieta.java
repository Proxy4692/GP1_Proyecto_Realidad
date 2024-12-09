package vistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Dietas;
import modelo.Pacientes;
import servicios.DietasService;
import servicios.PacientesService;

public class FormPacienteDieta extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };

    private PacientesService pacServ=new PacientesService();
    private Pacientes pacienteActual=null;
    private DietasService dietServ=new DietasService();
    private Dietas dietaActual=null;

    
    private Integer codDieta;   
    private Integer nroPaciente;   
    private Integer cantMenu= 3;   
    private String nombreD= "Dieta Lunar";
    private String kcalSelec = "8050k-Medio";
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private Integer kcalDia;
    private Integer kcalCol;
    
    public FormPacienteDieta() {
        initComponents();
        armarCabecera(); 
        cargarDatos();            
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jSTabla = new javax.swing.JScrollPane();
        jtKcalSemanal = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalir = new javax.swing.JButton();
        jcPaciente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLRotulo1 = new javax.swing.JLabel();
        jLNombreDieta = new javax.swing.JLabel();
        jtNombreDieta = new javax.swing.JTextField();
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
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(480, 600));

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Elección de Kcal diarias");
        jLRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtKcalSemanal.setBackground(new java.awt.Color(153, 153, 0));
        jtKcalSemanal.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtKcalSemanal.setForeground(new java.awt.Color(0, 0, 0));
        jtKcalSemanal.setModel(new javax.swing.table.DefaultTableModel(
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
        jtKcalSemanal.setToolTipText("Kcalorías por Semana");
        jtKcalSemanal.setEnabled(false);
        jtKcalSemanal.setFillsViewportHeight(true);
        jtKcalSemanal.setGridColor(new java.awt.Color(0, 47, 78));
        jtKcalSemanal.setSelectionForeground(new java.awt.Color(204, 0, 153));
        jtKcalSemanal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtKcalSemanal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtKcalSemanalFocusGained(evt);
            }
        });
        jtKcalSemanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtKcalSemanalMouseClicked(evt);
            }
        });
        jtKcalSemanal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtKcalSemanalPropertyChange(evt);
            }
        });
        jSTabla.setViewportView(jtKcalSemanal);

        jbSalir.setBackground(new java.awt.Color(204, 204, 0));
        jbSalir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salida30.gif"))); // NOI18N
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

        jcPaciente.setBackground(new java.awt.Color(0, 153, 153));
        jcPaciente.setEditable(true);
        jcPaciente.setToolTipText("Elija un paciente guardado");
        jcPaciente.setMinimumSize(new java.awt.Dimension(25, 25));
        jcPaciente.setPreferredSize(new java.awt.Dimension(25, 25));
        jcPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcPacienteItemStateChanged(evt);
            }
        });
        jcPaciente.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jcPacienteInputMethodTextChanged(evt);
            }
        });
        jcPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPacienteActionPerformed(evt);
            }
        });
        jcPaciente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcPacientePropertyChange(evt);
            }
        });
        jcPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcPacienteKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Seleccione el paciente:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Selección de Dieta");
        jLRotulo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNombreDieta.setBackground(new java.awt.Color(255, 51, 102));
        jLNombreDieta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombreDieta.setForeground(new java.awt.Color(102, 0, 0));
        jLNombreDieta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombreDieta.setText("Nombre de la dieta:");
        jLNombreDieta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtNombreDieta.setEditable(false);
        jtNombreDieta.setBackground(new java.awt.Color(153, 255, 204));
        jtNombreDieta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jtNombreDieta.setForeground(new java.awt.Color(102, 0, 204));
        jtNombreDieta.setText("Dieta Lunar");
        jtNombreDieta.setToolTipText("Nombre de la dieta");
        jtNombreDieta.setEnabled(false);
        jtNombreDieta.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombreDieta.setName(""); // NOI18N
        jtNombreDieta.setPreferredSize(new java.awt.Dimension(25, 25));

        jLCantMenu.setBackground(new java.awt.Color(255, 51, 102));
        jLCantMenu.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLCantMenu.setForeground(new java.awt.Color(102, 0, 0));
        jLCantMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCantMenu.setText("Cantidad de menus diarios:");
        jLCantMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSCantMenu.setToolTipText("Ingrese un valor del 3 al 7");
        jSCantMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSCantMenuStateChanged(evt);
            }
        });

        jLKcalPorSemana.setBackground(new java.awt.Color(255, 51, 102));
        jLKcalPorSemana.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLKcalPorSemana.setForeground(new java.awt.Color(102, 0, 0));
        jLKcalPorSemana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLKcalPorSemana.setText("Kcal por semana:");
        jLKcalPorSemana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jCKcalS.setBackground(new java.awt.Color(153, 0, 153));
        jCKcalS.setToolTipText("Ingrese un valor de kcal semanales");
        jCKcalS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCKcalSItemStateChanged(evt);
            }
        });

        jLFechaIni.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaIni.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaIni.setForeground(new java.awt.Color(102, 0, 0));
        jLFechaIni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaIni.setText("Fecha Inicial");

        jtFechaIni.setBackground(new java.awt.Color(255, 204, 204));
        jtFechaIni.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaIni.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaIni.setToolTipText("");
        jtFechaIni.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaIni.setName(""); // NOI18N
        jtFechaIni.setPreferredSize(new java.awt.Dimension(25, 25));

        jdFechaIni.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaIni.setToolTipText("Seleccione una fecha de inicio");
        jdFechaIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaIniPropertyChange(evt);
            }
        });

        jLFechaFin.setBackground(new java.awt.Color(255, 51, 102));
        jLFechaFin.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLFechaFin.setForeground(new java.awt.Color(102, 0, 0));
        jLFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFechaFin.setText("Fecha Final");

        jtFechaFin.setBackground(new java.awt.Color(255, 204, 204));
        jtFechaFin.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaFin.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaFin.setToolTipText("");
        jtFechaFin.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaFin.setName(""); // NOI18N
        jtFechaFin.setPreferredSize(new java.awt.Dimension(25, 25));

        jdFechaFin.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaFin.setToolTipText("Seleccione una fecha de fin");
        jdFechaFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaFinPropertyChange(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNombreDieta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(9, 9, 9)
                                        .addComponent(jcPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCantMenu)
                                        .addGap(3, 3, 3)
                                        .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLKcalPorSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140)
                                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLRotulo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreDieta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSCantMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantMenu)
                    .addComponent(jCKcalS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLKcalPorSemana))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLFechaFin))
                    .addComponent(jdFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLFechaIni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLRotulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        setBounds(600, 100, 514, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtKcalSemanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtKcalSemanalMouseClicked

    }//GEN-LAST:event_jtKcalSemanalMouseClicked

    private void jtKcalSemanalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtKcalSemanalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtKcalSemanalFocusGained

    private void jcPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPacienteActionPerformed
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_jcPacienteActionPerformed

    private void jcPacientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcPacientePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jcPacientePropertyChange

    private void jcPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcPacienteItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jcPacienteItemStateChanged

    private void jcPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcPacienteKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcPacienteKeyPressed

    private void jcPacienteInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jcPacienteInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcPacienteInputMethodTextChanged

    private void jtKcalSemanalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtKcalSemanalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtKcalSemanalPropertyChange

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try{
            if(dietaActual==null){
                dietaActual=new Dietas(codDieta, nroPaciente, nombreD, fechaIni, fechaFin, cantMenu, kcalSelec);
                dietServ.guardarDieta(dietaActual);
            }else{
                dietaActual.setCodDieta(codDieta);
                dietaActual.setNroPaciente(nroPaciente);
                dietaActual.setNombreD(nombreD);
                dietaActual.setFechaIni(fechaIni);
                dietaActual.setFechaFin(fechaFin);               
                dietaActual.setCantMenu(cantMenu);
                dietaActual.setKcalSelec(kcalSelec);
                dietServ.modificarDieta(dietaActual);
            }
            cargarDatos();
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"Verifique el formato de los datos");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if(dietaActual!=null){
            dietServ.eliminarDieta(dietaActual.getCodDieta());
            limpiarCampos();
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay dieta seleccionada para eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jCKcalSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCKcalSItemStateChanged
        kcalSelec= jCKcalS.toString();
        seleccionKcal();
    }//GEN-LAST:event_jCKcalSItemStateChanged

    private void jSCantMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSCantMenuStateChanged
        cantMenu= (Integer)jSCantMenu.getValue();
        seleccionKcal();
    }//GEN-LAST:event_jSCantMenuStateChanged

    private void jdFechaIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaIniPropertyChange
        if(evt.getPropertyName().equals("date")){
            if(jdFechaIni.getDate()!=null){
                java.util.Date fechaVieja= jdFechaIni.getDate();
                long tiempo= fechaVieja.getTime();
                java.sql.Date fecha= new java.sql.Date(tiempo);
                fechaIni= fecha.toLocalDate();
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                jtFechaIni.setText(fechaIni.format(dtf));
            }else{
                JOptionPane.showMessageDialog(this,"INGRESE UNA FECHA VALIDA");
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
                fechaFin= fecha.toLocalDate();
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                jtFechaFin.setText(fechaFin.format(dtf));  
            }else{
                JOptionPane.showMessageDialog(this,"INGRESE UNA FECHA VALIDA");
                jdFechaFin.requestFocus(); 
            }        
        }
    }//GEN-LAST:event_jdFechaFinPropertyChange
    
    private void seleccionKcal(){
        switch(kcalSelec){ 
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
        int filas=modelo.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }        
        for(int f=1;f>7;f++){
            switch(f){ 
                case 1:
                    modelo.addRow(new Object[]{"Lunes",dietServ.kcalSemanal(kcalCol,1)}); 
                    break;
                case 2:
                    if(cantMenu!=3){
                        modelo.addRow(new Object[]{"Martes",dietServ.kcalSemanal(kcalCol,1)}); 
                    }
                    break;
                case 3:
                    if(cantMenu!=4){
                        modelo.addRow(new Object[]{"Miercoles",dietServ.kcalSemanal(kcalCol,1)});
                    } 
                    break;
                case 4:
                    if(cantMenu!=3){
                        modelo.addRow(new Object[]{"Jueves",dietServ.kcalSemanal(kcalCol,1)});
                    } 
                    break;
                case 5:
                    modelo.addRow(new Object[]{"Viernes",dietServ.kcalSemanal(kcalCol,1)}); 
                    break;
                case 6:
                    if(cantMenu==6){
                        modelo.addRow(new Object[]{"Sábado",dietServ.kcalSemanal(kcalCol,1)});
                    } 
                    break;
                case 7:
                    if(cantMenu==6||cantMenu==7){
                        modelo.addRow(new Object[]{"Domingo",dietServ.kcalSemanal(kcalCol,1)});
                    } 
                    break;
            }
        } 
    }
    
    private void armarCabecera(){     
        modelo.addColumn("Dia");
        modelo.addColumn("Kcal diaria");
        jtKcalSemanal.setModel(modelo);
        for (Pacientes item:pacServ.listarPacientes()){
            jcPaciente.addItem(item);
        }
    }

    private void cargarDatos(){
        pacienteActual=(Pacientes)jcPaciente.getSelectedItem();
        if(dietaActual!=null){
            nroPaciente= pacienteActual.getNroPaciente();
        }

        SpinnerNumberModel cm = new SpinnerNumberModel();
        cm.setMaximum(7);
        cm.setMinimum(3);
        cm.setStepSize(1);
        jSCantMenu.setModel(cm);
        
        
        jCKcalS.addItem("5850k-MuyBajo");
        jCKcalS.addItem("7000k-Bajo");
        jCKcalS.addItem("8050k-Medio");
        jCKcalS.addItem("9450k-Alto");
        jCKcalS.addItem("10500k-MuyAlto");
        
        seleccionKcal();
        if(dietaActual!=null){
            dietaActual= dietServ.buscarDietaPorPaciente(pacienteActual.getNroPaciente());
            codDieta= dietaActual.getCodDieta();
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            fechaIni= dietaActual.getFechaIni();
            jtFechaIni.setText(fechaIni.format(dtf)); 
            fechaFin= dietaActual.getFechaFin();
            jtFechaFin.setText(fechaFin.format(dtf));  
            jSCantMenu.setValue(dietaActual.getCantMenu());
            kcalSelec= dietaActual.getKcalSelec();
        }else{
            jSCantMenu.setValue(3);
            jCKcalS.setSelectedItem(new String("8050k-Medio"));
        }

        
    }
    
    private void limpiarCampos(){  
        jcPaciente=null;
        pacienteActual=null;
        dietaActual= null;
        jtFechaIni=null;
        jtFechaFin=null;
        jSCantMenu.setValue(3);
        jCKcalS.setSelectedItem(new String("8050k-Medio"));
    }          
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCKcalS;
    private javax.swing.JLabel jLCantMenu;
    private javax.swing.JLabel jLFechaFin;
    private javax.swing.JLabel jLFechaIni;
    private javax.swing.JLabel jLKcalPorSemana;
    private javax.swing.JLabel jLNombreDieta;
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSCantMenu;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Pacientes> jcPaciente;
    private com.toedter.calendar.JDateChooser jdFechaFin;
    private com.toedter.calendar.JDateChooser jdFechaIni;
    private javax.swing.JTextField jtFechaFin;
    private javax.swing.JTextField jtFechaIni;
    private javax.swing.JTable jtKcalSemanal;
    private javax.swing.JTextField jtNombreDieta;
    // End of variables declaration//GEN-END:variables
}
