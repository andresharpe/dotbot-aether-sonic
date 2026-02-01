package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.P;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@O2.f
/* loaded from: classes.dex */
class k implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f27376d = "BackendRegistry";

    /* renamed from: e, reason: collision with root package name */
    private static final String f27377e = "backend:";

    /* renamed from: a, reason: collision with root package name */
    private final a f27378a;

    /* renamed from: b, reason: collision with root package name */
    private final i f27379b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, m> f27380c;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f27381a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f27382b = null;

        a(Context context) {
            this.f27381a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d4 = d(context);
            if (d4 == null) {
                Log.w(k.f27376d, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d4.keySet()) {
                Object obj = d4.get(str);
                if ((obj instanceof String) && str.startsWith(k.f27377e)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f27382b == null) {
                this.f27382b = a(this.f27381a);
            }
            return this.f27382b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(k.f27376d, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w(k.f27376d, "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(k.f27376d, "Application info not found.");
                return null;
            }
        }

        @P
        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e4) {
                Log.w(k.f27376d, String.format("Class %s is not found.", str2), e4);
                return null;
            } catch (IllegalAccessException e5) {
                Log.w(k.f27376d, String.format("Could not instantiate %s.", str2), e5);
                return null;
            } catch (InstantiationException e6) {
                Log.w(k.f27376d, String.format("Could not instantiate %s.", str2), e6);
                return null;
            } catch (NoSuchMethodException e7) {
                Log.w(k.f27376d, String.format("Could not instantiate %s", str2), e7);
                return null;
            } catch (InvocationTargetException e8) {
                Log.w(k.f27376d, String.format("Could not instantiate %s", str2), e8);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @P
    public synchronized m a(String str) {
        if (this.f27380c.containsKey(str)) {
            return this.f27380c.get(str);
        }
        d b4 = this.f27378a.b(str);
        if (b4 == null) {
            return null;
        }
        m create = b4.create(this.f27379b.a(str));
        this.f27380c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f27380c = new HashMap();
        this.f27378a = aVar;
        this.f27379b = iVar;
    }
}
