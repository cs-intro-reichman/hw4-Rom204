public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // nums
        boolean[] primesArr = new boolean[n + 1];
        int root = (int) Math.sqrt(primesArr.length);
        for (int i = 2; i < primesArr.length; i++){
            primesArr[i] = true;
        }

        int c = 2;
        while (c <= root){
            if (primesArr[c] == true) {
                for (int i = (c + 1); i < primesArr.length; i++){
                    if (i % c == 0 && primesArr[i] == true){
                        primesArr[i] = false;
                    }
                }
            }
            c++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;
        for (int i = 2; i < primesArr.length; i++){
            if (primesArr[i] == true){
                primeCount++;
                System.out.println(i);
            }
        }
        double percentage = ((double) primeCount / n) * 100;
        int roundedPercentage = (int)(percentage);
        
        System.out.println("There are " + primeCount + " primes between 2 and " + n + " (" + roundedPercentage + "% are primes)");
    }
}