package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    static boolean f7609d = false;

    /* renamed from: a, reason: collision with root package name */
    private String f7610a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7611b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f7612c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7613a;

        static {
            int[] iArr = new int[b.values().length];
            f7613a = iArr;
            try {
                iArr[b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7613a[b.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7613a[b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7613a[b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7613a[b.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7613a[b.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public g(String str) {
        this.f7610a = str;
    }

    private c a(c cVar, int i4, b bVar, boolean z3, char[] cArr) {
        c c02;
        if (f7609d) {
            System.out.println("CREATE " + bVar + " at " + cArr[i4]);
        }
        switch (a.f7613a[bVar.ordinal()]) {
            case 1:
                c02 = f.c0(cArr);
                i4++;
                break;
            case 2:
                c02 = androidx.constraintlayout.core.parser.a.y(cArr);
                i4++;
                break;
            case 3:
                c02 = h.x(cArr);
                break;
            case 4:
                c02 = e.x(cArr);
                break;
            case 5:
                c02 = d.y(cArr);
                break;
            case 6:
                c02 = i.x(cArr);
                break;
            default:
                c02 = null;
                break;
        }
        if (c02 == null) {
            return null;
        }
        c02.t(this.f7612c);
        if (z3) {
            c02.u(i4);
        }
        if (cVar instanceof androidx.constraintlayout.core.parser.b) {
            c02.r((androidx.constraintlayout.core.parser.b) cVar);
        }
        return c02;
    }

    private c b(int i4, char c4, c cVar, char[] cArr) throws CLParsingException {
        if (c4 != '\t' && c4 != '\n' && c4 != '\r' && c4 != ' ') {
            if (c4 != '\"' && c4 != '\'') {
                if (c4 != '[') {
                    if (c4 != ']') {
                        if (c4 != '{') {
                            if (c4 != '}') {
                                switch (c4) {
                                    case '+':
                                    case '-':
                                    case '.':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case ConstraintLayout.b.a.f9601d0 /* 55 */:
                                    case '8':
                                    case '9':
                                        return a(cVar, i4, b.NUMBER, true, cArr);
                                    case ',':
                                    case ':':
                                        return cVar;
                                    case '/':
                                        int i5 = i4 + 1;
                                        if (i5 < cArr.length && cArr[i5] == '/') {
                                            this.f7611b = true;
                                            return cVar;
                                        }
                                        return cVar;
                                    default:
                                        if ((cVar instanceof androidx.constraintlayout.core.parser.b) && !(cVar instanceof f)) {
                                            c a4 = a(cVar, i4, b.TOKEN, true, cArr);
                                            i iVar = (i) a4;
                                            if (!iVar.B(c4, i4)) {
                                                throw new CLParsingException("incorrect token <" + c4 + "> at line " + this.f7612c, iVar);
                                            }
                                            return a4;
                                        }
                                        return a(cVar, i4, b.KEY, true, cArr);
                                }
                            }
                        } else {
                            return a(cVar, i4, b.OBJECT, true, cArr);
                        }
                    }
                    cVar.s(i4 - 1);
                    c d4 = cVar.d();
                    d4.s(i4);
                    return d4;
                }
                return a(cVar, i4, b.ARRAY, true, cArr);
            }
            if (cVar instanceof f) {
                return a(cVar, i4, b.KEY, true, cArr);
            }
            return a(cVar, i4, b.STRING, true, cArr);
        }
        return cVar;
    }

    public static f d(String str) throws CLParsingException {
        return new g(str).c();
    }

    public f c() throws CLParsingException {
        char[] charArray = this.f7610a.toCharArray();
        int length = charArray.length;
        int i4 = 1;
        this.f7612c = 1;
        boolean z3 = false;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                char c4 = charArray[i5];
                if (c4 == '{') {
                    break;
                }
                if (c4 == '\n') {
                    this.f7612c++;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 != -1) {
            f c02 = f.c0(charArray);
            c02.t(this.f7612c);
            c02.u(i5);
            int i6 = i5 + 1;
            c cVar = c02;
            while (i6 < length) {
                char c5 = charArray[i6];
                if (c5 == '\n') {
                    this.f7612c += i4;
                }
                if (this.f7611b) {
                    if (c5 == '\n') {
                        this.f7611b = z3;
                    } else {
                        continue;
                        i6++;
                        i4 = 1;
                        z3 = false;
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (cVar.o()) {
                    cVar = b(i6, c5, cVar, charArray);
                } else if (cVar instanceof f) {
                    if (c5 == '}') {
                        cVar.s(i6 - 1);
                    } else {
                        cVar = b(i6, c5, cVar, charArray);
                    }
                } else if (cVar instanceof androidx.constraintlayout.core.parser.a) {
                    if (c5 == ']') {
                        cVar.s(i6 - 1);
                    } else {
                        cVar = b(i6, c5, cVar, charArray);
                    }
                } else {
                    boolean z4 = cVar instanceof h;
                    if (z4) {
                        long j4 = cVar.f7601F;
                        if (charArray[(int) j4] == c5) {
                            cVar.u(j4 + 1);
                            cVar.s(i6 - 1);
                        }
                    } else {
                        if (cVar instanceof i) {
                            i iVar = (i) cVar;
                            if (!iVar.B(c5, i6)) {
                                throw new CLParsingException("parsing incorrect token " + iVar.c() + " at line " + this.f7612c, iVar);
                            }
                        }
                        if ((cVar instanceof d) || z4) {
                            long j5 = cVar.f7601F;
                            char c6 = charArray[(int) j5];
                            if ((c6 == '\'' || c6 == '\"') && c6 == c5) {
                                cVar.u(j5 + 1);
                                cVar.s(i6 - 1);
                            }
                        }
                        if (!cVar.o() && (c5 == '}' || c5 == ']' || c5 == ',' || c5 == ' ' || c5 == '\t' || c5 == '\r' || c5 == '\n' || c5 == ':')) {
                            long j6 = i6 - 1;
                            cVar.s(j6);
                            if (c5 == '}' || c5 == ']') {
                                cVar = cVar.d();
                                cVar.s(j6);
                                if (cVar instanceof d) {
                                    cVar = cVar.d();
                                    cVar.s(j6);
                                }
                            }
                        }
                    }
                }
                if (cVar.o() && (!(cVar instanceof d) || ((d) cVar).f7597L.size() > 0)) {
                    cVar = cVar.d();
                }
                i6++;
                i4 = 1;
                z3 = false;
            }
            while (cVar != null && !cVar.o()) {
                if (cVar instanceof h) {
                    cVar.u(((int) cVar.f7601F) + 1);
                }
                cVar.s(length - 1);
                cVar = cVar.d();
            }
            if (f7609d) {
                System.out.println("Root: " + c02.w());
            }
            return c02;
        }
        throw new CLParsingException("invalid json content", null);
    }
}
