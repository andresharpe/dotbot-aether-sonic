package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC1220v;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.location.InterfaceC1335n;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

/* renamed from: com.google.android.gms.location.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1558c extends com.google.android.gms.common.api.h<C1164a.d.C0267d> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f29973k = 0;

    public C1558c(@androidx.annotation.N Activity activity) {
        super(activity, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }

    @androidx.annotation.Y("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @androidx.annotation.N
    public AbstractC1770k<Void> A(@androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(pendingIntent) { // from class: com.google.android.gms.location.L0

            /* renamed from: a, reason: collision with root package name */
            private final PendingIntent f29915a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29915a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).J0(this.f29915a, new O0((C1771l) obj2));
            }
        }).f(2406).a());
    }

    @androidx.annotation.Y("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @androidx.annotation.N
    public AbstractC1770k<Void> B(@androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(pendingIntent) { // from class: com.google.android.gms.location.J0

            /* renamed from: a, reason: collision with root package name */
            private final PendingIntent f29903a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29903a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).K0(this.f29903a);
                ((C1771l) obj2).c(null);
            }
        }).f(2402).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> C(@androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(pendingIntent) { // from class: com.google.android.gms.location.M0

            /* renamed from: a, reason: collision with root package name */
            private final PendingIntent f29937a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29937a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).L0(this.f29937a, new O0((C1771l) obj2));
            }
        }).f(2411).a());
    }

    @androidx.annotation.Y("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @androidx.annotation.N
    public AbstractC1770k<Void> D(@androidx.annotation.N final C1564f c1564f, @androidx.annotation.N final PendingIntent pendingIntent) {
        c1564f.e0(r());
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(c1564f, pendingIntent) { // from class: com.google.android.gms.location.K0

            /* renamed from: a, reason: collision with root package name */
            private final C1564f f29910a;

            /* renamed from: b, reason: collision with root package name */
            private final PendingIntent f29911b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29910a = c1564f;
                this.f29911b = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).I0(this.f29910a, this.f29911b, new O0((C1771l) obj2));
            }
        }).f(2405).a());
    }

    @androidx.annotation.Y("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @androidx.annotation.N
    public AbstractC1770k<Void> E(final long j4, @androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(j4, pendingIntent) { // from class: com.google.android.gms.location.H0

            /* renamed from: a, reason: collision with root package name */
            private final long f29896a;

            /* renamed from: b, reason: collision with root package name */
            private final PendingIntent f29897b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29896a = j4;
                this.f29897b = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).H0(this.f29896a, this.f29897b);
                ((C1771l) obj2).c(null);
            }
        }).f(2401).a());
    }

    @androidx.annotation.Y("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @androidx.annotation.N
    public AbstractC1770k<Void> F(@androidx.annotation.N final PendingIntent pendingIntent, @androidx.annotation.N final E e4) {
        C1285y.m(pendingIntent, "PendingIntent must be specified.");
        return i(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(this, pendingIntent, e4) { // from class: com.google.android.gms.location.I0

            /* renamed from: a, reason: collision with root package name */
            private final C1558c f29899a;

            /* renamed from: b, reason: collision with root package name */
            private final PendingIntent f29900b;

            /* renamed from: c, reason: collision with root package name */
            private final E f29901c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29899a = this;
                this.f29900b = pendingIntent;
                this.f29901c = e4;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                C1558c c1558c = this.f29899a;
                ((InterfaceC1335n) ((com.google.android.gms.internal.location.A) obj).M()).G1(this.f29900b, this.f29901c, new N0(c1558c, (C1771l) obj2));
            }
        }).e(Z0.f29960b).f(2410).a());
    }

    public C1558c(@androidx.annotation.N Context context) {
        super(context, C1589s.f30052a, C1164a.d.f28041g, h.a.f28086c);
    }
}
