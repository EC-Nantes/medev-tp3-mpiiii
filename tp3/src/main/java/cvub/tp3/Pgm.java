/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvub.tp3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author utaab
 */
public class Pgm {
    
    private int tailleX;
    private int tailleY;
    private ArrayList<ArrayList<Integer>> image;

    public Pgm(int tailleX, int tailleY, ArrayList<ArrayList<Integer>> image) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.image = image;
    }
    
//    public Pgm Lecture(String nomFichier) {
//        
//        File file = new File(nomFichier);
//        FileReader reader=null;
//        try{
//            reader = new FileReader(file);
//        }
//        catch(IOException e){
//            System.out.println("erreur de lecture du fichier");
//        }
//        try {
//            
//            BufferedReader buffReader = new BufferedReader(reader);
//            int x = 0;
//            String s;
//            while((s = buffReader.readLine()) != null){
//                processLineLoading(s,creatures,objets);
//            }
//        }
//        catch(IOException e){
//          System.out.println("erreur de lecture du fichier");
//          return false;
//        }
//        return true;
//    }

    public int getTailleX() {
        return tailleX;
    }

    public void setTailleX(int tailleX) {
        this.tailleX = tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public void setTailleY(int tailleY) {
        this.tailleY = tailleY;
    }

    public ArrayList<ArrayList<Integer>> getImage() {
        return image;
    }

    public void setImage(ArrayList<ArrayList<Integer>> image) {
        this.image = image;
    }
}
