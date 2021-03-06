/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.AlunoDAO;
import DAO.Conexao;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import DAO.ObraDAO;
import Main.TelaBibliotecario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Editora;
import model.Livro;
import model.Obra;

/**
 *
 * @author Jorge Lucas
 */
public class CadastroLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() throws SQLException {
        initComponents();
        atualizarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        VOLUME = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        painelbranco = new javax.swing.JPanel();
        cadatrodelivro = new javax.swing.JLabel();
        livroicon = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jCBObra = new javax.swing.JComboBox<>();
        jDDataAquisicao = new com.toedter.calendar.JDateChooser();
        VOLUME1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLTitulo.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLTitulo.setText("OBRA");

        VOLUME.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        VOLUME.setText("DATA");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

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
        cadatrodelivro.setText(" Cadastro de Livro");
        cadatrodelivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        livroicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-book.png"))); // NOI18N

        jCBObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ..." }));

        jDDataAquisicao.setMaxSelectableDate(new Date());
        jDDataAquisicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDDataAquisicaoMouseClicked(evt);
            }
        });

        VOLUME1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        VOLUME1.setText("QUANTIDADE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelbranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jCBObra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(VOLUME1)
                                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jDDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jBCancelar)
                                .addGap(55, 55, 55)
                                .addComponent(jBCadastrar)))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VOLUME)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cadatrodelivro, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(livroicon)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTitulo)
                    .addComponent(VOLUME1)
                    .addComponent(VOLUME))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBCancelar))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void atualizarCombo() throws SQLException{
        Connection con = Conexao.AbrirConexao();
        ObraDAO sql = new ObraDAO(con);
        
        List<Obra> lista = new ArrayList<>();
        
        lista = sql.listarComboObra();
    
        for(Obra o: lista){
            jCBObra.addItem(o.getTitulo());
        }
        
        Conexao.FehcarConexao(con);
        
    }
    
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if( jTFQuantidade.getText().equals("") || jCBObra.getSelectedItem().equals("Selecione ...") || jDDataAquisicao.getDate() == null ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!",null,JOptionPane.ERROR_MESSAGE);
            if(jCBObra.getSelectedItem().equals("Selecione ..."))
                jCBObra.setBackground(new Color(255,102,102));
            if(jTFQuantidade.getText().equals(""))
                jTFQuantidade.setBackground(new Color(255,102,102));
            if(jDDataAquisicao.getDate() == null)
                jDDataAquisicao.setBackground(new Color(255,102,102));
        }else{
            Connection con = Conexao.AbrirConexao();
            
            
            try {
                int id_obra = new ObraDAO(con).receberIdObra((String) jCBObra.getSelectedItem());
                Livro livroAtual = new Livro(id_obra,jDDataAquisicao.getDate(),"disponivel");
                
                new LivroDAO(con).inserirLivros(livroAtual, Integer.parseInt(jTFQuantidade.getText()));
                JOptionPane.showMessageDialog(null, "Livros cadastrados com sucesso!");
                
                
            } catch (SQLException ex) {
                Logger.getLogger(CadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        try {
            new TelaBibliotecario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jDDataAquisicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDDataAquisicaoMouseClicked
        jDDataAquisicao.setBackground(Color.white);
    }//GEN-LAST:event_jDDataAquisicaoMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new CadastroLivro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VOLUME;
    private javax.swing.JLabel VOLUME1;
    private javax.swing.JLabel cadatrodelivro;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<String> jCBObra;
    private com.toedter.calendar.JDateChooser jDDataAquisicao;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JLabel livroicon;
    private javax.swing.JPanel painelbranco;
    // End of variables declaration//GEN-END:variables
}
