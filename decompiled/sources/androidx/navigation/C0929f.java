package androidx.navigation;

import androidx.core.app.C0623e;
import androidx.navigation.C0926c;

/* renamed from: androidx.navigation.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929f {
    @l3.d
    public static final C0926c.C0156c a(@l3.e C0623e c0623e, int i4) {
        C0926c.C0156c.a aVar = new C0926c.C0156c.a();
        if (c0623e != null) {
            aVar.c(c0623e);
        }
        aVar.a(i4);
        return aVar.b();
    }

    public static /* synthetic */ C0926c.C0156c b(C0623e c0623e, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            c0623e = null;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return a(c0623e, i4);
    }
}
