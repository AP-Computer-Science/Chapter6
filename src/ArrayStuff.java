public class ArrayStuff {
    public static void main(String[] args) {
        int result = 0;
        int[] numbers = new int[10];
        numbers[0] = 5;
        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] * 2;
            if(numbers[i] % 3 == 0 || numbers[i] == 2) {
                numbers[i - 1] = numbers[i] / 2;
            }
            result += numbers[i];
        }
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + result);
        }
    }
}