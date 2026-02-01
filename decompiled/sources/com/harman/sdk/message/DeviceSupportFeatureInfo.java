package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;

@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b:\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\"\u00105\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\b¨\u0006<"}, d2 = {"Lcom/harman/sdk/message/DeviceSupportFeatureInfo;", "Ljava/io/Serializable;", "", androidx.exifinterface.media.a.U4, "Z", "l", "()Z", "y", "(Z)V", "isSupportUserEq", "F", "k", "x", "isSupportTwsVolume", "G", "d", "q", "isSupportDeviceAnalytics", "H", "f", "s", "isSupportFeedbackTone", "I", "i", "v", "isSupportPartyLightStage", "J", "c", "p", "isSupportCrossTWS", "K", b.f47574c, "o", "isSupportAuracastSQ", "L", "m", "z", "isSupportVolumeBoost", "M", "h", "u", "isSupportLockTopPanel", "N", "j", "w", "isSupportToneShifter", "O", "g", "t", "isSupportLeAudio", "P", "a", "n", "isSupportAIVocalRemoval", "Q", "e", "r", "isSupportEasySingMic", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeviceSupportFeatureInfo implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("supportUserEq")
    private boolean f48178E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("supportTwsVolueme")
    private boolean f48179F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("supportDeviceAnalytics")
    private boolean f48180G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("supportDeviceAnalytics")
    private boolean f48181H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("supportPartyLightStage")
    private boolean f48182I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("supportPartyLightStage")
    private boolean f48183J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("supportAuracastSQ")
    private boolean f48184K;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("supportVolumeBoost")
    private boolean f48185L;

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("supportLockTopPanel")
    private boolean f48186M;

    /* renamed from: N, reason: collision with root package name */
    @SerializedName("supportToneShifter")
    private boolean f48187N;

    /* renamed from: O, reason: collision with root package name */
    @SerializedName("supportLeAudio")
    private boolean f48188O;

    /* renamed from: P, reason: collision with root package name */
    @SerializedName("supportAIVocalRemoval")
    private boolean f48189P;

    /* renamed from: Q, reason: collision with root package name */
    @SerializedName("isSupportEasySingMic")
    private boolean f48190Q;

    public final boolean a() {
        return this.f48189P;
    }

    public final boolean b() {
        return this.f48184K;
    }

    public final boolean c() {
        return this.f48183J;
    }

    public final boolean d() {
        return this.f48180G;
    }

    public final boolean e() {
        return this.f48190Q;
    }

    public final boolean f() {
        return this.f48181H;
    }

    public final boolean g() {
        return this.f48188O;
    }

    public final boolean h() {
        return this.f48186M;
    }

    public final boolean i() {
        return this.f48182I;
    }

    public final boolean j() {
        return this.f48187N;
    }

    public final boolean k() {
        return this.f48179F;
    }

    public final boolean l() {
        return this.f48178E;
    }

    public final boolean m() {
        return this.f48185L;
    }

    public final void n(boolean z3) {
        this.f48189P = z3;
    }

    public final void o(boolean z3) {
        this.f48184K = z3;
    }

    public final void p(boolean z3) {
        this.f48183J = z3;
    }

    public final void q(boolean z3) {
        this.f48180G = z3;
    }

    public final void r(boolean z3) {
        this.f48190Q = z3;
    }

    public final void s(boolean z3) {
        this.f48181H = z3;
    }

    public final void t(boolean z3) {
        this.f48188O = z3;
    }

    public final void u(boolean z3) {
        this.f48186M = z3;
    }

    public final void v(boolean z3) {
        this.f48182I = z3;
    }

    public final void w(boolean z3) {
        this.f48187N = z3;
    }

    public final void x(boolean z3) {
        this.f48179F = z3;
    }

    public final void y(boolean z3) {
        this.f48178E = z3;
    }

    public final void z(boolean z3) {
        this.f48185L = z3;
    }
}
