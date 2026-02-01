package com.harman.jbl.cd_biz_comm.wireless_tech.type;

import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.text.z;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0004\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerDevice;", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/ModuleDevice;", "", "r", "()Z", "", "toString", "()Ljava/lang/String;", "K", "Z", "q", "s", "(Z)V", "isA2dp", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerAuracastMode;", "L", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerAuracastMode;", "o", "()Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerAuracastMode;", "t", "(Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerAuracastMode;)V", "auracastMode", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerRole;", "M", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerRole;", "p", "()Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerRole;", "u", "(Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerRole;)V", "role", "<init>", "()V", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SpeakerDevice extends ModuleDevice {

    /* renamed from: K, reason: collision with root package name */
    @c
    private boolean f38222K;

    /* renamed from: L, reason: collision with root package name */
    @c
    @l3.d
    private SpeakerAuracastMode f38223L = SpeakerAuracastMode.OFF;

    /* renamed from: M, reason: collision with root package name */
    @c
    @l3.d
    private SpeakerRole f38224M = SpeakerRole.NORMAL;

    @l3.d
    public final SpeakerAuracastMode o() {
        return this.f38223L;
    }

    @l3.d
    public final SpeakerRole p() {
        return this.f38224M;
    }

    public final boolean q() {
        return this.f38222K;
    }

    public final boolean r() {
        boolean K12;
        K12 = z.K1("2095", d(), true);
        return K12;
    }

    public final void s(boolean z3) {
        this.f38222K = z3;
    }

    public final void t(@l3.d SpeakerAuracastMode speakerAuracastMode) {
        F.p(speakerAuracastMode, "<set-?>");
        this.f38223L = speakerAuracastMode;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice
    @l3.d
    public String toString() {
        return "SpeakerDevice(isA2dp=" + this.f38222K + ", auracastMode=" + this.f38223L + ", role=" + this.f38224M + ") ; " + super.toString();
    }

    public final void u(@l3.d SpeakerRole speakerRole) {
        F.p(speakerRole, "<set-?>");
        this.f38224M = speakerRole;
    }
}
