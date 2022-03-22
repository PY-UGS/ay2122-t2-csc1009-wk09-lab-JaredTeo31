import java.util.Random;

public class RandomCharacter {
    static int value;
    char[] characterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public char getRandomLowerCaseLetter(){
        return (char) ('a' + Math.random() * 26);
    }
    public char getRandomUpperCaseLetter(){
        return (char) ('A' + Math.random() * 26);
    }
    public int getRandomDigitCharacter(){
        return (int) (Math.random() * 10);
    }
    public char getRandomCharacter(){
        Random random = new Random();
        int randomCharIndex = random.nextInt(characterSet.length);
        char result = characterSet[randomCharIndex];
        return result;
    }
    public static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0) 
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0)) 
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }
    public int getRandomPrime(){
        Random rand = new Random();
        int num = rand.nextInt(9) + 1;
            if (isPrime(num)) {          
                return num;
            }
            else{
                while (!isPrime(num)){
                    num = rand.nextInt(9) + 1;
                }
                return num;
            }
    }
    public static void main(String[] args){
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder alphanum = new StringBuilder();
        StringBuilder prime = new StringBuilder();
        int len = 15;
        RandomCharacter char1 = new RandomCharacter();
        for (int i = 0; i < len; i++) {
            lower.append(char1.getRandomLowerCaseLetter());
            upper.append(char1.getRandomUpperCaseLetter());
            digit.append(char1.getRandomDigitCharacter());
            alphanum.append(char1.getRandomCharacter());
            prime.append(char1.getRandomPrime());
        }
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(digit);
        System.out.println(alphanum);
        System.out.println(prime);
        /*Boolean flag = false;
        int num = 0;
        Random rand = new Random(); // generate a random number
        //num = rand.nextInt(9) + 1;
        for(int i = 0; i < len; i++){
            num = rand.nextInt(9) + 1;
            if (isPrime(num)) {          
                System.out.println(num + " is a prime");
            }
            else{
                while (!isPrime(num)){
                    num = rand.nextInt(9) + 1;
                }
                System.out.println(num + " is a prime");
            }
        }  */
    }

}
