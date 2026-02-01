package androidx.window.core;

import X2.l;
import androidx.window.core.SpecificationComputer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
final class e<T> extends SpecificationComputer<T> {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final T f20731b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f20732c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final String f20733d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final f f20734e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final SpecificationComputer.VerificationMode f20735f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final WindowStrictModeException f20736g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20737a;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            f20737a = iArr;
        }
    }

    public e(@l3.d T value, @l3.d String tag, @l3.d String message, @l3.d f logger, @l3.d SpecificationComputer.VerificationMode verificationMode) {
        List l9;
        F.p(value, "value");
        F.p(tag, "tag");
        F.p(message, "message");
        F.p(logger, "logger");
        F.p(verificationMode, "verificationMode");
        this.f20731b = value;
        this.f20732c = tag;
        this.f20733d = message;
        this.f20734e = logger;
        this.f20735f = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        F.o(stackTrace, "stackTrace");
        l9 = C2101p.l9(stackTrace, 2);
        Object[] array = l9.toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.f20736g = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // androidx.window.core.SpecificationComputer
    @l3.e
    public T a() {
        int i4 = a.f20737a[this.f20735f.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            }
            this.f20734e.a(this.f20732c, b(this.f20731b, this.f20733d));
            return null;
        }
        throw this.f20736g;
    }

    @Override // androidx.window.core.SpecificationComputer
    @l3.d
    public SpecificationComputer<T> c(@l3.d String message, @l3.d l<? super T, Boolean> condition) {
        F.p(message, "message");
        F.p(condition, "condition");
        return this;
    }

    @l3.d
    public final WindowStrictModeException d() {
        return this.f20736g;
    }

    @l3.d
    public final f e() {
        return this.f20734e;
    }

    @l3.d
    public final String f() {
        return this.f20733d;
    }

    @l3.d
    public final String g() {
        return this.f20732c;
    }

    @l3.d
    public final T h() {
        return this.f20731b;
    }

    @l3.d
    public final SpecificationComputer.VerificationMode i() {
        return this.f20735f;
    }
}
