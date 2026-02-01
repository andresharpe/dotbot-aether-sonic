package com.harman.jbl.partylight.lib.core;

import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/harman/jbl/partylight/lib/core/PBDevice;", "Ljava/io/Serializable;", "", "a", "()Ljava/lang/String;", com.harman.log.b.f47574c, "pid", "productName", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/harman/jbl/partylight/lib/core/PBDevice;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "e", "F", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PBDevice implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final String f46245E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f46246F;

    public PBDevice(@l3.d String pid, @l3.d String productName) {
        F.p(pid, "pid");
        F.p(productName, "productName");
        this.f46245E = pid;
        this.f46246F = productName;
    }

    public static /* synthetic */ PBDevice d(PBDevice pBDevice, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = pBDevice.f46245E;
        }
        if ((i4 & 2) != 0) {
            str2 = pBDevice.f46246F;
        }
        return pBDevice.c(str, str2);
    }

    @l3.d
    public final String a() {
        return this.f46245E;
    }

    @l3.d
    public final String b() {
        return this.f46246F;
    }

    @l3.d
    public final PBDevice c(@l3.d String pid, @l3.d String productName) {
        F.p(pid, "pid");
        F.p(productName, "productName");
        return new PBDevice(pid, productName);
    }

    @l3.d
    public final String e() {
        return this.f46245E;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBDevice)) {
            return false;
        }
        PBDevice pBDevice = (PBDevice) obj;
        return F.g(this.f46245E, pBDevice.f46245E) && F.g(this.f46246F, pBDevice.f46246F);
    }

    @l3.d
    public final String f() {
        return this.f46246F;
    }

    public int hashCode() {
        return (this.f46245E.hashCode() * 31) + this.f46246F.hashCode();
    }

    @l3.d
    public String toString() {
        return "PBDevice(pid=" + this.f46245E + ", productName=" + this.f46246F + ")";
    }
}
