1 import java.util.Scanner;
2
3	class Main {
4  public static void main(String[] args) {
5 
6    double raio, area;
7 
8   Scanner input = new Scanner(System.in);
9 
10    raio = input.nextDouble();
11 
12    area = 3.14159 * (raio * raio);
13 
14    System.out.printf("A=%.4f\n", area);
15 
16  }
17 }
