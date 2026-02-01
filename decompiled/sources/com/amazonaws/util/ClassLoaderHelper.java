package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    public static URL b(String str, boolean z3, Class<?>... clsArr) {
        URL j4;
        if (z3) {
            j4 = i(str, clsArr);
            if (j4 == null) {
                j4 = j(str);
            }
        } else {
            j4 = j(str);
            if (j4 == null) {
                j4 = i(str, clsArr);
            }
        }
        if (j4 == null) {
            return ClassLoaderHelper.class.getResource(str);
        }
        return j4;
    }

    public static URL e(String str, Class<?>... clsArr) {
        return b(str, false, clsArr);
    }

    public static InputStream f(String str, boolean z3, Class<?>... clsArr) {
        URL b4 = b(str, z3, clsArr);
        if (b4 == null) {
            return null;
        }
        try {
            return b4.openStream();
        } catch (IOException unused) {
            return null;
        }
    }

    public static InputStream g(String str, Class<?>... clsArr) {
        return f(str, false, clsArr);
    }

    private static URL i(String str, Class<?>[] clsArr) {
        if (clsArr != null) {
            for (Class<?> cls : clsArr) {
                URL resource = cls.getResource(str);
                if (resource != null) {
                    return resource;
                }
            }
            return null;
        }
        return null;
    }

    private static URL j(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    public static Class<?> k(String str, boolean z3, Class<?>... clsArr) throws ClassNotFoundException {
        Class<?> n4;
        if (z3) {
            n4 = m(str, clsArr);
            if (n4 == null) {
                n4 = n(str);
            }
        } else {
            n4 = n(str);
            if (n4 == null) {
                n4 = m(str, clsArr);
            }
        }
        if (n4 == null) {
            return Class.forName(str);
        }
        return n4;
    }

    public static Class<?> l(String str, Class<?>... clsArr) throws ClassNotFoundException {
        return k(str, true, clsArr);
    }

    private static Class<?> m(String str, Class<?>[] clsArr) {
        if (clsArr != null) {
            for (Class<?> cls : clsArr) {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader != null) {
                    try {
                        return classLoader.loadClass(str);
                    } catch (ClassNotFoundException unused) {
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static Class<?> n(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
        return contextClassLoader.loadClass(str);
    }
}
