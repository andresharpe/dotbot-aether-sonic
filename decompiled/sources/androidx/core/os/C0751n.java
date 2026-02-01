package androidx.core.os;

import androidx.annotation.InterfaceC0577u;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0751n implements InterfaceC0752o {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f12746c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f12747d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f12748e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f12749f = C0750m.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f12750a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final String f12751b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(21)
    /* renamed from: androidx.core.os.n$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    C0751n(@androidx.annotation.N Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f12750a = f12746c;
            this.f12751b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < localeArr.length; i4++) {
            Locale locale = localeArr[i4];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    k(sb, locale2);
                    if (i4 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i4 + "] is null");
            }
        }
        this.f12750a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f12751b = sb.toString();
    }

    private Locale e(Collection<String> collection, boolean z3) {
        int f4 = f(collection, z3);
        if (f4 == -1) {
            return null;
        }
        return this.f12750a[f4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r6 < Integer.MAX_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f12750a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.C0751n.f12749f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.C0750m.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.C0751n.f(java.util.Collection, boolean):int");
    }

    private int g(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f12750a;
            if (i4 < localeArr.length) {
                if (j(locale, localeArr[i4]) > 0) {
                    return i4;
                }
                i4++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    private static String h(Locale locale) {
        String a4 = a.a(locale);
        if (!a4.isEmpty()) {
            return a4;
        }
        return "";
    }

    private static boolean i(Locale locale) {
        if (!f12747d.equals(locale) && !f12748e.equals(locale)) {
            return false;
        }
        return true;
    }

    @androidx.annotation.F(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h4 = h(locale);
        if (!h4.isEmpty()) {
            return h4.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @i0
    static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @Override // androidx.core.os.InterfaceC0752o
    public int a(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f12750a;
            if (i4 < localeArr.length) {
                if (localeArr[i4].equals(locale)) {
                    return i4;
                }
                i4++;
            } else {
                return -1;
            }
        }
    }

    @Override // androidx.core.os.InterfaceC0752o
    public String b() {
        return this.f12751b;
    }

    @Override // androidx.core.os.InterfaceC0752o
    @P
    public Object c() {
        return null;
    }

    @Override // androidx.core.os.InterfaceC0752o
    public Locale d(@androidx.annotation.N String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0751n)) {
            return false;
        }
        Locale[] localeArr = ((C0751n) obj).f12750a;
        if (this.f12750a.length != localeArr.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            Locale[] localeArr2 = this.f12750a;
            if (i4 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    @Override // androidx.core.os.InterfaceC0752o
    public Locale get(int i4) {
        if (i4 >= 0) {
            Locale[] localeArr = this.f12750a;
            if (i4 < localeArr.length) {
                return localeArr[i4];
            }
        }
        return null;
    }

    public int hashCode() {
        int i4 = 1;
        for (Locale locale : this.f12750a) {
            i4 = (i4 * 31) + locale.hashCode();
        }
        return i4;
    }

    @Override // androidx.core.os.InterfaceC0752o
    public boolean isEmpty() {
        if (this.f12750a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.os.InterfaceC0752o
    public int size() {
        return this.f12750a.length;
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f12750a;
            if (i4 < localeArr.length) {
                sb.append(localeArr[i4]);
                if (i4 < this.f12750a.length - 1) {
                    sb.append(',');
                }
                i4++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
