package kotlin;

import java.io.Serializable;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\f\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\t¨\u0006\u001e"}, d2 = {"Lkotlin/Pair;", androidx.exifinterface.media.a.Y4, "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", com.harman.log.b.f47574c, "first", "second", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Ljava/lang/Object;", "e", "F", "f", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final A f51805E;

    /* renamed from: F, reason: collision with root package name */
    private final B f51806F;

    public Pair(A a4, B b4) {
        this.f51805E = a4;
        this.f51806F = b4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair d(Pair pair, Object obj, Object obj2, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = pair.f51805E;
        }
        if ((i4 & 2) != 0) {
            obj2 = pair.f51806F;
        }
        return pair.c(obj, obj2);
    }

    public final A a() {
        return this.f51805E;
    }

    public final B b() {
        return this.f51806F;
    }

    @l3.d
    public final Pair<A, B> c(A a4, B b4) {
        return new Pair<>(a4, b4);
    }

    public final A e() {
        return this.f51805E;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return kotlin.jvm.internal.F.g(this.f51805E, pair.f51805E) && kotlin.jvm.internal.F.g(this.f51806F, pair.f51806F);
    }

    public final B f() {
        return this.f51806F;
    }

    public int hashCode() {
        A a4 = this.f51805E;
        int hashCode = (a4 == null ? 0 : a4.hashCode()) * 31;
        B b4 = this.f51806F;
        return hashCode + (b4 != null ? b4.hashCode() : 0);
    }

    @l3.d
    public String toString() {
        return '(' + this.f51805E + ", " + this.f51806F + ')';
    }
}
