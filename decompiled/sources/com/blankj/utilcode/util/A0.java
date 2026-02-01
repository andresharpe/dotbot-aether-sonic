package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.provider.Settings;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Map<String, SimpleDateFormat>> f24691a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f24692b = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f24693c = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f24694d = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    /* loaded from: classes.dex */
    class a extends ThreadLocal<Map<String, SimpleDateFormat>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    }

    private A0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String A(Date date, int i4) {
        return w(date, K(), i4);
    }

    public static boolean A0(long j4) {
        return D0(O0(j4));
    }

    public static String B(long j4) {
        long currentTimeMillis = System.currentTimeMillis() - j4;
        if (currentTimeMillis < 0) {
            return String.format("%tc", Long.valueOf(j4));
        }
        if (currentTimeMillis < 1000) {
            return "刚刚";
        }
        if (currentTimeMillis < com.harman.jbl.partybox.ui.party.b.f44883c) {
            return String.format(Locale.getDefault(), "%d秒前", Long.valueOf(currentTimeMillis / 1000));
        }
        if (currentTimeMillis < 3600000) {
            return String.format(Locale.getDefault(), "%d分钟前", Long.valueOf(currentTimeMillis / com.harman.jbl.partybox.ui.party.b.f44883c));
        }
        long o02 = o0();
        if (j4 >= o02) {
            return String.format("今天%tR", Long.valueOf(j4));
        }
        if (j4 >= o02 - 86400000) {
            return String.format("昨天%tR", Long.valueOf(j4));
        }
        return String.format("%tF", Long.valueOf(j4));
    }

    public static boolean B0(String str) {
        return D0(W0(str, s()));
    }

    public static String C(String str) {
        return D(str, s());
    }

    public static boolean C0(String str, @androidx.annotation.N DateFormat dateFormat) {
        return D0(W0(str, dateFormat));
    }

    public static String D(String str, @androidx.annotation.N DateFormat dateFormat) {
        return B(Z0(str, dateFormat));
    }

    public static boolean D0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return z0(calendar.get(1));
    }

    public static String E(Date date) {
        return B(date.getTime());
    }

    public static boolean E0() {
        return !u0();
    }

    public static long F(long j4, long j5, int i4) {
        return j4 + a1(j5, i4);
    }

    public static boolean F0(long j4) {
        return !v0(j4);
    }

    public static long G(String str, long j4, int i4) {
        return H(str, s(), j4, i4);
    }

    public static boolean G0(String str) {
        return !w0(str);
    }

    public static long H(String str, @androidx.annotation.N DateFormat dateFormat, long j4, int i4) {
        return Z0(str, dateFormat) + a1(j4, i4);
    }

    public static boolean H0(String str, @androidx.annotation.N DateFormat dateFormat) {
        return !x0(str, dateFormat);
    }

    public static long I(Date date, long j4, int i4) {
        return a(date) + a1(j4, i4);
    }

    public static boolean I0(Date date) {
        return !y0(date);
    }

    public static long J(long j4, int i4) {
        return F(L(), j4, i4);
    }

    public static boolean J0(long j4) {
        long o02 = o0();
        if (j4 >= o02 && j4 < o02 + 86400000) {
            return true;
        }
        return false;
    }

    public static Date K() {
        return new Date();
    }

    public static boolean K0(String str) {
        return J0(Z0(str, s()));
    }

    public static long L() {
        return System.currentTimeMillis();
    }

    public static boolean L0(String str, @androidx.annotation.N DateFormat dateFormat) {
        return J0(Z0(str, dateFormat));
    }

    public static String M() {
        return S0(System.currentTimeMillis(), s());
    }

    public static boolean M0(Date date) {
        return J0(date.getTime());
    }

    public static String N(@androidx.annotation.N DateFormat dateFormat) {
        return S0(System.currentTimeMillis(), dateFormat);
    }

    public static boolean N0() {
        if (Settings.Global.getInt(E0.a().getContentResolver(), "auto_time", 0) != 1) {
            return false;
        }
        return true;
    }

    @SuppressLint({"SimpleDateFormat"})
    public static SimpleDateFormat O(String str) {
        Map<String, SimpleDateFormat> map = f24691a.get();
        SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat == null) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
        return simpleDateFormat;
    }

    public static Date O0(long j4) {
        return new Date(j4);
    }

    public static String P(long j4, long j5, int i4) {
        return Q(j4, s(), j5, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String P0(long j4, int i4) {
        if (i4 <= 0) {
            return null;
        }
        int min = Math.min(i4, 5);
        String[] strArr = {"天", "小时", "分钟", "秒", "毫秒"};
        if (j4 == 0) {
            return 0 + strArr[min - 1];
        }
        StringBuilder sb = new StringBuilder();
        if (j4 < 0) {
            sb.append("-");
            j4 = -j4;
        }
        int[] iArr = {r0.e.f57430e, r0.e.f57429d, 60000, 1000, 1};
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = iArr[i5];
            if (j4 >= i6) {
                long j5 = j4 / i6;
                j4 -= i6 * j5;
                sb.append(j5);
                sb.append(strArr[i5]);
            }
        }
        return sb.toString();
    }

    public static String Q(long j4, @androidx.annotation.N DateFormat dateFormat, long j5, int i4) {
        return S0(j4 + a1(j5, i4), dateFormat);
    }

    public static String Q0(long j4) {
        return S0(j4, s());
    }

    public static String R(String str, long j4, int i4) {
        return S(str, s(), j4, i4);
    }

    public static String R0(long j4, @androidx.annotation.N String str) {
        return S0(j4, O(str));
    }

    public static String S(String str, @androidx.annotation.N DateFormat dateFormat, long j4, int i4) {
        return S0(Z0(str, dateFormat) + a1(j4, i4), dateFormat);
    }

    public static String S0(long j4, @androidx.annotation.N DateFormat dateFormat) {
        return dateFormat.format(new Date(j4));
    }

    public static String T(Date date, long j4, int i4) {
        return U(date, s(), j4, i4);
    }

    private static long T0(long j4, int i4) {
        return j4 / i4;
    }

    public static String U(Date date, @androidx.annotation.N DateFormat dateFormat, long j4, int i4) {
        return S0(a(date) + a1(j4, i4), dateFormat);
    }

    public static Date U0(String str) {
        return W0(str, s());
    }

    public static String V(long j4, int i4) {
        return W(j4, s(), i4);
    }

    public static Date V0(String str, @androidx.annotation.N String str2) {
        return W0(str, O(str2));
    }

    public static String W(long j4, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return Q(L(), dateFormat, j4, i4);
    }

    public static Date W0(String str, @androidx.annotation.N DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static long X(long j4, long j5, int i4) {
        return T0(j4 - j5, i4);
    }

    public static long X0(String str) {
        return Z0(str, s());
    }

    public static long Y(String str, String str2, int i4) {
        return Z(str, str2, s(), i4);
    }

    public static long Y0(String str, @androidx.annotation.N String str2) {
        return Z0(str, O(str2));
    }

    public static long Z(String str, String str2, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return T0(Z0(str, dateFormat) - Z0(str2, dateFormat), i4);
    }

    public static long Z0(String str, @androidx.annotation.N DateFormat dateFormat) {
        try {
            return dateFormat.parse(str).getTime();
        } catch (ParseException e4) {
            e4.printStackTrace();
            return -1L;
        }
    }

    public static long a(Date date) {
        return date.getTime();
    }

    public static long a0(Date date, Date date2, int i4) {
        return T0(a(date) - a(date2), i4);
    }

    private static long a1(long j4, int i4) {
        return j4 * i4;
    }

    public static String b(Date date) {
        return d(date, s());
    }

    public static long b0(long j4, int i4) {
        return X(j4, System.currentTimeMillis(), i4);
    }

    public static String c(Date date, @androidx.annotation.N String str) {
        return O(str).format(date);
    }

    public static long c0(String str, int i4) {
        return Z(str, M(), s(), i4);
    }

    public static String d(Date date, @androidx.annotation.N DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static long d0(String str, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return Z(str, N(dateFormat), dateFormat, i4);
    }

    public static String e(long j4) {
        return h(new Date(j4));
    }

    public static long e0(Date date, int i4) {
        return a0(date, new Date(), i4);
    }

    public static String f(String str) {
        return h(W0(str, s()));
    }

    public static String f0(long j4) {
        return i0(new Date(j4));
    }

    public static String g(String str, @androidx.annotation.N DateFormat dateFormat) {
        return h(W0(str, dateFormat));
    }

    public static String g0(String str) {
        return i0(W0(str, s()));
    }

    public static String h(Date date) {
        return new SimpleDateFormat(androidx.exifinterface.media.a.U4, Locale.CHINA).format(date);
    }

    public static String h0(String str, @androidx.annotation.N DateFormat dateFormat) {
        return i0(W0(str, dateFormat));
    }

    public static String i(int i4) {
        return f24692b[i4 % 12];
    }

    public static String i0(Date date) {
        return new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public static String j(long j4) {
        return m(O0(j4));
    }

    public static int j0(int i4) {
        return Calendar.getInstance().get(i4);
    }

    public static String k(String str) {
        return m(W0(str, s()));
    }

    public static int k0(long j4, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        return calendar.get(i4);
    }

    public static String l(String str, @androidx.annotation.N DateFormat dateFormat) {
        return m(W0(str, dateFormat));
    }

    public static int l0(String str, int i4) {
        return n0(W0(str, s()), i4);
    }

    public static String m(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return f24692b[calendar.get(1) % 12];
    }

    public static int m0(String str, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return n0(W0(str, dateFormat), i4);
    }

    public static Date n(long j4, long j5, int i4) {
        return O0(j4 + a1(j5, i4));
    }

    public static int n0(Date date, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i4);
    }

    public static Date o(String str, long j4, int i4) {
        return p(str, s(), j4, i4);
    }

    private static long o0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Date p(String str, @androidx.annotation.N DateFormat dateFormat, long j4, int i4) {
        return O0(Z0(str, dateFormat) + a1(j4, i4));
    }

    public static String p0(int i4, int i5) {
        String[] strArr = f24694d;
        int i6 = i4 - 1;
        if (i5 < f24693c[i6]) {
            i6 = (i4 + 10) % 12;
        }
        return strArr[i6];
    }

    public static Date q(Date date, long j4, int i4) {
        return O0(a(date) + a1(j4, i4));
    }

    public static String q0(long j4) {
        return t0(O0(j4));
    }

    public static Date r(long j4, int i4) {
        return n(L(), j4, i4);
    }

    public static String r0(String str) {
        return t0(W0(str, s()));
    }

    private static SimpleDateFormat s() {
        return O("yyyy-MM-dd HH:mm:ss");
    }

    public static String s0(String str, @androidx.annotation.N DateFormat dateFormat) {
        return t0(W0(str, dateFormat));
    }

    public static String t(long j4, long j5, int i4) {
        return P0(j4 - j5, i4);
    }

    public static String t0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return p0(calendar.get(2) + 1, calendar.get(5));
    }

    public static String u(String str, String str2, int i4) {
        return P0(Z0(str, s()) - Z0(str2, s()), i4);
    }

    public static boolean u0() {
        if (Calendar.getInstance().get(9) == 0) {
            return true;
        }
        return false;
    }

    public static String v(String str, String str2, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return P0(Z0(str, dateFormat) - Z0(str2, dateFormat), i4);
    }

    public static boolean v0(long j4) {
        if (k0(j4, 9) == 0) {
            return true;
        }
        return false;
    }

    public static String w(Date date, Date date2, int i4) {
        return P0(a(date) - a(date2), i4);
    }

    public static boolean w0(String str) {
        if (m0(str, s(), 9) == 0) {
            return true;
        }
        return false;
    }

    public static String x(long j4, int i4) {
        return t(j4, System.currentTimeMillis(), i4);
    }

    public static boolean x0(String str, @androidx.annotation.N DateFormat dateFormat) {
        if (m0(str, dateFormat, 9) == 0) {
            return true;
        }
        return false;
    }

    public static String y(String str, int i4) {
        return v(str, M(), s(), i4);
    }

    public static boolean y0(Date date) {
        if (n0(date, 9) == 0) {
            return true;
        }
        return false;
    }

    public static String z(String str, @androidx.annotation.N DateFormat dateFormat, int i4) {
        return v(str, N(dateFormat), dateFormat, i4);
    }

    public static boolean z0(int i4) {
        if ((i4 % 4 == 0 && i4 % 100 != 0) || i4 % 400 == 0) {
            return true;
        }
        return false;
    }
}
