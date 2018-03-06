package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class Overfitting {
    public static void main(String[] args) {

        Double Alpha = 0.1;
        Error epoch = new Error();
        Dataset2 dataset = new Dataset2();
        Integer i = 0;
        Integer j = 0;
        Integer z = 1;
        while (i < 60) {
            Double jumlahError = 0.0;
            while (j < 80) {
                Double h = ((dataset.getX1(j) * dataset.getTheta1()) + (dataset.getX2(j) * dataset.getTheta2()) +
                        (dataset.getX3(j) * dataset.getTheta3()) + (dataset.getX4(j) * dataset.getTheta4()) + dataset.getBias());
                dataset.setH(h);
                Double sigmoid = (1 / (1 + Math.exp(-h)));
                dataset.setSigmoid(j, sigmoid);
                Double error = (sigmoid - dataset.getKelas(j)) * (sigmoid - dataset.getKelas(j));
                dataset.setError(j, error);
                if (sigmoid > 0.5) {
                    dataset.setPrediksi(j, 1);
                } else dataset.setPrediksi(j, 0);
                Double deltaTheta1 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX1(j);
                Double deltaTheta2 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX2(j);
                Double deltaTheta3 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX3(j);
                Double deltaTheta4 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX4(j);
                Double deltaBias = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid;
                Double theta1Baru = dataset.getTheta1() - (Alpha * deltaTheta1);
                Double theta2Baru = dataset.getTheta2() - (Alpha * deltaTheta2);
                Double theta3Baru = dataset.getTheta3() - (Alpha * deltaTheta3);
                Double theta4Baru = dataset.getTheta4() - (Alpha * deltaTheta4);
                Double biasBaru = dataset.getBias() - (Alpha * deltaBias);
                dataset.setTheta1(theta1Baru);
                dataset.setTheta2(theta2Baru);
                dataset.setTheta3(theta3Baru);
                dataset.setTheta4(theta4Baru);
                dataset.setBias(biasBaru);
                jumlahError = jumlahError + error;
                jumlahError = jumlahError / 80;
                j = j + 1;
            }
            System.out.println("Epoch" + (i + 1) + ": " + jumlahError);
            epoch.error[i] = jumlahError;
            j = 0;
            i = i + 1;
        }

        Error epoch2 = new Error();
        i = 0;
        j = 0;
        z = 1;
        while (i < 60) {
            Double jumlahError2 = 0.0;
            while (j < 20) {
                Double h = ((dataset.getX1Validasi(j) * dataset.getTheta1()) + (dataset.getX2Validasi(j) * dataset.getTheta2()) +
                        (dataset.getX3Validasi(j) * dataset.getTheta3()) + (dataset.getX4Validasi(j) * dataset.getTheta4()) + dataset.getBias());
                dataset.setH(h);
                Double sigmoid = (1 / (1 + Math.exp(-h)));
                dataset.setSigmoid(j, sigmoid);
                Double error = (sigmoid - dataset.getKelas(j)) * (sigmoid - dataset.getKelas(j));
                dataset.setError(j, error);
                if (sigmoid > 0.5) {
                    dataset.setPrediksi(j, 1);
                } else dataset.setPrediksi(j, 0);
                Double deltaTheta1 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX1Validasi(j);
                Double deltaTheta2 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX2Validasi(j);
                Double deltaTheta3 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX3Validasi(j);
                Double deltaTheta4 = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid * dataset.getX4Validasi(j);
                Double deltaBias = 2 * (sigmoid - dataset.getKelas(j)) * (1 - sigmoid) * sigmoid;
                Double theta1Baru = dataset.getTheta1() - (Alpha * deltaTheta1);
                Double theta2Baru = dataset.getTheta2() - (Alpha * deltaTheta2);
                Double theta3Baru = dataset.getTheta3() - (Alpha * deltaTheta3);
                Double theta4Baru = dataset.getTheta4() - (Alpha * deltaTheta4);
                Double biasBaru = dataset.getBias() - (Alpha * deltaBias);
                dataset.setTheta1(theta1Baru);
                dataset.setTheta2(theta2Baru);
                dataset.setTheta3(theta3Baru);
                dataset.setTheta4(theta4Baru);
                dataset.setBias(biasBaru);
                jumlahError2 = jumlahError2 + error;
                jumlahError2 = jumlahError2 / 20;
                j = j + 1;
            }
            System.out.println("Epoch" + (i + 1) + ": " + jumlahError2);
            epoch2.error[i] = jumlahError2;
            j = 0;
            i = i + 1;
        }

        MultipleChartFactory mcf = new MultipleChartFactory("Error", "Epoch");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(mcf.getChart());
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        mcf.createAdditionalDataset();
        mcf.createAdditionalDataset();
        while (z <= 60) {
            mcf.getXYSeries(0).getSeries(0).add(z + 0000000.1, epoch.error[z]);
            mcf.getXYSeries(1).getSeries(0).add(z + 0000000.1, epoch2.error[z]);
            z = z + 1;
        }

//        mcf.getXYSeries(1).getSeries(0).add(1, 20);
//        mcf.getXYSeries(1).getSeries(0).add(2, 200);
    }
}
