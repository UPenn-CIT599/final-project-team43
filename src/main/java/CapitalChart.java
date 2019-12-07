
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * display the chart of capital flows in line charts
 *
 * @author Haotian Zhang
 *
 */
public class CapitalChart extends JFrame {

  private static final long serialVersionUID = 6294689542092367723L;
  int currentAge;
  int expectedRetirementAge;
  int expectedLongevity;
  int targetYearlyRevenue;
  int targetYearlySaving;

  /**
   * Constructor: five variables of integers
   *
   * @param currentAge
   * @param expectedRetirementAge
   * @param expectedLongevity
   * @param savingYearly
   * @param revenueYearly
   */
  public CapitalChart(String title, int currentAge, int expectedRetirementAge,
          int expectedLongevity, int savingYearly, int revenueYearly) {
    super(title);

    this.currentAge = currentAge;
    this.expectedRetirementAge = expectedRetirementAge;
    this.expectedLongevity = expectedLongevity;
    this.targetYearlyRevenue = revenueYearly;
    this.targetYearlySaving = savingYearly;
    // Create dataset
    XYDataset dataset = createDataset();

    // Create chart
    JFreeChart chart = ChartFactory.createXYLineChart(
            "Saving Projections",
            "X-Axis: Age",
            "Y-Axis: Amount of Total Saving",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    // Create Panel
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }

  /**
   * define what's for the x and y
   * @return XYDataSet
   */
  private XYDataset createDataset() {
    XYSeriesCollection dataset = new XYSeriesCollection();

    CapitalCalculator c = new CapitalCalculator(this.currentAge,
            this.expectedRetirementAge,
            this.expectedLongevity,
            this.targetYearlySaving,
            this.targetYearlyRevenue);
    System.out.println(this.currentAge);
    System.out.println(c.calMinYieldYearly());
    double yearlyIntRate = c.calMinYieldYearly();
    ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(this.targetYearlySaving, yearlyIntRate);
    
    
    XYSeries series = new XYSeries("At retirement age, with " + new DecimalFormat("#.#").format(yearlyIntRate*100) + "%, savings will allow an annual income of $"+ 
    								this.targetYearlyRevenue +" until the expected age of death of " +
    								this.expectedLongevity + " years");
    for (CapitalSeries CapitalSerie : capitalSeries) {
    	int yearsSinceNow = Integer.parseInt(CapitalSerie.dateStr.substring(0, 4)) - 2019;
    	int age = currentAge + yearsSinceNow;
      series.add(age, CapitalSerie.capital);
    }

    //Add series to dataset
    dataset.addSeries(series);
    return dataset;
  }

  /**
   * display the chart with parameters and a given title
   */
  public void display() {
    SwingUtilities.invokeLater(() -> {
      CapitalChart example = new CapitalChart("Retirement Savings Illustration",
              this.currentAge,
              this.expectedRetirementAge,
              this.expectedLongevity,
              this.targetYearlySaving,
              this.targetYearlyRevenue);
      example.setSize(800, 400);
      example.setLocationRelativeTo(null);
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      example.setVisible(true);
    });
  }
}
