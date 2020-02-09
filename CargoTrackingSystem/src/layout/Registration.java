package layout;

import Db.CreateDb;
import Db.ilceDao;
import Db.musteriDao;
import dto.ilceler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    public Registration() {
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

        lbl_hata = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Txt_Soyad = new javax.swing.JTextField();
        cmb_ilce = new javax.swing.JComboBox();
        Txt_Tel = new javax.swing.JTextField();
        Txt_Address = new javax.swing.JTextField();
        Txt_TC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Txt_Eposta = new javax.swing.JTextField();
        cmb_il = new javax.swing.JComboBox();
        Btn_Kayit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Txt_KullaniciAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Ad = new javax.swing.JTextField();
        btn_Back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbl_hata, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 218, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setText("Adres");

        cmb_ilce.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bir ilçe seçiniz", " " }));
        cmb_ilce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ilceActionPerformed(evt);
            }
        });

        Txt_Tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_TelKeyPressed(evt);
            }
        });

        Txt_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TCActionPerformed(evt);
            }
        });
        Txt_TC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_TCKeyPressed(evt);
            }
        });

        jLabel10.setText("  /");

        cmb_il.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bir il seçiniz", "ADANA", "ADIYAMAN", "AFYONKARAHISAR", "AĞRI", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "ARDAHAN", "ARTVIN", "AYDIN", "BALIKESIR", "BARTIN", "BATMAN", "BAYBURT", "BILECIK", "BINGÖL", "BITLIS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENIZLI", "DIYARBAKIR", "DÜZCE", "EDIRNE", "ELAZIĞ", "ERZINCAN", "ERZURUM", "ESKIŞEHIR", "GAZIANTEP", "GIRESUN", "GÜMÜŞHANE", "HAKKÂRI", "HATAY", "IĞDIR", "ISPARTA", "İSTANBUL", "İZMIR", "KAHRAMANMARAŞ", "KARABÜK", "KARAMAN", "KARS", "KASTAMONU", "KAYSERI", "KILIS", "KIRIKKALE", "KIRKLARELI", "KIRŞEHIR", "KOCAELI", "KONYA", "KÜTAHYA", "MALATYA", "MANISA", "MARDIN", "MERSIN", "MUĞLA", "MUŞ", "NEVŞEHIR", "NIĞDE", "ORDU", "OSMANIYE", "RIZE", "SAKARYA", "SAMSUN", "ŞANLIURFA", "SIIRT", "SINOP", "SIVAS", "ŞIRNAK", "TEKIRDAĞ", "TOKAT", "TRABZON", "TUNCELI", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK" }));
        cmb_il.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ilActionPerformed(evt);
            }
        });

        Btn_Kayit.setText("Kaydol");
        Btn_Kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KayitActionPerformed(evt);
            }
        });

        jLabel6.setText("Kullanıcı Adı");

        jLabel1.setText("Ad");

        jLabel2.setText("Soyad");

        jLabel7.setText("Şifre");

        jLabel3.setText("Telefon No");

        jLabel4.setText("T.C NO ");

        jLabel5.setText("E posta");

        btn_Back.setText("<");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 2, 36)); // NOI18N
        jLabel8.setText("Kayıt Ol");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_Back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Ad)
                                    .addComponent(Txt_Tel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Soyad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(cmb_il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_Back)
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Txt_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(Txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Txt_TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cmb_il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(Btn_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);  // register ekranını kapatıyoruz
        new Home().setVisible(true);// login ekranını tekrar açıyoruz.
    }//GEN-LAST:event_btn_BackActionPerformed

    private void Btn_KayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KayitActionPerformed
        String name = Txt_Ad.getText();
        String lastName = Txt_Soyad.getText();
        String tc = Txt_TC.getText();
        String email = Txt_Eposta.getText();
        String mobileNumber = Txt_Tel.getText();
        String userName = Txt_KullaniciAdi.getText();
        String il = cmb_il.getSelectedItem() + "";
        String ilce = cmb_ilce.getSelectedItem() + "";
        String password = Txt_Password.getText();
        String Address = Txt_Address.getText() + " " + cmb_ilce.getSelectedItem() + " - " + cmb_il.getSelectedItem();
        System.err.println(Address);
        if (name.equals("") || lastName.equals("") || tc.equals("") || email.equals("") || mobileNumber.equals("") || userName.equals("") || password.equals("") || Address.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Boş alanları doldurunuz");
        } else {
            try {
                boolean value=musteriDao.isAvailable(userName);
                if(value==false){
                musteriDao.addMusteri(name, lastName, userName, password, email, mobileNumber, il, ilce, Address);
                JOptionPane.showMessageDialog(null,
                        "Hoşgeldiniz. Hesabınız oluşturuldu");
                this.setVisible(false);  // register ekranını kapatıyoruz
                new Login().setVisible(true);// login ekranını tekrar açıyoruz.
                }else{
                JOptionPane.showMessageDialog(null,
                        "Bu kullanıcı adı daha önce alınmış");
                }
              
            } catch (Exception exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Bir hata meydana geldi");
            }
        }

    }//GEN-LAST:event_Btn_KayitActionPerformed

    private void cmb_ilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ilActionPerformed
        String secili_il = cmb_il.getSelectedItem() + "";
        for (ilceler i : ilceDao.ilceGoster(secili_il)) {
            cmb_ilce.removeAllItems();
            cmb_ilce.addItem(i.getIsim());
        }
    }//GEN-LAST:event_cmb_ilActionPerformed

    private void cmb_ilceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ilceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ilceActionPerformed

    private void Txt_TCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TCKeyPressed
        if (Txt_TC.getText().length() < 11) {
            String value = Txt_TC.getText();
            int l = value.length();
            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == 8) {
                Txt_TC.setEditable(true);
                lbl_hata.setText("");
            } else {
                Txt_TC.setEditable(false);

                JOptionPane.showMessageDialog(rootPane, "* Bu alana sadece rakam girebilirsiniz.)");
            }
    }//GEN-LAST:event_Txt_TCKeyPressed
        else {

            JOptionPane.showMessageDialog(rootPane, "* TC No 11 karakterden uzun olamaz !)");
            Txt_TC.setText("");
        }
    }
    private void Txt_TelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TelKeyPressed

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == 8) {
            Txt_Tel.setEditable(true);
            lbl_hata.setText("");
        } else {
            Txt_Tel.setEditable(false);
            JOptionPane.showMessageDialog(rootPane, "* Bu alana sadece rakam girebilirsiniz.)");
            //   lbl_hata.setText("* Enter only numeric digits(0-9)");
        }
    }//GEN-LAST:event_Txt_TelKeyPressed

    private void Txt_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TCActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);

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
    private javax.swing.JTextField Txt_TC;
    private javax.swing.JTextField Txt_Tel;
    private javax.swing.JButton btn_Back;
    private javax.swing.JComboBox cmb_il;
    private javax.swing.JComboBox cmb_ilce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_hata;
    // End of variables declaration//GEN-END:variables
}
