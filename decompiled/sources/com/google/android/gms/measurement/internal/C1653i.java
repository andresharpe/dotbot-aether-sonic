package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1653i {

    /* renamed from: b, reason: collision with root package name */
    public static final C1653i f30785b = new C1653i(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f30786a;

    public C1653i(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f30786a = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static C1653i a(Bundle bundle) {
        if (bundle == null) {
            return f30785b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            enumMap.put((EnumMap) zzahVar, (zzah) n(bundle.getString(zzahVar.zzd)));
        }
        return new C1653i(enumMap);
    }

    public static C1653i b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i4 = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i4 >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i4];
                int i5 = i4 + 2;
                if (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i4++;
            }
        }
        return new C1653i(enumMap);
    }

    public static String g(Bundle bundle) {
        String string;
        for (zzah zzahVar : zzah.values()) {
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i4, int i5) {
        return i4 <= i5;
    }

    static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    private static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final C1653i c(C1653i c1653i) {
        boolean z3;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f30786a.get(zzahVar);
            Boolean bool2 = (Boolean) c1653i.f30786a.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new C1653i(enumMap);
    }

    public final C1653i d(C1653i c1653i) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f30786a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) c1653i.f30786a.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new C1653i(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.f30786a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1653i)) {
            return false;
        }
        C1653i c1653i = (C1653i) obj;
        for (zzah zzahVar : zzah.values()) {
            if (m((Boolean) this.f30786a.get(zzahVar)) != m((Boolean) c1653i.f30786a.get(zzahVar))) {
                return false;
            }
        }
        return true;
    }

    public final Boolean f() {
        return (Boolean) this.f30786a.get(zzah.ANALYTICS_STORAGE);
    }

    public final String h() {
        char c4;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            Boolean bool = (Boolean) this.f30786a.get(zzahVarArr[i4]);
            if (bool == null) {
                c4 = '-';
            } else if (bool.booleanValue()) {
                c4 = '1';
            } else {
                c4 = '0';
            }
            sb.append(c4);
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f30786a.values().iterator();
        int i4 = 17;
        while (it.hasNext()) {
            i4 = (i4 * 31) + m((Boolean) it.next());
        }
        return i4;
    }

    public final boolean i(zzah zzahVar) {
        Boolean bool = (Boolean) this.f30786a.get(zzahVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean k(C1653i c1653i) {
        return l(c1653i, (zzah[]) this.f30786a.keySet().toArray(new zzah[0]));
    }

    public final boolean l(C1653i c1653i, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.f30786a.get(zzahVar);
            Boolean bool2 = (Boolean) c1653i.f30786a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i4 = 0; i4 < length; i4++) {
            zzah zzahVar = values[i4];
            if (i4 != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f30786a.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C1653i(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f30786a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
