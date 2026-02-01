package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int f13000a = 19;

    /* renamed from: b, reason: collision with root package name */
    private static final int f13001b = 60;

    /* renamed from: c, reason: collision with root package name */
    private static final int f13002c = 3600;

    /* renamed from: d, reason: collision with root package name */
    private static final int f13003d = 86400;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f13004e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static char[] f13005f = new char[24];

    private K() {
    }

    private static int a(int i4, int i5, boolean z3, int i6) {
        if (i4 > 99 || (z3 && i6 >= 3)) {
            return i5 + 3;
        }
        if (i4 > 9 || (z3 && i6 >= 2)) {
            return i5 + 2;
        }
        if (z3 || i4 > 0) {
            return i5 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void b(long j4, long j5, PrintWriter printWriter) {
        if (j4 == 0) {
            printWriter.print("--");
        } else {
            d(j4 - j5, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void c(long j4, PrintWriter printWriter) {
        d(j4, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void d(long j4, PrintWriter printWriter, int i4) {
        synchronized (f13004e) {
            printWriter.print(new String(f13005f, 0, f(j4, i4)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void e(long j4, StringBuilder sb) {
        synchronized (f13004e) {
            sb.append(f13005f, 0, f(j4, 0));
        }
    }

    private static int f(long j4, int i4) {
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        boolean z5;
        int i11;
        boolean z6;
        int i12;
        int i13;
        boolean z7;
        boolean z8;
        boolean z9;
        int i14;
        long j5 = j4;
        if (f13005f.length < i4) {
            f13005f = new char[i4];
        }
        char[] cArr = f13005f;
        if (j5 == 0) {
            int i15 = i4 - 1;
            while (i15 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j5 > 0) {
            c4 = '+';
        } else {
            j5 = -j5;
            c4 = '-';
        }
        int i16 = (int) (j5 % 1000);
        int floor = (int) Math.floor(j5 / 1000);
        if (floor > 86400) {
            i5 = floor / 86400;
            floor -= 86400 * i5;
        } else {
            i5 = 0;
        }
        if (floor > 3600) {
            i6 = floor / 3600;
            floor -= i6 * 3600;
        } else {
            i6 = 0;
        }
        if (floor > 60) {
            int i17 = floor / 60;
            i7 = floor - (i17 * 60);
            i8 = i17;
        } else {
            i7 = floor;
            i8 = 0;
        }
        if (i4 != 0) {
            int a4 = a(i5, 1, false, 0);
            if (a4 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a5 = a4 + a(i6, 1, z7, 2);
            if (a5 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int a6 = a5 + a(i8, 1, z8, 2);
            if (a6 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int a7 = a6 + a(i7, 1, z9, 2);
            if (a7 > 0) {
                i14 = 3;
            } else {
                i14 = 0;
            }
            i9 = 0;
            for (int a8 = a7 + a(i16, 2, true, i14) + 1; a8 < i4; a8++) {
                cArr[i9] = ' ';
                i9++;
            }
        } else {
            i9 = 0;
        }
        cArr[i9] = c4;
        int i18 = i9 + 1;
        if (i4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int g4 = g(cArr, i5, 'd', i18, false, 0);
        if (g4 != i18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int g5 = g(cArr, i6, 'h', g4, z4, i10);
        if (g5 != i18) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int g6 = g(cArr, i8, 'm', g5, z5, i11);
        if (g6 != i18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z3) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int g7 = g(cArr, i7, 's', g6, z6, i12);
        if (z3 && g7 != i18) {
            i13 = 3;
        } else {
            i13 = 0;
        }
        int g8 = g(cArr, i16, 'm', g7, true, i13);
        cArr[g8] = 's';
        return g8 + 1;
    }

    private static int g(char[] cArr, int i4, char c4, int i5, boolean z3, int i6) {
        int i7;
        if (z3 || i4 > 0) {
            if ((z3 && i6 >= 3) || i4 > 99) {
                int i8 = i4 / 100;
                cArr[i5] = (char) (i8 + 48);
                i7 = i5 + 1;
                i4 -= i8 * 100;
            } else {
                i7 = i5;
            }
            if ((z3 && i6 >= 2) || i4 > 9 || i5 != i7) {
                int i9 = i4 / 10;
                cArr[i7] = (char) (i9 + 48);
                i7++;
                i4 -= i9 * 10;
            }
            cArr[i7] = (char) (i4 + 48);
            cArr[i7 + 1] = c4;
            return i7 + 2;
        }
        return i5;
    }
}
