package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* renamed from: com.google.android.gms.common.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1283x {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1253h0 f28833a = new C1245d0();

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.x$a */
    /* loaded from: classes.dex */
    public interface a<R extends com.google.android.gms.common.api.q, T> {
        @androidx.annotation.P
        @I0.a
        T a(@androidx.annotation.N R r4);
    }

    @I0.a
    @androidx.annotation.N
    public static <R extends com.google.android.gms.common.api.q, T extends com.google.android.gms.common.api.p<R>> AbstractC1770k<T> a(@androidx.annotation.N com.google.android.gms.common.api.l<R> lVar, @androidx.annotation.N T t3) {
        return b(lVar, new C1249f0(t3));
    }

    @I0.a
    @androidx.annotation.N
    public static <R extends com.google.android.gms.common.api.q, T> AbstractC1770k<T> b(@androidx.annotation.N com.google.android.gms.common.api.l<R> lVar, @androidx.annotation.N a<R, T> aVar) {
        InterfaceC1253h0 interfaceC1253h0 = f28833a;
        C1771l c1771l = new C1771l();
        lVar.addStatusListener(new C1247e0(lVar, c1771l, aVar, interfaceC1253h0));
        return c1771l.a();
    }

    @I0.a
    @androidx.annotation.N
    public static <R extends com.google.android.gms.common.api.q> AbstractC1770k<Void> c(@androidx.annotation.N com.google.android.gms.common.api.l<R> lVar) {
        return b(lVar, new C1251g0());
    }
}
