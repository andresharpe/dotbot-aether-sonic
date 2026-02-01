package kotlin.contracts;

import R2.f;
import kotlin.E;
import kotlin.Y;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.internal.b;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@f
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class InvocationKind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InvocationKind[] $VALUES;

    @b
    public static final InvocationKind AT_MOST_ONCE = new InvocationKind("AT_MOST_ONCE", 0);

    @b
    public static final InvocationKind AT_LEAST_ONCE = new InvocationKind("AT_LEAST_ONCE", 1);

    @b
    public static final InvocationKind EXACTLY_ONCE = new InvocationKind("EXACTLY_ONCE", 2);

    @b
    public static final InvocationKind UNKNOWN = new InvocationKind("UNKNOWN", 3);

    static {
        InvocationKind[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private InvocationKind(String str, int i4) {
    }

    private static final /* synthetic */ InvocationKind[] b() {
        return new InvocationKind[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    @d
    public static a<InvocationKind> e() {
        return $ENTRIES;
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) $VALUES.clone();
    }
}
