package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1384e4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f29627a = Logger.getLogger(S3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f29628b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC1384e4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X3 b(Class cls) {
        String format;
        ClassLoader classLoader = AbstractC1384e4.class.getClassLoader();
        if (cls.equals(X3.class)) {
            format = f29628b;
        } else if (cls.getPackage().equals(AbstractC1384e4.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    return (X3) cls.cast(((AbstractC1384e4) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException(e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (InstantiationException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC1384e4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC1384e4) it.next()).a()));
                } catch (ServiceConfigurationError e8) {
                    f29627a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e8);
                }
            }
            if (arrayList.size() == 1) {
                return (X3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (X3) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    protected abstract X3 a();
}
