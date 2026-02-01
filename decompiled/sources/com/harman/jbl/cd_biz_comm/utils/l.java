package com.harman.jbl.cd_biz_comm.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.P;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final l f37929a = new l();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private static Handler f37930b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Runnable {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        public static final C0345a f37931G = new C0345a(null);

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final P<T> f37932E;

        /* renamed from: F, reason: collision with root package name */
        @l3.e
        private final T f37933F;

        /* renamed from: com.harman.jbl.cd_biz_comm.utils.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0345a {
            public /* synthetic */ C0345a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final <T> a<T> a(@l3.d P<T> liveData, @l3.e T t3) {
                F.p(liveData, "liveData");
                return new a<>(liveData, t3, null);
            }

            private C0345a() {
            }
        }

        public /* synthetic */ a(P p4, Object obj, C2197u c2197u) {
            this(p4, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37932E.r(this.f37933F);
        }

        private a(P<T> p4, T t3) {
            this.f37932E = p4;
            this.f37933F = t3;
        }
    }

    private l() {
    }

    @W2.n
    public static final <T> void a(@l3.d P<T> mld, @l3.e T t3) {
        F.p(mld, "mld");
        if (f37930b == null) {
            f37930b = new Handler(Looper.getMainLooper());
        }
        Handler handler = f37930b;
        if (handler != null) {
            handler.post(a.f37931G.a(mld, t3));
        }
    }

    @W2.n
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
