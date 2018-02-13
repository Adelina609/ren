package info.istamendil.notebook.myClasses;

import info.istamendil.notebook.utils.UserInteractor;
import info.istamendil.notebook.utils.UserInteractorException;
import info.istamendil.notebook.utils.UserInteractorReadException;
import info.istamendil.notebook.utils.UserInteractorWriteException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsolUserInteractor implements UserInteractor {
    private   Scanner sc = new Scanner(System.in);

    public  ConsolUserInteractor() throws UserInteractorException{
    }

    @Override
    public String readCommand() throws UserInteractorReadException{
        try{
            return sc.next();
        }
        catch (NoSuchElementException e){
            throw new UserInteractorReadException("The wrong command: " + e.getMessage());
        }
    }

    @Override
    public void print(String output) throws UserInteractorWriteException{
        System.out.println(output);
    }
}
