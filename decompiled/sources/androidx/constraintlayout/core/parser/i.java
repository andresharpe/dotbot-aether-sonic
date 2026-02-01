package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: L, reason: collision with root package name */
    int f7614L;

    /* renamed from: M, reason: collision with root package name */
    b f7615M;

    /* renamed from: N, reason: collision with root package name */
    char[] f7616N;

    /* renamed from: O, reason: collision with root package name */
    char[] f7617O;

    /* renamed from: P, reason: collision with root package name */
    char[] f7618P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7619a;

        static {
            int[] iArr = new int[b.values().length];
            f7619a = iArr;
            try {
                iArr[b.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7619a[b.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7619a[b.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7619a[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public i(char[] cArr) {
        super(cArr);
        this.f7614L = 0;
        this.f7615M = b.UNKNOWN;
        this.f7616N = L1.a.f1650s3.toCharArray();
        this.f7617O = L1.a.t3.toCharArray();
        this.f7618P = "null".toCharArray();
    }

    public static c x(char[] cArr) {
        return new i(cArr);
    }

    public boolean A() throws CLParsingException {
        if (this.f7615M == b.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + c() + ">", this);
    }

    public boolean B(char c4, long j4) {
        int i4 = a.f7619a[this.f7615M.ordinal()];
        boolean z3 = false;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        char[] cArr = this.f7616N;
                        int i5 = this.f7614L;
                        if (cArr[i5] == c4) {
                            this.f7615M = b.TRUE;
                        } else if (this.f7617O[i5] == c4) {
                            this.f7615M = b.FALSE;
                        } else if (this.f7618P[i5] == c4) {
                            this.f7615M = b.NULL;
                        }
                        z3 = true;
                    }
                } else {
                    char[] cArr2 = this.f7618P;
                    int i6 = this.f7614L;
                    if (cArr2[i6] == c4) {
                        z3 = true;
                    }
                    if (z3 && i6 + 1 == cArr2.length) {
                        s(j4);
                    }
                }
            } else {
                char[] cArr3 = this.f7617O;
                int i7 = this.f7614L;
                if (cArr3[i7] == c4) {
                    z3 = true;
                }
                if (z3 && i7 + 1 == cArr3.length) {
                    s(j4);
                }
            }
        } else {
            char[] cArr4 = this.f7616N;
            int i8 = this.f7614L;
            if (cArr4[i8] == c4) {
                z3 = true;
            }
            if (z3 && i8 + 1 == cArr4.length) {
                s(j4);
            }
        }
        this.f7614L++;
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        sb.append(c());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        if (g.f7609d) {
            return "<" + c() + ">";
        }
        return c();
    }

    public boolean y() throws CLParsingException {
        b bVar = this.f7615M;
        if (bVar == b.TRUE) {
            return true;
        }
        if (bVar == b.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + c() + ">", this);
    }

    public b z() {
        return this.f7615M;
    }
}
