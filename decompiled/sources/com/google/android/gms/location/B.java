package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC1220v;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
public class B extends com.google.android.gms.common.api.h<C1164a.d.C0267d> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f29864k = 0;

    public B(@androidx.annotation.N Activity activity) {
        super(activity, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }

    @androidx.annotation.N
    public AbstractC1770k<C1593u> A(@androidx.annotation.N final C1591t c1591t) {
        return i(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(c1591t) { // from class: com.google.android.gms.location.A0

            /* renamed from: a, reason: collision with root package name */
            private final C1591t f29858a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29858a = c1591t;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).G0(this.f29858a, new B0((C1771l) obj2), null);
            }
        }).f(2426).a());
    }

    public B(@androidx.annotation.N Context context) {
        super(context, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }
}
