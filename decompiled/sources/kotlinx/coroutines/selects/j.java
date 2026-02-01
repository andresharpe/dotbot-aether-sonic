package kotlinx.coroutines.selects;

import X2.l;
import X2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.H0;
import kotlin.U;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.selects.a;

@U
/* loaded from: classes2.dex */
public final class j<R> implements kotlinx.coroutines.selects.a<R> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.selects.b<R> f54669E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final ArrayList<X2.a<H0>> f54670F = new ArrayList<>();

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.c f54671F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ j<R> f54672G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.c<? super R>, Object> f54673H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.selects.c cVar, j<? super R> jVar, l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
            super(0);
            this.f54671F = cVar;
            this.f54672G = jVar;
            this.f54673H = lVar;
        }

        public final void c() {
            this.f54671F.J(this.f54672G.b(), this.f54673H);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.d<Q> f54674F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ j<R> f54675G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<Q, kotlin.coroutines.c<? super R>, Object> f54676H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.selects.d<? extends Q> dVar, j<? super R> jVar, p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            super(0);
            this.f54674F = dVar;
            this.f54675G = jVar;
            this.f54676H = pVar;
        }

        public final void c() {
            this.f54674F.X(this.f54675G.b(), this.f54676H);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ e<P, Q> f54677F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ j<R> f54678G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ P f54679H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ p<Q, kotlin.coroutines.c<? super R>, Object> f54680I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e<? super P, ? extends Q> eVar, j<? super R> jVar, P p4, p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            super(0);
            this.f54677F = eVar;
            this.f54678G = jVar;
            this.f54679H = p4;
            this.f54680I = pVar;
        }

        public final void c() {
            this.f54677F.C(this.f54678G.b(), this.f54679H, this.f54680I);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ j<R> f54681F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f54682G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.c<? super R>, Object> f54683H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(j<? super R> jVar, long j4, l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
            super(0);
            this.f54681F = jVar;
            this.f54682G = j4;
            this.f54683H = lVar;
        }

        public final void c() {
            this.f54681F.b().j(this.f54682G, this.f54683H);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    public j(@l3.d kotlin.coroutines.c<? super R> cVar) {
        this.f54669E = new kotlinx.coroutines.selects.b<>(cVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public <Q> void H(@l3.d kotlinx.coroutines.selects.d<? extends Q> dVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.f54670F.add(new b(dVar, this, pVar));
    }

    @l3.d
    public final ArrayList<X2.a<H0>> a() {
        return this.f54670F;
    }

    @l3.d
    public final kotlinx.coroutines.selects.b<R> b() {
        return this.f54669E;
    }

    @Override // kotlinx.coroutines.selects.a
    public void b0(@l3.d kotlinx.coroutines.selects.c cVar, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        this.f54670F.add(new a(cVar, this, lVar));
    }

    @U
    public final void c(@l3.d Throwable th) {
        this.f54669E.g1(th);
    }

    @l3.e
    @U
    public final Object d() {
        if (!this.f54669E.J()) {
            try {
                Collections.shuffle(this.f54670F);
                Iterator<T> it = this.f54670F.iterator();
                while (it.hasNext()) {
                    ((X2.a) it.next()).n();
                }
            } catch (Throwable th) {
                this.f54669E.g1(th);
            }
        }
        return this.f54669E.f1();
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void h(@l3.d e<? super P, ? extends Q> eVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        a.C0504a.a(this, eVar, pVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void i(@l3.d e<? super P, ? extends Q> eVar, P p4, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.f54670F.add(new c(eVar, this, p4, pVar));
    }

    @Override // kotlinx.coroutines.selects.a
    public void j(long j4, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        this.f54670F.add(new d(this, j4, lVar));
    }
}
