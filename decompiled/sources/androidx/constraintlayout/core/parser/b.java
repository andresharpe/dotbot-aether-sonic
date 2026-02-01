package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: L, reason: collision with root package name */
    ArrayList<c> f7597L;

    public b(char[] cArr) {
        super(cArr);
        this.f7597L = new ArrayList<>();
    }

    public static c y(char[] cArr) {
        return new b(cArr);
    }

    public c A(String str) throws CLParsingException {
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.c().equals(str)) {
                return dVar.e0();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public a B(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 instanceof a) {
            return (a) z3;
        }
        throw new CLParsingException("no array at index " + i4, this);
    }

    public a C(String str) throws CLParsingException {
        c A3 = A(str);
        if (A3 instanceof a) {
            return (a) A3;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + A3.n() + "] : " + A3, this);
    }

    public a D(String str) {
        c S3 = S(str);
        if (S3 instanceof a) {
            return (a) S3;
        }
        return null;
    }

    public boolean E(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 instanceof i) {
            return ((i) z3).y();
        }
        throw new CLParsingException("no boolean at index " + i4, this);
    }

    public boolean F(String str) throws CLParsingException {
        c A3 = A(str);
        if (A3 instanceof i) {
            return ((i) A3).y();
        }
        throw new CLParsingException("no boolean found for key <" + str + ">, found [" + A3.n() + "] : " + A3, this);
    }

    public float H(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 != null) {
            return z3.j();
        }
        throw new CLParsingException("no float at index " + i4, this);
    }

    public float I(String str) throws CLParsingException {
        c A3 = A(str);
        if (A3 != null) {
            return A3.j();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + A3.n() + "] : " + A3, this);
    }

    public float J(String str) {
        c S3 = S(str);
        if (S3 instanceof e) {
            return S3.j();
        }
        return Float.NaN;
    }

    public int K(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 != null) {
            return z3.k();
        }
        throw new CLParsingException("no int at index " + i4, this);
    }

    public int L(String str) throws CLParsingException {
        c A3 = A(str);
        if (A3 != null) {
            return A3.k();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + A3.n() + "] : " + A3, this);
    }

    public f M(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 instanceof f) {
            return (f) z3;
        }
        throw new CLParsingException("no object at index " + i4, this);
    }

    public f N(String str) throws CLParsingException {
        c A3 = A(str);
        if (A3 instanceof f) {
            return (f) A3;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + A3.n() + "] : " + A3, this);
    }

    public f O(String str) {
        c S3 = S(str);
        if (S3 instanceof f) {
            return (f) S3;
        }
        return null;
    }

    public c Q(int i4) {
        if (i4 >= 0 && i4 < this.f7597L.size()) {
            return this.f7597L.get(i4);
        }
        return null;
    }

    public c S(String str) {
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.c().equals(str)) {
                return dVar.e0();
            }
        }
        return null;
    }

    public String T(int i4) throws CLParsingException {
        c z3 = z(i4);
        if (z3 instanceof h) {
            return z3.c();
        }
        throw new CLParsingException("no string at index " + i4, this);
    }

    public String U(String str) throws CLParsingException {
        String str2;
        c A3 = A(str);
        if (A3 instanceof h) {
            return A3.c();
        }
        if (A3 != null) {
            str2 = A3.n();
        } else {
            str2 = null;
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + str2 + "] : " + A3, this);
    }

    public String V(int i4) {
        c Q3 = Q(i4);
        if (Q3 instanceof h) {
            return Q3.c();
        }
        return null;
    }

    public String W(String str) {
        c S3 = S(str);
        if (S3 instanceof h) {
            return S3.c();
        }
        return null;
    }

    public boolean X(String str) {
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if ((next instanceof d) && ((d) next).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> Y() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next instanceof d) {
                arrayList.add(((d) next).c());
            }
        }
        return arrayList;
    }

    public void Z(String str, c cVar) {
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.c().equals(str)) {
                dVar.f0(cVar);
                return;
            }
        }
        this.f7597L.add((d) d.c0(str, cVar));
    }

    public void a0(String str, float f4) {
        Z(str, new e(f4));
    }

    public void b0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (((d) next).c().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f7597L.remove((c) it2.next());
        }
    }

    public int size() {
        return this.f7597L.size();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<c> it = this.f7597L.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public void x(c cVar) {
        this.f7597L.add(cVar);
        if (g.f7609d) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    public c z(int i4) throws CLParsingException {
        if (i4 >= 0 && i4 < this.f7597L.size()) {
            return this.f7597L.get(i4);
        }
        throw new CLParsingException("no element at index " + i4, this);
    }
}
