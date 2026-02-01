package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.utils.OTAChannel;
import com.harman.sdk.utils.OTAStatus;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/harman/sdk/message/OTAInfo;", "Ljava/io/Serializable;", "Lcom/harman/sdk/utils/OTAChannel;", "a", "()Lcom/harman/sdk/utils/OTAChannel;", "otaChannel", "Lkotlin/H0;", "c", "(Lcom/harman/sdk/utils/OTAChannel;)V", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/OTAChannel;", "Lcom/harman/sdk/utils/OTAStatus;", "F", "Lcom/harman/sdk/utils/OTAStatus;", b.f47574c, "()Lcom/harman/sdk/utils/OTAStatus;", "d", "(Lcom/harman/sdk/utils/OTAStatus;)V", "otaStatus", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OTAInfo implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("otaChannel")
    @d
    private OTAChannel f48273E = OTAChannel.CHANNEL_UNKNOWN;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("otaStatus")
    @d
    private OTAStatus f48274F = OTAStatus.STATUS_UNKNOWN;

    @d
    public final OTAChannel a() {
        return this.f48273E;
    }

    @d
    public final OTAStatus b() {
        return this.f48274F;
    }

    public final void c(@d OTAChannel otaChannel) {
        F.p(otaChannel, "otaChannel");
        this.f48273E = otaChannel;
    }

    public final void d(@d OTAStatus oTAStatus) {
        F.p(oTAStatus, "<set-?>");
        this.f48274F = oTAStatus;
    }

    @d
    public String toString() {
        return "OTAInfo{otaChannel=" + this.f48273E + ", otaStatus=" + this.f48274F + "}";
    }
}
