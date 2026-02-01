package com.harman.sdk.message;

import android.util.Log;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.ota.RemoteOTAConfig;
import java.io.Serializable;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 W2\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\bV\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u001bR\"\u0010)\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010%\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010(R$\u0010-\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u001bR\"\u00101\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R$\u0010A\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R\"\u0010E\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010%\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010(R\"\u0010I\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010%\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010(R\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010(R$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/harman/sdk/message/EasySingMicInfo;", "Ljava/io/Serializable;", "Lkotlin/H0;", "a", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Z", b.f47574c, "()Z", "p", "(Z)V", "dongleConnectStatus", "F", "Ljava/lang/String;", "e", "s", "(Ljava/lang/String;)V", "easySingPid", "G", "f", "t", "easySingVid", "H", "d", "r", "easySingMid", "I", "c", "q", "(I)V", "easySingIndex", "J", "o", "C", "softwareVersion", "K", "i", "w", "mic1Enable", "Lcom/harman/sdk/message/a;", "L", "Lcom/harman/sdk/message/a;", "j", "()Lcom/harman/sdk/message/a;", "x", "(Lcom/harman/sdk/message/a;)V", "mic1Info", "M", "k", "y", "mic2Enable", "N", "l", "z", "mic2Info", "O", "m", androidx.exifinterface.media.a.Y4, "micPresetEQIndex", "P", "h", "v", "mainMicVolume", "Q", "g", "u", "mainMicEnable", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "R", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "n", "()Lcom/harman/sdk/ota/RemoteOTAConfig;", "B", "(Lcom/harman/sdk/ota/RemoteOTAConfig;)V", "remoteOTAConfig", "<init>", androidx.exifinterface.media.a.T4, "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EasySingMicInfo implements Serializable {

    /* renamed from: S, reason: collision with root package name */
    @d
    public static final a f48202S = new a(null);

    /* renamed from: T, reason: collision with root package name */
    public static final int f48203T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static final int f48204U = 1;

    /* renamed from: V, reason: collision with root package name */
    public static final int f48205V = 2;

    /* renamed from: W, reason: collision with root package name */
    @d
    public static final String f48206W = "EasySingMicInfo";

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("aiDongleConnectStatus")
    private boolean f48207E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("easySingPid")
    @e
    private String f48208F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("easySingVid")
    @e
    private String f48209G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("easySingMid")
    @e
    private String f48210H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("easySingIndex")
    private int f48211I = 1;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("softwareVersion")
    @e
    private String f48212J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("mic1Enable")
    private boolean f48213K;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("mic1Info")
    @e
    private com.harman.sdk.message.a f48214L;

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("mic2Enable")
    private boolean f48215M;

    /* renamed from: N, reason: collision with root package name */
    @SerializedName("mic2Info")
    @e
    private com.harman.sdk.message.a f48216N;

    /* renamed from: O, reason: collision with root package name */
    @SerializedName("micPresetEQIndex")
    private int f48217O;

    /* renamed from: P, reason: collision with root package name */
    @SerializedName("mainMicVolume")
    private int f48218P;

    /* renamed from: Q, reason: collision with root package name */
    @SerializedName("mainMicEnable")
    private int f48219Q;

    /* renamed from: R, reason: collision with root package name */
    @SerializedName("remoteOTAConfig")
    @e
    private RemoteOTAConfig f48220R;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final com.harman.sdk.message.a a(@d byte[] micPayload) {
            int i4;
            F.p(micPayload, "micPayload");
            BatteryInfo batteryInfo = new BatteryInfo();
            int i5 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 1;
            byte b7 = 1;
            while (i5 < micPayload.length) {
                byte b8 = micPayload[i5];
                if (b8 == 1) {
                    int i6 = i5 + 2;
                    if (i6 < micPayload.length && micPayload[i5 + 1] == 1) {
                        b6 = micPayload[i6];
                        Log.d(EasySingMicInfo.f48206W, "onReceive micInfo micIndex: " + ((int) b6));
                        i5 += 3;
                    }
                    i5++;
                } else if (b8 == 2) {
                    int i7 = i5 + 2;
                    if (i7 < micPayload.length && micPayload[i5 + 1] == 1) {
                        BatteryInfo a4 = BatteryInfo.f48167I.a(micPayload[i7]);
                        batteryInfo.e(a4.a());
                        batteryInfo.h(a4.c());
                        batteryInfo.g(a4.d());
                        Log.d(EasySingMicInfo.f48206W, "onReceive micInfo batteryInfo: " + batteryInfo);
                        i5 += 3;
                    }
                    i5++;
                } else if (b8 == 3) {
                    int i8 = i5 + 2;
                    if (i8 < micPayload.length && micPayload[i5 + 1] == 1) {
                        b4 = micPayload[i8];
                        Log.d(EasySingMicInfo.f48206W, "onReceive micInfo micGenVersion: " + ((int) b4));
                        i5 += 3;
                    }
                    i5++;
                } else if (b8 == 4) {
                    int i9 = i5 + 2;
                    if (i9 < micPayload.length && micPayload[i5 + 1] == 1) {
                        b7 = micPayload[i9];
                        Log.d(EasySingMicInfo.f48206W, "onReceive micInfo micColorId: " + ((int) b7));
                        i5 += 3;
                    }
                    i5++;
                } else {
                    if (b8 == 5 && (i4 = i5 + 2) < micPayload.length && micPayload[i5 + 1] == 1) {
                        b5 = micPayload[i4];
                        Log.d(EasySingMicInfo.f48206W, "onReceive micInfo micVolumeValue: " + ((int) b5));
                        i5 += 3;
                    }
                    i5++;
                }
            }
            return new com.harman.sdk.message.a(b6, batteryInfo, b4, b7, b5);
        }

        private a() {
        }
    }

    public final void A(int i4) {
        this.f48217O = i4;
    }

    public final void B(@e RemoteOTAConfig remoteOTAConfig) {
        this.f48220R = remoteOTAConfig;
    }

    public final void C(@e String str) {
        this.f48212J = str;
    }

    public final void a() {
        this.f48207E = false;
        this.f48208F = null;
        this.f48209G = null;
        this.f48210H = null;
        this.f48213K = false;
        this.f48215M = false;
        this.f48212J = null;
        this.f48214L = null;
        this.f48216N = null;
        this.f48217O = 0;
    }

    public final boolean b() {
        return this.f48207E;
    }

    public final int c() {
        return this.f48211I;
    }

    @e
    public final String d() {
        return this.f48210H;
    }

    @e
    public final String e() {
        return this.f48208F;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(EasySingMicInfo.class, obj.getClass())) {
            return false;
        }
        EasySingMicInfo easySingMicInfo = (EasySingMicInfo) obj;
        if (this.f48207E == easySingMicInfo.f48207E && F.g(this.f48208F, easySingMicInfo.f48208F) && F.g(this.f48209G, easySingMicInfo.f48209G) && F.g(this.f48210H, easySingMicInfo.f48210H) && F.g(this.f48212J, easySingMicInfo.f48212J) && F.g(this.f48214L, easySingMicInfo.f48214L) && F.g(this.f48216N, easySingMicInfo.f48216N) && this.f48217O == easySingMicInfo.f48217O) {
            return true;
        }
        return false;
    }

    @e
    public final String f() {
        return this.f48209G;
    }

    public final int g() {
        return this.f48219Q;
    }

    public final int h() {
        return this.f48218P;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f48207E), this.f48208F, this.f48209G, this.f48210H, this.f48212J, this.f48214L, this.f48216N, Integer.valueOf(this.f48217O));
    }

    public final boolean i() {
        return this.f48213K;
    }

    @e
    public final com.harman.sdk.message.a j() {
        return this.f48214L;
    }

    public final boolean k() {
        return this.f48215M;
    }

    @e
    public final com.harman.sdk.message.a l() {
        return this.f48216N;
    }

    public final int m() {
        return this.f48217O;
    }

    @e
    public final RemoteOTAConfig n() {
        return this.f48220R;
    }

    @e
    public final String o() {
        return this.f48212J;
    }

    public final void p(boolean z3) {
        this.f48207E = z3;
    }

    public final void q(int i4) {
        this.f48211I = i4;
    }

    public final void r(@e String str) {
        this.f48210H = str;
    }

    public final void s(@e String str) {
        this.f48208F = str;
    }

    public final void t(@e String str) {
        this.f48209G = str;
    }

    @d
    public String toString() {
        return "WirelessMicInfo{dongleConnectStatus=" + this.f48207E + ", easySingPid=" + this.f48208F + ", micVid=" + this.f48209G + ", micMid=" + this.f48210H + ", softwareVersion=" + this.f48212J + ", mic1Info=" + this.f48214L + ", mic2Info=" + this.f48216N + ", micPresetEQIndex=" + this.f48217O + ", remoteOTAConfig=" + this.f48220R + "}";
    }

    public final void u(int i4) {
        this.f48219Q = i4;
    }

    public final void v(int i4) {
        this.f48218P = i4;
    }

    public final void w(boolean z3) {
        this.f48213K = z3;
    }

    public final void x(@e com.harman.sdk.message.a aVar) {
        this.f48214L = aVar;
    }

    public final void y(boolean z3) {
        this.f48215M = z3;
    }

    public final void z(@e com.harman.sdk.message.a aVar) {
        this.f48216N = aVar;
    }
}
