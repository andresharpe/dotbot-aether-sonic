package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.embedding.l;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.F;

@androidx.window.core.d
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class n implements Consumer<List<? extends SplitInfo>> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final l.a f20772E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final i f20773F;

    public n(@l3.d l.a callback, @l3.d i adapter) {
        F.p(callback, "callback");
        F.p(adapter, "adapter");
        this.f20772E = callback;
        this.f20773F = adapter;
    }

    @Override // java.util.function.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(@l3.d List<? extends SplitInfo> splitInfoList) {
        F.p(splitInfoList, "splitInfoList");
        this.f20772E.a(this.f20773F.i(splitInfoList));
    }
}
