
import javax.swing.JOptionPane;
import lombok.Getter;

/**
 * This form is to ask the user for their planned retirement age (65+), how much annual savings they
 * have and their target annual retirement income, i.e. how much they want to earn during their
 * retirement years. It then calculates the minimum interest rate required to invest those savings
 * in order to achieve their target retirement plan.
 *
 * @author Songqi(Sally) Li
 */
@Getter
public class CapitalForm extends javax.swing.JFrame {

  int currentAge;
  int lifeExpectancy;
  int lifeTime;

  /**
   * Creates new form NewJFrame
   *
   * @param expectancy
   * @param currentAge
   */
  public CapitalForm(int expectancy, int currentAge) {
    initComponents();
    this.currentAge = currentAge;
    this.lifeExpectancy = expectancy;
    this.lifeTime = lifeExpectancy + currentAge;
    LifeTime.setText(String.valueOf("Based on your current age and gender, your expected age of death is age " + this.lifeTime + ". We will use this in the calculation of your retirement savings."));
  }

  /**
   * This method is called from within the constructor to initialize the form.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lifeExpendency = new javax.swing.JLabel();
    expectancy = new javax.swing.JLabel();
    next = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    yearlyRevenue = new javax.swing.JTextField();
    yealySaving = new javax.swing.JTextField();
    retirementAge = new javax.swing.JComboBox<>();
    LifeTime = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(102, 102, 102));
    setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N

    next.setForeground(new java.awt.Color(0, 102, 51));
    next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 0), java.awt.Color.gray, new java.awt.Color(0, 102, 0)));
    next.setLabel("SUBMIT");
    next.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nextActionPerformed(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(0, 75, 23));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Canadian Retirement Income Calculator - General Information");

    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculatorIcon.png"))); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(112, 112, 112)
        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(89, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(17, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel2.setText("Retirement Age*");

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel3.setText("What would you like to set as your target annual retirement income?*");

    jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel5.setText("What is your expected annual savings until retirement age?*");

    retirementAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
            .addComponent(yealySaving, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(yearlyRevenue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(retirementAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(retirementAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addGap(0, 0, 0)
        .addComponent(yearlyRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(yealySaving, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    LifeTime.setForeground(new java.awt.Color(204, 0, 51));
    LifeTime.setText("-");

    jPanel3.setBackground(new java.awt.Color(204, 204, 204));

    jLabel7.setBackground(new java.awt.Color(153, 153, 153));
    jLabel7.setForeground(new java.awt.Color(0, 102, 0));
    jLabel7.setText("<html> Your saving and retirement.income will depend  on your age and life expectancy.<br>  If you have more  years of saving than retirement, a reasonable  retirement income should be larger than your savings. </html>");
    jLabel7.setToolTipText("");
    jLabel7.setRequestFocusEnabled(false);
    jLabel7.setSize(new java.awt.Dimension(100, 16));

    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warningIcon.png"))); // NOI18N

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(138, 138, 138)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel9)
        .addGap(0, 160, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap(12, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(37, 37, 37))
    );

    jLabel7.getAccessibleContext().setAccessibleName("Your saving and retirement income will depend  on your age and life expectancy. \nIf you have more  years of saving than retirement, a reasonable  retirement income should be larger than your savings.");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(LifeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lifeExpendency, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(expectancy, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addComponent(expectancy)
                .addGap(0, 0, 0)
                .addComponent(lifeExpendency)))
            .addGap(22, 22, 22)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15))
          .addGroup(layout.createSequentialGroup()
            .addComponent(LifeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36))))
    );

    setBounds(0, 0, 1000, 362);
  }// </editor-fold>//GEN-END:initComponents

  private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    try {
      Integer ExpectedYealySaving = Integer.valueOf(yealySaving.getText());
      if (ExpectedYealySaving <= 0) {
        JOptionPane.showMessageDialog(jPanel2, "Please enter a positive integer value for expected annual savings");
        return;
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(jPanel2, "Please enter a positive integer value for expected annual savings");
      return;
    }

    try {
      Integer ExpectedYealyRevenue = Integer.valueOf(yearlyRevenue.getText());
      if (ExpectedYealyRevenue <= 0) {
        JOptionPane.showMessageDialog(jPanel2, "Please enter a positive integer value for target annual retirement income");
        return;
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(jPanel2, "Please enter a positive integer value for target annual retirement income");
      return;
    }

    Integer expectedRetirementAge = Integer.valueOf(retirementAge.getSelectedItem().toString());

    CapitalCalculator c = new CapitalCalculator(currentAge, expectedRetirementAge, lifeTime, Integer.valueOf(yealySaving.getText()), Integer.valueOf(yearlyRevenue.getText()));
    System.out.println("This is min interest rate " + c.calMinYieldYearly());
    CapitalChart Jchart = new CapitalChart("Saving Projections", currentAge, expectedRetirementAge, lifeTime, Integer.valueOf(yealySaving.getText()), Integer.valueOf(yearlyRevenue.getText()));
//    //  ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(Integer.valueOf(yearlyRevenue.getText()), yearlyIntRate);
    Jchart.display();
  }//GEN-LAST:event_nextActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel LifeTime;
  private javax.swing.JLabel expectancy;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel lifeExpendency;
  private javax.swing.JButton next;
  private javax.swing.JComboBox<String> retirementAge;
  private javax.swing.JTextField yealySaving;
  private javax.swing.JTextField yearlyRevenue;
  // End of variables declaration//GEN-END:variables
}
