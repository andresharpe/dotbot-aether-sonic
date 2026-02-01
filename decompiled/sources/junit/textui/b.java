package junit.textui;

import java.io.PrintStream;
import junit.framework.f;
import junit.framework.g;
import junit.framework.j;
import junit.framework.k;
import junit.runner.c;

/* loaded from: classes2.dex */
public class b extends junit.runner.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f51533g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f51534h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f51535i = 2;

    /* renamed from: f, reason: collision with root package name */
    private a f51536f;

    public b() {
        this(System.out);
    }

    public static void G(String[] strArr) {
        try {
            if (!new b().N(strArr).q()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e4) {
            System.err.println(e4.getMessage());
            System.exit(2);
        }
    }

    public static j I(f fVar) {
        return new b().E(fVar);
    }

    public static void J(Class<? extends g> cls) {
        I(new k(cls));
    }

    public static void K(f fVar) {
        new b().F(fVar, true);
    }

    @Override // junit.runner.a
    public void A(String str) {
    }

    protected j D() {
        return new j();
    }

    public j E(f fVar) {
        return F(fVar, false);
    }

    public j F(f fVar, boolean z3) {
        j D3 = D();
        D3.c(this.f51536f);
        long currentTimeMillis = System.currentTimeMillis();
        fVar.d(D3);
        this.f51536f.g(D3, System.currentTimeMillis() - currentTimeMillis);
        H(z3);
        return D3;
    }

    protected void H(boolean z3) {
        if (!z3) {
            return;
        }
        this.f51536f.p();
        try {
            System.in.read();
        } catch (Exception unused) {
        }
    }

    protected j L(String str, String str2, boolean z3) throws Exception {
        return F(k.g(p(str).asSubclass(g.class), str2), z3);
    }

    public void M(a aVar) {
        this.f51536f = aVar;
    }

    public j N(String[] strArr) throws Exception {
        String str = "";
        String str2 = str;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < strArr.length) {
            if (strArr[i4].equals("-wait")) {
                z3 = true;
            } else if (strArr[i4].equals("-c")) {
                i4++;
                str = g(strArr[i4]);
            } else if (strArr[i4].equals("-m")) {
                i4++;
                String str3 = strArr[i4];
                int lastIndexOf = str3.lastIndexOf(46);
                String substring = str3.substring(0, lastIndexOf);
                str2 = str3.substring(lastIndexOf + 1);
                str = substring;
            } else if (strArr[i4].equals("-v")) {
                System.err.println("JUnit " + c.a() + " by Kent Beck and Erich Gamma");
            } else {
                str = strArr[i4];
            }
            i4++;
        }
        if (!str.equals("")) {
            try {
                if (!str2.equals("")) {
                    return L(str, str2, z3);
                }
                return F(o(str), z3);
            } catch (Exception e4) {
                throw new Exception("Could not create and run test suite: " + e4);
            }
        }
        throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
    }

    @Override // junit.runner.a
    protected void s(String str) {
        System.err.println(str);
        System.exit(1);
    }

    @Override // junit.runner.a
    public void y(String str) {
    }

    @Override // junit.runner.a
    public void z(int i4, f fVar, Throwable th) {
    }

    public b(PrintStream printStream) {
        this(new a(printStream));
    }

    public b(a aVar) {
        this.f51536f = aVar;
    }
}
