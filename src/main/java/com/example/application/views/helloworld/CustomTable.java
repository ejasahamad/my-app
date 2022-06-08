package com.example.application.views.helloworld;

import org.vaadin.haijian.Exporter;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.server.StreamResource;

public class CustomTable<T> extends Grid<T> {
    CustomTable(){
    }
    
    public void addExportTable()
    {
        GridContextMenu<T> g = new GridContextMenu<T>(this);

        g.add(new Anchor(new StreamResource("my-excel.xlsx", Exporter.exportAsExcel(this)), "Download As Excel"));
    }
}
