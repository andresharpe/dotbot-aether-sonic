package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.u;
import com.google.android.material.animation.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32368a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ExtendedFloatingActionButton f32369b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f32370c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f32371d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private h f32372e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private h f32373f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(com.google.android.material.animation.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f32314u0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f32369b.f32314u0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f4) {
            int colorForState = extendedFloatingActionButton.f32314u0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f32369b.f32314u0.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (com.google.android.material.animation.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f4.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f4.floatValue() == 1.0f) {
                extendedFloatingActionButton.W(extendedFloatingActionButton.f32314u0);
            } else {
                extendedFloatingActionButton.W(valueOf);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@N ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f32369b = extendedFloatingActionButton;
        this.f32368a = extendedFloatingActionButton.getContext();
        this.f32371d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @InterfaceC0566i
    public void a() {
        this.f32371d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final h b() {
        h hVar = this.f32373f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f32372e == null) {
            this.f32372e = h.d(this.f32368a, c());
        }
        return (h) u.l(this.f32372e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @P
    public h e() {
        return this.f32373f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void g(@N Animator.AnimatorListener animatorListener) {
        this.f32370c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void h(@N Animator.AnimatorListener animatorListener) {
        this.f32370c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @InterfaceC0566i
    public void i() {
        this.f32371d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void j(@P h hVar) {
        this.f32373f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet k() {
        return o(b());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @N
    public final List<Animator.AnimatorListener> l() {
        return this.f32370c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public AnimatorSet o(@N h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.j("opacity")) {
            arrayList.add(hVar.f("opacity", this.f32369b, View.ALPHA));
        }
        if (hVar.j("scale")) {
            arrayList.add(hVar.f("scale", this.f32369b, View.SCALE_Y));
            arrayList.add(hVar.f("scale", this.f32369b, View.SCALE_X));
        }
        if (hVar.j("width")) {
            arrayList.add(hVar.f("width", this.f32369b, ExtendedFloatingActionButton.f32300z0));
        }
        if (hVar.j("height")) {
            arrayList.add(hVar.f("height", this.f32369b, ExtendedFloatingActionButton.f32293A0));
        }
        if (hVar.j("paddingStart")) {
            arrayList.add(hVar.f("paddingStart", this.f32369b, ExtendedFloatingActionButton.f32294B0));
        }
        if (hVar.j("paddingEnd")) {
            arrayList.add(hVar.f("paddingEnd", this.f32369b, ExtendedFloatingActionButton.f32295C0));
        }
        if (hVar.j("labelOpacity")) {
            arrayList.add(hVar.f("labelOpacity", this.f32369b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @InterfaceC0566i
    public void onAnimationStart(Animator animator) {
        this.f32371d.c(animator);
    }
}
