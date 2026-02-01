package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC1220v;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.util.List;

/* renamed from: com.google.android.gms.location.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1580n extends com.google.android.gms.common.api.h<C1164a.d.C0267d> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f30030k = 0;

    public C1580n(@androidx.annotation.N Activity activity) {
        super(activity, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }

    @androidx.annotation.Y("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.N
    public AbstractC1770k<Void> A(@androidx.annotation.N C1584p c1584p, @androidx.annotation.N final PendingIntent pendingIntent) {
        final C1584p i02 = c1584p.i0(r());
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(i02, pendingIntent) { // from class: com.google.android.gms.location.X

            /* renamed from: a, reason: collision with root package name */
            private final C1584p f29950a;

            /* renamed from: b, reason: collision with root package name */
            private final PendingIntent f29951b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29950a = i02;
                this.f29951b = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).M0(this.f29950a, this.f29951b, new C1555a0((C1771l) obj2));
            }
        }).f(2424).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> B(@androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(pendingIntent) { // from class: com.google.android.gms.location.Y

            /* renamed from: a, reason: collision with root package name */
            private final PendingIntent f29957a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29957a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).O0(this.f29957a, new C1555a0((C1771l) obj2));
            }
        }).f(2425).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> C(@androidx.annotation.N final List<String> list) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(list) { // from class: com.google.android.gms.location.Z

            /* renamed from: a, reason: collision with root package name */
            private final List f29958a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29958a = list;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).P0(this.f29958a, new C1555a0((C1771l) obj2));
            }
        }).f(2425).a());
    }

    public C1580n(@androidx.annotation.N Context context) {
        super(context, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }
}
