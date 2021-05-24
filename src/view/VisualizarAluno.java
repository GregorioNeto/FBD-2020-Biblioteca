/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.BibliotecarioDAO;
import DAO.Conexao;
import DAO.EmprestimoDAO;
import DAO.LivroDAO;
import DAO.ObraDAO;
import Main.TelaBibliotecario;
import Main.main;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import static Main.main.alunoEditar;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Emprestimo;
import model.Livro;

/**
 *
 * @author g_net
 */
public class VisualizarAluno extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarAluno
     */
    public VisualizarAluno() throws SQLException {
        initComponents();
        preencherCampos();
        inserirNaTabelaEmprestimo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelbranco = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jLAutor = new javax.swing.JLabel();
        jLIsbn = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jLQuantidade = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JFormattedTextField();
        jLQuantidade1 = new javax.swing.JLabel();
        jLDescricao1 = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JFormattedTextField();
        jCBCurso = new javax.swing.JComboBox<>();
        jTFTelefone = new javax.swing.JFormattedTextField();
        jPSenha = new javax.swing.JPasswordField();
        jDDatadeNascimento = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbEmprestimos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelbranco.setBackground(new java.awt.Color(255, 204, 102));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLNome.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLNome.setText("NOME:");

        jLAutor.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLAutor.setText("MATRÍCULA:");

        jLIsbn.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLIsbn.setText("CPF:");

        jLDescricao.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLDescricao.setText("TELEFONE:");

        jTFNome.setEditable(false);
        jTFNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNomeMouseClicked(evt);
            }
        });
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeKeyPressed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLQuantidade.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLQuantidade.setText("CURSO:");

        jTFMatricula.setEditable(false);
        jTFMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTFMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMatriculaActionPerformed(evt);
            }
        });

        jLQuantidade1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLQuantidade1.setText("DATA DE NASCIMENTO:");

        jLDescricao1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLDescricao1.setText("SENHA:");

        jTFCpf.setEditable(false);
        try {
            jTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCpfActionPerformed(evt);
            }
        });

        jCBCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Curso...", "Engenharia de Computação", "Engenharia de Software", "Redes de Computadores", "Design Digital", "Ciência da Computação", "Sistema da Informação" }));
        jCBCurso.setEnabled(false);

        jTFTelefone.setEditable(false);
        try {
            jTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefoneActionPerformed(evt);
            }
        });

        jPSenha.setEditable(false);
        jPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaActionPerformed(evt);
            }
        });

        jDDatadeNascimento.setEnabled(false);
        jDDatadeNascimento.setMaxSelectableDate(new Date());

        jTbEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Data de Inicio", "Data de Fim", "Bibliotecario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTbEmprestimos);

        jLabel1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 36)); // NOI18N
        jLabel1.setText("EMPRESTIMOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLIsbn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFCpf))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLAutor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLDescricao1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLDescricao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFTelefone))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLQuantidade1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jDDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCBCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jBCancelar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQuantidade)
                    .addComponent(jCBCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLIsbn)
                        .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQuantidade1)
                        .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jBCancelar)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout painelbrancoLayout = new javax.swing.GroupLayout(painelbranco);
        painelbranco.setLayout(painelbrancoLayout);
        painelbrancoLayout.setHorizontalGroup(
            painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelbrancoLayout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelbrancoLayout.setVerticalGroup(
            painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelbranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelbranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void inserirNaTabelaEmprestimo() throws SQLException{

        Connection con = Conexao.AbrirConexao();
        EmprestimoDAO bd = new EmprestimoDAO(con);
        List<Emprestimo> lista = new ArrayList<>();
        lista = bd.listarEmprestimoAceitoAluno(main.alunoEditar.getMatricula());
        DefaultTableModel tbm=
                    (DefaultTableModel) jTbEmprestimos.getModel();
        while(tbm.getRowCount() > 0 ){
            tbm.removeRow(0);
        }

        int i=0;
        for(Emprestimo tab : lista){
            Livro l = new LivroDAO(con).receberLivro(tab.getLivro());
            String titutloObra = new ObraDAO(con).receberTituloObra(l.getObra());
            tbm.addRow(new String[i]);
            jTbEmprestimos.setValueAt(tab.getId_emprestimo(), i, 0);
            jTbEmprestimos.setValueAt(titutloObra,i, 1);
            jTbEmprestimos.setValueAt(tab.getDataInicio(), i, 2);
            jTbEmprestimos.setValueAt(tab.getDataTermino(), i, 3);
            jTbEmprestimos.setValueAt(new BibliotecarioDAO(con).receberNomeBibliotecario(tab.getBibliotecario()), i, 4);
            i++;
        }
        Conexao.FehcarConexao(con);
    
        
    }
    private void preencherCampos(){
        jTFNome.setText(alunoEditar.getNome());
        jTFMatricula.setText(Integer.toString( alunoEditar.getMatricula()));
        jCBCurso.setSelectedItem(alunoEditar.getCurso());
        jTFCpf.setText(alunoEditar.getCpf());
        jTFTelefone.setText(alunoEditar.getTelefone());
        jPSenha.setText(alunoEditar.getSenha());
        jDDatadeNascimento.setDate(alunoEditar.getDataDeNascimento());
    }
    
    private void jTFNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNomeMouseClicked
  
    }//GEN-LAST:event_jTFNomeMouseClicked

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
    
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeKeyPressed

    }//GEN-LAST:event_jTFNomeKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        try {
            new TelaBibliotecario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizarAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMatriculaActionPerformed

    private void jTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCpfActionPerformed

    private void jTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefoneActionPerformed

    private void jPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizarAluno().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VisualizarAluno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<String> jCBCurso;
    private com.toedter.calendar.JDateChooser jDDatadeNascimento;
    private javax.swing.JLabel jLAutor;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLDescricao1;
    private javax.swing.JLabel jLIsbn;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLQuantidade1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField jTFCpf;
    private javax.swing.JFormattedTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JFormattedTextField jTFTelefone;
    private javax.swing.JTable jTbEmprestimos;
    private javax.swing.JPanel painelbranco;
    // End of variables declaration//GEN-END:variables
}
