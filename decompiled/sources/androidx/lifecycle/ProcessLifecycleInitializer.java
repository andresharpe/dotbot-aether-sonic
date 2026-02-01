package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.W;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

@kotlin.E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/b;", "Landroidx/lifecycle/E;", "Landroid/content/Context;", "context", com.harman.log.b.f47574c, "(Landroid/content/Context;)Landroidx/lifecycle/E;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b<E> {
    @Override // androidx.startup.b
    @l3.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E a(@l3.d Context context) {
        kotlin.jvm.internal.F.p(context, "context");
        androidx.startup.a e4 = androidx.startup.a.e(context);
        kotlin.jvm.internal.F.o(e4, "getInstance(context)");
        if (e4.g(ProcessLifecycleInitializer.class)) {
            C0923z.a(context);
            W.b bVar = W.f15523M;
            bVar.c(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @Override // androidx.startup.b
    @l3.d
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        List<Class<? extends androidx.startup.b<?>>> H3;
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }
}
