package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1431k3 implements R2 {

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.B("SharedPreferencesLoader.class")
    private static final Map f29702c = new androidx.collection.a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f29703a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f29704b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static C1431k3 a(Context context, String str, Runnable runnable) {
        C1431k3 c1431k3;
        if (!I2.b()) {
            synchronized (C1431k3.class) {
                try {
                    c1431k3 = (C1431k3) f29702c.get(null);
                    if (c1431k3 == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c1431k3;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (C1431k3.class) {
            Map map = f29702c;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C1431k3) it.next()).f29703a;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.R2
    @androidx.annotation.P
    public final Object zzb(String str) {
        throw null;
    }
}
