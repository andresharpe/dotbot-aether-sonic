package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class M2 implements R2 {

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.B("ConfigurationContentLoader.class")
    private static final Map f29386h = new androidx.collection.a();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f29387i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f29388a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f29389b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f29390c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f29391d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f29392e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f29393f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("this")
    private final List f29394g;

    private M2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        L2 l22 = new L2(this, null);
        this.f29391d = l22;
        this.f29392e = new Object();
        this.f29394g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f29388a = contentResolver;
        this.f29389b = uri;
        this.f29390c = runnable;
        contentResolver.registerContentObserver(uri, false, l22);
    }

    public static M2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        M2 m22;
        synchronized (M2.class) {
            Map map = f29386h;
            m22 = (M2) map.get(uri);
            if (m22 == null) {
                try {
                    M2 m23 = new M2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, m23);
                    } catch (SecurityException unused) {
                    }
                    m22 = m23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return m22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (M2.class) {
            try {
                for (M2 m22 : f29386h.values()) {
                    m22.f29388a.unregisterContentObserver(m22.f29391d);
                }
                f29386h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b() {
        Map map;
        Map map2;
        Map map3 = this.f29393f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f29392e) {
                Map map5 = this.f29393f;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) P2.a(new Q2() { // from class: com.google.android.gms.internal.measurement.K2
                                @Override // com.google.android.gms.internal.measurement.Q2
                                public final Object zza() {
                                    return M2.this.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map2 = null;
                        }
                        this.f29393f = map2;
                        allowThreadDiskReads = map2;
                        map = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map;
        }
        if (map4 != null) {
            return map4;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Map hashMap;
        Cursor query = this.f29388a.query(this.f29389b, f29387i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new androidx.collection.a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f29392e) {
            this.f29393f = null;
            this.f29390c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f29394g.iterator();
                while (it.hasNext()) {
                    ((N2) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) b().get(str);
    }
}
