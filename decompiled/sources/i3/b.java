package i3;

import W2.n;
import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Result;
import kotlin.W;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import l3.d;
import l3.e;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f50752a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f50753b;

    /* loaded from: classes2.dex */
    public static final class a implements ClassFileTransformer {

        /* renamed from: a, reason: collision with root package name */
        @d
        public static final a f50754a = new a();

        private a() {
        }

        @e
        public byte[] a(@d ClassLoader classLoader, @d String str, @e Class<?> cls, @d ProtectionDomain protectionDomain, @e byte[] bArr) {
            if (!F.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f53397a.b(true);
            return kotlin.io.a.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object b4;
        boolean u3;
        Boolean bool;
        Object obj = null;
        try {
            Result.a aVar = Result.f51807F;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            b4 = Result.b(bool);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        if (!Result.i(b4)) {
            obj = b4;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            u3 = bool2.booleanValue();
        } else {
            u3 = DebugProbesImpl.f53371a.u();
        }
        f50753b = u3;
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: i3.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f53371a;
        if (debugProbesImpl.z()) {
            debugProbesImpl.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @n
    public static final void d(@e String str, @d Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f53397a.b(true);
        instrumentation.addTransformer(a.f50754a);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f53371a;
        debugProbesImpl.K(f50753b);
        debugProbesImpl.x();
        f50752a.b();
    }
}
