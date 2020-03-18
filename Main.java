import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    boolean tmenu;
	    String[] words = null,translate = null,inOrder = null;
	 	String word,key = "",value="",line,traducir = "", espaniol = "",menu;
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
			
//-------------------------------Menu
			
			System.out.println("------- TRADUCTOR ---------");
			System.out.println("1. Traduzca una oracion guardada en el archivo texto.txt");
			System.out.println("2. Ver todas las palabras guardadas en el diccionario mediante un recorrido in-order");
			System.out.print("Ingrese el numero de la opcion que desee probar: ");
			menu = read.nextLine();
			tmenu = MenuInvalido(menu);
			while (tmenu != false) {
				System.out.print("Ingrese nuevamente el numero de la opcion que desee: ");	
				menu = read.nextLine();
				tmenu = MenuInvalido(menu);
			}

			switch(menu){
			case "1":
				System.out.println();
				System.out.println("La oracion a traducir es: "+traducir);
				translate = traducir.split(" ");
				for(int a = 0; a < translate.length; a++) {
					try {
						espaniol += " " + dictionary.search(translate[a]) + " ";
					}catch(Exception e){
					espaniol += " "+"*"+translate[a]+"*"+" ";
					}
				}
				System.out.println("Traduccion:");
				System.out.println(espaniol);
				System.out.println("Recuerde que las palabras que no se encuentran dentro del diccionario se muestran con un asteristo");
			break;
			case "2":
				System.out.println();
				System.out.println("La palabras guardadas en el diccionario son: ");
				inOrder = dictionary.inOrder().split(",");
				for(int i = 1; i < inOrder.length; i++)
					System.out.println(inOrder[i]);
			break;
			}

	}
	 public static boolean MenuInvalido(String me) {
		 boolean incorrecto = false;
		 if (!me.equals("1") && !me.equals("2")) 
			 incorrecto = true;
		else 
			incorrecto = false;
		 
		 return incorrecto;
	 }

}
