package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class N implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f43000a;

    @androidx.annotation.N
    public static N b(@androidx.annotation.N androidx.lifecycle.a0 a0Var) {
        N n4 = new N();
        if (a0Var.f("isFromSwitchSpeaker")) {
            n4.f43000a.put("isFromSwitchSpeaker", Integer.valueOf(((Integer) a0Var.h("isFromSwitchSpeaker")).intValue()));
        } else {
            n4.f43000a.put("isFromSwitchSpeaker", 0);
        }
        return n4;
    }

    @androidx.annotation.N
    public static N fromBundle(@androidx.annotation.N Bundle bundle) {
        N n4 = new N();
        bundle.setClassLoader(N.class.getClassLoader());
        if (bundle.containsKey("isFromSwitchSpeaker")) {
            n4.f43000a.put("isFromSwitchSpeaker", Integer.valueOf(bundle.getInt("isFromSwitchSpeaker")));
        } else {
            n4.f43000a.put("isFromSwitchSpeaker", 0);
        }
        return n4;
    }

    public int c() {
        return ((Integer) this.f43000a.get("isFromSwitchSpeaker")).intValue();
    }

    @androidx.annotation.N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f43000a.containsKey("isFromSwitchSpeaker")) {
            bundle.putInt("isFromSwitchSpeaker", ((Integer) this.f43000a.get("isFromSwitchSpeaker")).intValue());
        } else {
            bundle.putInt("isFromSwitchSpeaker", 0);
        }
        return bundle;
    }

    @androidx.annotation.N
    public androidx.lifecycle.a0 e() {
        androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0();
        if (this.f43000a.containsKey("isFromSwitchSpeaker")) {
            a0Var.q("isFromSwitchSpeaker", Integer.valueOf(((Integer) this.f43000a.get("isFromSwitchSpeaker")).intValue()));
        } else {
            a0Var.q("isFromSwitchSpeaker", 0);
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
        N n4 = (N) obj;
        if (this.f43000a.containsKey("isFromSwitchSpeaker") == n4.f43000a.containsKey("isFromSwitchSpeaker") && c() == n4.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "ProductListFragmentArgs{isFromSwitchSpeaker=" + c() + "}";
    }

    private N() {
        this.f43000a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43001a;

        public a(@androidx.annotation.N N n4) {
            HashMap hashMap = new HashMap();
            this.f43001a = hashMap;
            hashMap.putAll(n4.f43000a);
        }

        @androidx.annotation.N
        public N a() {
            return new N(this.f43001a);
        }

        public int b() {
            return ((Integer) this.f43001a.get("isFromSwitchSpeaker")).intValue();
        }

        @androidx.annotation.N
        public a c(int i4) {
            this.f43001a.put("isFromSwitchSpeaker", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f43001a = new HashMap();
        }
    }

    private N(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f43000a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
