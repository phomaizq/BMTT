/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.io.*;
import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.interfaces.*;
import javax.crypto.spec.*;

/**
 *
 * @author Administrator
 */
public class BoB extends javax.swing.JFrame {

    /**
     * Creates new form BoB
     */
    public BoB() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKhoaBoB = new javax.swing.JTextField();
        btnTaoKhoaB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtKhoaAlice = new javax.swing.JTextField();
        btnHienThiKhoaA = new javax.swing.JButton();
        btnKhoaChung = new javax.swing.JButton();
        btnMaHoaKAB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKhoaKAB = new javax.swing.JTextField();
        txtMaHoaKAB = new javax.swing.JTextField();
        btnMaHoa_GiaiMa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("BoB");

        jLabel1.setText("Khóa BoB");

        btnTaoKhoaB.setText("Tạo Khóa B");
        btnTaoKhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKhoaBActionPerformed(evt);
            }
        });

        jLabel2.setText("Khóa Alice");

        txtKhoaAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhoaAliceActionPerformed(evt);
            }
        });

        btnHienThiKhoaA.setText("Hiển thị Khóa A");
        btnHienThiKhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiKhoaAActionPerformed(evt);
            }
        });

        btnKhoaChung.setText("Khóa chung");
        btnKhoaChung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaChungActionPerformed(evt);
            }
        });

        btnMaHoaKAB.setText("Mã hóa KAB");
        btnMaHoaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaKABActionPerformed(evt);
            }
        });

        jLabel3.setText("Khóa KAB");

        jLabel4.setText("Mã hóa KAB");

        btnMaHoa_GiaiMa.setText("Mã hóa/Giải mã");
        btnMaHoa_GiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoa_GiaiMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtKhoaBoB, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnTaoKhoaB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtKhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnHienThiKhoaA)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtKhoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKhoaChung))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaHoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMaHoaKAB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnMaHoa_GiaiMa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKhoaBoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoKhoaB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienThiKhoaA)
                    .addComponent(jLabel2)
                    .addComponent(txtKhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKhoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKhoaChung))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaHoaKAB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26)
                .addComponent(btnMaHoa_GiaiMa)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    KeyAgreement bobKeyAgree;
    PublicKey alicePubKey;
    SecretKey bobDesKey;
    Cipher bobCipher;
    private void btnTaoKhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKhoaBActionPerformed
        // TODO add your handling code here:
        try{
            boolean read=false; //doi cho toi khi co tap tin alice.pub 
            while(!read){ 
                try{
                    FileInputStream fis=new FileInputStream("D:/A.pub");
                    fis.close(); 
                    read=true;
                }
                catch(Exception ex){
                    
                }
            }
        FileInputStream fis=new FileInputStream("D:/A.pub"); 
        byte[] alicePubKeyEnc=new byte[fis.available()]; 
        fis.read(alicePubKeyEnc); 
        fis.close(); 
        KeyFactory bobKeyFac = KeyFactory.getInstance("DH"); 
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(alicePubKeyEnc); 
        alicePubKey = bobKeyFac.generatePublic(x509KeySpec); 
        DHParameterSpec dhParamSpec = ((DHPublicKey)alicePubKey).getParams(); 
        System. out.println("Generate DH keypair ..."); 
        KeyPairGenerator bobKpairGen = KeyPairGenerator.getInstance("DH"); 
        bobKpairGen.initialize(dhParamSpec); 
        KeyPair bobKpair = bobKpairGen.generateKeyPair(); 
        System. out.println("Initializing KeyAgreement engine..."); 
        bobKeyAgree = KeyAgreement.getInstance("DH"); 
        bobKeyAgree.init(bobKpair.getPrivate()); 
        byte[] bobPubKeyEnc = bobKpair.getPublic().getEncoded(); 
        FileOutputStream fos=new FileOutputStream("D:/B.pub"); 
        fos.write(bobPubKeyEnc); fos.close(); 
        txtKhoaBoB.setText(bobPubKeyEnc.toString()); 
        }
        catch(Exception ex){
            
        } 
    }//GEN-LAST:event_btnTaoKhoaBActionPerformed

    private void btnHienThiKhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiKhoaAActionPerformed
        // TODO add your handling code here:
        try{
        FileInputStream fis=new FileInputStream("D:/A.pub"); 
        byte[] akeyP=new byte[fis.available()]; 
        fis.read(akeyP); 
        fis.close(); 
        txtKhoaAlice.setText(akeyP.toString()); 
        } 
        catch(Exception ex){
        }  
    }//GEN-LAST:event_btnHienThiKhoaAActionPerformed

    private void txtKhoaAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhoaAliceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhoaAliceActionPerformed

    private void btnKhoaChungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaChungActionPerformed
        // TODO add your handling code here:
        try{ 
            bobKeyAgree.doPhase(alicePubKey, true); 
            byte[] bobSharedSecret = bobKeyAgree.generateSecret(); 
            System.out.println("Khoa chung:Shared secret (DEBUG ONLY): " + CryptoUtil.toHexString(bobSharedSecret));
            txtKhoaKAB.setText(CryptoUtil.toHexString(bobSharedSecret)); 
        } 
        catch(Exception ex){
            
        } 
    }//GEN-LAST:event_btnKhoaChungActionPerformed

    private void btnMaHoaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaKABActionPerformed
        // TODO add your handling code here:
        try{
            bobKeyAgree.doPhase(alicePubKey, true); 
            bobDesKey = bobKeyAgree.generateSecret("DES"); 
            txtMaHoaKAB.setText(bobDesKey.toString()); // khoa chung A-4 
            BufferedWriter bw = null; //ghi van ban da ma hoa 
            String fileName = "D:\\KhoaB.txt"; //luu van ban 
            bw = new 
            BufferedWriter(new FileWriter(fileName)); // ghi van ban 
            bw.write(bobDesKey.toString()); 
            bw.close(); 
        }
        catch(Exception ex){
        } 
    }//GEN-LAST:event_btnMaHoaKABActionPerformed

    private void btnMaHoa_GiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoa_GiaiMaActionPerformed
        // TODO add your handling code here:
        DESCS des = new DESCS();
        des.setVisible(true);
    }//GEN-LAST:event_btnMaHoa_GiaiMaActionPerformed

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
            java.util.logging.Logger.getLogger(BoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThiKhoaA;
    private javax.swing.JButton btnKhoaChung;
    private javax.swing.JButton btnMaHoaKAB;
    private javax.swing.JButton btnMaHoa_GiaiMa;
    private javax.swing.JButton btnTaoKhoaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtKhoaAlice;
    private javax.swing.JTextField txtKhoaBoB;
    private javax.swing.JTextField txtKhoaKAB;
    private javax.swing.JTextField txtMaHoaKAB;
    // End of variables declaration//GEN-END:variables
}
