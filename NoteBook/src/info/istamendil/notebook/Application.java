package info.istamendil.notebook;

import info.istamendil.notebook.utils.UserInteractorException;

/**
 *
 * Application base.
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 *
 * Code for studying purposes. Programming course. Kazan Federal University, ITIS.
 * http://study.istamendil.info/
 */
public abstract class Application {
    protected String[] args;

    public Application(String[] args) throws UserInteractorException {
        this.args = args;
        this.init();
        this.start();
    }

    public abstract void init() throws UserInteractorException;
    public abstract void start();
}
