package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f55752a = "Ordering class %s should have a public constructor with signature %s(Ordering.Context context)";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Random f55753b;

        a(Random random) {
            this.f55753b = random;
        }

        @Override // org.junit.runner.manipulation.f
        protected List<Description> f(Collection<Description> collection) {
            ArrayList arrayList = new ArrayList(collection);
            Collections.shuffle(arrayList, this.f55753b);
            return arrayList;
        }

        @Override // org.junit.runner.manipulation.f
        boolean h() {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Description f55754a;

        /* synthetic */ b(Description description, a aVar) {
            this(description);
        }

        public Description a() {
            return this.f55754a;
        }

        private b(Description description) {
            this.f55754a = description;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        f a(b bVar);
    }

    public static f c(Class<? extends c> cls, Description description) throws InvalidOrderingException {
        if (cls != null) {
            if (description != null) {
                try {
                    return d(cls.getConstructor(new Class[0]).newInstance(new Object[0]), description);
                } catch (NoSuchMethodException unused) {
                    throw new InvalidOrderingException(String.format(f55752a, e(cls), cls.getSimpleName()));
                } catch (Exception e4) {
                    throw new InvalidOrderingException("Could not create ordering for " + description, e4);
                }
            }
            throw new NullPointerException("annotatedTestClass cannot be null");
        }
        throw new NullPointerException("factoryClass cannot be null");
    }

    public static f d(c cVar, Description description) throws InvalidOrderingException {
        if (cVar != null) {
            if (description != null) {
                return cVar.a(new b(description, null));
            }
            throw new NullPointerException("annotatedTestClass cannot be null");
        }
        throw new NullPointerException("factory cannot be null");
    }

    private static String e(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return cls.getName();
        }
        return canonicalName;
    }

    public static f g(Random random) {
        return new a(random);
    }

    public void b(Object obj) throws InvalidOrderingException {
        if (obj instanceof d) {
            ((d) obj).c(new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<Description> f(Collection<Description> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return true;
    }
}
