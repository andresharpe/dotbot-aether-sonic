package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/harman/sdk/message/KaraokeMicEQInfo;", "Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "I", "c", "f", "(I)V", "karaokeTrebleLevel", "F", b.f47574c, "e", "karaokeEchoLevel", "G", "a", "d", "karaokeBassLevel", "<init>", "()V", "H", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class KaraokeMicEQInfo implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    @d
    public static final a f48268H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public static final int f48269I = 0;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("karaokeTrebleLevel")
    private int f48270E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("karaokeEchoLevel")
    private int f48271F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("karaokeBassLevel")
    private int f48272G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final int a() {
        return this.f48272G;
    }

    public final int b() {
        return this.f48271F;
    }

    public final int c() {
        return this.f48270E;
    }

    public final void d(int i4) {
        this.f48272G = i4;
    }

    public final void e(int i4) {
        this.f48271F = i4;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(KaraokeMicEQInfo.class, obj.getClass())) {
            return false;
        }
        KaraokeMicEQInfo karaokeMicEQInfo = (KaraokeMicEQInfo) obj;
        if (this.f48270E == karaokeMicEQInfo.f48270E && this.f48271F == karaokeMicEQInfo.f48271F && this.f48272G == karaokeMicEQInfo.f48272G) {
            return true;
        }
        return false;
    }

    public final void f(int i4) {
        this.f48270E = i4;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f48270E), Integer.valueOf(this.f48271F), Integer.valueOf(this.f48272G));
    }

    @d
    public String toString() {
        return "KaraokeMicEQInfo{karaokeTrebleLevel=" + this.f48270E + ", karaokeEchoLevel=" + this.f48271F + ", karaokeBassLevel=" + this.f48272G + "}";
    }
}
