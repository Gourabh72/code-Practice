package javaQuestion;

public class Question2 {
    public static void main(String[] args) {
        String str="He23l45l4o6";

        //sum of digit
        int sum=str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
