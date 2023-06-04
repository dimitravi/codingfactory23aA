package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FrogApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the distance D the frog can jump: ");
            int jumpDistance = sc.nextInt();
            System.out.print("Enter the distance between point X and point Y: ");
            int riverDistance = sc.nextInt();
            int numJumps = 0;
            for (int i = 0; i < riverDistance; i += jumpDistance) {
                numJumps++;
            }
            System.out.println("The frog needs to make " + numJumps + " jumps to cross the river.");
        }
    }

