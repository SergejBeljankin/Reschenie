/*
 * Класс должен принять строку с консоли и создать объект класса String 
 * для дальнейшего парсинга
 */
package javacalculyator;

/**
 *
 * @author Belyankin
 */
import java.util.Scanner;

public class InputString {
    String IputPhrase;
    
    InputString(){
        Scanner Input = new Scanner(System.in);
        System.out.println("Введите данные для расчета:");
        String input = Input.nextLine();
        this.IputPhrase = input;
    }
    

}
