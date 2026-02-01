package com.harman.jbl.partybox.ui.connection.view;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class m implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f42371a;

    @N
    public static m b(@N a0 a0Var) {
        m mVar = new m();
        if (a0Var.f("isFromSwitchSpeaker")) {
            mVar.f42371a.put("isFromSwitchSpeaker", Integer.valueOf(((Integer) a0Var.h("isFromSwitchSpeaker")).intValue()));
        } else {
            mVar.f42371a.put("isFromSwitchSpeaker", 0);
        }
        return mVar;
    }

    @N
    public static m fromBundle(@N Bundle bundle) {
        m mVar = new m();
        bundle.setClassLoader(m.class.getClassLoader());
        if (bundle.containsKey("isFromSwitchSpeaker")) {
            mVar.f42371a.put("isFromSwitchSpeaker", Integer.valueOf(bundle.getInt("isFromSwitchSpeaker")));
        } else {
            mVar.f42371a.put("isFromSwitchSpeaker", 0);
        }
        return mVar;
    }

    public int c() {
        return ((Integer) this.f42371a.get("isFromSwitchSpeaker")).intValue();
    }

    @N
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f42371a.containsKey("isFromSwitchSpeaker")) {
            bundle.putInt("isFromSwitchSpeaker", ((Integer) this.f42371a.get("isFromSwitchSpeaker")).intValue());
        } else {
            bundle.putInt("isFromSwitchSpeaker", 0);
        }
        return bundle;
    }

    @N
    public a0 e() {
        a0 a0Var = new a0();
        if (this.f42371a.containsKey("isFromSwitchSpeaker")) {
            a0Var.q("isFromSwitchSpeaker", Integer.valueOf(((Integer) this.f42371a.get("isFromSwitchSpeaker")).intValue()));
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
        m mVar = (m) obj;
        if (this.f42371a.containsKey("isFromSwitchSpeaker") == mVar.f42371a.containsKey("isFromSwitchSpeaker") && c() == mVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + c();
    }

    public String toString() {
        return "ConnectionGuideFragmentArgs{isFromSwitchSpeaker=" + c() + "}";
    }

    private m() {
        this.f42371a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42372a;

        public a(@N m mVar) {
            HashMap hashMap = new HashMap();
            this.f42372a = hashMap;
            hashMap.putAll(mVar.f42371a);
        }

        @N
        public m a() {
            return new m(this.f42372a);
        }

        public int b() {
            return ((Integer) this.f42372a.get("isFromSwitchSpeaker")).intValue();
        }

        @N
        public a c(int i4) {
            this.f42372a.put("isFromSwitchSpeaker", Integer.valueOf(i4));
            return this;
        }

        public a() {
            this.f42372a = new HashMap();
        }
    }

    private m(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f42371a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
