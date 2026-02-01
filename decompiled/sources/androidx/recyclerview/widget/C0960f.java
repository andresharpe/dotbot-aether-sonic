package androidx.recyclerview.widget;

import androidx.annotation.N;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0960f implements u {

    /* renamed from: f, reason: collision with root package name */
    private static final int f18009f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f18010g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f18011h = 2;

    /* renamed from: i, reason: collision with root package name */
    private static final int f18012i = 3;

    /* renamed from: a, reason: collision with root package name */
    final u f18013a;

    /* renamed from: b, reason: collision with root package name */
    int f18014b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f18015c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f18016d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f18017e = null;

    public C0960f(@N u uVar) {
        this.f18013a = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i4, int i5) {
        e();
        this.f18013a.a(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i4, int i5) {
        int i6;
        if (this.f18014b == 1 && i4 >= (i6 = this.f18015c)) {
            int i7 = this.f18016d;
            if (i4 <= i6 + i7) {
                this.f18016d = i7 + i5;
                this.f18015c = Math.min(i4, i6);
                return;
            }
        }
        e();
        this.f18015c = i4;
        this.f18016d = i5;
        this.f18014b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i4, int i5) {
        int i6;
        if (this.f18014b == 2 && (i6 = this.f18015c) >= i4 && i6 <= i4 + i5) {
            this.f18016d += i5;
            this.f18015c = i4;
        } else {
            e();
            this.f18015c = i4;
            this.f18016d = i5;
            this.f18014b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i4, int i5, Object obj) {
        int i6;
        if (this.f18014b == 3) {
            int i7 = this.f18015c;
            int i8 = this.f18016d;
            if (i4 <= i7 + i8 && (i6 = i4 + i5) >= i7 && this.f18017e == obj) {
                this.f18015c = Math.min(i4, i7);
                this.f18016d = Math.max(i8 + i7, i6) - this.f18015c;
                return;
            }
        }
        e();
        this.f18015c = i4;
        this.f18016d = i5;
        this.f18017e = obj;
        this.f18014b = 3;
    }

    public void e() {
        int i4 = this.f18014b;
        if (i4 == 0) {
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.f18013a.d(this.f18015c, this.f18016d, this.f18017e);
                }
            } else {
                this.f18013a.c(this.f18015c, this.f18016d);
            }
        } else {
            this.f18013a.b(this.f18015c, this.f18016d);
        }
        this.f18017e = null;
        this.f18014b = 0;
    }
}
