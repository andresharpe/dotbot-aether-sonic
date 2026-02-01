package com.harman.jbl.partybox.ui.permissions;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45492a;

    @N
    public static e b(@N a0 a0Var) {
        e eVar = new e();
        if (a0Var.f("from")) {
            eVar.f45492a.put("from", Integer.valueOf(((Integer) a0Var.h("from")).intValue()));
        } else {
            eVar.f45492a.put("from", 0);
        }
        return eVar;
    }

    @N
    public static e fromBundle(@N Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        if (bundle.containsKey("from")) {
            eVar.f45492a.put("from", Integer.valueOf(bundle.getInt("from")));
        } else {
            eVar.f45492a.put("from", 0);
        }
        return eVar;
    }

    public int c() {
        return ((Integer) this.f45492a.get("from")).intValue();
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f45492a.containsKey("from")) {
            bundle.putInt("from", ((Integer) this.f45492a.get("from")).intValue());
        } else {
            bundle.putInt("from", 0);
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f45492a.containsKey("from")) {
            a0Var.q("from", Integer.valueOf(((Integer) this.f45492a.get("from")).intValue()));
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
        e eVar = (e) obj;
        if (this.f45492a.containsKey("from") == eVar.f45492a.containsKey("from") && c() == eVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "PermissionAndAccessFragmentArgs{from=" + c() + "}";
    }

    private e() {
        this.f45492a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45493a;

        public a(@N e eVar) {
            HashMap hashMap = new HashMap();
            this.f45493a = hashMap;
            hashMap.putAll(eVar.f45492a);
        }

        @N
        public e a() {
            return new e(this.f45493a);
        }

        public int b() {
            return ((Integer) this.f45493a.get("from")).intValue();
        }

        @N
        public a c(int i4) {
            this.f45493a.put("from", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f45493a = new HashMap();
        }
    }

    private e(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45492a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
