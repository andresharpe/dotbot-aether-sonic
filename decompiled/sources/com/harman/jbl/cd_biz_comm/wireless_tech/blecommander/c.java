package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import kotlin.jvm.internal.F;
import kotlinx.coroutines.InterfaceC2350z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private g<?> f38087a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final InterfaceC2350z<WriteResp<?>> f38088b;

    public c(@l3.d g<?> request, @l3.d InterfaceC2350z<WriteResp<?>> completer) {
        F.p(request, "request");
        F.p(completer, "completer");
        this.f38087a = request;
        this.f38088b = completer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c d(c cVar, g gVar, InterfaceC2350z interfaceC2350z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = cVar.f38087a;
        }
        if ((i4 & 2) != 0) {
            interfaceC2350z = cVar.f38088b;
        }
        return cVar.c(gVar, interfaceC2350z);
    }

    @l3.d
    public final g<?> a() {
        return this.f38087a;
    }

    @l3.d
    public final InterfaceC2350z<WriteResp<?>> b() {
        return this.f38088b;
    }

    @l3.d
    public final c c(@l3.d g<?> request, @l3.d InterfaceC2350z<WriteResp<?>> completer) {
        F.p(request, "request");
        F.p(completer, "completer");
        return new c(request, completer);
    }

    @l3.d
    public final InterfaceC2350z<WriteResp<?>> e() {
        return this.f38088b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return F.g(this.f38087a, cVar.f38087a) && F.g(this.f38088b, cVar.f38088b);
    }

    @l3.d
    public final g<?> f() {
        return this.f38087a;
    }

    public final void g(@l3.d g<?> gVar) {
        F.p(gVar, "<set-?>");
        this.f38087a = gVar;
    }

    public int hashCode() {
        return (this.f38087a.hashCode() * 31) + this.f38088b.hashCode();
    }

    @l3.d
    public String toString() {
        return "BaseRequestWrapper(request=" + this.f38087a + ", completer=" + this.f38088b + ")";
    }
}
