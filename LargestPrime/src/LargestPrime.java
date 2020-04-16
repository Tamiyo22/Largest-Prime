public class LargestPrime {

    public static int getLargestPrime(int number){

        if(number < 2 ){
            return -1;
        }

        int prime = 0;

        for(int i = 2; i < number; i++){
            if( i == 2 && number % 2 == 0){
                prime = 2;
            }
            if( i == 3 && number % 3 == 0){
                prime = 3;
            }
            if((i % 2 != 0)  && (i % 3 != 0) && (number % i == 0) && (i > prime)){
                prime = i;
            }
        }

return (prime > 0 ) ? prime : number;

    }
}
