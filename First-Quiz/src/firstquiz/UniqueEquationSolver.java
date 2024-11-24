public class UniqueEquationSolver { // 6
    public static void main(String[] args) {

        for (int ab = 10; ab < 100; ab++) {

            if (ab % 10 == ab / 10) continue;

            for (int cd = 10; cd < 100; cd++) {

                if (cd % 10 == cd / 10) continue;

                int ef = ab - cd;
                if (ef < 10 || ef > 99) continue;
                if (ef % 10 == ef / 10) continue;

                for (int gh = 10; gh < 100; gh++) {
                    if (gh % 10 == gh / 10) continue;

                    int ppp = ef + gh;
                    if (ppp < 100 || ppp > 999) continue;

                    if (unique(ab, cd, ef, gh, ppp)) {
                        System.out.printf("Solution: AB=%d, CD=%d, EF=%d, GH=%d, PPP=%d%n", ab, cd, ef, gh, ppp);
                    }
                }
            }
        }
    }

    public static boolean unique(int... args) {
        int[] digitCount = new int[10];

        for (int num : args) {
            while (num > 0) {
                int digit = num % 10;
                if (digitCount[digit] > 0) return false;
                digitCount[digit]++;
                num /= 10;
            }
        }
        return true;
    }

    public static boolean allSame(int n) {
        int digit = n % 10;

        while (n > 0) {
            if (n % 10 != digit) return false; 
            n /= 10;
        }
        return true;
    }
}
