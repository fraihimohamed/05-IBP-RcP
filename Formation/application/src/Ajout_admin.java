
import MyExceptions.AddAdminException;
import Utils.SaveToDatabase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedyassin
 */
public class Ajout_admin extends javax.swing.JFrame {

    /**
     * Creates new form Ajout_admin
     */
    public Ajout_admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(58, 99, 153, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 147, 27, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Prénom");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(58, 189, 66, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(58, 247, 44, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mot de passe");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(58, 317, 80, 15);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Créer utilisateur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(215, 356, 182, 35);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(215, 140, 182, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(215, 186, 182, 32);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(215, 99, 182, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(215, 243, 182, 33);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(215, 311, 182, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ajouter nouveu utilisateur");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(145, 21, 304, 44);

        jCheckBox1.setText("Me connecter après création");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(215, 393, 218, 23);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 430);

        setSize(new java.awt.Dimension(518, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("saving new admin ...");
        if(jTextField1.getText().equals("") | jTextField2.getText().equals("")| jTextField3.getText().equals("")
                | jTextField4.getText().equals("")| jTextField5.getText().equals(""))
            JOptionPane.showMessageDialog(this, "veuillez remplir tous les champs !!", "Erreur !!",JOptionPane.ERROR_MESSAGE);
        else {
            try {
                boolean saved = SaveToDatabase.addAdmin(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(),
                        jTextField2.getText(), jTextField1.getText());
                if (saved)
                    JOptionPane.showMessageDialog(this, "admin ajouté avec succés !!","Succés",JOptionPane.INFORMATION_MESSAGE);
                if (jCheckBox1.isSelected()){
                    new Activité(jTextField3.getText()).setVisible(true);
                    this.dispose();
                } else {
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                }
                    
            } catch (SQLException ex) {
                Logger.getLogger(Ajout_admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Ajout_admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AddAdminException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur !!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
