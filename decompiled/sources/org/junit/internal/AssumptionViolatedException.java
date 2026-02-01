package org.junit.internal;

import java.io.IOException;
import java.io.ObjectOutputStream;
import org.hamcrest.m;
import org.hamcrest.n;

/* loaded from: classes2.dex */
public class AssumptionViolatedException extends RuntimeException implements m {

    /* renamed from: I, reason: collision with root package name */
    private static final long f55549I = 2;

    /* renamed from: E, reason: collision with root package name */
    private final String f55550E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f55551F;

    /* renamed from: G, reason: collision with root package name */
    private final Object f55552G;

    /* renamed from: H, reason: collision with root package name */
    private final org.hamcrest.k<?> f55553H;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z3, Object obj, org.hamcrest.k<?> kVar) {
        this.f55550E = str;
        this.f55552G = obj;
        this.f55553H = kVar;
        this.f55551F = z3;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    private void e(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("fAssumption", this.f55550E);
        putFields.put("fValueMatcher", this.f55551F);
        putFields.put("fMatcher", i.e(this.f55553H));
        putFields.put("fValue", j.a(this.f55552G));
        objectOutputStream.writeFields();
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        String str = this.f55550E;
        if (str != null) {
            gVar.d(str);
        }
        if (this.f55551F) {
            if (this.f55550E != null) {
                gVar.d(": ");
            }
            gVar.d("got: ");
            gVar.e(this.f55552G);
            if (this.f55553H != null) {
                gVar.d(", expected: ");
                gVar.b(this.f55553H);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return n.n(this);
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, org.hamcrest.k<?> kVar) {
        this(null, true, obj, kVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, org.hamcrest.k<?> kVar) {
        this(str, true, obj, kVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }
}
