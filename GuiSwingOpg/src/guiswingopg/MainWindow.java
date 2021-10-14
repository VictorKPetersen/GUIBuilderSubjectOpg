package guiswingopg;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public MainWindow() {
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

        calculatorPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        outputTextField = new javax.swing.JTextField();
        calcBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        switchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Radian - Vinkel Regner");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

        inputLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        inputLabel.setText("Degrees");
        inputLabel.setMaximumSize(new java.awt.Dimension(120, 35));
        inputLabel.setMinimumSize(new java.awt.Dimension(120, 35));
        inputLabel.setPreferredSize(new java.awt.Dimension(120, 35));

        outputLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        outputLabel.setText("Radians");
        outputLabel.setMaximumSize(new java.awt.Dimension(120, 35));
        outputLabel.setMinimumSize(new java.awt.Dimension(120, 35));
        outputLabel.setPreferredSize(new java.awt.Dimension(120, 35));

        inputTextField.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        outputTextField.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        calcBtn.setText("Calculate");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        switchBtn.setText("Switch");
        switchBtn.setAlignmentX(0.5F);
        switchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputTextField))
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(clearBtn)
                .addGap(33, 33, 33)
                .addComponent(calcBtn)
                .addGap(27, 27, 27)
                .addComponent(switchBtn)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //Is called when the clearBtn is clicked, sets the text of TextFields to an empty string
        
        inputTextField.setText("");
        outputTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void switchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchBtnActionPerformed
        //Is called when switchBtn is clicked, saves the text diffrent labels and textfields are holding. And switches them all around
        
        String savedInputLabel = inputLabel.getText(); //Saves the current text from InputLabel in a variable
        String savedOutputLabel = outputLabel.getText();
        
        String savedInputTextField = inputTextField.getText();
        String savedOutputTextField = outputTextField.getText();
        
        inputLabel.setText(savedOutputLabel); //Sets the text of a label
        outputLabel.setText(savedInputLabel);
        
        inputTextField.setText(savedOutputTextField);
        outputTextField.setText(savedInputTextField);
    }//GEN-LAST:event_switchBtnActionPerformed

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        //Is called when the caclBtn is clicked, saves text of label + textField.
        String savedInputLabel = inputLabel.getText();
        String savedInputTextField = inputTextField.getText();
        
        char operation;
        
        double inputTextFieldNumber;
        
        //If statement that checks what the text of inputLabel is. Changes operation based on result. This changes how calculations proceed.
        if(savedInputLabel.equals("Degrees")) {
            operation = 'd';
        }
        else {
            operation = 'r';
        }
        
        //Try/Catch statement. This is in place to make sure the program wont crash if a mistake is made.
        //The try block, converts a string to a double, creates an instance of the Exchanger class with said double and the operation which was found above.
        //Then the value of clacNumber is found and turned back into a string, so that i can appear in a textField.
        try 
        {
            inputTextFieldNumber = Double.parseDouble(savedInputTextField); //Takes string and turns it into a double
            Exchanger calc = new Exchanger(inputTextFieldNumber, operation);
            String newNumber = String.valueOf(calc.calcNumber);
            outputTextField.setText(newNumber);
        }
        // The exception block prints the exception to the console for potential troubleshooting, meanwhile changing the outputTextField to a guide.
        catch(Exception e) 
        {
            System.out.println(e);
            outputTextField.setText("Error, Only use 1-9 and '.' for seperations");
        }
    }//GEN-LAST:event_calcBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcBtn;
    private javax.swing.JPanel calculatorPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JButton switchBtn;
    // End of variables declaration//GEN-END:variables
}
