package com.harman.jbl.partybox.ui.micota;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class s implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44314a;

    @N
    public static s b(@N a0 a0Var) {
        s sVar = new s();
        if (a0Var.f("devicePid")) {
            String str = (String) a0Var.h("devicePid");
            if (str != null) {
                sVar.f44314a.put("devicePid", str);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("devicePid", "");
        }
        if (a0Var.f("otaFailKey")) {
            String str2 = (String) a0Var.h("otaFailKey");
            if (str2 != null) {
                sVar.f44314a.put("otaFailKey", str2);
            } else {
                throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("otaFailKey", "");
        }
        if (a0Var.f("productNameKey")) {
            String str3 = (String) a0Var.h("productNameKey");
            if (str3 != null) {
                sVar.f44314a.put("productNameKey", str3);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("productNameKey", "");
        }
        if (a0Var.f("serverFirmwareKey")) {
            String str4 = (String) a0Var.h("serverFirmwareKey");
            if (str4 != null) {
                sVar.f44314a.put("serverFirmwareKey", str4);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("serverFirmwareKey", "");
        }
        if (a0Var.f("deviceFirmwareKey")) {
            String str5 = (String) a0Var.h("deviceFirmwareKey");
            if (str5 != null) {
                sVar.f44314a.put("deviceFirmwareKey", str5);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("deviceFirmwareKey", "");
        }
        return sVar;
    }

    @N
    public static s fromBundle(@N Bundle bundle) {
        s sVar = new s();
        bundle.setClassLoader(s.class.getClassLoader());
        if (bundle.containsKey("devicePid")) {
            String string = bundle.getString("devicePid");
            if (string != null) {
                sVar.f44314a.put("devicePid", string);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("devicePid", "");
        }
        if (bundle.containsKey("otaFailKey")) {
            String string2 = bundle.getString("otaFailKey");
            if (string2 != null) {
                sVar.f44314a.put("otaFailKey", string2);
            } else {
                throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("otaFailKey", "");
        }
        if (bundle.containsKey("productNameKey")) {
            String string3 = bundle.getString("productNameKey");
            if (string3 != null) {
                sVar.f44314a.put("productNameKey", string3);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("productNameKey", "");
        }
        if (bundle.containsKey("serverFirmwareKey")) {
            String string4 = bundle.getString("serverFirmwareKey");
            if (string4 != null) {
                sVar.f44314a.put("serverFirmwareKey", string4);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("serverFirmwareKey", "");
        }
        if (bundle.containsKey("deviceFirmwareKey")) {
            String string5 = bundle.getString("deviceFirmwareKey");
            if (string5 != null) {
                sVar.f44314a.put("deviceFirmwareKey", string5);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            sVar.f44314a.put("deviceFirmwareKey", "");
        }
        return sVar;
    }

    @N
    public String c() {
        return (String) this.f44314a.get("deviceFirmwareKey");
    }

    @N
    public String d() {
        return (String) this.f44314a.get("devicePid");
    }

    @N
    public String e() {
        return (String) this.f44314a.get("otaFailKey");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f44314a.containsKey("devicePid") != sVar.f44314a.containsKey("devicePid")) {
            return false;
        }
        if (d() == null ? sVar.d() != null : !d().equals(sVar.d())) {
            return false;
        }
        if (this.f44314a.containsKey("otaFailKey") != sVar.f44314a.containsKey("otaFailKey")) {
            return false;
        }
        if (e() == null ? sVar.e() != null : !e().equals(sVar.e())) {
            return false;
        }
        if (this.f44314a.containsKey("productNameKey") != sVar.f44314a.containsKey("productNameKey")) {
            return false;
        }
        if (f() == null ? sVar.f() != null : !f().equals(sVar.f())) {
            return false;
        }
        if (this.f44314a.containsKey("serverFirmwareKey") != sVar.f44314a.containsKey("serverFirmwareKey")) {
            return false;
        }
        if (g() == null ? sVar.g() != null : !g().equals(sVar.g())) {
            return false;
        }
        if (this.f44314a.containsKey("deviceFirmwareKey") != sVar.f44314a.containsKey("deviceFirmwareKey")) {
            return false;
        }
        if (c() == null ? sVar.c() == null : c().equals(sVar.c())) {
            return true;
        }
        return false;
    }

    @N
    public String f() {
        return (String) this.f44314a.get("productNameKey");
    }

    @N
    public String g() {
        return (String) this.f44314a.get("serverFirmwareKey");
    }

    @N
    public Bundle h() {
        Bundle bundle = new Bundle();
        if (this.f44314a.containsKey("devicePid")) {
            bundle.putString("devicePid", (String) this.f44314a.get("devicePid"));
        } else {
            bundle.putString("devicePid", "");
        }
        if (this.f44314a.containsKey("otaFailKey")) {
            bundle.putString("otaFailKey", (String) this.f44314a.get("otaFailKey"));
        } else {
            bundle.putString("otaFailKey", "");
        }
        if (this.f44314a.containsKey("productNameKey")) {
            bundle.putString("productNameKey", (String) this.f44314a.get("productNameKey"));
        } else {
            bundle.putString("productNameKey", "");
        }
        if (this.f44314a.containsKey("serverFirmwareKey")) {
            bundle.putString("serverFirmwareKey", (String) this.f44314a.get("serverFirmwareKey"));
        } else {
            bundle.putString("serverFirmwareKey", "");
        }
        if (this.f44314a.containsKey("deviceFirmwareKey")) {
            bundle.putString("deviceFirmwareKey", (String) this.f44314a.get("deviceFirmwareKey"));
        } else {
            bundle.putString("deviceFirmwareKey", "");
        }
        return bundle;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (d() != null) {
            i4 = d().hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i4 + 31) * 31;
        if (e() != null) {
            i5 = e().hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        if (f() != null) {
            i6 = f().hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        if (g() != null) {
            i7 = g().hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i11 + i7) * 31;
        if (c() != null) {
            i8 = c().hashCode();
        }
        return i12 + i8;
    }

    @N
    public a0 i() {
        a0 a0Var = new a0();
        if (this.f44314a.containsKey("devicePid")) {
            a0Var.q("devicePid", (String) this.f44314a.get("devicePid"));
        } else {
            a0Var.q("devicePid", "");
        }
        if (this.f44314a.containsKey("otaFailKey")) {
            a0Var.q("otaFailKey", (String) this.f44314a.get("otaFailKey"));
        } else {
            a0Var.q("otaFailKey", "");
        }
        if (this.f44314a.containsKey("productNameKey")) {
            a0Var.q("productNameKey", (String) this.f44314a.get("productNameKey"));
        } else {
            a0Var.q("productNameKey", "");
        }
        if (this.f44314a.containsKey("serverFirmwareKey")) {
            a0Var.q("serverFirmwareKey", (String) this.f44314a.get("serverFirmwareKey"));
        } else {
            a0Var.q("serverFirmwareKey", "");
        }
        if (this.f44314a.containsKey("deviceFirmwareKey")) {
            a0Var.q("deviceFirmwareKey", (String) this.f44314a.get("deviceFirmwareKey"));
        } else {
            a0Var.q("deviceFirmwareKey", "");
        }
        return a0Var;
    }

    public String toString() {
        return "MicUpgradeFailedFragmentArgs{devicePid=" + d() + ", otaFailKey=" + e() + ", productNameKey=" + f() + ", serverFirmwareKey=" + g() + ", deviceFirmwareKey=" + c() + "}";
    }

    private s() {
        this.f44314a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44315a;

        public a(@N s sVar) {
            HashMap hashMap = new HashMap();
            this.f44315a = hashMap;
            hashMap.putAll(sVar.f44314a);
        }

        @N
        public s a() {
            return new s(this.f44315a);
        }

        @N
        public String b() {
            return (String) this.f44315a.get("deviceFirmwareKey");
        }

        @N
        public String c() {
            return (String) this.f44315a.get("devicePid");
        }

        @N
        public String d() {
            return (String) this.f44315a.get("otaFailKey");
        }

        @N
        public String e() {
            return (String) this.f44315a.get("productNameKey");
        }

        @N
        public String f() {
            return (String) this.f44315a.get("serverFirmwareKey");
        }

        @N
        public a g(@N String str) {
            if (str != null) {
                this.f44315a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a h(@N String str) {
            if (str != null) {
                this.f44315a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @N
        public a i(@N String str) {
            if (str != null) {
                this.f44315a.put("otaFailKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a j(@N String str) {
            if (str != null) {
                this.f44315a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a k(@N String str) {
            if (str != null) {
                this.f44315a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public a() {
            this.f44315a = new HashMap();
        }
    }

    private s(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44314a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
