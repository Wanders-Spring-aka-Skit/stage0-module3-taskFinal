package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstN = number / 100;
        int secondN = (number % 100) / 10;
        int third = number % 10;
        System.out.println(third);
        System.out.println(secondN);
        System.out.println(firstN);
    }
}
