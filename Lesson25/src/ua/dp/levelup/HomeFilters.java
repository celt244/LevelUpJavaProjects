package ua.dp.levelup;

import java.util.Comparator;

public class HomeFilters {

    public static Comparator<Home> streetComparator(){
        return (h1, h2) -> {
            int homeNumbers = Integer.compare(h1.getNumber(), h2.getNumber());
            int streetNames = h1.getStreetName().compareToIgnoreCase(h2.getStreetName());

            if (homeNumbers == 0 && streetNames == 0) return 0; //remove duplicate
            else if (homeNumbers == 0) return streetNames;
            else return streetNames == 0 ? homeNumbers : streetNames;
        };
    }
}
