package b;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1000a<I, O> {

    /* renamed from: b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0190a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f20923a;

        public C0190a(T t3) {
            this.f20923a = t3;
        }

        public final T a() {
            return this.f20923a;
        }
    }

    @d
    public abstract Intent a(@d Context context, I i4);

    @e
    public C0190a<O> b(@d Context context, I i4) {
        F.p(context, "context");
        return null;
    }

    public abstract O c(int i4, @e Intent intent);
}
