
package loginregister;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
public class login extends javax.swing.JPanel {

   SecretKey secretKey = encrypt.defaultKey();
    public login() {
        initComponents();
        signUp.addActionListener(e ->{
            LoginRegister.frame.setContentPane(new register());
            LoginRegister.frame.pack();
            LoginRegister.frame.setLocationRelativeTo(null);
        });
        logInButon.addActionListener(e ->{
            if(casetaEmail.getText().trim().isEmpty() || String.valueOf(casetaParola.getPassword()).trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Completati toate campurile!");
                return;
            }
            if (!casetaEmail.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            emailWarning.setText("Email invalid!");
            return;
            } else {
            emailWarning.setText(" "); 
            }
            if(!jsonDB.verifyLogin(encrypt.encrypt(casetaEmail.getText(), secretKey),encrypt.encrypt(String.valueOf(casetaParola.getPassword()), secretKey)))
            {
                JOptionPane.showMessageDialog(null,"Emailul sau parola sunt gresite!");
            }else{
                LoginRegister.frame.setContentPane(new logged());
                LoginRegister.frame.pack();
                LoginRegister.frame.setLocationRelativeTo(null);
            }

        });
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        casetaEmail = new javax.swing.JTextField();
        casetaParola = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        logInButon = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        emailWarning = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 500));

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightPanel.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        casetaEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        casetaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casetaEmailActionPerformed(evt);
            }
        });

        casetaParola.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton1.setText("jButton1");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        logInButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logInButon.setText("Log In");

        signUp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signUp.setText("Create new account");

        emailWarning.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailWarning.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInButon)
                    .addComponent(signUp)
                    .addComponent(jLabel1)
                    .addComponent(casetaParola, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(casetaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(emailWarning))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casetaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casetaParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logInButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void casetaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casetaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casetaEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField casetaEmail;
    private javax.swing.JPasswordField casetaParola;
    private javax.swing.JLabel emailWarning;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logInButon;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
