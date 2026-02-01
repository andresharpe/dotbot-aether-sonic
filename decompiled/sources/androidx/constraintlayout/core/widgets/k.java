package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f8284a;

    /* renamed from: b, reason: collision with root package name */
    public int f8285b;

    /* renamed from: c, reason: collision with root package name */
    public int f8286c;

    /* renamed from: d, reason: collision with root package name */
    public int f8287d;

    public boolean a(int i4, int i5) {
        int i6;
        int i7 = this.f8284a;
        if (i4 >= i7 && i4 < i7 + this.f8286c && i5 >= (i6 = this.f8285b) && i5 < i6 + this.f8287d) {
            return true;
        }
        return false;
    }

    public int b() {
        return (this.f8284a + this.f8286c) / 2;
    }

    public int c() {
        return (this.f8285b + this.f8287d) / 2;
    }

    void d(int i4, int i5) {
        this.f8284a -= i4;
        this.f8285b -= i5;
        this.f8286c += i4 * 2;
        this.f8287d += i5 * 2;
    }

    boolean e(k kVar) {
        int i4;
        int i5;
        int i6 = this.f8284a;
        int i7 = kVar.f8284a;
        if (i6 >= i7 && i6 < i7 + kVar.f8286c && (i4 = this.f8285b) >= (i5 = kVar.f8285b) && i4 < i5 + kVar.f8287d) {
            return true;
        }
        return false;
    }

    public void f(int i4, int i5, int i6, int i7) {
        this.f8284a = i4;
        this.f8285b = i5;
        this.f8286c = i6;
        this.f8287d = i7;
    }
}
