public class MathOperations {
    /**
     * Функция суммы 2 чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма
     */
    public int sumNum(int a, int b) {
        return a+b;
    }

    /**
     * Функция разности 2 чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public int subtraction(int a, int b) {
        return a-b;
    }

    /**
     * Функция умножения 2 чисел
     * @param a 1 множитель
     * @param b 2 множитель
     * @return произведение
     */
    public int multiplication(int a, int b) {
        return a*b;
    }

    /**
     * Функция деления 2 чисел
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public int division(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("На 0 делить ни-ни");
        }
        return a/b;
    }
}
