package org.junit.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ArrayComparisonFailure extends AssertionError {

    /* renamed from: H, reason: collision with root package name */
    private static final long f55545H = 1;

    /* renamed from: E, reason: collision with root package name */
    private final List<Integer> f55546E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private final String f55547F;

    /* renamed from: G, reason: collision with root package name */
    private final AssertionError f55548G;

    public ArrayComparisonFailure(String str, AssertionError assertionError, int i4) {
        this.f55547F = str;
        this.f55548G = assertionError;
        initCause(assertionError);
        a(i4);
    }

    public void a(int i4) {
        this.f55546E.add(0, Integer.valueOf(i4));
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable cause;
        try {
            if (super.getCause() == null) {
                cause = this.f55548G;
            } else {
                cause = super.getCause();
            }
        } catch (Throwable th) {
            throw th;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.f55547F;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        Iterator<Integer> it = this.f55546E.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            sb.append("[");
            sb.append(intValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
