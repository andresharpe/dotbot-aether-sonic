package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26703b = "ManifestParser";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26704c = "GlideModule";

    /* renamed from: a, reason: collision with root package name */
    private final Context f26705a;

    public e(Context context) {
        this.f26705a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bumptech.glide.module.c b(java.lang.String r3) {
        /*
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L48
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.Object r3 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            goto L2a
        L12:
            r0 = move-exception
            goto L1a
        L14:
            r0 = move-exception
            goto L1e
        L16:
            r0 = move-exception
            goto L22
        L18:
            r0 = move-exception
            goto L26
        L1a:
            c(r3, r0)
            goto L29
        L1e:
            c(r3, r0)
            goto L29
        L22:
            c(r3, r0)
            goto L29
        L26:
            c(r3, r0)
        L29:
            r3 = 0
        L2a:
            boolean r0 = r3 instanceof com.bumptech.glide.module.c
            if (r0 == 0) goto L31
            com.bumptech.glide.module.c r3 = (com.bumptech.glide.module.c) r3
            return r3
        L31:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L48:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.module.e.b(java.lang.String):com.bumptech.glide.module.c");
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<c> a() {
        if (Log.isLoggable(f26703b, 3)) {
            Log.d(f26703b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f26705a.getPackageManager().getApplicationInfo(this.f26705a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable(f26703b, 3)) {
                    Log.d(f26703b, "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable(f26703b, 2)) {
                Log.v(f26703b, "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if (f26704c.equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                    if (Log.isLoggable(f26703b, 3)) {
                        Log.d(f26703b, "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable(f26703b, 3)) {
                Log.d(f26703b, "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e4);
        }
    }
}
