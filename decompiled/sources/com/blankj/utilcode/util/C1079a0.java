package com.blankj.utilcode.util;

import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079a0 {
    private C1079a0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean A(Map map) {
        return !p(map);
    }

    public static <T> T B(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T C(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static void D(Object... objArr) {
        objArr.getClass();
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static String E(Object obj) {
        return String.valueOf(obj);
    }

    public static String F(Object obj, String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static <T> int a(T t3, T t4, @androidx.annotation.N Comparator<? super T> comparator) {
        if (t3 == t4) {
            return 0;
        }
        return comparator.compare(t3, t4);
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <T> T c(T t3, T t4) {
        return t3 == null ? t4 : t3;
    }

    public static int d(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int e(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @androidx.annotation.W(api = 16)
    public static boolean f(LongSparseArray longSparseArray) {
        if (longSparseArray != null && longSparseArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean g(SparseArray sparseArray) {
        if (sparseArray != null && sparseArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean h(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray != null && sparseBooleanArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean i(SparseIntArray sparseIntArray) {
        if (sparseIntArray != null && sparseIntArray.size() != 0) {
            return false;
        }
        return true;
    }

    @androidx.annotation.W(api = 18)
    public static boolean j(SparseLongArray sparseLongArray) {
        if (sparseLongArray != null && sparseLongArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean k(androidx.collection.h hVar) {
        if (hVar != null && hVar.A() != 0) {
            return false;
        }
        return true;
    }

    public static boolean l(androidx.collection.l lVar) {
        if (lVar != null && !lVar.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean m(CharSequence charSequence) {
        if (charSequence != null && charSequence.toString().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
            return true;
        }
        if ((obj instanceof CharSequence) && obj.toString().length() == 0) {
            return true;
        }
        if ((obj instanceof Collection) && ((Collection) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof androidx.collection.l) && ((androidx.collection.l) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof SparseArray) && ((SparseArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseBooleanArray) && ((SparseBooleanArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseIntArray) && ((SparseIntArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseLongArray) && ((SparseLongArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof androidx.collection.h) && ((androidx.collection.h) obj).A() == 0) {
            return true;
        }
        if ((obj instanceof LongSparseArray) && ((LongSparseArray) obj).size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean o(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean p(Map map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    @androidx.annotation.W(api = 16)
    public static boolean q(LongSparseArray longSparseArray) {
        return !f(longSparseArray);
    }

    public static boolean r(SparseArray sparseArray) {
        return !g(sparseArray);
    }

    public static boolean s(SparseBooleanArray sparseBooleanArray) {
        return !h(sparseBooleanArray);
    }

    public static boolean t(SparseIntArray sparseIntArray) {
        return !i(sparseIntArray);
    }

    @androidx.annotation.W(api = 18)
    public static boolean u(SparseLongArray sparseLongArray) {
        return !j(sparseLongArray);
    }

    public static boolean v(androidx.collection.h hVar) {
        return !k(hVar);
    }

    public static boolean w(androidx.collection.l lVar) {
        return !l(lVar);
    }

    public static boolean x(CharSequence charSequence) {
        return !m(charSequence);
    }

    public static boolean y(Object obj) {
        return !n(obj);
    }

    public static boolean z(Collection collection) {
        return !o(collection);
    }
}
