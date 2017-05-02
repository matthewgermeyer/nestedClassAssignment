package com.example;

import java.io.IOException;

//NestedClass Assignment - Adventure for
public class Main {

    public static void main(String[] args) throws IOException {

        WidgetServiceImpl wMaker = new WidgetServiceImpl();

        wMaker.createWidget("Messager", "Social");
        wMaker.createWidget("Weather", "Essentials");

        System.out.println(wMaker.listWidgets());
        System.out.println(wMaker.getWidget(1));

        wMaker.addAttachment(1, "Bumble", "Dating");
        System.out.println(wMaker.getWidget(1));
        System.out.println(wMaker.getWidget(2));
    }
}

