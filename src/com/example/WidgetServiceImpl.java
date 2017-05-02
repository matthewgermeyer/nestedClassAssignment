package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MattyG on 5/1/17.
 */
public class WidgetServiceImpl implements WidgetService {
    private static ObjectMapper mapper = new ObjectMapper();
    private List<Widget> widgets = new ArrayList<>();

    @Override
    public int createWidget(String name, String type) {
        Widget widget = new Widget(name, type);
        widgets.add(widget);
        return widget.getId();
    }

    @Override
    public String listWidgets() throws IOException {
        return mapper.writeValueAsString(widgets);

    }

    @Override
    public String getWidget(int id) throws IOException {
        for (Widget widget : widgets) {
            if (widget.getId() == id) {
                return mapper.writeValueAsString(widget);
            }
        }
        return null;
    }

    @Override
    public boolean addAttachment(int id, String name, String type) {
        for (Widget widget : widgets) {
            if (widget.getId() == id) {
                widget.addAttachment(name, type);
                return true;
            }
        }
        System.out.println("failed to add attachment ");
        return false;
    }
}
