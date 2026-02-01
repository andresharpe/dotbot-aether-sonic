package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/harman/sdk/message/AdvancedPresetEQPayload;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "[B", "c", "()[B", "f", "([B)V", "rawBytes", "Lcom/harman/sdk/message/EQCategory;", "F", "Lcom/harman/sdk/message/EQCategory;", "a", "()Lcom/harman/sdk/message/EQCategory;", "d", "(Lcom/harman/sdk/message/EQCategory;)V", "categoryId", "Ljava/util/ArrayList;", "Lcom/harman/sdk/message/AdvancedPresetEQPayload$Parameter;", "G", "Ljava/util/ArrayList;", b.f47574c, "()Ljava/util/ArrayList;", "e", "(Ljava/util/ArrayList;)V", "params", "<init>", "()V", "Parameter", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class AdvancedPresetEQPayload implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @e
    private byte[] f48151E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("categoryId")
    @d
    private EQCategory f48152F = EQCategory.SIGNATURE;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("params")
    @d
    private ArrayList<Parameter> f48153G = new ArrayList<>();

    @E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010(\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 ¨\u0006+"}, d2 = {"Lcom/harman/sdk/message/AdvancedPresetEQPayload$Parameter;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/harman/sdk/message/EQBandType;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/message/EQBandType;", "e", "()Lcom/harman/sdk/message/EQBandType;", "j", "(Lcom/harman/sdk/message/EQBandType;)V", "type", "F", "I", "d", "i", "(I)V", "sampleRate", "", "G", b.f47574c, "()F", "g", "(F)V", "gain", "H", "a", "f", "frequency", "c", "h", "qValue", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Parameter implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("type")
        @d
        private EQBandType f48154E = EQBandType.LOW_SHELF_FILTER;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("sampleRate")
        private int f48155F;

        /* renamed from: G, reason: collision with root package name */
        @SerializedName("gain")
        private float f48156G;

        /* renamed from: H, reason: collision with root package name */
        @SerializedName("frequency")
        private float f48157H;

        /* renamed from: I, reason: collision with root package name */
        @SerializedName("qValue")
        private float f48158I;

        public final float a() {
            return this.f48157H;
        }

        public final float b() {
            return this.f48156G;
        }

        public final float c() {
            return this.f48158I;
        }

        public final int d() {
            return this.f48155F;
        }

        @d
        public final EQBandType e() {
            return this.f48154E;
        }

        public boolean equals(@e Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!F.g(Parameter.class, cls)) {
                return false;
            }
            F.n(obj, "null cannot be cast to non-null type com.harman.sdk.message.AdvancedPresetEQPayload.Parameter");
            Parameter parameter = (Parameter) obj;
            if (this.f48154E == parameter.f48154E && this.f48155F == parameter.f48155F && this.f48156G == parameter.f48156G && this.f48157H == parameter.f48157H && this.f48158I == parameter.f48158I) {
                return true;
            }
            return false;
        }

        public final void f(float f4) {
            this.f48157H = f4;
        }

        public final void g(float f4) {
            this.f48156G = f4;
        }

        public final void h(float f4) {
            this.f48158I = f4;
        }

        public int hashCode() {
            return (((((((this.f48154E.hashCode() * 31) + Integer.hashCode(this.f48155F)) * 31) + Float.hashCode(this.f48156G)) * 31) + Float.hashCode(this.f48157H)) * 31) + Float.hashCode(this.f48158I);
        }

        public final void i(int i4) {
            this.f48155F = i4;
        }

        public final void j(@d EQBandType eQBandType) {
            F.p(eQBandType, "<set-?>");
            this.f48154E = eQBandType;
        }

        @d
        public String toString() {
            return "Parameter(type=" + this.f48154E + ", sampleRate=" + this.f48155F + ", gain=" + this.f48156G + ", frequency=" + this.f48157H + ", qValue=" + this.f48158I + ")";
        }
    }

    @d
    public final EQCategory a() {
        return this.f48152F;
    }

    @d
    public final ArrayList<Parameter> b() {
        return this.f48153G;
    }

    @e
    public byte[] c() {
        return this.f48151E;
    }

    public final void d(@d EQCategory eQCategory) {
        F.p(eQCategory, "<set-?>");
        this.f48152F = eQCategory;
    }

    public final void e(@d ArrayList<Parameter> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f48153G = arrayList;
    }

    public void f(@e byte[] bArr) {
        this.f48151E = bArr;
    }

    @d
    public String toString() {
        return "AdvancedPresetEQPayload(params=" + this.f48153G + ")";
    }
}
