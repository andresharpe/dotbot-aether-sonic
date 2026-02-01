package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.emoji2.text.r;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14572a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @B("INSTANCE_LOCK")
    private static volatile Editable.Factory f14573b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private static Class<?> f14574c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f14574c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f14573b == null) {
            synchronized (f14572a) {
                try {
                    if (f14573b == null) {
                        f14573b = new b();
                    }
                } finally {
                }
            }
        }
        return f14573b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@N CharSequence charSequence) {
        Class<?> cls = f14574c;
        if (cls != null) {
            return r.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
