public class AsteriskTableFive {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        //Generate random numbers
        for(int i = 0; i < (int)(Math.random() * 10000); i++) {
            numbers[(int)(Math.random() * 100)]++;
        }
        //Print asterisks
        int amount = 0;
        System.out.print("0-10: ");
        for(int i = 0; i <= 9; i++) {
            for(int c = 0; c <= numbers[i]; c++) {
                System.out.print("*");
            }
        }
        System.out.println();
        for(int i = 10; i < numbers.length; i++) {
            if(i % 10 != 0 || i == 10) {
                amount += numbers[i];
                continue;
            }
            else {
                System.out.print((i + 1) + "-" + (i + 10) + ": ");
                for(int c = 0; c <= amount; c++) {
                    System.out.print("*");
                }
                amount = 0;
                System.out.println();
            }
        }
    } 
}