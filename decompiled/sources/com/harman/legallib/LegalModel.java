package com.harman.legallib;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0004\"\u0004\b\u001c\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"Lcom/harman/legallib/LegalModel;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", com.harman.log.b.f47574c, "c", "version", "md5", "file", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/harman/legallib/LegalModel;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "h", "k", "(Ljava/lang/String;)V", "F", "g", "j", "G", "f", "i", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "legalLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LegalModel implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("version")
    @l3.e
    private String f47549E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("md5")
    @l3.e
    private String f47550F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("file")
    @l3.e
    private String f47551G;

    public LegalModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LegalModel e(LegalModel legalModel, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = legalModel.f47549E;
        }
        if ((i4 & 2) != 0) {
            str2 = legalModel.f47550F;
        }
        if ((i4 & 4) != 0) {
            str3 = legalModel.f47551G;
        }
        return legalModel.d(str, str2, str3);
    }

    @l3.e
    public final String a() {
        return this.f47549E;
    }

    @l3.e
    public final String b() {
        return this.f47550F;
    }

    @l3.e
    public final String c() {
        return this.f47551G;
    }

    @l3.d
    public final LegalModel d(@l3.e String str, @l3.e String str2, @l3.e String str3) {
        return new LegalModel(str, str2, str3);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalModel)) {
            return false;
        }
        LegalModel legalModel = (LegalModel) obj;
        return F.g(this.f47549E, legalModel.f47549E) && F.g(this.f47550F, legalModel.f47550F) && F.g(this.f47551G, legalModel.f47551G);
    }

    @l3.e
    public final String f() {
        return this.f47551G;
    }

    @l3.e
    public final String g() {
        return this.f47550F;
    }

    @l3.e
    public final String h() {
        return this.f47549E;
    }

    public int hashCode() {
        String str = this.f47549E;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47550F;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47551G;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void i(@l3.e String str) {
        this.f47551G = str;
    }

    public final void j(@l3.e String str) {
        this.f47550F = str;
    }

    public final void k(@l3.e String str) {
        this.f47549E = str;
    }

    @l3.d
    public String toString() {
        return "LegalModel(version=" + this.f47549E + ", md5=" + this.f47550F + ", file=" + this.f47551G + ")";
    }

    public LegalModel(@l3.e String str, @l3.e String str2, @l3.e String str3) {
        this.f47549E = str;
        this.f47550F = str2;
        this.f47551G = str3;
    }

    public /* synthetic */ LegalModel(String str, String str2, String str3, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3);
    }
}
