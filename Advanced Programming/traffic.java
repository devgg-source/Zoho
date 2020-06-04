import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

// public void run() {

// try {
// // Displaying the thread that is running
// Thread.sleep(100);

// } catch (Exception e) {
// // Throwing an exception
// System.out.println("Exception is caught");
// }
// }

// class Linkedlist {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// Node GetNode(int data) {
// return new Node(data);
// }

// void emergency(int new_data) {
// Node new_node = new Node(new_data);
// new_node.next = head;
// head = new_node;
// }

// void landing(int data) {
// int c = 1;
// Node temp = head;
// while ((temp.data == 3 || temp.data == 2) && temp != null) {
// temp = temp.next;
// c++;
// }
// if (c > 2) {
// while (c-- != 0) {
// if (c == 1) {
// Node newNode = GetNode(data);
// newNode.next = head.next;
// head.next = newNode;
// break;
// }
// head = head.next;
// }
// } else {
// emergency(data);
// }
// }

// void takeoff(int data) {
// Node new_node = new Node(data);
// if (head == null) {
// head = new Node(data);
// return;
// }
// new_node.next = null;
// Node last = head;
// while (last.next != null)
// last = last.next;

// last.next = new_node;
// return;
// }

// void print() {
// Node tnode = head;
// while (tnode != null) {
// System.out.println(tnode.data);
// tnode = tnode.next;
// }
// }
// }
public class MultithreadingDemo implements Runnable {

    MultithreadingDemo(double k, int s) {

        Thread.sleep((int) k * 1000);
        runArr[s] = 0;

    }
}

public class traffic extends MultithreadingDemo {

    static float cal(int wei, int fwei) {
        float f = ((float) (fwei) / wei) * 100;
        // System.out.println(f);
        return f;
    }

    public static void main(String args[]) throws IOException {
        // String[] flightName = new String[] { "ATR", "AIRBUS", "BOIENG", "CARGO" };
        // int flightWeight[] = new int[] { 12, 20, 40, 100 };
        // int fTakeoff[] = new int[] { 30, 40, 50, 60 };
        HashMap<String, Integer> weight = new HashMap<>();
        weight.put("ATR", 12);
        weight.put("AIRBUS", 20);
        weight.put("BOIENG", 40);
        weight.put("CARGO", 100);
        HashMap<String, Integer> runway = new HashMap<>();
        runway.put("Runway1", 40);
        runway.put("Runway2", 60);
        runway.put("Runway3", 80);
        runway.put("Runway4", 90);
        HashMap<String, Integer> time = new HashMap<>();
        time.put("ATR", 30);
        time.put("AIRBUS", 40);
        time.put("BOIENG", 50);
        time.put("CARGO", 60);
        int c;
        Scanner sc = new Scanner(System.in);

        // Linkedlist li = new Linkedlist();
        do {

            System.out.println("Request");
            System.out.println("1.Take off request   2.Landing request   3.Emergency landing request");
            System.out.println("what is your request");
            int req = sc.nextInt();

            // if (req == 3) {

            // li.emergency(req);
            // } else if (req == 2) {
            // li.landing(req);
            // } else {
            // li.takeoff(req);
            // }

            System.out.println("Plane Types");
            System.out.println("1.ATR  2.Airbus  3.Boieng  4.Cargo");
            System.out.println("Select the type of Plane");
            String type = sc.next();

            System.out.println("Plane weight");
            System.out.println("1.>15 tones   2.10-15 tones  3.<10tonnes");
            int fweight = sc.nextInt();
            System.out.println("do u want to continue");
            c = sc.nextInt();
            int runArr[] = new int[] { 0, 0, 0, 0 };
            // li.print();

            // switch (req) {
            // case 1:
            // takeoff();
            // case 2:
            // landing();
            // case 3:
            // emergency();
            // }
            int m = weight.get(type);
            // System.out.println(m);
            System.out.println(fweight);

            float l = cal(fweight, m);
            // System.out.println(l);
            double k = time.get(type);
            double d;
            if (l >= 50 && l < 75) {
                d = 0.1 * k;
                k = k - d;
            } else {
                d = 0.2 * k;
                k = k - d;
            }

            int s;
            if (k <= time.get("RUNWAY1") && runArr[0] != 1) {
                runArr[0] = 1;
                s = 0;
            } else if (k <= time.get("RUNWAY2") && runArr[1] != 1) {
                runArr[1] = 1;
                s = 1;
            } else if (k < time.get("RUNWAY3") && runArr[2] != 1) {
                runArr[2] = 1;
                s = 2;
            } else {
                runArr[3] = 1;
                s = 3;
            }
            MultithreadingDemo m1 = new MultithreadingDemo(k, s);
            new Thread(m1).start();
            for (int i = 0; i < 4; i++) {
                System.out.println(runArr[i]);
            }

        } while (c == 1);
        // System.out.println(k);

        sc.close();
    }
}