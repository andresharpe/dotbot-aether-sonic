package com.harman.jbl.partybox.ui.splash;

import X2.l;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.databinding.AbstractC1858d1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.ui.splash.f;
import com.harman.jbl.partybox.utils.q;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0005J!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\tJ/\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\tR#\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/harman/jbl/partybox/ui/splash/SplashVideoFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/SurfaceHolder$Callback;", "Lkotlin/H0;", "o0", "()V", "Landroid/view/SurfaceHolder;", "surfaceHolder", "t0", "(Landroid/view/SurfaceHolder;)V", "r0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "holder", "surfaceCreated", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "Lcom/harman/jbl/partybox/databinding/d1;", "kotlin.jvm.PlatformType", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/d1;", "binding", "Lcom/harman/jbl/partybox/ui/splash/g;", "O0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/splash/g;", "viewModel", "Landroid/media/MediaPlayer;", "P0", "Landroid/media/MediaPlayer;", "mMediaPlayer", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSplashVideoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashVideoFragment.kt\ncom/harman/jbl/partybox/ui/splash/SplashVideoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,111:1\n56#2,10:112\n*S KotlinDebug\n*F\n+ 1 SplashVideoFragment.kt\ncom/harman/jbl/partybox/ui/splash/SplashVideoFragment\n*L\n25#1:112,10\n*E\n"})
/* loaded from: classes2.dex */
public final class SplashVideoFragment extends Fragment implements SurfaceHolder.Callback {

    /* renamed from: Q0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45517Q0 = {N.u(new PropertyReference1Impl(SplashVideoFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentSplashVideoBinding;", 0))};

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45518N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f45519O0;

    /* renamed from: P0, reason: collision with root package name */
    private MediaPlayer f45520P0;

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements l<View, AbstractC1858d1> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f45525N = new a();

        a() {
            super(1, AbstractC1858d1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentSplashVideoBinding;", 0);
        }

        @Override // X2.l
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final AbstractC1858d1 C(@l3.d View p02) {
            F.p(p02, "p0");
            return AbstractC1858d1.o1(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements l<UiPage, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45527a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.WELCOME_SCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f45527a = iArr;
            }
        }

        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            int i4;
            if (uiPage == null) {
                i4 = -1;
            } else {
                i4 = a.f45527a[uiPage.ordinal()];
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    SplashVideoFragment.this.r0();
                }
            } else {
                if (F.g(SplashVideoFragment.this.q0().w().f(), Boolean.TRUE)) {
                    SplashVideoFragment.this.q0().y();
                    T1.a.a("BLE_LOG SplashVideoFragment set show Agreement to true");
                    SplashVideoFragment splashVideoFragment = SplashVideoFragment.this;
                    f.a b4 = f.b().b(1);
                    F.o(b4, "setShowAgreement(...)");
                    q.f(splashVideoFragment, b4);
                    return;
                }
                SplashVideoFragment splashVideoFragment2 = SplashVideoFragment.this;
                f.a b5 = f.b();
                F.o(b5, "actionSplashFragmentToWelcomeFragment(...)");
                q.f(splashVideoFragment2, b5);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f45528a;

        c(l function) {
            F.p(function, "function");
            this.f45528a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45528a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45528a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public SplashVideoFragment() {
        super(j.i.f41431Q0);
        this.f45518N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, a.f45525N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.splash.SplashVideoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f45519O0 = FragmentViewModelLazyKt.c(this, N.d(g.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.splash.SplashVideoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.splash.SplashVideoFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
    }

    private final void o0() {
        q0().A();
    }

    private final AbstractC1858d1 p0() {
        return (AbstractC1858d1) this.f45518N0.a(this, f45517Q0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g q0() {
        return (g) this.f45519O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        startActivity(new Intent(getActivity(), (Class<?>) MainActivityNav.class));
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(SplashVideoFragment this$0) {
        F.p(this$0, "this$0");
        this$0.o0();
    }

    private final void t0(SurfaceHolder surfaceHolder) {
        String str;
        MediaPlayer mediaPlayer = this.f45520P0;
        MediaPlayer mediaPlayer2 = null;
        if (mediaPlayer == null) {
            F.S("mMediaPlayer");
            mediaPlayer = null;
        }
        mediaPlayer.reset();
        try {
            ActivityC0889g activity = getActivity();
            if (activity != null) {
                str = activity.getPackageName();
            } else {
                str = null;
            }
            Uri parse = Uri.parse("android.resource://" + str + "/" + j.l.f41594G);
            MediaPlayer mediaPlayer3 = this.f45520P0;
            if (mediaPlayer3 == null) {
                F.S("mMediaPlayer");
                mediaPlayer3 = null;
            }
            ActivityC0889g activity2 = getActivity();
            F.n(activity2, "null cannot be cast to non-null type android.content.Context");
            mediaPlayer3.setDataSource(activity2, parse);
            try {
                MediaPlayer mediaPlayer4 = this.f45520P0;
                if (mediaPlayer4 == null) {
                    F.S("mMediaPlayer");
                    mediaPlayer4 = null;
                }
                mediaPlayer4.setDisplay(surfaceHolder);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
            MediaPlayer mediaPlayer5 = this.f45520P0;
            if (mediaPlayer5 == null) {
                F.S("mMediaPlayer");
                mediaPlayer5 = null;
            }
            mediaPlayer5.prepareAsync();
            MediaPlayer mediaPlayer6 = this.f45520P0;
            if (mediaPlayer6 == null) {
                F.S("mMediaPlayer");
                mediaPlayer6 = null;
            }
            mediaPlayer6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.harman.jbl.partybox.ui.splash.a
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer7) {
                    SplashVideoFragment.u0(SplashVideoFragment.this, mediaPlayer7);
                }
            });
            MediaPlayer mediaPlayer7 = this.f45520P0;
            if (mediaPlayer7 == null) {
                F.S("mMediaPlayer");
                mediaPlayer7 = null;
            }
            mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.harman.jbl.partybox.ui.splash.b
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer8) {
                    SplashVideoFragment.v0(SplashVideoFragment.this, mediaPlayer8);
                }
            });
            MediaPlayer mediaPlayer8 = this.f45520P0;
            if (mediaPlayer8 == null) {
                F.S("mMediaPlayer");
            } else {
                mediaPlayer2 = mediaPlayer8;
            }
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.harman.jbl.partybox.ui.splash.c
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer9, int i4, int i5) {
                    boolean w02;
                    w02 = SplashVideoFragment.w0(SplashVideoFragment.this, mediaPlayer9, i4, i5);
                    return w02;
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(SplashVideoFragment this$0, MediaPlayer mediaPlayer) {
        F.p(this$0, "this$0");
        MediaPlayer mediaPlayer2 = this$0.f45520P0;
        if (mediaPlayer2 == null) {
            F.S("mMediaPlayer");
            mediaPlayer2 = null;
        }
        mediaPlayer2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(SplashVideoFragment this$0, MediaPlayer mediaPlayer) {
        F.p(this$0, "this$0");
        this$0.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w0(SplashVideoFragment this$0, MediaPlayer mediaPlayer, int i4, int i5) {
        F.p(this$0, "this$0");
        this$0.o0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        boolean u3 = q0().u();
        p0().v1(Boolean.valueOf(u3));
        if (u3) {
            this.f45520P0 = new MediaPlayer();
            p0().f39468k0.getHolder().addCallback(this);
            SurfaceHolder holder = p0().f39468k0.getHolder();
            F.o(holder, "getHolder(...)");
            t0(holder);
            q0().z();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.splash.d
                @Override // java.lang.Runnable
                public final void run() {
                    SplashVideoFragment.s0(SplashVideoFragment.this);
                }
            }, 1000L);
        }
        q0().v().k(getViewLifecycleOwner(), new c(new b()));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@l3.d SurfaceHolder holder, int i4, int i5, int i6) {
        F.p(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@l3.d SurfaceHolder holder) {
        F.p(holder, "holder");
        MediaPlayer mediaPlayer = this.f45520P0;
        if (mediaPlayer == null) {
            F.S("mMediaPlayer");
            mediaPlayer = null;
        }
        mediaPlayer.setDisplay(holder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@l3.d SurfaceHolder holder) {
        F.p(holder, "holder");
    }
}
