package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Description implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private static final long f55706J = 1;

    /* renamed from: K, reason: collision with root package name */
    private static final Pattern f55707K = Pattern.compile("([\\s\\S]*)\\((.*)\\)");

    /* renamed from: L, reason: collision with root package name */
    public static final Description f55708L = new Description(null, "No Tests", new Annotation[0]);

    /* renamed from: M, reason: collision with root package name */
    public static final Description f55709M = new Description(null, "Test mechanism", new Annotation[0]);

    /* renamed from: E, reason: collision with root package name */
    private final Collection<Description> f55710E;

    /* renamed from: F, reason: collision with root package name */
    private final String f55711F;

    /* renamed from: G, reason: collision with root package name */
    private final Serializable f55712G;

    /* renamed from: H, reason: collision with root package name */
    private final Annotation[] f55713H;

    /* renamed from: I, reason: collision with root package name */
    private volatile Class<?> f55714I;

    private Description(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    public static Description c(Class<?> cls) {
        return new Description(cls, cls.getName(), cls.getAnnotations());
    }

    public static Description d(Class<?> cls, Annotation... annotationArr) {
        return new Description(cls, cls.getName(), annotationArr);
    }

    public static Description e(String str, Serializable serializable, Annotation... annotationArr) {
        return new Description(null, str, serializable, annotationArr);
    }

    public static Description f(String str, Annotation... annotationArr) {
        return new Description(null, str, annotationArr);
    }

    public static Description g(Class<?> cls, String str) {
        return new Description(cls, k(str, cls.getName()), new Annotation[0]);
    }

    public static Description h(Class<?> cls, String str, Annotation... annotationArr) {
        return new Description(cls, k(str, cls.getName()), annotationArr);
    }

    public static Description i(String str, String str2, Serializable serializable) {
        return new Description(null, k(str2, str), serializable, new Annotation[0]);
    }

    public static Description j(String str, String str2, Annotation... annotationArr) {
        return new Description(null, k(str2, str), annotationArr);
    }

    private static String k(String str, String str2) {
        return String.format("%s(%s)", str, str2);
    }

    private String v(int i4, String str) {
        Matcher matcher = f55707K.matcher(toString());
        if (matcher.matches()) {
            return matcher.group(i4);
        }
        return str;
    }

    public void a(Description description) {
        this.f55710E.add(description);
    }

    public Description b() {
        return new Description(this.f55714I, this.f55711F, this.f55713H);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Description)) {
            return false;
        }
        return this.f55712G.equals(((Description) obj).f55712G);
    }

    public int hashCode() {
        return this.f55712G.hashCode();
    }

    public <T extends Annotation> T l(Class<T> cls) {
        for (Annotation annotation : this.f55713H) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public Collection<Annotation> m() {
        return Arrays.asList(this.f55713H);
    }

    public ArrayList<Description> n() {
        return new ArrayList<>(this.f55710E);
    }

    public String o() {
        if (this.f55714I != null) {
            return this.f55714I.getName();
        }
        return v(2, toString());
    }

    public String p() {
        return this.f55711F;
    }

    public String q() {
        return v(1, null);
    }

    public Class<?> r() {
        if (this.f55714I != null) {
            return this.f55714I;
        }
        String o4 = o();
        if (o4 == null) {
            return null;
        }
        try {
            this.f55714I = Class.forName(o4, false, getClass().getClassLoader());
            return this.f55714I;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean s() {
        return equals(f55708L);
    }

    public boolean t() {
        return !u();
    }

    public String toString() {
        return p();
    }

    public boolean u() {
        return this.f55710E.isEmpty();
    }

    public int w() {
        if (u()) {
            return 1;
        }
        Iterator<Description> it = this.f55710E.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().w();
        }
        return i4;
    }

    private Description(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.f55710E = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (serializable != null) {
            this.f55714I = cls;
            this.f55711F = str;
            this.f55712G = serializable;
            this.f55713H = annotationArr;
            return;
        }
        throw new IllegalArgumentException("The unique id must not be null.");
    }
}
