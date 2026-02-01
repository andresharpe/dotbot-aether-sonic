package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.B;
import androidx.window.layout.l;
import androidx.window.layout.q;
import androidx.window.layout.x;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.C2351z0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.V;
import l3.d;
import l3.e;

/* loaded from: classes.dex */
public final class FoldingFeatureObserver {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final x f18388a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final Executor f18389b;

    /* renamed from: c, reason: collision with root package name */
    @e
    private L0 f18390c;

    /* renamed from: d, reason: collision with root package name */
    @e
    private a f18391d;

    /* loaded from: classes.dex */
    public interface a {
        void a(@d q qVar);
    }

    public FoldingFeatureObserver(@d x windowInfoTracker, @d Executor executor) {
        F.p(windowInfoTracker, "windowInfoTracker");
        F.p(executor, "executor");
        this.f18388a = windowInfoTracker;
        this.f18389b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q d(B b4) {
        Object obj;
        Iterator<T> it = b4.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((l) obj) instanceof q) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof q)) {
            return null;
        }
        return (q) obj;
    }

    public final void e(@d Activity activity) {
        L0 f4;
        F.p(activity, "activity");
        L0 l02 = this.f18390c;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        f4 = C2323l.f(V.a(C2351z0.c(this.f18389b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null), 3, null);
        this.f18390c = f4;
    }

    public final void f(@d a onFoldingFeatureChangeListener) {
        F.p(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.f18391d = onFoldingFeatureChangeListener;
    }

    public final void g() {
        L0 l02 = this.f18390c;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
    }
}
