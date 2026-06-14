package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {

    @Override
    public char convert(int color) {

        char[] chars = {'#', '$', '@', '%', '*', '+', '-', '\'' };
        return chars[color * chars.length / 256];
    }
}


