package com.harman.jbl.cd_biz_comm.wireless_tech;

import X2.p;
import androidx.annotation.h0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@h0
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final X2.l<ModuleDevice, H0> f38172a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<ModuleDevice, H0> f38173b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final p<ModuleDevice, g, H0> f38174c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.l<ModuleDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f38175F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d ModuleDevice it) {
            F.p(it, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<ModuleDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f38176F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d ModuleDevice it) {
            F.p(it, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements p<ModuleDevice, g, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f38177F = new c();

        c() {
            super(2);
        }

        public final void c(@l3.d ModuleDevice moduleDevice, @l3.d g gVar) {
            F.p(moduleDevice, "<anonymous parameter 0>");
            F.p(gVar, "<anonymous parameter 1>");
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(ModuleDevice moduleDevice, g gVar) {
            c(moduleDevice, gVar);
            return H0.f51801a;
        }
    }

    public e() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e e(e eVar, X2.l lVar, X2.l lVar2, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = eVar.f38172a;
        }
        if ((i4 & 2) != 0) {
            lVar2 = eVar.f38173b;
        }
        if ((i4 & 4) != 0) {
            pVar = eVar.f38174c;
        }
        return eVar.d(lVar, lVar2, pVar);
    }

    @l3.d
    public final X2.l<ModuleDevice, H0> a() {
        return this.f38172a;
    }

    @l3.d
    public final X2.l<ModuleDevice, H0> b() {
        return this.f38173b;
    }

    @l3.d
    public final p<ModuleDevice, g, H0> c() {
        return this.f38174c;
    }

    @l3.d
    public final e d(@l3.d X2.l<? super ModuleDevice, H0> onConnected, @l3.d X2.l<? super ModuleDevice, H0> onDisconnect, @l3.d p<? super ModuleDevice, ? super g, H0> onNotify) {
        F.p(onConnected, "onConnected");
        F.p(onDisconnect, "onDisconnect");
        F.p(onNotify, "onNotify");
        return new e(onConnected, onDisconnect, onNotify);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return F.g(this.f38172a, eVar.f38172a) && F.g(this.f38173b, eVar.f38173b) && F.g(this.f38174c, eVar.f38174c);
    }

    @l3.d
    public final X2.l<ModuleDevice, H0> f() {
        return this.f38172a;
    }

    @l3.d
    public final X2.l<ModuleDevice, H0> g() {
        return this.f38173b;
    }

    @l3.d
    public final p<ModuleDevice, g, H0> h() {
        return this.f38174c;
    }

    public int hashCode() {
        return (((this.f38172a.hashCode() * 31) + this.f38173b.hashCode()) * 31) + this.f38174c.hashCode();
    }

    @l3.d
    public String toString() {
        return "DevConnectorObserver(onConnected=" + this.f38172a + ", onDisconnect=" + this.f38173b + ", onNotify=" + this.f38174c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l3.d X2.l<? super ModuleDevice, H0> onConnected, @l3.d X2.l<? super ModuleDevice, H0> onDisconnect, @l3.d p<? super ModuleDevice, ? super g, H0> onNotify) {
        F.p(onConnected, "onConnected");
        F.p(onDisconnect, "onDisconnect");
        F.p(onNotify, "onNotify");
        this.f38172a = onConnected;
        this.f38173b = onDisconnect;
        this.f38174c = onNotify;
    }

    public /* synthetic */ e(X2.l lVar, X2.l lVar2, p pVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? a.f38175F : lVar, (i4 & 2) != 0 ? b.f38176F : lVar2, (i4 & 4) != 0 ? c.f38177F : pVar);
    }
}
