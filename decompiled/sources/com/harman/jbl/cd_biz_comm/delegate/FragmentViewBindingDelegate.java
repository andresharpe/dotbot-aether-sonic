package com.harman.jbl.cd_biz_comm.delegate;

import X2.l;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0910l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Q;
import com.harman.jbl.cd_biz_comm.delegate.FragmentViewBindingDelegate;
import i0.InterfaceC2066b;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.properties.e;
import kotlin.reflect.n;
import l3.d;

@U({"SMAP\nFragmentViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBinding.kt\ncom/harman/jbl/cd_biz_comm/delegate/FragmentViewBindingDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentViewBindingDelegate<T extends InterfaceC2066b> implements e<Fragment, T> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final Fragment f37846a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final l<View, T> f37847b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private T f37848c;

    @E(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"com/harman/jbl/cd_biz_comm/delegate/FragmentViewBindingDelegate$1", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/E;", "owner", "Lkotlin/H0;", "c", "(Landroidx/lifecycle/E;)V", "l", "Landroidx/lifecycle/Q;", androidx.exifinterface.media.a.U4, "Landroidx/lifecycle/Q;", "d", "()Landroidx/lifecycle/Q;", "viewLifecycleOwnerLiveDataObserver", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.harman.jbl.cd_biz_comm.delegate.FragmentViewBindingDelegate$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements InterfaceC0910l {

        /* renamed from: E, reason: collision with root package name */
        @d
        private final Q<androidx.lifecycle.E> f37849E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ FragmentViewBindingDelegate<T> f37850F;

        AnonymousClass1(final FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
            this.f37850F = fragmentViewBindingDelegate;
            this.f37849E = new Q() { // from class: com.harman.jbl.cd_biz_comm.delegate.a
                @Override // androidx.lifecycle.Q
                public final void f(Object obj) {
                    FragmentViewBindingDelegate.AnonymousClass1.e(FragmentViewBindingDelegate.this, (androidx.lifecycle.E) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(final FragmentViewBindingDelegate this$0, androidx.lifecycle.E e4) {
            F.p(this$0, "this$0");
            if (e4 == null) {
                return;
            }
            e4.getLifecycle().a(new InterfaceC0910l() { // from class: com.harman.jbl.cd_biz_comm.delegate.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$1
                @Override // androidx.lifecycle.InterfaceC0910l
                public void l(@d androidx.lifecycle.E owner) {
                    F.p(owner, "owner");
                    ((FragmentViewBindingDelegate) this$0).f37848c = null;
                }
            });
        }

        @Override // androidx.lifecycle.InterfaceC0910l
        public void c(@d androidx.lifecycle.E owner) {
            F.p(owner, "owner");
            this.f37850F.d().getViewLifecycleOwnerLiveData().l(this.f37849E);
        }

        @d
        public final Q<androidx.lifecycle.E> d() {
            return this.f37849E;
        }

        @Override // androidx.lifecycle.InterfaceC0910l
        public void l(@d androidx.lifecycle.E owner) {
            F.p(owner, "owner");
            this.f37850F.d().getViewLifecycleOwnerLiveData().p(this.f37849E);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindingDelegate(@d Fragment fragment, @d l<? super View, ? extends T> viewBindingFactory) {
        F.p(fragment, "fragment");
        F.p(viewBindingFactory, "viewBindingFactory");
        this.f37846a = fragment;
        this.f37847b = viewBindingFactory;
        fragment.getLifecycle().a(new AnonymousClass1(this));
    }

    @d
    public final Fragment d() {
        return this.f37846a;
    }

    @Override // kotlin.properties.e
    @d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public T a(@d Fragment thisRef, @d n<?> property) {
        F.p(thisRef, "thisRef");
        F.p(property, "property");
        T t3 = this.f37848c;
        if (t3 != null) {
            return t3;
        }
        if (this.f37846a.getViewLifecycleOwner().getLifecycle().b().e(Lifecycle.State.INITIALIZED)) {
            l<View, T> lVar = this.f37847b;
            View requireView = thisRef.requireView();
            F.o(requireView, "requireView(...)");
            T C3 = lVar.C(requireView);
            this.f37848c = C3;
            return C3;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }

    @d
    public final l<View, T> f() {
        return this.f37847b;
    }
}
