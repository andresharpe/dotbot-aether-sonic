package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;

@kotlin.Y(version = "1.1")
/* loaded from: classes2.dex */
public final class L implements r {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Class<?> f52283E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f52284F;

    public L(@l3.d Class<?> jClass, @l3.d String moduleName) {
        F.p(jClass, "jClass");
        F.p(moduleName, "moduleName");
        this.f52283E = jClass;
        this.f52284F = moduleName;
    }

    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof L) && F.g(p(), ((L) obj).p())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return p().hashCode();
    }

    @Override // kotlin.reflect.h
    @l3.d
    public Collection<kotlin.reflect.c<?>> m() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.jvm.internal.r
    @l3.d
    public Class<?> p() {
        return this.f52283E;
    }

    @l3.d
    public String toString() {
        return p().toString() + " (Kotlin reflection is not available)";
    }
}
