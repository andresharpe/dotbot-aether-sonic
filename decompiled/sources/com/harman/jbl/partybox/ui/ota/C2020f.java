package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* renamed from: com.harman.jbl.partybox.ui.ota.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2020f implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44630a;

    @androidx.annotation.N
    public static C2020f b(@androidx.annotation.N a0 a0Var) {
        C2020f c2020f = new C2020f();
        if (a0Var.f("devicePid")) {
            String str = (String) a0Var.h("devicePid");
            if (str != null) {
                c2020f.f44630a.put("devicePid", str);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("devicePid", "");
        }
        if (a0Var.f("deviceMid")) {
            String str2 = (String) a0Var.h("deviceMid");
            if (str2 != null) {
                c2020f.f44630a.put("deviceMid", str2);
            } else {
                throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("deviceMid", "");
        }
        if (a0Var.f("otaFailKey")) {
            String str3 = (String) a0Var.h("otaFailKey");
            if (str3 != null) {
                c2020f.f44630a.put("otaFailKey", str3);
            } else {
                throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("otaFailKey", "");
        }
        if (a0Var.f("productNameKey")) {
            String str4 = (String) a0Var.h("productNameKey");
            if (str4 != null) {
                c2020f.f44630a.put("productNameKey", str4);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("productNameKey", "");
        }
        if (a0Var.f("serverFirmwareKey")) {
            String str5 = (String) a0Var.h("serverFirmwareKey");
            if (str5 != null) {
                c2020f.f44630a.put("serverFirmwareKey", str5);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("serverFirmwareKey", "");
        }
        if (a0Var.f("deviceFirmwareKey")) {
            String str6 = (String) a0Var.h("deviceFirmwareKey");
            if (str6 != null) {
                c2020f.f44630a.put("deviceFirmwareKey", str6);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("deviceFirmwareKey", "");
        }
        return c2020f;
    }

    @androidx.annotation.N
    public static C2020f fromBundle(@androidx.annotation.N Bundle bundle) {
        C2020f c2020f = new C2020f();
        bundle.setClassLoader(C2020f.class.getClassLoader());
        if (bundle.containsKey("devicePid")) {
            String string = bundle.getString("devicePid");
            if (string != null) {
                c2020f.f44630a.put("devicePid", string);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("devicePid", "");
        }
        if (bundle.containsKey("deviceMid")) {
            String string2 = bundle.getString("deviceMid");
            if (string2 != null) {
                c2020f.f44630a.put("deviceMid", string2);
            } else {
                throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("deviceMid", "");
        }
        if (bundle.containsKey("otaFailKey")) {
            String string3 = bundle.getString("otaFailKey");
            if (string3 != null) {
                c2020f.f44630a.put("otaFailKey", string3);
            } else {
                throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("otaFailKey", "");
        }
        if (bundle.containsKey("productNameKey")) {
            String string4 = bundle.getString("productNameKey");
            if (string4 != null) {
                c2020f.f44630a.put("productNameKey", string4);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("productNameKey", "");
        }
        if (bundle.containsKey("serverFirmwareKey")) {
            String string5 = bundle.getString("serverFirmwareKey");
            if (string5 != null) {
                c2020f.f44630a.put("serverFirmwareKey", string5);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("serverFirmwareKey", "");
        }
        if (bundle.containsKey("deviceFirmwareKey")) {
            String string6 = bundle.getString("deviceFirmwareKey");
            if (string6 != null) {
                c2020f.f44630a.put("deviceFirmwareKey", string6);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            c2020f.f44630a.put("deviceFirmwareKey", "");
        }
        return c2020f;
    }

    @androidx.annotation.N
    public String c() {
        return (String) this.f44630a.get("deviceFirmwareKey");
    }

    @androidx.annotation.N
    public String d() {
        return (String) this.f44630a.get("deviceMid");
    }

    @androidx.annotation.N
    public String e() {
        return (String) this.f44630a.get("devicePid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2020f c2020f = (C2020f) obj;
        if (this.f44630a.containsKey("devicePid") != c2020f.f44630a.containsKey("devicePid")) {
            return false;
        }
        if (e() == null ? c2020f.e() != null : !e().equals(c2020f.e())) {
            return false;
        }
        if (this.f44630a.containsKey("deviceMid") != c2020f.f44630a.containsKey("deviceMid")) {
            return false;
        }
        if (d() == null ? c2020f.d() != null : !d().equals(c2020f.d())) {
            return false;
        }
        if (this.f44630a.containsKey("otaFailKey") != c2020f.f44630a.containsKey("otaFailKey")) {
            return false;
        }
        if (f() == null ? c2020f.f() != null : !f().equals(c2020f.f())) {
            return false;
        }
        if (this.f44630a.containsKey("productNameKey") != c2020f.f44630a.containsKey("productNameKey")) {
            return false;
        }
        if (g() == null ? c2020f.g() != null : !g().equals(c2020f.g())) {
            return false;
        }
        if (this.f44630a.containsKey("serverFirmwareKey") != c2020f.f44630a.containsKey("serverFirmwareKey")) {
            return false;
        }
        if (h() == null ? c2020f.h() != null : !h().equals(c2020f.h())) {
            return false;
        }
        if (this.f44630a.containsKey("deviceFirmwareKey") != c2020f.f44630a.containsKey("deviceFirmwareKey")) {
            return false;
        }
        if (c() == null ? c2020f.c() == null : c().equals(c2020f.c())) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    public String f() {
        return (String) this.f44630a.get("otaFailKey");
    }

    @androidx.annotation.N
    public String g() {
        return (String) this.f44630a.get("productNameKey");
    }

    @androidx.annotation.N
    public String h() {
        return (String) this.f44630a.get("serverFirmwareKey");
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (e() != null) {
            i4 = e().hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i4 + 31) * 31;
        if (d() != null) {
            i5 = d().hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (f() != null) {
            i6 = f().hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        if (g() != null) {
            i7 = g().hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i12 + i7) * 31;
        if (h() != null) {
            i8 = h().hashCode();
        } else {
            i8 = 0;
        }
        int i14 = (i13 + i8) * 31;
        if (c() != null) {
            i9 = c().hashCode();
        }
        return i14 + i9;
    }

    @androidx.annotation.N
    public Bundle i() {
        Bundle bundle = new Bundle();
        if (this.f44630a.containsKey("devicePid")) {
            bundle.putString("devicePid", (String) this.f44630a.get("devicePid"));
        } else {
            bundle.putString("devicePid", "");
        }
        if (this.f44630a.containsKey("deviceMid")) {
            bundle.putString("deviceMid", (String) this.f44630a.get("deviceMid"));
        } else {
            bundle.putString("deviceMid", "");
        }
        if (this.f44630a.containsKey("otaFailKey")) {
            bundle.putString("otaFailKey", (String) this.f44630a.get("otaFailKey"));
        } else {
            bundle.putString("otaFailKey", "");
        }
        if (this.f44630a.containsKey("productNameKey")) {
            bundle.putString("productNameKey", (String) this.f44630a.get("productNameKey"));
        } else {
            bundle.putString("productNameKey", "");
        }
        if (this.f44630a.containsKey("serverFirmwareKey")) {
            bundle.putString("serverFirmwareKey", (String) this.f44630a.get("serverFirmwareKey"));
        } else {
            bundle.putString("serverFirmwareKey", "");
        }
        if (this.f44630a.containsKey("deviceFirmwareKey")) {
            bundle.putString("deviceFirmwareKey", (String) this.f44630a.get("deviceFirmwareKey"));
        } else {
            bundle.putString("deviceFirmwareKey", "");
        }
        return bundle;
    }

    @androidx.annotation.N
    public a0 j() {
        a0 a0Var = new a0();
        if (this.f44630a.containsKey("devicePid")) {
            a0Var.q("devicePid", (String) this.f44630a.get("devicePid"));
        } else {
            a0Var.q("devicePid", "");
        }
        if (this.f44630a.containsKey("deviceMid")) {
            a0Var.q("deviceMid", (String) this.f44630a.get("deviceMid"));
        } else {
            a0Var.q("deviceMid", "");
        }
        if (this.f44630a.containsKey("otaFailKey")) {
            a0Var.q("otaFailKey", (String) this.f44630a.get("otaFailKey"));
        } else {
            a0Var.q("otaFailKey", "");
        }
        if (this.f44630a.containsKey("productNameKey")) {
            a0Var.q("productNameKey", (String) this.f44630a.get("productNameKey"));
        } else {
            a0Var.q("productNameKey", "");
        }
        if (this.f44630a.containsKey("serverFirmwareKey")) {
            a0Var.q("serverFirmwareKey", (String) this.f44630a.get("serverFirmwareKey"));
        } else {
            a0Var.q("serverFirmwareKey", "");
        }
        if (this.f44630a.containsKey("deviceFirmwareKey")) {
            a0Var.q("deviceFirmwareKey", (String) this.f44630a.get("deviceFirmwareKey"));
        } else {
            a0Var.q("deviceFirmwareKey", "");
        }
        return a0Var;
    }

    public String toString() {
        return "DownloadUpgradeFailedFragmentArgs{devicePid=" + e() + ", deviceMid=" + d() + ", otaFailKey=" + f() + ", productNameKey=" + g() + ", serverFirmwareKey=" + h() + ", deviceFirmwareKey=" + c() + "}";
    }

    private C2020f() {
        this.f44630a = new HashMap();
    }

    /* renamed from: com.harman.jbl.partybox.ui.ota.f$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44631a;

        public a(@androidx.annotation.N C2020f c2020f) {
            HashMap hashMap = new HashMap();
            this.f44631a = hashMap;
            hashMap.putAll(c2020f.f44630a);
        }

        @androidx.annotation.N
        public C2020f a() {
            return new C2020f(this.f44631a);
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44631a.get("deviceFirmwareKey");
        }

        @androidx.annotation.N
        public String c() {
            return (String) this.f44631a.get("deviceMid");
        }

        @androidx.annotation.N
        public String d() {
            return (String) this.f44631a.get("devicePid");
        }

        @androidx.annotation.N
        public String e() {
            return (String) this.f44631a.get("otaFailKey");
        }

        @androidx.annotation.N
        public String f() {
            return (String) this.f44631a.get("productNameKey");
        }

        @androidx.annotation.N
        public String g() {
            return (String) this.f44631a.get("serverFirmwareKey");
        }

        @androidx.annotation.N
        public a h(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a i(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("deviceMid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a j(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a k(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("otaFailKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a l(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a m(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44631a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public a() {
            this.f44631a = new HashMap();
        }
    }

    private C2020f(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44630a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
