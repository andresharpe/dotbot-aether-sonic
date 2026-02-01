package kotlin;

import java.io.Serializable;

@E(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/InitializedLazyImpl;", androidx.exifinterface.media.a.f5, "Lkotlin/A;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "()Z", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InitializedLazyImpl<T> implements A<T>, Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final T f51802E;

    public InitializedLazyImpl(T t3) {
        this.f51802E = t3;
    }

    @Override // kotlin.A
    public boolean a() {
        return true;
    }

    @Override // kotlin.A
    public T getValue() {
        return this.f51802E;
    }

    @l3.d
    public String toString() {
        return String.valueOf(getValue());
    }
}
