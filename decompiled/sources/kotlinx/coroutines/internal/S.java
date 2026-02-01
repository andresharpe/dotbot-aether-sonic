package kotlinx.coroutines.internal;

/* loaded from: classes2.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public final String f54456a;

    public S(@l3.d String str) {
        this.f54456a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@l3.e Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }

    @l3.d
    public String toString() {
        return kotlin.text.F.f52749e + this.f54456a + kotlin.text.F.f52750f;
    }
}
