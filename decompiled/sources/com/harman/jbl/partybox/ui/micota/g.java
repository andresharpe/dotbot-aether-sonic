package com.harman.jbl.partybox.ui.micota;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class g implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44291a;

    @N
    public static g b(@N a0 a0Var) {
        g gVar = new g();
        if (a0Var.f("productNameKey")) {
            String str = (String) a0Var.h("productNameKey");
            if (str != null) {
                gVar.f44291a.put("productNameKey", str);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("productNameKey", "");
        }
        if (a0Var.f("serverFirmwareKey")) {
            String str2 = (String) a0Var.h("serverFirmwareKey");
            if (str2 != null) {
                gVar.f44291a.put("serverFirmwareKey", str2);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("serverFirmwareKey", "");
        }
        if (a0Var.f("deviceFirmwareKey")) {
            String str3 = (String) a0Var.h("deviceFirmwareKey");
            if (str3 != null) {
                gVar.f44291a.put("deviceFirmwareKey", str3);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("deviceFirmwareKey", "");
        }
        if (a0Var.f("devicePid")) {
            String str4 = (String) a0Var.h("devicePid");
            if (str4 != null) {
                gVar.f44291a.put("devicePid", str4);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("devicePid", "");
        }
        return gVar;
    }

    @N
    public static g fromBundle(@N Bundle bundle) {
        g gVar = new g();
        bundle.setClassLoader(g.class.getClassLoader());
        if (bundle.containsKey("productNameKey")) {
            String string = bundle.getString("productNameKey");
            if (string != null) {
                gVar.f44291a.put("productNameKey", string);
            } else {
                throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("productNameKey", "");
        }
        if (bundle.containsKey("serverFirmwareKey")) {
            String string2 = bundle.getString("serverFirmwareKey");
            if (string2 != null) {
                gVar.f44291a.put("serverFirmwareKey", string2);
            } else {
                throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("serverFirmwareKey", "");
        }
        if (bundle.containsKey("deviceFirmwareKey")) {
            String string3 = bundle.getString("deviceFirmwareKey");
            if (string3 != null) {
                gVar.f44291a.put("deviceFirmwareKey", string3);
            } else {
                throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("deviceFirmwareKey", "");
        }
        if (bundle.containsKey("devicePid")) {
            String string4 = bundle.getString("devicePid");
            if (string4 != null) {
                gVar.f44291a.put("devicePid", string4);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            gVar.f44291a.put("devicePid", "");
        }
        return gVar;
    }

    @N
    public String c() {
        return (String) this.f44291a.get("deviceFirmwareKey");
    }

    @N
    public String d() {
        return (String) this.f44291a.get("devicePid");
    }

    @N
    public String e() {
        return (String) this.f44291a.get("productNameKey");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f44291a.containsKey("productNameKey") != gVar.f44291a.containsKey("productNameKey")) {
            return false;
        }
        if (e() == null ? gVar.e() != null : !e().equals(gVar.e())) {
            return false;
        }
        if (this.f44291a.containsKey("serverFirmwareKey") != gVar.f44291a.containsKey("serverFirmwareKey")) {
            return false;
        }
        if (f() == null ? gVar.f() != null : !f().equals(gVar.f())) {
            return false;
        }
        if (this.f44291a.containsKey("deviceFirmwareKey") != gVar.f44291a.containsKey("deviceFirmwareKey")) {
            return false;
        }
        if (c() == null ? gVar.c() != null : !c().equals(gVar.c())) {
            return false;
        }
        if (this.f44291a.containsKey("devicePid") != gVar.f44291a.containsKey("devicePid")) {
            return false;
        }
        if (d() == null ? gVar.d() == null : d().equals(gVar.d())) {
            return true;
        }
        return false;
    }

    @N
    public String f() {
        return (String) this.f44291a.get("serverFirmwareKey");
    }

    @N
    public Bundle g() {
        Bundle bundle = new Bundle();
        if (this.f44291a.containsKey("productNameKey")) {
            bundle.putString("productNameKey", (String) this.f44291a.get("productNameKey"));
        } else {
            bundle.putString("productNameKey", "");
        }
        if (this.f44291a.containsKey("serverFirmwareKey")) {
            bundle.putString("serverFirmwareKey", (String) this.f44291a.get("serverFirmwareKey"));
        } else {
            bundle.putString("serverFirmwareKey", "");
        }
        if (this.f44291a.containsKey("deviceFirmwareKey")) {
            bundle.putString("deviceFirmwareKey", (String) this.f44291a.get("deviceFirmwareKey"));
        } else {
            bundle.putString("deviceFirmwareKey", "");
        }
        if (this.f44291a.containsKey("devicePid")) {
            bundle.putString("devicePid", (String) this.f44291a.get("devicePid"));
        } else {
            bundle.putString("devicePid", "");
        }
        return bundle;
    }

    @N
    public a0 h() {
        a0 a0Var = new a0();
        if (this.f44291a.containsKey("productNameKey")) {
            a0Var.q("productNameKey", (String) this.f44291a.get("productNameKey"));
        } else {
            a0Var.q("productNameKey", "");
        }
        if (this.f44291a.containsKey("serverFirmwareKey")) {
            a0Var.q("serverFirmwareKey", (String) this.f44291a.get("serverFirmwareKey"));
        } else {
            a0Var.q("serverFirmwareKey", "");
        }
        if (this.f44291a.containsKey("deviceFirmwareKey")) {
            a0Var.q("deviceFirmwareKey", (String) this.f44291a.get("deviceFirmwareKey"));
        } else {
            a0Var.q("deviceFirmwareKey", "");
        }
        if (this.f44291a.containsKey("devicePid")) {
            a0Var.q("devicePid", (String) this.f44291a.get("devicePid"));
        } else {
            a0Var.q("devicePid", "");
        }
        return a0Var;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (e() != null) {
            i4 = e().hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i4 + 31) * 31;
        if (f() != null) {
            i5 = f().hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        if (c() != null) {
            i6 = c().hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        if (d() != null) {
            i7 = d().hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        return "MicOTAUpgradeFragmentArgs{productNameKey=" + e() + ", serverFirmwareKey=" + f() + ", deviceFirmwareKey=" + c() + ", devicePid=" + d() + "}";
    }

    private g() {
        this.f44291a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44292a;

        public a(@N g gVar) {
            HashMap hashMap = new HashMap();
            this.f44292a = hashMap;
            hashMap.putAll(gVar.f44291a);
        }

        @N
        public g a() {
            return new g(this.f44292a);
        }

        @N
        public String b() {
            return (String) this.f44292a.get("deviceFirmwareKey");
        }

        @N
        public String c() {
            return (String) this.f44292a.get("devicePid");
        }

        @N
        public String d() {
            return (String) this.f44292a.get("productNameKey");
        }

        @N
        public String e() {
            return (String) this.f44292a.get("serverFirmwareKey");
        }

        @N
        public a f(@N String str) {
            if (str != null) {
                this.f44292a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a g(@N String str) {
            if (str != null) {
                this.f44292a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @N
        public a h(@N String str) {
            if (str != null) {
                this.f44292a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a i(@N String str) {
            if (str != null) {
                this.f44292a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public a() {
            this.f44292a = new HashMap();
        }
    }

    private g(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44291a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
