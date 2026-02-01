package androidx.lifecycle;

import java.io.Closeable;
import kotlinx.coroutines.Q0;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904f implements Closeable, kotlinx.coroutines.U {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f15609E;

    public C0904f(@l3.d kotlin.coroutines.f context) {
        kotlin.jvm.internal.F.p(context, "context");
        this.f15609E = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Q0.i(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f15609E;
    }
}
