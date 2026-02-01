package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f52877a = false;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final ThreadLocal<DecimalFormat>[] f52878b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i4 = 0; i4 < 4; i4++) {
            threadLocalArr[i4] = new ThreadLocal<>();
        }
        f52878b = threadLocalArr;
    }

    private static final DecimalFormat a(int i4) {
        DecimalFormat decimalFormat = new DecimalFormat(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
        if (i4 > 0) {
            decimalFormat.setMinimumFractionDigits(i4);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @l3.d
    public static final String b(double d4, int i4) {
        DecimalFormat a4;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f52878b;
        if (i4 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i4];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i4);
                threadLocal.set(decimalFormat);
            } else {
                F.m(decimalFormat);
            }
            a4 = decimalFormat;
        } else {
            a4 = a(i4);
        }
        String format = a4.format(d4);
        F.o(format, "format(...)");
        return format;
    }

    @l3.d
    public static final String c(double d4, int i4) {
        DecimalFormat a4 = a(0);
        a4.setMaximumFractionDigits(i4);
        String format = a4.format(d4);
        F.o(format, "format(...)");
        return format;
    }

    public static final boolean d() {
        return f52877a;
    }
}
