package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C2197u;

@E(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002 !B\u0013\b\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0005J\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0088\u0001\u0018\u0092\u0001\u0004\u0018\u00010\u000f¨\u0006\""}, d2 = {"Lkotlin/Result;", androidx.exifinterface.media.a.f5, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Ljava/lang/Object;", "getValue$annotations", "()V", "value", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isFailure", com.harman.log.b.f47574c, "F", "a", "Failure", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@W2.g
@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class Result<T> implements Serializable {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f51807F = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final Object f51808E;

    @E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Failure implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @W2.f
        @l3.d
        public final Throwable f51809E;

        public Failure(@l3.d Throwable exception) {
            kotlin.jvm.internal.F.p(exception, "exception");
            this.f51809E = exception;
        }

        public boolean equals(@l3.e Object obj) {
            if ((obj instanceof Failure) && kotlin.jvm.internal.F.g(this.f51809E, ((Failure) obj).f51809E)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f51809E.hashCode();
        }

        @l3.d
        public String toString() {
            return "Failure(" + this.f51809E + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.i(name = "failure")
        @kotlin.internal.f
        private final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.F.p(exception, "exception");
            return Result.b(W.a(exception));
        }

        @W2.i(name = "success")
        @kotlin.internal.f
        private final <T> Object b(T t3) {
            return Result.b(t3);
        }

        private a() {
        }
    }

    @U
    private /* synthetic */ Result(Object obj) {
        this.f51808E = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    @l3.d
    @U
    public static <T> Object b(@l3.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && kotlin.jvm.internal.F.g(obj, ((Result) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.F.g(obj, obj2);
    }

    @l3.e
    public static final Throwable e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f51809E;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    @U
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof Failure;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof Failure);
    }

    @l3.d
    public static String k(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f51808E, obj);
    }

    public int hashCode() {
        return h(this.f51808E);
    }

    public final /* synthetic */ Object l() {
        return this.f51808E;
    }

    @l3.d
    public String toString() {
        return k(this.f51808E);
    }
}
