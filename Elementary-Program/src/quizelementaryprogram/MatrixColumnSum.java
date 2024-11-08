package quizelementaryprogram;
public class MatrixColumnSum { // Quiz 4:
    public static void main(String[] args) {

        double [][]m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println(sumColum(m, 0));
    }

    public static double sumColum(double [][]matrix, int columnIndex){

        if (matrix == null) return 0.0;
        double sum = 0.0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }

        return sum;

    }
}