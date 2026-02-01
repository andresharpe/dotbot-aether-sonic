package com.harman.jbl.partybox.ui.legal;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class i implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f43924a;

    @N
    public static i b(@N a0 a0Var) {
        i iVar = new i();
        if (a0Var.f("loadUrl")) {
            String str = (String) a0Var.h("loadUrl");
            if (str != null) {
                iVar.f43924a.put("loadUrl", str);
                return iVar;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"loadUrl\" is missing and does not have an android:defaultValue");
    }

    @N
    public static i fromBundle(@N Bundle bundle) {
        i iVar = new i();
        bundle.setClassLoader(i.class.getClassLoader());
        if (bundle.containsKey("loadUrl")) {
            String string = bundle.getString("loadUrl");
            if (string != null) {
                iVar.f43924a.put("loadUrl", string);
                return iVar;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"loadUrl\" is missing and does not have an android:defaultValue");
    }

    @N
    public String c() {
        return (String) this.f43924a.get("loadUrl");
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f43924a.containsKey("loadUrl")) {
            bundle.putString("loadUrl", (String) this.f43924a.get("loadUrl"));
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f43924a.containsKey("loadUrl")) {
            a0Var.q("loadUrl", (String) this.f43924a.get("loadUrl"));
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
        i iVar = (i) obj;
        if (this.f43924a.containsKey("loadUrl") != iVar.f43924a.containsKey("loadUrl")) {
            return false;
        }
        if (c() == null ? iVar.c() == null : c().equals(iVar.c())) {
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
        return "RecordNumberFragmentArgs{loadUrl=" + c() + "}";
    }

    private i() {
        this.f43924a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43925a;

        public a(@N i iVar) {
            HashMap hashMap = new HashMap();
            this.f43925a = hashMap;
            hashMap.putAll(iVar.f43924a);
        }

        @N
        public i a() {
            return new i(this.f43925a);
        }

        @N
        public String b() {
            return (String) this.f43925a.get("loadUrl");
        }

        @N
        public a c(@N String str) {
            if (str != null) {
                this.f43925a.put("loadUrl", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }

        public a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f43925a = hashMap;
            if (str != null) {
                hashMap.put("loadUrl", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
    }

    private i(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f43924a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
