package matrices;

public class matriz {

    public static void main(String[] args) {

        Object[][] matrizUno = {{"2","a","1","9","6"},
                                {"5","8","r","8","6"},    
                                {"7","0","t","6","7"},
                                {"5","7","4","u","3"},
                                {"o","r","5","7","9"}};
        
        Object[][] matrizDos = {{"1","a","2","3","q"},
                                {"w","e","4","5","t"},    
                                {"6","y","7","8","9"},
                                {"1","d","x","u","0"},
                                {"z","i","3","2","1"}};
        

        // Sumar las matrices y mostrar el resultado
        Object[][] resultado = matriz(matrizUno, matrizDos);
        mostrarMatriz(resultado);
    }

    public static Object[][] matriz(Object[][] matrizUno, Object[][] matrizDos) {
        // Verificar si las matrices tienen la misma dimensión
        if (matrizUno.length != matrizDos.length || matrizUno[0].length != matrizDos[0].length) {
            System.out.println("Las matrices no tienen la misma dimensión.");
            return null;
        }

        int filas = matrizUno.length;
        int columnas = matrizUno[0].length;

        Object[][] resultado = new Object[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                try {
                    resultado[i][j] = Integer.parseInt((String) matrizUno[i][j]) + Integer.parseInt((String) matrizDos[i][j]);
                } catch (NumberFormatException e) {
                    resultado[i][j] = 0;
                }
            }
        }

        return resultado;
    }

    public static void mostrarMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
