package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.f;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* renamed from: kotlinx.coroutines.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2347x0 extends N implements Closeable {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f54761G = new a(null);

    @kotlin.r
    /* renamed from: kotlinx.coroutines.x0$a */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.b<N, AbstractC2347x0> {

        /* renamed from: kotlinx.coroutines.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0508a extends Lambda implements X2.l<f.b, AbstractC2347x0> {

            /* renamed from: F, reason: collision with root package name */
            public static final C0508a f54762F = new C0508a();

            C0508a() {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final AbstractC2347x0 C(@l3.d f.b bVar) {
                if (bVar instanceof AbstractC2347x0) {
                    return (AbstractC2347x0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
            super(N.f52948F, C0508a.f54762F);
        }
    }

    public abstract void close();

    @l3.d
    public abstract Executor m1();
}
