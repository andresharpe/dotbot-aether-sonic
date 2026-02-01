package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.utils.AuracastForbiddenStatus;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.AuracastSupport;
import com.harman.sdk.utils.SpotifyQuickAccess;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.B1\b\u0016\u0012\u0006\u0010\f\u001a\u00020/\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010$\u001a\u00020/\u0012\u0006\u0010,\u001a\u00020/\u0012\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b-\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/harman/sdk/message/AuracastInfo;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Lcom/harman/sdk/utils/AuracastSupport;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/AuracastSupport;", b.f47574c, "()Lcom/harman/sdk/utils/AuracastSupport;", "g", "(Lcom/harman/sdk/utils/AuracastSupport;)V", "auracastSupport", "Lcom/harman/sdk/utils/AuracastStatus;", "F", "Lcom/harman/sdk/utils/AuracastStatus;", "c", "()Lcom/harman/sdk/utils/AuracastStatus;", "h", "(Lcom/harman/sdk/utils/AuracastStatus;)V", "aurocastStatus", "", "G", "Z", "d", "()Z", "i", "(Z)V", "hasAuracastButton", "Lcom/harman/sdk/utils/SpotifyQuickAccess;", "H", "Lcom/harman/sdk/utils/SpotifyQuickAccess;", "e", "()Lcom/harman/sdk/utils/SpotifyQuickAccess;", "j", "(Lcom/harman/sdk/utils/SpotifyQuickAccess;)V", "spotifyQuickAccess", "Lcom/harman/sdk/utils/AuracastForbiddenStatus;", "I", "Lcom/harman/sdk/utils/AuracastForbiddenStatus;", "a", "()Lcom/harman/sdk/utils/AuracastForbiddenStatus;", "f", "(Lcom/harman/sdk/utils/AuracastForbiddenStatus;)V", "auracastForbiddenStatus", "<init>", "()V", "", "auracastStatus", "(IIIIZ)V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastInfo implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("suracastSupport")
    @e
    private AuracastSupport f48159E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("auracastStatus")
    @e
    private AuracastStatus f48160F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("hasAuracastButton")
    private boolean f48161G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("spotifyQuickAccess")
    @e
    private SpotifyQuickAccess f48162H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("spotifyQuickAccess")
    @e
    private AuracastForbiddenStatus f48163I;

    public AuracastInfo() {
    }

    @e
    public final AuracastForbiddenStatus a() {
        return this.f48163I;
    }

    @e
    public final AuracastSupport b() {
        return this.f48159E;
    }

    @e
    public final AuracastStatus c() {
        return this.f48160F;
    }

    public final boolean d() {
        return this.f48161G;
    }

    @e
    public final SpotifyQuickAccess e() {
        return this.f48162H;
    }

    public final void f(@e AuracastForbiddenStatus auracastForbiddenStatus) {
        this.f48163I = auracastForbiddenStatus;
    }

    public final void g(@e AuracastSupport auracastSupport) {
        this.f48159E = auracastSupport;
    }

    public final void h(@e AuracastStatus auracastStatus) {
        this.f48160F = auracastStatus;
    }

    public final void i(boolean z3) {
        this.f48161G = z3;
    }

    public final void j(@e SpotifyQuickAccess spotifyQuickAccess) {
        this.f48162H = spotifyQuickAccess;
    }

    @d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auracast[");
        sb.append("\tsupport:" + this.f48159E);
        sb.append("\tstatus:" + this.f48160F);
        sb.append("\thasAuracastButton:" + this.f48161G);
        sb.append("\tspotify_acc:" + this.f48162H);
        sb.append("\tauracastForbiddenStatus:" + this.f48163I);
        sb.append("]");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public AuracastInfo(int i4, int i5, int i6, int i7, boolean z3) {
        this();
        this.f48159E = AuracastSupport.Companion.a(i4);
        this.f48160F = AuracastStatus.Companion.a(i5);
        this.f48162H = SpotifyQuickAccess.Companion.a(i6);
        this.f48163I = AuracastForbiddenStatus.Companion.a(i7);
        this.f48161G = z3;
    }
}
