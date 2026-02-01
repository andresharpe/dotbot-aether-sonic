package org.hamcrest.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class d<T> extends org.hamcrest.b<T> {

    /* renamed from: H, reason: collision with root package name */
    private static final Pattern f55430H = Pattern.compile("%([0-9]+)");

    /* renamed from: E, reason: collision with root package name */
    private final String f55431E;

    /* renamed from: F, reason: collision with root package name */
    private final org.hamcrest.k<T> f55432F;

    /* renamed from: G, reason: collision with root package name */
    private final Object[] f55433G;

    public d(String str, org.hamcrest.k<T> kVar, Object[] objArr) {
        this.f55431E = str;
        this.f55432F = kVar;
        this.f55433G = (Object[]) objArr.clone();
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> e(String str, org.hamcrest.k<T> kVar, Object... objArr) {
        return new d(str, kVar, objArr);
    }

    @Override // org.hamcrest.b, org.hamcrest.k
    public void a(Object obj, org.hamcrest.g gVar) {
        this.f55432F.a(obj, gVar);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        Matcher matcher = f55430H.matcher(this.f55431E);
        int i4 = 0;
        while (matcher.find()) {
            gVar.d(this.f55431E.substring(i4, matcher.start()));
            gVar.e(this.f55433G[Integer.parseInt(matcher.group(1))]);
            i4 = matcher.end();
        }
        if (i4 < this.f55431E.length()) {
            gVar.d(this.f55431E.substring(i4));
        }
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        return this.f55432F.c(obj);
    }
}
