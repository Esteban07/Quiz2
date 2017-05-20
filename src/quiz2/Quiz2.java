/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import Data.*;
/**
 *
 * @author FAMILIA
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriptografiadeCesar c = new CriptografiadeCesar("UBDQ");
        System.out.println(c.Descifrar());
    }
    
}
