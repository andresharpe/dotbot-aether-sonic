package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.E(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/B;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "I", "g", "()I", "arity", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class Lambda<R> implements B<R>, Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final int f52285E;

    public Lambda(int i4) {
        this.f52285E = i4;
    }

    @Override // kotlin.jvm.internal.B
    public int g() {
        return this.f52285E;
    }

    @l3.d
    public String toString() {
        String x3 = N.x(this);
        F.o(x3, "renderLambdaToString(...)");
        return x3;
    }
}
