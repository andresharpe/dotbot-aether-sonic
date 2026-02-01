package com.harman.jbl.partybox.ui.group;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f43747a;

    @N
    public static c b(@N a0 a0Var) {
        c cVar = new c();
        if (a0Var.f("currentIndex")) {
            cVar.f43747a.put("currentIndex", Integer.valueOf(((Integer) a0Var.h("currentIndex")).intValue()));
        } else {
            cVar.f43747a.put("currentIndex", 0);
        }
        return cVar;
    }

    @N
    public static c fromBundle(@N Bundle bundle) {
        c cVar = new c();
        bundle.setClassLoader(c.class.getClassLoader());
        if (bundle.containsKey("currentIndex")) {
            cVar.f43747a.put("currentIndex", Integer.valueOf(bundle.getInt("currentIndex")));
        } else {
            cVar.f43747a.put("currentIndex", 0);
        }
        return cVar;
    }

    public int c() {
        return ((Integer) this.f43747a.get("currentIndex")).intValue();
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f43747a.containsKey("currentIndex")) {
            bundle.putInt("currentIndex", ((Integer) this.f43747a.get("currentIndex")).intValue());
        } else {
            bundle.putInt("currentIndex", 0);
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f43747a.containsKey("currentIndex")) {
            a0Var.q("currentIndex", Integer.valueOf(((Integer) this.f43747a.get("currentIndex")).intValue()));
        } else {
            a0Var.q("currentIndex", 0);
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
        c cVar = (c) obj;
        if (this.f43747a.containsKey("currentIndex") == cVar.f43747a.containsKey("currentIndex") && c() == cVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "IdentityDialogFragmentArgs{currentIndex=" + c() + "}";
    }

    private c() {
        this.f43747a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43748a;

        public a(@N c cVar) {
            HashMap hashMap = new HashMap();
            this.f43748a = hashMap;
            hashMap.putAll(cVar.f43747a);
        }

        @N
        public c a() {
            return new c(this.f43748a);
        }

        public int b() {
            return ((Integer) this.f43748a.get("currentIndex")).intValue();
        }

        @N
        public a c(int i4) {
            this.f43748a.put("currentIndex", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f43748a = new HashMap();
        }
    }

    private c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f43747a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
