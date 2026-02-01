package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import java.util.Arrays;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f38091a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private byte[] f38092b;

    public f(int i4, @l3.d byte[] receivedData) {
        F.p(receivedData, "receivedData");
        this.f38091a = i4;
        this.f38092b = receivedData;
    }

    public static /* synthetic */ f d(f fVar, int i4, byte[] bArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = fVar.f38091a;
        }
        if ((i5 & 2) != 0) {
            bArr = fVar.f38092b;
        }
        return fVar.c(i4, bArr);
    }

    public final int a() {
        return this.f38091a;
    }

    @l3.d
    public final byte[] b() {
        return this.f38092b;
    }

    @l3.d
    public final f c(int i4, @l3.d byte[] receivedData) {
        F.p(receivedData, "receivedData");
        return new f(i4, receivedData);
    }

    public final int e() {
        return this.f38091a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f38091a == fVar.f38091a && F.g(this.f38092b, fVar.f38092b);
    }

    @l3.d
    public final byte[] f() {
        return this.f38092b;
    }

    public final void g(@l3.d byte[] bArr) {
        F.p(bArr, "<set-?>");
        this.f38092b = bArr;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f38091a) * 31) + Arrays.hashCode(this.f38092b);
    }

    @l3.d
    public String toString() {
        return "ReceivingContentModel(completeLength=" + this.f38091a + ", receivedData=" + Arrays.toString(this.f38092b) + ")";
    }
}
