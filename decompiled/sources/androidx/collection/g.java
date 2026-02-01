package androidx.collection;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f6482a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    static final long[] f6483b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    static final Object[] f6484c = new Object[0];

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int[] iArr, int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else if (i9 > i5) {
                i6 = i8 - 1;
            } else {
                return i8;
            }
        }
        return ~i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(long[] jArr, int i4, long j4) {
        int i5 = i4 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j5 = jArr[i7];
            if (j5 < j4) {
                i6 = i7 + 1;
            } else if (j5 > j4) {
                i5 = i7 - 1;
            } else {
                return i7;
            }
        }
        return ~i6;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int d(int i4) {
        for (int i5 = 4; i5 < 32; i5++) {
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                return i6;
            }
        }
        return i4;
    }

    public static int e(int i4) {
        return d(i4 * 4) / 4;
    }

    public static int f(int i4) {
        return d(i4 * 8) / 8;
    }
}
