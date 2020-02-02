package com.it;

import com.it.helpers.*;
import com.it.pages.ViewLetterPage;

public class App {
    public CommonHelper common;
    public DashboardHelper dashboard;
    public LoginHelper login;
    public CreateLetterHelper createLetter;
    public ViewLetterHelper viewLetter;

    public App() {
        common = new CommonHelper();
        dashboard = new DashboardHelper();
        login = new LoginHelper();
        createLetter = new CreateLetterHelper();
        viewLetter = new ViewLetterHelper();
    }
}
