package com.example.application.views.helloworld;

import java.util.ArrayList;
import java.util.List;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public HelloWorldView() {
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);
        CustomTable<Stud> sds = new CustomTable<Stud>();
        sds.addColumn(Stud::getName).setHeader("First name").setKey("sdsd");
        sds.addColumn(Stud::getRoll).setHeader("Roll").setKey("sdsdsd");
        List<Stud> sss = new ArrayList<>();
        sss.add(new Stud("sdsd",1));
        sds.setItems(sss);
        sds.addExportTable();
        add(sds);
        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
