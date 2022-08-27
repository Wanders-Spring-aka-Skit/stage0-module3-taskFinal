package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstN = number / 1000;
        int secondN = (number % 1000) / 100;
        int thirdN = ((number % 1000) % 100) / 10;
        int fourthN = ((number % 1000) % 100) % 10;
        System.out.println(firstN + secondN + thirdN + fourthN);
    }
}
