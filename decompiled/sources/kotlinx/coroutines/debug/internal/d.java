package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.F;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f53419a = -1640531527;

    /* renamed from: b, reason: collision with root package name */
    private static final int f53420b = 16;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final S f53421c = new S("REHASH");

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final k f53422d = new k(null);

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final k f53423e = new k(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k d(Object obj) {
        if (obj == null) {
            return f53422d;
        }
        if (F.g(obj, Boolean.TRUE)) {
            return f53423e;
        }
        return new k(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
