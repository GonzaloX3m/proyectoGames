package cl.notchEnterprise.gui;
import cl.notchEnterprise.model.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Emilio
 */
public class App extends javax.swing.JFrame {
    private Data d;

    public App() {//constructos de la clase JFrame
        try {
            initComponents(); // inicializacion de los componentes: botones, label, campo de texto...
            setLocationRelativeTo(null);//centrado
            d=new Data(); //crear un objeto del tipo data.
        } catch (SQLException ex) { //catch de errores de tipo sqlException.
            JOptionPane.showMessageDialog(this,
                    "Error de Conexion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        cargarTablas(); //? Respuesta: Porque el programa es PERSISTENTE: Tiene base de datos. Por lo tanto: cargarTablas()..
        //se rescata los datos de la base de datos... Es la primera descarga de los datos.
        habilitarCrudJuegos(); //despues se verá.
        cargarComboGeneros(); //despues se verá por qué.
        txtNomGen.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomGen = new javax.swing.JTextField();
        btnCreGen = new javax.swing.JButton();
        txtIDGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActGen = new javax.swing.JButton();
        btnEliGen = new javax.swing.JButton();
        btnCanGen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabGen = new javax.swing.JTable();
        txtBusGen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnGenerarJuego = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDJuego = new javax.swing.JTextField();
        txtNombreJuego = new javax.swing.JTextField();
        txtStockJuego = new javax.swing.JSpinner();
        txtPrecioJuego = new javax.swing.JTextField();
        cboGeneros = new javax.swing.JComboBox<>();
        btnEliminarJuego = new javax.swing.JButton();
        btnActualizarJuego = new javax.swing.JButton();
        btnCancelarJuego = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabJuegos = new javax.swing.JTable();
        txtBusJuego = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("ID");

        btnCreGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861162_save_32.png"))); // NOI18N
        btnCreGen.setText("Crear Genero");
        btnCreGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreGenActionPerformed(evt);
            }
        });

        txtIDGen.setEditable(false);
        txtIDGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDGenActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        btnActGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861318_Update.png"))); // NOI18N
        btnActGen.setText("Actualizar Genero");
        btnActGen.setEnabled(false);
        btnActGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActGenActionPerformed(evt);
            }
        });

        btnEliGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861408_delete.png"))); // NOI18N
        btnEliGen.setText("Eliminar Genero");
        btnEliGen.setEnabled(false);
        btnEliGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliGenActionPerformed(evt);
            }
        });

        btnCanGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861245_undo.png"))); // NOI18N
        btnCanGen.setText("Cancelar");
        btnCanGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanGenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCanGen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActGen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btnCreGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomGen))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDGen)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnCanGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliGen)
                .addContainerGap())
        );

        tabGen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabGenMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabGen);

        txtBusGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusGenActionPerformed(evt);
            }
        });
        txtBusGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusGenKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(txtBusGen))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtBusGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CRUD Genero", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        btnGenerarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861162_save_32.png"))); // NOI18N
        btnGenerarJuego.setText("Crear Juego");
        btnGenerarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarJuegoActionPerformed(evt);
            }
        });

        jLabel7.setText("Genero:");

        jLabel6.setText("Precio:");

        jLabel5.setText("Stock:");

        jLabel4.setText("Nombre:");

        jLabel3.setText("ID:");

        txtIDJuego.setEditable(false);
        txtIDJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDJuegoActionPerformed(evt);
            }
        });

        txtNombreJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreJuegoActionPerformed(evt);
            }
        });

        txtStockJuego.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnEliminarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861408_delete.png"))); // NOI18N
        btnEliminarJuego.setText("Eliminar Juego");
        btnEliminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarJuegoActionPerformed(evt);
            }
        });

        btnActualizarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861318_Update.png"))); // NOI18N
        btnActualizarJuego.setText("Actualizar Juego");
        btnActualizarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarJuegoActionPerformed(evt);
            }
        });

        btnCancelarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/notchEnterprise/resource/1462861245_undo.png"))); // NOI18N
        btnCancelarJuego.setText("Cancelar");
        btnCancelarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGenerarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDJuego)
                            .addComponent(txtNombreJuego)
                            .addComponent(txtStockJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtPrecioJuego)
                            .addComponent(cboGeneros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnEliminarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStockJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarJuego)
                .addContainerGap())
        );

        tabJuegos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabJuegosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabJuegos);

        txtBusJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusJuegoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(txtBusJuego))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(txtBusJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CRUD Juego", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDGenActionPerformed
    /*
    Dudas especificas en el codigo?: Para abordarlas de manera concreta. 
    Se abordaran los temas.
    1.- Data: Las query. 
            Duda:¿Por qupe se usan listas.?
            Duda:¿?
            Duda:¿?
    2.- Table Model.
    3.- Componentes de la GUI. En general.
    */
    private void btnCreGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreGenActionPerformed
        try {
            d.crearGenero(txtNomGen.getText());

            //actualiza tabla
            try {
                cargarTablaGeneros(d.getGeneros());
                cargarComboGeneros();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                "Error al cargar tabla generos",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }

            JOptionPane.showMessageDialog(this,
            "Creacion Ok",
            "Ok",
            JOptionPane.INFORMATION_MESSAGE);
            txtNomGen.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al crear genero",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreGenActionPerformed

    private void txtBusGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusGenActionPerformed

    private void txtBusGenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusGenKeyReleased
        try {
            String filtro=txtBusGen.getText();
            List<Genero> lista=d.buscarGenero(filtro);
            cargarTablaGeneros(lista);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al al buscar genero",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBusGenKeyReleased

    private void tabGenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGenMouseReleased
        if(evt.getClickCount()==2){
            try {
                int fila=tabGen.getSelectedRow();
                String strId=tabGen.getValueAt(fila, 0).toString();
                int id=Integer.parseInt(strId);
                Genero g=d.getGenero(id);

                txtIDGen.setText(Integer.toString(g.getId()));
                txtNomGen.setText(g.getNombre());

                /*Habilitar botones*/
                btnActGen.setEnabled(true);
                btnEliGen.setEnabled(true);
                btnCreGen.setEnabled(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                "Error al seleccionar fila de tabla genero",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_tabGenMouseReleased

    private void btnCanGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanGenActionPerformed
        txtIDGen.setText(null);
        txtNomGen.setText(null);

        btnCreGen.setEnabled(true);
        btnActGen.setEnabled(false);
        btnEliGen.setEnabled(false);

        txtNomGen.requestFocus();
    }//GEN-LAST:event_btnCanGenActionPerformed

    private void btnEliGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliGenActionPerformed
        try {
            String strId=txtIDGen.getText();
            int id= Integer.parseInt(strId);
            d.eliminarGenero(id);
            cargarComboGeneros();
            btnCanGen.doClick();

            //actualizar tabla
            try {
                cargarTablaGeneros(d.getGeneros());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                "Error al cargar tabla generos",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }

            //confirmacion
            JOptionPane.showMessageDialog(this,
            "Eliminar genero Ok",
            "Ok",
            JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al eliminar genero",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnEliGenActionPerformed

    private void btnActGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActGenActionPerformed
        try {
            String strId=txtIDGen.getText();
            int id=Integer.parseInt(strId);
            String nombre=txtNomGen.getText();

            Genero nuevo=new Genero(id,nombre);
            d.actualizarGenero(nuevo);

            //actualizar tabla
            try {
                cargarTablaGeneros(d.getGeneros());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                "Error al cargar tabla generos",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }

            //confirmacion
            JOptionPane.showMessageDialog(this,
            "Actualizar genero Ok",
            "Ok",
            JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al actualizar genero",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActGenActionPerformed

    private void txtIDJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDJuegoActionPerformed

    private void txtNombreJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreJuegoActionPerformed

    private void btnGenerarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarJuegoActionPerformed
        Juego nuevo=new Juego();
        nuevo.setNombre(txtNombreJuego.getText());

        String strPrecio=txtPrecioJuego.getText();
        int precio=Integer.parseInt(strPrecio);
        nuevo.setPrecio(precio);

        String strStock=txtStockJuego.getValue().toString();
        int stock=Integer.parseInt(strStock);
        nuevo.setStock(stock);

        Genero g=(Genero)cboGeneros.getSelectedItem();
        nuevo.setGenero(g.getId());

        try {
            d.crearJuego(nuevo);
            JOptionPane.showMessageDialog(this, "Juego creado");
            btnCancelarJuego.doClick();

            cargarTablaJuegos(d.getJuegos());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear Juego"+ex.getMessage());
        }
    }//GEN-LAST:event_btnGenerarJuegoActionPerformed

    private void tabJuegosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabJuegosMouseReleased
        if(evt.getClickCount()==2){
            try {
                int fila=tabJuegos.getSelectedRow();
                String strId=tabJuegos.getValueAt(fila, 0).toString();
                int id=Integer.parseInt(strId);
                Juego j=d.getJuego(id);

                txtIDJuego.setText(Integer.toString(j.getId()));
                txtNombreJuego.setText(j.getNombre());
                txtPrecioJuego.setText(Integer.toString(j.getPrecio()));
                txtStockJuego.setValue(j.getStock());

                Genero g=d.getGenero(j.getGenero());

                int indiceCbo=cboGeneros.getItemCount();
                for(int i=0; i<indiceCbo; i++){
                    String nombreItem=cboGeneros.getItemAt(i).toString();
                    if(nombreItem.equalsIgnoreCase(g.getNombre())){
                        cboGeneros.setSelectedIndex(i);
                    }
                }

                deshabilitarCrud();

            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabJuegosMouseReleased

    private void btnEliminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarJuegoActionPerformed
        try {
            String strId=txtIDJuego.getText();
            int id=Integer.parseInt(strId);
            d.eliminarJuego(id);
            limpiarCrudJuego();

            cargarTablaJuegos(d.getJuegos());
            btnCancelarJuego.doClick();

            JOptionPane.showMessageDialog(this,
            "Eliminar Juego Ok",
            "Ok",
            JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al eliminar juego",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarJuegoActionPerformed

    private void btnCancelarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarJuegoActionPerformed
        limpiarCrudJuego();
        habilitarCrudJuegos();
    }//GEN-LAST:event_btnCancelarJuegoActionPerformed

    private void btnActualizarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarJuegoActionPerformed
        try {
            String strId=txtIDJuego.getText();

            int id=Integer.parseInt(strId);
            String nombre=txtNombreJuego.getText();

            int precio=Integer.parseInt(txtPrecioJuego.getText());
            String strStock=txtStockJuego.getValue().toString();
            int stock=Integer.parseInt(strStock);

            Genero g=(Genero)cboGeneros.getSelectedItem();
            int idGenero=g.getId();

            Juego j=new Juego(id, nombre, stock, precio, idGenero);
            d.actualizarJuego(j);

            cargarTablaJuegos(d.getJuegos());
            btnCancelarJuego.doClick();

            JOptionPane.showMessageDialog(this,
            "Actualizar Juego Ok",
            "Ok",
            JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al actualizar juego",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarJuegoActionPerformed

    private void txtBusJuegoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusJuegoKeyReleased
        try {
            String filtro=txtBusJuego.getText();
            List<Juego> lista=d.buscarJuego(filtro);
            cargarTablaJuegos(lista);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al al buscar juego",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBusJuegoKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        String nombre=UIManager.getSystemLookAndFeelClassName();
        try {
            UIManager.setLookAndFeel(nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActGen;
    private javax.swing.JButton btnActualizarJuego;
    private javax.swing.JButton btnCanGen;
    private javax.swing.JButton btnCancelarJuego;
    private javax.swing.JButton btnCreGen;
    private javax.swing.JButton btnEliGen;
    private javax.swing.JButton btnEliminarJuego;
    private javax.swing.JButton btnGenerarJuego;
    private javax.swing.JComboBox cboGeneros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabGen;
    private javax.swing.JTable tabJuegos;
    private javax.swing.JTextField txtBusGen;
    private javax.swing.JTextField txtBusJuego;
    private javax.swing.JTextField txtIDGen;
    private javax.swing.JTextField txtIDJuego;
    private javax.swing.JTextField txtNomGen;
    private javax.swing.JTextField txtNombreJuego;
    private javax.swing.JTextField txtPrecioJuego;
    private javax.swing.JSpinner txtStockJuego;
    // End of variables declaration//GEN-END:variables

    private void cargarTablas() {
        try {
            cargarTablaGeneros(d.getGeneros());
            cargarTablaJuegos(d.getJuegos());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
            "Error al cargar tabla generos",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarTablaGeneros(List<Genero> generos) {
        TMGenero modelGenero=new TMGenero(generos);
        tabGen.setModel(modelGenero);
        tabGen.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabGen.getColumnModel().getColumn(1).setPreferredWidth(100);
    }

    private void cargarTablaJuegos(List<Juego> juegos){
        try {
            TMJuego_1 modelJuego=new TMJuego_1(juegos);
            tabJuegos.setModel(modelJuego);
            tabJuegos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabJuegos.getColumnModel().getColumn(1).setPreferredWidth(100);
        } catch (SQLException ex) {
            System.out.println("Error cargar tablas: "+ex.getMessage());
        }
    }

    private void cargarComboGeneros() {
        try {
            List<Genero> generos=d.getGeneros();
            cboGeneros.removeAllItems();

            for(Genero g: generos){
                cboGeneros.addItem(g);
            }
        } catch (SQLException ex) {
            System.out.println("Error cargar cboGenero: "+ex.getMessage());
        }
    }

    private void limpiarCrudJuego() {
        txtIDJuego.setText(null);
        txtNombreJuego.setText(null);
        txtPrecioJuego.setText(null);
        txtStockJuego.setValue(0);
        cboGeneros.setSelectedIndex(0);
        txtNombreJuego.requestFocus();
        btnGenerarJuego.setEnabled(true);
    }

    private void habilitarCrudJuegos(){
        btnGenerarJuego.setEnabled(true);
        btnActualizarJuego.setEnabled(false);
        btnCancelarJuego.setEnabled(true);
        btnEliminarJuego.setEnabled(false);
    }

    private void deshabilitarCrud() {
        btnGenerarJuego.setEnabled(false);
        btnActualizarJuego.setEnabled(true);
        btnEliminarJuego.setEnabled(true);
    }
}
