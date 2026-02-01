package com.harman.jbl.partylight.lib.core;

import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0002./B1\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0004R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0007R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\rR\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010\u0010¨\u00060"}, d2 = {"Lcom/harman/jbl/partylight/lib/core/PLGroup;", "Ljava/io/Serializable;", "Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;", "a", "()Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;", "", com.harman.log.b.f47574c, "()Ljava/lang/String;", "", "c", "()I", "", "d", "()Z", "Lcom/harman/jbl/partylight/lib/core/PLGroup$Source;", "e", "()Lcom/harman/jbl/partylight/lib/core/PLGroup$Source;", "type", "pid", "devCount", "connected", "source", "f", "(Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;Ljava/lang/String;IZLcom/harman/jbl/partylight/lib/core/PLGroup$Source;)Lcom/harman/jbl/partylight/lib/core/PLGroup;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;", "l", "F", "Ljava/lang/String;", "j", "G", "I", "i", "H", "Z", "h", "Lcom/harman/jbl/partylight/lib/core/PLGroup$Source;", "k", "<init>", "(Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;Ljava/lang/String;IZLcom/harman/jbl/partylight/lib/core/PLGroup$Source;)V", "Source", "Type", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PLGroup implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Type f46247E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f46248F;

    /* renamed from: G, reason: collision with root package name */
    private final int f46249G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f46250H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final Source f46251I;

    @E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/harman/jbl/partylight/lib/core/PLGroup$Source;", "Ljava/io/Serializable;", "", "a", "()I", "", com.harman.log.b.f47574c, "()Ljava/lang/String;", "c", "productIconResId", "title", "groupCountIconResId", "d", "(ILjava/lang/String;I)Lcom/harman/jbl/partylight/lib/core/PLGroup$Source;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "I", "g", "F", "Ljava/lang/String;", "h", "G", "f", "<init>", "(ILjava/lang/String;I)V", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Source implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        private final int f46252E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final String f46253F;

        /* renamed from: G, reason: collision with root package name */
        private final int f46254G;

        public Source(int i4, @l3.d String title, int i5) {
            F.p(title, "title");
            this.f46252E = i4;
            this.f46253F = title;
            this.f46254G = i5;
        }

        public static /* synthetic */ Source e(Source source, int i4, String str, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = source.f46252E;
            }
            if ((i6 & 2) != 0) {
                str = source.f46253F;
            }
            if ((i6 & 4) != 0) {
                i5 = source.f46254G;
            }
            return source.d(i4, str, i5);
        }

        public final int a() {
            return this.f46252E;
        }

        @l3.d
        public final String b() {
            return this.f46253F;
        }

        public final int c() {
            return this.f46254G;
        }

        @l3.d
        public final Source d(int i4, @l3.d String title, int i5) {
            F.p(title, "title");
            return new Source(i4, title, i5);
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return false;
            }
            Source source = (Source) obj;
            return this.f46252E == source.f46252E && F.g(this.f46253F, source.f46253F) && this.f46254G == source.f46254G;
        }

        public final int f() {
            return this.f46254G;
        }

        public final int g() {
            return this.f46252E;
        }

        @l3.d
        public final String h() {
            return this.f46253F;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46252E) * 31) + this.f46253F.hashCode()) * 31) + Integer.hashCode(this.f46254G);
        }

        @l3.d
        public String toString() {
            return "Source(productIconResId=" + this.f46252E + ", title=" + this.f46253F + ", groupCountIconResId=" + this.f46254G + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partylight/lib/core/PLGroup$Type;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "Stick", "Beam", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Type implements Serializable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Stick = new Type("Stick", 0);
        public static final Type Beam = new Type("Beam", 1);

        static {
            Type[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Type(String str, int i4) {
        }

        private static final /* synthetic */ Type[] b() {
            return new Type[]{Stick, Beam};
        }

        @l3.d
        public static kotlin.enums.a<Type> e() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PLGroup(@l3.d Type type, @l3.d String pid, int i4, boolean z3, @l3.d Source source) {
        F.p(type, "type");
        F.p(pid, "pid");
        F.p(source, "source");
        this.f46247E = type;
        this.f46248F = pid;
        this.f46249G = i4;
        this.f46250H = z3;
        this.f46251I = source;
    }

    public static /* synthetic */ PLGroup g(PLGroup pLGroup, Type type, String str, int i4, boolean z3, Source source, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            type = pLGroup.f46247E;
        }
        if ((i5 & 2) != 0) {
            str = pLGroup.f46248F;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i4 = pLGroup.f46249G;
        }
        int i6 = i4;
        if ((i5 & 8) != 0) {
            z3 = pLGroup.f46250H;
        }
        boolean z4 = z3;
        if ((i5 & 16) != 0) {
            source = pLGroup.f46251I;
        }
        return pLGroup.f(type, str2, i6, z4, source);
    }

    @l3.d
    public final Type a() {
        return this.f46247E;
    }

    @l3.d
    public final String b() {
        return this.f46248F;
    }

    public final int c() {
        return this.f46249G;
    }

    public final boolean d() {
        return this.f46250H;
    }

    @l3.d
    public final Source e() {
        return this.f46251I;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PLGroup)) {
            return false;
        }
        PLGroup pLGroup = (PLGroup) obj;
        return this.f46247E == pLGroup.f46247E && F.g(this.f46248F, pLGroup.f46248F) && this.f46249G == pLGroup.f46249G && this.f46250H == pLGroup.f46250H && F.g(this.f46251I, pLGroup.f46251I);
    }

    @l3.d
    public final PLGroup f(@l3.d Type type, @l3.d String pid, int i4, boolean z3, @l3.d Source source) {
        F.p(type, "type");
        F.p(pid, "pid");
        F.p(source, "source");
        return new PLGroup(type, pid, i4, z3, source);
    }

    public final boolean h() {
        return this.f46250H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f46247E.hashCode() * 31) + this.f46248F.hashCode()) * 31) + Integer.hashCode(this.f46249G)) * 31;
        boolean z3 = this.f46250H;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return ((hashCode + i4) * 31) + this.f46251I.hashCode();
    }

    public final int i() {
        return this.f46249G;
    }

    @l3.d
    public final String j() {
        return this.f46248F;
    }

    @l3.d
    public final Source k() {
        return this.f46251I;
    }

    @l3.d
    public final Type l() {
        return this.f46247E;
    }

    @l3.d
    public String toString() {
        return "PLGroup(type=" + this.f46247E + ", pid=" + this.f46248F + ", devCount=" + this.f46249G + ", connected=" + this.f46250H + ", source=" + this.f46251I + ")";
    }
}
