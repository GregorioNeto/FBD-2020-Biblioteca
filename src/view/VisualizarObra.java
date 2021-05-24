/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.CategoriaDAO;
import DAO.*;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import Main.TelaBibliotecario;
import Main.main;
import static Main.main.obraEditar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Editora;
import model.*;
import model.Obra;

/**
 *
 * @author Jorge Lucas
 */
public class VisualizarObra extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public VisualizarObra() throws SQLException {
        initComponents();
        atualizarCombo();
        definirCombo();
        preencherCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLAutor = new javax.swing.JLabel();
        VOLUME = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jTFAutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jBCancelar = new javax.swing.JButton();
        jTFVolume = new javax.swing.JFormattedTextField();
        painelbranco = new javax.swing.JPanel();
        cadatrodelivro = new javax.swing.JLabel();
        livroicon = new javax.swing.JLabel();
        jCBCategoria = new javax.swing.JComboBox<>();
        jCBEditora = new javax.swing.JComboBox<>();
        jLEditora = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jTFIsbn = new javax.swing.JFormattedTextField();
        jLIsbn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLTitulo.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLTitulo.setText("TÍTULO");

        jLAutor.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLAutor.setText("AUTOR(A)");

        VOLUME.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        VOLUME.setText("VOLUME");

        jLDescricao.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLDescricao.setText("DESCRIÇÃO DO LIVRO");

        jTFTitulo.setEditable(false);
        jTFTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFTituloMouseClicked(evt);
            }
        });
        jTFTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTituloActionPerformed(evt);
            }
        });
        jTFTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTituloKeyPressed(evt);
            }
        });

        jTFAutor.setEditable(false);
        jTFAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFAutorMouseClicked(evt);
            }
        });
        jTFAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAutorKeyPressed(evt);
            }
        });

        jTADescricao.setEditable(false);
        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jTADescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTADescricaoMouseClicked(evt);
            }
        });
        jTADescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTADescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTADescricao);

        jBCancelar.setText("Voltar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jTFVolume.setEditable(false);
        jTFVolume.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        painelbranco.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout painelbrancoLayout = new javax.swing.GroupLayout(painelbranco);
        painelbranco.setLayout(painelbrancoLayout);
        painelbrancoLayout.setHorizontalGroup(
            painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        painelbrancoLayout.setVerticalGroup(
            painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cadatrodelivro.setBackground(new java.awt.Color(255, 255, 255));
        cadatrodelivro.setFont(new java.awt.Font("Ananda Black", 0, 36)); // NOI18N
        cadatrodelivro.setForeground(new java.awt.Color(255, 255, 255));
        cadatrodelivro.setText("    Visualizar Obra");
        cadatrodelivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        livroicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-book.png"))); // NOI18N

        jCBCategoria.setEditable(true);
        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ..." }));

        jCBEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ..." }));

        jLEditora.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLEditora.setText("EDITORA");

        jLCategoria.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLCategoria.setText("CATEGORIA");

        jTFIsbn.setEditable(false);
        jTFIsbn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLIsbn.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLIsbn.setText("ISBN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelbranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(cadatrodelivro, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(livroicon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLDescricao))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCBEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLAutor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLEditora)
                        .addGap(203, 203, 203)
                        .addComponent(jLCategoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLIsbn)
                        .addGap(222, 222, 222)
                        .addComponent(VOLUME))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jBCancelar)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(cadatrodelivro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(livroicon)))
                .addGap(18, 18, 18)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VOLUME)
                    .addComponent(jLIsbn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEditora)
                    .addComponent(jLCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addContainerGap())
            .addComponent(painelbranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void preencherCampos(){
        jTFTitulo.setText(obraEditar.getTitulo());
        jTFAutor.setText(obraEditar.getAutor());
        jTFIsbn.setText(""+obraEditar.getIsbn());
        jTFVolume.setText(""+obraEditar.getVolume());
        jTADescricao.setText(obraEditar.getDescricaoDaObra());
        
        jTFTitulo.setEnabled(false);
        jTFAutor.setEnabled(false);
        jTFIsbn.setEnabled(false);
        jTFVolume.setEnabled(false);
        jTADescricao.setEnabled(false);
    }
    
    private void definirCombo() throws SQLException{
        Connection con = Conexao.AbrirConexao();
        String nome_categoria = new CategoriaDAO(con).receberNomeCategoria(main.obraEditar.getCategoria());
        String nome_editora = new EditoraDAO(con).receberNomeEditora(main.obraEditar.getEditora());
        
        jCBCategoria.setSelectedItem((String)nome_categoria);
        jCBEditora.setSelectedItem((String)nome_editora);
        
        Conexao.FehcarConexao(con);
    }
    private void atualizarCombo() throws SQLException{
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql1 = new CategoriaDAO(con);
        EditoraDAO sql2 = new EditoraDAO(con);
        
        List<Categoria> lista1 = new ArrayList<>();
        List<Editora> lista2 = new ArrayList<>();
        
        lista1 = sql1.listarComboCategoria();
        lista2 = sql2.listarComboEditora();
        
        for(Categoria c: lista1){
            jCBCategoria.addItem(c.getNome());
        }
        
        for(Editora e: lista2){
            jCBEditora.addItem(e.getNome());
        }
        
        jCBCategoria.setEnabled(false);
        jCBEditora.setEnabled(false);
        
        Conexao.FehcarConexao(con);
        
    }
    
    private void jTFTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTituloActionPerformed
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloActionPerformed

    private void jTFTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTituloKeyPressed
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloKeyPressed

    private void jTFAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAutorKeyPressed
        jTFAutor.setBackground(Color.white);
    }//GEN-LAST:event_jTFAutorKeyPressed

    private void jTADescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTADescricaoKeyPressed
        jTADescricao.setBackground(Color.white);
    }//GEN-LAST:event_jTADescricaoKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        try {
            new TelaBibliotecario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizarObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFTituloMouseClicked
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloMouseClicked

    private void jTFAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFAutorMouseClicked
        jTFAutor.setBackground(Color.white);
    }//GEN-LAST:event_jTFAutorMouseClicked

    private void jTADescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTADescricaoMouseClicked
        jTADescricao.setBackground(Color.white);
    }//GEN-LAST:event_jTADescricaoMouseClicked

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
            java.util.logging.Logger.getLogger(VisualizarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizarObra().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VisualizarObra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VOLUME;
    private javax.swing.JLabel cadatrodelivro;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JComboBox<String> jCBEditora;
    private javax.swing.JLabel jLAutor;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLEditora;
    private javax.swing.JLabel jLIsbn;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JFormattedTextField jTFIsbn;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JFormattedTextField jTFVolume;
    private javax.swing.JLabel livroicon;
    private javax.swing.JPanel painelbranco;
    // End of variables declaration//GEN-END:variables
}