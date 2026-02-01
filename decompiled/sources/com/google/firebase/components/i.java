package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i<T> {

    /* renamed from: c, reason: collision with root package name */
    static final String f34904c = "ComponentDiscovery";

    /* renamed from: d, reason: collision with root package name */
    private static final String f34905d = "com.google.firebase.components.ComponentRegistrar";

    /* renamed from: e, reason: collision with root package name */
    private static final String f34906e = "com.google.firebase.components:";

    /* renamed from: a, reason: collision with root package name */
    private final T f34907a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f34908b;

    /* loaded from: classes2.dex */
    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f34909a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(i.f34904c, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f34909a), 128);
                if (serviceInfo == null) {
                    Log.w(i.f34904c, this.f34909a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(i.f34904c, "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle b4 = b(context);
            if (b4 == null) {
                Log.w(i.f34904c, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b4.keySet()) {
                if (i.f34905d.equals(b4.get(str)) && str.startsWith(i.f34906e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f34909a = cls;
        }
    }

    @i0
    /* loaded from: classes2.dex */
    interface c<T> {
        List<String> a(T t3);
    }

    @i0
    i(T t3, c<T> cVar) {
        this.f34907a = t3;
        this.f34908b = cVar;
    }

    public static i<Context> d(Context context, Class<? extends Service> cls) {
        return new i<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public static ComponentRegistrar e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, f34905d));
        } catch (ClassNotFoundException unused) {
            Log.w(f34904c, String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e4);
        } catch (InstantiationException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e5);
        } catch (NoSuchMethodException e6) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e6);
        } catch (InvocationTargetException e7) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e7);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f34908b.a(this.f34907a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar e4 = e(it.next());
                if (e4 != null) {
                    arrayList.add(e4);
                }
            } catch (InvalidRegistrarException e5) {
                Log.w(f34904c, "Invalid component registrar.", e5);
            }
        }
        return arrayList;
    }

    public List<C1.b<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f34908b.a(this.f34907a)) {
            arrayList.add(new C1.b() { // from class: com.google.firebase.components.h
                @Override // C1.b
                public final Object get() {
                    ComponentRegistrar e4;
                    e4 = i.e(str);
                    return e4;
                }
            });
        }
        return arrayList;
    }
}
