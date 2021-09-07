/*
 * Исключения, обрабатываемые в ходе выполнения программ:
 * 
 * 
 */
package javacalculyator;

/**
 *
 * @author Belyankin
 */
public class CalculyatorException extends Exception {
    
    final public static int POINT_COMMA = 1; // дробное число
    final public static int ROME_NUMERIC = 2; // не римское число или римское > 10
    final public static int ROME_ARABIC = 3; // арабские и римские вместе
    final public static int MORE_OPERAND = 4; // два и более операндов
    final public static int INPUT_NULL_DEC = 6; // введенное число не входит в диапазон [0,10]
    final public static int ROME_NEGATIVE = 7; // результат вычисления римских чисел < 10
    
    static int code;
    
    public CalculyatorException(int code){
        this.code = code;
    }
    int getCodeExeption(){
        return this.code;
    }
}
