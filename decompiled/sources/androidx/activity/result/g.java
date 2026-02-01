package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0623e;
import b.AbstractC1000a;
import kotlin.A;
import kotlin.C;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g<I, O> extends i<H0> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final i<I> f4554a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final AbstractC1000a<I, O> f4555b;

    /* renamed from: c, reason: collision with root package name */
    private final I f4556c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final A f4557d;

    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.a<C0040a> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ g<I, O> f4558F;

        /* renamed from: androidx.activity.result.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0040a extends AbstractC1000a<H0, O> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g<I, O> f4559a;

            C0040a(g<I, O> gVar) {
                this.f4559a = gVar;
            }

            @Override // b.AbstractC1000a
            public O c(int i4, @l3.e Intent intent) {
                return this.f4559a.e().c(i4, intent);
            }

            @Override // b.AbstractC1000a
            @l3.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Intent a(@l3.d Context context, @l3.d H0 input) {
                F.p(context, "context");
                F.p(input, "input");
                return this.f4559a.e().a(context, this.f4559a.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<I, O> gVar) {
            super(0);
            this.f4558F = gVar;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0040a n() {
            return new C0040a(this.f4558F);
        }
    }

    public g(@l3.d i<I> launcher, @l3.d AbstractC1000a<I, O> callerContract, I i4) {
        A a4;
        F.p(launcher, "launcher");
        F.p(callerContract, "callerContract");
        this.f4554a = launcher;
        this.f4555b = callerContract;
        this.f4556c = i4;
        a4 = C.a(new a(this));
        this.f4557d = a4;
    }

    @Override // androidx.activity.result.i
    @l3.d
    public AbstractC1000a<H0, ?> a() {
        return h();
    }

    @Override // androidx.activity.result.i
    public void d() {
        this.f4554a.d();
    }

    @l3.d
    public final AbstractC1000a<I, O> e() {
        return this.f4555b;
    }

    public final I f() {
        return this.f4556c;
    }

    @l3.d
    public final i<I> g() {
        return this.f4554a;
    }

    @l3.d
    public final AbstractC1000a<H0, O> h() {
        return (AbstractC1000a) this.f4557d.getValue();
    }

    @Override // androidx.activity.result.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(@l3.d H0 input, @l3.e C0623e c0623e) {
        F.p(input, "input");
        this.f4554a.c(this.f4556c, c0623e);
    }
}
