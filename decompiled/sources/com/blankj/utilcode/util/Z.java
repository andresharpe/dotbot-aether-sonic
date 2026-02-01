package com.blankj.utilcode.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat> f24979a = new a();

    /* loaded from: classes.dex */
    class a extends ThreadLocal<DecimalFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return (DecimalFormat) NumberFormat.getInstance();
        }
    }

    private Z() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static double a(float f4) {
        return new BigDecimal(String.valueOf(f4)).doubleValue();
    }

    public static String b(double d4, int i4) {
        return f(d4, false, 1, i4, true);
    }

    public static String c(double d4, int i4, int i5, boolean z3) {
        return f(d4, false, i4, i5, z3);
    }

    public static String d(double d4, int i4, boolean z3) {
        return f(d4, false, 1, i4, z3);
    }

    public static String e(double d4, boolean z3, int i4) {
        return f(d4, z3, 1, i4, true);
    }

    public static String f(double d4, boolean z3, int i4, int i5, boolean z4) {
        RoundingMode roundingMode;
        DecimalFormat n4 = n();
        n4.setGroupingUsed(z3);
        if (z4) {
            roundingMode = RoundingMode.HALF_UP;
        } else {
            roundingMode = RoundingMode.DOWN;
        }
        n4.setRoundingMode(roundingMode);
        n4.setMinimumIntegerDigits(i4);
        n4.setMinimumFractionDigits(i5);
        n4.setMaximumFractionDigits(i5);
        return n4.format(d4);
    }

    public static String g(double d4, boolean z3, int i4, boolean z4) {
        return f(d4, z3, 1, i4, z4);
    }

    public static String h(float f4, int i4) {
        return l(f4, false, 1, i4, true);
    }

    public static String i(float f4, int i4, int i5, boolean z3) {
        return l(f4, false, i4, i5, z3);
    }

    public static String j(float f4, int i4, boolean z3) {
        return l(f4, false, 1, i4, z3);
    }

    public static String k(float f4, boolean z3, int i4) {
        return l(f4, z3, 1, i4, true);
    }

    public static String l(float f4, boolean z3, int i4, int i5, boolean z4) {
        return f(a(f4), z3, i4, i5, z4);
    }

    public static String m(float f4, boolean z3, int i4, boolean z4) {
        return l(f4, z3, 1, i4, z4);
    }

    public static DecimalFormat n() {
        return f24979a.get();
    }
}
