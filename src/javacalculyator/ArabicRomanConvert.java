/*
 * Класс для конвертации арабских чисел в римские
 * 
 * 
 */
package javacalculyator;

/**
 *
 * @author Сергей
 */
public class ArabicRomanConvert {
    String RomeNummer;
    private final String[] RomeNumeric = {"","I","II","III","IV","V",
                                    "VI","VII","VIII","IX","X"};
    private final String[] RomeDEC = {"X","XX","XXX","IL",
                                    "L","LX","LXX","LXXX","XC","C"};
    
    ArabicRomanConvert(int i){
        if(i <=10) this.RomeNummer = RomeNumeric[i];
        else if(i > 10 && i < 100) this.RomeNummer = RomeDEC[i/10 - 1] + RomeNumeric[i%10];
        else this.RomeNummer = RomeDEC[9];
        
    }
}
