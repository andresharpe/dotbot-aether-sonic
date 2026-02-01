package R;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Map<b<?>, Object> f1725a = new LinkedHashMap();

    /* renamed from: R.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017a extends a {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final C0017a f1726b = new C0017a();

        private C0017a() {
        }

        @Override // R.a
        @l3.e
        public <T> T a(@l3.d b<T> key) {
            F.p(key, "key");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
    }

    @l3.e
    public abstract <T> T a(@l3.d b<T> bVar);

    @l3.d
    public final Map<b<?>, Object> b() {
        return this.f1725a;
    }
}
