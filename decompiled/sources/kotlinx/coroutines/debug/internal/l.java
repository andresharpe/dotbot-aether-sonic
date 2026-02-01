package kotlinx.coroutines.debug.internal;

/* loaded from: classes2.dex */
public final class l implements kotlin.coroutines.jvm.internal.c {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final kotlin.coroutines.jvm.internal.c f53453E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final StackTraceElement f53454F;

    public l(@l3.e kotlin.coroutines.jvm.internal.c cVar, @l3.d StackTraceElement stackTraceElement) {
        this.f53453E = cVar;
        this.f53454F = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.d
    public StackTraceElement I() {
        return this.f53454F;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        return this.f53453E;
    }
}
