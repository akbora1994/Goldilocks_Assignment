
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileInput = "C:\\Masai\\CSVFiles\\input.csv";  
		String fileOutput = "C:\\Masai\\CSVFiles\\output.csv"; 
		
		try ( BufferedReader bfReader = new BufferedReader(new FileReader(fileInput)); // Opening the input file for reading..
              BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileOutput)) // Opening the input file for reading..
            ){
            
			   String data;

                // Reading each data from the input file here..
	            while ((data = bfReader.readLine()) != null) {
	            	
	                // Splitting the line into columns using a comma separator here..
	                String[] columns = data.split(",");
	                double sum = 0;
	
	                if (columns.length >= 3) {
	                    double col1 = Double.parseDouble(columns[0]);
	                    double col2 = Double.parseDouble(columns[1]);
	                    double col3 = Double.parseDouble(columns[2]);

	                    sum += col1 + col2 + col3;
	                }

	                bfWriter.write(data + " ==> Sum = " + sum);
	                bfWriter.newLine();
	            }

            System.out.println("CSVFile processed successfully...");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
			
	}

}
