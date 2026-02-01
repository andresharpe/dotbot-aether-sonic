package kotlin.coroutines.intrinsics;

import kotlin.E;
import kotlin.U;
import kotlin.Y;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@U
@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class CoroutineSingletons {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final CoroutineSingletons UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
    public static final CoroutineSingletons RESUMED = new CoroutineSingletons("RESUMED", 2);

    static {
        CoroutineSingletons[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private CoroutineSingletons(String str, int i4) {
    }

    private static final /* synthetic */ CoroutineSingletons[] b() {
        return new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    @d
    public static kotlin.enums.a<CoroutineSingletons> e() {
        return $ENTRIES;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) $VALUES.clone();
    }
}
