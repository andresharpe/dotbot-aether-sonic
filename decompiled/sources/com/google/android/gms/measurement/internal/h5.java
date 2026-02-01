package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1516v1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class h5 {

    /* renamed from: a, reason: collision with root package name */
    final String f30779a;

    /* renamed from: b, reason: collision with root package name */
    final int f30780b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f30781c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f30782d;

    /* renamed from: e, reason: collision with root package name */
    Long f30783e;

    /* renamed from: f, reason: collision with root package name */
    Long f30784f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h5(String str, int i4) {
        this.f30779a = str;
        this.f30780b = i4;
    }

    private static Boolean d(String str, int i4, boolean z3, String str2, List list, String str3, C1720t1 c1720t1) {
        int i5;
        if (i4 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z3 && i4 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i4 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z3) {
                    i5 = 66;
                } else {
                    i5 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i5).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c1720t1 != null) {
                        c1720t1.u().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @com.google.android.gms.common.util.D
    static Boolean e(BigDecimal bigDecimal, C1516v1 c1516v1, double d4) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C1285y.l(c1516v1);
        if (c1516v1.G()) {
            boolean z3 = true;
            if (c1516v1.L() != 1) {
                if (c1516v1.L() == 5) {
                    if (!c1516v1.K() || !c1516v1.J()) {
                        return null;
                    }
                } else if (!c1516v1.H()) {
                    return null;
                }
                int L3 = c1516v1.L();
                if (c1516v1.L() == 5) {
                    if (O4.L(c1516v1.E()) && O4.L(c1516v1.D())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c1516v1.E());
                            bigDecimal4 = new BigDecimal(c1516v1.D());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!O4.L(c1516v1.C())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c1516v1.C());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (L3 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i4 = L3 - 1;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d4 != com.google.firebase.remoteconfig.l.f37524n) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d4).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d4).multiply(new BigDecimal(2)))) >= 0) {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public static Boolean f(String str, com.google.android.gms.internal.measurement.C1 c12, C1720t1 c1720t1) {
        String D3;
        List list;
        String str2;
        C1285y.l(c12);
        if (str == null || !c12.I() || c12.J() == 1) {
            return null;
        }
        if (c12.J() == 7) {
            if (c12.A() == 0) {
                return null;
            }
        } else if (!c12.H()) {
            return null;
        }
        int J3 = c12.J();
        boolean F3 = c12.F();
        if (!F3 && J3 != 2 && J3 != 7) {
            D3 = c12.D().toUpperCase(Locale.ENGLISH);
        } else {
            D3 = c12.D();
        }
        String str3 = D3;
        if (c12.A() == 0) {
            list = null;
        } else {
            List E3 = c12.E();
            if (!F3) {
                ArrayList arrayList = new ArrayList(E3.size());
                Iterator it = E3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                E3 = Collections.unmodifiableList(arrayList);
            }
            list = E3;
        }
        if (J3 == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return d(str, J3, F3, str3, list, str2, c1720t1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(double d4, C1516v1 c1516v1) {
        try {
            return e(new BigDecimal(d4), c1516v1, Math.ulp(d4));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean h(long j4, C1516v1 c1516v1) {
        try {
            return e(new BigDecimal(j4), c1516v1, com.google.firebase.remoteconfig.l.f37524n);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean i(String str, C1516v1 c1516v1) {
        if (!O4.L(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), c1516v1, com.google.firebase.remoteconfig.l.f37524n);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public static Boolean j(Boolean bool, boolean z3) {
        boolean z4;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean c();
}
