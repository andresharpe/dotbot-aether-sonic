package okio;

import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: h, reason: collision with root package name */
    static final int f55409h = 8192;

    /* renamed from: i, reason: collision with root package name */
    static final int f55410i = 1024;

    /* renamed from: a, reason: collision with root package name */
    final byte[] f55411a;

    /* renamed from: b, reason: collision with root package name */
    int f55412b;

    /* renamed from: c, reason: collision with root package name */
    int f55413c;

    /* renamed from: d, reason: collision with root package name */
    boolean f55414d;

    /* renamed from: e, reason: collision with root package name */
    boolean f55415e;

    /* renamed from: f, reason: collision with root package name */
    v f55416f;

    /* renamed from: g, reason: collision with root package name */
    v f55417g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v() {
        this.f55411a = new byte[8192];
        this.f55415e = true;
        this.f55414d = false;
    }

    public final void a() {
        int i4;
        v vVar = this.f55417g;
        if (vVar != this) {
            if (!vVar.f55415e) {
                return;
            }
            int i5 = this.f55413c - this.f55412b;
            int i6 = 8192 - vVar.f55413c;
            if (vVar.f55414d) {
                i4 = 0;
            } else {
                i4 = vVar.f55412b;
            }
            if (i5 > i6 + i4) {
                return;
            }
            g(vVar, i5);
            b();
            w.a(this);
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final v b() {
        v vVar;
        v vVar2 = this.f55416f;
        if (vVar2 != this) {
            vVar = vVar2;
        } else {
            vVar = null;
        }
        v vVar3 = this.f55417g;
        vVar3.f55416f = vVar2;
        this.f55416f.f55417g = vVar3;
        this.f55416f = null;
        this.f55417g = null;
        return vVar;
    }

    public final v c(v vVar) {
        vVar.f55417g = this;
        vVar.f55416f = this.f55416f;
        this.f55416f.f55417g = vVar;
        this.f55416f = vVar;
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v d() {
        this.f55414d = true;
        return new v(this.f55411a, this.f55412b, this.f55413c, true, false);
    }

    public final v e(int i4) {
        v b4;
        if (i4 > 0 && i4 <= this.f55413c - this.f55412b) {
            if (i4 >= 1024) {
                b4 = d();
            } else {
                b4 = w.b();
                System.arraycopy(this.f55411a, this.f55412b, b4.f55411a, 0, i4);
            }
            b4.f55413c = b4.f55412b + i4;
            this.f55412b += i4;
            this.f55417g.c(b4);
            return b4;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v f() {
        return new v((byte[]) this.f55411a.clone(), this.f55412b, this.f55413c, false, true);
    }

    public final void g(v vVar, int i4) {
        if (vVar.f55415e) {
            int i5 = vVar.f55413c;
            if (i5 + i4 > 8192) {
                if (!vVar.f55414d) {
                    int i6 = vVar.f55412b;
                    if ((i5 + i4) - i6 <= 8192) {
                        byte[] bArr = vVar.f55411a;
                        System.arraycopy(bArr, i6, bArr, 0, i5 - i6);
                        vVar.f55413c -= vVar.f55412b;
                        vVar.f55412b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f55411a, this.f55412b, vVar.f55411a, vVar.f55413c, i4);
            vVar.f55413c += i4;
            this.f55412b += i4;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(byte[] bArr, int i4, int i5, boolean z3, boolean z4) {
        this.f55411a = bArr;
        this.f55412b = i4;
        this.f55413c = i5;
        this.f55414d = z3;
        this.f55415e = z4;
    }
}
