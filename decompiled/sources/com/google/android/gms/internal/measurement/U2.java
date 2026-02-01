package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U2 implements R2 {

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.B("GservicesLoader.class")
    private static U2 f29508c;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Context f29509a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ContentObserver f29510b;

    private U2() {
        this.f29509a = null;
        this.f29510b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static U2 a(Context context) {
        U2 u22;
        U2 u23;
        synchronized (U2.class) {
            try {
                if (f29508c == null) {
                    if (androidx.core.content.K.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        u23 = new U2(context);
                    } else {
                        u23 = new U2();
                    }
                    f29508c = u23;
                }
                u22 = f29508c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        Context context;
        synchronized (U2.class) {
            try {
                U2 u22 = f29508c;
                if (u22 != null && (context = u22.f29509a) != null && u22.f29510b != null) {
                    context.getContentResolver().unregisterContentObserver(f29508c.f29510b);
                }
                f29508c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.R2
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f29509a;
        if (context != null && !I2.a(context)) {
            try {
                return (String) P2.a(new Q2() { // from class: com.google.android.gms.internal.measurement.S2
                    @Override // com.google.android.gms.internal.measurement.Q2
                    public final Object zza() {
                        return U2.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e4) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e4);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return G2.a(this.f29509a.getContentResolver(), str, null);
    }

    private U2(Context context) {
        this.f29509a = context;
        T2 t22 = new T2(this, null);
        this.f29510b = t22;
        context.getContentResolver().registerContentObserver(G2.f29329a, true, t22);
    }
}
