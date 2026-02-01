package com.harman.jbl.partylight.lib.partystage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.z;

/* loaded from: classes2.dex */
public final class q extends j0 {

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    public static final a f47465N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final String f47466O = "PartyStageStartViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<StageState> f47467H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final LiveData<StageState> f47468I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final PartyLightDevice f47469J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final P<String> f47470K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.s<StageSaveResult> f47471L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f47472M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageStartViewModel$cancelStage$1", f = "PartyStageStartViewModel.kt", i = {}, l = {ConstraintLayout.b.a.f9601d0}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47473I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47473I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                v vVar = v.f47482a;
                this.f47473I = 1;
                if (vVar.d(this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageStartViewModel$restartStage$1", f = "PartyStageStartViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47474I;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47474I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                v vVar = v.f47482a;
                this.f47474I = 1;
                obj = vVar.d(this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                q.this.x().j(StageSaveResult.OTHER_ERROR);
                return H0.f51801a;
            }
            q.this.D();
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageStartViewModel$saveStage$1", f = "PartyStageStartViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47476I;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47476I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                q.this.z().r(kotlin.coroutines.jvm.internal.a.a(true));
                v vVar = v.f47482a;
                this.f47476I = 1;
                obj = vVar.h(this);
                if (obj == l4) {
                    return l4;
                }
            }
            q.this.x().j((StageSaveResult) obj);
            q.this.z().r(kotlin.coroutines.jvm.internal.a.a(false));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageStartViewModel$startStage$1", f = "PartyStageStartViewModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47478I;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            int i4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i5 = this.f47478I;
            if (i5 != 0) {
                if (i5 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                v vVar = v.f47482a;
                com.harman.jbl.partylight.lib.main.d b4 = com.harman.jbl.partylight.lib.main.e.b(q.this);
                if (b4 != null) {
                    i4 = b4.u();
                } else {
                    i4 = 0;
                }
                this.f47478I = 1;
                obj = vVar.j(i4, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                q.this.C(StageState.STARTED);
            } else {
                q.this.x().j(StageSaveResult.OTHER_ERROR);
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(cVar);
        }
    }

    public q() {
        P<StageState> p4 = new P<>(StageState.IDLE);
        this.f47467H = p4;
        this.f47468I = p4;
        this.f47469J = com.harman.jbl.partylight.lib.core.b.f46256F.j();
        this.f47470K = new P<>();
        this.f47471L = z.b(0, 1, null, 4, null);
        this.f47472M = new P<>(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(StageState stageState) {
        com.harman.jbl.cd_biz_comm.utils.l.f37929a.b(this.f47467H, stageState);
    }

    public final void A() {
        C2323l.f(k0.a(this), null, null, new c(null), 3, null);
    }

    public final void B() {
        C2323l.f(k0.a(this), null, null, new d(null), 3, null);
    }

    public final void D() {
        C2323l.f(k0.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
    }

    public final void v() {
        C2323l.f(k0.a(this), null, null, new b(null), 3, null);
    }

    @l3.d
    public final P<String> w() {
        return this.f47470K;
    }

    @l3.d
    public final kotlinx.coroutines.flow.s<StageSaveResult> x() {
        return this.f47471L;
    }

    @l3.d
    public final LiveData<StageState> y() {
        return this.f47468I;
    }

    @l3.d
    public final P<Boolean> z() {
        return this.f47472M;
    }
}
