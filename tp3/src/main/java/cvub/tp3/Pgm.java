/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvub.tp3;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author utaab
 */
public class Pgm {
    
    private int tailleX;
    private int tailleY;
    private ArrayList<ArrayList<Integer>> image;
    private int maxVal;

    public Pgm(int tailleX, int tailleY, ArrayList<ArrayList<Integer>> image, int maxVal) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.image = image;
        this.maxVal = maxVal;
    }
    
    public static Pgm Lecture(String cheminFichier) throws FileNotFoundException, IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(cheminFichier));
        String format = reader.readLine(); // P2
        if (!format.equals("P2")) {
            throw new IOException("Format non supporté : " + format);
        }
        
        // lire #
        reader.readLine();
        
        // lire la taille
        String line = reader.readLine();
        String[] dimensions = line.trim().split("\\s+");
        int taillex = Integer.parseInt(dimensions[0]);
        int tailley = Integer.parseInt(dimensions[1]);
        
        // lire la valeur max
        int max = Integer.parseInt(reader.readLine().trim());
        
        // lire les pixels
        ArrayList<ArrayList<Integer>> img = new ArrayList<>();
        int count = 0;
        ArrayList<Integer> row = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] values = line.trim().split("\\s+");
            for (String val : values) {
                if (!val.isEmpty()) {
                    if (count == taillex) {
                        img.add(row);
                        count = 0;
                        row = new ArrayList<>();
                    }
                    row.add(Integer.valueOf(val));
                    count++;
                }
            }
        }
        if (!row.isEmpty()) {img.add(row);}

        return new Pgm(taillex, tailley, img, max);
    }

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
