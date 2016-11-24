package libapp;

import java.awt.BorderLayout;
import java.text.NumberFormat;
import javax.swing.JPanel;

public class Main03 extends javax.swing.JFrame {
//    static Dimension dframe;  do ZRZUTU EKRANU
    String[] message = {"Blad danych - powinno byc np. 0.9",
                     "Zalozenia twierdzenia sa spełnione",
                     "Zalozenia twierdzenia nie spełnione",
                     "Ujemny rezultat to odwrocenie fazy",
                     "Wszystkie dane powinny > 0.0"};
                     
    public Main03() {
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
        jLabel1 = new javax.swing.JLabel();
        signalFreq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signalSampling = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signalAlias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rysuj = new javax.swing.JButton();
        czysc = new javax.swing.JButton();
        note01 = new javax.swing.JLabel();
        note02 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signalRange = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        drawPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setDisplayedMnemonic('s');
        jLabel1.setText("sygnal");

        signalFreq.setColumns(5);
        signalFreq.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        signalFreq.setText("0.9");

        jLabel2.setText("Hz");

        jLabel3.setText("probki");

        jLabel4.setText("Wynik");

        signalSampling.setColumns(5);
        signalSampling.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        signalSampling.setText("1.0");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Hz");

        signalAlias.setColumns(5);
        signalAlias.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        signalAlias.setText("0.0");
        signalAlias.setEnabled(false);

        jLabel6.setText("Hz");

        rysuj.setText("rysuj");
        rysuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rysujActionPerformed(evt);
            }
        });

        czysc.setText("czysc");
        czysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czyscActionPerformed(evt);
            }
        });

        note01.setForeground(new java.awt.Color(255, 0, 0));

        note02.setDisplayedMnemonic('n');
        note02.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setText("zakres");

        signalRange.setColumns(5);
        signalRange.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        signalRange.setText("11");

        jLabel10.setText("rad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rysuj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(czysc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(signalFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(note02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(note01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signalAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(signalSampling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(signalRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signalFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(signalRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(signalSampling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(signalAlias)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(note01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(czysc)
                    .addComponent(rysuj))
                .addContainerGap())
        );

        signalFreq.getAccessibleContext().setAccessibleName("signalFreq");

        drawPanel.setBackground(new java.awt.Color(153, 153, 255));
        drawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rysujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rysujActionPerformed
       note01.setText("");  note02.setText("");
       try {
            Dane.freq = Double.parseDouble(signalFreq.getText());
            Dane.samp = Double.parseDouble(signalSampling.getText());
            Dane.range = Double.parseDouble(signalRange.getText());
            if (Dane.freq <= 0) {throw new NumberFormatException();}
            if (Dane.samp <= 0) {throw new NumberFormatException();}
            if (Dane.range <= 0) {throw new NumberFormatException();}
            Dane.alias = Dane.calculate();
            String str1 = NumberFormat.getInstance().format(Dane.alias);
            signalAlias.setText(str1);
            if (Dane.freq < 0.5*Dane.samp) {
               note01.setText(message[1]); 
            } else {
               note01.setText(message[2]);  
            }
            if (Dane.alias < 0) {note02.setText(message[3]);} 
            drawPanel.removeAll();
            drawPanel.setLayout(new BorderLayout());
            JPanel dp = DrawPanel.createWoPanel();
            drawPanel.add(dp, BorderLayout.CENTER);
            drawPanel.validate();
        } catch (NumberFormatException  e) {
            note01.setText(message[0]);
            note02.setText(message[4]);
        } catch (NullPointerException e) {
            note01.setText(message[0]);
            note02.setText(message[4]);
        }
// ZRZUT EKRANU - dołozone wymiar prostokata zrzutu -- dframe.      
//        try {
//            Robot rob = new Robot();
//            BufferedImage bi = rob.createScreenCapture(
//                    new Rectangle(dframe.width, dframe.height));
//            File f = new File("frame_test1.png");
//            ImageIO.write(bi, "png", f);
//        } catch (AWTException e) {
//            System.out.println(e.getMessage());  
//        } catch (IOException e) {
//           System.out.println(e.getMessage());  
//        }    
    }//GEN-LAST:event_rysujActionPerformed

    private void czyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czyscActionPerformed
        drawPanel.removeAll();
        signalFreq.setText("0.9");
        signalRange.setText("11");
        signalSampling.setText("1.0");
        signalAlias.setText("");
        note01.setText("");  note02.setText("");
    
    }//GEN-LAST:event_czyscActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main03 m = new Main03();
//                dframe = m.getSize();     do ZRZUTU EKRANU
                m.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton czysc;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel note01;
    private javax.swing.JLabel note02;
    private javax.swing.JButton rysuj;
    private javax.swing.JTextField signalAlias;
    private javax.swing.JTextField signalFreq;
    private javax.swing.JTextField signalRange;
    private javax.swing.JTextField signalSampling;
    // End of variables declaration//GEN-END:variables
}