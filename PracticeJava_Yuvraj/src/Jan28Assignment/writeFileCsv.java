package Jan28Assignment;

import java.io.FileWriter;
import java.io.IOException;

public class writeFileCsv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        int rows = 4;
        int cols = 4;

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Math.random();
            }
        }

        String filePath = "C:\\Private\\Learning\\JavaSelenium\\writeCSV.csv";
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < rows; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < cols; j++) {
                    sb.append(matrix[i][j]);
                    if (j < cols - 1) {
                        sb.append(",");
                    }
                }
                sb.append("\n");
                writer.write(sb.toString());
           }
            System.out.println("Matrix has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
		


}
