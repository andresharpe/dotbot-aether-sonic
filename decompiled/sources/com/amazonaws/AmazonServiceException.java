package com.amazonaws;

/* loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {

    /* renamed from: L, reason: collision with root package name */
    private static final long f23346L = 1;

    /* renamed from: F, reason: collision with root package name */
    private String f23347F;

    /* renamed from: G, reason: collision with root package name */
    private String f23348G;

    /* renamed from: H, reason: collision with root package name */
    private ErrorType f23349H;

    /* renamed from: I, reason: collision with root package name */
    private String f23350I;

    /* renamed from: J, reason: collision with root package name */
    private int f23351J;

    /* renamed from: K, reason: collision with root package name */
    private String f23352K;

    /* loaded from: classes.dex */
    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        this.f23349H = ErrorType.Unknown;
        this.f23350I = str;
    }

    public String b() {
        return this.f23348G;
    }

    public String c() {
        return this.f23350I;
    }

    public ErrorType d() {
        return this.f23349H;
    }

    public String e() {
        return this.f23347F;
    }

    public String f() {
        return this.f23352K;
    }

    public int g() {
        return this.f23351J;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c() + " (Service: " + f() + "; Status Code: " + g() + "; Error Code: " + b() + "; Request ID: " + e() + ")";
    }

    public void h(String str) {
        this.f23348G = str;
    }

    public void i(String str) {
        this.f23350I = str;
    }

    public void j(ErrorType errorType) {
        this.f23349H = errorType;
    }

    public void k(String str) {
        this.f23347F = str;
    }

    public void l(String str) {
        this.f23352K = str;
    }

    public void m(int i4) {
        this.f23351J = i4;
    }

    public AmazonServiceException(String str, Exception exc) {
        super(null, exc);
        this.f23349H = ErrorType.Unknown;
        this.f23350I = str;
    }
}
