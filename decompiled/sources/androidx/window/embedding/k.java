package androidx.window.embedding;

import android.util.Log;
import androidx.window.embedding.l;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f20767c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f20768d = true;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final String f20769e = "EmbeddingCompat";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final ActivityEmbeddingComponent f20770a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final i f20771b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final ActivityEmbeddingComponent a() {
            if (c()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                if (activityEmbeddingComponent == null) {
                    return new o();
                }
                return activityEmbeddingComponent;
            }
            return new o();
        }

        @l3.e
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(k.f20769e, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(k.f20769e, "Stub Extension");
                return null;
            }
        }

        public final boolean c() {
            try {
                if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() == null) {
                    return false;
                }
                return true;
            } catch (NoClassDefFoundError unused) {
                Log.d(k.f20769e, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(k.f20769e, "Stub Extension");
                return false;
            }
        }

        private a() {
        }
    }

    public k(@l3.d ActivityEmbeddingComponent embeddingExtension, @l3.d i adapter) {
        F.p(embeddingExtension, "embeddingExtension");
        F.p(adapter, "adapter");
        this.f20770a = embeddingExtension;
        this.f20771b = adapter;
    }

    @Override // androidx.window.embedding.l
    public void a(@l3.d Set<? extends m> rules) {
        F.p(rules, "rules");
        this.f20770a.setEmbeddingRules(this.f20771b.j(rules));
    }

    @Override // androidx.window.embedding.l
    public void b(@l3.d l.a embeddingCallback) {
        F.p(embeddingCallback, "embeddingCallback");
        this.f20770a.setSplitInfoCallback(new n(embeddingCallback, this.f20771b));
    }

    public k() {
        this(f20767c.a(), new i());
    }
}
