package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.C;
import com.harman.jbl.partybox.databinding.E2;
import com.harman.jbl.partybox.j;
import com.harman.sdk.command.ReqPlayerInfoCommand;
import com.harman.sdk.utils.PlayerStatus;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/MiniPlayerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "", "audioSource", "", "L", "(I)Ljava/lang/String;", "Lcom/harman/jbl/partybox/ui/musiccontrol/g;", "", "M", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;)Z", "Lcom/harman/jbl/partybox/ui/widget/g;", C.a.f28602a, "Lkotlin/H0;", "setClickListener", "(Lcom/harman/jbl/partybox/ui/widget/g;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "musicControlModel", "setPlayInfo", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;)V", "Lcom/harman/jbl/partybox/databinding/E2;", "p0", "Lcom/harman/jbl/partybox/databinding/E2;", "binding", "q0", "Lcom/harman/jbl/partybox/ui/widget/g;", "clickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMiniPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniPlayerView.kt\ncom/harman/jbl/partybox/ui/widget/MiniPlayerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,175:1\n262#2,2:176\n*S KotlinDebug\n*F\n+ 1 MiniPlayerView.kt\ncom/harman/jbl/partybox/ui/widget/MiniPlayerView\n*L\n137#1:176,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MiniPlayerView extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: p0, reason: collision with root package name */
    @l3.d
    private final E2 f45851p0;

    /* renamed from: q0, reason: collision with root package name */
    @l3.e
    private g f45852q0;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45853a;

        static {
            int[] iArr = new int[PlayerStatus.values().length];
            try {
                iArr[PlayerStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerStatus.PLAYER_STATE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerStatus.PLAYER_STATE_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45853a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        E2 e4 = E2.e(LayoutInflater.from(context), this, true);
        F.o(e4, "inflate(...)");
        this.f45851p0 = e4;
        e4.f38579H.setOnClickListener(this);
    }

    private final String L(int i4) {
        ReqPlayerInfoCommand.a aVar = ReqPlayerInfoCommand.f47674L;
        if (i4 == aVar.b()) {
            String string = getContext().getString(j.m.f41832w);
            F.m(string);
            return string;
        }
        if (i4 != aVar.f() && i4 != aVar.e()) {
            if (i4 == aVar.a()) {
                String string2 = getContext().getString(j.m.f41795o);
                F.m(string2);
                return string2;
            }
            String string3 = getContext().getString(j.m.Va);
            F.m(string3);
            return string3;
        }
        String string4 = getContext().getString(j.m.Ya);
        F.m(string4);
        return string4;
    }

    private final boolean M(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        if (gVar.m() != 0) {
            int i4 = gVar.i();
            ReqPlayerInfoCommand.a aVar = ReqPlayerInfoCommand.f47674L;
            if (i4 == aVar.b() || gVar.i() == aVar.f() || gVar.i() == aVar.e() || gVar.i() == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.e View view) {
        g gVar;
        if (view != null && view.getId() == this.f45851p0.f38579H.getId() && (gVar = this.f45852q0) != null) {
            gVar.a();
        }
    }

    public final void setClickListener(@l3.d g listener) {
        F.p(listener, "listener");
        this.f45852q0 = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlayInfo(@l3.d com.harman.jbl.partybox.ui.musiccontrol.g r6) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.widget.MiniPlayerView.setPlayInfo(com.harman.jbl.partybox.ui.musiccontrol.g):void");
    }

    public /* synthetic */ MiniPlayerView(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }
}
