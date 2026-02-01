package androidx.core.util;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(@N T t3);

        @P
        T b();
    }

    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f13055a;

        /* renamed from: b, reason: collision with root package name */
        private int f13056b;

        public b(int i4) {
            if (i4 > 0) {
                this.f13055a = new Object[i4];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean c(@N T t3) {
            for (int i4 = 0; i4 < this.f13056b; i4++) {
                if (this.f13055a[i4] == t3) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.t.a
        public boolean a(@N T t3) {
            if (!c(t3)) {
                int i4 = this.f13056b;
                Object[] objArr = this.f13055a;
                if (i4 < objArr.length) {
                    objArr[i4] = t3;
                    this.f13056b = i4 + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        @Override // androidx.core.util.t.a
        public T b() {
            int i4 = this.f13056b;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            Object[] objArr = this.f13055a;
            T t3 = (T) objArr[i5];
            objArr[i5] = null;
            this.f13056b = i4 - 1;
            return t3;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        private final Object f13057c;

        public c(int i4) {
            super(i4);
            this.f13057c = new Object();
        }

        @Override // androidx.core.util.t.b, androidx.core.util.t.a
        public boolean a(@N T t3) {
            boolean a4;
            synchronized (this.f13057c) {
                a4 = super.a(t3);
            }
            return a4;
        }

        @Override // androidx.core.util.t.b, androidx.core.util.t.a
        public T b() {
            T t3;
            synchronized (this.f13057c) {
                t3 = (T) super.b();
            }
            return t3;
        }
    }

    private t() {
    }
}
