package com.harman.jbl.partybox.ui.connection.view;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f42361a;

    @N
    public static b b(@N a0 a0Var) {
        b bVar = new b();
        if (a0Var.f("pid")) {
            String str = (String) a0Var.h("pid");
            if (str != null) {
                bVar.f42361a.put("pid", str);
                if (a0Var.f("isFromProductList")) {
                    bVar.f42361a.put("isFromProductList", Integer.valueOf(((Integer) a0Var.h("isFromProductList")).intValue()));
                } else {
                    bVar.f42361a.put("isFromProductList", 0);
                }
                return bVar;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"pid\" is missing and does not have an android:defaultValue");
    }

    @N
    public static b fromBundle(@N Bundle bundle) {
        b bVar = new b();
        bundle.setClassLoader(b.class.getClassLoader());
        if (bundle.containsKey("pid")) {
            String string = bundle.getString("pid");
            if (string != null) {
                bVar.f42361a.put("pid", string);
                if (bundle.containsKey("isFromProductList")) {
                    bVar.f42361a.put("isFromProductList", Integer.valueOf(bundle.getInt("isFromProductList")));
                } else {
                    bVar.f42361a.put("isFromProductList", 0);
                }
                return bVar;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"pid\" is missing and does not have an android:defaultValue");
    }

    public int c() {
        return ((Integer) this.f42361a.get("isFromProductList")).intValue();
    }

    @N
    public String d() {
        return (String) this.f42361a.get("pid");
    }

    @N
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f42361a.containsKey("pid")) {
            bundle.putString("pid", (String) this.f42361a.get("pid"));
        }
        if (this.f42361a.containsKey("isFromProductList")) {
            bundle.putInt("isFromProductList", ((Integer) this.f42361a.get("isFromProductList")).intValue());
        } else {
            bundle.putInt("isFromProductList", 0);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f42361a.containsKey("pid") != bVar.f42361a.containsKey("pid")) {
            return false;
        }
        if (d() == null ? bVar.d() != null : !d().equals(bVar.d())) {
            return false;
        }
        if (this.f42361a.containsKey("isFromProductList") == bVar.f42361a.containsKey("isFromProductList") && c() == bVar.c()) {
            return true;
        }
        return false;
    }

    @N
    public a0 f() {
        a0 a0Var = new a0();
        if (this.f42361a.containsKey("pid")) {
            a0Var.q("pid", (String) this.f42361a.get("pid"));
        }
        if (this.f42361a.containsKey("isFromProductList")) {
            a0Var.q("isFromProductList", Integer.valueOf(((Integer) this.f42361a.get("isFromProductList")).intValue()));
        } else {
            a0Var.q("isFromProductList", 0);
        }
        return a0Var;
    }

    public int hashCode() {
        int i4;
        if (d() != null) {
            i4 = d().hashCode();
        } else {
            i4 = 0;
        }
        return ((i4 + 31) * 31) + c();
    }

    public String toString() {
        return "ActivateSpeakerBluetoothFragmentArgs{pid=" + d() + ", isFromProductList=" + c() + "}";
    }

    private b() {
        this.f42361a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42362a;

        public a(@N b bVar) {
            HashMap hashMap = new HashMap();
            this.f42362a = hashMap;
            hashMap.putAll(bVar.f42361a);
        }

        @N
        public b a() {
            return new b(this.f42362a);
        }

        public int b() {
            return ((Integer) this.f42362a.get("isFromProductList")).intValue();
        }

        @N
        public String c() {
            return (String) this.f42362a.get("pid");
        }

        @N
        public a d(int i4) {
            this.f42362a.put("isFromProductList", Integer.valueOf(i4));
            return this;
        }

        @N
        public a e(@N String str) {
            if (str != null) {
                this.f42362a.put("pid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }

        public a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f42362a = hashMap;
            if (str != null) {
                hashMap.put("pid", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
    }

    private b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f42361a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
