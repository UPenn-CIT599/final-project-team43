
import javax.swing.JButton;

/**
 * This form is to ask the user for their age and gender and it will then calculate the expected age
 * of death
 *
 * @author Songqi(Sally) Li
 */
public class LifeExpectancyForm extends javax.swing.JFrame {

  private int expectancy;
  private CapitalForm capitalForm;

  /**
   * this method is to return the capital form
   *
   * @return
   */
  public CapitalForm getCapitalForm() {
    return capitalForm;
  }

  /**
   * this method is to return the next button
   *
   * @return
   */
  public JButton getNext() {
    return next;
  }

  /**
   * Creates form LifeExpectanctyForm
   */
  public LifeExpectancyForm() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    lifeTime = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    gender = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    currentAge = new javax.swing.JComboBox<>();
    next = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(0, 70, 23));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Canadian Retirement Income Calculator - General Information");

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculatorIcon.png"))); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(76, 76, 76)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        .addGap(59, 59, 59))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(17, 17, 17))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel5.setText("                                           Answers to fields and questions with an asterisk (*) are mandatory.");

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel2.setText("Gender*");

    gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel3.setText("Current Age*");

    currentAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64" }));

    next.setBackground(new java.awt.Color(0, 102, 0));
    next.setForeground(new java.awt.Color(0, 102, 102));
    next.setText("Next");
    next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 0), null, new java.awt.Color(0, 102, 0)));
    next.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nextActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(gender, 0, 147, Short.MAX_VALUE)
          .addComponent(currentAge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(266, 266, 266))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(346, 346, 346)
        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(currentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addGap(24, 24, 24)
        .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(84, 84, 84)
            .addComponent(lifeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel5)))
        .addGap(0, 0, Short.MAX_VALUE))
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lifeTime)
        .addGap(18, 18, 18))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
/**
   * User inputs the data and click "next" button to perform action
   *
   * @param evt
   */
  private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    LifeExpectancy le = new LifeExpectancy("rate.csv");
    Integer age = Integer.valueOf(currentAge.getSelectedItem().toString());
    expectancy = le.calculateEx(gender.getSelectedItem().toString(), age); //calculate the life expectancy
    this.capitalForm = new CapitalForm(expectancy, age);
    this.capitalForm.setVisible(true); //second form opens
    this.setVisible(false);//hide the first form when the second form opens
  }//GEN-LAST:event_nextActionPerformed

  /**
   * get the expectancy value
   *
   * @return
   */
  public int getExpectancy() {
    return expectancy;
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> currentAge;
  private javax.swing.JComboBox<String> gender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lifeTime;
  private javax.swing.JButton next;
  // End of variables declaration//GEN-END:variables
}
