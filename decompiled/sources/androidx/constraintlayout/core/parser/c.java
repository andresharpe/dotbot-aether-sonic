package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class c {

    /* renamed from: J, reason: collision with root package name */
    protected static int f7598J = 80;

    /* renamed from: K, reason: collision with root package name */
    protected static int f7599K = 2;

    /* renamed from: E, reason: collision with root package name */
    private final char[] f7600E;

    /* renamed from: F, reason: collision with root package name */
    protected long f7601F = -1;

    /* renamed from: G, reason: collision with root package name */
    protected long f7602G = Long.MAX_VALUE;

    /* renamed from: H, reason: collision with root package name */
    protected b f7603H;

    /* renamed from: I, reason: collision with root package name */
    private int f7604I;

    public c(char[] cArr) {
        this.f7600E = cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(' ');
        }
    }

    public String c() {
        String str = new String(this.f7600E);
        long j4 = this.f7602G;
        if (j4 != Long.MAX_VALUE) {
            long j5 = this.f7601F;
            if (j4 >= j5) {
                return str.substring((int) j5, ((int) j4) + 1);
            }
        }
        long j6 = this.f7601F;
        return str.substring((int) j6, ((int) j6) + 1);
    }

    public c d() {
        return this.f7603H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String f() {
        if (g.f7609d) {
            return n() + " -> ";
        }
        return "";
    }

    public long g() {
        return this.f7602G;
    }

    public float j() {
        if (this instanceof e) {
            return ((e) this).j();
        }
        return Float.NaN;
    }

    public int k() {
        if (this instanceof e) {
            return ((e) this).k();
        }
        return 0;
    }

    public int l() {
        return this.f7604I;
    }

    public long m() {
        return this.f7601F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String n() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean o() {
        if (this.f7602G != Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f7601F > -1) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if (this.f7601F == -1) {
            return true;
        }
        return false;
    }

    public void r(b bVar) {
        this.f7603H = bVar;
    }

    public void s(long j4) {
        if (this.f7602G != Long.MAX_VALUE) {
            return;
        }
        this.f7602G = j4;
        if (g.f7609d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f7603H;
        if (bVar != null) {
            bVar.x(this);
        }
    }

    public void t(int i4) {
        this.f7604I = i4;
    }

    public String toString() {
        long j4 = this.f7601F;
        long j5 = this.f7602G;
        if (j4 <= j5 && j5 != Long.MAX_VALUE) {
            String substring = new String(this.f7600E).substring((int) this.f7601F, ((int) this.f7602G) + 1);
            return n() + " (" + this.f7601F + " : " + this.f7602G + ") <<" + substring + ">>";
        }
        return getClass() + " (INVALID, " + this.f7601F + "-" + this.f7602G + ")";
    }

    public void u(long j4) {
        this.f7601F = j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String v(int i4, int i5) {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String w() {
        return "";
    }
}
