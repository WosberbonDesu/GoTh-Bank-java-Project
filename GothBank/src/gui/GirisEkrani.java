package gui;

import database.DbConnection;
import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private KullaniciGiris kullaniciGirisObject = null;
    
    private final String KIMLIK_TEXT_ORIGINAL = "T.C. No / Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL = "**********";

    public GirisEkrani() {
        initComponents();
        getEdits();  
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPanel.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);
    }   

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if(this.kullaniciGirisObject == null) {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        basvurButton = new javax.swing.JButton();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Giriş Ekranı");
        setResizable(false);

        girisEkraniPanel.setBackground(new java.awt.Color(0, 0, 102));

        hosgeldinizLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        hosgeldinizLabel.setForeground(new java.awt.Color(255, 0, 51));
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("WELCOME TO GOTH BANK");

        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(153, 153, 153));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setForeground(new java.awt.Color(153, 153, 153));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        girisButton.setBackground(new java.awt.Color(255, 204, 204));
        girisButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        girisButton.setText("Sign In");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        soruLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soruLabel.setText("Are you still not our customer? ");

        basvurButton.setBackground(new java.awt.Color(204, 204, 255));
        basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButton.setText("APPLY");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        sifremiUnuttumLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sifremiUnuttumLabel.setForeground(new java.awt.Color(102, 102, 255));
        sifremiUnuttumLabel.setText("Did you forget your password? ");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(soruLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifremiUnuttumLabel))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikText, sifreText});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifremiUnuttumLabel)
                .addGap(10, 10, 10)
                .addComponent(girisButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel)
                    .addComponent(basvurButton))
                .addGap(63, 63, 63))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {basvurButton, girisButton, kimlikText, sifreText, soruLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    *Buton renklendirmeleri
    */
    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        ButtonAyarlari.setBgFg(girisButton, Color.cyan, Color.blue);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(girisButton);
    }//GEN-LAST:event_girisButtonMouseExited

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.magenta, Color.green);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited


    /*
    *Text odaklanmaları
    */
    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.checkTheTextFocusGained(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.checkTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.checkTheTextFocusGained(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.checkTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    
    /*
    *Buton actions
    */
    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
       if(this.bilgilerGecerliMi()) {
           String musteriKimlik = this.kimlikText.getText().trim();
           String sifre = String.valueOf(this.sifreText.getPassword());
           this.girisYap(musteriKimlik, sifre);
       } else {
           Dialogs.bosOlamazMesajiGoster(this);
       }
    }//GEN-LAST:event_girisButtonActionPerformed

    private void girisYap(String musteriKimlik,String sifre) {
        
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);
        
        if(getKullaniciGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Giriş bilgileri doğru değildir!\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }
    
    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumLabelMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifremiUnuttumLabelMouseClicked
          
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButton;
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifremiUnuttumLabel;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
