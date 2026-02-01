package com.harman.jbl.partybox.utils;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.core.content.C0669d;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0943u;
import androidx.navigation.I;
import androidx.navigation.fragment.c;
import androidx.navigation.fragment.g;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> extends C0964j.f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.p<T, T, Boolean> f46201a;

        /* JADX WARN: Multi-variable type inference failed */
        a(X2.p<? super T, ? super T, Boolean> pVar) {
            this.f46201a = pVar;
        }

        @Override // androidx.recyclerview.widget.C0964j.f
        public boolean a(@l3.d T oldItem, @l3.d T newItem) {
            F.p(oldItem, "oldItem");
            F.p(newItem, "newItem");
            X2.p<T, T, Boolean> pVar = this.f46201a;
            if (pVar != null) {
                return pVar.c0(oldItem, newItem).booleanValue();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C0964j.f
        public boolean b(@l3.d T oldItem, @l3.d T newItem) {
            F.p(oldItem, "oldItem");
            F.p(newItem, "newItem");
            return F.g(oldItem, newItem);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@l3.d View widget) {
            F.p(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@l3.d TextPaint ds) {
            F.p(ds, "ds");
            ds.setUnderlineText(false);
        }
    }

    @l3.d
    public static final <T> C0958d<T> a(@l3.d RecyclerView.Adapter<?> adapter, @l3.e X2.p<? super T, ? super T, Boolean> pVar) {
        F.p(adapter, "<this>");
        return new C0958d<>(adapter, new a(pVar));
    }

    public static /* synthetic */ C0958d b(RecyclerView.Adapter adapter, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = null;
        }
        return a(adapter, pVar);
    }

    public static final void c(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(8);
    }

    public static final void d(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(4);
    }

    public static final void e(@l3.d HmTextViewWithImage hmTextViewWithImage) {
        F.p(hmTextViewWithImage, "<this>");
        SpannableString spannableString = new SpannableString(hmTextViewWithImage.getText());
        spannableString.setSpan(new b(), 5, spannableString.length(), 33);
        hmTextViewWithImage.setMovementMethod(LinkMovementMethod.getInstance());
        hmTextViewWithImage.setText(spannableString);
        hmTextViewWithImage.setHighlightColor(0);
    }

    public static final void f(@l3.d Fragment fragment, @l3.d I directions) {
        C0943u a4;
        androidx.navigation.F I3;
        androidx.navigation.F I4;
        F.p(fragment, "<this>");
        F.p(directions, "directions");
        if (fragment.isAdded() && (a4 = androidx.navigation.fragment.f.a(fragment)) != null) {
            androidx.navigation.F I5 = a4.I();
            if (I5 instanceof g.b) {
                if (F.g(fragment.getClass().getName(), ((g.b) I5).O()) && (I4 = a4.I()) != null && I4.o(directions.i()) != null) {
                    a4.h0(directions);
                    return;
                }
                return;
            }
            if ((I5 instanceof c.b) && F.g(fragment.getClass().getName(), ((c.b) I5).O()) && (I3 = a4.I()) != null && I3.o(directions.i()) != null) {
                a4.h0(directions);
            }
        }
    }

    public static final void g(@l3.d View view, @InterfaceC0571n int i4, @InterfaceC0574q int i5, @InterfaceC0574q int i6, int i7, @InterfaceC0571n int i8) {
        int color;
        int i9;
        F.p(view, "<this>");
        Resources resources = view.getContext().getResources();
        if (view.getBackground() == null && i8 == 0) {
            throw new RuntimeException("Pass backgroundColorResource or use setBackground");
        }
        if (view.getBackground() != null && !(view.getBackground() instanceof ColorDrawable)) {
            throw new RuntimeException(view.getBackground().getClass().getName() + " is not supported, set background as ColorDrawable or pass background as a resource");
        }
        float dimension = resources.getDimension(i5);
        int dimension2 = (int) resources.getDimension(i6);
        int f4 = C0669d.f(view.getContext(), i4);
        if (i8 != 0) {
            color = C0669d.f(view.getContext(), i8);
        } else {
            Drawable background = view.getBackground();
            F.n(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            color = ((ColorDrawable) background).getColor();
        }
        float[] fArr = new float[8];
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = dimension;
        }
        if (i7 != 17) {
            if (i7 != 48) {
                if (i7 != 80) {
                    i9 = dimension2 / 2;
                } else {
                    i9 = dimension2 / 3;
                }
            } else {
                i9 = (dimension2 * (-1)) / 3;
            }
        } else {
            i9 = 0;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                i10 = dimension2 / 3;
            }
        } else {
            i10 = (dimension2 * (-1)) / 3;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(color);
        shapeDrawable.getPaint().setShadowLayer(dimension / 3, i10, i9, f4);
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        if (Build.VERSION.SDK_INT < 28) {
            view.setLayerType(1, shapeDrawable.getPaint());
        }
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable});
        int i12 = dimension2 * 2;
        layerDrawable.setLayerInset(0, dimension2, i12, dimension2, i12);
        view.setBackground(layerDrawable);
    }

    public static /* synthetic */ void h(View view, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            i7 = 80;
        }
        int i10 = i7;
        if ((i9 & 16) != 0) {
            i8 = 0;
        }
        g(view, i4, i5, i6, i10, i8);
    }

    public static final void i(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(0);
    }
}
