package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

@W(ConstraintLayout.b.a.f9573F)
/* renamed from: androidx.core.os.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0744g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<R> f12736E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0744g(@l3.d kotlin.coroutines.c<? super R> continuation) {
        super(false);
        kotlin.jvm.internal.F.p(continuation, "continuation");
        this.f12736E = continuation;
    }

    public void onError(@l3.d E error) {
        kotlin.jvm.internal.F.p(error, "error");
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<R> cVar = this.f12736E;
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(kotlin.W.a(error)));
        }
    }

    public void onResult(R r4) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<R> cVar = this.f12736E;
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(r4));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l3.d
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
