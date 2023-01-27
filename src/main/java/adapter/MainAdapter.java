package adapter;

import adapter.api.LibraryAPIv2;
import adapter.api.LibraryAPIv2Impl;

public class MainAdapter {
    public static void main(String[] args) {
        User user = new User("Paweł","Cwik","32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        LibraryAdapter apiAdapter = new LibraryAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user,apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}
