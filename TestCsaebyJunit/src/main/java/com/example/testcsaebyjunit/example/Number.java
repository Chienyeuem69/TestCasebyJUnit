package com.example.testcsaebyjunit.example;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Number {
    private long a;
    private long b;
    private long c;

    public Number() {
    }

    public Number(int i, int i1, int i2) {
        this.a = i;
        this.b = i1;
        this.c = i2;
    }


    public String giaiphuongtrinhbac2() {
        var a = getA();
        var b = getB();
        var c = getC();

        if (a == 0) {
            if (b == 0) {
                return "Phương trình vô nghiệm!";
            } else {
                return "Phương trình có một nghiệm: "
                        + "x = " + (-c / b);
            }
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            return "Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return "Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1;
        } else {
            return "Phương trình vô nghiệm!";
        }
    }



    public String giaiphuongtrinhbac2(long a,long b, long c){

        if (a == 0) {
            if (b == 0) {
                return "Phương trình vô nghiệm!";
            } else {
                return "Phương trình có một nghiệm: "
                        + "x = " + (-c / b);
            }
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            return "Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return "Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1;
        } else {
            return "Phương trình vô nghiệm!";
        }


    }
}

