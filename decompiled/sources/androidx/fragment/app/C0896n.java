package androidx.fragment.app;

import android.os.Bundle;
import kotlin.H0;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896n {
    public static final void b(@l3.d Fragment fragment, @l3.d String requestKey) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().d(requestKey);
    }

    public static final void c(@l3.d Fragment fragment, @l3.d String requestKey) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().c(requestKey);
    }

    public static final void d(@l3.d Fragment fragment, @l3.d String requestKey, @l3.d Bundle result) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(requestKey, "requestKey");
        kotlin.jvm.internal.F.p(result, "result");
        fragment.getParentFragmentManager().a(requestKey, result);
    }

    public static final void e(@l3.d Fragment fragment, @l3.d String requestKey, @l3.d final X2.p<? super String, ? super Bundle, H0> listener) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(requestKey, "requestKey");
        kotlin.jvm.internal.F.p(listener, "listener");
        fragment.getParentFragmentManager().b(requestKey, fragment, new y() { // from class: androidx.fragment.app.m
            @Override // androidx.fragment.app.y
            public final void a(String str, Bundle bundle) {
                C0896n.f(X2.p.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(X2.p tmp0, String p02, Bundle p12) {
        kotlin.jvm.internal.F.p(tmp0, "$tmp0");
        kotlin.jvm.internal.F.p(p02, "p0");
        kotlin.jvm.internal.F.p(p12, "p1");
        tmp0.c0(p02, p12);
    }
}
