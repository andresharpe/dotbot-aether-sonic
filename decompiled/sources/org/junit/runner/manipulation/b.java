package org.junit.runner.manipulation;

import java.util.Iterator;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f55746a = new a();

    /* loaded from: classes2.dex */
    static class a extends b {
        a() {
        }

        @Override // org.junit.runner.manipulation.b
        public void a(Object obj) throws NoTestsRemainException {
        }

        @Override // org.junit.runner.manipulation.b
        public String b() {
            return "all tests";
        }

        @Override // org.junit.runner.manipulation.b
        public b c(b bVar) {
            return bVar;
        }

        @Override // org.junit.runner.manipulation.b
        public boolean e(Description description) {
            return true;
        }
    }

    /* renamed from: org.junit.runner.manipulation.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0532b extends b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Description f55747b;

        C0532b(Description description) {
            this.f55747b = description;
        }

        @Override // org.junit.runner.manipulation.b
        public String b() {
            return String.format("Method %s", this.f55747b.p());
        }

        @Override // org.junit.runner.manipulation.b
        public boolean e(Description description) {
            if (description.u()) {
                return this.f55747b.equals(description);
            }
            Iterator<Description> it = description.n().iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    class c extends b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f55748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f55749c;

        c(b bVar, b bVar2) {
            this.f55748b = bVar;
            this.f55749c = bVar2;
        }

        @Override // org.junit.runner.manipulation.b
        public String b() {
            return this.f55748b.b() + " and " + this.f55749c.b();
        }

        @Override // org.junit.runner.manipulation.b
        public boolean e(Description description) {
            if (this.f55748b.e(description) && this.f55749c.e(description)) {
                return true;
            }
            return false;
        }
    }

    public static b d(Description description) {
        return new C0532b(description);
    }

    public void a(Object obj) throws NoTestsRemainException {
        if (!(obj instanceof org.junit.runner.manipulation.c)) {
            return;
        }
        ((org.junit.runner.manipulation.c) obj).e(this);
    }

    public abstract String b();

    public b c(b bVar) {
        if (bVar != this && bVar != f55746a) {
            return new c(this, bVar);
        }
        return this;
    }

    public abstract boolean e(Description description);
}
