package com.google.firebase.analytics.connector.internal;

import N0.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1301b;
import com.google.android.gms.measurement.internal.C1722t3;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.D2;
import com.google.android.gms.measurement.internal.F2;
import com.google.firebase.abt.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.messaging.C1821f;
import com.spotify.android.appremote.internal.l;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.W;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f34846a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.a.f34734g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b, reason: collision with root package name */
    private static final List f34847b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final List f34848c = Arrays.asList(W.f52989c, l.f48821i, "am");

    /* renamed from: d, reason: collision with root package name */
    private static final List f34849d = Arrays.asList("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final List f34850e = Arrays.asList((String[]) C1301b.a(F2.f30176a, F2.f30177b));

    /* renamed from: f, reason: collision with root package name */
    private static final List f34851f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f34823a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f34824b;
        if (str2 != null) {
            bundle.putString(a.C0015a.f1688b, str2);
        }
        Object obj = cVar.f34825c;
        if (obj != null) {
            C2.b(bundle, obj);
        }
        String str3 = cVar.f34826d;
        if (str3 != null) {
            bundle.putString(a.C0015a.f1690d, str3);
        }
        bundle.putLong(a.C0015a.f1691e, cVar.f34827e);
        String str4 = cVar.f34828f;
        if (str4 != null) {
            bundle.putString(a.C0015a.f1692f, str4);
        }
        Bundle bundle2 = cVar.f34829g;
        if (bundle2 != null) {
            bundle.putBundle(a.C0015a.f1693g, bundle2);
        }
        String str5 = cVar.f34830h;
        if (str5 != null) {
            bundle.putString(a.C0015a.f1694h, str5);
        }
        Bundle bundle3 = cVar.f34831i;
        if (bundle3 != null) {
            bundle.putBundle(a.C0015a.f1695i, bundle3);
        }
        bundle.putLong(a.C0015a.f1696j, cVar.f34832j);
        String str6 = cVar.f34833k;
        if (str6 != null) {
            bundle.putString(a.C0015a.f1697k, str6);
        }
        Bundle bundle4 = cVar.f34834l;
        if (bundle4 != null) {
            bundle.putBundle(a.C0015a.f1698l, bundle4);
        }
        bundle.putLong(a.C0015a.f1699m, cVar.f34835m);
        bundle.putBoolean(a.C0015a.f1700n, cVar.f34836n);
        bundle.putLong(a.C0015a.f1701o, cVar.f34837o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        C1285y.l(bundle);
        a.c cVar = new a.c();
        cVar.f34823a = (String) C1285y.l((String) C2.a(bundle, "origin", String.class, null));
        cVar.f34824b = (String) C1285y.l((String) C2.a(bundle, a.C0015a.f1688b, String.class, null));
        cVar.f34825c = C2.a(bundle, "value", Object.class, null);
        cVar.f34826d = (String) C2.a(bundle, a.C0015a.f1690d, String.class, null);
        cVar.f34827e = ((Long) C2.a(bundle, a.C0015a.f1691e, Long.class, 0L)).longValue();
        cVar.f34828f = (String) C2.a(bundle, a.C0015a.f1692f, String.class, null);
        cVar.f34829g = (Bundle) C2.a(bundle, a.C0015a.f1693g, Bundle.class, null);
        cVar.f34830h = (String) C2.a(bundle, a.C0015a.f1694h, String.class, null);
        cVar.f34831i = (Bundle) C2.a(bundle, a.C0015a.f1695i, Bundle.class, null);
        cVar.f34832j = ((Long) C2.a(bundle, a.C0015a.f1696j, Long.class, 0L)).longValue();
        cVar.f34833k = (String) C2.a(bundle, a.C0015a.f1697k, String.class, null);
        cVar.f34834l = (Bundle) C2.a(bundle, a.C0015a.f1698l, Bundle.class, null);
        cVar.f34836n = ((Boolean) C2.a(bundle, a.C0015a.f1700n, Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f34835m = ((Long) C2.a(bundle, a.C0015a.f1699m, Long.class, 0L)).longValue();
        cVar.f34837o = ((Long) C2.a(bundle, a.C0015a.f1701o, Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a4 = D2.a(str);
        if (a4 != null) {
            return a4;
        }
        return str;
    }

    public static String d(String str) {
        String b4 = D2.b(str);
        if (b4 != null) {
            return b4;
        }
        return str;
    }

    public static void e(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean f(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean g(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        char c4;
        if (!C1821f.C0339f.f36999l.equals(str2)) {
            return true;
        }
        if (!l(str) || bundle == null) {
            return false;
        }
        Iterator it = f34849d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c4 = 2;
                }
                c4 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c4 = 1;
                }
                c4 = 65535;
            }
        } else {
            if (str.equals("fcm")) {
                c4 = 0;
            }
            c4 = 65535;
        }
        if (c4 != 0) {
            if (c4 != 1) {
                if (c4 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean i(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f34823a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f34825c;
        if ((obj != null && C1722t3.a(obj) == null) || !l(str) || !m(str, cVar.f34824b)) {
            return false;
        }
        String str2 = cVar.f34833k;
        if (str2 != null && (!j(str2, cVar.f34834l) || !h(str, cVar.f34833k, cVar.f34834l))) {
            return false;
        }
        String str3 = cVar.f34830h;
        if (str3 != null && (!j(str3, cVar.f34831i) || !h(str, cVar.f34830h, cVar.f34831i))) {
            return false;
        }
        String str4 = cVar.f34828f;
        if (str4 != null) {
            if (!j(str4, cVar.f34829g) || !h(str, cVar.f34828f, cVar.f34829g)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean j(String str, Bundle bundle) {
        if (f34847b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            Iterator it = f34849d.iterator();
            while (it.hasNext()) {
                if (bundle.containsKey((String) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean k(String str) {
        if (!f34846a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        if (!f34848c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean m(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if (C1821f.C0339f.f37004q.equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f34850e.contains(str2)) {
                return false;
            }
            Iterator it = f34851f.iterator();
            while (it.hasNext()) {
                if (str2.matches((String) it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals("fcm") || str.equals(c.a.f34506J)) {
            return true;
        }
        return false;
    }
}
