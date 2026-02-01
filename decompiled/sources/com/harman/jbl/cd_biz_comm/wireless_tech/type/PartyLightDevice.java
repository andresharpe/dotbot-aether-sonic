package com.harman.jbl.cd_biz_comm.wireless_tech.type;

import com.harman.jbl.cd_biz_comm.utils.h;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u0016R\"\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u0016¨\u0006("}, d2 = {"Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/PartyLightDevice;", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/ModuleDevice;", "", "u", "()Z", "v", "t", "", "toString", "()Ljava/lang/String;", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/a;", "K", "Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/a;", "o", "()Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/a;", "w", "(Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/a;)V", "batteryInfo", "L", "Ljava/lang/String;", "r", "z", "(Ljava/lang/String;)V", "serialNumber", "M", "s", androidx.exifinterface.media.a.Y4, "stageNumber", "N", "q", "y", "linkedSpeakId", "O", "p", "x", "firmwareVer", "<init>", "()V", "P", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyLightDevice extends ModuleDevice {

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    public static final a f38215P = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    public static final int f38216Q = 30;

    /* renamed from: K, reason: collision with root package name */
    @c
    public com.harman.jbl.cd_biz_comm.wireless_tech.type.a f38217K;

    /* renamed from: L, reason: collision with root package name */
    @c
    @l3.d
    private String f38218L = "";

    /* renamed from: M, reason: collision with root package name */
    @c
    @l3.d
    private String f38219M = "";

    /* renamed from: N, reason: collision with root package name */
    @c
    @l3.d
    private String f38220N = "";

    /* renamed from: O, reason: collision with root package name */
    @c
    @l3.d
    private String f38221O = "";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final void A(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f38219M = str;
    }

    @l3.d
    public final com.harman.jbl.cd_biz_comm.wireless_tech.type.a o() {
        com.harman.jbl.cd_biz_comm.wireless_tech.type.a aVar = this.f38217K;
        if (aVar != null) {
            return aVar;
        }
        F.S("batteryInfo");
        return null;
    }

    @l3.d
    public final String p() {
        return this.f38221O;
    }

    @l3.d
    public final String q() {
        return this.f38220N;
    }

    @l3.d
    public final String r() {
        return this.f38218L;
    }

    @l3.d
    public final String s() {
        return this.f38219M;
    }

    public final boolean t() {
        return h.c(d());
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice
    @l3.d
    public String toString() {
        return "PartyLightDevice(batteryInfo=" + o() + ", serialNumber='" + this.f38218L + "', stageNumber='" + this.f38219M + "', linkedSpeakId='" + this.f38220N + "', firmwareVer='" + this.f38221O + "') ; " + super.toString();
    }

    public final boolean u() {
        if (o().g() || o().h() || o().f() >= 30) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        return h.e(d());
    }

    public final void w(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.type.a aVar) {
        F.p(aVar, "<set-?>");
        this.f38217K = aVar;
    }

    public final void x(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f38221O = str;
    }

    public final void y(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f38220N = str;
    }

    public final void z(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f38218L = str;
    }
}
