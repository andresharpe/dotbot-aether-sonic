package com.harman.jbl.partylight.lib.debug;

import X2.p;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.blankj.utilcode.util.A0;
import com.blankj.utilcode.util.C1115z;
import com.harman.jbl.cd_biz_comm.utils.i;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class f extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<List<String>> f46481H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final List<String> f46482I = new ArrayList();

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.e f46483J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final PartyLightDevice f46484K;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements p<ModuleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.g, H0> {
        a() {
            super(2);
        }

        public final void c(@l3.d ModuleDevice dev, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.g notify) {
            F.p(dev, "dev");
            F.p(notify, "notify");
            f.this.w(i.f(notify.g()));
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(ModuleDevice moduleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.g gVar) {
            c(moduleDevice, gVar);
            return H0.f51801a;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.debug.DebugConfigViewModel$sendCommand$1", f = "DebugConfigActivity.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46486I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ String f46488K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f46488K = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46486I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                String g4 = f.this.f46484K.g();
                byte[] C3 = C1115z.C(this.f46488K);
                F.o(C3, "hexString2Bytes(...)");
                this.f46486I = 1;
                obj = cVar.f(g4, C3, this);
                if (obj == l4) {
                    return l4;
                }
            }
            com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i iVar = (com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i) obj;
            if (!iVar.f()) {
                f.this.w(iVar.e());
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
            return new b(this.f46488K, cVar);
        }
    }

    public f() {
        com.harman.jbl.cd_biz_comm.wireless_tech.e eVar = new com.harman.jbl.cd_biz_comm.wireless_tech.e(null, null, new a(), 3, null);
        this.f46483J = eVar;
        this.f46484K = com.harman.jbl.partylight.lib.core.b.f46256F.j();
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
        List<String> V5;
        this.f46482I.add(A0.M() + " : " + str);
        P<List<String>> p4 = this.f46481H;
        V5 = D.V5(this.f46482I);
        p4.r(V5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.A(this.f46483J);
    }

    public final void x() {
        List<String> V5;
        this.f46482I.clear();
        P<List<String>> p4 = this.f46481H;
        V5 = D.V5(this.f46482I);
        p4.r(V5);
    }

    @l3.d
    public final P<List<String>> y() {
        return this.f46481H;
    }

    public final void z(@l3.d String hexContent) {
        F.p(hexContent, "hexContent");
        C2323l.f(k0.a(this), null, null, new b(hexContent, null), 3, null);
    }
}
