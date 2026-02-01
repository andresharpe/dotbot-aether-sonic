package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c y(char[] cArr) {
        return new a(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        String w3 = w();
        if (i5 <= 0 && w3.length() + i4 < c.f7598J) {
            sb.append(w3);
        } else {
            sb.append("[\n");
            Iterator<c> it = this.f7597L.iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                c next = it.next();
                if (!z3) {
                    sb.append(",\n");
                } else {
                    z3 = false;
                }
                b(sb, c.f7599K + i4);
                sb.append(next.v(c.f7599K + i4, i5 - 1));
            }
            sb.append("\n");
            b(sb, i4);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        StringBuilder sb = new StringBuilder(f() + "[");
        boolean z3 = true;
        for (int i4 = 0; i4 < this.f7597L.size(); i4++) {
            if (!z3) {
                sb.append(", ");
            } else {
                z3 = false;
            }
            sb.append(this.f7597L.get(i4).w());
        }
        return ((Object) sb) + "]";
    }
}
