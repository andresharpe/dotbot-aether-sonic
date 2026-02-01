package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;
import org.apache.commons.logging.Log;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private Class f23811a;

    /* renamed from: b, reason: collision with root package name */
    private String f23812b;

    /* renamed from: c, reason: collision with root package name */
    private Log f23813c;

    /* renamed from: d, reason: collision with root package name */
    private LogFactory.Level f23814d = null;

    public b(Class cls) {
        this.f23811a = cls;
        this.f23813c = org.apache.commons.logging.LogFactory.getLog(cls);
    }

    private LogFactory.Level q() {
        LogFactory.Level level = this.f23814d;
        if (level != null) {
            return level;
        }
        return LogFactory.b();
    }

    @Override // com.amazonaws.logging.c
    public void a(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.DEBUG.b()) {
            this.f23813c.debug(obj);
        }
    }

    @Override // com.amazonaws.logging.c
    public void b(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.DEBUG.b()) {
            this.f23813c.debug(obj, th);
        }
    }

    @Override // com.amazonaws.logging.c
    public void c(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.TRACE.b()) {
            this.f23813c.trace(obj, th);
        }
    }

    @Override // com.amazonaws.logging.c
    public boolean d() {
        if (this.f23813c.isWarnEnabled() && (q() == null || q().b() <= LogFactory.Level.WARN.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void e(LogFactory.Level level) {
        this.f23814d = level;
    }

    @Override // com.amazonaws.logging.c
    public boolean f() {
        if (this.f23813c.isDebugEnabled() && (q() == null || q().b() <= LogFactory.Level.DEBUG.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public boolean g() {
        if (this.f23813c.isErrorEnabled() && (q() == null || q().b() <= LogFactory.Level.ERROR.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public boolean h() {
        if (this.f23813c.isInfoEnabled() && (q() == null || q().b() <= LogFactory.Level.INFO.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void i(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.INFO.b()) {
            this.f23813c.info(obj);
        }
    }

    @Override // com.amazonaws.logging.c
    public void j(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.WARN.b()) {
            this.f23813c.warn(obj, th);
        }
    }

    @Override // com.amazonaws.logging.c
    public boolean k() {
        if (this.f23813c.isTraceEnabled() && (q() == null || q().b() <= LogFactory.Level.TRACE.b())) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.logging.c
    public void l(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.ERROR.b()) {
            this.f23813c.error(obj, th);
        }
    }

    @Override // com.amazonaws.logging.c
    public void m(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.WARN.b()) {
            this.f23813c.warn(obj);
        }
    }

    @Override // com.amazonaws.logging.c
    public void n(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.ERROR.b()) {
            this.f23813c.error(obj);
        }
    }

    @Override // com.amazonaws.logging.c
    public void o(Object obj) {
        if (q() == null || q().b() <= LogFactory.Level.TRACE.b()) {
            this.f23813c.trace(obj);
        }
    }

    @Override // com.amazonaws.logging.c
    public void p(Object obj, Throwable th) {
        if (q() == null || q().b() <= LogFactory.Level.INFO.b()) {
            this.f23813c.info(obj, th);
        }
    }

    public b(String str) {
        this.f23812b = str;
        this.f23813c = org.apache.commons.logging.LogFactory.getLog(str);
    }
}
