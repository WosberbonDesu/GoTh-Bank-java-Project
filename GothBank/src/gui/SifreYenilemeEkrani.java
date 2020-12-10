
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private SifreYenileme sifreYenilemeObject = null;
    
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setOnlyNumber(telefonNoText);
        TextAyarlari.setMaxLimit(telefonNoText, 11);
        if(getHesapBilgileri().getKullaniciId() == 0) {
            this.eskiSifreText.setEnabled(false);
        }
    }

    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }

    private boolean isEnabledEskiSifreText() {
        return this.getEskiSifreText().isEnabled();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(this.sifreYenilemePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject == null) {
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon2 = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telefonNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        guvenlikCevapLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        eskiSifreLabel = new javax.swing.JLabel();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreTekrarText = new javax.swing.JPasswordField();
        sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Şifre Yenileme Ekranı");

        sifreYenilemePanel.setBackground(new java.awt.Color(153, 51, 0));

        geriIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon2MouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        sifreYenilemeLabel.setForeground(new java.awt.Color(255, 0, 51));
        sifreYenilemeLabel.setText("Password Renewal ");

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("Citizenship Number:");

        telefonNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telephone No :");

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Security Question Answer: ");

        sifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Repeat New Password: ");

        yeniSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("New password : ");

        eskiSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Old password : ");

        sifreyiYenileButton.setBackground(new java.awt.Color(255, 255, 153));
        sifreyiYenileButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreyiYenileButton.setText("Reset Password ");
        sifreyiYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreyiYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseExited(evt);
            }
        });
        sifreyiYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon2))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                        .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sifreyiYenileButton)
                .addGap(108, 108, 108))
        );
        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifreyiYenileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon2MouseClicked
        if(isEnabledEskiSifreText()) {
            ActionAyarlari.setVisible(this, new AyarlarEkrani());
        } else {
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }        
    }//GEN-LAST:event_geriIcon2MouseClicked

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        ButtonAyarlari.setBgFg(sifreyiYenileButton, Color.cyan, Color.red);
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(sifreyiYenileButton);
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.sifreyiYenile();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void sifreyiYenile() {
        String yeniSifre = String.valueOf(this.yeniSifreText.getPassword());
        String yeniSifreTekrar = String.valueOf(this.sifreTekrarText.getPassword());
        
        if(yeniSifre.equals(yeniSifreTekrar)) {
            this.sifreyiOnayla();
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreler uyuşmuyor!");
        }
    }
    
    private void sifreyiOnayla() {
        this.getSifreYenilemeObject().setTcNo(this.tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telefonNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.guvenlikCevapText.getText());
        if(this.isEnabledEskiSifreText()) {
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.eskiSifreText.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.yeniSifreText.getPassword()));
        
        if(this.getSifreYenilemeObject().sifreYenilendiMi()) {
            Dialogs.ozelMesajGoster(this, "Şifreniz başarıyla yenilenmiştir.");
            if(this.isEnabledEskiSifreText()) {
                ActionAyarlari.setVisible(this, new HesapEkrani());
            } else {
                ActionAyarlari.setVisible(this, new GirisEkrani());
            }
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreniz yenilenemedi!\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel geriIcon2;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarText;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JButton sifreyiYenileButton;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNoText;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}
