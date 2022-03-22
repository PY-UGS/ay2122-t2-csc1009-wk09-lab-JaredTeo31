import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void testIsDigit(){
        RandomCharacter char1 = new RandomCharacter();
        StringBuilder digit = new StringBuilder();
        for (int i = 0; i < 1000000; i++){
            digit.append(char1.getRandomDigitCharacter());
            assertTrue(Character.isDigit(digit.charAt(i)));
        }
    }
    @Test
    public void testIsLower(){
        RandomCharacter char2 = new RandomCharacter();
        StringBuilder lower = new StringBuilder();
        for (int i = 0; i < 1000000; i++){
            lower.append(char2.getRandomLowerCaseLetter());
            assertTrue(Character.isLowerCase(lower.charAt(i)));
        }
    }
    @Test
    public void testIsUpper(){
        RandomCharacter char3 = new RandomCharacter();
        StringBuilder upper = new StringBuilder();
        for (int i = 0; i < 1000000; i++){
            upper.append(char3.getRandomUpperCaseLetter());
            assertTrue(Character.isUpperCase(upper.charAt(i)));
        }
    }
    @Test
    public void testCharacter(){
        RandomCharacter char4 = new RandomCharacter();
        StringBuilder character = new StringBuilder();
        for (int i = 0; i < 1000000; i++){
            character.append(char4.getRandomUpperCaseLetter());
            assertTrue(Character.isLetterOrDigit(character.charAt(i)));
        }
    }
    @Test
    public void testPrime(){
        RandomCharacter char5 = new RandomCharacter();
        StringBuilder prime = new StringBuilder();
        for (int i = 0; i < 1000000; i++){
            int number = char5.getRandomPrime();
            prime.append(number);
            assertTrue(isPrime(number));
        }
    }
    public static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0) 
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0)) 
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }

    /*
    public static void main(String[] args){
        CharacterTest test1 = new CharacterTest();
        System.out.println(test1.testIsDigit());
        System.out.println(test1.testIsLower());
        System.out.println(test1.testIsUpper());
        System.out.println(test1.testCharacter());
    }*/
}
