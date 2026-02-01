package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.Executor;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205n<L> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28354a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private volatile L f28355b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private volatile a<L> f28356c;

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        private final L f28357a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28358b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @I0.a
        public a(L l4, String str) {
            this.f28357a = l4;
            this.f28358b = str;
        }

        @I0.a
        @androidx.annotation.N
        public String a() {
            String str = this.f28358b;
            int identityHashCode = System.identityHashCode(this.f28357a);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }

        @I0.a
        public boolean equals(@androidx.annotation.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28357a == aVar.f28357a && this.f28358b.equals(aVar.f28358b)) {
                return true;
            }
            return false;
        }

        @I0.a
        public int hashCode() {
            return (System.identityHashCode(this.f28357a) * 31) + this.f28358b.hashCode();
        }
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.n$b */
    /* loaded from: classes.dex */
    public interface b<L> {
        @I0.a
        void a(@androidx.annotation.N L l4);

        @I0.a
        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @I0.a
    public C1205n(@androidx.annotation.N Looper looper, @androidx.annotation.N L l4, @androidx.annotation.N String str) {
        this.f28354a = new com.google.android.gms.common.util.concurrent.a(looper);
        this.f28355b = (L) C1285y.m(l4, "Listener must not be null");
        this.f28356c = new a<>(l4, C1285y.h(str));
    }

    @I0.a
    public void a() {
        this.f28355b = null;
        this.f28356c = null;
    }

    @androidx.annotation.P
    @I0.a
    public a<L> b() {
        return this.f28356c;
    }

    @I0.a
    public boolean c() {
        return this.f28355b != null;
    }

    @I0.a
    public void d(@androidx.annotation.N final b<? super L> bVar) {
        C1285y.m(bVar, "Notifier must not be null");
        this.f28354a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.I0
            @Override // java.lang.Runnable
            public final void run() {
                C1205n.this.e(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(b<? super L> bVar) {
        L l4 = this.f28355b;
        if (l4 == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l4);
        } catch (RuntimeException e4) {
            bVar.b();
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @I0.a
    public C1205n(@androidx.annotation.N Executor executor, @androidx.annotation.N L l4, @androidx.annotation.N String str) {
        this.f28354a = (Executor) C1285y.m(executor, "Executor must not be null");
        this.f28355b = (L) C1285y.m(l4, "Listener must not be null");
        this.f28356c = new a<>(l4, C1285y.h(str));
    }
}
