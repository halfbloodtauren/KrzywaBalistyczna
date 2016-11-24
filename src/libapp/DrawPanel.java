package libapp;

import java.awt.Color;
import java.awt.Shape;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DrawPanel {
            
    public DrawPanel() {
        // constructor not used - for testing purposes only
//        ApplicationFrame frame = new ApplicationFrame("Quick draw");
//        JPanel woPanel = createWoPanel();  // plot is in JPanel
//        woPanel.setPreferredSize(new java.awt.Dimension(500, 270));
//        frame.setContentPane(woPanel);
//        frame.setSize(600,480);
//        frame.setVisible(true);
    }
    private static JFreeChart createChart(XYDataset dataset){
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Rezultat twierdzenia Shannona", "Pulsacja [rad]", 
                "Wartosc [1]", dataset, PlotOrientation.VERTICAL,
                true, false, false);
        chart.setBackgroundPaint(Color.lightGray);
        
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.black);
        plot.setRangeGridlinePaint(Color.black);
        
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        Shape sh = renderer.getSeriesShape(1);
        renderer.setSeriesShape(2, sh);
        renderer.setSeriesShapesVisible(2, true);
        renderer.setSeriesLinesVisible(2, false);
        //plot.setAxisOffset(new RectangleInsets(5.0,5.0,5.0, 5.0));
        return chart;
    }
    private static XYDataset createDataset() {
        int k = 250;
        XYSeries s1 = new XYSeries("Sygnal oryginalny"); 
        XYSeries s2 = new XYSeries("Sygnal odtworzony");
        XYSeries s3 = new XYSeries("Probki");
        double step = Dane.range/(double)(k);
        for (int i = 0; i < k; i++) {
            double x = i * step;
            double y1 = Math.sin(2*Math.PI*Dane.freq*x);
            double y2 = Math.sin(2*Math.PI*Dane.alias*x);
            s1.add(x, y1);
            s2.add(x, y2);
        }
        double step1 = 1.0/Dane.samp;
        int k1 = (int) (k*step/step1);
        for (int i = 0; i < k1; i++) {
            double x = i * step1;
            double y3 = Math.sin(2*Math.PI*Dane.freq*x);
            s3.add(x, y3);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        dataset.addSeries(s3);
        return dataset;
    }
    
    public static JPanel createWoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }
}

