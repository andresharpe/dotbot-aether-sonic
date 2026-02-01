package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class C implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44402a;

    @androidx.annotation.N
    public static C b(@androidx.annotation.N a0 a0Var) {
        C c4 = new C();
        if (a0Var.f("devicePid")) {
            String str = (String) a0Var.h("devicePid");
            if (str != null) {
                c4.f44402a.put("devicePid", str);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c4.f44402a.put("devicePid", "");
        }
        return c4;
    }

    @androidx.annotation.N
    public static C fromBundle(@androidx.annotation.N Bundle bundle) {
        C c4 = new C();
        bundle.setClassLoader(C.class.getClassLoader());
        if (bundle.containsKey("devicePid")) {
            String string = bundle.getString("devicePid");
            if (string != null) {
                c4.f44402a.put("devicePid", string);
            } else {
                throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
            }
        } else {
            c4.f44402a.put("devicePid", "");
        }
        return c4;
    }

    @androidx.annotation.N
    public String c() {
        return (String) this.f44402a.get("devicePid");
    }

    @androidx.annotation.N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f44402a.containsKey("devicePid")) {
            bundle.putString("devicePid", (String) this.f44402a.get("devicePid"));
        } else {
            bundle.putString("devicePid", "");
        }
        return bundle;
    }

    @androidx.annotation.N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f44402a.containsKey("devicePid")) {
            a0Var.q("devicePid", (String) this.f44402a.get("devicePid"));
        } else {
            a0Var.q("devicePid", "");
        }
        return a0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C c4 = (C) obj;
        if (this.f44402a.containsKey("devicePid") != c4.f44402a.containsKey("devicePid")) {
            return false;
        }
        if (c() == null ? c4.c() == null : c().equals(c4.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        if (c() != null) {
            i4 = c().hashCode();
        } else {
            i4 = 0;
        }
        return 31 + i4;
    }

    public String toString() {
        return "HmUpgradeFailFragmentArgs{devicePid=" + c() + "}";
    }

    private C() {
        this.f44402a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44403a;

        public a(@androidx.annotation.N C c4) {
            HashMap hashMap = new HashMap();
            this.f44403a = hashMap;
            hashMap.putAll(c4.f44402a);
        }

        @androidx.annotation.N
        public C a() {
            return new C(this.f44403a);
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44403a.get("devicePid");
        }

        @androidx.annotation.N
        public a c(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44403a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        public a() {
            this.f44403a = new HashMap();
        }
    }

    private C(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44402a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
