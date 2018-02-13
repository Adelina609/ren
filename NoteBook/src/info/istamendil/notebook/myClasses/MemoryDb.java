package info.istamendil.notebook.myClasses;

import info.istamendil.notebook.data.Db;
import info.istamendil.notebook.data.DbException;
import java.util.ArrayList;
import java.util.Arrays;


public class MemoryDb implements Db {
    private String[] tempMemory;
    private int capacity = 0;

    public MemoryDb(int size){
    tempMemory = new String[size];
    }
    public void save(Object object) throws DbException{
        tempMemory[capacity++] = (String)object;
    }
    public Object[] findAll() throws DbException{
        String[] array = Arrays.copyOf(tempMemory, capacity);
        return array;
    }
}
