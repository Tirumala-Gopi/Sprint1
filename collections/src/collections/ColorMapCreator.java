package collections;

import java.awt.Color;

import java.util.HashMap;

public class ColorMapCreator {

    public static HashMap<String, Color> createColorMap() {
        HashMap<String, Color> colorMap = new HashMap<>();

        colorMap.put("WHITE", Color.WHITE);
        colorMap.put("LIGHT_GRAY", Color.LIGHT_GRAY);
        colorMap.put("GRAY", Color.GRAY);
        colorMap.put("DARK_GRAY", Color.DARK_GRAY);
        colorMap.put("BLACK", Color.BLACK);
        colorMap.put("RED", Color.RED);
        colorMap.put("PINK", Color.PINK);
        colorMap.put("ORANGE", Color.ORANGE);
        colorMap.put("YELLOW", Color.YELLOW);
        colorMap.put("GREEN", Color.GREEN);
        colorMap.put("MAGENTA", Color.MAGENTA);
        colorMap.put("CYAN", Color.CYAN);
        colorMap.put("BLUE", Color.BLUE);

        return colorMap;
    }

    // Quick test
    public static void main(String[] args) {
        HashMap<String, Color> colors = createColorMap();
        System.out.println("Available colors:");
        for (String name : colors.keySet()) {
            System.out.println(name + " -> " + colors.get(name));
        }
    }
}


