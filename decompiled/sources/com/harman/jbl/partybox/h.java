package com.harman.jbl.partybox;

import W2.n;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.P;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final h f40556a = new h();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private static Handler f40557b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Runnable {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        public static final C0359a f40558G = new C0359a(null);

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final P<T> f40559E;

        /* renamed from: F, reason: collision with root package name */
        @l3.e
        private final T f40560F;

        /* renamed from: com.harman.jbl.partybox.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0359a {
            public /* synthetic */ C0359a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final <T> a<T> a(@l3.d P<T> liveData, @l3.e T t3) {
                F.p(liveData, "liveData");
                return new a<>(liveData, t3, null);
            }

            private C0359a() {
            }
        }

        public /* synthetic */ a(P p4, Object obj, C2197u c2197u) {
            this(p4, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40559E.r(this.f40560F);
        }

        private a(P<T> p4, T t3) {
            this.f40559E = p4;
            this.f40560F = t3;
        }
    }

    private h() {
    }

    @n
    public static final <T> void a(@l3.d P<T> mld, @l3.e T t3) {
        F.p(mld, "mld");
        if (f40557b == null) {
            f40557b = new Handler(Looper.getMainLooper());
        }
        Handler handler = f40557b;
        if (handler != null) {
            handler.post(a.f40558G.a(mld, t3));
        }
    }

    @n
    public static final <T> void c(@l3.e P<T> p4, @l3.e T t3) {
        if (p4 == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            p4.r(t3);
        } else {
            a(p4, t3);
        }
    }

    public final <T> void b(@l3.d P<T> p4, T t3) {
        F.p(p4, "<this>");
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            p4.r(t3);
        } else {
            p4.o(t3);
        }
    }
}
