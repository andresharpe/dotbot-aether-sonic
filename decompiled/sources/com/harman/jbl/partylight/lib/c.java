package com.harman.jbl.partylight.lib;

import X2.l;
import androidx.annotation.h0;
import com.harman.jbl.partylight.lib.core.PLGroup;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@h0
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final l<List<PLGroup>, H0> f46237a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.a<H0> f46238b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final X2.a<H0> f46239c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final l<e, H0> f46240d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements l<List<? extends PLGroup>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f46241F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends PLGroup> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<PLGroup> it) {
            F.p(it, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f46242F = new b();

        b() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partylight.lib.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0407c extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final C0407c f46243F = new C0407c();

        C0407c() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<e, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f46244F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(e eVar) {
            c(eVar);
            return H0.f51801a;
        }

        public final void c(@l3.d e eVar) {
            F.p(eVar, "<anonymous parameter 0>");
        }
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c f(c cVar, l lVar, X2.a aVar, X2.a aVar2, l lVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = cVar.f46237a;
        }
        if ((i4 & 2) != 0) {
            aVar = cVar.f46238b;
        }
        if ((i4 & 4) != 0) {
            aVar2 = cVar.f46239c;
        }
        if ((i4 & 8) != 0) {
            lVar2 = cVar.f46240d;
        }
        return cVar.e(lVar, aVar, aVar2, lVar2);
    }

    @l3.d
    public final l<List<PLGroup>, H0> a() {
        return this.f46237a;
    }

    @l3.d
    public final X2.a<H0> b() {
        return this.f46238b;
    }

    @l3.d
    public final X2.a<H0> c() {
        return this.f46239c;
    }

    @l3.d
    public final l<e, H0> d() {
        return this.f46240d;
    }

    @l3.d
    public final c e(@l3.d l<? super List<PLGroup>, H0> onChanged, @l3.d X2.a<H0> onCurrentGroupDisconnected, @l3.d X2.a<H0> onCurrentGroupChanged, @l3.d l<? super e, H0> onDevInfo) {
        F.p(onChanged, "onChanged");
        F.p(onCurrentGroupDisconnected, "onCurrentGroupDisconnected");
        F.p(onCurrentGroupChanged, "onCurrentGroupChanged");
        F.p(onDevInfo, "onDevInfo");
        return new c(onChanged, onCurrentGroupDisconnected, onCurrentGroupChanged, onDevInfo);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return F.g(this.f46237a, cVar.f46237a) && F.g(this.f46238b, cVar.f46238b) && F.g(this.f46239c, cVar.f46239c) && F.g(this.f46240d, cVar.f46240d);
    }

    @l3.d
    public final l<List<PLGroup>, H0> g() {
        return this.f46237a;
    }

    @l3.d
    public final X2.a<H0> h() {
        return this.f46239c;
    }

    public int hashCode() {
        return (((((this.f46237a.hashCode() * 31) + this.f46238b.hashCode()) * 31) + this.f46239c.hashCode()) * 31) + this.f46240d.hashCode();
    }

    @l3.d
    public final X2.a<H0> i() {
        return this.f46238b;
    }

    @l3.d
    public final l<e, H0> j() {
        return this.f46240d;
    }

    @l3.d
    public String toString() {
        return "LightGroupObserver(onChanged=" + this.f46237a + ", onCurrentGroupDisconnected=" + this.f46238b + ", onCurrentGroupChanged=" + this.f46239c + ", onDevInfo=" + this.f46240d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l3.d l<? super List<PLGroup>, H0> onChanged, @l3.d X2.a<H0> onCurrentGroupDisconnected, @l3.d X2.a<H0> onCurrentGroupChanged, @l3.d l<? super e, H0> onDevInfo) {
        F.p(onChanged, "onChanged");
        F.p(onCurrentGroupDisconnected, "onCurrentGroupDisconnected");
        F.p(onCurrentGroupChanged, "onCurrentGroupChanged");
        F.p(onDevInfo, "onDevInfo");
        this.f46237a = onChanged;
        this.f46238b = onCurrentGroupDisconnected;
        this.f46239c = onCurrentGroupChanged;
        this.f46240d = onDevInfo;
    }

    public /* synthetic */ c(l lVar, X2.a aVar, X2.a aVar2, l lVar2, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? a.f46241F : lVar, (i4 & 2) != 0 ? b.f46242F : aVar, (i4 & 4) != 0 ? C0407c.f46243F : aVar2, (i4 & 8) != 0 ? d.f46244F : lVar2);
    }
}
