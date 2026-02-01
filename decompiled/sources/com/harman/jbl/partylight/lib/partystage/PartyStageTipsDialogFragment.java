package com.harman.jbl.partylight.lib.partystage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partylight.lib.g;
import java.io.IOException;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import m2.C2369i;

@E(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00016B\u0019\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!¢\u0006\u0004\b3\u00104J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0004R\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStageTipsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "z0", "()V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "v0", "(Landroid/graphics/SurfaceTexture;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "onDestroyView", "Lkotlin/Function0;", "k1", "LX2/a;", "getOnGotIt", "()LX2/a;", "onGotIt", "Lm2/i;", "l1", "Lm2/i;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "m1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Landroid/media/MediaPlayer;", "n1", "Landroid/media/MediaPlayer;", "mMediaPlayer", "<init>", "(LX2/a;)V", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyStageTipsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyStageTipsDialogFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStageTipsDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyStageTipsDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "PartyStageTipsDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private final X2.a<H0> f47429k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private C2369i f47430l1;

    /* renamed from: m1, reason: collision with root package name */
    private BitmapDrawable f47431m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final MediaPlayer f47432n1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements TextureView.SurfaceTextureListener {
        b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@l3.d SurfaceTexture surface, int i4, int i5) {
            F.p(surface, "surface");
            PartyStageTipsDialogFragment.this.v0(surface);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@l3.d SurfaceTexture surface) {
            F.p(surface, "surface");
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@l3.d SurfaceTexture surface, int i4, int i5) {
            F.p(surface, "surface");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@l3.d SurfaceTexture surface) {
            F.p(surface, "surface");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartyStageTipsDialogFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(PartyStageTipsDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
        X2.a<H0> aVar = this$0.f47429k1;
        if (aVar != null) {
            aVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(SurfaceTexture surfaceTexture) {
        String str;
        try {
            this.f47432n1.setSurface(new Surface(surfaceTexture));
            this.f47432n1.setAudioStreamType(3);
            ActivityC0889g activity = getActivity();
            if (activity != null) {
                str = activity.getPackageName();
            } else {
                str = null;
            }
            Uri parse = Uri.parse("android.resource://" + str + "/" + g.k.f47060g);
            this.f47432n1.setLooping(true);
            this.f47432n1.setDataSource(requireContext(), parse);
            this.f47432n1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.harman.jbl.partylight.lib.partystage.s
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    PartyStageTipsDialogFragment.w0(mediaPlayer);
                }
            });
            this.f47432n1.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.harman.jbl.partylight.lib.partystage.t
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
                    boolean x02;
                    x02 = PartyStageTipsDialogFragment.x0(mediaPlayer, i4, i5);
                    return x02;
                }
            });
            this.f47432n1.prepareAsync();
        } catch (IOException e4) {
            Log.e(TAG, e4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x0(MediaPlayer mediaPlayer, int i4, int i5) {
        Log.e(TAG, "onError - what: " + i4 + " | extra: " + i5);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(PartyStageTipsDialogFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        C2369i c2369i = this$0.f47430l1;
        BitmapDrawable bitmapDrawable = null;
        if (c2369i != null) {
            imageView = c2369i.f55138I;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C2369i c2369i2 = this$0.f47430l1;
        if (c2369i2 != null) {
            frameLayout = c2369i2.f55136G;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f47431m1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void z0() {
        C2369i c2369i = this.f47430l1;
        if (c2369i != null) {
            c2369i.f55135F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PartyStageTipsDialogFragment.A0(PartyStageTipsDialogFragment.this, view);
                }
            });
            c2369i.f55139J.setSurfaceTextureListener(new b());
        }
    }

    @l3.e
    public final X2.a<H0> getOnGotIt() {
        return this.f47429k1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, g.m.f47159f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, g.c.f46623a);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        this.f47430l1 = C2369i.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f47431m1 = new BitmapDrawable(resources, com.harman.jbl.cd_biz_comm.utils.a.f37864a.a(getActivity()));
        C2369i c2369i = this.f47430l1;
        if (c2369i == null) {
            return null;
        }
        return c2369i.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f47432n1.stop();
        this.f47432n1.reset();
        this.f47432n1.release();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid"})
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        TextView textView;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        C2369i c2369i = this.f47430l1;
        if (c2369i != null) {
            textView = c2369i.f55137H;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(getString(g.l.f47095T, com.harman.jbl.partybox.ui.effectlab.a.f43467l));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partylight.lib.partystage.u
            @Override // java.lang.Runnable
            public final void run() {
                PartyStageTipsDialogFragment.y0(PartyStageTipsDialogFragment.this);
            }
        }, 200L);
        z0();
    }

    public /* synthetic */ PartyStageTipsDialogFragment(X2.a aVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : aVar);
    }

    public PartyStageTipsDialogFragment(@l3.e X2.a<H0> aVar) {
        this.f47429k1 = aVar;
        this.f47432n1 = new MediaPlayer();
    }
}
