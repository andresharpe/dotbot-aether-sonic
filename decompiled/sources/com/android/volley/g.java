package com.android.volley;

/* loaded from: classes.dex */
public class g implements r {

    /* renamed from: e, reason: collision with root package name */
    public static final int f24473e = 2500;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24474f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final float f24475g = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private int f24476a;

    /* renamed from: b, reason: collision with root package name */
    private int f24477b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24478c;

    /* renamed from: d, reason: collision with root package name */
    private final float f24479d;

    public g() {
        this(f24473e, 1, 1.0f);
    }

    @Override // com.android.volley.r
    public void a(VolleyError volleyError) throws VolleyError {
        this.f24477b++;
        int i4 = this.f24476a;
        this.f24476a = i4 + ((int) (i4 * this.f24479d));
        if (e()) {
        } else {
            throw volleyError;
        }
    }

    @Override // com.android.volley.r
    public int b() {
        return this.f24476a;
    }

    @Override // com.android.volley.r
    public int c() {
        return this.f24477b;
    }

    public float d() {
        return this.f24479d;
    }

    protected boolean e() {
        if (this.f24477b <= this.f24478c) {
            return true;
        }
        return false;
    }

    public g(int i4, int i5, float f4) {
        this.f24476a = i4;
        this.f24478c = i5;
        this.f24479d = f4;
    }
}
