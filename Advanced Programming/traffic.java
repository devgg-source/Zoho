import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

class data {

    HashMap<String, Integer> weight = new HashMap<>();

    HashMap<String, Integer> runway = new HashMap<>();

    HashMap<String, Integer> time = new HashMap<>();

    public int gettest(String key) {
        weight.put("ATR", 12);
        weight.put("AIRBUS", 20);
        weight.put("BOIENG", 40);
        weight.put("CARGO", 100);
        return weight.get(key);
    }

    public int runwa(String key) {
        runway.put("Runway1", 40);
        runway.put("Runway2", 60);
        runway.put("Runway3", 80);
        runway.put("Runway4", 90);
        return runway.get(key);
    }

    public int tim(String key) {
        time.put("ATR", 30);
        time.put("AIRBUS", 40);
        time.put("BOIENG", 50);
        time.put("CARGO", 60);
        return time.get(key);
    }

}

class print {
    void print() {
        System.out.println("Landing is approved for ");
    }
}

class MultithreadingDemo implements Runnable {
    int runArr[] = new int[] { 0, 0, 0, 0 };
    int m;
    data r = new data();

    MultithreadingDemo(double k) {

        if (r.runway.get("Runway1") >= k && runArr[0] != 1) {
            m = 0;
            runArr[0] = 1;
            Thread.sleep((int) k * 1000);
            runArr[0] = 0;
        } else if (r.runway.get("Runway2") >= k && runArr[1] != 1) {
            m = 1;
            runArr[1] = 1;
            Thread.sleep((int) k * 1000);
            runArr[1] = 0;
        } else if (r.runway.get("Runway3") >= k && runArr[2] != 1) {
            m = 1;
            runArr[2] = 1;
            Thread.sleep((int) k * 1000);
            runArr[2] = 0;
        } else if (r.runway.get("Runway4") >= k && runArr[3] != 1) {
            m = 2;
            runArr[3] = 1;
            Thread.sleep((int) k * 1000);
            runArr[3] = 0;
        }

    }

}

class exper extends data {
    Scanner sc = new Scanner(System.in);

    double cal(int m, int d) {
        if (m == 1) {
            return d;
        } else if (m == 2) {
            return d - (0.1 * d);
        } else {
            return d - (0.2 * d);
        }

    }

    void func() {
        System.out.println("1.Takeoff 2.Landing  3.Emergency");
        System.out.println("Enter Your Req");
        int req = sc.nextInt();
        System.out.println("1.ATR 2.Airbus 3.Boeing 4.Cargo");
        String flight = sc.next();
        data v = new data();
        int d = v.gettest(flight);
        System.out.println(d);
        double g = (double) 3 / 4 * (d);
        System.out.println(g);
        double b = (double) 1 / 2 * (d);
        System.out.println(b);
        System.out.println("Plane Weight");
        System.out.println("1.>" + (int) g + "tonnes 2." + (int) b + "-" + (int) g + "tonnes 3.<" + (int) b + "tonnes");
        System.out.println("Select weight of the plane");
        int m = sc.nextInt();
        int s = v.tim(flight);
        double j = cal(m, s);
        System.out.println((int) j);
        MultithreadingDemo t = new MultithreadingDemo(j);
        t.start();
        // int k = t.m;

    }
}

public class traffic {

    public static void main(String args[]) throws IOException {

        exper er = new exper();
        er.func();
    }
}
