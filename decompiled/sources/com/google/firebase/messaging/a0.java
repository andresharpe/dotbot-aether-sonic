package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36861b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36862c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f36864e;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.i0
    @androidx.annotation.B("internalQueue")
    final ArrayDeque<String> f36863d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.B("internalQueue")
    private boolean f36865f = false;

    private a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f36860a = sharedPreferences;
        this.f36861b = str;
        this.f36862c = str2;
        this.f36864e = executor;
    }

    @androidx.annotation.B("internalQueue")
    private String e(String str) {
        boolean z3;
        if (str != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f(z3);
        return str;
    }

    @androidx.annotation.B("internalQueue")
    private boolean f(boolean z3) {
        if (z3 && !this.f36865f) {
            s();
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public static a0 j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        a0Var.k();
        return a0Var;
    }

    @androidx.annotation.j0
    private void k() {
        synchronized (this.f36863d) {
            try {
                this.f36863d.clear();
                String string = this.f36860a.getString(this.f36861b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f36862c)) {
                    String[] split = string.split(this.f36862c, -1);
                    if (split.length == 0) {
                        Log.e(C1821f.f36920a, "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f36863d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public void r() {
        synchronized (this.f36863d) {
            this.f36860a.edit().putString(this.f36861b, o()).commit();
        }
    }

    private void s() {
        this.f36864e.execute(new Runnable() { // from class: com.google.firebase.messaging.Z
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.r();
            }
        });
    }

    public boolean b(@androidx.annotation.N String str) {
        boolean f4;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f36862c)) {
            synchronized (this.f36863d) {
                f4 = f(this.f36863d.add(str));
            }
            return f4;
        }
        return false;
    }

    @androidx.annotation.B("internalQueue")
    public void c() {
        this.f36865f = true;
    }

    @androidx.annotation.i0
    void d() {
        synchronized (this.f36863d) {
            c();
        }
    }

    public void g() {
        synchronized (this.f36863d) {
            this.f36863d.clear();
            f(true);
        }
    }

    @androidx.annotation.B("internalQueue")
    public void h() {
        this.f36865f = false;
        s();
    }

    @androidx.annotation.i0
    void i() {
        synchronized (this.f36863d) {
            h();
        }
    }

    @androidx.annotation.P
    public String l() {
        String peek;
        synchronized (this.f36863d) {
            peek = this.f36863d.peek();
        }
        return peek;
    }

    public String m() {
        String e4;
        synchronized (this.f36863d) {
            e4 = e(this.f36863d.remove());
        }
        return e4;
    }

    public boolean n(@androidx.annotation.P Object obj) {
        boolean f4;
        synchronized (this.f36863d) {
            f4 = f(this.f36863d.remove(obj));
        }
        return f4;
    }

    @androidx.annotation.B("internalQueue")
    @androidx.annotation.N
    public String o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f36863d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f36862c);
        }
        return sb.toString();
    }

    @androidx.annotation.i0
    public String p() {
        String o4;
        synchronized (this.f36863d) {
            o4 = o();
        }
        return o4;
    }

    public int q() {
        int size;
        synchronized (this.f36863d) {
            size = this.f36863d.size();
        }
        return size;
    }

    @androidx.annotation.N
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.f36863d) {
            arrayList = new ArrayList(this.f36863d);
        }
        return arrayList;
    }
}
