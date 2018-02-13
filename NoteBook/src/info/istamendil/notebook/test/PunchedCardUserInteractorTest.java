package info.istamendil.notebook.test;

import info.istamendil.notebook.utils.PunchedCardUserInteractor;
import info.istamendil.notebook.utils.UserInteractorException;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.TestRule;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class PunchedCardUserInteractorTest {

    @Test
    void readCommand() throws UserInteractorException {
        Path path = Paths.get("D:\\IdeaProjects\\NoteBook\\src\\info\\istamendil\\notebook\\someFile");
        PunchedCardUserInteractor pc = new PunchedCardUserInteractor(path);
        assertEquals("save",pc.readCommand());
    }
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();



    @Test
    void print() throws UserInteractorException {
        Path path = Paths.get("D:\\IdeaProjects\\NoteBook\\src\\info\\istamendil\\notebook\\someFile");
        PunchedCardUserInteractor pc = new PunchedCardUserInteractor(path);
        pc.print("save");
        assertEquals(">> save", systemOutRule.getLog() );

    }



}