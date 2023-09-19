import java.util.Random;

public class Main {

    final int constant = 10000;

    public static int findFactor(int target, Prime prime){
        for(int i = 0; i < 10000; i++){
           if(target % prime.getPrime(i) == 0){
               return prime.getPrime(i);
           }
        }
        return -1;
    }


    public static void main(String[] args){
        Prime prime = new Prime(10000);
        Random rand = new Random();
        int target = rand.nextInt(10000);

        System.out.println("What primes make up " + target);
        while(target > 2){
            int factor = findFactor(target,prime);
            System.out.print(factor);
            target = target/factor;
            if(target > 2){
                System.out.print("x");
            }
        }
    }
}
