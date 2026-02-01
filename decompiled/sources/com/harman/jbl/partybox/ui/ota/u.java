package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class u implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44693a;

    @androidx.annotation.N
    public static u b(@androidx.annotation.N a0 a0Var) {
        u uVar = new u();
        if (a0Var.f("productNameKey")) {
            String str = (String) a0Var.h("productNameKey");
            if (str != null) {
                uVar.f44693a.put("productNameKey", str);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("productNameKey", "");
        }
        if (a0Var.f("serverFirmwareKey")) {
            String str2 = (String) a0Var.h("serverFirmwareKey");
            if (str2 != null) {
                uVar.f44693a.put("serverFirmwareKey", str2);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("serverFirmwareKey", "");
        }
        if (a0Var.f("deviceFirmwareKey")) {
            String str3 = (String) a0Var.h("deviceFirmwareKey");
            if (str3 != null) {
                uVar.f44693a.put("deviceFirmwareKey", str3);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("deviceFirmwareKey", "");
        }
        if (a0Var.f("devicePid")) {
            String str4 = (String) a0Var.h("devicePid");
            if (str4 != null) {
                uVar.f44693a.put("devicePid", str4);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("devicePid", "");
        }
        if (a0Var.f("deviceMid")) {
            String str5 = (String) a0Var.h("deviceMid");
            if (str5 != null) {
                uVar.f44693a.put("deviceMid", str5);
            } else {
                throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("deviceMid", "");
        }
        return uVar;
    }

    @androidx.annotation.N
    public static u fromBundle(@androidx.annotation.N Bundle bundle) {
        u uVar = new u();
        bundle.setClassLoader(u.class.getClassLoader());
        if (bundle.containsKey("productNameKey")) {
            String string = bundle.getString("productNameKey");
            if (string != null) {
                uVar.f44693a.put("productNameKey", string);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("productNameKey", "");
        }
        if (bundle.containsKey("serverFirmwareKey")) {
            String string2 = bundle.getString("serverFirmwareKey");
            if (string2 != null) {
                uVar.f44693a.put("serverFirmwareKey", string2);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("serverFirmwareKey", "");
        }
        if (bundle.containsKey("deviceFirmwareKey")) {
            String string3 = bundle.getString("deviceFirmwareKey");
            if (string3 != null) {
                uVar.f44693a.put("deviceFirmwareKey", string3);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("deviceFirmwareKey", "");
        }
        if (bundle.containsKey("devicePid")) {
            String string4 = bundle.getString("devicePid");
            if (string4 != null) {
                uVar.f44693a.put("devicePid", string4);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("devicePid", "");
        }
        if (bundle.containsKey("deviceMid")) {
            String string5 = bundle.getString("deviceMid");
            if (string5 != null) {
                uVar.f44693a.put("deviceMid", string5);
            } else {
                throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
            }
        } else {
            uVar.f44693a.put("deviceMid", "");
        }
        return uVar;
    }

    @androidx.annotation.N
    public String c() {
        return (String) this.f44693a.get("deviceFirmwareKey");
    }

    @androidx.annotation.N
    public String d() {
        return (String) this.f44693a.get("deviceMid");
    }

    @androidx.annotation.N
    public String e() {
        return (String) this.f44693a.get("devicePid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f44693a.containsKey("productNameKey") != uVar.f44693a.containsKey("productNameKey")) {
            return false;
        }
        if (f() == null ? uVar.f() != null : !f().equals(uVar.f())) {
            return false;
        }
        if (this.f44693a.containsKey("serverFirmwareKey") != uVar.f44693a.containsKey("serverFirmwareKey")) {
            return false;
        }
        if (g() == null ? uVar.g() != null : !g().equals(uVar.g())) {
            return false;
        }
        if (this.f44693a.containsKey("deviceFirmwareKey") != uVar.f44693a.containsKey("deviceFirmwareKey")) {
            return false;
        }
        if (c() == null ? uVar.c() != null : !c().equals(uVar.c())) {
            return false;
        }
        if (this.f44693a.containsKey("devicePid") != uVar.f44693a.containsKey("devicePid")) {
            return false;
        }
        if (e() == null ? uVar.e() != null : !e().equals(uVar.e())) {
            return false;
        }
        if (this.f44693a.containsKey("deviceMid") != uVar.f44693a.containsKey("deviceMid")) {
            return false;
        }
        if (d() == null ? uVar.d() == null : d().equals(uVar.d())) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    public String f() {
        return (String) this.f44693a.get("productNameKey");
    }

    @androidx.annotation.N
    public String g() {
        return (String) this.f44693a.get("serverFirmwareKey");
    }

    @androidx.annotation.N
    public Bundle h() {
        Bundle bundle = new Bundle();
        if (this.f44693a.containsKey("productNameKey")) {
            bundle.putString("productNameKey", (String) this.f44693a.get("productNameKey"));
        } else {
            bundle.putString("productNameKey", "");
        }
        if (this.f44693a.containsKey("serverFirmwareKey")) {
            bundle.putString("serverFirmwareKey", (String) this.f44693a.get("serverFirmwareKey"));
        } else {
            bundle.putString("serverFirmwareKey", "");
        }
        if (this.f44693a.containsKey("deviceFirmwareKey")) {
            bundle.putString("deviceFirmwareKey", (String) this.f44693a.get("deviceFirmwareKey"));
        } else {
            bundle.putString("deviceFirmwareKey", "");
        }
        if (this.f44693a.containsKey("devicePid")) {
            bundle.putString("devicePid", (String) this.f44693a.get("devicePid"));
        } else {
            bundle.putString("devicePid", "");
        }
        if (this.f44693a.containsKey("deviceMid")) {
            bundle.putString("deviceMid", (String) this.f44693a.get("deviceMid"));
        } else {
            bundle.putString("deviceMid", "");
        }
        return bundle;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (f() != null) {
            i4 = f().hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i4 + 31) * 31;
        if (g() != null) {
            i5 = g().hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        if (c() != null) {
            i6 = c().hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        if (e() != null) {
            i7 = e().hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i11 + i7) * 31;
        if (d() != null) {
            i8 = d().hashCode();
        }
        return i12 + i8;
    }

    @androidx.annotation.N
    public a0 i() {
        a0 a0Var = new a0();
        if (this.f44693a.containsKey("productNameKey")) {
            a0Var.q("productNameKey", (String) this.f44693a.get("productNameKey"));
        } else {
            a0Var.q("productNameKey", "");
        }
        if (this.f44693a.containsKey("serverFirmwareKey")) {
            a0Var.q("serverFirmwareKey", (String) this.f44693a.get("serverFirmwareKey"));
        } else {
            a0Var.q("serverFirmwareKey", "");
        }
        if (this.f44693a.containsKey("deviceFirmwareKey")) {
            a0Var.q("deviceFirmwareKey", (String) this.f44693a.get("deviceFirmwareKey"));
        } else {
            a0Var.q("deviceFirmwareKey", "");
        }
        if (this.f44693a.containsKey("devicePid")) {
            a0Var.q("devicePid", (String) this.f44693a.get("devicePid"));
        } else {
            a0Var.q("devicePid", "");
        }
        if (this.f44693a.containsKey("deviceMid")) {
            a0Var.q("deviceMid", (String) this.f44693a.get("deviceMid"));
        } else {
            a0Var.q("deviceMid", "");
        }
        return a0Var;
    }

    public String toString() {
        return "HmRestartFragmentArgs{productNameKey=" + f() + ", serverFirmwareKey=" + g() + ", deviceFirmwareKey=" + c() + ", devicePid=" + e() + ", deviceMid=" + d() + "}";
    }

    private u() {
        this.f44693a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44694a;

        public a(@androidx.annotation.N u uVar) {
            HashMap hashMap = new HashMap();
            this.f44694a = hashMap;
            hashMap.putAll(uVar.f44693a);
        }

        @androidx.annotation.N
        public u a() {
            return new u(this.f44694a);
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44694a.get("deviceFirmwareKey");
        }

        @androidx.annotation.N
        public String c() {
            return (String) this.f44694a.get("deviceMid");
        }

        @androidx.annotation.N
        public String d() {
            return (String) this.f44694a.get("devicePid");
        }

        @androidx.annotation.N
        public String e() {
            return (String) this.f44694a.get("productNameKey");
        }

        @androidx.annotation.N
        public String f() {
            return (String) this.f44694a.get("serverFirmwareKey");
        }

        @androidx.annotation.N
        public a g(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44694a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a h(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44694a.put("deviceMid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a i(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44694a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a j(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44694a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a k(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44694a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public a() {
            this.f44694a = new HashMap();
        }
    }

    private u(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44693a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
