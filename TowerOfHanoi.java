import java.util.Scanner;
public class TowerOfHanoi{
    static long moveCount = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("        TOWER OF HANOI SOLUTION");
        System.out.println("=======================================");
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        System.out.println("\nSource Rod      : A");
        System.out.println("Helper Rod      : B");
        System.out.println("Destination Rod : C\n");
        System.out.println("Steps to solve the Tower of Hanoi:\n");
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
        System.out.println("\n=======================================");
        System.out.println("Total number of moves: " + moveCount);
        System.out.println("Minimum moves needed : " + (long)(Math.pow(2, numberOfDisks) - 1));
        System.out.println("=======================================");
        scanner.close();
    }
    private static void solveHanoi(int n, char source, char helper, char destination) {
        if (n == 0) {
            return;
        }
        solveHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        moveCount++;
        solveHanoi(n - 1, helper, source, destination);
    }
}
