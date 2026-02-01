package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.i0
    static final String f36913d = "com.google.android.gms.appid";

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.i0
    static final String f36914e = "topic_operation_queue";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36915f = ",";

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("TopicsStore.class")
    private static WeakReference<e0> f36916g;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36917a;

    /* renamed from: b, reason: collision with root package name */
    private a0 f36918b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36919c;

    private e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f36919c = executor;
        this.f36917a = sharedPreferences;
    }

    @androidx.annotation.i0
    static synchronized void b() {
        synchronized (e0.class) {
            WeakReference<e0> weakReference = f36916g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @androidx.annotation.j0
    public static synchronized e0 d(Context context, Executor executor) {
        e0 e0Var;
        synchronized (e0.class) {
            try {
                WeakReference<e0> weakReference = f36916g;
                if (weakReference != null) {
                    e0Var = weakReference.get();
                } else {
                    e0Var = null;
                }
                if (e0Var == null) {
                    e0Var = new e0(context.getSharedPreferences(f36913d, 0), executor);
                    e0Var.g();
                    f36916g = new WeakReference<>(e0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    @androidx.annotation.j0
    private synchronized void g() {
        this.f36918b = a0.j(this.f36917a, f36914e, f36915f, this.f36919c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(d0 d0Var) {
        return this.f36918b.b(d0Var.e());
    }

    synchronized void c() {
        this.f36918b.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public synchronized d0 e() {
        return d0.a(this.f36918b.l());
    }

    @androidx.annotation.N
    synchronized List<d0> f() {
        ArrayList arrayList;
        List<String> t3 = this.f36918b.t();
        arrayList = new ArrayList(t3.size());
        Iterator<String> it = t3.iterator();
        while (it.hasNext()) {
            arrayList.add(d0.a(it.next()));
        }
        return arrayList;
    }

    @androidx.annotation.P
    synchronized d0 h() {
        try {
        } catch (NoSuchElementException unused) {
            Log.e(C1821f.f36920a, "Polling operation queue failed");
            return null;
        }
        return d0.a(this.f36918b.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(d0 d0Var) {
        return this.f36918b.n(d0Var.e());
    }
}
