package com.android.volley;

/* loaded from: classes.dex */
public abstract class o<T> implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final Request<T> f24519E;

    public o(Request<T> request) {
        this.f24519E = request;
    }

    public int a(o<?> oVar) {
        return this.f24519E.compareTo(oVar.f24519E);
    }
}
