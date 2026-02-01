package q1;

/* loaded from: classes2.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C2397b f57351a;

    /* renamed from: b, reason: collision with root package name */
    public final d f57352b;

    /* renamed from: c, reason: collision with root package name */
    public final C2398c f57353c;

    /* renamed from: d, reason: collision with root package name */
    public final long f57354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57356f;

    public f(long j4, C2397b c2397b, d dVar, C2398c c2398c, int i4, int i5) {
        this.f57354d = j4;
        this.f57351a = c2397b;
        this.f57352b = dVar;
        this.f57353c = c2398c;
        this.f57355e = i4;
        this.f57356f = i5;
    }

    @Override // q1.e
    public C2398c a() {
        return this.f57353c;
    }

    @Override // q1.e
    public long b() {
        return this.f57354d;
    }

    @Override // q1.e
    public int c() {
        return this.f57356f;
    }

    @Override // q1.e
    public boolean d(long j4) {
        if (this.f57354d < j4) {
            return true;
        }
        return false;
    }

    @Override // q1.e
    public d e() {
        return this.f57352b;
    }

    @Override // q1.e
    public int f() {
        return this.f57355e;
    }

    public C2397b g() {
        return this.f57351a;
    }
}
