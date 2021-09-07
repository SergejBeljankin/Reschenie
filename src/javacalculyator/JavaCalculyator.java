/*
 * 
 * 
 * Основной запускаемый класс
 */
package javacalculyator;

/**
 *
 * @author Belyankin
 */
import static java.lang.System.out;
public class JavaCalculyator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        InputString InputConsole = new InputString();
        //out.println(InputConsole.IputPhrase);
        Phrase InputPhrase = new Phrase(InputConsole.IputPhrase);
        if(CalculyatorException.code == 0){
            Execution Calc = new Execution(InputPhrase.getA(), InputPhrase.getB(), InputPhrase.getOperator(), InputPhrase.getNumeral());
            if(CalculyatorException.code == 0 && InputPhrase.getNumeral().equals("arabic")) out.println("Ответ : " + Calc.arabicRezult);
            else if(CalculyatorException.code == 0 && InputPhrase.getNumeral().equals("roman")) out.println("Ответ : " + Calc.romeResul);
        }
                  
    }
}
