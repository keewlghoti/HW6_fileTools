package FileUsage;
import java.io.*;

public class fileManipulation {

	//insert test file here

	public void fileReader(File inFile) throws IOException{ // come with me on a journey in reading files.
		System.out.println("got here"); //test
        File readThisFile = inFile;
        BufferedReader in = null;
        boolean test = ifExists(readThisFile);
        if(test = true){
			try {
				in = new BufferedReader(new FileReader(readThisFile));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
        	for (String x = in.readLine(); x != null; x = in.readLine()){ // for each life, test that it has value
        		//ADD SHIT LATER
        	}//for
        }
        else{
        	//add this shit later
        }
	}//FileReader	

	public void fileWriter(File inFile, String ammend) throws IOException{
		System.out.println("got here"); //test
		String addText = ammend;
        File readThisFile = inFile;
        BufferedWriter out = null;
        //FileWriter out = null;
        boolean test = ifExists(readThisFile);
        if(test = true){
			try {
				FileWriter fstream = new FileWriter(addText, true);
				out = new BufferedWriter(fstream);
				out.write(addText);
				out.write("success");
			}//try
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}//catch
        }//if
        else{
        	//add this shit later
        }//else
	}//fileWriter
	
	public boolean ifExists(File tcFile){ //returns true/false	
			if(tcFile.exists()){ // tests existence 
				System.out.println("File open successful!");
				return true;
			}
			else{
				System.out.println("No File");
				return false;
			}
	}//ifExists
    
}// Class
	