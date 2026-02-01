package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import X2.l;
import X2.p;
import androidx.annotation.h0;
import kotlin.H0;
import kotlin.jvm.internal.F;

@h0
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final p<String, byte[], H0> f38101a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final l<String, H0> f38102b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l3.d p<? super String, ? super byte[], H0> onNotify, @l3.d l<? super String, H0> onDisconnected) {
        F.p(onNotify, "onNotify");
        F.p(onDisconnected, "onDisconnected");
        this.f38101a = onNotify;
        this.f38102b = onDisconnected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b d(b bVar, p pVar, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = bVar.f38101a;
        }
        if ((i4 & 2) != 0) {
            lVar = bVar.f38102b;
        }
        return bVar.c(pVar, lVar);
    }

    @l3.d
    public final p<String, byte[], H0> a() {
        return this.f38101a;
    }

    @l3.d
    public final l<String, H0> b() {
        return this.f38102b;
    }

    @l3.d
    public final b c(@l3.d p<? super String, ? super byte[], H0> onNotify, @l3.d l<? super String, H0> onDisconnected) {
        F.p(onNotify, "onNotify");
        F.p(onDisconnected, "onDisconnected");
        return new b(onNotify, onDisconnected);
    }

    @l3.d
    public final l<String, H0> e() {
        return this.f38102b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return F.g(this.f38101a, bVar.f38101a) && F.g(this.f38102b, bVar.f38102b);
    }

    @l3.d
    public final p<String, byte[], H0> f() {
        return this.f38101a;
    }

    public int hashCode() {
        return (this.f38101a.hashCode() * 31) + this.f38102b.hashCode();
    }

    @l3.d
    public String toString() {
        return "BleConnectorObserver(onNotify=" + this.f38101a + ", onDisconnected=" + this.f38102b + ")";
    }
}
