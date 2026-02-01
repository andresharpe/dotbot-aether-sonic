package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: M, reason: collision with root package name */
    private static ArrayList<String> f7605M;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f7605M = arrayList;
        arrayList.add("ConstraintSets");
        f7605M.add("Variables");
        f7605M.add("Generate");
        f7605M.add(v.h.f7537a);
        f7605M.add("KeyFrames");
        f7605M.add(v.a.f7373a);
        f7605M.add("KeyPositions");
        f7605M.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c c0(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.u(0L);
        dVar.s(str.length() - 1);
        dVar.f0(cVar);
        return dVar;
    }

    public static c y(char[] cArr) {
        return new d(cArr);
    }

    public String d0() {
        return c();
    }

    public c e0() {
        if (this.f7597L.size() > 0) {
            return this.f7597L.get(0);
        }
        return null;
    }

    public void f0(c cVar) {
        if (this.f7597L.size() > 0) {
            this.f7597L.set(0, cVar);
        } else {
            this.f7597L.add(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder(f());
        b(sb, i4);
        String c4 = c();
        if (this.f7597L.size() > 0) {
            sb.append(c4);
            sb.append(": ");
            if (f7605M.contains(c4)) {
                i5 = 3;
            }
            if (i5 > 0) {
                sb.append(this.f7597L.get(0).v(i4, i5 - 1));
            } else {
                String w3 = this.f7597L.get(0).w();
                if (w3.length() + i4 < c.f7598J) {
                    sb.append(w3);
                } else {
                    sb.append(this.f7597L.get(0).v(i4, i5 - 1));
                }
            }
            return sb.toString();
        }
        return c4 + ": <> ";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        if (this.f7597L.size() > 0) {
            return f() + c() + ": " + this.f7597L.get(0).w();
        }
        return f() + c() + ": <> ";
    }
}
