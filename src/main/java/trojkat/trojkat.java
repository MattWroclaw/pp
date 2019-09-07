package trojkat;

public class trojkat {

    public static void drawTriangle(int n) {

        char symb = '*';
        char symb2 = '&';

        for (int i = 1; i <= n; i++) {
            for (int j = n; j-i>0;j--){
                System.out.print(symb2);
            }
            for (int j = n; j-(n-i) > 0; j--) {
                System.out.print(symb);
            }


//
            System.out.println();
        }


    }

    public static void main(String[] args) {
        drawTriangle(4);
    }
}
public static void choinka(int n){
        char choinka= 'x';
        char spacja = '*';
     
        for (int i = 0 ; i < n; i++){
            for(int j = 0 ; n-i>j ; j++) {
                System.out.print(choinka);
            }
            for (int j = 0 ; j<i ; j++){
                System.out.print(spacja);
            }
            for(int j =0 ; j<i+1; j++){
                System.out.print(spacja);
            }
            System.out.println();
        }
    }
