package com.harman.jbl.partylight.lib.partystage;

import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.partystage.command.StageStatus;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class e extends j0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f47445I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final String f47446J = "PartyStageDoneViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final PartyLightDevice f47447H = com.harman.jbl.partylight.lib.core.b.f46256F.j();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageDoneViewModel$stageShowDemo$1", f = "PartyStageDoneViewModel.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47448I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47448I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice partyLightDevice = e.this.f47447H;
                com.harman.jbl.partylight.lib.partystage.command.f fVar = new com.harman.jbl.partylight.lib.partystage.command.f(StageStatus.STAGE_DEMO, null, 2, null);
                this.f47448I = 1;
                if (cVar.y(partyLightDevice, fVar, this) == l4) {
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

    public final void v() {
        C2323l.f(k0.a(this), null, null, new b(null), 3, null);
    }
}
