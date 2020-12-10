
package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;

public class HavaleEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {
    
    private Havale havaleObject = null;
    
    private final String MUSTERI_NO_TEXT_ORIGINAL = "Müşteri No";
    private int gonderilecekMiktar = 0;
    
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        havaleEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(gonderilecekMiktarText);
        TextAyarlari.setMaxLimit(gonderilecekMiktarText, 5);
        TextAyarlari.setOnlyNumber(musteriNoText);
        musteriNoText.setText(MUSTERI_NO_TEXT_ORIGINAL);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.gonderilecekMiktarText.getText().equals("")
                || this.musteriNoText.getText().equals(this.MUSTERI_NO_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if(this.havaleObject == null) {
            havaleObject = new Havale();
        }
        return havaleObject;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        gonderilecekMiktarText = new javax.swing.JTextField();
        havaleButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        musteriNoText = new javax.swing.JTextField();
        havaleAlacakKisiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Havale Ekranı");

        havaleEkraniPanel.setBackground(new java.awt.Color(102, 0, 102));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Dear [USER NAME SURNAME] ");

        limitUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitUyariLabel.setText("You can send 20.000 TL and gold in one go. ");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Your Total Balance: ");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BALANCE]");

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gondereceginizMiktarLabel.setText("Amount You Will Send: ");

        gonderilecekMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gonderilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gonderilecekMiktarTextKeyReleased(evt);
            }
        });

        havaleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleButton.setText("Make Money Order ");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        musteriNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        musteriNoText.setForeground(new java.awt.Color(153, 153, 153));
        musteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusLost(evt);
            }
        });

        havaleAlacakKisiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleAlacakKisiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havaleAlacakKisiLabel.setText("Transfer Receiver: ");

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(limitUyariLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(geriIcon)
                        .addGap(18, 18, 18)
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gonderilecekMiktarText))
                                .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(havaleAlacakKisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(musteriNoText))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(havaleButton)
                        .addGap(176, 176, 176))))
        );
        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon)))
                .addGap(47, 47, 47)
                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gonderilecekMiktarText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(havaleAlacakKisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteriNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gonderilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gonderilecekMiktarTextKeyReleased
        this.gonderilecekMiktar = TextAyarlari.checkTheTextKeyReleased(gonderilecekMiktarText, 20000);
    }//GEN-LAST:event_gonderilecekMiktarTextKeyReleased

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musteriNoText.getText());
        
        if(getHavaleObject().havaleYapildiMi()) {
            Dialogs.ozelMesajGoster(this, "Havale işlemi başarıyla gerçekleşmiştir.\n"
                    + "Gönderilen müşteri numarası:" + this.musteriNoText.getText()
                    + "\nGönderilen Miktar:" + this.gonderilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Havale işlemi gerçekleştirilemedi.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void musteriNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusGained
        TextAyarlari.checkTheTextFocusGained(musteriNoText, MUSTERI_NO_TEXT_ORIGINAL);
    }//GEN-LAST:event_musteriNoTextFocusGained

    private void musteriNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusLost
        TextAyarlari.checkTheTextFocusLost(musteriNoText);
    }//GEN-LAST:event_musteriNoTextFocusLost

    
    
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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JTextField gonderilecekMiktarText;
    private javax.swing.JLabel havaleAlacakKisiLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JTextField musteriNoText;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
