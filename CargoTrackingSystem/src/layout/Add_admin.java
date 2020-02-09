/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import Db.AdminDao;
import Db.ilceDao;
import dto.ilceler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author musta
 */
public class Add_admin extends javax.swing.JFrame {

    /**
     * Creates new form Add_admin
     */
    public Add_admin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Ad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Txt_Soyad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_Tel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Eposta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_KullaniciAdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmb_il = new javax.swing.JComboBox();
        cmb_ilce = new javax.swing.JComboBox();
        Btn_Kayit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 2, 36)); // NOI18N
        jLabel8.setText("Kayıt OL");

        jLabel1.setText("Ad");

        jLabel2.setText("Soyad");

        Txt_Tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_TelKeyPressed(evt);
            }
        });

        jLabel3.setText("Telefon No");

        jLabel5.setText("E posta");

        jLabel6.setText("Kullanıcı Adı");

        jLabel7.setText("Şifre");

        jLabel9.setText("Adres");

        cmb_il.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bir il seçiniz", "ADANA", "ADIYAMAN", "AFYONKARAHISAR", "AĞRI", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "ARDAHAN", "ARTVIN", "AYDIN", "BALIKESIR", "BARTIN", "BATMAN", "BAYBURT", "BILECIK", "BINGÖL", "BITLIS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENIZLI", "DIYARBAKIR", "DÜZCE", "EDIRNE", "ELAZIĞ", "ERZINCAN", "ERZURUM", "ESKIŞEHIR", "GAZIANTEP", "GIRESUN", "GÜMÜŞHANE", "HAKKÂRI", "HATAY", "IĞDIR", "ISPARTA", "İSTANBUL", "İZMIR", "KAHRAMANMARAŞ", "KARABÜK", "KARAMAN", "KARS", "KASTAMONU", "KAYSERI", "KILIS", "KIRIKKALE", "KIRKLARELI", "KIRŞEHIR", "KOCAELI", "KONYA", "KÜTAHYA", "MALATYA", "MANISA", "MARDIN", "MERSIN", "MUĞLA", "MUŞ", "NEVŞEHIR", "NIĞDE", "ORDU", "OSMANIYE", "RIZE", "SAKARYA", "SAMSUN", "ŞANLIURFA", "SIIRT", "SINOP", "SIVAS", "ŞIRNAK", "TEKIRDAĞ", "TOKAT", "TRABZON", "TUNCELI", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK" }));
        cmb_il.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ilActionPerformed(evt);
            }
        });

        cmb_ilce.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bir ilçe seçiniz", " " }));
        cmb_ilce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ilceActionPerformed(evt);
            }
        });

        Btn_Kayit.setText("Kaydol");
        Btn_Kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KayitActionPerformed(evt);
            }
        });

        jLabel10.setText("  /");

        btn_Back.setText("<");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 2));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(Txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(Txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(cmb_il, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(35, 35, 35)
                                            .addComponent(Txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(109, 109, 109)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(35, 35, 35)
                                            .addComponent(Txt_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(150, 150, 150)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(310, 310, 310)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_Back)
                        .addGap(259, 259, 259)
                        .addComponent(Btn_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(50, 50, 50)
                .addComponent(Btn_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 389));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_ilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ilActionPerformed
        String secili_il = cmb_il.getSelectedItem() + "";
        for (ilceler i : ilceDao.ilceGoster(secili_il)) {
            cmb_ilce.removeAllItems();
            cmb_ilce.addItem(i.getIsim());
        }
    }//GEN-LAST:event_cmb_ilActionPerformed

    private void Btn_KayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KayitActionPerformed
        String name = Txt_Ad.getText();
        String lastName = Txt_Soyad.getText();
        String email = Txt_Eposta.getText();
        String userName = Txt_KullaniciAdi.getText();
        String mobileNo = Txt_Tel.getText();
        String password = Txt_Password.getText();
        String il = cmb_il.getSelectedItem() + "";
        String ilce = cmb_ilce.getSelectedItem() + "";
        String Address = Txt_Address.getText() + " " + cmb_ilce.getSelectedItem() + " - " + cmb_il.getSelectedItem();
        System.err.println(Address);
        if (name.equals("") || lastName.equals("") || email.equals("") || userName.equals("") || password.equals("") || Address.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Boş alanları doldurunuz");
        } else {
            try {
                boolean value = AdminDao.isAvailable(userName);
                if (value == false) {
                    AdminDao.addAdmin(name, lastName, userName, password, email, mobileNo, il, ilce, Address);
                    JOptionPane.showMessageDialog(null,
                            "Admin oluşturuldu");
                  
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Bu kullanıcı adı daha önce alınmış");
                }

            } catch (Exception exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Bir hata meydana geldi");
            }
        }
    }//GEN-LAST:event_Btn_KayitActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);  // register ekranını kapatıyoruz
        new Admin_interface().setVisible(true);// login ekranını tekrar açıyoruz.
    }//GEN-LAST:event_btn_BackActionPerformed

    private void cmb_ilceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ilceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ilceActionPerformed

    private void Txt_TelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TelKeyPressed

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == 8) {
            Txt_Tel.setEditable(true);

        } else {
            Txt_Tel.setEditable(false);
            JOptionPane.showMessageDialog(rootPane, "* Bu alana sadece rakam girebilirsiniz.)");
            //   lbl_hata.setText("* Enter only numeric digits(0-9)");
        }
    }//GEN-LAST:event_Txt_TelKeyPressed

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
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Kayit;
    private javax.swing.JTextField Txt_Ad;
    private javax.swing.JTextField Txt_Address;
    private javax.swing.JTextField Txt_Eposta;
    private javax.swing.JTextField Txt_KullaniciAdi;
    private javax.swing.JTextField Txt_Password;
    private javax.swing.JTextField Txt_Soyad;
    private javax.swing.JTextField Txt_Tel;
    private javax.swing.JButton btn_Back;
    private javax.swing.JComboBox cmb_il;
    private javax.swing.JComboBox cmb_ilce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
