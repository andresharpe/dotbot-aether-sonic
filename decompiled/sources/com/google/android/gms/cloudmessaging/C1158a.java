package com.google.android.gms.cloudmessaging;

import K0.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.messaging.C1821f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@c.a(creator = "CloudMessageCreator")
/* renamed from: com.google.android.gms.cloudmessaging.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158a extends K0.a {

    @N
    public static final Parcelable.Creator<C1158a> CREATOR = new f();

    /* renamed from: G, reason: collision with root package name */
    public static final int f27891G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final int f27892H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f27893I = 2;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    @N
    Intent f27894E;

    /* renamed from: F, reason: collision with root package name */
    @GuardedBy("this")
    private Map<String, String> f27895F;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.cloudmessaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0261a {
    }

    @c.b
    public C1158a(@c.e(id = 1) @N Intent intent) {
        this.f27894E = intent;
    }

    private static int f1(@P String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public int B0() {
        String stringExtra = this.f27894E.getStringExtra(C1821f.d.f36979l);
        if (stringExtra == null) {
            if ("1".equals(this.f27894E.getStringExtra(C1821f.d.f36981n))) {
                return 2;
            }
            stringExtra = this.f27894E.getStringExtra(C1821f.d.f36980m);
        }
        return f1(stringExtra);
    }

    @P
    public byte[] E0() {
        return this.f27894E.getByteArrayExtra(C1821f.d.f36970c);
    }

    @P
    public String F0() {
        return this.f27894E.getStringExtra(C1821f.d.f36983p);
    }

    public long M0() {
        Object obj;
        Bundle extras = this.f27894E.getExtras();
        if (extras != null) {
            obj = extras.get(C1821f.d.f36977j);
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid sent time: ");
                sb.append(valueOf);
                Log.w("CloudMessage", sb.toString());
                return 0L;
            }
        }
        return 0L;
    }

    @P
    public String Y0() {
        return this.f27894E.getStringExtra(C1821f.d.f36974g);
    }

    public int a1() {
        Object obj;
        Bundle extras = this.f27894E.getExtras();
        if (extras != null) {
            obj = extras.get(C1821f.d.f36976i);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(valueOf);
                Log.w("CloudMessage", sb.toString());
                return 0;
            }
        }
        return 0;
    }

    @P
    public String c0() {
        return this.f27894E.getStringExtra(C1821f.d.f36972e);
    }

    @N
    public synchronized Map<String, String> e0() {
        try {
            if (this.f27895F == null) {
                Bundle extras = this.f27894E.getExtras();
                androidx.collection.a aVar = new androidx.collection.a();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(C1821f.d.f36968a) && !str.equals("from") && !str.equals(C1821f.d.f36971d) && !str.equals(C1821f.d.f36972e)) {
                                aVar.put(str, str2);
                            }
                        }
                    }
                }
                this.f27895F = aVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27895F;
    }

    @P
    public String i0() {
        return this.f27894E.getStringExtra("from");
    }

    @N
    public Intent u0() {
        return this.f27894E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, this.f27894E, i4, false);
        K0.b.b(parcel, a4);
    }

    @P
    public String x0() {
        String stringExtra = this.f27894E.getStringExtra(C1821f.d.f36975h);
        if (stringExtra == null) {
            return this.f27894E.getStringExtra(C1821f.d.f36973f);
        }
        return stringExtra;
    }

    @P
    public String y0() {
        return this.f27894E.getStringExtra(C1821f.d.f36971d);
    }

    public int z0() {
        String stringExtra = this.f27894E.getStringExtra(C1821f.d.f36978k);
        if (stringExtra == null) {
            stringExtra = this.f27894E.getStringExtra(C1821f.d.f36980m);
        }
        return f1(stringExtra);
    }
}
