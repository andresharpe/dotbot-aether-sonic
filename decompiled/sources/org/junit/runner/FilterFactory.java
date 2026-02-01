package org.junit.runner;

/* loaded from: classes2.dex */
public interface FilterFactory {

    /* loaded from: classes2.dex */
    public static class FilterNotCreatedException extends Exception {
        public FilterNotCreatedException(Exception exc) {
            super(exc.getMessage(), exc);
        }
    }

    org.junit.runner.manipulation.b a(d dVar) throws FilterNotCreatedException;
}
