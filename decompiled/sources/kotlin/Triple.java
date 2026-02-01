package kotlin;

import java.io.Serializable;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00028\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00028\u00012\b\b\u0002\u0010\u000f\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u000e\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u000f\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\n¨\u0006#"}, d2 = {"Lkotlin/Triple;", androidx.exifinterface.media.a.Y4, "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", com.harman.log.b.f47574c, "c", "first", "second", "third", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Ljava/lang/Object;", "f", "F", "g", "G", "h", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final A f51810E;

    /* renamed from: F, reason: collision with root package name */
    private final B f51811F;

    /* renamed from: G, reason: collision with root package name */
    private final C f51812G;

    public Triple(A a4, B b4, C c4) {
        this.f51810E = a4;
        this.f51811F = b4;
        this.f51812G = c4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple e(Triple triple, Object obj, Object obj2, Object obj3, int i4, Object obj4) {
        if ((i4 & 1) != 0) {
            obj = triple.f51810E;
        }
        if ((i4 & 2) != 0) {
            obj2 = triple.f51811F;
        }
        if ((i4 & 4) != 0) {
            obj3 = triple.f51812G;
        }
        return triple.d(obj, obj2, obj3);
    }

    public final A a() {
        return this.f51810E;
    }

    public final B b() {
        return this.f51811F;
    }

    public final C c() {
        return this.f51812G;
    }

    @l3.d
    public final Triple<A, B, C> d(A a4, B b4, C c4) {
        return new Triple<>(a4, b4, c4);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return kotlin.jvm.internal.F.g(this.f51810E, triple.f51810E) && kotlin.jvm.internal.F.g(this.f51811F, triple.f51811F) && kotlin.jvm.internal.F.g(this.f51812G, triple.f51812G);
    }

    public final A f() {
        return this.f51810E;
    }

    public final B g() {
        return this.f51811F;
    }

    public final C h() {
        return this.f51812G;
    }

    public int hashCode() {
        A a4 = this.f51810E;
        int hashCode = (a4 == null ? 0 : a4.hashCode()) * 31;
        B b4 = this.f51811F;
        int hashCode2 = (hashCode + (b4 == null ? 0 : b4.hashCode())) * 31;
        C c4 = this.f51812G;
        return hashCode2 + (c4 != null ? c4.hashCode() : 0);
    }

    @l3.d
    public String toString() {
        return '(' + this.f51810E + ", " + this.f51811F + ", " + this.f51812G + ')';
    }
}
