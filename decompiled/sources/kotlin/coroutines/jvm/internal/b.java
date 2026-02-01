package kotlin.coroutines.jvm.internal;

/* loaded from: classes2.dex */
public final class b implements kotlin.coroutines.c<Object> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final b f52073E = new b();

    private b() {
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @l3.d
    public String toString() {
        return "This continuation is already complete";
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
