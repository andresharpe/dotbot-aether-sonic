package androidx.window.core;

import X2.l;
import androidx.window.core.SpecificationComputer;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
final class g<T> extends SpecificationComputer<T> {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final T f20738b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f20739c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final SpecificationComputer.VerificationMode f20740d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final f f20741e;

    public g(@l3.d T value, @l3.d String tag, @l3.d SpecificationComputer.VerificationMode verificationMode, @l3.d f logger) {
        F.p(value, "value");
        F.p(tag, "tag");
        F.p(verificationMode, "verificationMode");
        F.p(logger, "logger");
        this.f20738b = value;
        this.f20739c = tag;
        this.f20740d = verificationMode;
        this.f20741e = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @l3.d
    public T a() {
        return this.f20738b;
    }

    @Override // androidx.window.core.SpecificationComputer
    @l3.d
    public SpecificationComputer<T> c(@l3.d String message, @l3.d l<? super T, Boolean> condition) {
        F.p(message, "message");
        F.p(condition, "condition");
        if (condition.C(this.f20738b).booleanValue()) {
            return this;
        }
        return new e(this.f20738b, this.f20739c, message, this.f20741e, this.f20740d);
    }

    @l3.d
    public final f d() {
        return this.f20741e;
    }

    @l3.d
    public final String e() {
        return this.f20739c;
    }

    @l3.d
    public final T f() {
        return this.f20738b;
    }

    @l3.d
    public final SpecificationComputer.VerificationMode g() {
        return this.f20740d;
    }
}
