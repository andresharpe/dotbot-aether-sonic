package org.junit.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.j;
import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public class g extends e<j> {

    /* renamed from: f, reason: collision with root package name */
    private final List<j> f55826f;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface a {
        Class<?>[] value();
    }

    public g(Class<?> cls, org.junit.runners.model.g gVar) throws InitializationError {
        this(gVar, cls, L(cls));
    }

    public static j K() {
        try {
            return new g((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (InitializationError unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    private static Class<?>[] L(Class<?> cls) throws InitializationError {
        a aVar = (a) cls.getAnnotation(a.class);
        if (aVar != null) {
            return aVar.value();
        }
        throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public Description p(j jVar) {
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void w(j jVar, org.junit.runner.notification.b bVar) {
        jVar.b(bVar);
    }

    @Override // org.junit.runners.e
    protected List<j> q() {
        return this.f55826f;
    }

    public g(org.junit.runners.model.g gVar, Class<?>[] clsArr) throws InitializationError {
        this((Class<?>) null, gVar.f(null, clsArr));
    }

    protected g(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(new org.junit.internal.builders.a(), cls, clsArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(org.junit.runners.model.g gVar, Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(cls, gVar.f(cls, clsArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(Class<?> cls, List<j> list) throws InitializationError {
        super(cls);
        this.f55826f = Collections.unmodifiableList(list);
    }
}
