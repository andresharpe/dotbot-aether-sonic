package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    /* loaded from: classes.dex */
    private static class a implements Iterator<d> {

        /* renamed from: E, reason: collision with root package name */
        f f7607E;

        /* renamed from: F, reason: collision with root package name */
        int f7608F = 0;

        a(f fVar) {
            this.f7607E = fVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = (d) this.f7607E.f7597L.get(this.f7608F);
            this.f7608F++;
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7608F < this.f7607E.size()) {
                return true;
            }
            return false;
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f c0(char[] cArr) {
        return new f(cArr);
    }

    public String d0() {
        return v(0, 0);
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder(f());
        sb.append("{\n");
        Iterator<c> it = this.f7597L.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            c next = it.next();
            if (!z3) {
                sb.append(",\n");
            } else {
                z3 = false;
            }
            sb.append(next.v(c.f7599K + i4, i5 - 1));
        }
        sb.append("\n");
        b(sb, i4);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        StringBuilder sb = new StringBuilder(f() + "{ ");
        Iterator<c> it = this.f7597L.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            c next = it.next();
            if (!z3) {
                sb.append(", ");
            } else {
                z3 = false;
            }
            sb.append(next.w());
        }
        sb.append(" }");
        return sb.toString();
    }
}
