package misrc;


public class NewMain {

    
    public static void main(String[] args) {
        int[] edad = {15, 45, 34};
        
        String[][] nombre = {{"Luis", "Miguel"},
                             {"Carlos", "Juan"},
                             {"Arturo", "Lucho"}};
        
        for(int i = 0; i<nombre.length; i++){
            for(int j=0; j<nombre[0].length; j++){
                System.out.print(nombre[i][j] + "\t");
            }
            System.out.println();
        }
                
    }
    
}
