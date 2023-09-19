import java.util.LinkedList;
import static java.lang.Math.sqrt;

public class Prime {
    int max;

    LinkedList<Integer> integers = new LinkedList<>();

    public Prime(int max) {
        this.max = max;

        Boolean[] booleanArray = new Boolean[max];

        for(int i = 2; i < max; i++){
            booleanArray[i] = true;
        }

        for(int i = 2; i < sqrt(max); i++){
            if(booleanArray[i]){
                for(int j = 2; j < sqrt(max); j++){
                    booleanArray[i * j] = false;
                }
            }
        }

        for(int i = 2; i < max; i++){
            if(booleanArray[i] == true){
                integers.add(i);
            }
        }

    }

    public boolean isPrime(int number){
        for(int i : integers){
            if(number == i){
                return true;
            }
        }
        return false;
    }

    public int getPrime(int number){
        return integers.get(number);
    }



}
