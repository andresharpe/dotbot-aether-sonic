package kotlin.io;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnErrorAction {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OnErrorAction[] $VALUES;
    public static final OnErrorAction SKIP = new OnErrorAction("SKIP", 0);
    public static final OnErrorAction TERMINATE = new OnErrorAction("TERMINATE", 1);

    static {
        OnErrorAction[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private OnErrorAction(String str, int i4) {
    }

    private static final /* synthetic */ OnErrorAction[] b() {
        return new OnErrorAction[]{SKIP, TERMINATE};
    }

    @l3.d
    public static kotlin.enums.a<OnErrorAction> e() {
        return $ENTRIES;
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) $VALUES.clone();
    }
}
