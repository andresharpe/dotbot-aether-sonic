package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

@W(18)
/* renamed from: androidx.core.os.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0739b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0739b f12730a = new C0739b();

    private C0739b() {
    }

    @W2.n
    @InterfaceC0577u
    public static final void a(@l3.d Bundle bundle, @l3.d String key, @l3.e IBinder iBinder) {
        kotlin.jvm.internal.F.p(bundle, "bundle");
        kotlin.jvm.internal.F.p(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
