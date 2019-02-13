public class QuizTime {
    public static void main(String[] args) {
        Quiz q = new Quiz(8);
        q.addQuestion(new Question("Given the integers of 101 (Base 2) + BF (Base 16). What is the value when converted to base 10?", "196"));
        q.addQuestion(new Question("Consider the following number (Base 2): 1001101. What would the new value be when the ~ operator is applied?", "0110010"));
        q.addQuestion(new Question("Consider the following expression:\nint a = 255;\n\nWhat would the following statement print? System.out.println(a << 2)", "1020"));
        q.addQuestion(new Question("True or false: An AES initialization vector should be secured along with the private key.", "F"));
        q.addQuestion(new Question("True or false: A bit shift is fast because it utilizes the CPU's bit register.", "T"));
        q.addQuestion(new Question("True or false: Modular arithmetic is used in RSA encryption.", "T"));
        q.addQuestion(new Question("True or false: Interrupt 16h provides mouse support.", "F"));
        q.addQuestion(new Question("Tim is creating a mini computer using an EPROM IC. If he needs to reprogram his computer, what should he do?"
                                  + "\n"
                                  + "A. Make the flash pin high.\n"
                                  + "B. Put it under the sun.\n"
                                  + "C. Solder a new chip on the old package.", "B"));
        q.giveQuiz();
    }
}