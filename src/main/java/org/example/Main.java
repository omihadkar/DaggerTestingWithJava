package org.example;

import org.example.config.AppComponent;
import org.example.config.DaggerAppComponent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

    //DaggerAppComponent
    AppComponent appComponent = DaggerAppComponent.create();
    appComponent.wrapperService().startProcess();
    }
}