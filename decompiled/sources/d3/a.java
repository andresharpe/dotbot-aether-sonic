package d3;

import W2.i;
import kotlin.internal.f;

@i(name = "ProcessKt")
/* loaded from: classes2.dex */
public final class a {
    @f
    private static final Void a(int i4) {
        System.exit(i4);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
