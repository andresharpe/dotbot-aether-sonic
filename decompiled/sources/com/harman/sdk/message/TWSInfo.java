package com.harman.sdk.message;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\tB\u001b\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004\"\u0004\b\r\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/harman/sdk/message/TWSInfo;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "a", "c", "(Ljava/lang/String;)V", "groupId", "F", b.f47574c, "d", "groupName", "<init>", "()V", "(Ljava/lang/String;Ljava/lang/String;)V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TWSInfo implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName(FirebaseAnalytics.b.f34807o)
    @e
    private String f48320E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("group_name")
    @e
    private String f48321F;

    public TWSInfo() {
    }

    @e
    public final String a() {
        return this.f48320E;
    }

    @e
    public final String b() {
        return this.f48321F;
    }

    public final void c(@e String str) {
        this.f48320E = str;
    }

    public final void d(@e String str) {
        this.f48321F = str;
    }

    @d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TWS[");
        sb.append("\tgroupId:" + this.f48320E);
        sb.append("\tgroupName:" + this.f48321F);
        sb.append("]");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public TWSInfo(@e String str) {
        this();
        this.f48320E = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TWSInfo(@e String str, @d String groupName) {
        this();
        F.p(groupName, "groupName");
        this.f48320E = str;
        this.f48321F = groupName;
    }
}
