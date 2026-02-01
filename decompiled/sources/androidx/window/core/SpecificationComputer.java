package androidx.window.core;

import X2.l;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public abstract class SpecificationComputer<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f20723a = new a(null);

    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ SpecificationComputer b(a aVar, Object obj, String str, VerificationMode verificationMode, f fVar, int i4, Object obj2) {
            if ((i4 & 2) != 0) {
                verificationMode = c.f20729a.a();
            }
            if ((i4 & 4) != 0) {
                fVar = androidx.window.core.a.f20724a;
            }
            return aVar.a(obj, str, verificationMode, fVar);
        }

        @l3.d
        public final <T> SpecificationComputer<T> a(@l3.d T t3, @l3.d String tag, @l3.d VerificationMode verificationMode, @l3.d f logger) {
            F.p(t3, "<this>");
            F.p(tag, "tag");
            F.p(verificationMode, "verificationMode");
            F.p(logger, "logger");
            return new g(t3, tag, verificationMode, logger);
        }

        private a() {
        }
    }

    @l3.e
    public abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final String b(@l3.d Object value, @l3.d String message) {
        F.p(value, "value");
        F.p(message, "message");
        return message + " value: " + value;
    }

    @l3.d
    public abstract SpecificationComputer<T> c(@l3.d String str, @l3.d l<? super T, Boolean> lVar);
}
