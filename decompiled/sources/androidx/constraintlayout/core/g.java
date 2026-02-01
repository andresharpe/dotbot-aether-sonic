package androidx.constraintlayout.core;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6710a = false;

    /* loaded from: classes.dex */
    interface a<T> {
        boolean a(T t3);

        T b();

        void c(T[] tArr, int i4);
    }

    /* loaded from: classes.dex */
    static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f6711a;

        /* renamed from: b, reason: collision with root package name */
        private int f6712b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i4) {
            if (i4 > 0) {
                this.f6711a = new Object[i4];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean d(T t3) {
            for (int i4 = 0; i4 < this.f6712b; i4++) {
                if (this.f6711a[i4] == t3) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.g.a
        public boolean a(T t3) {
            int i4 = this.f6712b;
            Object[] objArr = this.f6711a;
            if (i4 < objArr.length) {
                objArr[i4] = t3;
                this.f6712b = i4 + 1;
                return true;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.g.a
        public T b() {
            int i4 = this.f6712b;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            Object[] objArr = this.f6711a;
            T t3 = (T) objArr[i5];
            objArr[i5] = null;
            this.f6712b = i4 - 1;
            return t3;
        }

        @Override // androidx.constraintlayout.core.g.a
        public void c(T[] tArr, int i4) {
            if (i4 > tArr.length) {
                i4 = tArr.length;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                T t3 = tArr[i5];
                int i6 = this.f6712b;
                Object[] objArr = this.f6711a;
                if (i6 < objArr.length) {
                    objArr[i6] = t3;
                    this.f6712b = i6 + 1;
                }
            }
        }
    }

    private g() {
    }
}
