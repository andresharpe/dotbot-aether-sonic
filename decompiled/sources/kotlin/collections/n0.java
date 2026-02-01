package kotlin.collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class n0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 Ready = new n0("Ready", 0);
    public static final n0 NotReady = new n0("NotReady", 1);
    public static final n0 Done = new n0("Done", 2);
    public static final n0 Failed = new n0("Failed", 3);

    static {
        n0[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private n0(String str, int i4) {
    }

    private static final /* synthetic */ n0[] b() {
        return new n0[]{Ready, NotReady, Done, Failed};
    }

    @l3.d
    public static kotlin.enums.a<n0> e() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
