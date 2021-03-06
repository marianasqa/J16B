package views;

import DAO.ClienteDAO;
import connection.ConnectionFactory;
import conversores.Conversor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Cliente;
import validadadores.Validador;

public class frmCliente extends javax.swing.JFrame {

    public frmCliente() {
        initComponents();     
        DefaultTableModel modelo = (DefaultTableModel) grdClientes.getModel();
        grdClientes.setRowSorter(new TableRowSorter(modelo));
        
        carregarGrade();
    }

    public void carregarGrade()
    {
        ClienteDAO cliDAO = new ClienteDAO();
        
        DefaultTableModel modelo = (DefaultTableModel) grdClientes.getModel();
        modelo.setNumRows(0);
        
        for(Cliente cli: cliDAO.read()){
            modelo.addRow(new Object[]{
                cli.getCodigo(),
                cli.getNome(),
                cli.getCPF(),
                cli.getTelefone(),
                cli.getNascimento()});
        }
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdClientes = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro para Cliente");

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        grdClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdClientes);

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome:");

        lblNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNascimento.setText("Nascimento:");

        lblTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefone.setText("Telefone:");

        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCPF.setText("CPF:");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)))
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNascimento)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (this.RealizarValidacoesCampos())
        {
           Cliente cli = new Cliente();
           ClienteDAO cliDAO = new ClienteDAO();
           
           cli.setCodigo(Integer.parseInt(txtCodigo.getText()));
           cli.setNome(txtNome.getText());
           cli.setCPF(txtCPF.getText());
           cli.setTelefone(txtTelefone.getText());
           cli.setNascimento(Conversor.StringParaData(txtNascimento.getText()));

           cliDAO.create(cli);
           this.carregarGrade();
           this.limparCampos();
        } 
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private boolean RealizarValidacoesCampoCodigo()
    {
      if (txtCodigo.getText().trim().isEmpty())
      {
          Mensagem.ExibirMensagemErro("Preencha o código.");
          return false;
      } 
      
      if (!Validador.ValorENumeroInteiro(txtCodigo.getText()))
      {
          Mensagem.ExibirMensagemErro("Preencha um número inteiro válido.");
          return false;
      }
      
      return true;
    }
        
    private boolean RealizarValidacoesCampos()
    {
        
      if (txtNome.getText().trim().isEmpty())
      {
          Mensagem.ExibirMensagemErro("Preencha o nome.");
          return false;
      }

      if (!RealizarValidacoesCampoCodigo())
          return false;  
      
      if (txtCPF.getText().trim().isEmpty())
      {
          Mensagem.ExibirMensagemErro("Preencha o CPF.");
          return false;
      }      

      if (txtNascimento.getText().trim().isEmpty())
      {
          Mensagem.ExibirMensagemErro("Preencha a data de nascimento.");
          return false;
      }
      
      if (!Validador.ValorEDataValida(txtNascimento.getText()))
      {
          Mensagem.ExibirMensagemErro("Preencha uma data válida.");
          return false;
      }
       
      return true;
    }
    
    private void limparCampos()
    {
       txtCodigo.setText("");
       txtNome.setText("");
       txtCPF.setText("");
       txtNascimento.setText("");
       txtTelefone.setText("");
    }
    
    private void AtribuirValoresGradeParaEdits()
    {
       int row = grdClientes.getSelectedRow();
       txtCodigo.setText(grdClientes.getModel().getValueAt(row, 1).toString());
       txtNome.setText(grdClientes.getModel().getValueAt(row, 2).toString());
       txtCPF.setText(grdClientes.getModel().getValueAt(row, 3).toString());
       txtNascimento.setText(grdClientes.getModel().getValueAt(row, 4).toString()); 
       txtTelefone.setText(grdClientes.getModel().getValueAt(row, 5).toString()); 
    }
    
    
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        
        if (this.RealizarValidacoesCampos())
        {
           Cliente cliente = new Cliente();
           ClienteDAO cliDAO = new ClienteDAO();
           
           cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
           cliente.setNome(txtNome.getText());
           cliente.setCPF(txtCPF.getText());
           cliente.setTelefone(txtTelefone.getText());
           cliente.setNascimento(Conversor.StringParaData(txtNascimento.getText()));

           cliDAO.update(cliente);

           this.carregarGrade();
           this.limparCampos();
        }   
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void grdClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdClientesMouseClicked
        // TODO add your handling code here:
        this.AtribuirValoresGradeParaEdits();
    }//GEN-LAST:event_grdClientesMouseClicked

    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        ClienteDAO cliDAO = new ClienteDAO();
        // localizar id
        cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
            
        cliDAO.delete(cliente);            
        
        this.carregarGrade();
        this.limparCampos();  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        ClienteDAO cliDAO = new ClienteDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Cliente WHERE COD = '"+txtCodigo.getText()+"'");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Cliente cli = new Cliente();
                
                txtCodigo.setText(rs.getString("COD"));
                txtNome.setText(rs.getString("NOME"));                
                txtCPF.setText(rs.getString("CPF"));
                txtTelefone.setText(rs.getString("TELEFONE"));
                txtNascimento.setText(rs.getString("NASCIMENTO"));
                
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTable grdClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
