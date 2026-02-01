package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f54668a = AtomicLongFieldUpdater.newUpdater(i.class, "number");

    @l3.d
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f54668a.incrementAndGet(this);
    }
}
