package com.google.android.gms.internal.gtm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbex {
    private static final Logger zza = Logger.getLogger(zzbcj.class.getName());
    private static final String zzb = "com.google.android.gms.internal.gtm.zzbbk";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbep zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzbex.class.getClassLoader();
        if (cls.equals(zzbep.class)) {
            format = zzb;
        } else if (cls.getPackage().equals(zzbex.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    return (zzbep) cls.cast(((zzbex) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
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
            Iterator it = ServiceLoader.load(zzbex.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzbex) it.next()).zza()));
                } catch (ServiceConfigurationError e8) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e8);
                }
            }
            if (arrayList.size() == 1) {
                return (zzbep) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzbep) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    protected abstract zzbep zza();
}
