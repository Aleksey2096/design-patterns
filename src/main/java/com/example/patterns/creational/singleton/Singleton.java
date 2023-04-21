package com.example.patterns.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {
    @Serial
    private static final long serialVersionUID = -1093810940935189395L;
    private static final Singleton sc = new Singleton();

    private Singleton() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    public static Singleton getInstance() {
        return sc;
    }

    @Serial
    private Object readResolve() throws ObjectStreamException {
        return sc;
    }

    @Serial
    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be cloned");
    }

    /*
     * To prevent the singleton getting instantiated from different class loaders.
     * The above getClass() method associates the classloader with the current
     * thread; if that classloader is null, the method uses the same classloader
     * that loaded the singleton class.
     */
    private static Class<?> getClass(final String classname)
            throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
        if (classLoader == null)
            classLoader = Singleton.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }
}
