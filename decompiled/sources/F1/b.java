package F1;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f434a;

    private b() {
    }

    public static b b() {
        if (f434a == null) {
            f434a = new b();
        }
        return f434a;
    }

    @Override // F1.a
    public long a() {
        return System.currentTimeMillis();
    }
}
