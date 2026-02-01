package e2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.core.content.C0669d;
import androidx.core.view.C0838o0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;

@U({"SMAP\nHorizontalDrawableDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorizontalDrawableDecoration.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/custom/HorizontalDrawableDecoration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1313#2:67\n1314#2:69\n1#3:68\n*S KotlinDebug\n*F\n+ 1 HorizontalDrawableDecoration.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/custom/HorizontalDrawableDecoration\n*L\n34#1:67\n34#1:69\n*E\n"})
/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2049a extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f50202a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50203b;

    /* renamed from: c, reason: collision with root package name */
    private final int f50204c;

    /* renamed from: d, reason: collision with root package name */
    private final int f50205d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final Drawable f50206e;

    /* renamed from: f, reason: collision with root package name */
    @d
    private final Rect f50207f;

    public C2049a(@d Context context, @InterfaceC0578v int i4, @InterfaceC0574q int i5, @InterfaceC0574q int i6, @InterfaceC0574q int i7, @InterfaceC0574q int i8) {
        F.p(context, "context");
        this.f50202a = l(context, i5);
        this.f50203b = l(context, i6);
        this.f50204c = l(context, i7);
        this.f50205d = l(context, i8);
        Drawable i9 = C0669d.i(context, i4);
        F.m(i9);
        this.f50206e = i9;
        this.f50207f = new Rect();
    }

    private final int l(Context context, @InterfaceC0574q int i4) {
        if (i4 == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@d Rect outRect, @d View view, @d RecyclerView parent, @d RecyclerView.C state) {
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        super.g(outRect, view, parent, state);
        if (parent.p0(view) == state.d() - 1) {
            outRect.setEmpty();
        } else {
            outRect.set(0, 0, this.f50206e.getIntrinsicWidth() + this.f50204c + this.f50205d, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(@d Canvas canvas, @d RecyclerView parent, @d RecyclerView.C state) {
        int L02;
        View next;
        int p02;
        int L03;
        F.p(canvas, "canvas");
        F.p(parent, "parent");
        F.p(state, "state");
        super.i(canvas, parent, state);
        L02 = kotlin.math.d.L0((((parent.getHeight() + this.f50202a) + this.f50203b) - this.f50206e.getIntrinsicHeight()) / 2.0f);
        int intrinsicHeight = this.f50206e.getIntrinsicHeight() + L02;
        Iterator<View> it = C0838o0.e(parent).iterator();
        while (it.hasNext() && (p02 = parent.p0((next = it.next()))) != -1) {
            if (p02 != state.d() - 1) {
                parent.v0(next, this.f50207f);
                int i4 = this.f50207f.right;
                L03 = kotlin.math.d.L0(next.getTranslationX());
                int i5 = (i4 + L03) - this.f50205d;
                this.f50206e.setBounds(i5 - this.f50206e.getIntrinsicWidth(), L02, i5, intrinsicHeight);
                this.f50206e.draw(canvas);
            }
        }
    }
}
