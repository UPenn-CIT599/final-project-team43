package main.java;

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
public class CapitalChart extends JFrame{
	 private static final long serialVersionUID = 6294689542092367723L;

	 public CapitalChart(String title) {
	    super(title);

	    // Create dataset
	    XYDataset dataset = createDataset();

	    // Create chart
	    JFreeChart chart = ChartFactory.createXYLineChart(
	        "XY Line Chart Example",
	        "X-Axis",
	        "Y-Axis",
	        dataset,
	        PlotOrientation.VERTICAL,
	        true, true, false);

	    // Create Panel
	    ChartPanel panel = new ChartPanel(chart);
	    setContentPane(panel);
	  }

	  private XYDataset createDataset() {
	    XYSeriesCollection dataset = new XYSeriesCollection();

	    CapitalCalculator c = new CapitalCalculator(25, 65, 100, 30000, 48000);
	    System.out.println(c.calMinYieldYearly());
	    double yearlyIntRate = c.calMinYieldYearly();
	    ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(30000, yearlyIntRate);
	    
	    XYSeries series = new XYSeries("Capital Series");
	    for (CapitalSeries CapitalSerie : capitalSeries) {
	    	series.add(Integer.parseInt(CapitalSerie.dateStr.substring(0,4)), CapitalSerie.capital);
	    }
//	    series.add(2, 4);
//	    series.add(8, 10);
//	    series.add(10, 12);
//	    series.add(13, 15);
//	    series.add(17, 19);
//	    series.add(18, 20);
//	    series.add(21, 23);

	    //Add series to dataset
	    dataset.addSeries(series);
	    
	    return dataset;
	  }

	  public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	    	CapitalChart example = new CapitalChart("XY Chart Example | BORAJI.COM");
	      example.setSize(800, 400);
	      example.setLocationRelativeTo(null);
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      example.setVisible(true);
	    });
	  }
}

