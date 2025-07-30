package javaQuestion;

public class Question2 {
    public static void main(String[] args) {
        String str="He23l45l4o6";
        System.out.println("Find sum of digits in this string");
        //sum of digit
        int sum=str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);

        System.out.println("Reverse a String without using a 3rd variable ");
        String s="hello world";
        for (int i = s.length()-1; i > -1; i--) {
            System.out.print(s.charAt(i));
        }
        /*StringBuffer sb=new StringBuffer(s);
        for (int i = 0; i < s.length()/2; i++) {
            sb.replace(i,s.length()-i,s.charAt(i)+"");
        }
        System.out.println(sb);*/

    }
}
