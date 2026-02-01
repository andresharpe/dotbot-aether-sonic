package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2312t {
    public static final void a(int i4) {
        if (i4 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i4).toString());
    }
}
