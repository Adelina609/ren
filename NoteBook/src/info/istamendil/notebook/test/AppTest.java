package info.istamendil.notebook.test;

import info.istamendil.notebook.App;
import info.istamendil.notebook.utils.UserInteractorException;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void start() throws UserInteractorException {
        String[] str = {"save"};
        App app = new App(str);
        app.start();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        assertEquals("save", string);



    }


}
