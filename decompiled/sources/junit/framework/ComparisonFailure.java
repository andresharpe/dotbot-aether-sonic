package junit.framework;

/* loaded from: classes2.dex */
public class ComparisonFailure extends AssertionFailedError {

    /* renamed from: H, reason: collision with root package name */
    private static final int f51491H = 20;

    /* renamed from: I, reason: collision with root package name */
    private static final long f51492I = 1;

    /* renamed from: F, reason: collision with root package name */
    private String f51493F;

    /* renamed from: G, reason: collision with root package name */
    private String f51494G;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.f51493F = str2;
        this.f51494G = str3;
    }

    public String b() {
        return this.f51494G;
    }

    public String c() {
        return this.f51493F;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new b(20, this.f51493F, this.f51494G).b(super.getMessage());
    }
}
