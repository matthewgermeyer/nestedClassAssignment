package com.example;

import java.io.IOException;

public interface WidgetService {
    int createWidget(String name, String type);

    String listWidgets() throws IOException;

    String getWidget(int id) throws IOException;

    boolean addAttachment(int id, String name, String type);
}
