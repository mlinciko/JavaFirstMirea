package ru.mirea.task21;
import java.util.ArrayList;

public class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Sokolnicheskaya");
        lines.add("Zamoskvoretskaya");
        lines.add("Arbatsko-Pokrovskaya");
        lines.add("Filevskaya");
        lines.add("Koltsevaya");
        lines.add("Kaluga-Riga");
        lines.add("Tagansko-Krasnopresnenskaya");
        lines.add("Kalininskaya");
        lines.add("Solntsevskaya");
        lines.add("Serpukhovsko-Timiryazevskaya");
        lines.add("Lyublinsko-Dmitrovskaya");
        lines.add("Bolshaya Koltsevaya");
        lines.add("Kakhovskaya");
        lines.add("Butovskaya");
        lines.add("Nekrasovskaya");
        lines.add("Arbatsko-Pokrovskaya");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Линия: " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Линия: " + lines.get(i));
        }
    }
}
