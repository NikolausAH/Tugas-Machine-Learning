package com.example.demo;

import org.jfree.ui.RefineryUtilities;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        Double Alpha = 0.8; //ganti alpha disini

        Error epoch = new Error();
        Dataset dataset = new Dataset();
        Integer i = 0;
        Integer j = 0;
        Integer z = 1;
        while (i < 60) {
            Double jumlahError = 0.0;
            while (j < 100) {
                Double h = ((dataset.getX1(j) * dataset.getTheta1()) + (dataset.getX2(j) * dataset.getTheta2()) +
                        (dataset.getX3(j) * dataset.getTheta3()) + (dataset.getX4(j) * dataset.getTheta4()) + dataset.getBias());
                dataset.setH(h);
                Double sigmoid = (1 / (1 + Math.exp(-h)));
                dataset.setSigmoid(j, sigmoid);
                Double error = (sigmoid - dataset.getKelas(j)) * (sigmoid - dataset.getKelas(j));
                dataset.setError(j, error);
                if (sigmoid > 0.5) {
                    dataset.setPrediksi(j, 1);
                }
                else dataset.setPrediksi(j,0);
                Double deltaTheta1 = 2*(sigmoid-dataset.getKelas(j))*(1-sigmoid)*sigmoid*dataset.getX1(j);
                Double deltaTheta2 = 2*(sigmoid-dataset.getKelas(j))*(1-sigmoid)*sigmoid*dataset.getX2(j);
                Double deltaTheta3 = 2*(sigmoid-dataset.getKelas(j))*(1-sigmoid)*sigmoid*dataset.getX3(j);
                Double deltaTheta4 = 2*(sigmoid-dataset.getKelas(j))*(1-sigmoid)*sigmoid*dataset.getX4(j);
                Double deltaBias = 2*(sigmoid-dataset.getKelas(j))*(1-sigmoid)*sigmoid;
                Double theta1Baru = dataset.getTheta1()-(Alpha*deltaTheta1);
                Double theta2Baru = dataset.getTheta2()-(Alpha*deltaTheta2);
                Double theta3Baru = dataset.getTheta3()-(Alpha*deltaTheta3);
                Double theta4Baru = dataset.getTheta4()-(Alpha*deltaTheta4);
                Double biasBaru = dataset.getBias()-(Alpha*deltaBias);
                dataset.setTheta1(theta1Baru);
                dataset.setTheta2(theta2Baru);
                dataset.setTheta3(theta3Baru);
                dataset.setTheta4(theta4Baru);
                dataset.setBias(biasBaru);
                jumlahError = jumlahError+error;
                j = j + 1;
            }
            System.out.println("Epoch"+(i+1)+": "+jumlahError);
            epoch.error[i]=jumlahError;
            j=0;
            i = i + 1;
        }
        final XYSeriesDemo demo = new XYSeriesDemo("XY Series Demo");
        while (z<=60){
            demo.set(z+0.000000001,epoch.error[z]);
            z=z+1;
        }
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
