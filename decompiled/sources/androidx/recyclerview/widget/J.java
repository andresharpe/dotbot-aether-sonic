package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
class J {

    /* renamed from: c, reason: collision with root package name */
    static final int f17492c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f17493d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f17494e = 4;

    /* renamed from: f, reason: collision with root package name */
    static final int f17495f = 0;

    /* renamed from: g, reason: collision with root package name */
    static final int f17496g = 1;

    /* renamed from: h, reason: collision with root package name */
    static final int f17497h = 2;

    /* renamed from: i, reason: collision with root package name */
    static final int f17498i = 4;

    /* renamed from: j, reason: collision with root package name */
    static final int f17499j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f17500k = 16;

    /* renamed from: l, reason: collision with root package name */
    static final int f17501l = 32;

    /* renamed from: m, reason: collision with root package name */
    static final int f17502m = 64;

    /* renamed from: n, reason: collision with root package name */
    static final int f17503n = 8;

    /* renamed from: o, reason: collision with root package name */
    static final int f17504o = 256;

    /* renamed from: p, reason: collision with root package name */
    static final int f17505p = 512;

    /* renamed from: q, reason: collision with root package name */
    static final int f17506q = 1024;

    /* renamed from: r, reason: collision with root package name */
    static final int f17507r = 12;

    /* renamed from: s, reason: collision with root package name */
    static final int f17508s = 4096;

    /* renamed from: t, reason: collision with root package name */
    static final int f17509t = 8192;

    /* renamed from: u, reason: collision with root package name */
    static final int f17510u = 16384;

    /* renamed from: v, reason: collision with root package name */
    static final int f17511v = 7;

    /* renamed from: a, reason: collision with root package name */
    final b f17512a;

    /* renamed from: b, reason: collision with root package name */
    a f17513b = new a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f17514a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f17515b;

        /* renamed from: c, reason: collision with root package name */
        int f17516c;

        /* renamed from: d, reason: collision with root package name */
        int f17517d;

        /* renamed from: e, reason: collision with root package name */
        int f17518e;

        a() {
        }

        void a(int i4) {
            this.f17514a = i4 | this.f17514a;
        }

        boolean b() {
            int i4 = this.f17514a;
            if ((i4 & 7) != 0 && (i4 & c(this.f17517d, this.f17515b)) == 0) {
                return false;
            }
            int i5 = this.f17514a;
            if ((i5 & 112) != 0 && (i5 & (c(this.f17517d, this.f17516c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f17514a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f17518e, this.f17515b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f17514a;
            if ((i7 & 28672) != 0 && (i7 & (c(this.f17518e, this.f17516c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        void d() {
            this.f17514a = 0;
        }

        void e(int i4, int i5, int i6, int i7) {
            this.f17515b = i4;
            this.f17516c = i5;
            this.f17517d = i6;
            this.f17518e = i7;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        View a(int i4);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(b bVar) {
        this.f17512a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i4, int i5, int i6, int i7) {
        int i8;
        int c4 = this.f17512a.c();
        int d4 = this.f17512a.d();
        if (i5 > i4) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        View view = null;
        while (i4 != i5) {
            View a4 = this.f17512a.a(i4);
            this.f17513b.e(c4, d4, this.f17512a.b(a4), this.f17512a.e(a4));
            if (i6 != 0) {
                this.f17513b.d();
                this.f17513b.a(i6);
                if (this.f17513b.b()) {
                    return a4;
                }
            }
            if (i7 != 0) {
                this.f17513b.d();
                this.f17513b.a(i7);
                if (this.f17513b.b()) {
                    view = a4;
                }
            }
            i4 += i8;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i4) {
        this.f17513b.e(this.f17512a.c(), this.f17512a.d(), this.f17512a.b(view), this.f17512a.e(view));
        if (i4 != 0) {
            this.f17513b.d();
            this.f17513b.a(i4);
            return this.f17513b.b();
        }
        return false;
    }
}
