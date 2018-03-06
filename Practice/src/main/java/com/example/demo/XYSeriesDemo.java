package com.example.demo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class XYSeriesDemo extends ApplicationFrame {
    final XYSeries series = new XYSeries("Grafik antara jumlah error dan epoch dengan alpha 0,8");
    final XYSeries series2 = new XYSeries("Grafik dummy");
    public XYSeriesDemo(String title) {
        super(title);
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final XYSeriesCollection data2 = new XYSeriesCollection(series2);
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Series Demo",
                "X",
                "Y",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    public void set(Double x,Double y){
    series.add(x,y);

    }
    }
