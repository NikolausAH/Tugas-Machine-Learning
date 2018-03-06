package com.example.demo;

public class Dataset2 {
    public Integer getKelas(int i) {
        return Kelas[i];
    }
    public void setError(int i, Double x1) {
        error[i] = x1;
    }

    public void setPrediksi(int i, Integer x1) {
        prediksi[i] = x1;
    }

    public Double getX1(int i) {
        return X1[i];
    }

    public Double getX2(int i) {
        return X2[i];
    }

    public Double getX3(int i) {
        return X3[i];
    }

    public Double getX4(int i) {
        return X4[i];
    }

    public Integer getKelasValidasi(int i) {
        return KelasValidasi[i];
    }
    public void setErrorValidasi(int i, Double x1) {
        errorValidasi[i] = x1;
    }

    public void setPrediksiValidasi(int i, Integer x1) {
        prediksiValidasi[i] = x1;
    }

    public Double getX1Validasi(int i) {
        return X1Validasi[i];
    }

    public Double getX2Validasi(int i) {
        return X2Validasi[i];
    }

    public Double getX3Validasi(int i) {
        return X3Validasi[i];
    }

    public Double getX4Validasi(int i) {
        return X4Validasi[i];
    }

    public void setH(Double hBaru) {
        h = hBaru;
    }

    public double getTheta1() {
        return theta1;
    }

    public void setTheta1(double theta1) {
        this.theta1 = theta1;
    }

    public double getTheta2() {
        return theta2;
    }

    public void setTheta2(double theta2) {
        this.theta2 = theta2;
    }

    public double getTheta3() {
        return theta3;
    }

    public void setTheta3(double theta3) {
        this.theta3 = theta3;
    }

    public double getTheta4() {
        return theta4;
    }

    public void setTheta4(double theta4) {
        this.theta4 = theta4;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    Double[] X1 = {
            5.1,
            4.9,
            4.7,
            4.6,
            5.00,
            5.4,
            4.6,
            5.00,
            4.4,
            4.9,
            5.4,
            4.8,
            4.8,
            4.3,
            5.8,
            5.7,
            5.4,
            5.1,
            5.7,
            5.1,
            5.4,
            5.1,
            4.6,
            5.1,
            4.8,
            5.00,
            5.00,
            5.2,
            5.2,
            4.7,
            4.8,
            5.4,
            5.2,
            5.5,
            4.9,
            5.00,
            5.5,
            4.9,
            4.4,
            5.1,
            7.00,
            6.4,
            6.9,
            5.5,
            6.5,
            5.7,
            6.3,
            4.9,
            6.6,
            5.2,
            5.00,
            5.9,
            6.00,
            6.1,
            5.6,
            6.7,
            5.6,
            5.8,
            6.2,
            5.6,
            5.9,
            6.1,
            6.3,
            6.1,
            6.4,
            6.6,
            6.8,
            6.7,
            6.00,
            5.7,
            5.5,
            5.5,
            5.8,
            6.00,
            5.4,
            6.00,
            6.7,
            6.3,
            5.6,
            5.5
    };
    Double[] X2 = {
            3.5,
            3.00,
            3.2,
            3.1,
            3.6,
            3.9,
            3.4,
            3.4,
            2.9,
            3.1,
            3.7,
            3.4,
            3.00,
            3.00,
            4.00,
            4.4,
            3.9,
            3.5,
            3.8,
            3.8,
            3.4,
            3.7,
            3.6,
            3.3,
            3.4,
            3.00,
            3.4,
            3.5,
            3.4,
            3.2,
            3.1,
            3.4,
            4.1,
            4.2,
            3.1,
            3.2,
            3.5,
            3.1,
            3.00,
            3.4,
            3.2,
            3.2,
            3.1,
            2.3,
            2.8,
            2.8,
            3.3,
            2.4,
            2.9,
            2.7,
            2.00,
            3.00,
            2.2,
            2.9,
            2.9,
            3.1,
            3.00,
            2.7,
            2.2,
            2.5,
            3.2,
            2.8,
            2.5,
            2.8,
            2.9,
            3.00,
            2.8,
            3.00,
            2.9,
            2.6,
            2.4,
            2.4,
            2.7,
            2.7,
            3.00,
            3.4,
            3.1,
            2.3,
            3.00,
            2.5
    };
    Double[] X3 = {
            1.4,
            1.4,
            1.3,
            1.5,
            1.4,
            1.7,
            1.4,
            1.5,
            1.4,
            1.5,
            1.5,
            1.6,
            1.4,
            1.1,
            1.2,
            1.5,
            1.3,
            1.4,
            1.7,
            1.5,
            1.7,
            1.5,
            1.00,
            1.7,
            1.9,
            1.6,
            1.6,
            1.5,
            1.4,
            1.6,
            1.6,
            1.5,
            1.5,
            1.4,
            1.5,
            1.2,
            1.3,
            1.5,
            1.3,
            0.5,
            4.7,
            4.5,
            4.9,
            4.00,
            4.6,
            4.5,
            4.7,
            3.3,
            4.6,
            3.9,
            3.5,
            4.2,
            4.00,
            4.7,
            3.6,
            4.4,
            4.5,
            4.1,
            4.5,
            3.9,
            4.8,
            4.00,
            4.9,
            4.7,
            4.3,
            4.4,
            4.8,
            5.00,
            4.5,
            3.5,
            3.8,
            3.7,
            3.9,
            5.1,
            4.5,
            4.5,
            4.7,
            4.4,
            4.1,
            4.00

    };
    Double[] X4 = {
            0.2,
            0.2,
            0.2,
            0.2,
            0.2,
            0.4,
            0.3,
            0.2,
            0.2,
            0.1,
            0.2,
            0.2,
            0.1,
            0.1,
            0.2,
            0.4,
            0.4,
            0.3,
            0.3,
            0.3,
            0.2,
            0.4,
            0.2,
            0.5,
            0.2,
            0.2,
            0.4,
            0.2,
            0.2,
            0.2,
            0.2,
            0.4,
            0.1,
            0.2,
            0.1,
            0.2,
            0.2,
            0.1,
            0.2,
            0.2,
            1.4,
            1.5,
            1.5,
            1.3,
            1.5,
            1.3,
            1.6,
            1.00,
            1.3,
            1.4,
            1.00,
            1.5,
            1.00,
            1.4,
            1.3,
            1.4,
            1.5,
            1.00,
            1.5,
            1.1,
            1.8,
            1.3,
            1.5,
            1.2,
            1.3,
            1.4,
            1.4,
            1.7,
            1.5,
            1.00,
            1.1,
            1.00,
            1.2,
            1.6,
            1.5,
            1.6,
            1.5,
            1.3,
            1.3,
            1.3
    };
    Integer[] Kelas = {
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
    };

    Double[] X1Validasi = {
            5.00,
            4.5,
            4.4,
            5.00,
            5.1,
            4.8,
            5.1,
            4.6,
            5.3,
            5.00,
            5.5,
            6.1,
            5.8,
            5.00,
            5.6,
            5.7,
            5.7,
            6.2,
            5.1,
            5.7
    };
    Double[] X2Validasi = {
            3.5,
            2.3,
            3.2,
            3.5,
            3.8,
            3.00,
            3.8,
            3.2,
            3.7,
            3.3,
            2.6,
            3.00,
            2.6,
            2.3,
            2.7,
            3.00,
            2.9,
            2.9,
            2.5,
            2.8

    };
    Double[] X3Validasi = {
            1.3,
            1.3,
            1.3,
            1.6,
            1.9,
            1.4,
            1.6,
            1.4,
            1.5,
            1.4,
            4.4,
            4.6,
            4.00,
            3.3,
            4.2,
            4.2,
            4.2,
            4.3,
            3.00,
            4.1

    };
    Double[] X4Validasi = {
            0.3,
            0.3,
            0.2,
            0.6,
            0.4,
            0.3,
            0.2,
            0.2,
            0.2,
            0.2,
            1.2,
            1.4,
            1.2,
            1.00,
            1.3,
            1.2,
            1.3,
            1.3,
            1.1,
            1.3
    };
    Integer[] KelasValidasi = {
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
    };


    private double theta1 = 0.2;
    private double theta2 = 0.8;
    private double theta3 = 0.5;
    private double theta4 = 0.4;
    private double bias = 0.6;
    private double h;
    private int[] prediksi = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    };
    private Double[] sigmoid = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
    };
    private double[] error = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
    };
    private int[] prediksiValidasi = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    };
    private Double[] sigmoidValidasi = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
    };
    private double[] errorValidasi = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
    };
    ;

    public double getSigmoid(int i) {
        return sigmoid[i];
    }

    public void setSigmoid(int i, double sigmoid) {
        this.sigmoid[i] = sigmoid;
    }
    public double getSigmoidValidasi(int i) {
        return sigmoidValidasi[i];
    }

    public void setSigmoidValidasi(int i, double sigmoid) {
        this.sigmoidValidasi[i] = sigmoid;
    }
}
