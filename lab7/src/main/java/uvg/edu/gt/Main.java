package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> dictionary = new BinaryTree<>();
        HashMap<String, String> translations = new HashMap<>();

        // Lee el archivo del diccionario y construye el árbol binario
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pbloc\\IdeaProjects\\lab7\\src\\main\\resources\\diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                String englishWord = st.nextToken().trim().toLowerCase();
                String spanishWord = st.nextToken().trim().toLowerCase();
                dictionary.insert(englishWord);
                translations.put(englishWord, spanishWord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime el árbol en orden
        System.out.print("Diccionario en orden: ");
        dictionary.inorderTraversal();
        System.out.println();

        // Traduce el archivo de texto
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pbloc\\IdeaProjects\\lab7\\src\\main\\resources\\texto.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    String translation = translations.getOrDefault(word.toLowerCase(), "*" + word + "*");
                    System.out.print(translation + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





