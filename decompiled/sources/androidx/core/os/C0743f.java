package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

/* renamed from: androidx.core.os.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743f {

    @W(24)
    /* renamed from: androidx.core.os.f$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private C0743f() {
    }

    @androidx.annotation.N
    public static C0750m a(@androidx.annotation.N Configuration configuration) {
        return C0750m.o(a.a(configuration));
    }
}
