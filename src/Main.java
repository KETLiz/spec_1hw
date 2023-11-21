public class Main {
    public static void main(String[] args) {
        /**
         * Выполнение программы
         */
        MathOperations m = new MathOperations();
        int sum = m.sumNum(5, 2);
        int sub = m.subtraction(5, 2);
        int multi = m.multiplication(5, 2);
        int div = m.division(5, 2);

        PrintResult pr = new PrintResult();
        pr.print(sum);
        pr.print(sub);
        pr.print(multi);
        pr.print(div);

    }
}