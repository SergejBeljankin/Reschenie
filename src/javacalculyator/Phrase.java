/*
 * Класс Phrase, будет содержать информацию о правильно введенной фразе с консоли:
 * значения двух переменных в формате int, операнде, и информацию о типе 
 * введенных цифр - арабские или римские 
 * в случае ошибок ввода будет выдавать соответствующие исключения
 */
package javacalculyator;

import static java.lang.System.out;

/**
 *
 * @author Belyankin
 */
public class Phrase {
    private int a;
    private int b;
    private String operator; // какой оператор
    private String numeral; // будет принимать два значения "roman" или "arabic"
    
    Phrase(String input){
        int a, b;
        String[] operand = input.split("(\\*|/|\\+|-)");
        try {
            if (input.matches(".*[\\.,].*")) {
                throw new CalculyatorException(CalculyatorException.POINT_COMMA);
                } else if (operand.length != 2) throw new CalculyatorException(CalculyatorException.MORE_OPERAND);
                else if (operand[0].matches("[\\d]+") && operand[1].matches("[\\d]+")){
                    a = Integer.parseInt(operand[0]);
                    b = Integer.parseInt(operand[1]);
                    if ( a == 0 || b == 0 || a > 10 || b > 10 ) throw new CalculyatorException(CalculyatorException.INPUT_NULL_DEC);
                    this.a = a;
                    this.b = b;
                    this.numeral = "arabic";

                } else if (operand[0].matches("[I,V,X]+") && operand[1].matches("[I,V,X]+")){
                    this.a = new Parsing(operand[0]).getArabic();
                    this.b = new Parsing(operand[1]).getArabic();
                    this.numeral = "roman";
                } else throw new CalculyatorException(CalculyatorException.ROME_ARABIC);
            this.operator = input.substring(operand[0].length(), operand[0].length()+1);
        } catch (CalculyatorException ex){
            switch(ex.getCodeExeption()){
                case CalculyatorException.POINT_COMMA -> out.println("Введены дробные числа или в строке присутствуют знаки препинания");
                case CalculyatorException.ROME_NUMERIC -> out.println("Введены не римские числа или одно из введенных чисел больше 10");
                case CalculyatorException.ROME_ARABIC -> out.println("Арабские и римские числа введены в одном выражении");
                case CalculyatorException.INPUT_NULL_DEC -> out.println("Введенное число не входит в диапазон от [1, 10]");
                case CalculyatorException.MORE_OPERAND -> out.println("Введенная строка не соответствует заданию: \n"
                        + "Нужно ввести два операнда и один оператор (+, -, *, / )");
            }
        } 

    }
    public int getA(){
        int a_ret = this.a;
        return a_ret;
    }
    public int getB(){
        int b_ret = this.b;
        return b_ret;
    }
    public String getOperator(){
        String operator_ret = this.operator;
        return operator_ret;
    }
    public String getNumeral(){
        String numeral_ret = this.numeral;
        return numeral_ret;
    }
}
