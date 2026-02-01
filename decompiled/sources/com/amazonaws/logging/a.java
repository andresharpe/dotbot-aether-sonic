package com.amazonaws.logging;

import android.util.Log;
import com.amazonaws.logging.LogFactory;

/* loaded from: classes.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f23809a;

    /* renamed from: b, reason: collision with root package name */
    private LogFactory.Level f23810b = null;

    public a(String str) {
        this.f23809a = str;
    }

    private LogFactory.Level q() {
        LogFactory.Level level = this.f23810b;
        if (level != null) {
            return level;
        }
        return LogFactory.b();
    }

    @Override // com.amazonaws.logging.c
    public void a(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.DEBUG.b()) {
            Log.d(this.f23809a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.c
    public void b(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.DEBUG.b()) {
            Log.d(this.f23809a, obj.toString(), th);
        }
    }

    @Override // com.amazonaws.logging.c
    public void c(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.TRACE.b()) {
            Log.v(this.f23809a, obj.toString(), th);
        }
    }

    @Override // com.amazonaws.logging.c
    public boolean d() {
        if (Log.isLoggable(this.f23809a, 5) && (q() == null || q().b() <= LogFactory.Level.WARN.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void e(LogFactory.Level level) {
        this.f23810b = level;
    }

    @Override // com.amazonaws.logging.c
    public boolean f() {
        if (Log.isLoggable(this.f23809a, 3) && (q() == null || q().b() <= LogFactory.Level.DEBUG.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public boolean g() {
        if (Log.isLoggable(this.f23809a, 6) && (q() == null || q().b() <= LogFactory.Level.ERROR.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public boolean h() {
        if (Log.isLoggable(this.f23809a, 4) && (q() == null || q().b() <= LogFactory.Level.INFO.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void i(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.INFO.b()) {
            Log.i(this.f23809a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.c
    public void j(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.WARN.b()) {
            Log.w(this.f23809a, obj.toString(), th);
        }
    }

    @Override // com.amazonaws.logging.c
    public boolean k() {
        if (Log.isLoggable(this.f23809a, 2) && (q() == null || q().b() <= LogFactory.Level.TRACE.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void l(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.ERROR.b()) {
            Log.e(this.f23809a, obj.toString(), th);
        }
    }

    @Override // com.amazonaws.logging.c
    public void m(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.WARN.b()) {
            Log.w(this.f23809a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.c
    public void n(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.ERROR.b()) {
            Log.e(this.f23809a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.c
    public void o(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.TRACE.b()) {
            Log.v(this.f23809a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.c
    public void p(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.INFO.b()) {
            Log.i(this.f23809a, obj.toString(), th);
        }
    }
}
