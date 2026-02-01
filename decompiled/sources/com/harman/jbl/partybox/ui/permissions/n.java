package com.harman.jbl.partybox.ui.permissions;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class n implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45499a;

    @N
    public static n b(@N a0 a0Var) {
        n nVar = new n();
        if (a0Var.f("from")) {
            nVar.f45499a.put("from", Integer.valueOf(((Integer) a0Var.h("from")).intValue()));
        } else {
            nVar.f45499a.put("from", 0);
        }
        return nVar;
    }

    @N
    public static n fromBundle(@N Bundle bundle) {
        n nVar = new n();
        bundle.setClassLoader(n.class.getClassLoader());
        if (bundle.containsKey("from")) {
            nVar.f45499a.put("from", Integer.valueOf(bundle.getInt("from")));
        } else {
            nVar.f45499a.put("from", 0);
        }
        return nVar;
    }

    public int c() {
        return ((Integer) this.f45499a.get("from")).intValue();
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f45499a.containsKey("from")) {
            bundle.putInt("from", ((Integer) this.f45499a.get("from")).intValue());
        } else {
            bundle.putInt("from", 0);
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f45499a.containsKey("from")) {
            a0Var.q("from", Integer.valueOf(((Integer) this.f45499a.get("from")).intValue()));
        } else {
            a0Var.q("from", 0);
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
        n nVar = (n) obj;
        if (this.f45499a.containsKey("from") == nVar.f45499a.containsKey("from") && c() == nVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "PermissionsGrantFragmentArgs{from=" + c() + "}";
    }

    private n() {
        this.f45499a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45500a;

        public a(@N n nVar) {
            HashMap hashMap = new HashMap();
            this.f45500a = hashMap;
            hashMap.putAll(nVar.f45499a);
        }

        @N
        public n a() {
            return new n(this.f45500a);
        }

        public int b() {
            return ((Integer) this.f45500a.get("from")).intValue();
        }

        @N
        public a c(int i4) {
            this.f45500a.put("from", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f45500a = new HashMap();
        }
    }

    private n(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45499a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
