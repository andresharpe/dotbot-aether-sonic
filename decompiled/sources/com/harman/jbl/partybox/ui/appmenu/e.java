package com.harman.jbl.partybox.ui.appmenu;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f42103a;

    @N
    public static e b(@N a0 a0Var) {
        e eVar = new e();
        if (a0Var.f("showSwitchSpeaker")) {
            eVar.f42103a.put("showSwitchSpeaker", Integer.valueOf(((Integer) a0Var.h("showSwitchSpeaker")).intValue()));
        } else {
            eVar.f42103a.put("showSwitchSpeaker", 0);
        }
        return eVar;
    }

    @N
    public static e fromBundle(@N Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        if (bundle.containsKey("showSwitchSpeaker")) {
            eVar.f42103a.put("showSwitchSpeaker", Integer.valueOf(bundle.getInt("showSwitchSpeaker")));
        } else {
            eVar.f42103a.put("showSwitchSpeaker", 0);
        }
        return eVar;
    }

    public int c() {
        return ((Integer) this.f42103a.get("showSwitchSpeaker")).intValue();
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f42103a.containsKey("showSwitchSpeaker")) {
            bundle.putInt("showSwitchSpeaker", ((Integer) this.f42103a.get("showSwitchSpeaker")).intValue());
        } else {
            bundle.putInt("showSwitchSpeaker", 0);
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f42103a.containsKey("showSwitchSpeaker")) {
            a0Var.q("showSwitchSpeaker", Integer.valueOf(((Integer) this.f42103a.get("showSwitchSpeaker")).intValue()));
        } else {
            a0Var.q("showSwitchSpeaker", 0);
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
        if (this.f42103a.containsKey("showSwitchSpeaker") == eVar.f42103a.containsKey("showSwitchSpeaker") && c() == eVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "InfoFragmentArgs{showSwitchSpeaker=" + c() + "}";
    }

    private e() {
        this.f42103a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42104a;

        public a(@N e eVar) {
            HashMap hashMap = new HashMap();
            this.f42104a = hashMap;
            hashMap.putAll(eVar.f42103a);
        }

        @N
        public e a() {
            return new e(this.f42104a);
        }

        public int b() {
            return ((Integer) this.f42104a.get("showSwitchSpeaker")).intValue();
        }

        @N
        public a c(int i4) {
            this.f42104a.put("showSwitchSpeaker", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f42104a = new HashMap();
        }
    }

    private e(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f42103a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
