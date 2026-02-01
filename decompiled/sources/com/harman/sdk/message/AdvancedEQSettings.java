package com.harman.sdk.message;

import androidx.core.app.C0;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/harman/sdk/message/AdvancedEQSettings;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Lcom/harman/sdk/message/EQCategory;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/message/EQCategory;", "a", "()Lcom/harman/sdk/message/EQCategory;", "e", "(Lcom/harman/sdk/message/EQCategory;)V", "activeCategoryId", "", "F", "B", "d", "()B", "h", "(B)V", C0.f11537F0, "Lcom/harman/sdk/message/AdvancedPresetEQPayload;", "G", "Lcom/harman/sdk/message/AdvancedPresetEQPayload;", "c", "()Lcom/harman/sdk/message/AdvancedPresetEQPayload;", "g", "(Lcom/harman/sdk/message/AdvancedPresetEQPayload;)V", "presetEQPayload", "Lcom/harman/sdk/message/AdvancedCustomEQPayload;", "H", "Lcom/harman/sdk/message/AdvancedCustomEQPayload;", b.f47574c, "()Lcom/harman/sdk/message/AdvancedCustomEQPayload;", "f", "(Lcom/harman/sdk/message/AdvancedCustomEQPayload;)V", "customEQPayload", "<init>", "()V", "I", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AdvancedEQSettings implements Serializable {

    /* renamed from: I, reason: collision with root package name */
    @d
    public static final a f48144I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    public static final int f48145J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final int f48146K = 1;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("activeCategoryId")
    @d
    private EQCategory f48147E = EQCategory.SIGNATURE;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName(C0.f11537F0)
    private byte f48148F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("presetEQPayload")
    @e
    private AdvancedPresetEQPayload f48149G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("customEQPayload")
    @e
    private AdvancedCustomEQPayload f48150H;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @d
    public final EQCategory a() {
        return this.f48147E;
    }

    @e
    public final AdvancedCustomEQPayload b() {
        return this.f48150H;
    }

    @e
    public final AdvancedPresetEQPayload c() {
        return this.f48149G;
    }

    public final byte d() {
        return this.f48148F;
    }

    public final void e(@d EQCategory eQCategory) {
        F.p(eQCategory, "<set-?>");
        this.f48147E = eQCategory;
    }

    public final void f(@e AdvancedCustomEQPayload advancedCustomEQPayload) {
        this.f48150H = advancedCustomEQPayload;
    }

    public final void g(@e AdvancedPresetEQPayload advancedPresetEQPayload) {
        this.f48149G = advancedPresetEQPayload;
    }

    public final void h(byte b4) {
        this.f48148F = b4;
    }

    @d
    public String toString() {
        EQCategory eQCategory = this.f48147E;
        byte b4 = this.f48148F;
        return "AdvancedEQSettings(activeCategoryId=" + eQCategory + ", status=" + ((int) b4) + ", presetEQPayload=" + this.f48149G + ", customEQPayload=" + this.f48150H + ")";
    }
}
