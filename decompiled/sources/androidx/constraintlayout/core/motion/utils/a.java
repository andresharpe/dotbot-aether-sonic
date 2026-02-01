package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f7109g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7110h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7111i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7112j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7113k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f7114l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f7115m = 3;

    /* renamed from: d, reason: collision with root package name */
    private final double[] f7116d;

    /* renamed from: e, reason: collision with root package name */
    C0058a[] f7117e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7118f = true;

    /* renamed from: androidx.constraintlayout.core.motion.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0058a {

        /* renamed from: s, reason: collision with root package name */
        private static final String f7119s = "Arc";

        /* renamed from: t, reason: collision with root package name */
        private static double[] f7120t = new double[91];

        /* renamed from: u, reason: collision with root package name */
        private static final double f7121u = 0.001d;

        /* renamed from: a, reason: collision with root package name */
        double[] f7122a;

        /* renamed from: b, reason: collision with root package name */
        double f7123b;

        /* renamed from: c, reason: collision with root package name */
        double f7124c;

        /* renamed from: d, reason: collision with root package name */
        double f7125d;

        /* renamed from: e, reason: collision with root package name */
        double f7126e;

        /* renamed from: f, reason: collision with root package name */
        double f7127f;

        /* renamed from: g, reason: collision with root package name */
        double f7128g;

        /* renamed from: h, reason: collision with root package name */
        double f7129h;

        /* renamed from: i, reason: collision with root package name */
        double f7130i;

        /* renamed from: j, reason: collision with root package name */
        double f7131j;

        /* renamed from: k, reason: collision with root package name */
        double f7132k;

        /* renamed from: l, reason: collision with root package name */
        double f7133l;

        /* renamed from: m, reason: collision with root package name */
        double f7134m;

        /* renamed from: n, reason: collision with root package name */
        double f7135n;

        /* renamed from: o, reason: collision with root package name */
        double f7136o;

        /* renamed from: p, reason: collision with root package name */
        double f7137p;

        /* renamed from: q, reason: collision with root package name */
        boolean f7138q;

        /* renamed from: r, reason: collision with root package name */
        boolean f7139r;

        C0058a(int i4, double d4, double d5, double d6, double d7, double d8, double d9) {
            int i5;
            double d10;
            double d11;
            this.f7139r = false;
            this.f7138q = i4 == 1;
            this.f7124c = d4;
            this.f7125d = d5;
            this.f7130i = 1.0d / (d5 - d4);
            if (3 == i4) {
                this.f7139r = true;
            }
            double d12 = d8 - d6;
            double d13 = d9 - d7;
            if (!this.f7139r && Math.abs(d12) >= f7121u && Math.abs(d13) >= f7121u) {
                this.f7122a = new double[101];
                boolean z3 = this.f7138q;
                if (z3) {
                    i5 = -1;
                } else {
                    i5 = 1;
                }
                this.f7131j = d12 * i5;
                this.f7132k = d13 * (z3 ? 1 : -1);
                if (z3) {
                    d10 = d8;
                } else {
                    d10 = d6;
                }
                this.f7133l = d10;
                if (z3) {
                    d11 = d7;
                } else {
                    d11 = d9;
                }
                this.f7134m = d11;
                a(d6, d7, d8, d9);
                this.f7135n = this.f7123b * this.f7130i;
                return;
            }
            this.f7139r = true;
            this.f7126e = d6;
            this.f7127f = d8;
            this.f7128g = d7;
            this.f7129h = d9;
            double hypot = Math.hypot(d13, d12);
            this.f7123b = hypot;
            this.f7135n = hypot * this.f7130i;
            double d14 = this.f7125d;
            double d15 = this.f7124c;
            this.f7133l = d12 / (d14 - d15);
            this.f7134m = d13 / (d14 - d15);
        }

        private void a(double d4, double d5, double d6, double d7) {
            double d8;
            double d9 = d6 - d4;
            double d10 = d5 - d7;
            int i4 = 0;
            double d11 = com.google.firebase.remoteconfig.l.f37524n;
            double d12 = com.google.firebase.remoteconfig.l.f37524n;
            double d13 = com.google.firebase.remoteconfig.l.f37524n;
            while (true) {
                if (i4 >= f7120t.length) {
                    break;
                }
                double d14 = d11;
                double radians = Math.toRadians((i4 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d9;
                double cos = Math.cos(radians) * d10;
                if (i4 > 0) {
                    d8 = Math.hypot(sin - d12, cos - d13) + d14;
                    f7120t[i4] = d8;
                } else {
                    d8 = d14;
                }
                i4++;
                d13 = cos;
                d11 = d8;
                d12 = sin;
            }
            double d15 = d11;
            this.f7123b = d15;
            int i5 = 0;
            while (true) {
                double[] dArr = f7120t;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / d15;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 < this.f7122a.length) {
                    double length = i6 / (r1.length - 1);
                    int binarySearch = Arrays.binarySearch(f7120t, length);
                    if (binarySearch >= 0) {
                        this.f7122a[i6] = binarySearch / (f7120t.length - 1);
                    } else if (binarySearch == -1) {
                        this.f7122a[i6] = 0.0d;
                    } else {
                        int i7 = -binarySearch;
                        int i8 = i7 - 2;
                        double[] dArr2 = f7120t;
                        double d16 = dArr2[i8];
                        this.f7122a[i6] = (i8 + ((length - d16) / (dArr2[i7 - 1] - d16))) / (dArr2.length - 1);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }

        double b() {
            double d4 = this.f7131j * this.f7137p;
            double hypot = this.f7135n / Math.hypot(d4, (-this.f7132k) * this.f7136o);
            if (this.f7138q) {
                d4 = -d4;
            }
            return d4 * hypot;
        }

        double c() {
            double d4 = this.f7131j * this.f7137p;
            double d5 = (-this.f7132k) * this.f7136o;
            double hypot = this.f7135n / Math.hypot(d4, d5);
            if (this.f7138q) {
                return (-d5) * hypot;
            }
            return d5 * hypot;
        }

        public double d(double d4) {
            return this.f7133l;
        }

        public double e(double d4) {
            return this.f7134m;
        }

        public double f(double d4) {
            double d5 = (d4 - this.f7124c) * this.f7130i;
            double d6 = this.f7126e;
            return d6 + (d5 * (this.f7127f - d6));
        }

        public double g(double d4) {
            double d5 = (d4 - this.f7124c) * this.f7130i;
            double d6 = this.f7128g;
            return d6 + (d5 * (this.f7129h - d6));
        }

        double h() {
            return this.f7133l + (this.f7131j * this.f7136o);
        }

        double i() {
            return this.f7134m + (this.f7132k * this.f7137p);
        }

        double j(double d4) {
            if (d4 <= com.google.firebase.remoteconfig.l.f37524n) {
                return com.google.firebase.remoteconfig.l.f37524n;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f7122a;
            double length = d4 * (dArr.length - 1);
            int i4 = (int) length;
            double d5 = length - i4;
            double d6 = dArr[i4];
            return d6 + (d5 * (dArr[i4 + 1] - d6));
        }

        void k(double d4) {
            double d5;
            if (this.f7138q) {
                d5 = this.f7125d - d4;
            } else {
                d5 = d4 - this.f7124c;
            }
            double j4 = j(d5 * this.f7130i) * 1.5707963267948966d;
            this.f7136o = Math.sin(j4);
            this.f7137p = Math.cos(j4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r5 == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f7118f = r2
            r0.f7116d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.a$a[] r3 = new androidx.constraintlayout.core.motion.utils.a.C0058a[r3]
            r0.f7117e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.a$a[] r7 = r0.f7117e
            int r8 = r7.length
            if (r4 >= r8) goto L51
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L31
            if (r8 == r2) goto L2f
            r10 = 2
            if (r8 == r10) goto L2d
            if (r8 == r9) goto L28
            goto L32
        L28:
            if (r5 != r2) goto L2f
            goto L2d
        L2b:
            r6 = r5
            goto L32
        L2d:
            r5 = r10
            goto L2b
        L2f:
            r5 = r2
            goto L2b
        L31:
            r6 = r9
        L32:
            androidx.constraintlayout.core.motion.utils.a$a r22 = new androidx.constraintlayout.core.motion.utils.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.a.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double d4, int i4) {
        double g4;
        double e4;
        double i5;
        double c4;
        double g5;
        double e5;
        int i6 = 0;
        if (this.f7118f) {
            C0058a[] c0058aArr = this.f7117e;
            C0058a c0058a = c0058aArr[0];
            double d5 = c0058a.f7124c;
            if (d4 < d5) {
                double d6 = d4 - d5;
                if (c0058a.f7139r) {
                    if (i4 == 0) {
                        g5 = c0058a.f(d5);
                        e5 = this.f7117e[0].d(d5);
                    } else {
                        g5 = c0058a.g(d5);
                        e5 = this.f7117e[0].e(d5);
                    }
                    return g5 + (d6 * e5);
                }
                c0058a.k(d5);
                if (i4 == 0) {
                    i5 = this.f7117e[0].h();
                    c4 = this.f7117e[0].b();
                } else {
                    i5 = this.f7117e[0].i();
                    c4 = this.f7117e[0].c();
                }
                return i5 + (d6 * c4);
            }
            if (d4 > c0058aArr[c0058aArr.length - 1].f7125d) {
                double d7 = c0058aArr[c0058aArr.length - 1].f7125d;
                double d8 = d4 - d7;
                int length = c0058aArr.length - 1;
                if (i4 == 0) {
                    g4 = c0058aArr[length].f(d7);
                    e4 = this.f7117e[length].d(d7);
                } else {
                    g4 = c0058aArr[length].g(d7);
                    e4 = this.f7117e[length].e(d7);
                }
                return g4 + (d8 * e4);
            }
        } else {
            C0058a[] c0058aArr2 = this.f7117e;
            double d9 = c0058aArr2[0].f7124c;
            if (d4 < d9) {
                d4 = d9;
            } else if (d4 > c0058aArr2[c0058aArr2.length - 1].f7125d) {
                d4 = c0058aArr2[c0058aArr2.length - 1].f7125d;
            }
        }
        while (true) {
            C0058a[] c0058aArr3 = this.f7117e;
            if (i6 < c0058aArr3.length) {
                C0058a c0058a2 = c0058aArr3[i6];
                if (d4 <= c0058a2.f7125d) {
                    if (c0058a2.f7139r) {
                        if (i4 == 0) {
                            return c0058a2.f(d4);
                        }
                        return c0058a2.g(d4);
                    }
                    c0058a2.k(d4);
                    if (i4 == 0) {
                        return this.f7117e[i6].h();
                    }
                    return this.f7117e[i6].i();
                }
                i6++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double d4, double[] dArr) {
        if (this.f7118f) {
            C0058a[] c0058aArr = this.f7117e;
            C0058a c0058a = c0058aArr[0];
            double d5 = c0058a.f7124c;
            if (d4 < d5) {
                double d6 = d4 - d5;
                if (c0058a.f7139r) {
                    dArr[0] = c0058a.f(d5) + (this.f7117e[0].d(d5) * d6);
                    dArr[1] = this.f7117e[0].g(d5) + (d6 * this.f7117e[0].e(d5));
                    return;
                } else {
                    c0058a.k(d5);
                    dArr[0] = this.f7117e[0].h() + (this.f7117e[0].b() * d6);
                    dArr[1] = this.f7117e[0].i() + (d6 * this.f7117e[0].c());
                    return;
                }
            }
            if (d4 > c0058aArr[c0058aArr.length - 1].f7125d) {
                double d7 = c0058aArr[c0058aArr.length - 1].f7125d;
                double d8 = d4 - d7;
                int length = c0058aArr.length - 1;
                C0058a c0058a2 = c0058aArr[length];
                if (c0058a2.f7139r) {
                    dArr[0] = c0058a2.f(d7) + (this.f7117e[length].d(d7) * d8);
                    dArr[1] = this.f7117e[length].g(d7) + (d8 * this.f7117e[length].e(d7));
                    return;
                } else {
                    c0058a2.k(d4);
                    dArr[0] = this.f7117e[length].h() + (this.f7117e[length].b() * d8);
                    dArr[1] = this.f7117e[length].i() + (d8 * this.f7117e[length].c());
                    return;
                }
            }
        } else {
            C0058a[] c0058aArr2 = this.f7117e;
            double d9 = c0058aArr2[0].f7124c;
            if (d4 < d9) {
                d4 = d9;
            }
            if (d4 > c0058aArr2[c0058aArr2.length - 1].f7125d) {
                d4 = c0058aArr2[c0058aArr2.length - 1].f7125d;
            }
        }
        int i4 = 0;
        while (true) {
            C0058a[] c0058aArr3 = this.f7117e;
            if (i4 < c0058aArr3.length) {
                C0058a c0058a3 = c0058aArr3[i4];
                if (d4 <= c0058a3.f7125d) {
                    if (c0058a3.f7139r) {
                        dArr[0] = c0058a3.f(d4);
                        dArr[1] = this.f7117e[i4].g(d4);
                        return;
                    } else {
                        c0058a3.k(d4);
                        dArr[0] = this.f7117e[i4].h();
                        dArr[1] = this.f7117e[i4].i();
                        return;
                    }
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double d4, float[] fArr) {
        if (this.f7118f) {
            C0058a[] c0058aArr = this.f7117e;
            C0058a c0058a = c0058aArr[0];
            double d5 = c0058a.f7124c;
            if (d4 < d5) {
                double d6 = d4 - d5;
                if (c0058a.f7139r) {
                    fArr[0] = (float) (c0058a.f(d5) + (this.f7117e[0].d(d5) * d6));
                    fArr[1] = (float) (this.f7117e[0].g(d5) + (d6 * this.f7117e[0].e(d5)));
                    return;
                } else {
                    c0058a.k(d5);
                    fArr[0] = (float) (this.f7117e[0].h() + (this.f7117e[0].b() * d6));
                    fArr[1] = (float) (this.f7117e[0].i() + (d6 * this.f7117e[0].c()));
                    return;
                }
            }
            if (d4 > c0058aArr[c0058aArr.length - 1].f7125d) {
                double d7 = c0058aArr[c0058aArr.length - 1].f7125d;
                double d8 = d4 - d7;
                int length = c0058aArr.length - 1;
                C0058a c0058a2 = c0058aArr[length];
                if (c0058a2.f7139r) {
                    fArr[0] = (float) (c0058a2.f(d7) + (this.f7117e[length].d(d7) * d8));
                    fArr[1] = (float) (this.f7117e[length].g(d7) + (d8 * this.f7117e[length].e(d7)));
                    return;
                } else {
                    c0058a2.k(d4);
                    fArr[0] = (float) this.f7117e[length].h();
                    fArr[1] = (float) this.f7117e[length].i();
                    return;
                }
            }
        } else {
            C0058a[] c0058aArr2 = this.f7117e;
            double d9 = c0058aArr2[0].f7124c;
            if (d4 < d9) {
                d4 = d9;
            } else if (d4 > c0058aArr2[c0058aArr2.length - 1].f7125d) {
                d4 = c0058aArr2[c0058aArr2.length - 1].f7125d;
            }
        }
        int i4 = 0;
        while (true) {
            C0058a[] c0058aArr3 = this.f7117e;
            if (i4 < c0058aArr3.length) {
                C0058a c0058a3 = c0058aArr3[i4];
                if (d4 <= c0058a3.f7125d) {
                    if (c0058a3.f7139r) {
                        fArr[0] = (float) c0058a3.f(d4);
                        fArr[1] = (float) this.f7117e[i4].g(d4);
                        return;
                    } else {
                        c0058a3.k(d4);
                        fArr[0] = (float) this.f7117e[i4].h();
                        fArr[1] = (float) this.f7117e[i4].i();
                        return;
                    }
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double d4, int i4) {
        C0058a[] c0058aArr = this.f7117e;
        int i5 = 0;
        double d5 = c0058aArr[0].f7124c;
        if (d4 < d5) {
            d4 = d5;
        }
        if (d4 > c0058aArr[c0058aArr.length - 1].f7125d) {
            d4 = c0058aArr[c0058aArr.length - 1].f7125d;
        }
        while (true) {
            C0058a[] c0058aArr2 = this.f7117e;
            if (i5 < c0058aArr2.length) {
                C0058a c0058a = c0058aArr2[i5];
                if (d4 <= c0058a.f7125d) {
                    if (c0058a.f7139r) {
                        if (i4 == 0) {
                            return c0058a.d(d4);
                        }
                        return c0058a.e(d4);
                    }
                    c0058a.k(d4);
                    if (i4 == 0) {
                        return this.f7117e[i5].b();
                    }
                    return this.f7117e[i5].c();
                }
                i5++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double d4, double[] dArr) {
        C0058a[] c0058aArr = this.f7117e;
        double d5 = c0058aArr[0].f7124c;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > c0058aArr[c0058aArr.length - 1].f7125d) {
            d4 = c0058aArr[c0058aArr.length - 1].f7125d;
        }
        int i4 = 0;
        while (true) {
            C0058a[] c0058aArr2 = this.f7117e;
            if (i4 < c0058aArr2.length) {
                C0058a c0058a = c0058aArr2[i4];
                if (d4 <= c0058a.f7125d) {
                    if (c0058a.f7139r) {
                        dArr[0] = c0058a.d(d4);
                        dArr[1] = this.f7117e[i4].e(d4);
                        return;
                    } else {
                        c0058a.k(d4);
                        dArr[0] = this.f7117e[i4].b();
                        dArr[1] = this.f7117e[i4].c();
                        return;
                    }
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f7116d;
    }
}
