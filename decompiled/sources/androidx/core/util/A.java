package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface A<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean b(A a4, Object obj) {
        if (test(obj) && a4.test(obj)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"MissingNullability"})
    static <T> A<T> c(@SuppressLint({"MissingNullability"}) A<? super T> a4) {
        Objects.requireNonNull(a4);
        return a4.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean e(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean g(A a4, Object obj) {
        if (!test(obj) && !a4.test(obj)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingNullability"})
    static <T> A<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        if (obj == null) {
            return new A() { // from class: androidx.core.util.w
                @Override // androidx.core.util.A
                public final boolean test(Object obj2) {
                    boolean isNull;
                    isNull = Objects.isNull(obj2);
                    return isNull;
                }
            };
        }
        return new A() { // from class: androidx.core.util.x
            @Override // androidx.core.util.A
            public final boolean test(Object obj2) {
                boolean equals;
                equals = obj.equals(obj2);
                return equals;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default A<T> d(@SuppressLint({"MissingNullability"}) final A<? super T> a4) {
        Objects.requireNonNull(a4);
        return new A() { // from class: androidx.core.util.y
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean b4;
                b4 = A.this.b(a4, obj);
                return b4;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default A<T> h(@SuppressLint({"MissingNullability"}) final A<? super T> a4) {
        Objects.requireNonNull(a4);
        return new A() { // from class: androidx.core.util.v
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean g4;
                g4 = A.this.g(a4, obj);
                return g4;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default A<T> negate() {
        return new A() { // from class: androidx.core.util.z
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean e4;
                e4 = A.this.e(obj);
                return e4;
            }
        };
    }

    boolean test(T t3);
}
