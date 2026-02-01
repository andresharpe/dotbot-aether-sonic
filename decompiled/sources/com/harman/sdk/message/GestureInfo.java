package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import l3.d;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/harman/sdk/message/GestureInfo;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "I", b.f47574c, "()I", "d", "(I)V", "gestureId", "F", "a", "c", "actionId", "<init>", "()V", "(II)V", "G", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestureInfo implements Serializable {

    /* renamed from: G, reason: collision with root package name */
    @d
    public static final a f48221G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    public static final int f48222H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f48223I = 2;

    /* renamed from: J, reason: collision with root package name */
    public static final int f48224J = 3;

    /* renamed from: K, reason: collision with root package name */
    public static final int f48225K = 4;

    /* renamed from: L, reason: collision with root package name */
    public static final int f48226L = 5;

    /* renamed from: M, reason: collision with root package name */
    public static final int f48227M = 6;

    /* renamed from: N, reason: collision with root package name */
    public static final int f48228N = 7;

    /* renamed from: O, reason: collision with root package name */
    public static final int f48229O = 8;

    /* renamed from: P, reason: collision with root package name */
    public static final int f48230P = 17;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f48231Q = 18;

    /* renamed from: R, reason: collision with root package name */
    public static final int f48232R = 19;

    /* renamed from: S, reason: collision with root package name */
    public static final int f48233S = 20;

    /* renamed from: T, reason: collision with root package name */
    public static final int f48234T = 21;

    /* renamed from: U, reason: collision with root package name */
    public static final int f48235U = 22;

    /* renamed from: V, reason: collision with root package name */
    public static final int f48236V = 23;

    /* renamed from: W, reason: collision with root package name */
    public static final int f48237W = 24;

    /* renamed from: X, reason: collision with root package name */
    public static final int f48238X = 49;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f48239Y = 50;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f48240Z = 51;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f48241a0 = 52;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f48242b0 = 53;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f48243c0 = 54;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f48244d0 = 253;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f48245e0 = 254;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f48246f0 = 255;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f48247g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f48248h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f48249i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f48250j0 = 3;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f48251k0 = 4;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f48252l0 = 5;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f48253m0 = 6;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f48254n0 = 7;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f48255o0 = 8;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f48256p0 = 9;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f48257q0 = 160;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f48258r0 = 161;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f48259s0 = 162;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f48260t0 = 163;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f48261u0 = 164;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f48262v0 = 165;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f48263w0 = 166;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f48264x0 = 167;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f48265y0 = 168;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("gestureId")
    private int f48266E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("actionId")
    private int f48267F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public GestureInfo() {
    }

    public final int a() {
        return this.f48267F;
    }

    public final int b() {
        return this.f48266E;
    }

    public final void c(int i4) {
        this.f48267F = i4;
    }

    public final void d(int i4) {
        this.f48266E = i4;
    }

    @d
    public String toString() {
        return "GestureInfo{gestureId=" + this.f48266E + ", actionId=" + this.f48267F + "}";
    }

    public GestureInfo(int i4, int i5) {
        this.f48266E = i4;
        this.f48267F = i5;
    }
}
