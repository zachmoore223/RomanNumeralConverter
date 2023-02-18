package org.example;

public class RomanNumeralConverter {
    public static void main(String[] args) {
                System.out.println("Hello world!");
    }


    public static String toRomanNumeral(int numberToConvert) {
        String romanNumeral = "";

        //take given  # and break it into an array with each individual number
        //this way we can do each place and convert it
        String temp = Integer.toString(numberToConvert);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));
        }

        if (numbers.length == 4) {
            romanNumeral = thousandsPlace(romanNumeral, numbers, 0);
            romanNumeral = hundredsPlace(romanNumeral, numbers, 1);
            romanNumeral = tensPlace(romanNumeral, numbers, 2);
            romanNumeral = onesPlace(romanNumeral, numbers, 3);
        }

        if (numbers.length == 3) {
            romanNumeral = hundredsPlace(romanNumeral, numbers, 0);
            romanNumeral = tensPlace(romanNumeral, numbers, 1);
            romanNumeral = onesPlace(romanNumeral, numbers, 2);
        }

        if (numbers.length == 2) {
            romanNumeral = tensPlace(romanNumeral, numbers, 0);
            romanNumeral = onesPlace(romanNumeral, numbers, 1);
        }

        if (numbers.length == 1) {
            romanNumeral = onesPlace(romanNumeral, numbers, 0);
        }

        return romanNumeral;

    }
    //M = 1,000, D = 500, C = 100, L = 50, X = 10
    //thousands breaks patter since roman numerals do not technically go up beyond 3999
    //this allows it to go to 9999 by adding the number of M's accordingly
    private static String thousandsPlace (String romanNumeral, int[] numbers, int index) {
        for (int i = 0; i < numbers[index]; i++){
            romanNumeral = romanNumeral + "M";
        }
        return romanNumeral;
    }
    //M = 1,000, D = 500, C = 100, L = 50, X = 10
    //Need CM for 900 (ie 1000 minus 100)
    //Each one follows same pattern
    //check the hundreds place number and convert it appropriately
    private static String hundredsPlace (String romanNumeral, int[] numbers, int index) {
        if(numbers[index] == 9){
            romanNumeral = romanNumeral + "CM";
        } else if (numbers[index]==8){
            romanNumeral = romanNumeral + "DCCC";
        } else if (numbers[index]==7){
            romanNumeral = romanNumeral + "DCC";
        } else if (numbers[index]==6){
            romanNumeral = romanNumeral + "DC";
        } else if (numbers[index]==5){
            romanNumeral = romanNumeral + "D";
        } else if (numbers[index]==4){
            romanNumeral = romanNumeral + "CD";
        } else if (numbers[index]==3){
            romanNumeral = romanNumeral + "CCC";
        } else if (numbers[index]==2){
            romanNumeral = romanNumeral + "CC";
        } else if (numbers[index]==1){
            romanNumeral = romanNumeral + "C";
        }
        return romanNumeral;
    }
    //C = 100, L = 50, X = 10
    //Need C since 90 would be XC
    //check the tens place number and convert it appropriately
    private static String tensPlace (String romanNumeral, int[] numbers, int index) {
        if(numbers[index] == 9){
            romanNumeral = romanNumeral + "XC";
        } else if (numbers[index]==8){
            romanNumeral = romanNumeral + "LXXX";
        } else if (numbers[index]==7){
            romanNumeral = romanNumeral + "LXX";
        } else if (numbers[index]==6){
            romanNumeral = romanNumeral + "LX";
        } else if (numbers[index]==5){
            romanNumeral = romanNumeral + "L";
        } else if (numbers[index]==4){
            romanNumeral = romanNumeral + "XL";
        } else if (numbers[index]==3){
            romanNumeral = romanNumeral + "XXX";
        } else if (numbers[index]==2){
            romanNumeral = romanNumeral + "XX";
        } else if (numbers[index]==1){
            romanNumeral = romanNumeral + "X";
        }
        return romanNumeral;
    }
    //X = 10, I = 1
    //check the ones place and convert it appropriately
    //no X because that'd move to tens place
    private static String onesPlace (String romanNumeral, int[] numbers, int index) {
        if (numbers[index] == 9) {
            romanNumeral = romanNumeral + "IX";
        } else if (numbers[index] == 8) {
            romanNumeral = romanNumeral + "VIII";
        } else if (numbers[index] == 7) {
            romanNumeral = romanNumeral + "VII";
        } else if (numbers[index] == 6) {
            romanNumeral = romanNumeral + "VI";
        } else if (numbers[index] == 5) {
            romanNumeral = romanNumeral + "V";
        } else if (numbers[index] == 4) {
            romanNumeral = romanNumeral + "IV";
        } else if (numbers[index] == 3) {
            romanNumeral = romanNumeral + "III";
        } else if (numbers[index] == 2) {
            romanNumeral = romanNumeral + "II";
        } else if (numbers[index] == 1) {
            romanNumeral = romanNumeral + "I";
        }
        return romanNumeral;
    }
}