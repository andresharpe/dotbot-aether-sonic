package androidx.core.app;

import android.app.Service;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12130a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12131b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12132c = 2;

    @androidx.annotation.W(24)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(Service service, int i4) {
            service.stopForeground(i4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface b {
    }

    private w1() {
    }

    public static void a(@androidx.annotation.N Service service, int i4) {
        a.a(service, i4);
    }
}
