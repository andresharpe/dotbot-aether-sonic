package com.harman.sdk.message;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.text.s;
import l3.d;
import l3.e;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u0011R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\"\u0010(\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R*\u00101\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/harman/sdk/message/EQPayload;", "Ljava/io/Serializable;", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "I", "d", "k", "(I)V", FirebaseAnalytics.b.f34777X, "", "F", b.f47574c, "()F", "i", "(F)V", "calibration", "G", "g", "n", "sampleRate", "H", "e", "l", "leftGain", "f", "m", "rightGain", "J", "a", "h", "bandCount", "Ljava/util/LinkedList;", "Lcom/harman/sdk/message/EQPayload$EQIDParam;", "K", "Ljava/util/LinkedList;", "c", "()Ljava/util/LinkedList;", "j", "(Ljava/util/LinkedList;)V", "iirParams", "<init>", "()V", "EQIDParam", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EQPayload implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName(FirebaseAnalytics.b.f34777X)
    private int f48191E = -1;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("calibration")
    private float f48192F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("sampleRate")
    private int f48193G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("leftGain")
    private float f48194H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("rightGain")
    private float f48195I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("bandCount")
    private float f48196J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("iirParams")
    @e
    private LinkedList<EQIDParam> f48197K;

    @E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Lcom/harman/sdk/message/EQPayload$EQIDParam;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", androidx.exifinterface.media.a.U4, "I", "a", "e", "(I)V", "bandType", "", "F", "c", "()F", "g", "(F)V", "gainValue", "G", b.f47574c, "f", "frequency", "H", "d", "h", "qValue", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class EQIDParam implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("bandType")
        private int f48198E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("gainValue")
        private float f48199F;

        /* renamed from: G, reason: collision with root package name */
        @SerializedName("frequency")
        private float f48200G;

        /* renamed from: H, reason: collision with root package name */
        @SerializedName("qValue")
        private float f48201H;

        public final int a() {
            return this.f48198E;
        }

        public final float b() {
            return this.f48200G;
        }

        public final float c() {
            return this.f48199F;
        }

        public final float d() {
            return this.f48201H;
        }

        public final void e(int i4) {
            this.f48198E = i4;
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !F.g(EQIDParam.class, obj.getClass())) {
                return false;
            }
            EQIDParam eQIDParam = (EQIDParam) obj;
            if (this.f48198E == eQIDParam.f48198E && Float.compare(eQIDParam.f48199F, this.f48199F) == 0 && Float.compare(eQIDParam.f48200G, this.f48200G) == 0 && Float.compare(eQIDParam.f48201H, this.f48201H) == 0) {
                return true;
            }
            return false;
        }

        public final void f(float f4) {
            this.f48200G = f4;
        }

        public final void g(float f4) {
            this.f48199F = f4;
        }

        public final void h(float f4) {
            this.f48201H = f4;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f48198E), Float.valueOf(this.f48199F), Float.valueOf(this.f48200G), Float.valueOf(this.f48201H));
        }

        @d
        public String toString() {
            String p4;
            p4 = s.p("\n                \n                type=" + this.f48198E + ",gain=" + this.f48199F + ",freq=" + this.f48200G + ",qValue=" + this.f48201H + "\n                ");
            return p4;
        }
    }

    public final float a() {
        return this.f48196J;
    }

    public final float b() {
        return this.f48192F;
    }

    @e
    public final LinkedList<EQIDParam> c() {
        return this.f48197K;
    }

    public final int d() {
        return this.f48191E;
    }

    public final float e() {
        return this.f48194H;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(EQPayload.class, obj.getClass())) {
            return false;
        }
        EQPayload eQPayload = (EQPayload) obj;
        if (Float.compare(eQPayload.f48192F, this.f48192F) == 0 && this.f48193G == eQPayload.f48193G && Float.compare(eQPayload.f48194H, this.f48194H) == 0 && Float.compare(eQPayload.f48195I, this.f48195I) == 0 && F.g(this.f48197K, eQPayload.f48197K)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f48195I;
    }

    public final int g() {
        return this.f48193G;
    }

    public final void h(float f4) {
        this.f48196J = f4;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f48192F), Integer.valueOf(this.f48193G), Float.valueOf(this.f48194H), Float.valueOf(this.f48195I), this.f48197K);
    }

    public final void i(float f4) {
        this.f48192F = f4;
    }

    public final void j(@e LinkedList<EQIDParam> linkedList) {
        this.f48197K = linkedList;
    }

    public final void k(int i4) {
        this.f48191E = i4;
    }

    public final void l(float f4) {
        this.f48194H = f4;
    }

    public final void m(float f4) {
        this.f48195I = f4;
    }

    public final void n(int i4) {
        this.f48193G = i4;
    }

    @d
    public String toString() {
        String str;
        String p4;
        LinkedList<EQIDParam> linkedList = this.f48197K;
        if (linkedList != null) {
            str = String.valueOf(linkedList);
        } else {
            str = "";
        }
        p4 = s.p("\n            \n            index=" + this.f48191E + "\n            calibration=" + this.f48192F + "\n            sampleRate=" + this.f48193G + "\n            leftGain=" + this.f48194H + "\n            rightGain=" + this.f48195I + "\n            bandCount=" + this.f48196J + "\n            " + str + "\n            ");
        return p4;
    }
}
