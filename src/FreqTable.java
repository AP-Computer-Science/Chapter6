public class FreqTable {
    public static final int UPPER = 26;
    public static final int LOWER = 26;
    public static void main(String[] args) {
        int[] sampleData = new int[UPPER + LOWER];
        //Populate Upper Data.
        for(int i = 0; i < 10; i++) {
            for(int t = 0; t < sampleData.length - UPPER; t++) {
                sampleData[(int)(Math.random() * UPPER)]++;
            }
        }
        //Populate lower data.
        for(int i = 0; i < 10; i++) {
            for(int t = LOWER; t < sampleData.length; t++) {
                sampleData[(int)(Math.random() * UPPER + LOWER)]++;
            }
        }
        for(int i = LOWER - 1; i > 0; i--) {
            int newI = i - LOWER;
            System.out.print(newI + ": ");
            if(newI >= -9) {
                System.out.print(" ");
            }
            for(int c = 0; c < sampleData[i]; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < UPPER; i++) {
            System.out.print(i + ":  ");
            if(i <= 9) {
                System.out.print(" ");
            }
            for(int c = 0; c < sampleData[i]; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}