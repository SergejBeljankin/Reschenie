/*
 * Принимает чило в арабском или римском формате и возвращает это число в 
 * в требуемом формате
 */
package javacalculyator;

/**
 *
 * @author Belyankin
 */
public class Parsing {
    private int arabic = 0;
    private final String[] RomeNumeric = {"I","II","III","IV","V",
                                    "VI","VII","VIII","IX","X"};
    
    Parsing (String RomeString) throws CalculyatorException{
        //System.out.println("this.arabic :" + this.arabic);
        for(int i = 1; i <= 10; i++){
            if(RomeString.equals(RomeNumeric[i-1])) {
                this.arabic = i;
            }
        } 
        if (this.arabic == 0) throw new CalculyatorException(CalculyatorException.ROME_NUMERIC); // если не римское число то сделать исключение*/
        
    }
    
    public int getArabic(){
        return this.arabic;
    }
}
