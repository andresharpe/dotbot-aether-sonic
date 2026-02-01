package kotlin.text;

import kotlin.jvm.internal.C2197u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.E(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/g;", "", "value", "I", "getValue", "()I", "mask", com.harman.log.b.f47574c, "<init>", "(Ljava/lang/String;III)V", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RegexOption implements InterfaceC2225g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        int i4 = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i4, 0, 2, null);
        int i5 = 0;
        int i6 = 2;
        C2197u c2197u = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i5, i6, c2197u);
        int i7 = 0;
        int i8 = 2;
        C2197u c2197u2 = null;
        LITERAL = new RegexOption("LITERAL", i4, 16, i7, i8, c2197u2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i5, i6, c2197u);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i7, i8, c2197u2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i5, i6, c2197u);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i7, i8, c2197u2);
        RegexOption[] e4 = e();
        $VALUES = e4;
        $ENTRIES = kotlin.enums.c.c(e4);
    }

    private RegexOption(String str, int i4, int i5, int i6) {
        this.value = i5;
        this.mask = i6;
    }

    private static final /* synthetic */ RegexOption[] e() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    @l3.d
    public static kotlin.enums.a<RegexOption> f() {
        return $ENTRIES;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    @Override // kotlin.text.InterfaceC2225g
    public int b() {
        return this.mask;
    }

    @Override // kotlin.text.InterfaceC2225g
    public int getValue() {
        return this.value;
    }

    /* synthetic */ RegexOption(String str, int i4, int i5, int i6, int i7, C2197u c2197u) {
        this(str, i4, i5, (i7 & 2) != 0 ? i5 : i6);
    }
}
