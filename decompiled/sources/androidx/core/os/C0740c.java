package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

@W(21)
/* renamed from: androidx.core.os.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0740c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0740c f12731a = new C0740c();

    private C0740c() {
    }

    @W2.n
    @InterfaceC0577u
    public static final void a(@l3.d Bundle bundle, @l3.d String key, @l3.e Size size) {
        kotlin.jvm.internal.F.p(bundle, "bundle");
        kotlin.jvm.internal.F.p(key, "key");
        bundle.putSize(key, size);
    }

    @W2.n
    @InterfaceC0577u
    public static final void b(@l3.d Bundle bundle, @l3.d String key, @l3.e SizeF sizeF) {
        kotlin.jvm.internal.F.p(bundle, "bundle");
        kotlin.jvm.internal.F.p(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
