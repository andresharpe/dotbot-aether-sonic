package kotlin.coroutines;

import X2.p;
import java.io.Serializable;
import kotlin.E;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "e", "()Ljava/lang/Object;", "Lkotlin/coroutines/f$b;", androidx.exifinterface.media.a.U4, "Lkotlin/coroutines/f$c;", "key", "a", "(Lkotlin/coroutines/f$c;)Lkotlin/coroutines/f$b;", "R", "initial", "Lkotlin/Function2;", "operation", "i", "(Ljava/lang/Object;LX2/p;)Ljava/lang/Object;", "context", androidx.exifinterface.media.a.Y4, "(Lkotlin/coroutines/f;)Lkotlin/coroutines/f;", com.harman.log.b.f47574c, "(Lkotlin/coroutines/f$c;)Lkotlin/coroutines/f;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "F", "J", "serialVersionUID", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class EmptyCoroutineContext implements f, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final EmptyCoroutineContext f52041E = new EmptyCoroutineContext();

    /* renamed from: F, reason: collision with root package name */
    private static final long f52042F = 0;

    private EmptyCoroutineContext() {
    }

    private final Object e() {
        return f52041E;
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public f A(@l3.d f context) {
        F.p(context, "context");
        return context;
    }

    @Override // kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> key) {
        F.p(key, "key");
        return null;
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public f b(@l3.d f.c<?> key) {
        F.p(key, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.f
    public <R> R i(R r4, @l3.d p<? super R, ? super f.b, ? extends R> operation) {
        F.p(operation, "operation");
        return r4;
    }

    @l3.d
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
