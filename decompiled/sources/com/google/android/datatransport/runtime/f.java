package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.C1137g;
import com.google.android.datatransport.runtime.scheduling.persistence.C1138h;
import com.google.android.datatransport.runtime.scheduling.persistence.C1139i;
import com.google.android.datatransport.runtime.scheduling.persistence.C1140j;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import com.google.android.datatransport.runtime.scheduling.persistence.N;
import com.google.android.datatransport.runtime.scheduling.persistence.O;
import com.google.android.datatransport.runtime.scheduling.persistence.W;
import com.google.android.datatransport.runtime.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class f extends w {

    /* renamed from: E, reason: collision with root package name */
    private O2.c<Executor> f27433E;

    /* renamed from: F, reason: collision with root package name */
    private O2.c<Context> f27434F;

    /* renamed from: G, reason: collision with root package name */
    private O2.c f27435G;

    /* renamed from: H, reason: collision with root package name */
    private O2.c f27436H;

    /* renamed from: I, reason: collision with root package name */
    private O2.c f27437I;

    /* renamed from: J, reason: collision with root package name */
    private O2.c<String> f27438J;

    /* renamed from: K, reason: collision with root package name */
    private O2.c<N> f27439K;

    /* renamed from: L, reason: collision with root package name */
    private O2.c<SchedulerConfig> f27440L;

    /* renamed from: M, reason: collision with root package name */
    private O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.x> f27441M;

    /* renamed from: N, reason: collision with root package name */
    private O2.c<com.google.android.datatransport.runtime.scheduling.c> f27442N;

    /* renamed from: O, reason: collision with root package name */
    private O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.r> f27443O;

    /* renamed from: P, reason: collision with root package name */
    private O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.v> f27444P;

    /* renamed from: Q, reason: collision with root package name */
    private O2.c<v> f27445Q;

    /* loaded from: classes.dex */
    private static final class b implements w.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f27446a;

        private b() {
        }

        @Override // com.google.android.datatransport.runtime.w.a
        public w a() {
            com.google.android.datatransport.runtime.dagger.internal.p.a(this.f27446a, Context.class);
            return new f(this.f27446a);
        }

        @Override // com.google.android.datatransport.runtime.w.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f27446a = (Context) com.google.android.datatransport.runtime.dagger.internal.p.b(context);
            return this;
        }
    }

    public static w.a c() {
        return new b();
    }

    private void d(Context context) {
        this.f27433E = com.google.android.datatransport.runtime.dagger.internal.f.b(l.a());
        com.google.android.datatransport.runtime.dagger.internal.g a4 = com.google.android.datatransport.runtime.dagger.internal.j.a(context);
        this.f27434F = a4;
        com.google.android.datatransport.runtime.backends.j a5 = com.google.android.datatransport.runtime.backends.j.a(a4, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a());
        this.f27435G = a5;
        this.f27436H = com.google.android.datatransport.runtime.dagger.internal.f.b(com.google.android.datatransport.runtime.backends.l.a(this.f27434F, a5));
        this.f27437I = W.a(this.f27434F, C1137g.a(), C1139i.a());
        this.f27438J = C1138h.a(this.f27434F);
        this.f27439K = com.google.android.datatransport.runtime.dagger.internal.f.b(O.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), C1140j.a(), this.f27437I, this.f27438J));
        com.google.android.datatransport.runtime.scheduling.g b4 = com.google.android.datatransport.runtime.scheduling.g.b(com.google.android.datatransport.runtime.time.e.a());
        this.f27440L = b4;
        com.google.android.datatransport.runtime.scheduling.i a6 = com.google.android.datatransport.runtime.scheduling.i.a(this.f27434F, this.f27439K, b4, com.google.android.datatransport.runtime.time.f.a());
        this.f27441M = a6;
        O2.c<Executor> cVar = this.f27433E;
        O2.c cVar2 = this.f27436H;
        O2.c<N> cVar3 = this.f27439K;
        this.f27442N = com.google.android.datatransport.runtime.scheduling.d.a(cVar, cVar2, a6, cVar3, cVar3);
        O2.c<Context> cVar4 = this.f27434F;
        O2.c cVar5 = this.f27436H;
        O2.c<N> cVar6 = this.f27439K;
        this.f27443O = com.google.android.datatransport.runtime.scheduling.jobscheduling.s.a(cVar4, cVar5, cVar6, this.f27441M, this.f27433E, cVar6, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f27439K);
        O2.c<Executor> cVar7 = this.f27433E;
        O2.c<N> cVar8 = this.f27439K;
        this.f27444P = com.google.android.datatransport.runtime.scheduling.jobscheduling.w.a(cVar7, cVar8, this.f27441M, cVar8);
        this.f27445Q = com.google.android.datatransport.runtime.dagger.internal.f.b(x.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f27442N, this.f27443O, this.f27444P));
    }

    @Override // com.google.android.datatransport.runtime.w
    InterfaceC1134d a() {
        return this.f27439K.get();
    }

    @Override // com.google.android.datatransport.runtime.w
    v b() {
        return this.f27445Q.get();
    }

    private f(Context context) {
        d(context);
    }
}
