package androidx.profileinstaller;

/* loaded from: classes.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    f(long j4) {
        this.mValue = j4;
    }

    static f e(long j4) {
        f[] values = values();
        for (int i4 = 0; i4 < values.length; i4++) {
            if (values[i4].f() == j4) {
                return values[i4];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j4);
    }

    public long f() {
        return this.mValue;
    }
}
