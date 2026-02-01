package com.google.android.gms.measurement.internal;

import N0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1307h;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes2.dex */
public final class U4 extends A2 {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f30433g = {"firebase_", "google_", "ga_"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f30434h = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f30435c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f30436d;

    /* renamed from: e, reason: collision with root package name */
    private int f30437e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f30438f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U4(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30438f = null;
        this.f30436d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean U(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean V(String str) {
        C1285y.h(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean W(Context context) {
        ActivityInfo receiverInfo;
        C1285y.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean X(Context context, boolean z3) {
        C1285y.l(context);
        return g0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean Y(String str) {
        if (f30434h[0].equals(str)) {
            return false;
        }
        return true;
    }

    static final boolean b0(Bundle bundle, int i4) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i4);
            return true;
        }
        return false;
    }

    @com.google.android.gms.common.util.D
    static final boolean c0(String str) {
        C1285y.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int d0(String str) {
        if ("_ldl".equals(str)) {
            this.f31060a.x();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f31060a.x();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f31060a.x();
            return 100;
        }
        this.f31060a.x();
        return 36;
    }

    private final Object e0(int i4, Object obj, boolean z3, boolean z4) {
        long j4;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j4 = 0;
                } else {
                    j4 = 1;
                }
                return Long.valueOf(j4);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (!z4 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle s02 = s0((Bundle) parcelable);
                        if (!s02.isEmpty()) {
                            arrayList.add(s02);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return p(obj.toString(), i4, z3);
        }
        return obj;
    }

    private static boolean f0(String str, String[] strArr) {
        C1285y.l(strArr);
        for (String str2 : strArr) {
            if (S4.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean g0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public static long o0(byte[] bArr) {
        boolean z3;
        C1285y.l(bArr);
        int length = bArr.length;
        int i4 = 0;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.r(z3);
        long j4 = 0;
        for (int i5 = length - 1; i5 >= 0 && i5 >= bArr.length - 8; i5--) {
            j4 += (bArr[i5] & 255) << i4;
            i4 += 8;
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest r() {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList t(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1623d c1623d = (C1623d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1623d.f30573E);
            bundle.putString("origin", c1623d.f30574F);
            bundle.putLong(a.C0015a.f1699m, c1623d.f30576H);
            bundle.putString(a.C0015a.f1688b, c1623d.f30575G.f30366F);
            C2.b(bundle, C1285y.l(c1623d.f30575G.c0()));
            bundle.putBoolean(a.C0015a.f1700n, c1623d.f30577I);
            String str = c1623d.f30578J;
            if (str != null) {
                bundle.putString(a.C0015a.f1690d, str);
            }
            C1736w c1736w = c1623d.f30579K;
            if (c1736w != null) {
                bundle.putString(a.C0015a.f1692f, c1736w.f31012E);
                C1724u c1724u = c1736w.f31013F;
                if (c1724u != null) {
                    bundle.putBundle(a.C0015a.f1693g, c1724u.i0());
                }
            }
            bundle.putLong(a.C0015a.f1691e, c1623d.f30580L);
            C1736w c1736w2 = c1623d.f30581M;
            if (c1736w2 != null) {
                bundle.putString(a.C0015a.f1694h, c1736w2.f31012E);
                C1724u c1724u2 = c1736w2.f31013F;
                if (c1724u2 != null) {
                    bundle.putBundle(a.C0015a.f1695i, c1724u2.i0());
                }
            }
            bundle.putLong(a.C0015a.f1701o, c1623d.f30575G.f30367G);
            bundle.putLong(a.C0015a.f1696j, c1623d.f30582N);
            C1736w c1736w3 = c1623d.f30583O;
            if (c1736w3 != null) {
                bundle.putString(a.C0015a.f1697k, c1736w3.f31012E);
                C1724u c1724u3 = c1736w3.f31013F;
                if (c1724u3 != null) {
                    bundle.putBundle(a.C0015a.f1698l, c1724u3.i0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @androidx.annotation.j0
    public static void w(C1728u3 c1728u3, Bundle bundle, boolean z3) {
        if (bundle != null && c1728u3 != null) {
            if (bundle.containsKey("_sc") && !z3) {
                z3 = false;
            } else {
                String str = c1728u3.f30997a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c1728u3.f30998b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c1728u3.f30999c);
                return;
            }
        }
        if (bundle != null && c1728u3 == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            this.f31060a.b().v().c("Not putting event parameter. Invalid value type. name, type", this.f31060a.B().e(str), str2);
        }
    }

    public final void B(InterfaceC1420j0 interfaceC1420j0, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning boolean value to wrapper", e4);
        }
    }

    public final void C(InterfaceC1420j0 interfaceC1420j0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning bundle list to wrapper", e4);
        }
    }

    public final void D(InterfaceC1420j0 interfaceC1420j0, Bundle bundle) {
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning bundle value to wrapper", e4);
        }
    }

    public final void E(InterfaceC1420j0 interfaceC1420j0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning byte array to wrapper", e4);
        }
    }

    public final void F(InterfaceC1420j0 interfaceC1420j0, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i4);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning int value to wrapper", e4);
        }
    }

    public final void G(InterfaceC1420j0 interfaceC1420j0, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j4);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning long value to wrapper", e4);
        }
    }

    public final void H(InterfaceC1420j0 interfaceC1420j0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f31060a.b().u().b("Error returning string value to wrapper", e4);
        }
    }

    final void I(String str, String str2, String str3, Bundle bundle, List list, boolean z3) {
        int i4;
        int i5;
        String str4;
        String str5;
        int M3;
        if (bundle == null) {
            return;
        }
        this.f31060a.x();
        int i6 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str6)) {
                i5 = 0;
            } else {
                if (!z3) {
                    i4 = k0(str6);
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    i4 = j0(str6);
                }
                i5 = i4;
            }
            if (i5 != 0) {
                if (i5 == 3) {
                    str4 = str6;
                } else {
                    str4 = null;
                }
                v(bundle, i5, str6, str6, str4);
                bundle.remove(str6);
            } else {
                if (S(bundle.get(str6))) {
                    this.f31060a.b().v().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    M3 = 22;
                    str5 = str6;
                } else {
                    str5 = str6;
                    M3 = M(str, str2, str6, bundle.get(str6), bundle, list, z3, false);
                }
                if (M3 != 0 && !"_ev".equals(str5)) {
                    v(bundle, M3, str5, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (V(str5) && !f0(str5, E2.f30166d) && (i6 = i6 + 1) > 0) {
                    this.f31060a.b().q().c("Item cannot contain custom parameters", this.f31060a.B().d(str2), this.f31060a.B().b(bundle));
                    b0(bundle, 23);
                    bundle.remove(str5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!c0(str)) {
                if (this.f31060a.o()) {
                    this.f31060a.b().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1720t1.x(str));
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!c0(str2)) {
                this.f31060a.b().q().b("Invalid admob_app_id. Analytics disabled.", C1720t1.x(str2));
                return false;
            }
            return true;
        }
        if (this.f31060a.o()) {
            this.f31060a.b().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str, int i4, String str2) {
        if (str2 == null) {
            this.f31060a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i4) {
            this.f31060a.b().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i4), str2);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f31060a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        C1285y.l(str2);
        String[] strArr3 = f30433g;
        for (int i4 = 0; i4 < 3; i4++) {
            if (str2.startsWith(strArr3[i4])) {
                this.f31060a.b().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && f0(str2, strArr)) {
            if (strArr2 == null || !f0(str2, strArr2)) {
                this.f31060a.b().q().c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int M(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.U4.M(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, String str2, int i4, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i4) {
                this.f31060a.b().v().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(String str, String str2) {
        if (str2 == null) {
            this.f31060a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f31060a.b().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                this.f31060a.b().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f31060a.b().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(String str, String str2) {
        if (str2 == null) {
            this.f31060a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f31060a.b().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f31060a.b().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f31060a.b().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean Q(String str) {
        f();
        if (com.google.android.gms.common.wrappers.e.a(this.f31060a.d()).a(str) == 0) {
            return true;
        }
        this.f31060a.b().o().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s4 = this.f31060a.x().s();
        this.f31060a.zzaw();
        return s4.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final boolean T(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f4 = com.google.android.gms.common.wrappers.e.a(context).f(str, 64);
            if (f4 != null && (signatureArr = f4.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            this.f31060a.b().p().b("Package name not found", e4);
            return true;
        } catch (CertificateException e5) {
            this.f31060a.b().p().b("Error obtaining certificate", e5);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C1285y.l(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        }
        if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.A2
    @androidx.annotation.j0
    protected final void g() {
        f();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f31060a.b().u().a("Utils falling back to Random for random id");
            }
        }
        this.f30436d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.A2
    protected final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h0(String str, Object obj) {
        boolean N3;
        if ("_ldl".equals(str)) {
            N3 = N("user property referrer", str, d0(str), obj);
        } else {
            N3 = N("user property", str, d0(str), obj);
        }
        if (N3) {
            return 0;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i0(String str) {
        if (!O("event", str)) {
            return 2;
        }
        if (!L("event", D2.f30145a, D2.f30146b, str)) {
            return 13;
        }
        this.f31060a.x();
        if (!K("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    final int j0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!L("event param", null, null, str)) {
            return 14;
        }
        this.f31060a.x();
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    final int k0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!L("event param", null, null, str)) {
            return 14;
        }
        this.f31060a.x();
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l0(String str) {
        if (!O("user property", str)) {
            return 6;
        }
        if (!L("user property", F2.f30176a, null, str)) {
            return 15;
        }
        this.f31060a.x();
        if (!K("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object m(String str, Object obj) {
        int i4 = 256;
        if ("_ev".equals(str)) {
            this.f31060a.x();
            return e0(256, obj, true, true);
        }
        if (U(str)) {
            this.f31060a.x();
        } else {
            this.f31060a.x();
            i4 = 100;
        }
        return e0(i4, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int m0() {
        if (this.f30438f == null) {
            this.f30438f = Integer.valueOf(C1237i.i().b(this.f31060a.d()) / 1000);
        }
        return this.f30438f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object n(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return e0(d0(str), obj, true, false);
        }
        return e0(d0(str), obj, false, false);
    }

    public final int n0(int i4) {
        return C1237i.i().k(this.f31060a.d(), C1290k.f28840a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String o() {
        byte[] bArr = new byte[16];
        s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String p(String str, int i4, boolean z3) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i4) {
            if (!z3) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i4))).concat("...");
        }
        return str;
    }

    public final long p0() {
        long andIncrement;
        long j4;
        if (this.f30436d.get() == 0) {
            synchronized (this.f30436d) {
                long nextLong = new Random(System.nanoTime() ^ this.f31060a.zzav().a()).nextLong();
                int i4 = this.f30437e + 1;
                this.f30437e = i4;
                j4 = nextLong + i4;
            }
            return j4;
        }
        synchronized (this.f30436d) {
            this.f30436d.compareAndSet(-1L, 1L);
            andIncrement = this.f30436d.getAndIncrement();
        }
        return andIncrement;
    }

    public final URL q(long j4, String str, String str2, long j5) {
        try {
            C1285y.h(str2);
            C1285y.h(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 73000L, Integer.valueOf(m0())), str2, str, Long.valueOf(j5));
            if (str.equals(this.f31060a.x().t())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException e4) {
            e = e4;
            this.f31060a.b().p().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e5) {
            e = e5;
            this.f31060a.b().p().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long q0(long j4, long j5) {
        return (j4 + (j5 * com.harman.jbl.partybox.ui.party.b.f44883c)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle r0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.b.f34768O, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.b.f34769P, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.b.f34770Q);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.b.f34770Q, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.b.f34771R);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.b.f34771R, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e4) {
                this.f31060a.b().u().b("Install referrer url isn't a hierarchical URI", e4);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom s() {
        f();
        if (this.f30435c == null) {
            this.f30435c = new SecureRandom();
        }
        return this.f30435c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle s0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m4 = m(str, bundle.get(str));
                if (m4 == null) {
                    this.f31060a.b().v().b("Param value can't be null", this.f31060a.B().e(str));
                } else {
                    A(bundle2, str, m4);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle t0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.U4.t0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void u(Bundle bundle, long j4) {
        long j5 = bundle.getLong("_et");
        if (j5 != 0) {
            this.f31060a.b().u().b("Params already contained engagement", Long.valueOf(j5));
        } else {
            j5 = 0;
        }
        bundle.putLong("_et", j4 + j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1736w u0(String str, String str2, Bundle bundle, String str3, long j4, boolean z3, boolean z4) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle t02 = t0(str, str2, bundle3, C1307h.c("_o"), true);
            if (z3) {
                t02 = s0(t02);
            }
            C1285y.l(t02);
            return new C1736w(str2, new C1724u(t02), str3, j4);
        }
        this.f31060a.b().p().b("Invalid conditional property event name", this.f31060a.B().f(str2));
        throw new IllegalArgumentException();
    }

    final void v(Bundle bundle, int i4, String str, String str2, Object obj) {
        if (b0(bundle, i4)) {
            this.f31060a.x();
            bundle.putString("_ev", p(str, 40, true));
            if (obj != null) {
                C1285y.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f31060a.L().A(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(C1726u1 c1726u1, int i4) {
        int i5 = 0;
        for (String str : new TreeSet(c1726u1.f30993d.keySet())) {
            if (V(str) && (i5 = i5 + 1) > i4) {
                this.f31060a.b().q().c("Event can't contain more than " + i4 + " params", this.f31060a.B().d(c1726u1.f30990a), this.f31060a.B().b(c1726u1.f30993d));
                b0(c1726u1.f30993d, 5);
                c1726u1.f30993d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(T4 t4, String str, int i4, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        b0(bundle, i4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong("_el", i5);
        }
        t4.a(str, "_err", bundle);
    }
}
