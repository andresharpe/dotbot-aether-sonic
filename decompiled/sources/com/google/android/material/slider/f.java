package com.google.android.material.slider;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import com.google.android.material.internal.w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends com.google.android.material.slider.c<f, b, c> {

    /* renamed from: a1, reason: collision with root package name */
    private float f33339a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f33340b1;

    /* loaded from: classes2.dex */
    public interface b extends com.google.android.material.slider.a<f> {
        void b(@N f fVar, float f4, boolean z3);
    }

    /* loaded from: classes2.dex */
    public interface c extends com.google.android.material.slider.b<f> {
        void c(@N f fVar);

        void e(@N f fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends AbsSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        private float f33341E;

        /* renamed from: F, reason: collision with root package name */
        private int f33342F;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeFloat(this.f33341E);
            parcel.writeInt(this.f33342F);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel.readParcelable(d.class.getClassLoader()));
            this.f33341E = parcel.readFloat();
            this.f33342F = parcel.readInt();
        }
    }

    public f(@N Context context) {
        this(context, null);
    }

    private static List<Float> F0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < typedArray.length(); i4++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i4, -1.0f)));
        }
        return arrayList;
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ boolean M() {
        return super.M();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ boolean S() {
        return super.S();
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@N KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    @N
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.c
    public float getMinSeparation() {
        return this.f33339a1;
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.c
    @N
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void h(@N b bVar) {
        super.h(bVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void i(@N c cVar) {
        super.i(cVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void i0(@N b bVar) {
        super.i0(bVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void j0(@N c cVar) {
        super.j0(cVar);
    }

    @Override // com.google.android.material.slider.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i4, @N KeyEvent keyEvent) {
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i4, @N KeyEvent keyEvent) {
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.slider.c, android.view.View
    public void onRestoreInstanceState(@P Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f33339a1 = dVar.f33341E;
        int i4 = dVar.f33342F;
        this.f33340b1 = i4;
        setSeparationUnit(i4);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    @N
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f33341E = this.f33339a1;
        dVar.f33342F = this.f33340b1;
        return dVar;
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@N MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawable(@InterfaceC0578v int i4) {
        super.setCustomThumbDrawable(i4);
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawablesForValues(@N @InterfaceC0578v int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i4) {
        super.setFocusedThumbIndex(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloRadius(@F(from = 0) @r int i4) {
        super.setHaloRadius(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@InterfaceC0574q int i4) {
        super.setHaloRadiusResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloTintList(@N ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i4) {
        super.setLabelBehavior(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setLabelFormatter(@P e eVar) {
        super.setLabelFormatter(eVar);
    }

    public void setMinSeparation(@r float f4) {
        this.f33339a1 = f4;
        this.f33340b1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f4) {
        this.f33339a1 = f4;
        this.f33340b1 = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setStepSize(float f4) {
        super.setStepSize(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbElevation(float f4) {
        super.setThumbElevation(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@InterfaceC0574q int i4) {
        super.setThumbElevationResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbRadius(@F(from = 0) @r int i4) {
        super.setThumbRadius(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@InterfaceC0574q int i4) {
        super.setThumbRadiusResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@P ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@InterfaceC0571n int i4) {
        super.setThumbStrokeColorResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f4) {
        super.setThumbStrokeWidth(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@InterfaceC0574q int i4) {
        super.setThumbStrokeWidthResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbTintList(@N ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@N ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@N ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickTintList(@N ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z3) {
        super.setTickVisible(z3);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@N ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackHeight(@F(from = 0) @r int i4) {
        super.setTrackHeight(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@N ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackTintList(@N ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setValueFrom(float f4) {
        super.setValueFrom(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setValueTo(float f4) {
        super.setValueTo(f4);
    }

    @Override // com.google.android.material.slider.c
    public void setValues(@N Float... fArr) {
        super.setValues(fArr);
    }

    public f(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.ie);
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawable(@N Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawablesForValues(@N Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.c
    public void setValues(@N List<Float> list) {
        super.setValues(list);
    }

    public f(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray j4 = w.j(context, attributeSet, a.o.kq, i4, com.google.android.material.slider.c.f33259V0, new int[0]);
        if (j4.hasValue(a.o.mq)) {
            setValues(F0(j4.getResources().obtainTypedArray(j4.getResourceId(a.o.mq, 0))));
        }
        this.f33339a1 = j4.getDimension(a.o.lq, 0.0f);
        j4.recycle();
    }
}
