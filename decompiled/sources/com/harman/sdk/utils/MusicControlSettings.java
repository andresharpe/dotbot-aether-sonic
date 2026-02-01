package com.harman.sdk.utils;

import androidx.core.app.C0;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010\u0004\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u0004\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0004\"\u0004\b,\u0010$¨\u00060"}, d2 = {"Lcom/harman/sdk/utils/MusicControlSettings;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Lcom/harman/sdk/utils/PlayerStatus;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/PlayerStatus;", "f", "()Lcom/harman/sdk/utils/PlayerStatus;", "m", "(Lcom/harman/sdk/utils/PlayerStatus;)V", C0.f11537F0, "", "F", "I", "g", "()I", "n", "(I)V", "volume", "G", "d", "k", "secondaryVolume", "Lcom/harman/sdk/utils/MuteStatus;", "H", "Lcom/harman/sdk/utils/MuteStatus;", "c", "()Lcom/harman/sdk/utils/MuteStatus;", "j", "(Lcom/harman/sdk/utils/MuteStatus;)V", "muteStatus", "Ljava/lang/String;", "e", "l", "(Ljava/lang/String;)V", "song", "J", "a", "h", "artist", "K", com.harman.log.b.f47574c, "i", "coverUrl", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MusicControlSettings implements Serializable {

    /* renamed from: F, reason: collision with root package name */
    private int f48419F;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private PlayerStatus f48418E = PlayerStatus.UNKNOWN;

    /* renamed from: G, reason: collision with root package name */
    private int f48420G = -1;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private MuteStatus f48421H = MuteStatus.UNKNOWN;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private String f48422I = "";

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private String f48423J = "";

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private String f48424K = "";

    @l3.d
    public final String a() {
        return this.f48423J;
    }

    @l3.d
    public final String b() {
        return this.f48424K;
    }

    @l3.d
    public final MuteStatus c() {
        return this.f48421H;
    }

    public final int d() {
        return this.f48420G;
    }

    @l3.d
    public final String e() {
        return this.f48422I;
    }

    @l3.d
    public final PlayerStatus f() {
        return this.f48418E;
    }

    public final int g() {
        return this.f48419F;
    }

    public final void h(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f48423J = str;
    }

    public final void i(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f48424K = str;
    }

    public final void j(@l3.d MuteStatus muteStatus) {
        F.p(muteStatus, "<set-?>");
        this.f48421H = muteStatus;
    }

    public final void k(int i4) {
        this.f48420G = i4;
    }

    public final void l(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f48422I = str;
    }

    public final void m(@l3.d PlayerStatus playerStatus) {
        F.p(playerStatus, "<set-?>");
        this.f48418E = playerStatus;
    }

    public final void n(int i4) {
        this.f48419F = i4;
    }

    @l3.d
    public String toString() {
        return "MusicControlSettings(status=" + this.f48418E + ", volume=" + this.f48419F + ", secondaryVolume=" + this.f48420G + ", muteStatus=" + this.f48421H + ", song='" + this.f48422I + "', artist='" + this.f48423J + "', coverUrl='" + this.f48424K + "')";
    }
}
