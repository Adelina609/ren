package info.istamendil.notebook.test;

import org.junit.contrib.java.lang.system.SystemOutRule;
import info.istamendil.notebook.myClasses.ConsolUserInteractor;
import info.istamendil.notebook.utils.UserInteractorException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsolUserInteractorTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    void print() throws UserInteractorException {
        ConsolUserInteractor cui = new ConsolUserInteractor();
        cui.print("save");
        assertEquals("save", systemOutRule.getLog() );
    }

}