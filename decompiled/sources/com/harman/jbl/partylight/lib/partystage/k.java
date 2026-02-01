package com.harman.jbl.partylight.lib.partystage;

import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends j0 {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f47455J = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final String f47456K = "PartyStagePlacedViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<List<PartyLightDevice>> f47457H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.c f47458I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<H0> {
        b() {
            super(0);
        }

        public final void c() {
            k.this.f47457H.r(com.harman.jbl.partylight.lib.core.b.f46256F.i());
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    public k() {
        com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
        this.f47457H = new P<>(bVar.i());
        com.harman.jbl.partylight.lib.c cVar = new com.harman.jbl.partylight.lib.c(null, null, new b(), null, 11, null);
        this.f47458I = cVar;
        bVar.p(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
        com.harman.jbl.partylight.lib.core.b.f46256F.r(this.f47458I);
    }

    @l3.d
    public final P<List<PartyLightDevice>> v() {
        return this.f47457H;
    }
}
