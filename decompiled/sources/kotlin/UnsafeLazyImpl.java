package kotlin;

import java.io.Serializable;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0019"}, d2 = {"Lkotlin/UnsafeLazyImpl;", androidx.exifinterface.media.a.f5, "Lkotlin/A;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", com.harman.log.b.f47574c, "()Ljava/lang/Object;", "", "a", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function0;", androidx.exifinterface.media.a.U4, "LX2/a;", "initializer", "F", "Ljava/lang/Object;", "_value", "getValue", "value", "<init>", "(LX2/a;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UnsafeLazyImpl<T> implements A<T>, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private X2.a<? extends T> f51813E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private Object f51814F;

    public UnsafeLazyImpl(@l3.d X2.a<? extends T> initializer) {
        kotlin.jvm.internal.F.p(initializer, "initializer");
        this.f51813E = initializer;
        this.f51814F = B0.f51790a;
    }

    private final Object b() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.A
    public boolean a() {
        if (this.f51814F != B0.f51790a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.A
    public T getValue() {
        if (this.f51814F == B0.f51790a) {
            X2.a<? extends T> aVar = this.f51813E;
            kotlin.jvm.internal.F.m(aVar);
            this.f51814F = aVar.n();
            this.f51813E = null;
        }
        return (T) this.f51814F;
    }

    @l3.d
    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
