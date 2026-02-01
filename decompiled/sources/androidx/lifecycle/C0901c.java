package androidx.lifecycle;

import java.time.Duration;

@androidx.annotation.W(26)
/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0901c f15575a = new C0901c();

    private C0901c() {
    }

    public final long a(@l3.d Duration timeout) {
        kotlin.jvm.internal.F.p(timeout, "timeout");
        return timeout.toMillis();
    }
}
