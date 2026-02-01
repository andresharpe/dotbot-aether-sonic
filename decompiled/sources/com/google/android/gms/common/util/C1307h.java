package com.google.android.gms.common.util;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@I0.a
/* renamed from: com.google.android.gms.common.util.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307h {
    private C1307h() {
    }

    @I0.a
    public static boolean a(@P Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @I0.a
    @N
    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @I0.a
    @N
    @Deprecated
    public static <T> List<T> c(@N T t3) {
        return Collections.singletonList(t3);
    }

    @I0.a
    @N
    @Deprecated
    public static <T> List<T> d(@N T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return c(tArr[0]);
        }
        return b();
    }

    @I0.a
    @N
    public static <K, V> Map<K, V> e(@N K k4, @N V v3, @N K k5, @N V v4, @N K k6, @N V v5) {
        Map k7 = k(3, false);
        k7.put(k4, v3);
        k7.put(k5, v4);
        k7.put(k6, v5);
        return Collections.unmodifiableMap(k7);
    }

    @I0.a
    @N
    public static <K, V> Map<K, V> f(@N K k4, @N V v3, @N K k5, @N V v4, @N K k6, @N V v5, @N K k7, @N V v6, @N K k8, @N V v7, @N K k9, @N V v8) {
        Map k10 = k(6, false);
        k10.put(k4, v3);
        k10.put(k5, v4);
        k10.put(k6, v5);
        k10.put(k7, v6);
        k10.put(k8, v7);
        k10.put(k9, v8);
        return Collections.unmodifiableMap(k10);
    }

    @I0.a
    @N
    public static <K, V> Map<K, V> g(@N K[] kArr, @N V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map k4 = k(length, false);
                    for (int i4 = 0; i4 < kArr.length; i4++) {
                        k4.put(kArr[i4], vArr[i4]);
                    }
                    return Collections.unmodifiableMap(k4);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
    }

    @I0.a
    @N
    public static <T> Set<T> h(int i4) {
        if (i4 == 0) {
            return new androidx.collection.c();
        }
        return l(i4, true);
    }

    @I0.a
    @N
    @Deprecated
    public static <T> Set<T> i(@N T t3, @N T t4, @N T t5) {
        Set l4 = l(3, false);
        l4.add(t3);
        l4.add(t4);
        l4.add(t5);
        return Collections.unmodifiableSet(l4);
    }

    @I0.a
    @N
    @Deprecated
    public static <T> Set<T> j(@N T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            Set l4 = l(length, false);
                            Collections.addAll(l4, tArr);
                            return Collections.unmodifiableSet(l4);
                        }
                        T t3 = tArr[0];
                        T t4 = tArr[1];
                        T t5 = tArr[2];
                        T t6 = tArr[3];
                        Set l5 = l(4, false);
                        l5.add(t3);
                        l5.add(t4);
                        l5.add(t5);
                        l5.add(t6);
                        return Collections.unmodifiableSet(l5);
                    }
                    return i(tArr[0], tArr[1], tArr[2]);
                }
                T t7 = tArr[0];
                T t8 = tArr[1];
                Set l6 = l(2, false);
                l6.add(t7);
                l6.add(t8);
                return Collections.unmodifiableSet(l6);
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    private static Map k(int i4, boolean z3) {
        if (i4 <= 256) {
            return new androidx.collection.a(i4);
        }
        return new HashMap(i4, 1.0f);
    }

    private static Set l(int i4, boolean z3) {
        float f4;
        int i5;
        if (true != z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.75f;
        }
        if (true != z3) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        if (i4 <= i5) {
            return new androidx.collection.c(i4);
        }
        return new HashSet(i4, f4);
    }
}
