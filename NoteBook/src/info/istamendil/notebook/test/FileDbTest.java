package info.istamendil.notebook.test;

import static org.junit.jupiter.api.Assertions.*;

import info.istamendil.notebook.data.DbException;
import org.junit.jupiter.api.Test;
import info.istamendil.notebook.data.FileDb;

import java.io.IOException;

class FileDbTest {


    @Test
    void findAll() throws DbException, ClassNotFoundException {
        FileDb fileDb = new FileDb("D:\\IdeaProjects\\NoteBook\\src\\info\\istamendil\\notebook\\someFile");
        Object[] array = {"save"};
        assertEquals(array,fileDb.findAll());
        Object[] empty = {};
        FileDb emptyFile = new FileDb("D:\\IdeaProjects\\NoteBook\\src\\info\\istamendil\\notebook\\data\\EmptyFile");
        assertEquals(empty,emptyFile.findAll());

    }

    @Test
    void convertFromBytes() throws IOException, ClassNotFoundException {
        FileDb fileDb = new FileDb("D:\\IdeaProjects\\NoteBook\\src\\info\\istamendil\\notebook\\someFile");
        byte[] ak = {115,97,118,101};
        assertEquals("save",fileDb.convertFromBytes(ak) );

    }

}