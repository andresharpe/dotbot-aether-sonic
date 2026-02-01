package com.harman.jbl.cd_biz_comm.wireless_tech;

import X2.p;
import androidx.annotation.h0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@h0
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> f38178a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> f38179b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> f38180c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f38181F = new a();

        a() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice partyLightDevice, @l3.d List<PartyLightDevice> list) {
            F.p(partyLightDevice, "<anonymous parameter 0>");
            F.p(list, "<anonymous parameter 1>");
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f38182F = new b();

        b() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice partyLightDevice, @l3.d List<PartyLightDevice> list) {
            F.p(partyLightDevice, "<anonymous parameter 0>");
            F.p(list, "<anonymous parameter 1>");
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f38183F = new c();

        c() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice partyLightDevice, @l3.d List<PartyLightDevice> list) {
            F.p(partyLightDevice, "<anonymous parameter 0>");
            F.p(list, "<anonymous parameter 1>");
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    public f() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f e(f fVar, p pVar, p pVar2, p pVar3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = fVar.f38178a;
        }
        if ((i4 & 2) != 0) {
            pVar2 = fVar.f38179b;
        }
        if ((i4 & 4) != 0) {
            pVar3 = fVar.f38180c;
        }
        return fVar.d(pVar, pVar2, pVar3);
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> a() {
        return this.f38178a;
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> b() {
        return this.f38179b;
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> c() {
        return this.f38180c;
    }

    @l3.d
    public final f d(@l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightAdd, @l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightUpdate, @l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightLose) {
        F.p(onLightAdd, "onLightAdd");
        F.p(onLightUpdate, "onLightUpdate");
        F.p(onLightLose, "onLightLose");
        return new f(onLightAdd, onLightUpdate, onLightLose);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return F.g(this.f38178a, fVar.f38178a) && F.g(this.f38179b, fVar.f38179b) && F.g(this.f38180c, fVar.f38180c);
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> f() {
        return this.f38178a;
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> g() {
        return this.f38180c;
    }

    @l3.d
    public final p<PartyLightDevice, List<PartyLightDevice>, H0> h() {
        return this.f38179b;
    }

    public int hashCode() {
        return (((this.f38178a.hashCode() * 31) + this.f38179b.hashCode()) * 31) + this.f38180c.hashCode();
    }

    public final void i(@l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> pVar) {
        F.p(pVar, "<set-?>");
        this.f38178a = pVar;
    }

    public final void j(@l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> pVar) {
        F.p(pVar, "<set-?>");
        this.f38180c = pVar;
    }

    public final void k(@l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> pVar) {
        F.p(pVar, "<set-?>");
        this.f38179b = pVar;
    }

    @l3.d
    public String toString() {
        return "DevDiscoverObserver(onLightAdd=" + this.f38178a + ", onLightUpdate=" + this.f38179b + ", onLightLose=" + this.f38180c + ")";
    }

    public f(@l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightAdd, @l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightUpdate, @l3.d p<? super PartyLightDevice, ? super List<PartyLightDevice>, H0> onLightLose) {
        F.p(onLightAdd, "onLightAdd");
        F.p(onLightUpdate, "onLightUpdate");
        F.p(onLightLose, "onLightLose");
        this.f38178a = onLightAdd;
        this.f38179b = onLightUpdate;
        this.f38180c = onLightLose;
    }

    public /* synthetic */ f(p pVar, p pVar2, p pVar3, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? a.f38181F : pVar, (i4 & 2) != 0 ? b.f38182F : pVar2, (i4 & 4) != 0 ? c.f38183F : pVar3);
    }
}
