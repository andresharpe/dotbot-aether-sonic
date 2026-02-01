package org.junit.runners.model;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class InvalidTestClassError extends InitializationError {

    /* renamed from: H, reason: collision with root package name */
    private static final long f55829H = 1;

    /* renamed from: G, reason: collision with root package name */
    private final String f55830G;

    public InvalidTestClassError(Class<?> cls, List<Throwable> list) {
        super(list);
        this.f55830G = b(cls, list);
    }

    private static String b(Class<?> cls, List<Throwable> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Invalid test class '%s':", cls.getName()));
        Iterator<Throwable> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            sb.append("\n  " + i4 + ". " + it.next().getMessage());
            i4++;
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f55830G;
    }
}
