    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class FreqGCD {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scan.nextInt();
            countFreq(arr, n);
        }

        static void countFreq(int arr[], int n) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int i = 0; i < n; i++) {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            }

            int maxCount = -1, minCount = Integer.MAX_VALUE, maxEle = -1, minEle = -1;

            for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
                if (val.getValue() > maxCount) {
                    maxCount = val.getValue();
                    maxEle = val.getKey();
                }

                if (val.getValue() < minCount) {
                    minCount = val.getValue();
                    minEle = val.getKey();
                }
            }

            System.out.println(gcd(maxEle, minEle));
        }
        
        static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }
