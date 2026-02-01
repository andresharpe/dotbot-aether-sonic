package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class h extends c {
    public h(char[] cArr) {
        super(cArr);
    }

    public static c x(char[] cArr) {
        return new h(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        sb.append("'");
        sb.append(c());
        sb.append("'");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        return "'" + c() + "'";
    }
}
