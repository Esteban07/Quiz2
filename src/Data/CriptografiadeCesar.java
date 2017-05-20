/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


/**
 *
 * @author Grimma
 */
public class CriptografiadeCesar {
    private String Palabra;

    public CriptografiadeCesar(String Palabra) {
        this.Palabra = Palabra;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }
    
    
    
    public String Descifrar(){
        char l;
        int[] c = new int[this.Palabra.length()];
        char[] d = new char[this.Palabra.length()];
        for(int i = 0; i<this.Palabra.length(); i++){
            l = this.Palabra.charAt(i);
            switch (l) {
                case 'A':
                    c[i]=((0-3)%26);
                    break;
                case 'B':
                    c[i]=((1-3)%26);
                    break;
                case 'C':
                    c[i]=((2-3)%26);
                    break;
                case 'D':
                    c[i]=((3-3)%26);
                    break;
                case 'E':
                    c[i]=((4-3)%26);
                    break;
                case 'F':
                    c[i]=((5-3)%26);
                    break;
                case 'G':
                    c[i]=((6-3)%26);
                    break;
                case 'H':
                    c[i]=((7-3)%26);
                    break;
                case 'I':
                    c[i]=((8-3)%26);
                    break;
                case 'J':
                    c[i]=((9-3)%26);
                    break;
                case 'K':
                    c[i]=((10-3)%26);
                    break;
                case 'L':
                    c[i]=((11-3)%26);
                    break;
                case 'M':
                    c[i]=((12-3)%26);
                    break;
                case 'N':
                    c[i]=((13-3)%26);
                    break;
                case 'O':
                    c[i]=((14-3)%26);
                    break;
                case 'P':
                    c[i]=((15-3)%26);
                    break;
                case 'Q':
                    c[i]=((16-3)%26);
                    break;
                case 'R':
                    c[i]=((17-3)%26);
                    break;
                case 'S':
                    c[i]=((18-3)%26);
                    break;
                case 'T':
                    c[i]=((19-3)%26);
                    break;
                case 'U':
                    c[i]=((20-3)%26);
                    break;
                case 'V':
                    c[i]=((21-3)%26);
                    break;
                case 'W':
                    c[i]=((22-3)%26);
                    break;
                case 'X':
                    c[i]=((23-3)%26);
                    break;
                case 'Y':
                    c[i]=((24-3)%26);
                    break;
                case 'Z':
                    c[i]=((25-3)%26);
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i<this.Palabra.length(); i++){
            switch (c[i]) {
                case -3:
                    d[i]='X';
                    break;
                case -2:
                    d[i]='Y';
                    break;
                case -1:
                    d[i]='Z';
                    break;
                case 0:
                    d[i]='A';
                    break;
                case 1:
                    d[i]='B';
                    break;
                case 2:
                    d[i]='C';
                    break;
                case 3:
                    d[i]='D';
                    break;
                case 4:
                    d[i]='E';
                    break;
                case 5:
                    d[i]='F';
                    break;
                case 6:
                    d[i]='G';
                    break;
                case 7:
                    d[i]='H';
                    break;
                case 8:
                    d[i]='I';
                    break;
                case 9:
                    d[i]='J';
                    break;
                case 10:
                    d[i]='K';
                    break;
                case 11:
                    d[i]='L';
                    break;
                case 12:
                    d[i]='M';
                    break;
                case 13:
                    d[i]='N';
                    break;
                case 14:
                    d[i]='O';
                    break;
                case 15:
                    d[i]='P';
                    break;
                case 16:
                    d[i]='Q';
                    break;
                case 17:
                    d[i]='R';
                    break;
                case 18:
                    d[i]='S';
                    break;
                case 19:
                    d[i]='T';
                    break;
                case 20:
                    d[i]='U';
                    break;
                case 21:
                    d[i]='V';
                    break;
                case 22:
                    d[i]='W';
                    break;
                case 23:
                    d[i]='X';
                    break;
                case 24:
                    d[i]='Y';
                    break;
                case 25:
                    d[i]='Z';
                    break;
                default:
                    break;
            }
            
        }
        String k = new String(d);
        return k;
        
    }
    
}
