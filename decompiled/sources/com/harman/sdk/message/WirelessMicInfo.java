package com.harman.sdk.message;

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

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 P2\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\bO\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0014R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010-R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010&\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010-R\"\u00106\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010-R\"\u0010:\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010-R\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010&\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010-R\"\u0010B\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010-R\"\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010-R$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/harman/sdk/message/WirelessMicInfo;", "Ljava/io/Serializable;", "Lkotlin/H0;", "a", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "f", "s", "(Ljava/lang/String;)V", "mic1Version", "F", "k", "x", "mic2Version", "G", b.f47574c, "o", "dongleVersion", "Lcom/harman/sdk/message/BatteryInfo;", "H", "Lcom/harman/sdk/message/BatteryInfo;", "g", "()Lcom/harman/sdk/message/BatteryInfo;", "t", "(Lcom/harman/sdk/message/BatteryInfo;)V", "mic1batteryInfo", "I", "l", "y", "mic2batteryInfo", "J", "m", "z", "(I)V", "micConnectStatus", "K", "e", "r", "mic1GenVersion", "L", "j", "w", "mic2GenVersion", "M", "c", "p", "mic1CanOTA", "N", "h", "u", "mic2CanOTA", "O", "d", "q", "mic1ColorId", "P", "i", "v", "mic2ColorId", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "Q", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "n", "()Lcom/harman/sdk/ota/RemoteOTAConfig;", androidx.exifinterface.media.a.Y4, "(Lcom/harman/sdk/ota/RemoteOTAConfig;)V", "remoteOTAConfig", "<init>", "R", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WirelessMicInfo implements Serializable {

    /* renamed from: R, reason: collision with root package name */
    @d
    public static final a f48322R = new a(null);

    /* renamed from: S, reason: collision with root package name */
    public static final int f48323S = 0;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("mic1Version")
    @e
    private String f48324E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("mic2Version")
    @e
    private String f48325F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("dongleVersion")
    @e
    private String f48326G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("mic1BatteryLevel")
    @e
    private BatteryInfo f48327H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("mic2BatteryLevel")
    @e
    private BatteryInfo f48328I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("micConnectStatus")
    private int f48329J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("mic1GenVersion")
    private int f48330K;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("mic2GenVersion")
    private int f48331L;

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("mic1CanOTA")
    private int f48332M;

    /* renamed from: N, reason: collision with root package name */
    @SerializedName("mic2CanOTA")
    private int f48333N;

    /* renamed from: O, reason: collision with root package name */
    @SerializedName("mic1ColorId")
    private int f48334O;

    /* renamed from: P, reason: collision with root package name */
    @SerializedName("mic2ColorId")
    private int f48335P;

    /* renamed from: Q, reason: collision with root package name */
    @SerializedName("remoteOTAConfig")
    @e
    private RemoteOTAConfig f48336Q;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final void A(@e RemoteOTAConfig remoteOTAConfig) {
        this.f48336Q = remoteOTAConfig;
    }

    public final void a() {
        this.f48324E = null;
        this.f48325F = null;
        this.f48326G = null;
        this.f48327H = null;
        this.f48328I = null;
        this.f48329J = 0;
        this.f48330K = 0;
        this.f48331L = 0;
        this.f48332M = 0;
        this.f48333N = 0;
        this.f48334O = 0;
        this.f48335P = 0;
    }

    @e
    public final String b() {
        return this.f48326G;
    }

    public final int c() {
        return this.f48332M;
    }

    public final int d() {
        return this.f48334O;
    }

    public final int e() {
        return this.f48330K;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(WirelessMicInfo.class, obj.getClass())) {
            return false;
        }
        WirelessMicInfo wirelessMicInfo = (WirelessMicInfo) obj;
        if (F.g(this.f48324E, wirelessMicInfo.f48324E) && F.g(this.f48325F, wirelessMicInfo.f48325F) && F.g(this.f48326G, wirelessMicInfo.f48326G) && F.g(this.f48327H, wirelessMicInfo.f48327H) && F.g(this.f48328I, wirelessMicInfo.f48328I) && this.f48329J == wirelessMicInfo.f48329J && this.f48330K == wirelessMicInfo.f48330K && this.f48331L == wirelessMicInfo.f48331L && this.f48332M == wirelessMicInfo.f48332M && this.f48333N == wirelessMicInfo.f48333N && this.f48334O == wirelessMicInfo.f48334O && this.f48335P == wirelessMicInfo.f48335P) {
            return true;
        }
        return false;
    }

    @e
    public final String f() {
        return this.f48324E;
    }

    @e
    public final BatteryInfo g() {
        return this.f48327H;
    }

    public final int h() {
        return this.f48333N;
    }

    public int hashCode() {
        return Objects.hash(this.f48324E, this.f48325F, this.f48326G, this.f48327H, this.f48328I, Integer.valueOf(this.f48329J), Integer.valueOf(this.f48330K), Integer.valueOf(this.f48331L), Integer.valueOf(this.f48332M), Integer.valueOf(this.f48333N), Integer.valueOf(this.f48334O), Integer.valueOf(this.f48335P));
    }

    public final int i() {
        return this.f48335P;
    }

    public final int j() {
        return this.f48331L;
    }

    @e
    public final String k() {
        return this.f48325F;
    }

    @e
    public final BatteryInfo l() {
        return this.f48328I;
    }

    public final int m() {
        return this.f48329J;
    }

    @e
    public final RemoteOTAConfig n() {
        return this.f48336Q;
    }

    public final void o(@e String str) {
        this.f48326G = str;
    }

    public final void p(int i4) {
        this.f48332M = i4;
    }

    public final void q(int i4) {
        this.f48334O = i4;
    }

    public final void r(int i4) {
        this.f48330K = i4;
    }

    public final void s(@e String str) {
        this.f48324E = str;
    }

    public final void t(@e BatteryInfo batteryInfo) {
        this.f48327H = batteryInfo;
    }

    @d
    public String toString() {
        return "WirelessMicInfo{mic1Version=" + this.f48324E + ", mic2Version=" + this.f48325F + ", dongleVersion=" + this.f48326G + ", mic1batteryInfo=" + this.f48327H + ", mic2batteryInfo=" + this.f48328I + ", micConnectStatus=" + this.f48329J + ", mic1GenVersion=" + this.f48330K + ", mic2GenVersion=" + this.f48331L + ", mic1CanOTA=" + this.f48332M + ", mic2CanOTA=" + this.f48333N + ", mic1ColorId=" + this.f48334O + ", mic2ColorId=" + this.f48335P + ", remoteOTAConfig=" + this.f48336Q + "}";
    }

    public final void u(int i4) {
        this.f48333N = i4;
    }

    public final void v(int i4) {
        this.f48335P = i4;
    }

    public final void w(int i4) {
        this.f48331L = i4;
    }

    public final void x(@e String str) {
        this.f48325F = str;
    }

    public final void y(@e BatteryInfo batteryInfo) {
        this.f48328I = batteryInfo;
    }

    public final void z(int i4) {
        this.f48329J = i4;
    }
}
