
package loginregister;

import javax.swing.JOptionPane;
import javax.crypto.SecretKey;

public class register extends javax.swing.JPanel {
        SecretKey secretKey = encrypt.defaultKey();
 
    public register() {
        initComponents();
        logIn.addActionListener(e ->{
            LoginRegister.frame.setContentPane(new login());
            LoginRegister.frame.pack();
            LoginRegister.frame.setLocationRelativeTo(null);
        });
        signUp.addActionListener(e ->{
            if(casetaNume.getText().isEmpty() 
               || casetaPrenume.getText().isEmpty() 
               || casetaEmail.getText().isEmpty() 
               || String.valueOf(casetaParola.getPassword()).trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Te rugam sa completezi toate campurile!");
                return;
            
                }
                if(jsonDB.userExists(encrypt.encrypt(casetaEmail.getText(), secretKey)))
                {
                    JOptionPane.showMessageDialog(null,"Utilizator existent!");
                    return;
            }else{
              if (!casetaEmail.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) 
              {
                    emailWarning.setText("Email invalid!");
                    return;
              } else 
              {
                         emailWarning.setText(" "); 
                         if((2025 - Integer.parseInt((String)anNastereCB.getSelectedItem())) < 18)
                      {
                        JOptionPane.showMessageDialog(null,"Esti prea mic pentru aceasta aplicatie!");
                        System.exit(0);
                      }else{
                        user u = new user(
                        encrypt.encrypt(casetaEmail.getText().trim(),secretKey),
                        encrypt.encrypt(casetaNume.getText().trim(),secretKey),
                        encrypt.encrypt(casetaPrenume.getText().trim(),secretKey),
                        encrypt.encrypt(String.valueOf(casetaParola.getPassword()),secretKey));
                        jsonDB.saveUser(u);
                        LoginRegister.frame.setContentPane(new login());
                        LoginRegister.frame.pack();
                        LoginRegister.frame.setLocationRelativeTo(null);
                    }
              }
} 
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        casetaNume = new javax.swing.JTextField();
        casetaPrenume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ziNastereCB = new javax.swing.JComboBox<>();
        lunaNastereCB = new javax.swing.JComboBox<>();
        anNastereCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        casetaEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        casetaParola = new javax.swing.JPasswordField();
        signUp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();
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
        jLabel1.setText("Sign Up");

        jLabel2.setText("First name");

        jLabel3.setText("Surname");

        casetaNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casetaNumeActionPerformed(evt);
            }
        });

        jLabel4.setText("Date of birth");

        ziNastereCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29 ", "30", "31", " " }));

        lunaNastereCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        lunaNastereCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunaNastereCBActionPerformed(evt);
            }
        });

        anNastereCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", " " }));

        jLabel5.setText("Email");

        jLabel6.setText("Password");

        signUp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jLabel7.setText("Already have an account?");

        logIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logIn.setText("Log In");

        emailWarning.setBackground(new java.awt.Color(255, 0, 0));
        emailWarning.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailWarning.setForeground(new java.awt.Color(255, 0, 51));
        emailWarning.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(casetaNume, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(casetaPrenume))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(casetaParola)
                                            .addComponent(casetaEmail)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ziNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lunaNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(anNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel3)))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(139, 139, 139))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logIn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signUp))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casetaPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casetaNume, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ziNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunaNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anNastereCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casetaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casetaParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logIn))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpActionPerformed

    private void casetaNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casetaNumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casetaNumeActionPerformed

    private void lunaNastereCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunaNastereCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lunaNastereCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anNastereCB;
    private javax.swing.JTextField casetaEmail;
    private javax.swing.JTextField casetaNume;
    private javax.swing.JPasswordField casetaParola;
    private javax.swing.JTextField casetaPrenume;
    private javax.swing.JLabel emailWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logIn;
    private javax.swing.JComboBox<String> lunaNastereCB;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton signUp;
    private javax.swing.JComboBox<String> ziNastereCB;
    // End of variables declaration//GEN-END:variables
}
