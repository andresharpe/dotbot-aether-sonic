package androidx.startup;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18459a = "StartupLogger";

    /* renamed from: b, reason: collision with root package name */
    static final boolean f18460b = false;

    private d() {
    }

    public static void a(@N String str, @P Throwable th) {
        Log.e(f18459a, str, th);
    }

    public static void b(@N String str) {
        Log.i(f18459a, str);
    }

    public static void c(@N String str) {
        Log.w(f18459a, str);
    }
}
