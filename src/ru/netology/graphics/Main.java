package ru.netology.graphics;

import ru.netology.graphics.image.ColorSchema;
import ru.netology.graphics.image.Converter;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {

        TextGraphicsConverter converter = new Converter();
        converter.setMaxHeight(300);
        converter.setMaxWidth(300);
        converter.setMaxRatio(4);
        converter.setTextColorSchema(new ColorSchema());

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//
//        try {
//            String imgTxt = converter.convert(url);
//            System.out.println(imgTxt);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
