package org.junit.runner;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.a;

/* loaded from: classes2.dex */
public class Result implements Serializable {

    /* renamed from: L, reason: collision with root package name */
    private static final long f55719L = 1;

    /* renamed from: M, reason: collision with root package name */
    private static final ObjectStreamField[] f55720M = ObjectStreamClass.lookup(c.class).getFields();

    /* renamed from: E, reason: collision with root package name */
    private final AtomicInteger f55721E;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicInteger f55722F;

    /* renamed from: G, reason: collision with root package name */
    private final AtomicInteger f55723G;

    /* renamed from: H, reason: collision with root package name */
    private final CopyOnWriteArrayList<Failure> f55724H;

    /* renamed from: I, reason: collision with root package name */
    private final AtomicLong f55725I;

    /* renamed from: J, reason: collision with root package name */
    private final AtomicLong f55726J;

    /* renamed from: K, reason: collision with root package name */
    private c f55727K;

    @a.InterfaceC0533a
    /* loaded from: classes2.dex */
    private class b extends org.junit.runner.notification.a {
        private b() {
        }

        @Override // org.junit.runner.notification.a
        public void a(Failure failure) {
            Result.this.f55723G.getAndIncrement();
        }

        @Override // org.junit.runner.notification.a
        public void b(Failure failure) throws Exception {
            Result.this.f55724H.add(failure);
        }

        @Override // org.junit.runner.notification.a
        public void c(Description description) throws Exception {
            Result.this.f55721E.getAndIncrement();
        }

        @Override // org.junit.runner.notification.a
        public void d(Description description) throws Exception {
            Result.this.f55722F.getAndIncrement();
        }

        @Override // org.junit.runner.notification.a
        public void e(Result result) throws Exception {
            Result.this.f55725I.addAndGet(System.currentTimeMillis() - Result.this.f55726J.get());
        }

        @Override // org.junit.runner.notification.a
        public void f(Description description) throws Exception {
            Result.this.f55726J.set(System.currentTimeMillis());
        }
    }

    public Result() {
        this.f55721E = new AtomicInteger();
        this.f55722F = new AtomicInteger();
        this.f55723G = new AtomicInteger();
        this.f55724H = new CopyOnWriteArrayList<>();
        this.f55725I = new AtomicLong();
        this.f55726J = new AtomicLong();
    }

    private void n(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f55727K = c.g(objectInputStream);
    }

    private Object o() {
        return new Result(this.f55727K);
    }

    private void q(ObjectOutputStream objectOutputStream) throws IOException {
        new c(this).h(objectOutputStream);
    }

    public org.junit.runner.notification.a g() {
        return new b();
    }

    public int h() {
        AtomicInteger atomicInteger = this.f55723G;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        throw new UnsupportedOperationException("Result was serialized from a version of JUnit that doesn't support this method");
    }

    public int i() {
        return this.f55724H.size();
    }

    public List<Failure> j() {
        return this.f55724H;
    }

    public int k() {
        return this.f55722F.get();
    }

    public int l() {
        return this.f55721E.get();
    }

    public long m() {
        return this.f55725I.get();
    }

    public boolean p() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    private static class c implements Serializable {

        /* renamed from: K, reason: collision with root package name */
        private static final long f55729K = 1;

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f55730E;

        /* renamed from: F, reason: collision with root package name */
        private final AtomicInteger f55731F;

        /* renamed from: G, reason: collision with root package name */
        private final AtomicInteger f55732G;

        /* renamed from: H, reason: collision with root package name */
        private final List<Failure> f55733H;

        /* renamed from: I, reason: collision with root package name */
        private final long f55734I;

        /* renamed from: J, reason: collision with root package name */
        private final long f55735J;

        public c(Result result) {
            this.f55730E = result.f55721E;
            this.f55731F = result.f55722F;
            this.f55732G = result.f55723G;
            this.f55733H = Collections.synchronizedList(new ArrayList(result.f55724H));
            this.f55734I = result.f55725I.longValue();
            this.f55735J = result.f55726J.longValue();
        }

        public static c g(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            return new c(objectInputStream.readFields());
        }

        public void h(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
            putFields.put("fCount", this.f55730E);
            putFields.put("fIgnoreCount", this.f55731F);
            putFields.put("fFailures", this.f55733H);
            putFields.put("fRunTime", this.f55734I);
            putFields.put("fStartTime", this.f55735J);
            putFields.put("assumptionFailureCount", this.f55732G);
            objectOutputStream.writeFields();
        }

        private c(ObjectInputStream.GetField getField) throws IOException {
            this.f55730E = (AtomicInteger) getField.get("fCount", (Object) null);
            this.f55731F = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.f55732G = (AtomicInteger) getField.get("assumptionFailureCount", (Object) null);
            this.f55733H = (List) getField.get("fFailures", (Object) null);
            this.f55734I = getField.get("fRunTime", 0L);
            this.f55735J = getField.get("fStartTime", 0L);
        }
    }

    private Result(c cVar) {
        this.f55721E = cVar.f55730E;
        this.f55722F = cVar.f55731F;
        this.f55723G = cVar.f55732G;
        this.f55724H = new CopyOnWriteArrayList<>(cVar.f55733H);
        this.f55725I = new AtomicLong(cVar.f55734I);
        this.f55726J = new AtomicLong(cVar.f55735J);
    }
}
