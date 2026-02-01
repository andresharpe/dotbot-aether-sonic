package com.harman.jbl.partybox.ui.party.auracast;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class u implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f44865a;

    @N
    public static u b(@N a0 a0Var) {
        u uVar = new u();
        if (a0Var.f("loadUrl")) {
            String str = (String) a0Var.h("loadUrl");
            if (str != null) {
                uVar.f44865a.put("loadUrl", str);
                return uVar;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"loadUrl\" is missing and does not have an android:defaultValue");
    }

    @N
    public static u fromBundle(@N Bundle bundle) {
        u uVar = new u();
        bundle.setClassLoader(u.class.getClassLoader());
        if (bundle.containsKey("loadUrl")) {
            String string = bundle.getString("loadUrl");
            if (string != null) {
                uVar.f44865a.put("loadUrl", string);
                return uVar;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"loadUrl\" is missing and does not have an android:defaultValue");
    }

    @N
    public String c() {
        return (String) this.f44865a.get("loadUrl");
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f44865a.containsKey("loadUrl")) {
            bundle.putString("loadUrl", (String) this.f44865a.get("loadUrl"));
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f44865a.containsKey("loadUrl")) {
            a0Var.q("loadUrl", (String) this.f44865a.get("loadUrl"));
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
        u uVar = (u) obj;
        if (this.f44865a.containsKey("loadUrl") != uVar.f44865a.containsKey("loadUrl")) {
            return false;
        }
        if (c() == null ? uVar.c() == null : c().equals(uVar.c())) {
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
        return "AuracastWebviewFragmentArgs{loadUrl=" + c() + "}";
    }

    private u() {
        this.f44865a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44866a;

        public a(@N u uVar) {
            HashMap hashMap = new HashMap();
            this.f44866a = hashMap;
            hashMap.putAll(uVar.f44865a);
        }

        @N
        public u a() {
            return new u(this.f44866a);
        }

        @N
        public String b() {
            return (String) this.f44866a.get("loadUrl");
        }

        @N
        public a c(@N String str) {
            if (str != null) {
                this.f44866a.put("loadUrl", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }

        public a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f44866a = hashMap;
            if (str != null) {
                hashMap.put("loadUrl", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
    }

    private u(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f44865a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
