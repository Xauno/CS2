import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BuggyRaymond {
    static Set<Integer> primes = new HashSet<>();

    public static void getPrimes() {
        boolean[] isPrime = new boolean[101];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = 2*i; j < isPrime.length; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        getPrimes();
        System.out.println(primes);
        try (Scanner s = new Scanner(new File("raymond.dat"))) {
            int trials = s.nextInt();
            for (int T = 0; T < trials; T++) {
                int amount = s.nextInt();
                int[] numbers = new int[amount];
                for (int n = 0; n < amount; n++) {
                    numbers[n] = s.nextInt();
                }
                long result = getThatLCM(numbers);
                if (result == 1) {
                    System.out.println("LCM NUMBER 1!");
                } else {
                    System.out.printf("Lowest Common Multiple is %s", result);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("no file :<");
        }
    }

    public static Map<Integer, Integer> getTheFactors(int num) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : primes) {
            int tempNum = num;
            while (tempNum % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        return map;
    }

    public static long getThatLCM(int[] numbers) {
        long result = 1;

        Map<Integer, Integer> resultFactors = new HashMap<>();
        for (int i : numbers) {
            Map<Integer, Integer> factors = getTheFactors(i);

            for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
                resultFactors.put(entry.getKey(), Math.max(resultFactors.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }

        for (Map.Entry<Integer, Integer> entry : resultFactors.entrySet()) {
            result *= Math.pow(entry.getKey(), entry.getValue());
        }

        return result;
    }
}