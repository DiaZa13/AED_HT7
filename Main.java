import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String[] words = null,translate = null;
	 	String word,key = "",value="",line,traducir = "", espaniol = "";
	 	BinarySearchTree dictionary = new BinarySearchTree();
		
	    
//---------------------------Read the file, that contains the dictionary
			try {
			fr = new FileReader ("diccionario.txt");
	        br = new BufferedReader(fr);

	        while((word = br.readLine())!=null) {
	        	words= word.split(",");
	            for (int i = 0; i < words.length; i++) {
	            	if (i%2 == 0) {
	            		key = words[i].substring(1).toLowerCase();
	            	}else if (i%2 == 1) {
	            		value = words[i].replace(")","").toLowerCase();
	            	}
	            	//System.out.println(key +" " + value);
	            	
	            	//System.out.println(dictionary.toString());
	            }
	            dictionary.add(key, value);
	        }
	    }
			catch(Exception e){
	        e.printStackTrace();
	    }finally{

	        try{
	            if( null != fr ){
	                fr.close();
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }

			}
//----------------------------Read the file that contains the text to translate
					
			try {
				fr = new FileReader ("texto.txt");
		        br = new BufferedReader(fr);

		        while((line = br.readLine())!=null)
		        	traducir += line.toLowerCase();
			}catch(Exception e){
			        e.printStackTrace();
			}finally{
				try{
					if( null != fr ){
						fr.close();
					}
			    }catch (Exception e){
			            e.printStackTrace();
			    }
			}
			

			translate = traducir.split(" ");
			for(int a = 0; a < translate.length; a++) {
			try {

					espaniol += " " + dictionary.search(translate[a]) + " ";
			}catch(Exception e){
				espaniol += " "+"*"+translate[a]+"*"+" ";
			}
			
			
		}
			System.out.println(espaniol);

					
					



	}

}
