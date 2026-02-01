package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.Y(version = "1.8")
@InterfaceC2160s
/* loaded from: classes2.dex */
public final class OnErrorResult {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OnErrorResult[] $VALUES;
    public static final OnErrorResult SKIP_SUBTREE = new OnErrorResult("SKIP_SUBTREE", 0);
    public static final OnErrorResult TERMINATE = new OnErrorResult("TERMINATE", 1);

    static {
        OnErrorResult[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private OnErrorResult(String str, int i4) {
    }

    private static final /* synthetic */ OnErrorResult[] b() {
        return new OnErrorResult[]{SKIP_SUBTREE, TERMINATE};
    }

    @l3.d
    public static kotlin.enums.a<OnErrorResult> e() {
        return $ENTRIES;
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) $VALUES.clone();
    }
}
