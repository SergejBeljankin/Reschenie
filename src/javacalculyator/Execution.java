/*
 * Принимает математическую фразу из двух операндов и оператора
 * и делает вычисления. Если результат вычисления меньше 0 и введены
 * римские числа выбрасывается исключение.
 */
package javacalculyator;

import static java.lang.System.out;

/**
 *
 * @author Belyankin
 */
public class Execution {
    String romeResul;
    int arabicRezult;
    
    Execution (int a, int b, 
        String operator, String numeral) {
        int rezult = 0;
        switch(operator){
            case "-" -> rezult = a-b;
            case "+" -> rezult = a+b;
            case "/" -> rezult = a/b;
            case "*" -> rezult = a*b;              
        }
        try {
            if(rezult < 1 & numeral.equals("roman")) 
                throw new CalculyatorException(CalculyatorException.ROME_NEGATIVE);
            else if(numeral.equals("roman")) {
                ArabicRomanConvert RomeRezult = new ArabicRomanConvert(rezult);
                this.romeResul = RomeRezult.RomeNummer;
            }
        } catch (CalculyatorException ex){
            
            out.println("Результат вычисления не может быть выведен, так как "
                    + "Римские цифры могут быть только "
                    + "натуральными в дипазоне [1, + " + '\u221E' + ")");
            
        }   
            this.arabicRezult = rezult;
    }
}
