package com.harman.jbl.partybox.ui.appmenu;

import android.os.SystemClock;
import androidx.lifecycle.C0909k;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h extends j0 {

    /* renamed from: H, reason: collision with root package name */
    private final int f42105H = 5;

    /* renamed from: I, reason: collision with root package name */
    private final long f42106I = C0909k.f15658a;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private long[] f42107J = new long[5];

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private long[] f42108K = new long[5 - 1];

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private P<Boolean> f42109L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private P<Boolean> f42110M;

    public h() {
        P<Boolean> p4 = new P<>();
        this.f42109L = p4;
        this.f42110M = p4;
    }

    private final boolean u(long[] jArr, long j4, int i4) {
        int i5 = 0;
        for (long j5 : jArr) {
            if (j5 > j4 / i4) {
                break;
            }
            i5++;
        }
        if (i5 != jArr.length) {
            return false;
        }
        return true;
    }

    public final void A() {
        long[] jArr = this.f42107J;
        System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
        long[] jArr2 = this.f42107J;
        jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
        long[] jArr3 = this.f42107J;
        if (jArr3[jArr3.length - 1] != 0 && jArr3[jArr3.length - 2] != 0) {
            long[] jArr4 = this.f42108K;
            System.arraycopy(jArr4, 1, jArr4, 0, jArr4.length - 1);
            long[] jArr5 = this.f42107J;
            long j4 = jArr5[jArr5.length - 1] - jArr5[jArr5.length - 2];
            long[] jArr6 = this.f42108K;
            jArr6[jArr6.length - 1] = j4;
        }
        long j5 = this.f42107J[0];
        long uptimeMillis = SystemClock.uptimeMillis();
        long j6 = this.f42106I;
        if (j5 >= uptimeMillis - j6 && u(this.f42108K, j6, this.f42105H)) {
            int length = this.f42107J.length;
            for (int i4 = 0; i4 < length; i4++) {
                System.out.println((Object) ("------times------>" + this.f42107J[i4]));
            }
            System.out.println((Object) ("------current--times--->" + SystemClock.uptimeMillis()));
            if (!L1.a.f1511O2) {
                L1.a.f1511O2 = true;
                this.f42110M.o(Boolean.TRUE);
            }
        }
    }

    public final void B(@l3.d long[] jArr) {
        F.p(jArr, "<set-?>");
        this.f42107J = jArr;
    }

    public final void C(@l3.d long[] jArr) {
        F.p(jArr, "<set-?>");
        this.f42108K = jArr;
    }

    public final void D(@l3.d P<Boolean> p4) {
        F.p(p4, "<set-?>");
        this.f42110M = p4;
    }

    public final int v() {
        return this.f42105H;
    }

    public final long w() {
        return this.f42106I;
    }

    @l3.d
    public final long[] x() {
        return this.f42107J;
    }

    @l3.d
    public final long[] y() {
        return this.f42108K;
    }

    @l3.d
    public final P<Boolean> z() {
        return this.f42110M;
    }
}
